<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_languageCode_2_7_9-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_languageCode_2_7_9-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_languageCode_2_7_9-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: Diagnostic Imaging Report (V3) - 2.7.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: Diagnostic Imaging Report (V3) - 2.7.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_inFulfillmentOf_2_7_8-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_inFulfillmentOf_2_7_8-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_inFulfillmentOf_2_7_8-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: DiagnosticImagingReport2InFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.8 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:1198-30936)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_author_2_7_7-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_author_2_7_7-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_author_2_7_7-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: Diagnostic Imaging Report (V3) - 2.7.7 author
		Conformance: SHALL contain at least one [1..*] author (CONF:1198-5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_id_2_7_3-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_id_2_7_3-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_id_2_7_3-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.3 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:1198-30932)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_legalAuthenticator_2_7_10-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_legalAuthenticator_2_7_10-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_legalAuthenticator_2_7_10-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.10 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:1198-5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_title_2_7_4-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_title_2_7_4-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_title_2_7_4-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: Diagnostic Imaging Report (V3) - 2.7.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1198-5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_code_2_7_4-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_code_2_7_4-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_code_2_7_4-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCodeP
		-->
	<assert test="cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.4 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-14833), which SHOULD be selected from ValueSet LOINC Imaging Document Codes 1.3.6.1.4.1.12009.10.2.5 DYNAMIC (CONF:1198-14834)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.1' and @code]">Error: Diagnostic Imaging Report (V3) - 2.7.4 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-14833), which SHOULD be selected from ValueSet LOINC Imaging Document Codes 1.3.6.1.4.1.12009.10.2.5 DYNAMIC (CONF:1198-14834)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_supportParticipant_2_7_15-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_supportParticipant_2_7_15-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_supportParticipant_2_7_15-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.15 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:1198-10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_informant_2_7_5-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_informant_2_7_5-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_informant_2_7_5-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->isEmpty()
			Constraint name: DiagnosticImagingReport2Informant
		-->
	<assert test="not(cda:informant)">Error: Diagnostic Imaging Report (V3) - 2.7.5 informant
		Conformance: SHALL contain  [0..0] informant such that it  (CONF:1198-8410)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_recordTarget_2_7_5-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_recordTarget_2_7_5-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_recordTarget_2_7_5-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: GeneralHeaderConstraintsRecordTarget
		-->
	<assert test="cda:recordTarget">Error: Diagnostic Imaging Report (V3) - 2.7.5 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:1198-5266)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_dataEnterer_2_7_6-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_dataEnterer_2_7_6-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_dataEnterer_2_7_6-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.6 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:1198-5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_componentOf_2_7_11-error_mdht" see="#p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_componentOf_2_7_11-error_mdht" name="p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_componentOf_2_7_11-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: DiagnosticImagingReport2ComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.11 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:1198-30939)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_effectiveTime_2_7_7-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_effectiveTime_2_7_7-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_effectiveTime_2_7_7-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Diagnostic Imaging Report (V3) - 2.7.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_confidentialityCode_2_7_8-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_confidentialityCode_2_7_8-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_confidentialityCode_2_7_8-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: Diagnostic Imaging Report (V3) - 2.7.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: Diagnostic Imaging Report (V3) - 2.7.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_realmCode_2_7_3-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_realmCode_2_7_3-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_realmCode_2_7_3-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: Diagnostic Imaging Report (V3) - 2.7.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: Diagnostic Imaging Report (V3) - 2.7.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_setId_2_7_10-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_setId_2_7_10-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_setId_2_7_10-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: Diagnostic Imaging Report (V3) - 2.7.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261, R2.1=CONF:1198-5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_authenticator_2_7_11-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_authenticator_2_7_11-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_authenticator_2_7_11-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.11 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:1198-5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_versionNumber_2_7_11-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_versionNumber_2_7_11-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_versionNumber_2_7_11-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: Diagnostic Imaging Report (V3) - 2.7.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264, R2.1=CONF:1198-5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_participant_2_7_7-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_participant_2_7_7-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_participant_2_7_7-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() <= 1
			Constraint name: DiagnosticImagingReport2Participant
		-->
	<assert test="count(cda:participant) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.7 participant
		Conformance: MAY contain zero or one [0..1] participant (CONF:1198-8414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_documentationOf_2_7_9-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_documentationOf_2_7_9-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_documentationOf_2_7_9-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
			Constraint name: DiagnosticImagingReport2DocumentationOf
		-->
	<assert test="count(cda:documentationOf)=1">Error: Diagnostic Imaging Report (V3) - 2.7.9 documentationOf
		Conformance: SHALL contain exactly one [1..1] documentationOf (CONF:1198-8416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_custodian_2_7_8-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_custodian_2_7_8-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_custodian_2_7_8-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: GeneralHeaderConstraintsCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: Diagnostic Imaging Report (V3) - 2.7.8 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:1198-5519)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_authorization_2_7_17-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_authorization_2_7_17-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_authorization_2_7_17-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.17 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:1198-16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_relatedDocument_2_7_10-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_relatedDocument_2_7_10-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_relatedDocument_2_7_10-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.relatedDocument->select(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))->size() <= 1
			Constraint name: DiagnosticImagingReport2RelatedDocument
		-->
	<assert test="count(cda:relatedDocument) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.10 relatedDocument
		Conformance: MAY contain zero or one [0..1] relatedDocument (CONF:1198-8432)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_component2_2_7_12-error_mdht" see="#p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_component2_2_7_12-error_mdht" name="p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_component2_2_7_12-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))
			Constraint name: DiagnosticImagingReport2Component2
		-->
	<assert test="count(cda:component)=1">Error: Diagnostic Imaging Report (V3) - 2.7.12 component2
		Conformance: SHALL contain exactly one [1..1] component (CONF:1198-14907)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_component_2_7_13-error_mdht" see="#p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_component_2_7_13-error_mdht" name="p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_component_2_7_13-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(consol::DiagnosticImagingReport2::Component))
			Constraint name: DiagnosticImagingReport2Component
		-->
	<assert test="count(cda:component)=1">Error: Diagnostic Imaging Report (V3) - 2.7.13 component
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_templateId_2_7_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_templateId_2_7_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_templateId_2_7_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.5' and id.extension = '2015-08-01')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.5' and @extension = '2015-08-01'">Error: Diagnostic Imaging Report (V3) - 2.7.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-8404, CONF:1198-10042, CONF:1198-32515 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.5&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_typeId_2_7_3-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_typeId_2_7_3-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_typeId_2_7_3-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: Diagnostic Imaging Report (V3) - 2.7.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport2: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_informationRecipient_2_7_6-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_informationRecipient_2_7_6-error_mdht" name="p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_informationRecipient_2_7_6-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2
			UML root path: /DiagnosticImagingReport2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: DiagnosticImagingReport2InformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.6 informationRecipient
		Conformance: MAY contain  [0..*] informationRecipient such that it  (CONF:1198-8411)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- II -->

<pattern id="p-DiagnosticImagingReportV3_1A_II_root_2_7_3_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_II_root_2_7_3_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_II_root_2_7_3_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/id
			UML root path: /DiagnosticImagingReport2/id
		-->
	<rule context="/cda:ClinicalDocument/cda:id">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.root.oclIsUndefined() ))
			Constraint name: DiagnosticImagingReport2IIRoot
		-->
	<assert test="@nullFlavor or @root">Error: Diagnostic Imaging Report (V3) - 2.7.3.i root
		Conformance: SHALL contain exactly one [1..1] root (CONF:1198-30933)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Participant -->

<pattern id="p-DiagnosticImagingReportV3_1A_Participant_associatedEntity_2_7_7_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Participant_associatedEntity_2_7_7_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_Participant_associatedEntity_2_7_7_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/participant
			UML root path: /DiagnosticImagingReport2/participant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(consol::DiagnosticImagingReport2::Participant::AssociatedEntity))
			Constraint name: DiagnosticImagingReport2ParticipantAssociatedEntity
		-->
	<assert test="count(cda:associatedEntity)=1">Error: Diagnostic Imaging Report (V3) - 2.7.7.i associatedEntity
		Conformance: SHALL contain exactly one [1..1] associatedEntity (CONF:1198-31198)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssociatedEntity_associatedPerson_2_7_7_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssociatedEntity_associatedPerson_2_7_7_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssociatedEntity_associatedPerson_2_7_7_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/participant/associatedEntity
			UML root path: /DiagnosticImagingReport2/participant/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">
		<!--
			OCL: self.associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(consol::DiagnosticImagingReport2::Participant::AssociatedEntity::Person))
			Constraint name: DiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson
		-->
	<assert test="count(cda:associatedPerson)=1">Error: Diagnostic Imaging Report (V3) - 2.7.7.i.a associatedPerson
		Conformance: SHALL contain exactly one [1..1] associatedPerson (CONF:1198-31199)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReportV3_1A_Person_name_2_7_7_i_a_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Person_name_2_7_7_i_a_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_Person_name_2_7_7_i_a_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/participant/associatedEntity/associatedPerson
			UML root path: /DiagnosticImagingReport2/participant/associatedEntity/associatedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson">
		<!--
			OCL: self.name->size() = 1
			Constraint name: DiagnosticImagingReport2ParticipantAssociatedEntityPersonName
		-->
	<assert test="count(cda:name) = 1">Error: Diagnostic Imaging Report (V3) - 2.7.7.i.a.1 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:1198-31200)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InFulfillmentOf -->

<pattern id="p-DiagnosticImagingReportV3_1A_InFulfillmentOf_order_2_7_8_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_InFulfillmentOf_order_2_7_8_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_InFulfillmentOf_order_2_7_8_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/inFulfillmentOf
			UML root path: /DiagnosticImagingReport2/inFulfillmentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf">
		<!--
			OCL: self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(consol::DiagnosticImagingReport2::InFulfillmentOf::Order))
			Constraint name: DiagnosticImagingReport2InFulfillmentOfOrder
		-->
	<assert test="count(cda:order)=1">Error: Diagnostic Imaging Report (V3) - 2.7.8.i order
		Conformance: SHALL contain exactly one [1..1] order (CONF:1198-30937)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Order -->

<pattern id="p-DiagnosticImagingReportV3_1A_Order_id_2_7_8_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Order_id_2_7_8_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_Order_id_2_7_8_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/inFulfillmentOf/order
			UML root path: /DiagnosticImagingReport2/inFulfillmentOf/order
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: DiagnosticImagingReport2InFulfillmentOfOrderId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.8.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-30938)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-DiagnosticImagingReportV3_1A_DocumentationOf_serviceEvent_2_7_9_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DocumentationOf_serviceEvent_2_7_9_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_DocumentationOf_serviceEvent_2_7_9_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/documentationOf
			UML root path: /DiagnosticImagingReport2/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::DiagnosticImagingReport2::DocumentationOf::ServiceEvent))
			Constraint name: DiagnosticImagingReport2DocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: Diagnostic Imaging Report (V3) - 2.7.9.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:1198-8431)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-DiagnosticImagingReportV3_1A_ServiceEvent_code_2_7_9_i_c-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ServiceEvent_code_2_7_9_i_c-error_mdht" name="p-DiagnosticImagingReportV3_1A_ServiceEvent_code_2_7_9_i_c-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/documentationOf/serviceEvent
			UML root path: /DiagnosticImagingReport2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: DiagnosticImagingReport2DocumentationOfServiceEventCode
		-->
	<assert test="cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.9.i.c code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-8419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-DiagnosticImagingReportV3_1A_ServiceEvent_physicianReadingStudyPerformer2_2_7_9_i_d-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ServiceEvent_physicianReadingStudyPerformer2_2_7_9_i_d-error_mdht" name="p-DiagnosticImagingReportV3_1A_ServiceEvent_physicianReadingStudyPerformer2_2_7_9_i_d-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/documentationOf/serviceEvent
			UML root path: /DiagnosticImagingReport2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer2))->size() >= 0
			Constraint name: DiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2
		-->
	<assert test="count(cda:performer[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.1']) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.9.i.d physicianReadingStudyPerformer2
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:1198-8422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-DiagnosticImagingReportV3_1A_ServiceEvent_classCode_2_7_9_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ServiceEvent_classCode_2_7_9_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_ServiceEvent_classCode_2_7_9_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/documentationOf/serviceEvent
			UML root path: /DiagnosticImagingReport2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::ActClassRoot::ACT
			Constraint name: DiagnosticImagingReport2DocumentationOfServiceEventClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'ACT'">Error: Diagnostic Imaging Report (V3) - 2.7.9.i.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1198-8430)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-DiagnosticImagingReportV3_1A_ServiceEvent_id_2_7_9_i_b-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ServiceEvent_id_2_7_9_i_b-error_mdht" name="p-DiagnosticImagingReportV3_1A_ServiceEvent_id_2_7_9_i_b-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/documentationOf/serviceEvent
			UML root path: /DiagnosticImagingReport2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: DiagnosticImagingReport2DocumentationOfServiceEventId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.9.i.b id
		Conformance: SHOULD contain zero or more [0..*] id (CONF:1198-8418)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianReadingStudyPerformer2: 2.16.840.1.113883.10.20.6.2.1 -->

<pattern id="p-DiagnosticImagingReportV3_1A_PhysicianReadingStudyPerformer2_templateId_2_7_9_i_d_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_PhysicianReadingStudyPerformer2_templateId_2_7_9_i_d_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_PhysicianReadingStudyPerformer2_templateId_2_7_9_i_d_1-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer2
			UML root path: /DiagnosticImagingReport2/documentationOf/serviceEvent/physicianReadingStudyPerformer2
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.1']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.1' and id.extension = '2014-06-09')
			Constraint name: PhysicianReadingStudyPerformerTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.1' and @extension = '2014-06-09'">Error: Diagnostic Imaging Report (V3) - 2.7.9.i.d.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-30773, CONF:1098-30774, CONF:1098-32564 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.1&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedDocument -->

<pattern id="p-DiagnosticImagingReportV3_1A_RelatedDocument_parentDocument_2_7_10_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_RelatedDocument_parentDocument_2_7_10_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_RelatedDocument_parentDocument_2_7_10_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/relatedDocument
			UML root path: /DiagnosticImagingReport2/relatedDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:relatedDocument">
		<!--
			OCL: self.parentDocument->one(parentDocument : cda::ParentDocument | not parentDocument.oclIsUndefined() and parentDocument.oclIsKindOf(consol::DiagnosticImagingReport2::RelatedDocument::ParentDocument))
			Constraint name: DiagnosticImagingReport2RelatedDocumentParentDocument
		-->
	<assert test="count(cda:parentDocument)=1">Error: Diagnostic Imaging Report (V3) - 2.7.10.i parentDocument
		Conformance: SHALL contain exactly one [1..1] parentDocument (CONF:1198-32089)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParentDocument -->

<pattern id="p-DiagnosticImagingReportV3_1A_ParentDocument_id_2_7_10_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ParentDocument_id_2_7_10_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_ParentDocument_id_2_7_10_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/relatedDocument/parentDocument
			UML root path: /DiagnosticImagingReport2/relatedDocument/parentDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument">
		<!--
			OCL: self.id->size() = 1
			Constraint name: DiagnosticImagingReport2RelatedDocumentParentDocumentId
		-->
	<assert test="count(cda:id) = 1">Error: Diagnostic Imaging Report (V3) - 2.7.10.i.a id
		Conformance: SHALL contain exactly one [1..1] id (CONF:1198-32090)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-DiagnosticImagingReportV3_2_ComponentOf_encompassingEncounter_2_7_11_i-error_mdht" see="#p-DiagnosticImagingReportV3_2_ComponentOf_encompassingEncounter_2_7_11_i-error_mdht" name="p-DiagnosticImagingReportV3_2_ComponentOf_encompassingEncounter_2_7_11_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/componentOf
			UML root path: /DiagnosticImagingReport2/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::DiagnosticImagingReport2::ComponentOf::EncompassingEncounter))
			Constraint name: DiagnosticImagingReport2ComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:1198-30940)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-DiagnosticImagingReportV3_2_EncompassingEncounter_responsibleParty_2_7_11_i_c-error_mdht" see="#p-DiagnosticImagingReportV3_2_EncompassingEncounter_responsibleParty_2_7_11_i_c-error_mdht" name="p-DiagnosticImagingReportV3_2_EncompassingEncounter_responsibleParty_2_7_11_i_c-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: self.responsibleParty->select(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(consol::DiagnosticImagingReport2::ComponentOf::EncompassingEncounter::ResponsibleParty))->size() <= 1
			Constraint name: DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty
		-->
	<assert test="count(cda:responsibleParty) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.c responsibleParty
		Conformance: MAY contain zero or one [0..1] responsibleParty (CONF:1198-30945)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-DiagnosticImagingReportV3_2_EncompassingEncounter_physicianofRecordParticipant2_2_7_11_i_d-error_mdht" see="#p-DiagnosticImagingReportV3_2_EncompassingEncounter_physicianofRecordParticipant2_2_7_11_i_d-error_mdht" name="p-DiagnosticImagingReportV3_2_EncompassingEncounter_physicianofRecordParticipant2_2_7_11_i_d-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: self.encounterParticipant->select(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant2))->size() <= 1
			Constraint name: DiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2
		-->
	<assert test="count(cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d physicianofRecordParticipant2
		Conformance: SHOULD contain zero or one [0..1] encounterParticipant (CONF:1198-30948)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-DiagnosticImagingReportV3_2_EncompassingEncounter_effectiveTime_2_7_11_i_b-error_mdht" see="#p-DiagnosticImagingReportV3_2_EncompassingEncounter_effectiveTime_2_7_11_i_b-error_mdht" name="p-DiagnosticImagingReportV3_2_EncompassingEncounter_effectiveTime_2_7_11_i_b-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: DiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.b effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:1198-30943)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-DiagnosticImagingReportV3_2_EncompassingEncounter_id_2_7_11_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_2_EncompassingEncounter_id_2_7_11_i_a-error_mdht" name="p-DiagnosticImagingReportV3_2_EncompassingEncounter_id_2_7_11_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: DiagnosticImagingReport2ComponentOfEncompassingEncounterId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-30941)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ResponsibleParty -->

<pattern id="p-DiagnosticImagingReportV3_2_ResponsibleParty_assignedEntity_2_7_11_i_c_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_ResponsibleParty_assignedEntity_2_7_11_i_c_1-error_mdht" name="p-DiagnosticImagingReportV3_2_ResponsibleParty_assignedEntity_2_7_11_i_c_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/responsibleParty
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/responsibleParty
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::DiagnosticImagingReport2::ComponentOf::EncompassingEncounter::ResponsibleParty::AssignedEntity))
			Constraint name: DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.c.1 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-30946)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianofRecordParticipant2: 2.16.840.1.113883.10.20.6.2.2 -->

<pattern id="p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_typeCode_2_7_11_i_d_2-error_mdht" see="#p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_typeCode_2_7_11_i_d_2-error_mdht" name="p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_typeCode_2_7_11_i_d_2-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']">
		<!--
			OCL: self.typeCode=vocab::x_EncounterParticipant::ATND
			Constraint name: PhysicianofRecordParticipantTypeCode
		-->
	<assert test="@typeCode = 'ATND'">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.2 typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;ATND&quot;  (CONF:8881, R2.0=CONF:1098-8881)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianofRecordParticipant2: 2.16.840.1.113883.10.20.6.2.2 -->

<pattern id="p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_templateId_2_7_11_i_d_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_templateId_2_7_11_i_d_1-error_mdht" name="p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_templateId_2_7_11_i_d_1-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.2' and id.extension = '2014-06-09')
			Constraint name: PhysicianofRecordParticipantTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2' and @extension = '2014-06-09'">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-16072, CONF:1098-16073, CONF:1098-32586 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.2&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianofRecordParticipant2: 2.16.840.1.113883.10.20.6.2.2 -->

<pattern id="p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_assignedEntity_2_7_11_i_d_3-error_mdht" see="#p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_assignedEntity_2_7_11_i_d_3-error_mdht" name="p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_assignedEntity_2_7_11_i_d_3-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
			Constraint name: PhysicianofRecordParticipantAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.3 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1098-8886)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_2_AssignedEntity_assignedPerson_2_7_11_i_d_3_iii-error_mdht" see="#p-DiagnosticImagingReportV3_2_AssignedEntity_assignedPerson_2_7_11_i_d_3_iii-error_mdht" name="p-DiagnosticImagingReportV3_2_AssignedEntity_assignedPerson_2_7_11_i_d_3_iii-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2/assignedEntity
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->select(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::PhysicianofRecordParticipant2::AssignedEntity::AssignedPerson))->size() <= 1
			Constraint name: PhysicianofRecordParticipantAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.3.iii assignedPerson
		Conformance: SHOULD contain zero or one [0..1] assignedPerson (CONF:1098-30928)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_2_AssignedEntity_code_2_7_11_i_d_3_i-error_mdht" see="#p-DiagnosticImagingReportV3_2_AssignedEntity_code_2_7_11_i_d_3_i-error_mdht" name="p-DiagnosticImagingReportV3_2_AssignedEntity_code_2_7_11_i_d_3_i-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2/assignedEntity
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PhysicianofRecordParticipantAssignedEntityCode
		-->
	<assert test="cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.3.i code
		Conformance: SHALL contain exactly one [1..1] code (CONF:8888, R2.0=CONF:1098-8888)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_2_AssignedEntity_id_2_7_11_i_d_3_ii-error_mdht" see="#p-DiagnosticImagingReportV3_2_AssignedEntity_id_2_7_11_i_d_3_ii-error_mdht" name="p-DiagnosticImagingReportV3_2_AssignedEntity_id_2_7_11_i_d_3_ii-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2/assignedEntity
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: PhysicianofRecordParticipantAssignedEntityId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.3.ii id
		Conformance: SHALL contain at least one [1..*] id (CONF:8887, R2.0=CONF:1098-8887)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_2_AssignedEntity_representedOrganization_2_7_11_i_d_3_iv-error_mdht" see="#p-DiagnosticImagingReportV3_2_AssignedEntity_representedOrganization_2_7_11_i_d_3_iv-error_mdht" name="p-DiagnosticImagingReportV3_2_AssignedEntity_representedOrganization_2_7_11_i_d_3_iv-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2/assignedEntity
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity">
		<!--
			OCL: self.representedOrganization->select(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(consol::PhysicianofRecordParticipant2::AssignedEntity::RepresentedOrganization))->size() <= 1
			Constraint name: PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization
		-->
	<assert test="count(cda:representedOrganization) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.3.iv representedOrganization
		Conformance: MAY contain zero or one [0..1] representedOrganization (CONF:1098-16074)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedPerson -->

<pattern id="p-DiagnosticImagingReportV3_2_AssignedPerson_name_2_7_11_i_d_3_iii_a-error_mdht" see="#p-DiagnosticImagingReportV3_2_AssignedPerson_name_2_7_11_i_d_3_iii_a-error_mdht" name="p-DiagnosticImagingReportV3_2_AssignedPerson_name_2_7_11_i_d_3_iii_a-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2/assignedEntity/assignedPerson
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: self.name->size() = 1
			Constraint name: PhysicianofRecordParticipantAssignedEntityAssignedPersonName
		-->
	<assert test="count(cda:name) = 1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.3.iii.a name
		Conformance: SHALL contain exactly one [1..1] name (CONF:1098-30929)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-DiagnosticImagingReportV3_2_RepresentedOrganization_name_2_7_11_i_d_3_iv_a-error_mdht" see="#p-DiagnosticImagingReportV3_2_RepresentedOrganization_name_2_7_11_i_d_3_iv_a-error_mdht" name="p-DiagnosticImagingReportV3_2_RepresentedOrganization_name_2_7_11_i_d_3_iv_a-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant2/assignedEntity/representedOrganization
			UML root path: /DiagnosticImagingReport2/componentOf/encompassingEncounter/physicianofRecordParticipant2/assignedEntity/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity/cda:representedOrganization">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() <= 1)
			Constraint name: PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or count(cda:name) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.11.i.d.3.iv.a name
		Conformance: SHOULD contain zero or one [0..1] name (CONF:1098-16075)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReportV3_2_Component_structuredBody_2_7_12_i-error_mdht" see="#p-DiagnosticImagingReportV3_2_Component_structuredBody_2_7_12_i-error_mdht" name="p-DiagnosticImagingReportV3_2_Component_structuredBody_2_7_12_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2
			UML root path: /DiagnosticImagingReport2/component2
		-->
	<rule context="/cda:ClinicalDocument/cda:component">
		<!--
			OCL: self.structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(consol::DiagnosticImagingReport2::Component::StructuredBody))
			Constraint name: DiagnosticImagingReport2ComponentStructuredBody
		-->
	<assert test="count(cda:structuredBody)=1">Error: Diagnostic Imaging Report (V3) - 2.7.12.i structuredBody
		Conformance: SHALL contain exactly one [1..1] structuredBody (CONF:1198-30695)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-DiagnosticImagingReportV3_2_StructuredBody_component3_2_7_12_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_2_StructuredBody_component3_2_7_12_i_a-error_mdht" name="p-DiagnosticImagingReportV3_2_StructuredBody_component3_2_7_12_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody
			UML root path: /DiagnosticImagingReport2/component2/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->select(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::DiagnosticImagingReport2::Component::StructuredBody::Component3))->size() >= 0
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3
		-->
	<assert test="count(cda:component) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a component3
		Conformance: MAY contain zero or more [0..*] component (CONF:1198-31055)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component3 -->

<pattern id="p-DiagnosticImagingReportV3_2_Component3_section_2_7_12_i_a_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_Component3_section_2_7_12_i_a_1-error_mdht" name="p-DiagnosticImagingReportV3_2_Component3_section_2_7_12_i_a_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody/component3
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticImagingReport2::Component::StructuredBody::Component3::Section))
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3Section
		-->
	<assert test="count(cda:section)=1">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1 section
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-31056)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Section -->

<pattern id="p-DiagnosticImagingReportV3_3A_Section_entry_2_7_12_i_a_1_vi-error_mdht" see="#p-DiagnosticImagingReportV3_3A_Section_entry_2_7_12_i_a_1_vi-error_mdht" name="p-DiagnosticImagingReportV3_3A_Section_entry_2_7_12_i_a_1_vi-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::DiagnosticImagingReport2::Component::StructuredBody::Component3::Section::SOPInstanceObservationEntry))
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.vi entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Section -->

<pattern id="p-DiagnosticImagingReportV3_2_Section_text_2_7_12_i_a_1_iii-error_mdht" see="#p-DiagnosticImagingReportV3_2_Section_text_2_7_12_i_a_1_iii-error_mdht" name="p-DiagnosticImagingReportV3_2_Section_text_2_7_12_i_a_1_iii-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">
		<!--
			OCL: (not self.text.oclIsUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText
		-->
	<assert test="not(cda:text) or cda:text">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.iii text
		Conformance: SHOULD contain zero or one [0..1] text (CONF:1198-31059)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Section -->

<pattern id="p-DiagnosticImagingReportV3_2_Section_subject_2_7_12_i_a_1_iv-error_mdht" see="#p-DiagnosticImagingReportV3_2_Section_subject_2_7_12_i_a_1_iv-error_mdht" name="p-DiagnosticImagingReportV3_2_Section_subject_2_7_12_i_a_1_iv-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies subject->select(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(consol::DiagnosticImagingReport2::Component::StructuredBody::Component3::Section::Subject))->size() >= 0
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:subject[cda:relatedSubject/cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.iv subject
		Conformance: MAY contain zero or more [0..*] subject (CONF:1198-31215)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Section -->

<pattern id="p-DiagnosticImagingReportV3_2_Section_author_2_7_12_i_a_1_v-error_mdht" see="#p-DiagnosticImagingReportV3_2_Section_author_2_7_12_i_a_1_v-error_mdht" name="p-DiagnosticImagingReportV3_2_Section_author_2_7_12_i_a_1_v-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies author->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::DiagnosticImagingReport2::Component::StructuredBody::Component3::Section::Author))->size() >= 0
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:author) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.v author
		Conformance: MAY contain zero or more [0..*] author (CONF:1198-31217)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Section -->

<pattern id="p-DiagnosticImagingReportV3_2_Section_code_2_7_12_i_a_1_i-error_mdht" see="#p-DiagnosticImagingReportV3_2_Section_code_2_7_12_i_a_1_i-error_mdht" name="p-DiagnosticImagingReportV3_2_Section_code_2_7_12_i_a_1_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '1.2.840.10008.2.16.4' and not value.code.oclIsUndefined()
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '1.2.840.10008.2.16.4' and @code]">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.i code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-31057), which SHOULD be selected from ValueSet DIRSectionTypeCodes 2.16.840.1.113883.11.20.9.59 STATIC (CONF:1198-31207)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP
		-->
	<assert test="cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.i code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-31057), which SHOULD be selected from ValueSet DIRSectionTypeCodes 2.16.840.1.113883.11.20.9.59 STATIC (CONF:1198-31207)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Section -->

<pattern id="p-DiagnosticImagingReportV3_2_Section_title_2_7_12_i_a_1_ii-error_mdht" see="#p-DiagnosticImagingReportV3_2_Section_title_2_7_12_i_a_1_ii-error_mdht" name="p-DiagnosticImagingReportV3_2_Section_title_2_7_12_i_a_1_ii-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">
		<!--
			OCL: ((not self.title.oclIsUndefined()) and self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle
		-->
	<assert test="not(cda:title and not(cda:title/@nullFlavor)) or cda:title">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.ii title
		Conformance: SHOULD contain zero or one [0..1] title (CONF:1198-31058)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Subject -->

<pattern id="p-DiagnosticImagingReportV3_2_Subject_fetusSubjectContext_2_7_12_i_a_1_iv_a-error_mdht" see="#p-DiagnosticImagingReportV3_2_Subject_fetusSubjectContext_2_7_12_i_a_1_iv_a-error_mdht" name="p-DiagnosticImagingReportV3_2_Subject_fetusSubjectContext_2_7_12_i_a_1_iv_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/subject
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/subject
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject">
		<!--
			OCL: self.relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(consol::FetusSubjectContext))
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext
		-->
	<assert test="count(cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3'])=1">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.iv.a fetusSubjectContext
		Conformance: SHALL contain exactly one [1..1] relatedSubject (CONF:1198-31216)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- FetusSubjectContext: 2.16.840.1.113883.10.20.6.2.3 -->

<pattern id="p-DiagnosticImagingReportV3_2_FetusSubjectContext_templateId_2_7_12_i_a_1_iv_a_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_FetusSubjectContext_templateId_2_7_12_i_a_1_iv_a_1-error_mdht" name="p-DiagnosticImagingReportV3_2_FetusSubjectContext_templateId_2_7_12_i_a_1_iv_a_1-error_mdht">
		<!--
			UML path: /FetusSubjectContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/subject/fetusSubjectContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.3')
			Constraint name: FetusSubjectContextTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3'">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.iv.a.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:9189, CONF:10535 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.3&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- FetusSubjectContext: 2.16.840.1.113883.10.20.6.2.3 -->

<pattern id="p-DiagnosticImagingReportV3_2_FetusSubjectContext_subject_2_7_12_i_a_1_iv_a_3-error_mdht" see="#p-DiagnosticImagingReportV3_2_FetusSubjectContext_subject_2_7_12_i_a_1_iv_a_3-error_mdht" name="p-DiagnosticImagingReportV3_2_FetusSubjectContext_subject_2_7_12_i_a_1_iv_a_3-error_mdht">
		<!--
			UML path: /FetusSubjectContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/subject/fetusSubjectContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']">
		<!--
			OCL: self.subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(consol::FetusSubjectContext::SubjectPerson))
			Constraint name: FetusSubjectContextSubject
		-->
	<assert test="count(cda:subject)=1">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.iv.a.3 subject
		Conformance: SHALL contain exactly one [1..1] subject (CONF:9191)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- FetusSubjectContext: 2.16.840.1.113883.10.20.6.2.3 -->

<pattern id="p-DiagnosticImagingReportV3_2_FetusSubjectContext_code_2_7_12_i_a_1_iv_a_2-error_mdht" see="#p-DiagnosticImagingReportV3_2_FetusSubjectContext_code_2_7_12_i_a_1_iv_a_2-error_mdht" name="p-DiagnosticImagingReportV3_2_FetusSubjectContext_code_2_7_12_i_a_1_iv_a_2-error_mdht">
		<!--
			UML path: /FetusSubjectContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/subject/fetusSubjectContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']">
		<!--
			OCL: true
			Constraint name: FetusSubjectContextCodeP
		-->
	<assert test="true()">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.iv.a.2 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;121026&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9190)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '121026' and value.codeSystem = '1.2.840.10008.2.16.4'
			Constraint name: FetusSubjectContextCode
		-->
	<assert test="cda:code and cda:code[@code = '121026' and @codeSystem = '1.2.840.10008.2.16.4']">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.iv.a.2 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;121026&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9190)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SubjectPerson -->

<pattern id="p-DiagnosticImagingReportV3_2_SubjectPerson_name_2_7_12_i_a_1_iv_a_3_i-error_mdht" see="#p-DiagnosticImagingReportV3_2_SubjectPerson_name_2_7_12_i_a_1_iv_a_3_i-error_mdht" name="p-DiagnosticImagingReportV3_2_SubjectPerson_name_2_7_12_i_a_1_iv_a_3_i-error_mdht">
		<!--
			UML path: /FetusSubjectContext/subject
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/subject/fetusSubjectContext/subject
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']/cda:subject">
		<!--
			OCL: self.name->size() = 1
			Constraint name: FetusSubjectContextSubjectPersonName
		-->
	<assert test="count(cda:name) = 1">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.iv.a.3.i name
		Conformance: SHALL contain exactly one [1..1] name (CONF:9192)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ObserverContext: 2.16.840.1.113883.10.20.6.2.4 -->

<pattern id="p-DiagnosticImagingReportV3_2_ObserverContext_assignedAuthor_2_7_12_i_a_1_v_a_2-error_mdht" see="#p-DiagnosticImagingReportV3_2_ObserverContext_assignedAuthor_2_7_12_i_a_1_v_a_2-error_mdht" name="p-DiagnosticImagingReportV3_2_ObserverContext_assignedAuthor_2_7_12_i_a_1_v_a_2-error_mdht">
		<!--
			UML path: /ObserverContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/author/observerContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4']">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::ObserverContext::AssignedAuthor))
			Constraint name: ObserverContextAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.v.a.2 assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:9195)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ObserverContext: 2.16.840.1.113883.10.20.6.2.4 -->

<pattern id="p-DiagnosticImagingReportV3_2_ObserverContext_templateId_2_7_12_i_a_1_v_a_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_ObserverContext_templateId_2_7_12_i_a_1_v_a_1-error_mdht" name="p-DiagnosticImagingReportV3_2_ObserverContext_templateId_2_7_12_i_a_1_v_a_1-error_mdht">
		<!--
			UML path: /ObserverContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/author/observerContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.4')
			Constraint name: ObserverContextTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4'">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.v.a.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:9194, CONF:10536 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.4&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReportV3_2_AssignedAuthor_id_2_7_12_i_a_1_v_a_2_i-error_mdht" see="#p-DiagnosticImagingReportV3_2_AssignedAuthor_id_2_7_12_i_a_1_v_a_2_i-error_mdht" name="p-DiagnosticImagingReportV3_2_AssignedAuthor_id_2_7_12_i_a_1_v_a_2_i-error_mdht">
		<!--
			UML path: /ObserverContext/assignedAuthor
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/author/observerContext/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4']/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: ObserverContextAssignedAuthorId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.v.a.2.i id
		Conformance: SHALL contain at least one [1..*] id (CONF:9196)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReportV3_2_AssignedAuthor_ObserverContextAssignedAuthorHasAssignedPersonorAuthoringDevice_2_7_12_i_a_1_v_a_2_ii-error_mdht" see="#p-DiagnosticImagingReportV3_2_AssignedAuthor_ObserverContextAssignedAuthorHasAssignedPersonorAuthoringDevice_2_7_12_i_a_1_v_a_2_ii-error_mdht" name="p-DiagnosticImagingReportV3_2_AssignedAuthor_ObserverContextAssignedAuthorHasAssignedPersonorAuthoringDevice_2_7_12_i_a_1_v_a_2_ii-error_mdht">
		<!--
			UML path: /ObserverContext/assignedAuthor
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/author/observerContext/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4']/cda:assignedAuthor">
		<!--
			OCL: not self.assignedPerson.oclIsUndefined() xor not self.assignedAuthoringDevice.oclIsUndefined()
			Constraint name: ObserverContextAssignedAuthorHasAssignedPersonorAuthoringDevice
		-->
	<assert test="cda:assignedPerson or cda:assignedAuthoringDevice">Error: Diagnostic Imaging Report (V3) - 2.7.12.i.a.1.v.a.2.ii ObserverContextAssignedAuthorHasAssignedPersonorAuthoringDevice
		Conformance: Either assignedPerson or assignedAuthoringDevice SHALL be present (CONF:9198)
		Analysis: Either assignedPerson or assignedAuthoringDevice SHALL be present
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureContext: 2.16.840.1.113883.10.20.6.2.5 -->

<pattern id="p-DiagnosticImagingReportV3_3A_ProcedureContext_effectiveTime_4_123_5-error_mdht" see="#p-DiagnosticImagingReportV3_3A_ProcedureContext_effectiveTime_4_123_5-error_mdht" name="p-DiagnosticImagingReportV3_3A_ProcedureContext_effectiveTime_4_123_5-error_mdht">
		<!--
			UML path: /ProcedureContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/entry/procedureContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.value->size() = 1
			Constraint name: ProcedureContextEffectiveTimeValue
		-->
	<assert test="not(cda:effectiveTime) or count(cda:effectiveTime/@value) = 1">Error: Diagnostic Imaging Report (V3) - 4.123.5 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9203)
		Analysis: effectiveTime, if present, SHALL contain exactly one [1..1] @value
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: ProcedureContextEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Diagnostic Imaging Report (V3) - 4.123.5 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9203)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureContext: 2.16.840.1.113883.10.20.6.2.5 -->

<pattern id="p-DiagnosticImagingReportV3_3A_ProcedureContext_classCode_4_123_2-error_mdht" see="#p-DiagnosticImagingReportV3_3A_ProcedureContext_classCode_4_123_2-error_mdht" name="p-DiagnosticImagingReportV3_3A_ProcedureContext_classCode_4_123_2-error_mdht">
		<!--
			UML path: /ProcedureContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/entry/procedureContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: ProcedureContextClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: Diagnostic Imaging Report (V3) - 4.123.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:Pending)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureContext: 2.16.840.1.113883.10.20.6.2.5 -->

<pattern id="p-DiagnosticImagingReportV3_3A_ProcedureContext_moodCode_4_123_3-error_mdht" see="#p-DiagnosticImagingReportV3_3A_ProcedureContext_moodCode_4_123_3-error_mdht" name="p-DiagnosticImagingReportV3_3A_ProcedureContext_moodCode_4_123_3-error_mdht">
		<!--
			UML path: /ProcedureContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/entry/procedureContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: ProcedureContextMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Diagnostic Imaging Report (V3) - 4.123.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:Pending)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureContext: 2.16.840.1.113883.10.20.6.2.5 -->

<pattern id="p-DiagnosticImagingReportV3_3A_ProcedureContext_templateId_4_123_1-error_mdht" see="#p-DiagnosticImagingReportV3_3A_ProcedureContext_templateId_4_123_1-error_mdht" name="p-DiagnosticImagingReportV3_3A_ProcedureContext_templateId_4_123_1-error_mdht">
		<!--
			UML path: /ProcedureContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/entry/procedureContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.5')
			Constraint name: ProcedureContextTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5'">Error: Diagnostic Imaging Report (V3) - 4.123.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:9200, CONF:10530 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.5&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureContext: 2.16.840.1.113883.10.20.6.2.5 -->

<pattern id="p-DiagnosticImagingReportV3_3A_ProcedureContext_code_4_123_4-error_mdht" see="#p-DiagnosticImagingReportV3_3A_ProcedureContext_code_4_123_4-error_mdht" name="p-DiagnosticImagingReportV3_3A_ProcedureContext_code_4_123_4-error_mdht">
		<!--
			UML path: /ProcedureContext
			UML root path: /DiagnosticImagingReport2/component2/structuredBody/component3/section/entry/procedureContext
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureContextCode
		-->
	<assert test="cda:code">Error: Diagnostic Imaging Report (V3) - 4.123.4 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:9201)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReportV3_2_Component_structuredBody_2_7_13_i-error_mdht" see="#p-DiagnosticImagingReportV3_2_Component_structuredBody_2_7_13_i-error_mdht" name="p-DiagnosticImagingReportV3_2_Component_structuredBody_2_7_13_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component
			UML root path: /DiagnosticImagingReport2/component
		-->
	<rule context="/cda:ClinicalDocument/cda:component">
		<!--
			OCL: self.structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(consol::DiagnosticImagingReport2::Component::StructuredBody))
			Constraint name: DiagnosticImagingReport2ComponentStructuredBody
		-->
	<assert test="count(cda:structuredBody)=1">Error: Diagnostic Imaging Report (V3) - 2.7.13.i structuredBody
		Conformance: SHALL contain exactly one [1..1] structuredBody
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReportV3_2_Component_findingsSection_2_7_13_i_a_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_Component_findingsSection_2_7_13_i_a_1-error_mdht" name="p-DiagnosticImagingReportV3_2_Component_findingsSection_2_7_13_i_a_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component/structuredBody/findingsSection
			UML root path: /DiagnosticImagingReport2/component/structuredBody/findingsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponentFindingsSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'])=1">Error: Diagnostic Imaging Report (V3) - 2.7.13.i.a.1 findingsSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30696, CONF:1198-30697)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- FindingsSection: 2.16.840.1.113883.10.20.6.1.2 -->

<pattern id="p-DiagnosticImagingReportV3_2_FindingsSection_templateId_3_32_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_FindingsSection_templateId_3_32_1-error_mdht" name="p-DiagnosticImagingReportV3_2_FindingsSection_templateId_3_32_1-error_mdht">
		<!--
			UML path: /FindingsSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/findingsSection/findingsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.2')
			Constraint name: FindingsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'">Error: Diagnostic Imaging Report (V3) - 3.32.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8531, CONF:10456 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.2&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReportV3_2_Component_dICOMObjectCatalogSection_2_7_13_i_b_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_Component_dICOMObjectCatalogSection_2_7_13_i_b_1-error_mdht" name="p-DiagnosticImagingReportV3_2_Component_dICOMObjectCatalogSection_2_7_13_i_b_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport2/component/structuredBody/dICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport2/component/structuredBody/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))->size() <= 1
			Constraint name: DiagnosticImagingReport2ComponentStructuredBodyComponentDICOMObjectCatalogSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.13.i.b.1 dICOMObjectCatalogSection
		Conformance: SHOULD contain zero or one [0..1] section (CONF:1198-30698, CONF:1198-30699)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReportV3_2_DICOMObjectCatalogSection_templateId_3_21_1-error_mdht" see="#p-DiagnosticImagingReportV3_2_DICOMObjectCatalogSection_templateId_3_21_1-error_mdht" name="p-DiagnosticImagingReportV3_2_DICOMObjectCatalogSection_templateId_3_21_1-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: Diagnostic Imaging Report (V3) - 3.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReportV3_2_DICOMObjectCatalogSection_code_3_21_2-error_mdht" see="#p-DiagnosticImagingReportV3_2_DICOMObjectCatalogSection_code_3_21_2-error_mdht" name="p-DiagnosticImagingReportV3_2_DICOMObjectCatalogSection_code_3_21_2-error_mdht">
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
	<assert test="cda:code and cda:code[@code = '121181' and @codeSystem = '1.2.840.10008.2.16.4']">Error: Diagnostic Imaging Report (V3) - 3.21.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15456)/@code=&quot;121181&quot; Dicom Object Catalog (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:15457)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: DICOMObjectCatalogSectionCodeP
		-->
	<assert test="cda:code">Error: Diagnostic Imaging Report (V3) - 3.21.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15456)/@code=&quot;121181&quot; Dicom Object Catalog (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:15457)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReportV3_3A_DICOMObjectCatalogSection_entry_3_21_3-error_mdht" see="#p-DiagnosticImagingReportV3_3A_DICOMObjectCatalogSection_entry_3_21_3-error_mdht" name="p-DiagnosticImagingReportV3_3A_DICOMObjectCatalogSection_entry_3_21_3-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::DICOMObjectCatalogSection::StudyActEntry))
			Constraint name: DICOMObjectCatalogSectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry[cda:act/cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6'])=1">Error: Diagnostic Imaging Report (V3) - 3.21.3 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyActEntry -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyActEntry_studyAct_3_21_3_i-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyActEntry_studyAct_3_21_3_i-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyActEntry_studyAct_3_21_3_i-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection/entry
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry">
		<!--
			OCL: self.act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::StudyAct))
			Constraint name: DICOMObjectCatalogSectionStudyActEntryStudyAct
		-->
	<assert test="cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Error: Diagnostic Imaging Report (V3) - 3.21.3.i studyAct
		Conformance: SHALL contain at least one [1..*] act (CONF:8530, CONF:15458)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_id_4_146_4-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_id_4_146_4-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_id_4_146_4-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: StudyActId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 4.146.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9210)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_entryRelationship_4_146_8-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_entryRelationship_4_146_8-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_entryRelationship_4_146_8-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::StudyAct::SeriesActEntryRelationship))
			Constraint name: StudyActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship[cda:act/cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'])=1">Error: Diagnostic Imaging Report (V3) - 4.146.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_templateId_4_146_1-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_templateId_4_146_1-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_templateId_4_146_1-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.6')
			Constraint name: StudyActTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6'">Error: Diagnostic Imaging Report (V3) - 4.146.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:10533 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.6&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_classCode_4_146_2-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_classCode_4_146_2-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_classCode_4_146_2-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: StudyActClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: Diagnostic Imaging Report (V3) - 4.146.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9207)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_moodCode_4_146_3-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_moodCode_4_146_3-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_moodCode_4_146_3-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: StudyActMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Diagnostic Imaging Report (V3) - 4.146.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:9208)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_StudyActIdsHaveRoot_4_146_9-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_StudyActIdsHaveRoot_4_146_9-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_StudyActIdsHaveRoot_4_146_9-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.id->forAll( not root.oclIsUndefined() )
			Constraint name: StudyActIdsHaveRoot
		-->
	<assert test="not(cda:id[not(@root)])">Error: Diagnostic Imaging Report (V3) - 4.146.9 StudyActIdsHaveRoot
		Conformance: ids SHALL contain exactly one [1..1] @root (CONF:9213)
		Analysis: ids SHALL contain exactly one [1..1] @root
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_StudyActNoIdExtension_4_146_10-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_StudyActNoIdExtension_4_146_10-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_StudyActNoIdExtension_4_146_10-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.id->forAll(  extension.oclIsUndefined() )
			Constraint name: StudyActNoIdExtension
		-->
	<assert test="not(cda:id[@extension])">Error: Diagnostic Imaging Report (V3) - 4.146.10 StudyActNoIdExtension
		Conformance: Such ids SHALL NOT contain [0..0] @extension (CONF:9211)
		Analysis: Such ids SHALL NOT contain [0..0] @extension
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_effectiveTime_4_146_6-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_effectiveTime_4_146_6-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_effectiveTime_4_146_6-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: StudyActEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Diagnostic Imaging Report (V3) - 4.146.6 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9216)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_text_4_146_7-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_text_4_146_7-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_text_4_146_7-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)
			Constraint name: StudyActTextReference
		-->
	<assert test="not(cda:text) or not(cda:text[not(count(cda:reference) = 1)])">Error: Diagnostic Imaging Report (V3) - 4.146.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9215)
		Analysis: text, if present, SHOULD contain zero or one [0..1] reference
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: StudyActText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: Diagnostic Imaging Report (V3) - 4.146.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9215)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReportV3_3A_StudyAct_code_4_146_5-error_mdht" see="#p-DiagnosticImagingReportV3_3A_StudyAct_code_4_146_5-error_mdht" name="p-DiagnosticImagingReportV3_3A_StudyAct_code_4_146_5-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: true
			Constraint name: StudyActCodeP
		-->
	<assert test="true()">Error: Diagnostic Imaging Report (V3) - 4.146.5 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113014&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9214)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '113014' and value.codeSystem = '1.2.840.10008.2.16.4'
			Constraint name: StudyActCode
		-->
	<assert test="cda:code and cda:code[@code = '113014' and @codeSystem = '1.2.840.10008.2.16.4']">Error: Diagnostic Imaging Report (V3) - 4.146.5 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113014&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9214)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesActEntryRelationship -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesActEntryRelationship_seriesAct_4_146_8_i-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesActEntryRelationship_seriesAct_4_146_8_i-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesActEntryRelationship_seriesAct_4_146_8_i-error_mdht">
		<!--
			UML path: /StudyAct/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship">
		<!--
			OCL: self.act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SeriesAct))
			Constraint name: StudyActSeriesActEntryRelationshipSeriesAct
		-->
	<assert test="count(cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'])=1">Error: Diagnostic Imaging Report (V3) - 4.146.8.i seriesAct
		Conformance: SHALL contain exactly one [1..1] act (CONF:9219, CONF:9220, CONF:15937)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_code_4_138_4-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_code_4_138_4-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_code_4_138_4-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: true
			Constraint name: SeriesActCodeP
		-->
	<assert test="true()">Error: Diagnostic Imaging Report (V3) - 4.138.4 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113015&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9228)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '113015' and value.codeSystem = '1.2.840.10008.2.16.4'
			Constraint name: SeriesActCode
		-->
	<assert test="cda:code and cda:code[@code = '113015' and @codeSystem = '1.2.840.10008.2.16.4']">Error: Diagnostic Imaging Report (V3) - 4.138.4 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113015&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9228)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_entryRelationship_4_138_8-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_entryRelationship_4_138_8-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_entryRelationship_4_138_8-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SeriesAct::SOPInstanceObservationEntryRelationship))
			Constraint name: SeriesActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship[cda:observation/cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8'])=1">Error: Diagnostic Imaging Report (V3) - 4.138.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_templateId_4_138_1-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_templateId_4_138_1-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_templateId_4_138_1-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.63')
			Constraint name: SeriesActTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'">Error: Diagnostic Imaging Report (V3) - 4.138.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:10918, CONF:10919 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.63&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_id_4_138_6-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_id_4_138_6-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_id_4_138_6-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: SeriesActId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 4.138.6 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9224)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_moodCode_4_138_3-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_moodCode_4_138_3-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_moodCode_4_138_3-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: SeriesActMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Diagnostic Imaging Report (V3) - 4.138.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:9223)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_SeriesActIdHasRoot_4_138_9-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_SeriesActIdHasRoot_4_138_9-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_SeriesActIdHasRoot_4_138_9-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.id->forAll( not root.oclIsUndefined() )
			Constraint name: SeriesActIdHasRoot
		-->
	<assert test="not(cda:id[not(@root)])">Error: Diagnostic Imaging Report (V3) - 4.138.9 SeriesActIdHasRoot
		Conformance: ids SHALL contain exactly one [1..1] @root (CONF:9225)
		Analysis: ids SHALL contain exactly one [1..1] @root
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_classCode_4_138_2-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_classCode_4_138_2-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_classCode_4_138_2-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: SeriesActClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: Diagnostic Imaging Report (V3) - 4.138.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9222)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_effectiveTime_4_138_5-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_effectiveTime_4_138_5-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_effectiveTime_4_138_5-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: SeriesActEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Diagnostic Imaging Report (V3) - 4.138.5 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9235)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SeriesAct_text_4_138_7-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SeriesAct_text_4_138_7-error_mdht" name="p-DiagnosticImagingReportV3_3A_SeriesAct_text_4_138_7-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: SeriesActText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: Diagnostic Imaging Report (V3) - 4.138.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9233)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservationEntryRelationship -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_138_8_i-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_138_8_i-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_138_8_i-error_mdht">
		<!--
			UML path: /SeriesAct/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship">
		<!--
			OCL: self.observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation))
			Constraint name: SeriesActSOPInstanceObservationEntryRelationshipSOPInstanceObservation
		-->
	<assert test="cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Error: Diagnostic Imaging Report (V3) - 4.138.8.i sOPInstanceObservation
		Conformance: SHALL contain at least one [1..*] observation (CONF:9237, CONF:9238, CONF:15927)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_id_4_145_5-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_id_4_145_5-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_id_4_145_5-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: SOPInstanceObservationId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 4.145.5 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9242)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_effectiveTime_4_145_4-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_effectiveTime_4_145_4-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_effectiveTime_4_145_4-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: SOPInstanceObservationEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Diagnostic Imaging Report (V3) - 4.145.4 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9250)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_145_12-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_145_12-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_145_12-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.low.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeNoLow
		-->
	<assert test="not(cda:effectiveTime) or not(cda:effectiveTime/cda:low)">Error: Diagnostic Imaging Report (V3) - 4.145.12 SOPInstanceObservationEffectiveTimeNoLow
		Conformance: The effectiveTime, if present, SHALL NOT contain [0..0] low (CONF:9252)
		Analysis: The effectiveTime, if present, SHALL NOT contain [0..0] low
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_9-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_9-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_9-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::PurposeofReferenceObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Diagnostic Imaging Report (V3) - 4.145.9 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_145_13-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_145_13-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_145_13-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.high.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeNoHigh
		-->
	<assert test="not(cda:effectiveTime) or not(cda:effectiveTime/cda:high)">Error: Diagnostic Imaging Report (V3) - 4.145.13 SOPInstanceObservationEffectiveTimeNoHigh
		Conformance: The effectiveTime, if present, SHALL NOT contain [0..0] high (CONF:9253)
		Analysis: The effectiveTime, if present, SHALL NOT contain [0..0] high
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_8-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_8-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_8-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::SOPInstanceObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Diagnostic Imaging Report (V3) - 4.145.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_code_4_145_7-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_code_4_145_7-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_code_4_145_7-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: SOPInstanceObservationCodeP
		-->
	<assert test="cda:code">Error: Diagnostic Imaging Report (V3) - 4.145.7 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:9244), which SHALL be selected from (CodeSystem: 1.2.840.10008.2.6.1 DCMUID)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '1.2.840.10008.2.6.1'
			Constraint name: SOPInstanceObservationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '1.2.840.10008.2.6.1']">Error: Diagnostic Imaging Report (V3) - 4.145.7 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:9244), which SHALL be selected from (CodeSystem: 1.2.840.10008.2.6.1 DCMUID)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_text_4_145_6-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_text_4_145_6-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_text_4_145_6-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: SOPInstanceObservationText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: Diagnostic Imaging Report (V3) - 4.145.6 text
		Conformance: SHOULD contain zero or one [0..1] text (CONF:9246)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_10-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_10-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_10-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::ReferencedFramesObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Diagnostic Imaging Report (V3) - 4.145.10 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_templateId_4_145_1-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_templateId_4_145_1-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_templateId_4_145_1-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.8')
			Constraint name: SOPInstanceObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8'">Error: Diagnostic Imaging Report (V3) - 4.145.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.8&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_moodCode_4_145_3-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_moodCode_4_145_3-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_moodCode_4_145_3-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: SOPInstanceObservationMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Diagnostic Imaging Report (V3) - 4.145.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_classCode_4_145_2-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_classCode_4_145_2-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_classCode_4_145_2-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::DGIMG
			Constraint name: SOPInstanceObservationClassCode
		-->
	<assert test="@classCode = 'DGIMG'">Error: Diagnostic Imaging Report (V3) - 4.145.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;DGIMG&quot;  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9240)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_145_11-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_145_11-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_145_11-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies not self.effectiveTime.value.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeHasValue
		-->
	<assert test="not(cda:effectiveTime) or cda:effectiveTime/@value">Error: Diagnostic Imaging Report (V3) - 4.145.11 SOPInstanceObservationEffectiveTimeHasValue
		Conformance: The effectiveTime, if present, SHALL contain exactly one [1..1] @value (CONF:9251)
		Analysis: The effectiveTime, if present, SHALL contain exactly one [1..1] @value
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservationEntryRelationship -->

<pattern id="p-DiagnosticImagingReportV3_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_145_8_i-error_mdht" see="#p-DiagnosticImagingReportV3_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_145_8_i-error_mdht" name="p-DiagnosticImagingReportV3_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_145_8_i-error_mdht">
		<!--
			UML path: /SOPInstanceObservation/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']/cda:entryRelationship">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation))->size() >= 0
			Constraint name: SOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 4.145.8.i sOPInstanceObservation
		Conformance: MAY contain zero or more [0..*] observation (CONF:9254, CONF:9255, CONF:9256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-DiagnosticImagingReportV3_1A_RecordTarget_patientRole_2_7_5_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_RecordTarget_patientRole_2_7_5_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_RecordTarget_patientRole_2_7_5_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget
			UML root path: /USRealmHeader2/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: Diagnostic Imaging Report (V3) - 2.7.5.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:1198-5267)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReportV3_1A_PatientRole_id_2_7_5_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_PatientRole_id_2_7_5_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_PatientRole_id_2_7_5_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5268, R2.1=CONF:1198-5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReportV3_1A_PatientRole_providerOrganization_2_7_5_i_e-error_mdht" see="#p-DiagnosticImagingReportV3_1A_PatientRole_providerOrganization_2_7_5_i_e-error_mdht" name="p-DiagnosticImagingReportV3_1A_PatientRole_providerOrganization_2_7_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::ProviderOrganization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization
		-->
	<assert test="count(cda:providerOrganization) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e providerOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReportV3_1A_PatientRole_telecom_2_7_5_i_c-error_mdht" see="#p-DiagnosticImagingReportV3_1A_PatientRole_telecom_2_7_5_i_c-error_mdht" name="p-DiagnosticImagingReportV3_1A_PatientRole_telecom_2_7_5_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTelecom
		-->
	<assert test="cda:telecom">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.c telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5280, R2.1=CONF:1198-5280)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReportV3_1A_PatientRole_patient_2_7_5_i_e-error_mdht" see="#p-DiagnosticImagingReportV3_1A_PatientRole_patient_2_7_5_i_e-error_mdht" name="p-DiagnosticImagingReportV3_1A_PatientRole_patient_2_7_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:1198-5283)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReportV3_1A_PatientRole_addr_2_7_5_i_b-error_mdht" see="#p-DiagnosticImagingReportV3_1A_PatientRole_addr_2_7_5_i_b-error_mdht" name="p-DiagnosticImagingReportV3_1A_PatientRole_addr_2_7_5_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleAddr
		-->
	<assert test="cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.b addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5271, R2.1=CONF:1198-5271)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_birthTime_2_7_5_i_e_8-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_birthTime_2_7_5_i_e_8-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_birthTime_2_7_5_i_e_8-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.birthTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		-->
	<assert test="cda:birthTime">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.8 birthTime
		Conformance: SHALL contain exactly one [1..1] birthTime (CONF:1198-5298)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_birthplace_2_7_5_i_e_11-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_birthplace_2_7_5_i_e_11-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_birthplace_2_7_5_i_e_11-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		-->
	<assert test="count(cda:birthplace) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.11 birthplace
		Conformance: MAY contain zero or one [0..1] birthplace (CONF:1198-5395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_languageCommunication_2_7_5_i_e_10-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_languageCommunication_2_7_5_i_e_10-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_languageCommunication_2_7_5_i_e_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.10 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:1198-5406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_name_2_7_5_i_e_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_name_2_7_5_i_e_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_name_2_7_5_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientName
		-->
	<assert test="cda:name">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5284, CONF:10411, R2.1=CONF:1198-5284)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_guardian_2_7_5_i_e_9-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_guardian_2_7_5_i_e_9-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_guardian_2_7_5_i_e_9-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.9 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:1198-5325)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_religiousAffiliationCode_2_7_5_i_e_5-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_religiousAffiliationCode_2_7_5_i_e_5-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_religiousAffiliationCode_2_7_5_i_e_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.5 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode, which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 DYNAMIC (CONF:5317, R2.1=CONF:1198-5317)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined() and self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode and cda:religiousAffiliationCode[@codeSystem = '2.16.840.1.113883.5.1076' and @code]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.5 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode, which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 DYNAMIC (CONF:5317, R2.1=CONF:1198-5317)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_raceCode_2_7_5_i_e_6-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_raceCode_2_7_5_i_e_6-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_raceCode_2_7_5_i_e_6-error_mdht">
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
	<assert test="cda:raceCode and cda:raceCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '1002-5' or @code = '2028-9' or @code = '2054-5' or @code = '2076-8' or @code = '2106-3')]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.6 raceCode
		Conformance: SHALL contain exactly one [1..1] raceCode, which SHALL be selected from ValueSet Race Category Excluding Nulls 2.16.840.1.113883.3.2074.1.1.3 DYNAMIC (CONF:1198-5322)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.raceCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		-->
	<assert test="cda:raceCode">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.6 raceCode
		Conformance: SHALL contain exactly one [1..1] raceCode, which SHALL be selected from ValueSet Race Category Excluding Nulls 2.16.840.1.113883.3.2074.1.1.3 DYNAMIC (CONF:1198-5322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_ethnicGroupCode_2_7_5_i_e_7-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_ethnicGroupCode_2_7_5_i_e_7-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_ethnicGroupCode_2_7_5_i_e_7-error_mdht">
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
	<assert test="cda:ethnicGroupCode and cda:ethnicGroupCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '2135-2' or @code = '2186-5')]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.7 ethnicGroupCode
		Conformance: SHALL contain exactly one [1..1] ethnicGroupCode, which SHALL be selected from ValueSet EthnicityGroup 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:1198-5323)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.ethnicGroupCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		-->
	<assert test="cda:ethnicGroupCode">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.7 ethnicGroupCode
		Conformance: SHALL contain exactly one [1..1] ethnicGroupCode, which SHALL be selected from ValueSet EthnicityGroup 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:1198-5323)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_administrativeGenderCode_2_7_5_i_e_2-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_administrativeGenderCode_2_7_5_i_e_2-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_administrativeGenderCode_2_7_5_i_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP
		-->
	<assert test="true()">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.2 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394, R2.1=CONF:1198-6394)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.administrativeGenderCode.oclIsUndefined() and self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode
		-->
	<assert test="cda:administrativeGenderCode and cda:administrativeGenderCode[@codeSystem = '2.16.840.1.113883.5.1' and (@code = 'F' or @code = 'M' or @code = 'UN')]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.2 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394, R2.1=CONF:1198-6394)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_maritalStatusCode_2_7_5_i_e_4-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_maritalStatusCode_2_7_5_i_e_4-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_maritalStatusCode_2_7_5_i_e_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode, which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 DYNAMIC (CONF:5303, R2.1=CONF:1198-5303)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined() and self.maritalStatusCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode and cda:maritalStatusCode[@codeSystem = '2.16.840.1.113883.5.2' and (@code = 'A' or @code = 'D' or @code = 'I' or @code = 'L' or @code = 'M' or @code = 'P' or @code = 'S' or @code = 'T' or @code = 'W')]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode, which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 DYNAMIC (CONF:5303, R2.1=CONF:1198-5303)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReportV3_1A_Patient_sDTCRaceCode_2_7_5_i_e_7-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Patient_sDTCRaceCode_2_7_5_i_e_7-error_mdht" name="p-DiagnosticImagingReportV3_1A_Patient_sDTCRaceCode_2_7_5_i_e_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCRaceCode->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or ext:sDTCRaceCode">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.7 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263, R2.1=CONF:1198-7263)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or not(ext:sDTCRaceCode[not(. and @codeSystem = '2.16.840.1.113883.6.238' and @code)])">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.7 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263, R2.1=CONF:1198-7263)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReportV3_1A_Guardian_telecom_2_7_5_i_e_9_iii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Guardian_telecom_2_7_5_i_e_9_iii-error_mdht" name="p-DiagnosticImagingReportV3_1A_Guardian_telecom_2_7_5_i_e_9_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.9.iii telecom
		Conformance: SHOULD contain zero or more [0..*] telecom (CONF:1198-5382)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReportV3_1A_Guardian_code_2_7_5_i_e_9_ii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Guardian_code_2_7_5_i_e_9_ii-error_mdht" name="p-DiagnosticImagingReportV3_1A_Guardian_code_2_7_5_i_e_9_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-5326)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-5326)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReportV3_1A_Guardian_guardianPerson_2_7_5_i_e_9_iv-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Guardian_guardianPerson_2_7_5_i_e_9_iv-error_mdht" name="p-DiagnosticImagingReportV3_1A_Guardian_guardianPerson_2_7_5_i_e_9_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::Person))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson
		-->
	<assert test="count(cda:guardianPerson)=1">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.9.iv guardianPerson
		Conformance: SHALL contain exactly one [1..1] guardianPerson (CONF:5385, R2.1=CONF:1198-5385)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReportV3_1A_Guardian_addr_2_7_5_i_e_9_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Guardian_addr_2_7_5_i_e_9_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_Guardian_addr_2_7_5_i_e_9_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.9.i addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:5359, CONF:10413, R2.1=CONF:1198-5359)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReportV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.6.12.i.d.9.iii.a use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7993, R2.1=CONF:1198-7993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_7_5_i_b_7-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_7_5_i_b_7-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_7_5_i_b_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		-->
	<assert test="@nullFlavor or count(cda:streetAddressLine) &gt;= 1 and count(cda:streetAddressLine) &lt;= 4">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.b.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		Conformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: SHALL contain at least one and not more than 4 streetAddressLine
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: Diagnostic Imaging Report (V3) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: Diagnostic Imaging Report (V3) - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: Diagnostic Imaging Report (V3) - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReportV3_1A_Person_name_2_7_5_i_e_9_iv_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Person_name_2_7_5_i_e_9_iv_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_Person_name_2_7_5_i_e_9_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian/guardianPerson
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian/guardianPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName
		-->
	<assert test="cda:name">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.9.iv.a name
		Conformance: SHALL contain at least one [1..*] name (CONF:5386, R2.1=CONF:1198-5386)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReportV3_1A_LanguageCommunication_preferenceInd_2_7_5_i_e_10_iv-error_mdht" see="#p-DiagnosticImagingReportV3_1A_LanguageCommunication_preferenceInd_2_7_5_i_e_10_iv-error_mdht" name="p-DiagnosticImagingReportV3_1A_LanguageCommunication_preferenceInd_2_7_5_i_e_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.10.iv preferenceInd
		Conformance: SHOULD contain zero or one [0..1] preferenceInd (CONF:1198-5414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReportV3_1A_LanguageCommunication_modeCode_2_7_5_i_e_10_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_LanguageCommunication_modeCode_2_7_5_i_e_10_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_LanguageCommunication_modeCode_2_7_5_i_e_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.10.i modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409, R2.1=CONF:1198-5409)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode and cda:modeCode[@codeSystem = '2.16.840.1.113883.5.60' and (@code = 'ESGN' or @code = 'ESP' or @code = 'EWR' or @code = 'RSGN' or @code = 'RSP' or @code = 'RWR')]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.10.i modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409, R2.1=CONF:1198-5409)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReportV3_1A_LanguageCommunication_proficiencyLevelCode_2_7_5_i_e_10_ii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_LanguageCommunication_proficiencyLevelCode_2_7_5_i_e_10_ii-error_mdht" name="p-DiagnosticImagingReportV3_1A_LanguageCommunication_proficiencyLevelCode_2_7_5_i_e_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.10.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 DYNAMIC (CONF:9965, R2.1=CONF:1198-9965)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined() and self.proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.proficiencyLevelCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode and cda:proficiencyLevelCode[@codeSystem = '2.16.840.1.113883.5.61' and (@code = 'E' or @code = 'F' or @code = 'G' or @code = 'P')]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.10.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 DYNAMIC (CONF:9965, R2.1=CONF:1198-9965)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReportV3_1A_LanguageCommunication_languageCode_2_7_5_i_e_10_iii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_LanguageCommunication_languageCode_2_7_5_i_e_10_iii-error_mdht" name="p-DiagnosticImagingReportV3_1A_LanguageCommunication_languageCode_2_7_5_i_e_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.10.iii languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:1198-5407)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.10.iii languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:1198-5407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TS -->

<pattern id="p-DiagnosticImagingReportV3_1A_TS_value_2_7_5_i_e_8_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TS_value_2_7_5_i_e_8_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_TS_value_2_7_5_i_e_8_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthTime
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthTime
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (true ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		-->
	<assert test="@nullFlavor or true()">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.8.i value
		Conformance: contain exactly one [1..1] value
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Birthplace -->

<pattern id="p-DiagnosticImagingReportV3_1A_Birthplace_place_2_7_5_i_e_11_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Birthplace_place_2_7_5_i_e_11_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_Birthplace_place_2_7_5_i_e_11_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">
		<!--
			OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Birthplace::Place))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
		-->
	<assert test="count(cda:place)=1">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.11.i place
		Conformance: SHALL contain exactly one [1..1] place (CONF:1198-5396)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Place -->

<pattern id="p-DiagnosticImagingReportV3_1A_Place_addr_2_7_5_i_e_11_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Place_addr_2_7_5_i_e_11_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_Place_addr_2_7_5_i_e_11_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace/place
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace/place
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr
		-->
	<assert test="cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.11.i.a addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5397, R2.1=CONF:1198-5397)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNamePrefix
		-->
	<assert test="@nullFlavor or not(cda:prefix and cda:prefix[not(@nullFlavor)]) or cda:prefix">Error: Diagnostic Imaging Report (V3) - 2.19.5.ii.b.1.iv prefix
		Conformance: MAY contain zero or more [0..*] prefix (CONF:7155, R2.1=CONF:81-7155)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameGiven
		-->
	<assert test="@nullFlavor or cda:given">Error: Diagnostic Imaging Report (V3) - 2.19.5.ii.b.1.iii given
		Conformance: SHALL contain at least one [1..*] given (CONF:7157, R2.1=CONF:81-7157)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameFamily
		-->
	<assert test="@nullFlavor or count(cda:family) = 1">Error: Diagnostic Imaging Report (V3) - 2.19.5.ii.b.1.ii family
		Conformance: SHALL contain exactly one [1..1] family (CONF:7159, R2.1=CONF:81-7159)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameSuffix
		-->
	<assert test="@nullFlavor or not(cda:suffix and cda:suffix[not(@nullFlavor)]) or count(cda:suffix) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.19.5.ii.b.1.v suffix
		Conformance: MAY contain zero or one [0..1] suffix (CONF:7161, R2.1=CONF:81-7161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL: getText(true)=''
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		-->
	<assert test="string(@id=true()// text()) = ''">Error: Diagnostic Imaging Report (V3) - 2.10 USRealmHeader
		Conformance: 
		Analysis: US Realm Patient Name SHALL NOT have mixed content except for white space
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReportV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'A' or . = 'ABC' or . = 'ASGN' or . = 'C' or . = 'I' or . = 'IDE' or . = 'L' or . = 'P' or . = 'PHON' or . = 'R' or . = 'SNDX' or . = 'SRCH' or . = 'SYL')])">Error: Diagnostic Imaging Report (V3) - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_ProviderOrganization_id_2_7_5_i_e_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ProviderOrganization_id_2_7_5_i_e_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_ProviderOrganization_id_2_7_5_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5417, R2.1=CONF:1198-5417)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_ProviderOrganization_addr_2_7_5_i_e_4-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ProviderOrganization_addr_2_7_5_i_e_4-error_mdht" name="p-DiagnosticImagingReportV3_1A_ProviderOrganization_addr_2_7_5_i_e_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr
		-->
	<assert test="cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.4 addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5422, R2.1=CONF:1198-5422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_ProviderOrganization_name_2_7_5_i_e_2-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ProviderOrganization_name_2_7_5_i_e_2-error_mdht" name="p-DiagnosticImagingReportV3_1A_ProviderOrganization_name_2_7_5_i_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName
		-->
	<assert test="cda:name">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.2 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5419, R2.1=CONF:1198-5419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_7_5_i_e_5-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_7_5_i_e_5-error_mdht" name="p-DiagnosticImagingReportV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_7_5_i_e_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.5 GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		Conformance: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996, R2.1=CONF:1198-16820)
		Analysis: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_ProviderOrganization_telecom_2_7_5_i_e_3-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ProviderOrganization_telecom_2_7_5_i_e_3-error_mdht" name="p-DiagnosticImagingReportV3_1A_ProviderOrganization_telecom_2_7_5_i_e_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.3 telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5420, R2.1=CONF:1198-5420)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_5_i_e_3_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TEL_use_2_7_5_i_e_3_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_5_i_e_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization/telecom
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e.3.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7994, CONF:1198-7994)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_5_i_c_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TEL_use_2_7_5_i_c_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_5_i_c_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/telecom
			UML root path: /USRealmHeader2/recordTarget/patientRole/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.c.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:5375, R2.1=CONF:1198-5375)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-DiagnosticImagingReportV3_1A_DataEnterer_assignedEntity_2_7_6_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_DataEnterer_assignedEntity_2_7_6_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_DataEnterer_assignedEntity_2_7_6_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer
			UML root path: /USRealmHeader2/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeader2::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Diagnostic Imaging Report (V3) - 2.7.6.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_6_i_e-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_6_i_e-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_6_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Diagnostic Imaging Report (V3) - 2.7.6.i.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5469, R2.1=CONF:1198-5469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_6_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_6_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_6_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.6.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5443, R2.1=CONF:1198-5443)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_6_i_c-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_6_i_c-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_6_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.6.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5460, R2.1=CONF:1198-5460)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_6_i_d-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_6_i_d-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Diagnostic Imaging Report (V3) - 2.7.6.i.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5466, R2.1=CONF:1198-5466)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_6_i_d-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_6_i_d-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Diagnostic Imaging Report (V3) - 2.7.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_6_i_d_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TEL_use_2_7_6_i_d_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_6_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.6.i.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7996, R2.1=CONF:1198-7996)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReportV3_1A_Person_name_2_7_6_i_e_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Person_name_2_7_6_i_e_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_Person_name_2_7_6_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Diagnostic Imaging Report (V3) - 2.7.6.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470, R2.1=CONF:1198-5470)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-DiagnosticImagingReportV3_1A_Author_assignedAuthor_2_7_7_ii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Author_assignedAuthor_2_7_7_ii-error_mdht" name="p-DiagnosticImagingReportV3_1A_Author_assignedAuthor_2_7_7_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::USRealmHeader2::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:1198-5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-DiagnosticImagingReportV3_1A_Author_time_2_7_7_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Author_time_2_7_7_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_Author_time_2_7_7_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorTime
		-->
	<assert test="cda:time">Error: Diagnostic Imaging Report (V3) - 2.7.7.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5445, R2.1=CONF:1198-5445)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedAuthor_addr_2_7_7_ii_c-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedAuthor_addr_2_7_7_ii_c-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedAuthor_addr_2_7_7_ii_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAddr
		-->
	<assert test="cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5452, R2.1=CONF:1198-5452)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedAuthor_code_2_7_7_ii_d-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedAuthor_code_2_7_7_ii_d-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedAuthor_code_2_7_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedAuthor_telecom_2_7_7_ii_d-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedAuthor_telecom_2_7_7_ii_d-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedAuthor_telecom_2_7_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTelecom
		-->
	<assert test="cda:telecom">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5428, R2.1=CONF:1198-5428)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedAuthor_id_2_7_7_ii_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedAuthor_id_2_7_7_ii_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedAuthor_id_2_7_7_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5449, R2.1=CONF:1198-5449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-DiagnosticImagingReportV3_1A_AuthoringDevice_softwareName_2_7_7_ii_e_2-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AuthoringDevice_softwareName_2_7_7_ii_e_2-error_mdht" name="p-DiagnosticImagingReportV3_1A_AuthoringDevice_softwareName_2_7_7_ii_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.softwareName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName
		-->
	<assert test="cda:softwareName">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.e.2 softwareName
		Conformance: SHALL contain exactly one [1..1] softwareName (CONF:16785, R2.1=CONF:1198-16785)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-DiagnosticImagingReportV3_1A_AuthoringDevice_manufacturerModelName_2_7_7_ii_e_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AuthoringDevice_manufacturerModelName_2_7_7_ii_e_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_AuthoringDevice_manufacturerModelName_2_7_7_ii_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.manufacturerModelName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName
		-->
	<assert test="cda:manufacturerModelName">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.e.1 manufacturerModelName
		Conformance: SHALL contain exactly one [1..1] manufacturerModelName (CONF:16784, R2.1=CONF:1198-16784)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_7_ii_d_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TEL_use_2_7_7_ii_d_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_7_ii_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/telecom
			UML root path: /USRealmHeader2/author/assignedAuthor/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7995, R2.1=CONF:1198-7995)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReportV3_1A_Person_name_2_7_7_ii_f_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Person_name_2_7_7_ii_f_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_Person_name_2_7_7_ii_f_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedPerson
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorPersonName
		-->
	<assert test="cda:name">Error: Diagnostic Imaging Report (V3) - 2.7.7.ii.f.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:16789, R2.1=CONF:1198-16789)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-DiagnosticImagingReportV3_1A_Custodian_assignedCustodian_2_7_8_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Custodian_assignedCustodian_2_7_8_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_Custodian_assignedCustodian_2_7_8_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian
			UML root path: /USRealmHeader2/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodian
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: Diagnostic Imaging Report (V3) - 2.7.8.i assignedCustodian
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:5520, R2.1=CONF:1198-5520)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedCustodian_representedCustodianOrganization_2_7_8_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedCustodian_representedCustodianOrganization_2_7_8_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedCustodian_representedCustodianOrganization_2_7_8_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian
			UML root path: /USRealmHeader2/custodian/assignedCustodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: Diagnostic Imaging Report (V3) - 2.7.8.i.a representedCustodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:5521, R2.1=CONF:1198-5521)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_CustodianOrganization_addr_2_7_8_i_a_4-error_mdht" see="#p-DiagnosticImagingReportV3_1A_CustodianOrganization_addr_2_7_8_i_a_4-error_mdht" name="p-DiagnosticImagingReportV3_1A_CustodianOrganization_addr_2_7_8_i_a_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr
		-->
	<assert test="cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.8.i.a.4 addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5559, R2.1=CONF:1198-5559)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_CustodianOrganization_name_2_7_8_i_a_2-error_mdht" see="#p-DiagnosticImagingReportV3_1A_CustodianOrganization_name_2_7_8_i_a_2-error_mdht" name="p-DiagnosticImagingReportV3_1A_CustodianOrganization_name_2_7_8_i_a_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.name.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName
		-->
	<assert test="cda:name">Error: Diagnostic Imaging Report (V3) - 2.7.8.i.a.2 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5524, R2.1=CONF:1198-5524)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_CustodianOrganization_telecom_2_7_8_i_a_3-error_mdht" see="#p-DiagnosticImagingReportV3_1A_CustodianOrganization_telecom_2_7_8_i_a_3-error_mdht" name="p-DiagnosticImagingReportV3_1A_CustodianOrganization_telecom_2_7_8_i_a_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.telecom.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: Diagnostic Imaging Report (V3) - 2.7.8.i.a.3 telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:5525, R2.1=CONF:1198-5525)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_CustodianOrganization_ProviderOrganization_2_7_5_i_e-error_mdht" see="#p-DiagnosticImagingReportV3_1A_CustodianOrganization_ProviderOrganization_2_7_5_i_e-error_mdht" name="p-DiagnosticImagingReportV3_1A_CustodianOrganization_ProviderOrganization_2_7_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id SHOULD include zero or one [0..1] @root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReportV3_1A_CustodianOrganization_id_2_7_8_i_a_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_CustodianOrganization_id_2_7_8_i_a_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_CustodianOrganization_id_2_7_8_i_a_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.8.i.a.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5522, R2.1=CONF:1198-5522)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_8_i_a_3_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TEL_use_2_7_8_i_a_3_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_8_i_a_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization/telecom
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.8.i.a.3.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7998, R2.1=CONF:1198-7998)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-DiagnosticImagingReportV3_1A_LegalAuthenticator_time_2_7_10_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_LegalAuthenticator_time_2_7_10_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_LegalAuthenticator_time_2_7_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorTime
		-->
	<assert test="cda:time">Error: Diagnostic Imaging Report (V3) - 2.7.10.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5580, R2.1=CONF:1198-5580)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-DiagnosticImagingReportV3_1A_LegalAuthenticator_assignedEntity_2_7_10_iv-error_mdht" see="#p-DiagnosticImagingReportV3_1A_LegalAuthenticator_assignedEntity_2_7_10_iv-error_mdht" name="p-DiagnosticImagingReportV3_1A_LegalAuthenticator_assignedEntity_2_7_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5585, R2.1=CONF:1198-5585)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-DiagnosticImagingReportV3_1A_LegalAuthenticator_signatureCode_2_7_10_ii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_LegalAuthenticator_signatureCode_2_7_10_ii-error_mdht" name="p-DiagnosticImagingReportV3_1A_LegalAuthenticator_signatureCode_2_7_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: Diagnostic Imaging Report (V3) - 2.7.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: Diagnostic Imaging Report (V3) - 2.7.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-DiagnosticImagingReportV3_1A_LegalAuthenticator_sDTCSignatureText_2_7_10_iii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_LegalAuthenticator_sDTCSignatureText_2_7_10_iii-error_mdht" name="p-DiagnosticImagingReportV3_1A_LegalAuthenticator_sDTCSignatureText_2_7_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2LegalAuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: Diagnostic Imaging Report (V3) - 2.7.10.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30810)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_ProviderOrganization_2_7_5_i_e-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_ProviderOrganization_2_7_5_i_e-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_ProviderOrganization_2_7_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Diagnostic Imaging Report (V3) - 2.7.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id MAY contain zero or one [0..1] @root=&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_10_iv_e-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_10_iv_e-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_10_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5597, R2.1=CONF:1198-5597)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_10_iv_d-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_10_iv_d-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_10_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5595, R2.1=CONF:1198-5595)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_10_iv_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_10_iv_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_10_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5586, R2.1=CONF:1198-5586)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_10_iv_b-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_10_iv_b-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_10_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_10_iv_c-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_10_iv_c-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_10_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5589, R2.1=CONF:1198-5589)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_10_iv_d_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TEL_use_2_7_10_iv_d_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_10_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7999, R2.1=CONF:1198-7999)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReportV3_1A_Person_name_2_7_10_iv_e_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Person_name_2_7_10_iv_e_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_Person_name_2_7_10_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Diagnostic Imaging Report (V3) - 2.7.10.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5598, R2.1=CONF:1198-5598)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-DiagnosticImagingReportV3_1A_Authenticator_sDTCSignatureText_2_7_11_iii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Authenticator_sDTCSignatureText_2_7_11_iii-error_mdht" name="p-DiagnosticImagingReportV3_1A_Authenticator_sDTCSignatureText_2_7_11_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2AuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: Diagnostic Imaging Report (V3) - 2.7.11.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30811)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-DiagnosticImagingReportV3_1A_Authenticator_time_2_7_11_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Authenticator_time_2_7_11_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_Authenticator_time_2_7_11_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorTime
		-->
	<assert test="cda:time">Error: Diagnostic Imaging Report (V3) - 2.7.11.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5608, R2.1=CONF:1198-5608)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-DiagnosticImagingReportV3_1A_Authenticator_assignedEntity_2_7_11_iv-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Authenticator_assignedEntity_2_7_11_iv-error_mdht" name="p-DiagnosticImagingReportV3_1A_Authenticator_assignedEntity_2_7_11_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5612, R2.1=CONF:1198-5612)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-DiagnosticImagingReportV3_1A_Authenticator_signatureCode_2_7_11_ii-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Authenticator_signatureCode_2_7_11_ii-error_mdht" name="p-DiagnosticImagingReportV3_1A_Authenticator_signatureCode_2_7_11_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: Diagnostic Imaging Report (V3) - 2.7.11.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5610, R2.1=CONF:1198-5610)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5611, R2.1=CONF:1198-5611)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: Diagnostic Imaging Report (V3) - 2.7.11.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5610, R2.1=CONF:1198-5610)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5611, R2.1=CONF:1198-5611)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_11_iv_d-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_11_iv_d-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_11_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5622, R2.1=CONF:1198-5622)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_11_iv_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_11_iv_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_11_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5613, R2.1=CONF:1198-5613)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_11_iv_c-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_11_iv_c-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_11_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5616, R2.1=CONF:1198-5616)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_11_iv_b-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_11_iv_b-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_11_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825, R2.1=CONF:1198-16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826, R2.1=CONF:1198-16826)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825, R2.1=CONF:1198-16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826, R2.1=CONF:1198-16826)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_11_iv_e-error_mdht" see="#p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_11_iv_e-error_mdht" name="p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_11_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5624, R2.1=CONF:1198-5624)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_11_iv_d_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_TEL_use_2_7_11_iv_d_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_TEL_use_2_7_11_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/authenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:8000, R2.1=CONF:1198-8000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReportV3_1A_Person_name_2_7_11_iv_e_1-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Person_name_2_7_11_iv_e_1-error_mdht" name="p-DiagnosticImagingReportV3_1A_Person_name_2_7_11_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/authenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Diagnostic Imaging Report (V3) - 2.7.11.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5625, R2.1=CONF:1198-5625)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-DiagnosticImagingReportV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" name="p-DiagnosticImagingReportV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: Diagnostic Imaging Report (V3) - 2.6.21 ParticipantSupport
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: SHALL contain associatedEntity/associatedPerson AND/OR associatedEntity/scopingOrganization
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-DiagnosticImagingReportV3_1A_ParticipantSupport_time_2_7_15_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_ParticipantSupport_time_2_7_15_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_ParticipantSupport_time_2_7_15_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: Diagnostic Imaging Report (V3) - 2.7.15.i time
		Conformance: MAY contain zero or one [0..1] time (CONF:10004, R2.1=CONF:1198-10004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-DiagnosticImagingReportV3_1A_Authorization_consent_2_7_17_i-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Authorization_consent_2_7_17_i-error_mdht" name="p-DiagnosticImagingReportV3_1A_Authorization_consent_2_7_17_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization
			UML root path: /USRealmHeader2/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: self.consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(consol::GeneralHeaderConstraints::Authorization::Consent))
			Constraint name: GeneralHeaderConstraintsAuthorizationConsent
		-->
	<assert test="count(cda:consent)=1">Error: Diagnostic Imaging Report (V3) - 2.7.17.i consent
		Conformance: SHALL contain exactly one [1..1] consent (CONF:16793, R2.1=CONF:1198-16793)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-DiagnosticImagingReportV3_1A_Consent_id_2_7_17_i_a-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Consent_id_2_7_17_i_a-error_mdht" name="p-DiagnosticImagingReportV3_1A_Consent_id_2_7_17_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Diagnostic Imaging Report (V3) - 2.7.17.i.a id
		Conformance: MAY contain zero or more [0..*] id (CONF:16794, R2.1=CONF:1198-16794)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-DiagnosticImagingReportV3_1A_Consent_code_2_7_17_i_b-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Consent_code_2_7_17_i_b-error_mdht" name="p-DiagnosticImagingReportV3_1A_Consent_code_2_7_17_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Diagnostic Imaging Report (V3) - 2.7.17.i.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16795, R2.1=CONF:1198-16795)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-DiagnosticImagingReportV3_1A_Consent_statusCode_2_7_17_i_c-error_mdht" see="#p-DiagnosticImagingReportV3_1A_Consent_statusCode_2_7_17_i_c-error_mdht" name="p-DiagnosticImagingReportV3_1A_Consent_statusCode_2_7_17_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Diagnostic Imaging Report (V3) - 2.7.17.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797, R2.1=CONF:1198-16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798, R2.1=CONF:1198-16798)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Diagnostic Imaging Report (V3) - 2.7.17.i.c statusCode
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
	<assert test="/cda:ClinicalDocument/cda:id">Cannot find context /cda:ClinicalDocument/cda:id</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf/cda:order</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.1']">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.1"]</assert>
	<assert test="/cda:ClinicalDocument/cda:relatedDocument">Cannot find context /cda:ClinicalDocument/cda:relatedDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument">Cannot find context /cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']/cda:assignedEntity/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.2"]/cda:assignedEntity/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component">Cannot find context /cda:ClinicalDocument/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.3']/cda:subject">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:subject/cda:relatedSubject[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.3"]/cda:subject</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4']/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.4"]/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.4']/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:author/cda:observerContext[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.4"]/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.6.2.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component">Cannot find context /cda:ClinicalDocument/cda:component</assert>
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
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization">Cannot find context /cda:ClinicalDocument/cda:authorization</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_languageCode_2_7_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_inFulfillmentOf_2_7_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_author_2_7_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_id_2_7_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_legalAuthenticator_2_7_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_title_2_7_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_code_2_7_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_supportParticipant_2_7_15-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_informant_2_7_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_recordTarget_2_7_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_dataEnterer_2_7_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_componentOf_2_7_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_effectiveTime_2_7_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_confidentialityCode_2_7_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_realmCode_2_7_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_setId_2_7_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_authenticator_2_7_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_versionNumber_2_7_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_participant_2_7_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_documentationOf_2_7_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_custodian_2_7_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_authorization_2_7_17-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_relatedDocument_2_7_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_component2_2_7_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_DiagnosticImagingReportV3_component_2_7_13-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_templateId_2_7_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_typeId_2_7_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DiagnosticImagingReportV3_informationRecipient_2_7_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_II_root_2_7_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Participant_associatedEntity_2_7_7_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssociatedEntity_associatedPerson_2_7_7_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Person_name_2_7_7_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_InFulfillmentOf_order_2_7_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Order_id_2_7_8_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DocumentationOf_serviceEvent_2_7_9_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ServiceEvent_code_2_7_9_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ServiceEvent_physicianReadingStudyPerformer2_2_7_9_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ServiceEvent_classCode_2_7_9_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ServiceEvent_id_2_7_9_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_PhysicianReadingStudyPerformer2_templateId_2_7_9_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_RelatedDocument_parentDocument_2_7_10_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ParentDocument_id_2_7_10_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_ComponentOf_encompassingEncounter_2_7_11_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_EncompassingEncounter_responsibleParty_2_7_11_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_EncompassingEncounter_physicianofRecordParticipant2_2_7_11_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_EncompassingEncounter_effectiveTime_2_7_11_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_EncompassingEncounter_id_2_7_11_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_ResponsibleParty_assignedEntity_2_7_11_i_c_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_typeCode_2_7_11_i_d_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_templateId_2_7_11_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_PhysicianofRecordParticipant2_assignedEntity_2_7_11_i_d_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_AssignedEntity_assignedPerson_2_7_11_i_d_3_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_AssignedEntity_code_2_7_11_i_d_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_AssignedEntity_id_2_7_11_i_d_3_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_AssignedEntity_representedOrganization_2_7_11_i_d_3_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_AssignedPerson_name_2_7_11_i_d_3_iii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_RepresentedOrganization_name_2_7_11_i_d_3_iv_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Component_structuredBody_2_7_12_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_StructuredBody_component3_2_7_12_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Component3_section_2_7_12_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_Section_entry_2_7_12_i_a_1_vi-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Section_text_2_7_12_i_a_1_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Section_subject_2_7_12_i_a_1_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Section_author_2_7_12_i_a_1_v-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Section_code_2_7_12_i_a_1_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Section_title_2_7_12_i_a_1_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Subject_fetusSubjectContext_2_7_12_i_a_1_iv_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_FetusSubjectContext_templateId_2_7_12_i_a_1_iv_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_FetusSubjectContext_subject_2_7_12_i_a_1_iv_a_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_FetusSubjectContext_code_2_7_12_i_a_1_iv_a_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_SubjectPerson_name_2_7_12_i_a_1_iv_a_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_ObserverContext_assignedAuthor_2_7_12_i_a_1_v_a_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_ObserverContext_templateId_2_7_12_i_a_1_v_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_AssignedAuthor_id_2_7_12_i_a_1_v_a_2_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_AssignedAuthor_ObserverContextAssignedAuthorHasAssignedPersonorAuthoringDevice_2_7_12_i_a_1_v_a_2_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_ProcedureContext_effectiveTime_4_123_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_ProcedureContext_classCode_4_123_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_ProcedureContext_moodCode_4_123_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_ProcedureContext_templateId_4_123_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_ProcedureContext_code_4_123_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Component_structuredBody_2_7_13_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Component_findingsSection_2_7_13_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_FindingsSection_templateId_3_32_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_Component_dICOMObjectCatalogSection_2_7_13_i_b_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_DICOMObjectCatalogSection_templateId_3_21_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_2_DICOMObjectCatalogSection_code_3_21_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_DICOMObjectCatalogSection_entry_3_21_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyActEntry_studyAct_3_21_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_id_4_146_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_entryRelationship_4_146_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_templateId_4_146_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_classCode_4_146_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_moodCode_4_146_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_StudyActIdsHaveRoot_4_146_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_StudyActNoIdExtension_4_146_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_effectiveTime_4_146_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_text_4_146_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_StudyAct_code_4_146_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesActEntryRelationship_seriesAct_4_146_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_code_4_138_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_entryRelationship_4_138_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_templateId_4_138_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_id_4_138_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_moodCode_4_138_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_SeriesActIdHasRoot_4_138_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_classCode_4_138_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_effectiveTime_4_138_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SeriesAct_text_4_138_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_138_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_id_4_145_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_effectiveTime_4_145_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_145_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_145_13-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_code_4_145_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_text_4_145_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_entryRelationship_4_145_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_templateId_4_145_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_moodCode_4_145_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_classCode_4_145_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_145_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_145_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_RecordTarget_patientRole_2_7_5_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_PatientRole_id_2_7_5_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_PatientRole_providerOrganization_2_7_5_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_PatientRole_telecom_2_7_5_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_PatientRole_patient_2_7_5_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_PatientRole_addr_2_7_5_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_birthTime_2_7_5_i_e_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_birthplace_2_7_5_i_e_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_languageCommunication_2_7_5_i_e_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_name_2_7_5_i_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_guardian_2_7_5_i_e_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_religiousAffiliationCode_2_7_5_i_e_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_raceCode_2_7_5_i_e_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_ethnicGroupCode_2_7_5_i_e_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_administrativeGenderCode_2_7_5_i_e_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_maritalStatusCode_2_7_5_i_e_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Patient_sDTCRaceCode_2_7_5_i_e_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Guardian_telecom_2_7_5_i_e_9_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Guardian_code_2_7_5_i_e_9_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Guardian_guardianPerson_2_7_5_i_e_9_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Guardian_addr_2_7_5_i_e_9_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_7_5_i_b_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Person_name_2_7_5_i_e_9_iv_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_LanguageCommunication_preferenceInd_2_7_5_i_e_10_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_LanguageCommunication_modeCode_2_7_5_i_e_10_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_LanguageCommunication_proficiencyLevelCode_2_7_5_i_e_10_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_LanguageCommunication_languageCode_2_7_5_i_e_10_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TS_value_2_7_5_i_e_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Birthplace_place_2_7_5_i_e_11_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Place_addr_2_7_5_i_e_11_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ProviderOrganization_id_2_7_5_i_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ProviderOrganization_addr_2_7_5_i_e_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ProviderOrganization_name_2_7_5_i_e_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_7_5_i_e_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ProviderOrganization_telecom_2_7_5_i_e_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TEL_use_2_7_5_i_e_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TEL_use_2_7_5_i_c_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_DataEnterer_assignedEntity_2_7_6_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_6_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_6_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_6_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_6_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_6_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TEL_use_2_7_6_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Person_name_2_7_6_i_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Author_assignedAuthor_2_7_7_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Author_time_2_7_7_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedAuthor_addr_2_7_7_ii_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedAuthor_code_2_7_7_ii_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedAuthor_telecom_2_7_7_ii_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedAuthor_id_2_7_7_ii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AuthoringDevice_softwareName_2_7_7_ii_e_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AuthoringDevice_manufacturerModelName_2_7_7_ii_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TEL_use_2_7_7_ii_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Person_name_2_7_7_ii_f_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Custodian_assignedCustodian_2_7_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedCustodian_representedCustodianOrganization_2_7_8_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_CustodianOrganization_addr_2_7_8_i_a_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_CustodianOrganization_name_2_7_8_i_a_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_CustodianOrganization_telecom_2_7_8_i_a_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_CustodianOrganization_ProviderOrganization_2_7_5_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_CustodianOrganization_id_2_7_8_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TEL_use_2_7_8_i_a_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_LegalAuthenticator_time_2_7_10_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_LegalAuthenticator_assignedEntity_2_7_10_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_LegalAuthenticator_signatureCode_2_7_10_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_LegalAuthenticator_sDTCSignatureText_2_7_10_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_ProviderOrganization_2_7_5_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_10_iv_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_10_iv_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_10_iv_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_10_iv_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_10_iv_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TEL_use_2_7_10_iv_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Person_name_2_7_10_iv_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Authenticator_sDTCSignatureText_2_7_11_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Authenticator_time_2_7_11_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Authenticator_assignedEntity_2_7_11_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Authenticator_signatureCode_2_7_11_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_telecom_2_7_11_iv_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_id_2_7_11_iv_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_addr_2_7_11_iv_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_code_2_7_11_iv_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_AssignedEntity_assignedPerson_2_7_11_iv_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_TEL_use_2_7_11_iv_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Person_name_2_7_11_iv_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_ParticipantSupport_time_2_7_15_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Authorization_consent_2_7_17_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Consent_id_2_7_17_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Consent_code_2_7_17_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReportV3_1A_Consent_statusCode_2_7_17_i_c-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
