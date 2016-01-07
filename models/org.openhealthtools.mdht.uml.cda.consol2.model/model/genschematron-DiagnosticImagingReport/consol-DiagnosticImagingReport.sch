<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_2_DiagnosticImagingReport_component_2_6_12-error_mdht" see="#p-DiagnosticImagingReport_2_DiagnosticImagingReport_component_2_6_12-error_mdht" name="p-DiagnosticImagingReport_2_DiagnosticImagingReport_component_2_6_12-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(consol::DiagnosticImagingReport::Component))
			Constraint name: DiagnosticImagingReportComponent
		-->
	<assert test="count(cda:component)=1">Error: DiagnosticImagingReport - 2.6.12 component
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_templateId_2_6_1-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_templateId_2_6_1-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_templateId_2_6_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.5')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.5'">Error: DiagnosticImagingReport - 2.6.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8404, CONF:10042 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.5&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_recordTarget_2_6_12-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_recordTarget_2_6_12-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_recordTarget_2_6_12-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: GeneralHeaderConstraintsRecordTarget
		-->
	<assert test="cda:recordTarget">Error: DiagnosticImagingReport - 2.6.12 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:5266)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_code_2_6_3-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_code_2_6_3-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_code_2_6_3-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCodeP
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 2.6.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:14833), which SHALL be selected from ValueSet DIRDocumentTypeCodes 2.16.840.1.113883.11.20.9.32 DYNAMIC (CONF:14834)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '18748-4' or value.code = '18747-6' or value.code = '18755-9' or value.code = '18760-9' or value.code = '18757-5' or value.code = '18758-3' or value.code = '18745-0' or value.code = '11522-0' or value.code = '18746-8' or value.code = '18751-8' or value.code = '11525-3')
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.1' and (@code = '18748-4' or @code = '18747-6' or @code = '18755-9' or @code = '18760-9' or @code = '18757-5' or @code = '18758-3' or @code = '18745-0' or @code = '11522-0' or @code = '18746-8' or @code = '18751-8' or @code = '11525-3')]">Error: DiagnosticImagingReport - 2.6.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:14833), which SHALL be selected from ValueSet DIRDocumentTypeCodes 2.16.840.1.113883.11.20.9.32 DYNAMIC (CONF:14834)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportUseDiagnosticImagingCode_2_6_13-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportUseDiagnosticImagingCode_2_6_13-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportUseDiagnosticImagingCode_2_6_13-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.code = '18748-4'
			Constraint name: DiagnosticImagingReportUseDiagnosticImagingCode
		-->
	<assert test="cda:code and cda:code/@code = '18748-4'">Error: DiagnosticImagingReport - 2.6.13 DiagnosticImagingReportUseDiagnosticImagingCode
		Conformance: This code SHOULD contain zero or one [0..1] @code=&quot;18748-4&quot; Diagnostic Imaging Report (CodeSystem: LOINC2.16.840.1.113883.6.1) (CONF:8409)
		Analysis: This code SHOULD contain zero or one [0..1] @code=&quot;18748-4&quot; Diagnostic Imaging Report (CodeSystem: LOINC2.16.840.1.113883.6.1)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_confidentialityCode_2_6_8-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_confidentialityCode_2_6_8-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_confidentialityCode_2_6_8-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: DiagnosticImagingReport - 2.6.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: DiagnosticImagingReport - 2.6.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_setId_2_6_10-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_setId_2_6_10-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_setId_2_6_10-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: DiagnosticImagingReport - 2.6.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261, R2.1=CONF:1198-5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_languageCode_2_6_9-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_languageCode_2_6_9-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_languageCode_2_6_9-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: DiagnosticImagingReport - 2.6.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: DiagnosticImagingReport - 2.6.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_documentationOf_2_6_9-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_documentationOf_2_6_9-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_documentationOf_2_6_9-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
			Constraint name: DiagnosticImagingReportDocumentationOf
		-->
	<assert test="count(cda:documentationOf)=1">Error: DiagnosticImagingReport - 2.6.9 documentationOf
		Conformance: SHALL contain exactly one [1..1] documentationOf (CONF:8416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_title_2_6_6-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_title_2_6_6-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_title_2_6_6-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: DiagnosticImagingReport - 2.6.6 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authenticator_2_6_19-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authenticator_2_6_19-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authenticator_2_6_19-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: DiagnosticImagingReport - 2.6.19 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informant_2_6_5-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informant_2_6_5-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informant_2_6_5-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->isEmpty()
			Constraint name: DiagnosticImagingReportInformant
		-->
	<assert test="not(cda:informant)">Error: DiagnosticImagingReport - 2.6.5 informant
		Conformance: SHALL contain  [0..0] informant such that it  (CONF:8410)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_supportParticipant_2_6_21-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_supportParticipant_2_6_21-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_supportParticipant_2_6_21-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: DiagnosticImagingReport - 2.6.21 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informationRecipient_2_6_6-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informationRecipient_2_6_6-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informationRecipient_2_6_6-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: DiagnosticImagingReportInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: DiagnosticImagingReport - 2.6.6 informationRecipient
		Conformance: MAY contain  [0..*] informationRecipient such that it  (CONF:8411)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_inFulfillmentOf_2_6_8-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_inFulfillmentOf_2_6_8-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_inFulfillmentOf_2_6_8-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() <= 1
			Constraint name: DiagnosticImagingReportInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &lt;= 1">Error: DiagnosticImagingReport - 2.6.8 inFulfillmentOf
		Conformance: MAY contain zero or one [0..1] inFulfillmentOf
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_author_2_6_14-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_author_2_6_14-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_author_2_6_14-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: DiagnosticImagingReport - 2.6.14 author
		Conformance: SHALL contain at least one [1..*] author (CONF:5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_dataEnterer_2_6_15-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_dataEnterer_2_6_15-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_dataEnterer_2_6_15-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: DiagnosticImagingReport - 2.6.15 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_legalAuthenticator_2_6_18-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_legalAuthenticator_2_6_18-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_legalAuthenticator_2_6_18-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: DiagnosticImagingReport - 2.6.18 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_versionNumber_2_6_11-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_versionNumber_2_6_11-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_versionNumber_2_6_11-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: DiagnosticImagingReport - 2.6.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264, R2.1=CONF:1198-5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_2_DiagnosticImagingReport_componentOf_2_6_11-error_mdht" see="#p-DiagnosticImagingReport_2_DiagnosticImagingReport_componentOf_2_6_11-error_mdht" name="p-DiagnosticImagingReport_2_DiagnosticImagingReport_componentOf_2_6_11-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: DiagnosticImagingReportComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: DiagnosticImagingReport - 2.6.11 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:8434)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_typeId_2_6_3-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_typeId_2_6_3-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_typeId_2_6_3-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: DiagnosticImagingReport - 2.6.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_effectiveTime_2_6_7-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_effectiveTime_2_6_7-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_effectiveTime_2_6_7-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: DiagnosticImagingReport - 2.6.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authorization_2_6_24-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authorization_2_6_24-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authorization_2_6_24-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: DiagnosticImagingReport - 2.6.24 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_relatedDocument_2_6_10-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_relatedDocument_2_6_10-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_relatedDocument_2_6_10-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.relatedDocument->select(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))->size() <= 1
			Constraint name: DiagnosticImagingReportRelatedDocument
		-->
	<assert test="count(cda:relatedDocument) &lt;= 1">Error: DiagnosticImagingReport - 2.6.10 relatedDocument
		Conformance: MAY contain zero or one [0..1] relatedDocument (CONF:8432)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportAllSectionsHaveTitle_2_6_15-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportAllSectionsHaveTitle_2_6_15-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportAllSectionsHaveTitle_2_6_15-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.getAllSections()->reject(section : cda::Section | section.templateId->exists(root = '2.16.840.1.113883.10.20.6.1.1'))->forAll(section : cda::Section | not section.title.oclIsUndefined())
			Constraint name: DiagnosticImagingReportAllSectionsHaveTitle
		-->
	<assert test="not(.//cda:section[not(cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1')][not(cda:title)])">Error: DiagnosticImagingReport - 2.6.15 DiagnosticImagingReportAllSectionsHaveTitle
		Conformance: With the exception of the DICOM Object Catalog (templateId 2.16.840.1.113883.10.20.6.1.1), all sections within the Diagnostic Imaging Report content SHOULD contain a title element (CONF:9409)
		Analysis: With the exception of the DICOM Object Catalog (templateId 2.16.840.1.113883.10.20.6.1.1), all sections within the Diagnostic Imaging Report content SHOULD contain a title element
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_id_2_6_4-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_id_2_6_4-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_id_2_6_4-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.6.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_participant1_2_6_7-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_participant1_2_6_7-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_participant1_2_6_7-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() <= 1
			Constraint name: DiagnosticImagingReportParticipant1
		-->
	<assert test="count(cda:participant) &lt;= 1">Error: DiagnosticImagingReport - 2.6.7 participant1
		Conformance: MAY contain zero or one [0..1] participant (CONF:8414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_custodian_2_6_16-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_custodian_2_6_16-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_custodian_2_6_16-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: GeneralHeaderConstraintsCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: DiagnosticImagingReport - 2.6.16 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:5519)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportSectionsHaveText_2_6_19-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportSectionsHaveText_2_6_19-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportSectionsHaveText_2_6_19-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.getAllSections()->reject(section : cda::Section | section.templateId->exists(root = '2.16.840.1.113883.10.20.6.1.1'))->forAll(section : cda::Section | not section.text.oclIsUndefined())
			Constraint name: DiagnosticImagingReportSectionsHaveText
		-->
	<assert test="not(.//cda:section[not(cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1')][not(cda:text)])">Error: DiagnosticImagingReport - 2.6.19 DiagnosticImagingReportSectionsHaveText
		Conformance: Apart from the DICOM Object Catalog (templateId 2.16.840.1.113883.10.20.6.1.1), all other instances of section SHALL contain at least one text element or one or more component elements (CONF:9413)
		Analysis: Apart from the DICOM Object Catalog (templateId 2.16.840.1.113883.10.20.6.1.1), all other instances of section SHALL contain at least one text element or one or more component elements
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_realmCode_2_6_2-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_realmCode_2_6_2-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_realmCode_2_6_2-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: DiagnosticImagingReport - 2.6.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: DiagnosticImagingReport - 2.6.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Participant -->

<pattern id="p-DiagnosticImagingReport_1A_Participant_associatedEntity_2_6_7_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Participant_associatedEntity_2_6_7_i-error_mdht" name="p-DiagnosticImagingReport_1A_Participant_associatedEntity_2_6_7_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/participant1
			UML root path: /DiagnosticImagingReport/participant1
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(consol::DiagnosticImagingReport::Participant::AssociatedEntity))
			Constraint name: DiagnosticImagingReportParticipantAssociatedEntity
		-->
	<assert test="count(cda:associatedEntity)=1">Error: DiagnosticImagingReport - 2.6.7.i associatedEntity
		Conformance: SHALL contain exactly one [1..1] associatedEntity (CONF:8415)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssociatedEntity_associatedPerson_2_6_7_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_AssociatedEntity_associatedPerson_2_6_7_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_AssociatedEntity_associatedPerson_2_6_7_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/participant1/associatedEntity
			UML root path: /DiagnosticImagingReport/participant1/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">
		<!--
			OCL: self.associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(consol::DiagnosticImagingReport::Participant::AssociatedEntity::Person))
			Constraint name: DiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson
		-->
	<assert test="count(cda:associatedPerson)=1">Error: DiagnosticImagingReport - 2.6.7.i.a associatedPerson
		Conformance: SHALL contain exactly one [1..1] associatedPerson (CONF:8415)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReport_1A_Person_name_2_6_7_i_a_1-error_mdht" see="#p-DiagnosticImagingReport_1A_Person_name_2_6_7_i_a_1-error_mdht" name="p-DiagnosticImagingReport_1A_Person_name_2_6_7_i_a_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/participant1/associatedEntity/associatedPerson
			UML root path: /DiagnosticImagingReport/participant1/associatedEntity/associatedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson">
		<!--
			OCL: self.name->size() = 1
			Constraint name: DiagnosticImagingReportParticipantAssociatedEntityPersonName
		-->
	<assert test="count(cda:name) = 1">Error: DiagnosticImagingReport - 2.6.7.i.a.1 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:9406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-DiagnosticImagingReport_1A_DocumentationOf_serviceEvent3_2_6_9_i-error_mdht" see="#p-DiagnosticImagingReport_1A_DocumentationOf_serviceEvent3_2_6_9_i-error_mdht" name="p-DiagnosticImagingReport_1A_DocumentationOf_serviceEvent3_2_6_9_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf
			UML root path: /DiagnosticImagingReport/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::DiagnosticImagingReport::DocumentationOf::ServiceEvent4))
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent3
		-->
	<assert test="count(cda:serviceEvent)=1">Error: DiagnosticImagingReport - 2.6.9.i serviceEvent3
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:8431)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent4 -->

<pattern id="p-DiagnosticImagingReport_1A_ServiceEvent4_code_2_6_9_i_b-error_mdht" see="#p-DiagnosticImagingReport_1A_ServiceEvent4_code_2_6_9_i_b-error_mdht" name="p-DiagnosticImagingReport_1A_ServiceEvent4_code_2_6_9_i_b-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf/serviceEvent3
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent4Code
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 2.6.9.i.b code
		Conformance: SHALL contain exactly one [1..1] code (CONF:8419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent4 -->

<pattern id="p-DiagnosticImagingReport_1A_ServiceEvent4_physicianReadingStudyPerformer_2_6_9_i_d-error_mdht" see="#p-DiagnosticImagingReport_1A_ServiceEvent4_physicianReadingStudyPerformer_2_6_9_i_d-error_mdht" name="p-DiagnosticImagingReport_1A_ServiceEvent4_physicianReadingStudyPerformer_2_6_9_i_d-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf/serviceEvent3
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer))->size() >= 0
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer
		-->
	<assert test="count(cda:performer[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.1']) &gt;= 0">Error: DiagnosticImagingReport - 2.6.9.i.d physicianReadingStudyPerformer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:8422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent4 -->

<pattern id="p-DiagnosticImagingReport_1A_ServiceEvent4_id_2_6_9_i_c-error_mdht" see="#p-DiagnosticImagingReport_1A_ServiceEvent4_id_2_6_9_i_c-error_mdht" name="p-DiagnosticImagingReport_1A_ServiceEvent4_id_2_6_9_i_c-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf/serviceEvent3
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent4Id
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: DiagnosticImagingReport - 2.6.9.i.c id
		Conformance: SHOULD contain zero or more [0..*] id (CONF:8418)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent4 -->

<pattern id="p-DiagnosticImagingReport_1A_ServiceEvent4_classCode_2_6_9_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_ServiceEvent4_classCode_2_6_9_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_ServiceEvent4_classCode_2_6_9_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf/serviceEvent3
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::ActClassRoot::ACT
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent4ClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'ACT'">Error: DiagnosticImagingReport - 2.6.9.i.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:8430)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianReadingStudyPerformer: 2.16.840.1.113883.10.20.6.2.1 -->

<pattern id="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_templateId_2_6_9_i_d_1-error_mdht" see="#p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_templateId_2_6_9_i_d_1-error_mdht" name="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_templateId_2_6_9_i_d_1-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.1')
			Constraint name: PhysicianReadingStudyPerformerTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.1'">Error: DiagnosticImagingReport - 2.6.9.i.d.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8423 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-DiagnosticImagingReport_2_ComponentOf_encompassingEncounter_2_6_11_i-error_mdht" see="#p-DiagnosticImagingReport_2_ComponentOf_encompassingEncounter_2_6_11_i-error_mdht" name="p-DiagnosticImagingReport_2_ComponentOf_encompassingEncounter_2_6_11_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf
			UML root path: /DiagnosticImagingReport/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::DiagnosticImagingReport::ComponentOf::EncompassingEncounter7))
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: DiagnosticImagingReport - 2.6.11.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:8449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter7 -->

<pattern id="p-DiagnosticImagingReport_2_EncompassingEncounter7_id_2_6_11_i_b-error_mdht" see="#p-DiagnosticImagingReport_2_EncompassingEncounter7_id_2_6_11_i_b-error_mdht" name="p-DiagnosticImagingReport_2_EncompassingEncounter7_id_2_6_11_i_b-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7Id
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.6.11.i.b id
		Conformance: SHALL contain at least one [1..*] id (CONF:8435)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter7 -->

<pattern id="p-DiagnosticImagingReport_2_EncompassingEncounter7_effectiveTime_2_6_11_i_a-error_mdht" see="#p-DiagnosticImagingReport_2_EncompassingEncounter7_effectiveTime_2_6_11_i_a-error_mdht" name="p-DiagnosticImagingReport_2_EncompassingEncounter7_effectiveTime_2_6_11_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: DiagnosticImagingReport - 2.6.11.i.a effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:8437)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter7 -->

<pattern id="p-DiagnosticImagingReport_2_EncompassingEncounter7_responsibleParty_2_6_11_i_d-error_mdht" see="#p-DiagnosticImagingReport_2_EncompassingEncounter7_responsibleParty_2_6_11_i_d-error_mdht" name="p-DiagnosticImagingReport_2_EncompassingEncounter7_responsibleParty_2_6_11_i_d-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: self.responsibleParty->select(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(consol::DiagnosticImagingReport::ComponentOf::EncompassingEncounter7::ResponsibleParty))->size() <= 1
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty
		-->
	<assert test="count(cda:responsibleParty) &lt;= 1">Error: DiagnosticImagingReport - 2.6.11.i.d responsibleParty
		Conformance: MAY contain zero or one [0..1] responsibleParty (CONF:8438)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter7 -->

<pattern id="p-DiagnosticImagingReport_2_EncompassingEncounter7_physicianofRecordParticipant_2_6_11_i_c-error_mdht" see="#p-DiagnosticImagingReport_2_EncompassingEncounter7_physicianofRecordParticipant_2_6_11_i_c-error_mdht" name="p-DiagnosticImagingReport_2_EncompassingEncounter7_physicianofRecordParticipant_2_6_11_i_c-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: self.encounterParticipant->select(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant))->size() <= 1
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant
		-->
	<assert test="count(cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']) &lt;= 1">Error: DiagnosticImagingReport - 2.6.11.i.c physicianofRecordParticipant
		Conformance: SHOULD contain zero or one [0..1] encounterParticipant (CONF:8448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianofRecordParticipant: 2.16.840.1.113883.10.20.6.2.2 -->

<pattern id="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_assignedEntity_2_6_11_i_c_3-error_mdht" see="#p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_assignedEntity_2_6_11_i_c_3-error_mdht" name="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_assignedEntity_2_6_11_i_c_3-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
			Constraint name: PhysicianofRecordParticipantAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.6.11.i.c.3 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:8886)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianofRecordParticipant: 2.16.840.1.113883.10.20.6.2.2 -->

<pattern id="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_templateId_2_6_11_i_c_1-error_mdht" see="#p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_templateId_2_6_11_i_c_1-error_mdht" name="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_templateId_2_6_11_i_c_1-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.2')
			Constraint name: PhysicianofRecordParticipantTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2'">Error: DiagnosticImagingReport - 2.6.11.i.c.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8440 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.2&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_id_2_7_11_i_d_3_ii-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_id_2_7_11_i_d_3_ii-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_id_2_7_11_i_d_3_ii-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: PhysicianofRecordParticipantAssignedEntityId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.7.11.i.d.3.ii id
		Conformance: SHALL contain at least one [1..*] id (CONF:8887, R2.0=CONF:1098-8887)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode_2_6_11_i_c_3_iv-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode_2_6_11_i_c_3_iv-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode_2_6_11_i_c_3_iv-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: self.code.codeSystem = '1.2.840.10008.2.16.4' or self.code.codeSystem = '2.16.840.1.113883.6.101'
			Constraint name: PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode
		-->
	<assert test="cda:code/@codeSystem = '1.2.840.10008.2.16.4' or cda:code/@codeSystem = '2.16.840.1.113883.6.101'">Error: DiagnosticImagingReport - 2.6.11.i.c.3.iv PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode
		Conformance: SHALL contain a valid DICOM Organizational Role from DICOM CID 7452  (Value Set 1.2.840.10008.6.1.516)(@codeSystem is 1.2.840.10008.2.16.4) or an appropriate national health care provider coding system (e.g., NUCC in the U.S., where @codeSystem is 2.16.840.1.113883.6.101) (CONF:8889, R2.0=CONF:1098-8889)
		Analysis: SHALL contain a valid DICOM Organizational Role from DICOM CID 7452  (Value Set 1.2.840.10008.6.1.516)(@codeSystem is 1.2.840.10008.2.16.4) or an appropriate national health care provider coding system (e.g., NUCC in the U.S., where @codeSystem is 2.16.840.1.113883.6.101)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_code_2_7_11_i_d_3_i-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_code_2_7_11_i_d_3_i-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_code_2_7_11_i_d_3_i-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PhysicianofRecordParticipantAssignedEntityCode
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 2.7.11.i.d.3.i code
		Conformance: SHALL contain exactly one [1..1] code (CONF:8888, R2.0=CONF:1098-8888)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_assignedPerson_2_6_11_i_c_3_iii-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_assignedPerson_2_6_11_i_c_3_iii-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_assignedPerson_2_6_11_i_c_3_iii-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->select(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::PhysicianofRecordParticipant::AssignedEntity::AssignedPerson))->size() <= 1
			Constraint name: PhysicianofRecordParticipantAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson) &lt;= 1">Error: DiagnosticImagingReport - 2.6.11.i.c.3.iii assignedPerson
		Conformance: SHOULD contain zero or one [0..1] assignedPerson
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedPerson -->

<pattern id="p-DiagnosticImagingReport_2_AssignedPerson_name_2_6_11_i_c_3_iii_a-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedPerson_name_2_6_11_i_c_3_iii_a-error_mdht" name="p-DiagnosticImagingReport_2_AssignedPerson_name_2_6_11_i_c_3_iii_a-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity/assignedPerson
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() <= 1)
			Constraint name: PhysicianofRecordParticipantAssignedEntityAssignedPersonName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or count(cda:name) &lt;= 1">Error: DiagnosticImagingReport - 2.6.11.i.c.3.iii.a name
		Conformance: SHOULD contain zero or one [0..1] name (CONF:8890)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ResponsibleParty -->

<pattern id="p-DiagnosticImagingReport_2_ResponsibleParty_assignedEntity_2_6_11_i_d_1-error_mdht" see="#p-DiagnosticImagingReport_2_ResponsibleParty_assignedEntity_2_6_11_i_d_1-error_mdht" name="p-DiagnosticImagingReport_2_ResponsibleParty_assignedEntity_2_6_11_i_d_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter/responsibleParty
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/responsibleParty
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::DiagnosticImagingReport::ComponentOf::EncompassingEncounter7::ResponsibleParty::AssignedEntity))
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.6.11.i.d.1 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:9407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization_2_6_11_i_d_1_i-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization_2_6_11_i_d_1_i-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization_2_6_11_i_d_1_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter/responsibleParty/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/responsibleParty/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->size() = 1 or self.representedOrganization->size() = 1
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization
		-->
	<assert test="count(cda:assignedPerson) = 1 or count(cda:representedOrganization) = 1">Error: DiagnosticImagingReport - 2.6.11.i.d.1.i DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization
		Conformance: SHOULD contain zero or one [0..1] assignedPerson OR contain zero or one [0..1] representedOrganization (CONF:8439)
		Analysis: SHOULD contain zero or one [0..1] assignedPerson OR contain zero or one [0..1] representedOrganization
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReport_2_Component_structuredBody_2_6_12_i-error_mdht" see="#p-DiagnosticImagingReport_2_Component_structuredBody_2_6_12_i-error_mdht" name="p-DiagnosticImagingReport_2_Component_structuredBody_2_6_12_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component
			UML root path: /DiagnosticImagingReport/component
		-->
	<rule context="/cda:ClinicalDocument/cda:component">
		<!--
			OCL: self.structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(consol::DiagnosticImagingReport::Component::StructuredBody))
			Constraint name: DiagnosticImagingReportComponentStructuredBody
		-->
	<assert test="count(cda:structuredBody)=1">Error: DiagnosticImagingReport - 2.6.12.i structuredBody
		Conformance: SHALL contain exactly one [1..1] structuredBody
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-DiagnosticImagingReport_2_StructuredBody_dICOMObjectCatalogSection_2_6_12_i_b-error_mdht" see="#p-DiagnosticImagingReport_2_StructuredBody_dICOMObjectCatalogSection_2_6_12_i_b-error_mdht" name="p-DiagnosticImagingReport_2_StructuredBody_dICOMObjectCatalogSection_2_6_12_i_b-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component/structuredBody
			UML root path: /DiagnosticImagingReport/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::DiagnosticImagingReport::Component::StructuredBody::Component))
			Constraint name: DiagnosticImagingReportComponentStructuredBodyDICOMObjectCatalogSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'])=1">Error: DiagnosticImagingReport - 2.6.12.i.b dICOMObjectCatalogSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-DiagnosticImagingReport_2_StructuredBody_findingsSection_2_6_12_i_a-error_mdht" see="#p-DiagnosticImagingReport_2_StructuredBody_findingsSection_2_6_12_i_a-error_mdht" name="p-DiagnosticImagingReport_2_StructuredBody_findingsSection_2_6_12_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component/structuredBody
			UML root path: /DiagnosticImagingReport/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::DiagnosticImagingReport::Component::StructuredBody::Component))
			Constraint name: DiagnosticImagingReportComponentStructuredBodyFindingsSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'])=1">Error: DiagnosticImagingReport - 2.6.12.i.a findingsSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReport_2_Component_findingsSection_2_6_12_i_a_1-error_mdht" see="#p-DiagnosticImagingReport_2_Component_findingsSection_2_6_12_i_a_1-error_mdht" name="p-DiagnosticImagingReport_2_Component_findingsSection_2_6_12_i_a_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component/structuredBody/findingsSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/findingsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))
			Constraint name: DiagnosticImagingReportComponentStructuredBodyComponentFindingsSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'])=1">Error: DiagnosticImagingReport - 2.6.12.i.a.1 findingsSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:9484)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- FindingsSection: 2.16.840.1.113883.10.20.6.1.2 -->

<pattern id="p-DiagnosticImagingReport_2_FindingsSection_templateId_3_32_1-error_mdht" see="#p-DiagnosticImagingReport_2_FindingsSection_templateId_3_32_1-error_mdht" name="p-DiagnosticImagingReport_2_FindingsSection_templateId_3_32_1-error_mdht">
		<!--
			UML path: /FindingsSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/findingsSection/findingsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.2')
			Constraint name: FindingsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'">Error: DiagnosticImagingReport - 3.32.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8531, CONF:10456 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.2&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReport_2_Component_dICOMObjectCatalogSection_2_6_12_i_b_1-error_mdht" see="#p-DiagnosticImagingReport_2_Component_dICOMObjectCatalogSection_2_6_12_i_b_1-error_mdht" name="p-DiagnosticImagingReport_2_Component_dICOMObjectCatalogSection_2_6_12_i_b_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))->size() <= 1
			Constraint name: DiagnosticImagingReportComponentStructuredBodyComponentDICOMObjectCatalogSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']) &lt;= 1">Error: DiagnosticImagingReport - 2.6.12.i.b.1 dICOMObjectCatalogSection
		Conformance: SHOULD contain zero or one [0..1] section (CONF:15141)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReport_3A_DICOMObjectCatalogSection_entry_3_21_3-error_mdht" see="#p-DiagnosticImagingReport_3A_DICOMObjectCatalogSection_entry_3_21_3-error_mdht" name="p-DiagnosticImagingReport_3A_DICOMObjectCatalogSection_entry_3_21_3-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::DICOMObjectCatalogSection::StudyActEntry))
			Constraint name: DICOMObjectCatalogSectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry[cda:act/cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6'])=1">Error: DiagnosticImagingReport - 3.21.3 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_code_3_21_2-error_mdht" see="#p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_code_3_21_2-error_mdht" name="p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_code_3_21_2-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '121181' and value.codeSystem = '1.2.840.10008.2.16.4'
			Constraint name: DICOMObjectCatalogSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '121181' and @codeSystem = '1.2.840.10008.2.16.4']">Error: DiagnosticImagingReport - 3.21.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15456)/@code=&quot;121181&quot; Dicom Object Catalog (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:15457)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: DICOMObjectCatalogSectionCodeP
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 3.21.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15456)/@code=&quot;121181&quot; Dicom Object Catalog (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:15457)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_templateId_3_21_1-error_mdht" see="#p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_templateId_3_21_1-error_mdht" name="p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_templateId_3_21_1-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: DiagnosticImagingReport - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: DiagnosticImagingReport - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyActEntry -->

<pattern id="p-DiagnosticImagingReport_3A_StudyActEntry_studyAct_3_21_3_i-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyActEntry_studyAct_3_21_3_i-error_mdht" name="p-DiagnosticImagingReport_3A_StudyActEntry_studyAct_3_21_3_i-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection/entry
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry">
		<!--
			OCL: self.act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::StudyAct))
			Constraint name: DICOMObjectCatalogSectionStudyActEntryStudyAct
		-->
	<assert test="cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Error: DiagnosticImagingReport - 3.21.3.i studyAct
		Conformance: SHALL contain at least one [1..*] act (CONF:8530, CONF:15458)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_code_4_146_5-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_code_4_146_5-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_code_4_146_5-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: true
			Constraint name: StudyActCodeP
		-->
	<assert test="true()">Error: DiagnosticImagingReport - 4.146.5 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113014&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9214)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '113014' and value.codeSystem = '1.2.840.10008.2.16.4'
			Constraint name: StudyActCode
		-->
	<assert test="cda:code and cda:code[@code = '113014' and @codeSystem = '1.2.840.10008.2.16.4']">Error: DiagnosticImagingReport - 4.146.5 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113014&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9214)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_entryRelationship_4_146_8-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_entryRelationship_4_146_8-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_entryRelationship_4_146_8-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::StudyAct::SeriesActEntryRelationship))
			Constraint name: StudyActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship[cda:act/cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'])=1">Error: DiagnosticImagingReport - 4.146.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_effectiveTime_4_146_6-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_effectiveTime_4_146_6-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_effectiveTime_4_146_6-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: StudyActEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: DiagnosticImagingReport - 4.146.6 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9216)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_text_4_146_7-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_text_4_146_7-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_text_4_146_7-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)
			Constraint name: StudyActTextReference
		-->
	<assert test="not(cda:text) or not(cda:text[not(count(cda:reference) = 1)])">Error: DiagnosticImagingReport - 4.146.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9215)
		Analysis: text, if present, SHOULD contain zero or one [0..1] reference
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: StudyActText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: DiagnosticImagingReport - 4.146.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9215)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_moodCode_4_146_3-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_moodCode_4_146_3-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_moodCode_4_146_3-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: StudyActMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: DiagnosticImagingReport - 4.146.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:9208)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_StudyActIdsHaveRoot_4_146_9-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_StudyActIdsHaveRoot_4_146_9-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_StudyActIdsHaveRoot_4_146_9-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.id->forAll( not root.oclIsUndefined() )
			Constraint name: StudyActIdsHaveRoot
		-->
	<assert test="not(cda:id[not(@root)])">Error: DiagnosticImagingReport - 4.146.9 StudyActIdsHaveRoot
		Conformance: ids SHALL contain exactly one [1..1] @root (CONF:9213)
		Analysis: ids SHALL contain exactly one [1..1] @root
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_classCode_4_146_2-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_classCode_4_146_2-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_classCode_4_146_2-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: StudyActClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: DiagnosticImagingReport - 4.146.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9207)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_StudyActNoIdExtension_4_146_10-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_StudyActNoIdExtension_4_146_10-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_StudyActNoIdExtension_4_146_10-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.id->forAll(  extension.oclIsUndefined() )
			Constraint name: StudyActNoIdExtension
		-->
	<assert test="not(cda:id[@extension])">Error: DiagnosticImagingReport - 4.146.10 StudyActNoIdExtension
		Conformance: Such ids SHALL NOT contain [0..0] @extension (CONF:9211)
		Analysis: Such ids SHALL NOT contain [0..0] @extension
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_id_4_146_4-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_id_4_146_4-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_id_4_146_4-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: StudyActId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 4.146.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9210)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_templateId_4_146_1-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_templateId_4_146_1-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_templateId_4_146_1-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.6')
			Constraint name: StudyActTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6'">Error: DiagnosticImagingReport - 4.146.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:10533 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.6&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesActEntryRelationship -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesActEntryRelationship_seriesAct_4_146_8_i-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesActEntryRelationship_seriesAct_4_146_8_i-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesActEntryRelationship_seriesAct_4_146_8_i-error_mdht">
		<!--
			UML path: /StudyAct/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship">
		<!--
			OCL: self.act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SeriesAct))
			Constraint name: StudyActSeriesActEntryRelationshipSeriesAct
		-->
	<assert test="count(cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'])=1">Error: DiagnosticImagingReport - 4.146.8.i seriesAct
		Conformance: SHALL contain exactly one [1..1] act (CONF:9219, CONF:9220, CONF:15937)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_SeriesActIdHasRoot_4_138_9-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_SeriesActIdHasRoot_4_138_9-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_SeriesActIdHasRoot_4_138_9-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.id->forAll( not root.oclIsUndefined() )
			Constraint name: SeriesActIdHasRoot
		-->
	<assert test="not(cda:id[not(@root)])">Error: DiagnosticImagingReport - 4.138.9 SeriesActIdHasRoot
		Conformance: ids SHALL contain exactly one [1..1] @root (CONF:9225)
		Analysis: ids SHALL contain exactly one [1..1] @root
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_moodCode_4_138_3-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_moodCode_4_138_3-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_moodCode_4_138_3-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: SeriesActMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: DiagnosticImagingReport - 4.138.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:9223)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_classCode_4_138_2-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_classCode_4_138_2-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_classCode_4_138_2-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: SeriesActClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: DiagnosticImagingReport - 4.138.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9222)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_templateId_4_138_1-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_templateId_4_138_1-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_templateId_4_138_1-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.63')
			Constraint name: SeriesActTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'">Error: DiagnosticImagingReport - 4.138.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:10918, CONF:10919 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.63&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_text_4_138_7-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_text_4_138_7-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_text_4_138_7-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: SeriesActText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: DiagnosticImagingReport - 4.138.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9233)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_effectiveTime_4_138_5-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_effectiveTime_4_138_5-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_effectiveTime_4_138_5-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: SeriesActEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: DiagnosticImagingReport - 4.138.5 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9235)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_id_4_138_6-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_id_4_138_6-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_id_4_138_6-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: SeriesActId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 4.138.6 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9224)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_entryRelationship_4_138_8-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_entryRelationship_4_138_8-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_entryRelationship_4_138_8-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SeriesAct::SOPInstanceObservationEntryRelationship))
			Constraint name: SeriesActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship[cda:observation/cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8'])=1">Error: DiagnosticImagingReport - 4.138.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_code_4_138_4-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_code_4_138_4-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_code_4_138_4-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: true
			Constraint name: SeriesActCodeP
		-->
	<assert test="true()">Error: DiagnosticImagingReport - 4.138.4 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113015&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9228)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '113015' and value.codeSystem = '1.2.840.10008.2.16.4'
			Constraint name: SeriesActCode
		-->
	<assert test="cda:code and cda:code[@code = '113015' and @codeSystem = '1.2.840.10008.2.16.4']">Error: DiagnosticImagingReport - 4.138.4 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113015&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9228)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservationEntryRelationship -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_138_8_i-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_138_8_i-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_138_8_i-error_mdht">
		<!--
			UML path: /SeriesAct/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship">
		<!--
			OCL: self.observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation))
			Constraint name: SeriesActSOPInstanceObservationEntryRelationshipSOPInstanceObservation
		-->
	<assert test="cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Error: DiagnosticImagingReport - 4.138.8.i sOPInstanceObservation
		Conformance: SHALL contain at least one [1..*] observation (CONF:9237, CONF:9238, CONF:15927)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_145_12-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_145_12-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_145_12-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.low.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeNoLow
		-->
	<assert test="not(cda:effectiveTime) or not(cda:effectiveTime/cda:low)">Error: DiagnosticImagingReport - 4.145.12 SOPInstanceObservationEffectiveTimeNoLow
		Conformance: The effectiveTime, if present, SHALL NOT contain [0..0] low (CONF:9252)
		Analysis: The effectiveTime, if present, SHALL NOT contain [0..0] low
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_text_4_145_6-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_text_4_145_6-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_text_4_145_6-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: SOPInstanceObservationText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: DiagnosticImagingReport - 4.145.6 text
		Conformance: SHOULD contain zero or one [0..1] text (CONF:9246)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_8-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_8-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_8-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::SOPInstanceObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: DiagnosticImagingReport - 4.145.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_classCode_4_145_2-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_classCode_4_145_2-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_classCode_4_145_2-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::DGIMG
			Constraint name: SOPInstanceObservationClassCode
		-->
	<assert test="@classCode = 'DGIMG'">Error: DiagnosticImagingReport - 4.145.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;DGIMG&quot;  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9240)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_effectiveTime_4_145_4-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_effectiveTime_4_145_4-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_effectiveTime_4_145_4-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: SOPInstanceObservationEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: DiagnosticImagingReport - 4.145.4 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9250)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_moodCode_4_145_3-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_moodCode_4_145_3-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_moodCode_4_145_3-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: SOPInstanceObservationMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: DiagnosticImagingReport - 4.145.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_145_13-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_145_13-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_145_13-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.high.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeNoHigh
		-->
	<assert test="not(cda:effectiveTime) or not(cda:effectiveTime/cda:high)">Error: DiagnosticImagingReport - 4.145.13 SOPInstanceObservationEffectiveTimeNoHigh
		Conformance: The effectiveTime, if present, SHALL NOT contain [0..0] high (CONF:9253)
		Analysis: The effectiveTime, if present, SHALL NOT contain [0..0] high
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_id_4_145_5-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_id_4_145_5-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_id_4_145_5-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: SOPInstanceObservationId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 4.145.5 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9242)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_templateId_4_145_1-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_templateId_4_145_1-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_templateId_4_145_1-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.8')
			Constraint name: SOPInstanceObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8'">Error: DiagnosticImagingReport - 4.145.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.8&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_9-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_9-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_9-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::PurposeofReferenceObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: DiagnosticImagingReport - 4.145.9 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_145_11-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_145_11-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_145_11-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies not self.effectiveTime.value.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeHasValue
		-->
	<assert test="not(cda:effectiveTime) or cda:effectiveTime/@value">Error: DiagnosticImagingReport - 4.145.11 SOPInstanceObservationEffectiveTimeHasValue
		Conformance: The effectiveTime, if present, SHALL contain exactly one [1..1] @value (CONF:9251)
		Analysis: The effectiveTime, if present, SHALL contain exactly one [1..1] @value
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_10-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_10-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_10-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::ReferencedFramesObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: DiagnosticImagingReport - 4.145.10 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_code_4_145_7-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_code_4_145_7-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_code_4_145_7-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: SOPInstanceObservationCodeP
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 4.145.7 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:9244), which SHALL be selected from (CodeSystem: 1.2.840.10008.2.6.1 DCMUID)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '1.2.840.10008.2.6.1'
			Constraint name: SOPInstanceObservationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '1.2.840.10008.2.6.1']">Error: DiagnosticImagingReport - 4.145.7 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:9244), which SHALL be selected from (CodeSystem: 1.2.840.10008.2.6.1 DCMUID)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservationEntryRelationship -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_145_8_i-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_145_8_i-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_145_8_i-error_mdht">
		<!--
			UML path: /SOPInstanceObservation/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']/cda:entryRelationship">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation))->size() >= 0
			Constraint name: SOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']) &gt;= 0">Error: DiagnosticImagingReport - 4.145.8.i sOPInstanceObservation
		Conformance: MAY contain zero or more [0..*] observation (CONF:9254, CONF:9255, CONF:9256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-DiagnosticImagingReport_1A_Author_assignedAuthor_2_6_14_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_Author_assignedAuthor_2_6_14_ii-error_mdht" name="p-DiagnosticImagingReport_1A_Author_assignedAuthor_2_6_14_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author
			UML root path: /GeneralHeaderConstraints/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::GeneralHeaderConstraints::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: DiagnosticImagingReport - 2.6.14.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedAuthor_code_2_6_14_ii_b-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedAuthor_code_2_6_14_ii_b-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedAuthor_code_2_6_14_ii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.6.14.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:16787), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16788)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: DiagnosticImagingReport - 2.6.14.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:16787), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16788)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: DiagnosticImagingReport - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: DiagnosticImagingReport - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: DiagnosticImagingReport - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: DiagnosticImagingReport - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: DiagnosticImagingReport - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: DiagnosticImagingReport - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-DiagnosticImagingReport_1A_DataEnterer_assignedEntity_2_6_15_i-error_mdht" see="#p-DiagnosticImagingReport_1A_DataEnterer_assignedEntity_2_6_15_i-error_mdht" name="p-DiagnosticImagingReport_1A_DataEnterer_assignedEntity_2_6_15_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer
			UML root path: /GeneralHeaderConstraints/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.6.15.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_6_15_i_b-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_code_2_6_15_i_b-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_6_15_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.6.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: DiagnosticImagingReport - 2.6.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-DiagnosticImagingReport_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_6_21_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_6_21_ii-error_mdht" name="p-DiagnosticImagingReport_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_6_21_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/supportParticipant
			UML root path: /GeneralHeaderConstraints/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: DiagnosticImagingReport - 2.6.21.ii GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		Conformance: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity. (CONF:10006)
		Analysis: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity.
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-DiagnosticImagingReport_1A_RecordTarget_patientRole_2_6_12_i-error_mdht" see="#p-DiagnosticImagingReport_1A_RecordTarget_patientRole_2_6_12_i-error_mdht" name="p-DiagnosticImagingReport_1A_RecordTarget_patientRole_2_6_12_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget
			UML root path: /GeneralHeaderConstraints/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: DiagnosticImagingReport - 2.6.12.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReport_1A_PatientRole_patient_2_6_12_i_d-error_mdht" see="#p-DiagnosticImagingReport_1A_PatientRole_patient_2_6_12_i_d-error_mdht" name="p-DiagnosticImagingReport_1A_PatientRole_patient_2_6_12_i_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: DiagnosticImagingReport - 2.6.12.i.d patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:1198-5283)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_ethnicGroupCode_2_6_12_i_d_8-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_ethnicGroupCode_2_6_12_i_d_8-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_ethnicGroupCode_2_6_12_i_d_8-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		-->
	<assert test="not(cda:ethnicGroupCode and not(cda:ethnicGroupCode/@nullFlavor)) or cda:ethnicGroupCode">Error: DiagnosticImagingReport - 2.6.12.i.d.8 ethnicGroupCode
		Conformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined() and self.ethnicGroupCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.ethnicGroupCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode
		-->
	<assert test="not(cda:ethnicGroupCode and not(cda:ethnicGroupCode/@nullFlavor)) or cda:ethnicGroupCode and cda:ethnicGroupCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '2135-2' or @code = '2186-5')]">Error: DiagnosticImagingReport - 2.6.12.i.d.8 ethnicGroupCode
		Conformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_raceCode_2_6_12_i_d_6-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_raceCode_2_6_12_i_d_6-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_raceCode_2_6_12_i_d_6-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		-->
	<assert test="not(cda:raceCode and not(cda:raceCode/@nullFlavor)) or cda:raceCode">Error: DiagnosticImagingReport - 2.6.12.i.d.6 raceCode
		Conformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined() and self.raceCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode
		-->
	<assert test="not(cda:raceCode and not(cda:raceCode/@nullFlavor)) or cda:raceCode and cda:raceCode[@codeSystem = '2.16.840.1.113883.6.238' and @code]">Error: DiagnosticImagingReport - 2.6.12.i.d.6 raceCode
		Conformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_birthplace_2_6_12_i_d_10-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_birthplace_2_6_12_i_d_10-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_birthplace_2_6_12_i_d_10-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		-->
	<assert test="count(cda:birthplace) &lt;= 1">Error: DiagnosticImagingReport - 2.6.12.i.d.10 birthplace
		Conformance: MAY contain zero or one [0..1] birthplace (CONF:5395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_guardian_2_6_12_i_d_9-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_guardian_2_6_12_i_d_9-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_guardian_2_6_12_i_d_9-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: DiagnosticImagingReport - 2.6.12.i.d.9 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:5325)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_birthTime_2_6_12_i_d_3-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_birthTime_2_6_12_i_d_3-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_birthTime_2_6_12_i_d_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.birthTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		-->
	<assert test="cda:birthTime">Error: DiagnosticImagingReport - 2.6.12.i.d.3 birthTime
		Conformance: SHALL contain exactly one [1..1] birthTime (CONF:5298)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_6_12_i_d_12-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_6_12_i_d_12-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_6_12_i_d_12-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: sDTCRaceCode->notEmpty() implies not raceCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode) or cda:raceCode">Error: DiagnosticImagingReport - 2.6.12.i.d.12 GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		Conformance: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode (CONF:31347, R2.1=CONF:1198-31347)
		Analysis: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_languageCommunication_2_6_12_i_d_11-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_languageCommunication_2_6_12_i_d_11-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_languageCommunication_2_6_12_i_d_11-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: DiagnosticImagingReport - 2.6.12.i.d.11 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:5406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameGiven
		-->
	<assert test="@nullFlavor or cda:given">Error: DiagnosticImagingReport - 2.19.5.ii.b.1.iii given
		Conformance: SHALL contain at least one [1..*] given (CONF:7157, R2.1=CONF:81-7157)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameSuffix
		-->
	<assert test="@nullFlavor or not(cda:suffix and cda:suffix[not(@nullFlavor)]) or count(cda:suffix) &lt;= 1">Error: DiagnosticImagingReport - 2.19.5.ii.b.1.v suffix
		Conformance: MAY contain zero or one [0..1] suffix (CONF:7161, R2.1=CONF:81-7161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNamePrefix
		-->
	<assert test="@nullFlavor or not(cda:prefix and cda:prefix[not(@nullFlavor)]) or cda:prefix">Error: DiagnosticImagingReport - 2.19.5.ii.b.1.iv prefix
		Conformance: MAY contain zero or more [0..*] prefix (CONF:7155, R2.1=CONF:81-7155)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL: getText(true)=''
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		-->
	<assert test="string(@id=true()// text()) = ''">Error: DiagnosticImagingReport - 2.10 USRealmHeader
		Conformance: 
		Analysis: US Realm Patient Name SHALL NOT have mixed content except for white space
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameFamily
		-->
	<assert test="@nullFlavor or count(cda:family) = 1">Error: DiagnosticImagingReport - 2.19.5.ii.b.1.ii family
		Conformance: SHALL contain exactly one [1..1] family (CONF:7159, R2.1=CONF:81-7159)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'A' or . = 'ABC' or . = 'ASGN' or . = 'C' or . = 'I' or . = 'IDE' or . = 'L' or . = 'P' or . = 'PHON' or . = 'R' or . = 'SNDX' or . = 'SRCH' or . = 'SYL')])">Error: DiagnosticImagingReport - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TS -->

<pattern id="p-DiagnosticImagingReport_1A_TS_value_2_6_12_i_d_3_i-error_mdht" see="#p-DiagnosticImagingReport_1A_TS_value_2_6_12_i_d_3_i-error_mdht" name="p-DiagnosticImagingReport_1A_TS_value_2_6_12_i_d_3_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.value.oclIsUndefined() ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		-->
	<assert test="@nullFlavor or @value">Error: DiagnosticImagingReport - 2.6.12.i.d.3.i value
		Conformance: SHALL contain exactly one [1..1] value (CONF:5299, CONF:5300)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReport_1A_Guardian_telecom_2_6_12_i_d_9_iii-error_mdht" see="#p-DiagnosticImagingReport_1A_Guardian_telecom_2_6_12_i_d_9_iii-error_mdht" name="p-DiagnosticImagingReport_1A_Guardian_telecom_2_6_12_i_d_9_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: DiagnosticImagingReport - 2.6.12.i.d.9.iii telecom
		Conformance: MAY contain zero or more [0..*] telecom
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReport_1A_Guardian_code_2_6_12_i_d_9_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Guardian_code_2_6_12_i_d_9_i-error_mdht" name="p-DiagnosticImagingReport_1A_Guardian_code_2_6_12_i_d_9_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.6.12.i.d.9.i code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:5326)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReport_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_6_12_i_d_9_v-error_mdht" see="#p-DiagnosticImagingReport_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_6_12_i_d_9_v-error_mdht" name="p-DiagnosticImagingReport_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_6_12_i_d_9_v-error_mdht">
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
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code[@codeSystem = '2.16.840.1.113883.5.111' and (@code = 'ADOPT' or @code = 'AUNT' or @code = 'CHILD' or @code = 'CHLDINLAW' or @code = 'COUSN' or @code = 'DOMPART' or @code = 'FAMMEMB' or @code = 'CHLDFOST' or @code = 'GRNDCHILD' or @code = 'GPARNT' or @code = 'GRPRN' or @code = 'GGRPRN' or @code = 'HSIB' or @code = 'MAUNT' or @code = 'MCOUSN' or @code = 'MGRPRN' or @code = 'MGGRPRN' or @code = 'MUNCLE' or @code = 'NCHILD' or @code = 'NPRN' or @code = 'NSIB' or @code = 'NBOR' or @code = 'NIENEPH' or @code = 'PRN' or @code = 'PRNINLAW' or @code = 'PAUNT' or @code = 'PCOUSN' or @code = 'PGRPRN' or @code = 'PGGRPRN' or @code = 'PUNCLE' or @code = 'ROOM' or @code = 'SIB' or @code = 'SIBINLAW' or @code = 'SIGOTHR' or @code = 'SPS' or @code = 'STEP' or @code = 'STPPRN' or @code = 'STPSIB' or @code = 'UNCLE' or @code = 'FRND' or @code = 'RESPRSN' or @code = 'EXCEST' or @code = 'GUADLTM' or @code = 'GUARD' or @code = 'POWATT' or @code = 'DPOWATT' or @code = 'HPOWATT' or @code = 'SPOWATT')]">Error: DiagnosticImagingReport - 2.6.12.i.d.9.v GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty
		Conformance: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC (CONF:5326)
		Analysis: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.6.12.i.d.9.iii.a use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7993, R2.1=CONF:1198-7993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Birthplace -->

<pattern id="p-DiagnosticImagingReport_1A_Birthplace_place_2_6_12_i_d_10_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Birthplace_place_2_6_12_i_d_10_i-error_mdht" name="p-DiagnosticImagingReport_1A_Birthplace_place_2_6_12_i_d_10_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">
		<!--
			OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace::Place))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
		-->
	<assert test="count(cda:place)=1">Error: DiagnosticImagingReport - 2.6.12.i.d.10.i place
		Conformance: SHALL contain exactly one [1..1] place (CONF:5396)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Place -->

<pattern id="p-DiagnosticImagingReport_1A_Place_GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState_2_6_12_i_d_10_i_b-error_mdht" see="#p-DiagnosticImagingReport_1A_Place_GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState_2_6_12_i_d_10_i_b-error_mdht" name="p-DiagnosticImagingReport_1A_Place_GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState_2_6_12_i_d_10_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">
		<!--
			OCL: (addr.country->exists(curCountry | not curCountry.oclIsUndefined() and curCountry.getText() = 'US')) implies (addr.state->size() = 1) and ((addr.state->exists(curState | (curState.getText() = 'AL' or curState.getText() = 'AK' or curState.getText() = 'AS' or curState.getText() = 'AZ' or curState.getText() = 'AR' or curState.getText() = 'CA' or curState.getText() = 'CO' or curState.getText() = 'CT' or curState.getText() = 'DE' or curState.getText() = 'DC' or curState.getText() = 'FL' or curState.getText() = 'FM' or curState.getText() = 'GA' or curState.getText() = 'GU' or curState.getText() = 'HI' or curState.getText() = 'ID' or curState.getText() = 'IL' or curState.getText() = 'IN' or curState.getText() = 'IA' or curState.getText() = 'KS' or curState.getText() = 'KY' or curState.getText() = 'LA' or curState.getText() = 'ME' or curState.getText() = 'MH' or curState.getText() = 'MD' or curState.getText() = 'MA' or curState.getText() = 'MI' or curState.getText() = 'MN' or curState.getText() = 'MS' or curState.getText() = 'MO' or curState.getText() = 'MT' or curState.getText() = 'NE' or curState.getText() = 'NV' or curState.getText() = 'NH' or curState.getText() = 'NJ' or curState.getText() = 'NM' or curState.getText() = 'NY' or curState.getText() = 'NC' or curState.getText() = 'ND' or curState.getText() = 'MP' or curState.getText() = 'OH' or curState.getText() = 'OK' or curState.getText() = 'OR' or curState.getText() = 'PW' or curState.getText() = 'PA' or curState.getText() = 'PR' or curState.getText() = 'RI' or curState.getText() = 'SC' or curState.getText() = 'SD' or curState.getText() = 'TN' or curState.getText() = 'TX' or curState.getText() = 'UM' or curState.getText() = 'UT' or curState.getText() = 'VT' or curState.getText() = 'VA' or curState.getText() = 'VI' or curState.getText() = 'WA' or curState.getText() = 'WV' or curState.getText() = 'WI' or curState.getText() = 'WY' ))) or (addr.state->exists(curState | curState.isNullFlavorDefined())))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState
		-->
	<assert test="not(cda:addr/cda:country[string(.//text()) = 'US']) or count(cda:addr/cda:state) = 1 and (cda:addr/cda:state[string(.//text()) = 'AL' or string(.//text()) = 'AK' or string(.//text()) = 'AS' or string(.//text()) = 'AZ' or string(.//text()) = 'AR' or string(.//text()) = 'CA' or string(.//text()) = 'CO' or string(.//text()) = 'CT' or string(.//text()) = 'DE' or string(.//text()) = 'DC' or string(.//text()) = 'FL' or string(.//text()) = 'FM' or string(.//text()) = 'GA' or string(.//text()) = 'GU' or string(.//text()) = 'HI' or string(.//text()) = 'ID' or string(.//text()) = 'IL' or string(.//text()) = 'IN' or string(.//text()) = 'IA' or string(.//text()) = 'KS' or string(.//text()) = 'KY' or string(.//text()) = 'LA' or string(.//text()) = 'ME' or string(.//text()) = 'MH' or string(.//text()) = 'MD' or string(.//text()) = 'MA' or string(.//text()) = 'MI' or string(.//text()) = 'MN' or string(.//text()) = 'MS' or string(.//text()) = 'MO' or string(.//text()) = 'MT' or string(.//text()) = 'NE' or string(.//text()) = 'NV' or string(.//text()) = 'NH' or string(.//text()) = 'NJ' or string(.//text()) = 'NM' or string(.//text()) = 'NY' or string(.//text()) = 'NC' or string(.//text()) = 'ND' or string(.//text()) = 'MP' or string(.//text()) = 'OH' or string(.//text()) = 'OK' or string(.//text()) = 'OR' or string(.//text()) = 'PW' or string(.//text()) = 'PA' or string(.//text()) = 'PR' or string(.//text()) = 'RI' or string(.//text()) = 'SC' or string(.//text()) = 'SD' or string(.//text()) = 'TN' or string(.//text()) = 'TX' or string(.//text()) = 'UM' or string(.//text()) = 'UT' or string(.//text()) = 'VT' or string(.//text()) = 'VA' or string(.//text()) = 'VI' or string(.//text()) = 'WA' or string(.//text()) = 'WV' or string(.//text()) = 'WI' or string(.//text()) = 'WY'] or cda:addr/cda:state[@nullFlavor])">Error: DiagnosticImagingReport - 2.6.12.i.d.10.i.b GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState
		Conformance: If country is US, this addr SHALL contain exactly one [1..1] state, which SHALL be selected from ValueSet StateValueSet 2.16.840.1.113883.3.88.12.80.1 DYNAMIC (CONF:5402)
		Analysis: If country is US, this addr SHALL contain exactly one [1..1] state, which SHALL be selected from ValueSet StateValueSet 2.16.840.1.113883.3.88.12.80.1 DYNAMIC
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReport_1A_LanguageCommunication_preferenceInd_2_6_12_i_d_11_iv-error_mdht" see="#p-DiagnosticImagingReport_1A_LanguageCommunication_preferenceInd_2_6_12_i_d_11_iv-error_mdht" name="p-DiagnosticImagingReport_1A_LanguageCommunication_preferenceInd_2_6_12_i_d_11_iv-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: DiagnosticImagingReport - 2.6.12.i.d.11.iv preferenceInd
		Conformance: MAY contain zero or one [0..1] preferenceInd (CONF:5414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReport_1A_LanguageCommunication_languageCode_2_6_12_i_d_11_i-error_mdht" see="#p-DiagnosticImagingReport_1A_LanguageCommunication_languageCode_2_6_12_i_d_11_i-error_mdht" name="p-DiagnosticImagingReport_1A_LanguageCommunication_languageCode_2_6_12_i_d_11_i-error_mdht">
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
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: DiagnosticImagingReport - 2.6.12.i.d.11.i languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: DiagnosticImagingReport - 2.6.12.i.d.11.i languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)
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
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component">Cannot find context /cda:ClinicalDocument/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.2"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.2"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.6.1.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.6"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.63"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.8"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer">Cannot find context /cda:ClinicalDocument/cda:dataEnterer</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget">Cannot find context /cda:ClinicalDocument/cda:recordTarget</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
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
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-DiagnosticImagingReport_2_DiagnosticImagingReport_component_2_6_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_templateId_2_6_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_recordTarget_2_6_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_code_2_6_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportUseDiagnosticImagingCode_2_6_13-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_confidentialityCode_2_6_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_setId_2_6_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_languageCode_2_6_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_documentationOf_2_6_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_title_2_6_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authenticator_2_6_19-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informant_2_6_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_supportParticipant_2_6_21-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informationRecipient_2_6_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_inFulfillmentOf_2_6_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_author_2_6_14-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_dataEnterer_2_6_15-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_legalAuthenticator_2_6_18-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_versionNumber_2_6_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_DiagnosticImagingReport_componentOf_2_6_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_typeId_2_6_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_effectiveTime_2_6_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authorization_2_6_24-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_relatedDocument_2_6_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportAllSectionsHaveTitle_2_6_15-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_id_2_6_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_participant1_2_6_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_custodian_2_6_16-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportSectionsHaveText_2_6_19-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_realmCode_2_6_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Participant_associatedEntity_2_6_7_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssociatedEntity_associatedPerson_2_6_7_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Person_name_2_6_7_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DocumentationOf_serviceEvent3_2_6_9_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ServiceEvent4_code_2_6_9_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ServiceEvent4_physicianReadingStudyPerformer_2_6_9_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ServiceEvent4_id_2_6_9_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ServiceEvent4_classCode_2_6_9_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_templateId_2_6_9_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_ComponentOf_encompassingEncounter_2_6_11_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_EncompassingEncounter7_id_2_6_11_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_EncompassingEncounter7_effectiveTime_2_6_11_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_EncompassingEncounter7_responsibleParty_2_6_11_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_EncompassingEncounter7_physicianofRecordParticipant_2_6_11_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_assignedEntity_2_6_11_i_c_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_templateId_2_6_11_i_c_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_id_2_7_11_i_d_3_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode_2_6_11_i_c_3_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_code_2_7_11_i_d_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_assignedPerson_2_6_11_i_c_3_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedPerson_name_2_6_11_i_c_3_iii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_ResponsibleParty_assignedEntity_2_6_11_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization_2_6_11_i_d_1_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_Component_structuredBody_2_6_12_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_StructuredBody_dICOMObjectCatalogSection_2_6_12_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_StructuredBody_findingsSection_2_6_12_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_Component_findingsSection_2_6_12_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_FindingsSection_templateId_3_32_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_Component_dICOMObjectCatalogSection_2_6_12_i_b_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_DICOMObjectCatalogSection_entry_3_21_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_code_3_21_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_templateId_3_21_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyActEntry_studyAct_3_21_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_code_4_146_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_entryRelationship_4_146_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_effectiveTime_4_146_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_text_4_146_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_moodCode_4_146_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_StudyActIdsHaveRoot_4_146_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_classCode_4_146_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_StudyActNoIdExtension_4_146_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_id_4_146_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_templateId_4_146_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesActEntryRelationship_seriesAct_4_146_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_SeriesActIdHasRoot_4_138_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_moodCode_4_138_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_classCode_4_138_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_templateId_4_138_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_text_4_138_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_effectiveTime_4_138_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_id_4_138_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_entryRelationship_4_138_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_code_4_138_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_138_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_145_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_text_4_145_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_classCode_4_145_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_effectiveTime_4_145_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_moodCode_4_145_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_145_13-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_id_4_145_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_templateId_4_145_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_145_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_145_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_code_4_145_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_145_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Author_assignedAuthor_2_6_14_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedAuthor_code_2_6_14_ii_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DataEnterer_assignedEntity_2_6_15_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_code_2_6_15_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_6_21_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_RecordTarget_patientRole_2_6_12_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PatientRole_patient_2_6_12_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_ethnicGroupCode_2_6_12_i_d_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_raceCode_2_6_12_i_d_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_birthplace_2_6_12_i_d_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_guardian_2_6_12_i_d_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_birthTime_2_6_12_i_d_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_6_12_i_d_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_languageCommunication_2_6_12_i_d_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TS_value_2_6_12_i_d_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Guardian_telecom_2_6_12_i_d_9_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Guardian_code_2_6_12_i_d_9_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_6_12_i_d_9_v-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Birthplace_place_2_6_12_i_d_10_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Place_GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState_2_6_12_i_d_10_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LanguageCommunication_preferenceInd_2_6_12_i_d_11_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LanguageCommunication_languageCode_2_6_12_i_d_11_i-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
