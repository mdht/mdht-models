<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_templateId_2_3_1-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_templateId_2_3_1-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_templateId_2_3_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.5')
			Constraint name: DiagnosticImagingReportTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.5'">Error: DiagnosticImagingReport - 2.3.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8404, CONF:10042 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.5&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_author_2_3_14-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_author_2_3_14-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_author_2_3_14-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: DiagnosticImagingReport - 2.3.14 author
		Conformance: SHALL contain at least one [1..*] author (CONF:5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authenticator_2_3_19-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authenticator_2_3_19-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authenticator_2_3_19-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: DiagnosticImagingReport - 2.3.19 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_confidentialityCode_2_3_8-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_confidentialityCode_2_3_8-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_confidentialityCode_2_3_8-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: DiagnosticImagingReport - 2.3.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC (CONF:5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: DiagnosticImagingReport - 2.3.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC (CONF:5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportSectionsHaveText_2_3_19-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportSectionsHaveText_2_3_19-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportSectionsHaveText_2_3_19-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.getAllSections()->reject(section : cda::Section | section.templateId->exists(root = '2.16.840.1.113883.10.20.6.1.1'))->forAll(section : cda::Section | not section.text.oclIsUndefined())
			Constraint name: DiagnosticImagingReportSectionsHaveText
		-->
	<assert test="not(.//cda:section[not(cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1')][not(cda:text)])">Error: DiagnosticImagingReport - 2.3.19 DiagnosticImagingReportSectionsHaveText
		Conformance: Apart from the DICOM Object Catalog (templateId 2.16.840.1.113883.10.20.6.1.1), all other instances of section SHALL contain at least one text element or one or more component elements (CONF:9413)
		Analysis: Apart from the DICOM Object Catalog (templateId 2.16.840.1.113883.10.20.6.1.1), all other instances of section SHALL contain at least one text element or one or more component elements
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_legalAuthenticator_2_3_18-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_legalAuthenticator_2_3_18-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_legalAuthenticator_2_3_18-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: DiagnosticImagingReport - 2.3.18 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informationRecipient_2_3_6-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informationRecipient_2_3_6-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informationRecipient_2_3_6-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: DiagnosticImagingReportInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: DiagnosticImagingReport - 2.3.6 informationRecipient
		Conformance: MAY contain  [0..*] informationRecipient such that it  (CONF:8411)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informant_2_3_5-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informant_2_3_5-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informant_2_3_5-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->isEmpty()
			Constraint name: DiagnosticImagingReportInformant
		-->
	<assert test="not(cda:informant)">Error: DiagnosticImagingReport - 2.3.5 informant
		Conformance: SHALL contain  [0..0] informant such that it  (CONF:8410)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportUseDiagnosticImagingCode_2_3_13-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportUseDiagnosticImagingCode_2_3_13-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportUseDiagnosticImagingCode_2_3_13-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.code = '18748-4'
			Constraint name: DiagnosticImagingReportUseDiagnosticImagingCode
		-->
	<assert test="cda:code and cda:code/@code = '18748-4'">Error: DiagnosticImagingReport - 2.3.13 DiagnosticImagingReportUseDiagnosticImagingCode
		Conformance: This code SHOULD contain zero or one [0..1] @code=&quot;18748-4&quot; Diagnostic Imaging Report (CodeSystem: LOINC2.16.840.1.113883.6.1) (CONF:8409)
		Analysis: This code SHOULD contain zero or one [0..1] @code=&quot;18748-4&quot; Diagnostic Imaging Report (CodeSystem: LOINC2.16.840.1.113883.6.1)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_recordTarget_2_3_12-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_recordTarget_2_3_12-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_recordTarget_2_3_12-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: GeneralHeaderConstraintsRecordTarget
		-->
	<assert test="cda:recordTarget">Error: DiagnosticImagingReport - 2.3.12 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:5266)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_documentationOf_2_3_9-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_documentationOf_2_3_9-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_documentationOf_2_3_9-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
			Constraint name: DiagnosticImagingReportDocumentationOf
		-->
	<assert test="count(cda:documentationOf)=1">Error: DiagnosticImagingReport - 2.3.9 documentationOf
		Conformance: SHALL contain exactly one [1..1] documentationOf (CONF:8416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportAllSectionsHaveTitle_2_3_15-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportAllSectionsHaveTitle_2_3_15-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportAllSectionsHaveTitle_2_3_15-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.getAllSections()->reject(section : cda::Section | section.templateId->exists(root = '2.16.840.1.113883.10.20.6.1.1'))->forAll(section : cda::Section | not section.title.oclIsUndefined())
			Constraint name: DiagnosticImagingReportAllSectionsHaveTitle
		-->
	<assert test="not(.//cda:section[not(cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1')][not(cda:title)])">Error: DiagnosticImagingReport - 2.3.15 DiagnosticImagingReportAllSectionsHaveTitle
		Conformance: With the exception of the DICOM Object Catalog (templateId 2.16.840.1.113883.10.20.6.1.1), all sections within the Diagnostic Imaging Report content SHOULD contain a title element (CONF:9409)
		Analysis: With the exception of the DICOM Object Catalog (templateId 2.16.840.1.113883.10.20.6.1.1), all sections within the Diagnostic Imaging Report content SHOULD contain a title element
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_languageCode_2_3_9-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_languageCode_2_3_9-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_languageCode_2_3_9-error_mdht">
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
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: DiagnosticImagingReport - 2.3.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: DiagnosticImagingReport - 2.3.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_inFulfillmentOf_2_3_8-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_inFulfillmentOf_2_3_8-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_inFulfillmentOf_2_3_8-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() <= 1
			Constraint name: DiagnosticImagingReportInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &lt;= 1">Error: DiagnosticImagingReport - 2.3.8 inFulfillmentOf
		Conformance: MAY contain zero or one [0..1] inFulfillmentOf
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_title_2_3_6-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_title_2_3_6-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_title_2_3_6-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: DiagnosticImagingReport - 2.3.6 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_setId_2_3_10-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_setId_2_3_10-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_setId_2_3_10-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: DiagnosticImagingReport - 2.3.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_relatedDocument_2_3_10-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_relatedDocument_2_3_10-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_relatedDocument_2_3_10-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.relatedDocument->select(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))->size() <= 1
			Constraint name: DiagnosticImagingReportRelatedDocument
		-->
	<assert test="count(cda:relatedDocument) &lt;= 1">Error: DiagnosticImagingReport - 2.3.10 relatedDocument
		Conformance: MAY contain zero or one [0..1] relatedDocument (CONF:8432)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_typeId_2_3_3-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_typeId_2_3_3-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_typeId_2_3_3-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: DiagnosticImagingReport - 2.3.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_dataEnterer_2_3_15-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_dataEnterer_2_3_15-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_dataEnterer_2_3_15-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: DiagnosticImagingReport - 2.3.15 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_2_DiagnosticImagingReport_componentOf_2_3_11-error_mdht" see="#p-DiagnosticImagingReport_2_DiagnosticImagingReport_componentOf_2_3_11-error_mdht" name="p-DiagnosticImagingReport_2_DiagnosticImagingReport_componentOf_2_3_11-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: DiagnosticImagingReportComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: DiagnosticImagingReport - 2.3.11 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:8434)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_effectiveTime_2_3_7-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_effectiveTime_2_3_7-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_effectiveTime_2_3_7-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: DiagnosticImagingReport - 2.3.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_versionNumber_2_3_11-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_versionNumber_2_3_11-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_versionNumber_2_3_11-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: DiagnosticImagingReport - 2.3.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_id_2_3_4-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_id_2_3_4-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_id_2_3_4-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_custodian_2_3_16-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_custodian_2_3_16-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_custodian_2_3_16-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: GeneralHeaderConstraintsCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: DiagnosticImagingReport - 2.3.16 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (iv., CONF:5519)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_code_2_3_3-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_code_2_3_3-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_code_2_3_3-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCodeP
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 2.3.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:14833), which SHALL be selected from ValueSet DIRDocumentTypeCodes 2.16.840.1.113883.11.20.9.32 DYNAMIC (CONF:14834)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '18748-4' or value.code = '18747-6' or value.code = '18755-9' or value.code = '18760-9' or value.code = '18757-5' or value.code = '18758-3' or value.code = '18745-0' or value.code = '11522-0' or value.code = '18746-8' or value.code = '18751-8' or value.code = '11525-3')
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.1' and (@code = '18748-4' or @code = '18747-6' or @code = '18755-9' or @code = '18760-9' or @code = '18757-5' or @code = '18758-3' or @code = '18745-0' or @code = '11522-0' or @code = '18746-8' or @code = '18751-8' or @code = '11525-3')]">Error: DiagnosticImagingReport - 2.3.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:14833), which SHALL be selected from ValueSet DIRDocumentTypeCodes 2.16.840.1.113883.11.20.9.32 DYNAMIC (CONF:14834)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_participant1_2_3_7-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_participant1_2_3_7-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_participant1_2_3_7-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() <= 1
			Constraint name: DiagnosticImagingReportParticipant1
		-->
	<assert test="count(cda:participant) &lt;= 1">Error: DiagnosticImagingReport - 2.3.7 participant1
		Conformance: MAY contain zero or one [0..1] participant (CONF:8414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_realmCode_2_3_2-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_realmCode_2_3_2-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_realmCode_2_3_2-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: DiagnosticImagingReport - 2.3.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: DiagnosticImagingReport - 2.3.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_supportParticipant_2_3_21-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_supportParticipant_2_3_21-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_supportParticipant_2_3_21-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: DiagnosticImagingReport - 2.3.21 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_2_DiagnosticImagingReport_component_2_3_12-error_mdht" see="#p-DiagnosticImagingReport_2_DiagnosticImagingReport_component_2_3_12-error_mdht" name="p-DiagnosticImagingReport_2_DiagnosticImagingReport_component_2_3_12-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(consol::DiagnosticImagingReport::Component))
			Constraint name: DiagnosticImagingReportComponent
		-->
	<assert test="count(cda:component)=1">Error: DiagnosticImagingReport - 2.3.12 component
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DiagnosticImagingReport: 2.16.840.1.113883.10.20.22.1.5 -->

<pattern id="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authorization_2_3_24-error_mdht" see="#p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authorization_2_3_24-error_mdht" name="p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authorization_2_3_24-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport
			UML root path: /DiagnosticImagingReport
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: DiagnosticImagingReport - 2.3.24 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Participant -->

<pattern id="p-DiagnosticImagingReport_1A_Participant_associatedEntity_2_3_7_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Participant_associatedEntity_2_3_7_i-error_mdht" name="p-DiagnosticImagingReport_1A_Participant_associatedEntity_2_3_7_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/participant1
			UML root path: /DiagnosticImagingReport/participant1
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(consol::DiagnosticImagingReport::Participant::AssociatedEntity))
			Constraint name: DiagnosticImagingReportParticipantAssociatedEntity
		-->
	<assert test="count(cda:associatedEntity)=1">Error: DiagnosticImagingReport - 2.3.7.i associatedEntity
		Conformance: SHALL contain exactly one [1..1] associatedEntity (CONF:8415)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssociatedEntity_associatedPerson_2_3_7_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_AssociatedEntity_associatedPerson_2_3_7_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_AssociatedEntity_associatedPerson_2_3_7_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/participant1/associatedEntity
			UML root path: /DiagnosticImagingReport/participant1/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">
		<!--
			OCL: self.associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(consol::DiagnosticImagingReport::Participant::AssociatedEntity::Person))
			Constraint name: DiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson
		-->
	<assert test="count(cda:associatedPerson)=1">Error: DiagnosticImagingReport - 2.3.7.i.a associatedPerson
		Conformance: SHALL contain exactly one [1..1] associatedPerson (CONF:8415)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReport_1A_Person_name_2_3_7_i_a_1-error_mdht" see="#p-DiagnosticImagingReport_1A_Person_name_2_3_7_i_a_1-error_mdht" name="p-DiagnosticImagingReport_1A_Person_name_2_3_7_i_a_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/participant1/associatedEntity/associatedPerson
			UML root path: /DiagnosticImagingReport/participant1/associatedEntity/associatedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson">
		<!--
			OCL: self.name->size() = 1
			Constraint name: DiagnosticImagingReportParticipantAssociatedEntityPersonName
		-->
	<assert test="count(cda:name) = 1">Error: DiagnosticImagingReport - 2.3.7.i.a.1 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:9406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-DiagnosticImagingReport_1A_DocumentationOf_serviceEvent3_2_3_9_i-error_mdht" see="#p-DiagnosticImagingReport_1A_DocumentationOf_serviceEvent3_2_3_9_i-error_mdht" name="p-DiagnosticImagingReport_1A_DocumentationOf_serviceEvent3_2_3_9_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf
			UML root path: /DiagnosticImagingReport/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::DiagnosticImagingReport::DocumentationOf::ServiceEvent4))
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent3
		-->
	<assert test="count(cda:serviceEvent)=1">Error: DiagnosticImagingReport - 2.3.9.i serviceEvent3
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:8431)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent4 -->

<pattern id="p-DiagnosticImagingReport_1A_ServiceEvent4_id_2_3_9_i_c-error_mdht" see="#p-DiagnosticImagingReport_1A_ServiceEvent4_id_2_3_9_i_c-error_mdht" name="p-DiagnosticImagingReport_1A_ServiceEvent4_id_2_3_9_i_c-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf/serviceEvent3
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent4Id
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: DiagnosticImagingReport - 2.3.9.i.c id
		Conformance: SHOULD contain zero or more [0..*] id (CONF:8418)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent4 -->

<pattern id="p-DiagnosticImagingReport_1A_ServiceEvent4_classCode_2_3_9_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_ServiceEvent4_classCode_2_3_9_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_ServiceEvent4_classCode_2_3_9_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf/serviceEvent3
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::ActClassRoot::ACT
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent4ClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'ACT'">Error: DiagnosticImagingReport - 2.3.9.i.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:8430)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent4 -->

<pattern id="p-DiagnosticImagingReport_1A_ServiceEvent4_code_2_3_9_i_b-error_mdht" see="#p-DiagnosticImagingReport_1A_ServiceEvent4_code_2_3_9_i_b-error_mdht" name="p-DiagnosticImagingReport_1A_ServiceEvent4_code_2_3_9_i_b-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf/serviceEvent3
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent4Code
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 2.3.9.i.b code
		Conformance: SHALL contain exactly one [1..1] code (CONF:8419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent4 -->

<pattern id="p-DiagnosticImagingReport_1A_ServiceEvent4_physicianReadingStudyPerformer_2_3_9_i_d-error_mdht" see="#p-DiagnosticImagingReport_1A_ServiceEvent4_physicianReadingStudyPerformer_2_3_9_i_d-error_mdht" name="p-DiagnosticImagingReport_1A_ServiceEvent4_physicianReadingStudyPerformer_2_3_9_i_d-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/documentationOf/serviceEvent3
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer))->size() >= 0
			Constraint name: DiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer
		-->
	<assert test="count(cda:performer[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.1']) &gt;= 0">Error: DiagnosticImagingReport - 2.3.9.i.d physicianReadingStudyPerformer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:8422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianReadingStudyPerformer: 2.16.840.1.113883.10.20.6.2.1 -->

<pattern id="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_typeCode_2_3_9_i_d_2-error_mdht" see="#p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_typeCode_2_3_9_i_d_2-error_mdht" name="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_typeCode_2_3_9_i_d_2-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: isDefined('typeCode')
			Constraint name: PhysicianReadingStudyPerformerTypeCode
		-->
	<assert test="attribute::node()[name() = 'typeCode']">Error: DiagnosticImagingReport - 2.3.9.i.d.2 typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode (CONF:8424)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianReadingStudyPerformer: 2.16.840.1.113883.10.20.6.2.1 -->

<pattern id="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_templateId_2_3_9_i_d_1-error_mdht" see="#p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_templateId_2_3_9_i_d_1-error_mdht" name="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_templateId_2_3_9_i_d_1-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.1')
			Constraint name: PhysicianReadingStudyPerformerTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.1'">Error: DiagnosticImagingReport - 2.3.9.i.d.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8423 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianReadingStudyPerformer: 2.16.840.1.113883.10.20.6.2.1 -->

<pattern id="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_assignedEntity_2_3_9_i_d_4-error_mdht" see="#p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_assignedEntity_2_3_9_i_d_4-error_mdht" name="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_assignedEntity_2_3_9_i_d_4-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
			Constraint name: PhysicianReadingStudyPerformerAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.3.9.i.d.4 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:8426)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianReadingStudyPerformer: 2.16.840.1.113883.10.20.6.2.1 -->

<pattern id="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_time_2_3_9_i_d_3-error_mdht" see="#p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_time_2_3_9_i_d_3-error_mdht" name="p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_time_2_3_9_i_d_3-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: PhysicianReadingStudyPerformerTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: DiagnosticImagingReport - 2.3.9.i.d.3 time
		Conformance: MAY contain zero or one [0..1] time (CONF:8425)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasDICOM_2_3_9_i_d_4_iv-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasDICOM_2_3_9_i_d_4_iv-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasDICOM_2_3_9_i_d_4_iv-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer/assignedEntity
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: self.code.codeSystem = '1.2.840.10008.2.16.4' or self.code.codeSystem = '2.16.840.1.113883.6.101'
			Constraint name: PhysicianReadingStudyPerformerAssignedEntityHasDICOM
		-->
	<assert test="cda:code/@codeSystem = '1.2.840.10008.2.16.4' or cda:code/@codeSystem = '2.16.840.1.113883.6.101'">Error: DiagnosticImagingReport - 2.3.9.i.d.4.iv PhysicianReadingStudyPerformerAssignedEntityHasDICOM
		Conformance: SHALL contain a valid DICOM personal identification code sequence (@codeSystem is 1.2.840.10008.2.16.4) or an appropriate national health care provider coding system (e.g., NUCC in the U.S., where @code is 2.16.840.1.113883.6.101).
		Analysis: SHALL contain a valid DICOM personal identification code sequence (@codeSystem is 1.2.840.10008.2.16.4) or an appropriate national health care provider coding system (e.g., NUCC in the U.S., where @code is 2.16.840.1.113883.6.101).
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_9_i_d_4_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_9_i_d_4_ii-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_9_i_d_4_ii-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer/assignedEntity
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: PhysicianReadingStudyPerformerAssignedEntityId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.9.i.d.4.ii id
		Conformance: SHALL contain at least one [1..*] id (CONF:10033)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId_2_3_9_i_d_4_iii-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId_2_3_9_i_d_4_iii-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId_2_3_9_i_d_4_iii-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer/assignedEntity
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: DiagnosticImagingReport - 2.3.9.i.d.4.iii PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId
		Conformance: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:10034)
		Analysis: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_9_i_d_4_i-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_9_i_d_4_i-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_9_i_d_4_i-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer/assignedEntity
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PhysicianReadingStudyPerformerAssignedEntityCode
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 2.3.9.i.d.4.i code
		Conformance: SHALL contain exactly one [1..1] code (CONF:8427)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization_2_3_9_i_d_4_v-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization_2_3_9_i_d_4_v-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization_2_3_9_i_d_4_v-error_mdht">
		<!--
			UML path: /PhysicianReadingStudyPerformer/assignedEntity
			UML root path: /DiagnosticImagingReport/documentationOf/serviceEvent3/physicianReadingStudyPerformer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.assignedPerson->isEmpty() or  not self.representedOrganization->isEmpty()
			Constraint name: PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization
		-->
	<assert test="cda:assignedPerson or cda:representedOrganization">Error: DiagnosticImagingReport - 2.3.9.i.d.4.v PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization
		Conformance: Every assignedEntity element SHALL have at least one assignedPerson or representedOrganization. (CONF:8429)
		Analysis: Every assignedEntity element SHALL have at least one assignedPerson or representedOrganization.
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-DiagnosticImagingReport_2_ComponentOf_encompassingEncounter_2_3_11_i-error_mdht" see="#p-DiagnosticImagingReport_2_ComponentOf_encompassingEncounter_2_3_11_i-error_mdht" name="p-DiagnosticImagingReport_2_ComponentOf_encompassingEncounter_2_3_11_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf
			UML root path: /DiagnosticImagingReport/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::DiagnosticImagingReport::ComponentOf::EncompassingEncounter7))
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: DiagnosticImagingReport - 2.3.11.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:8449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter7 -->

<pattern id="p-DiagnosticImagingReport_2_EncompassingEncounter7_physicianofRecordParticipant_2_3_11_i_c-error_mdht" see="#p-DiagnosticImagingReport_2_EncompassingEncounter7_physicianofRecordParticipant_2_3_11_i_c-error_mdht" name="p-DiagnosticImagingReport_2_EncompassingEncounter7_physicianofRecordParticipant_2_3_11_i_c-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: self.encounterParticipant->select(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant))->size() <= 1
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant
		-->
	<assert test="count(cda:encounterParticipant[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2']) &lt;= 1">Error: DiagnosticImagingReport - 2.3.11.i.c physicianofRecordParticipant
		Conformance: SHOULD contain zero or one [0..1] encounterParticipant (CONF:8448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter7 -->

<pattern id="p-DiagnosticImagingReport_2_EncompassingEncounter7_effectiveTime_2_3_11_i_a-error_mdht" see="#p-DiagnosticImagingReport_2_EncompassingEncounter7_effectiveTime_2_3_11_i_a-error_mdht" name="p-DiagnosticImagingReport_2_EncompassingEncounter7_effectiveTime_2_3_11_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: DiagnosticImagingReport - 2.3.11.i.a effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:8437)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter7 -->

<pattern id="p-DiagnosticImagingReport_2_EncompassingEncounter7_responsibleParty_2_3_11_i_d-error_mdht" see="#p-DiagnosticImagingReport_2_EncompassingEncounter7_responsibleParty_2_3_11_i_d-error_mdht" name="p-DiagnosticImagingReport_2_EncompassingEncounter7_responsibleParty_2_3_11_i_d-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: self.responsibleParty->select(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(consol::DiagnosticImagingReport::ComponentOf::EncompassingEncounter7::ResponsibleParty))->size() <= 1
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty
		-->
	<assert test="count(cda:responsibleParty) &lt;= 1">Error: DiagnosticImagingReport - 2.3.11.i.d responsibleParty
		Conformance: MAY contain zero or one [0..1] responsibleParty (CONF:8438)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter7 -->

<pattern id="p-DiagnosticImagingReport_2_EncompassingEncounter7_id_2_3_11_i_b-error_mdht" see="#p-DiagnosticImagingReport_2_EncompassingEncounter7_id_2_3_11_i_b-error_mdht" name="p-DiagnosticImagingReport_2_EncompassingEncounter7_id_2_3_11_i_b-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7Id
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.11.i.b id
		Conformance: SHALL contain at least one [1..*] id (CONF:8435)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianofRecordParticipant: 2.16.840.1.113883.10.20.6.2.2 -->

<pattern id="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_templateId_2_3_11_i_c_1-error_mdht" see="#p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_templateId_2_3_11_i_c_1-error_mdht" name="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_templateId_2_3_11_i_c_1-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.2')
			Constraint name: PhysicianofRecordParticipantTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.2'">Error: DiagnosticImagingReport - 2.3.11.i.c.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8440 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.2&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianofRecordParticipant: 2.16.840.1.113883.10.20.6.2.2 -->

<pattern id="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_typeCode_2_3_11_i_c_2-error_mdht" see="#p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_typeCode_2_3_11_i_c_2-error_mdht" name="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_typeCode_2_3_11_i_c_2-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">
		<!--
			OCL: self.typeCode=vocab::x_EncounterParticipant::ATND
			Constraint name: PhysicianofRecordParticipantTypeCode
		-->
	<assert test="@typeCode = 'ATND'">Error: DiagnosticImagingReport - 2.3.11.i.c.2 typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;ATND&quot;  (CONF:8881)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PhysicianofRecordParticipant: 2.16.840.1.113883.10.20.6.2.2 -->

<pattern id="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_assignedEntity_2_3_11_i_c_3-error_mdht" see="#p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_assignedEntity_2_3_11_i_c_3-error_mdht" name="p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_assignedEntity_2_3_11_i_c_3-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
			Constraint name: PhysicianofRecordParticipantAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.3.11.i.c.3 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:8886)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_id_2_3_11_i_c_3_ii-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_id_2_3_11_i_c_3_ii-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_id_2_3_11_i_c_3_ii-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: PhysicianofRecordParticipantAssignedEntityId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.11.i.c.3.ii id
		Conformance: SHALL contain at least one [1..*] id (CONF:8887)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_AssignedEntity_2_3_9_i_d_4-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_AssignedEntity_2_3_9_i_d_4-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_AssignedEntity_2_3_9_i_d_4-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: PhysicianofRecordParticipantAssignedEntityHasNationalProviderId
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: DiagnosticImagingReport - 2.3.9.i.d.4 AssignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:8426)
		Analysis: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode_2_3_11_i_c_3_iv-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode_2_3_11_i_c_3_iv-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode_2_3_11_i_c_3_iv-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: self.code.codeSystem = '1.2.840.10008.2.16.4' or self.code.codeSystem = '2.16.840.1.113883.6.101'
			Constraint name: PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode
		-->
	<assert test="cda:code/@codeSystem = '1.2.840.10008.2.16.4' or cda:code/@codeSystem = '2.16.840.1.113883.6.101'">Error: DiagnosticImagingReport - 2.3.11.i.c.3.iv PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode
		Conformance: SHALL contain a valid DICOM Organizational Role from DICOM CID 7452  (Value Set 1.2.840.10008.6.1.516)(@codeSystem is 1.2.840.10008.2.16.4) or an appropriate national health care provider coding system (e.g., NUCC in the U.S., where @codeSystem is 2.16.840.1.113883.6.101) (CONF:8889).
		Analysis: SHALL contain a valid DICOM Organizational Role from DICOM CID 7452  (Value Set 1.2.840.10008.6.1.516)(@codeSystem is 1.2.840.10008.2.16.4) or an appropriate national health care provider coding system (e.g., NUCC in the U.S., where @codeSystem is 2.16.840.1.113883.6.101) (CONF:8889).
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_code_2_3_11_i_c_3_i-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_code_2_3_11_i_c_3_i-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_code_2_3_11_i_c_3_i-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PhysicianofRecordParticipantAssignedEntityCode
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 2.3.11.i.c.3.i code
		Conformance: SHALL contain exactly one [1..1] code (CONF:8888)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_assignedPerson_2_3_11_i_c_3_iii-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_assignedPerson_2_3_11_i_c_3_iii-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_assignedPerson_2_3_11_i_c_3_iii-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->select(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::PhysicianofRecordParticipant::AssignedEntity::AssignedPerson))->size() <= 1
			Constraint name: PhysicianofRecordParticipantAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson) &lt;= 1">Error: DiagnosticImagingReport - 2.3.11.i.c.3.iii assignedPerson
		Conformance: SHOULD contain zero or one [0..1] assignedPerson
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedPerson -->

<pattern id="p-DiagnosticImagingReport_2_AssignedPerson_name_2_3_11_i_c_3_iii_a-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedPerson_name_2_3_11_i_c_3_iii_a-error_mdht" name="p-DiagnosticImagingReport_2_AssignedPerson_name_2_3_11_i_c_3_iii_a-error_mdht">
		<!--
			UML path: /PhysicianofRecordParticipant/assignedEntity/assignedPerson
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/physicianofRecordParticipant/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() <= 1)
			Constraint name: PhysicianofRecordParticipantAssignedEntityAssignedPersonName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or count(cda:name) &lt;= 1">Error: DiagnosticImagingReport - 2.3.11.i.c.3.iii.a name
		Conformance: SHOULD contain zero or one [0..1] name (CONF:8890)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ResponsibleParty -->

<pattern id="p-DiagnosticImagingReport_2_ResponsibleParty_assignedEntity_2_3_11_i_d_1-error_mdht" see="#p-DiagnosticImagingReport_2_ResponsibleParty_assignedEntity_2_3_11_i_d_1-error_mdht" name="p-DiagnosticImagingReport_2_ResponsibleParty_assignedEntity_2_3_11_i_d_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter/responsibleParty
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/responsibleParty
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::DiagnosticImagingReport::ComponentOf::EncompassingEncounter7::ResponsibleParty::AssignedEntity))
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.3.11.i.d.1 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:9407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_2_AssignedEntity_DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization_2_3_11_i_d_1_i-error_mdht" see="#p-DiagnosticImagingReport_2_AssignedEntity_DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization_2_3_11_i_d_1_i-error_mdht" name="p-DiagnosticImagingReport_2_AssignedEntity_DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization_2_3_11_i_d_1_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/componentOf/encompassingEncounter/responsibleParty/assignedEntity
			UML root path: /DiagnosticImagingReport/componentOf/encompassingEncounter/responsibleParty/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:responsibleParty/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->size() = 1 or self.representedOrganization->size() = 1
			Constraint name: DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization
		-->
	<assert test="count(cda:assignedPerson) = 1 or count(cda:representedOrganization) = 1">Error: DiagnosticImagingReport - 2.3.11.i.d.1.i DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization
		Conformance: SHOULD contain zero or one [0..1] assignedPerson OR contain zero or one [0..1] representedOrganization (CONF:8439)
		Analysis: SHOULD contain zero or one [0..1] assignedPerson OR contain zero or one [0..1] representedOrganization
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReport_2_Component_structuredBody_2_3_12_i-error_mdht" see="#p-DiagnosticImagingReport_2_Component_structuredBody_2_3_12_i-error_mdht" name="p-DiagnosticImagingReport_2_Component_structuredBody_2_3_12_i-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component
			UML root path: /DiagnosticImagingReport/component
		-->
	<rule context="/cda:ClinicalDocument/cda:component">
		<!--
			OCL: self.structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(consol::DiagnosticImagingReport::Component::StructuredBody))
			Constraint name: DiagnosticImagingReportComponentStructuredBody
		-->
	<assert test="count(cda:structuredBody)=1">Error: DiagnosticImagingReport - 2.3.12.i structuredBody
		Conformance: SHALL contain exactly one [1..1] structuredBody
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-DiagnosticImagingReport_2_StructuredBody_findingsSection_2_3_12_i_a-error_mdht" see="#p-DiagnosticImagingReport_2_StructuredBody_findingsSection_2_3_12_i_a-error_mdht" name="p-DiagnosticImagingReport_2_StructuredBody_findingsSection_2_3_12_i_a-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component/structuredBody
			UML root path: /DiagnosticImagingReport/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::DiagnosticImagingReport::Component::StructuredBody::Component))
			Constraint name: DiagnosticImagingReportComponentStructuredBodyFindingsSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'])=1">Error: DiagnosticImagingReport - 2.3.12.i.a findingsSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-DiagnosticImagingReport_2_StructuredBody_dICOMObjectCatalogSection_2_3_12_i_b-error_mdht" see="#p-DiagnosticImagingReport_2_StructuredBody_dICOMObjectCatalogSection_2_3_12_i_b-error_mdht" name="p-DiagnosticImagingReport_2_StructuredBody_dICOMObjectCatalogSection_2_3_12_i_b-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component/structuredBody
			UML root path: /DiagnosticImagingReport/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::DiagnosticImagingReport::Component::StructuredBody::Component))
			Constraint name: DiagnosticImagingReportComponentStructuredBodyDICOMObjectCatalogSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'])=1">Error: DiagnosticImagingReport - 2.3.12.i.b dICOMObjectCatalogSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReport_2_Component_findingsSection_2_3_12_i_a_1-error_mdht" see="#p-DiagnosticImagingReport_2_Component_findingsSection_2_3_12_i_a_1-error_mdht" name="p-DiagnosticImagingReport_2_Component_findingsSection_2_3_12_i_a_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component/structuredBody/findingsSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/findingsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))
			Constraint name: DiagnosticImagingReportComponentStructuredBodyComponentFindingsSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'])=1">Error: DiagnosticImagingReport - 2.3.12.i.a.1 findingsSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:9484)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- FindingsSection: 2.16.840.1.113883.10.20.6.1.2 -->

<pattern id="p-DiagnosticImagingReport_2_FindingsSection_templateId_3_16_1-error_mdht" see="#p-DiagnosticImagingReport_2_FindingsSection_templateId_3_16_1-error_mdht" name="p-DiagnosticImagingReport_2_FindingsSection_templateId_3_16_1-error_mdht">
		<!--
			UML path: /FindingsSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/findingsSection/findingsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.2')
			Constraint name: FindingsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.2'">Error: DiagnosticImagingReport - 3.16.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8531, CONF:10456 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.2&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-DiagnosticImagingReport_2_Component_dICOMObjectCatalogSection_2_3_12_i_b_1-error_mdht" see="#p-DiagnosticImagingReport_2_Component_dICOMObjectCatalogSection_2_3_12_i_b_1-error_mdht" name="p-DiagnosticImagingReport_2_Component_dICOMObjectCatalogSection_2_3_12_i_b_1-error_mdht">
		<!--
			UML path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))->size() <= 1
			Constraint name: DiagnosticImagingReportComponentStructuredBodyComponentDICOMObjectCatalogSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.b.1 dICOMObjectCatalogSection
		Conformance: SHOULD contain zero or one [0..1] section (CONF:15141)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_code_3_11_2-error_mdht" see="#p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_code_3_11_2-error_mdht" name="p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_code_3_11_2-error_mdht">
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
	<assert test="cda:code and cda:code[@code = '121181' and @codeSystem = '1.2.840.10008.2.16.4']">Error: DiagnosticImagingReport - 3.11.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15456)/@code=&quot;121181&quot; Dicom Object Catalog (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:15457)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: DICOMObjectCatalogSectionCodeP
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 3.11.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15456)/@code=&quot;121181&quot; Dicom Object Catalog (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:15457)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReport_3A_DICOMObjectCatalogSection_entry_3_11_3-error_mdht" see="#p-DiagnosticImagingReport_3A_DICOMObjectCatalogSection_entry_3_11_3-error_mdht" name="p-DiagnosticImagingReport_3A_DICOMObjectCatalogSection_entry_3_11_3-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::DICOMObjectCatalogSection::StudyActEntry))
			Constraint name: DICOMObjectCatalogSectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry[cda:act/cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6'])=1">Error: DiagnosticImagingReport - 3.11.3 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DICOMObjectCatalogSection: 2.16.840.1.113883.10.20.6.1.1 -->

<pattern id="p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_templateId_3_11_1-error_mdht" see="#p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_templateId_3_11_1-error_mdht" name="p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_templateId_3_11_1-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: DiagnosticImagingReport - 3.11.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')
			Constraint name: DICOMObjectCatalogSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1'">Error: DiagnosticImagingReport - 3.11.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8525, CONF:10454 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyActEntry -->

<pattern id="p-DiagnosticImagingReport_3A_StudyActEntry_studyAct_3_11_3_i-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyActEntry_studyAct_3_11_3_i-error_mdht" name="p-DiagnosticImagingReport_3A_StudyActEntry_studyAct_3_11_3_i-error_mdht">
		<!--
			UML path: /DICOMObjectCatalogSection/entry
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry">
		<!--
			OCL: self.act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::StudyAct))
			Constraint name: DICOMObjectCatalogSectionStudyActEntryStudyAct
		-->
	<assert test="cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">Error: DiagnosticImagingReport - 3.11.3.i studyAct
		Conformance: SHALL contain at least one [1..*] act (CONF:8530, CONF:15458)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_effectiveTime_4_72_6-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_effectiveTime_4_72_6-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_effectiveTime_4_72_6-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: StudyActEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: DiagnosticImagingReport - 4.72.6 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9216)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_moodCode_4_72_3-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_moodCode_4_72_3-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_moodCode_4_72_3-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: StudyActMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: DiagnosticImagingReport - 4.72.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:9208)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_classCode_4_72_2-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_classCode_4_72_2-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_classCode_4_72_2-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: StudyActClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: DiagnosticImagingReport - 4.72.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9207)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_StudyActIdsHaveRoot_4_72_9-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_StudyActIdsHaveRoot_4_72_9-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_StudyActIdsHaveRoot_4_72_9-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.id->forAll( not root.oclIsUndefined() )
			Constraint name: StudyActIdsHaveRoot
		-->
	<assert test="not(cda:id[not(@root)])">Error: DiagnosticImagingReport - 4.72.9 StudyActIdsHaveRoot
		Conformance: ids SHALL contain exactly one [1..1] @root (CONF:9213)
		Analysis: ids SHALL contain exactly one [1..1] @root
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_text_4_72_7-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_text_4_72_7-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_text_4_72_7-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)
			Constraint name: StudyActTextReference
		-->
	<assert test="not(cda:text) or not(cda:text[not(count(cda:reference) = 1)])">Error: DiagnosticImagingReport - 4.72.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9215)
		Analysis: text, if present, SHOULD contain zero or one [0..1] reference
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: StudyActText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: DiagnosticImagingReport - 4.72.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9215)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_templateId_4_72_1-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_templateId_4_72_1-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_templateId_4_72_1-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.6')
			Constraint name: StudyActTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6'">Error: DiagnosticImagingReport - 4.72.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:10533 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.6&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_StudyActNoIdExtension_4_72_10-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_StudyActNoIdExtension_4_72_10-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_StudyActNoIdExtension_4_72_10-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.id->forAll(  extension.oclIsUndefined() )
			Constraint name: StudyActNoIdExtension
		-->
	<assert test="not(cda:id[@extension])">Error: DiagnosticImagingReport - 4.72.10 StudyActNoIdExtension
		Conformance: Such ids SHALL NOT contain [0..0] @extension (CONF:9211)
		Analysis: Such ids SHALL NOT contain [0..0] @extension
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_id_4_72_4-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_id_4_72_4-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_id_4_72_4-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: StudyActId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 4.72.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9210)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_code_4_72_5-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_code_4_72_5-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_code_4_72_5-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: true
			Constraint name: StudyActCodeP
		-->
	<assert test="true()">Error: DiagnosticImagingReport - 4.72.5 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113014&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9214)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '113014' and value.codeSystem = '1.2.840.10008.2.16.4'
			Constraint name: StudyActCode
		-->
	<assert test="cda:code and cda:code[@code = '113014' and @codeSystem = '1.2.840.10008.2.16.4']">Error: DiagnosticImagingReport - 4.72.5 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113014&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9214)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StudyAct: 2.16.840.1.113883.10.20.6.2.6 -->

<pattern id="p-DiagnosticImagingReport_3A_StudyAct_entryRelationship_4_72_8-error_mdht" see="#p-DiagnosticImagingReport_3A_StudyAct_entryRelationship_4_72_8-error_mdht" name="p-DiagnosticImagingReport_3A_StudyAct_entryRelationship_4_72_8-error_mdht">
		<!--
			UML path: /StudyAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::StudyAct::SeriesActEntryRelationship))
			Constraint name: StudyActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship[cda:act/cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'])=1">Error: DiagnosticImagingReport - 4.72.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesActEntryRelationship -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesActEntryRelationship_seriesAct_4_72_8_i-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesActEntryRelationship_seriesAct_4_72_8_i-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesActEntryRelationship_seriesAct_4_72_8_i-error_mdht">
		<!--
			UML path: /StudyAct/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship">
		<!--
			OCL: self.act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SeriesAct))
			Constraint name: StudyActSeriesActEntryRelationshipSeriesAct
		-->
	<assert test="count(cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'])=1">Error: DiagnosticImagingReport - 4.72.8.i seriesAct
		Conformance: SHALL contain exactly one [1..1] act (CONF:9219, CONF:9220, CONF:15937)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_moodCode_4_67_3-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_moodCode_4_67_3-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_moodCode_4_67_3-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: SeriesActMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: DiagnosticImagingReport - 4.67.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:9223)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_effectiveTime_4_67_5-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_effectiveTime_4_67_5-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_effectiveTime_4_67_5-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: SeriesActEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: DiagnosticImagingReport - 4.67.5 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9235)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_text_4_67_7-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_text_4_67_7-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_text_4_67_7-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: SeriesActText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: DiagnosticImagingReport - 4.67.7 text
		Conformance: MAY contain zero or one [0..1] text (CONF:9233)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_entryRelationship_4_67_8-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_entryRelationship_4_67_8-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_entryRelationship_4_67_8-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SeriesAct::SOPInstanceObservationEntryRelationship))
			Constraint name: SeriesActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship[cda:observation/cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8'])=1">Error: DiagnosticImagingReport - 4.67.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_id_4_67_6-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_id_4_67_6-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_id_4_67_6-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: SeriesActId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 4.67.6 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9224)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_classCode_4_67_2-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_classCode_4_67_2-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_classCode_4_67_2-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: SeriesActClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: DiagnosticImagingReport - 4.67.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9222)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_SeriesActIdHasRoot_4_67_9-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_SeriesActIdHasRoot_4_67_9-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_SeriesActIdHasRoot_4_67_9-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.id->forAll( not root.oclIsUndefined() )
			Constraint name: SeriesActIdHasRoot
		-->
	<assert test="not(cda:id[not(@root)])">Error: DiagnosticImagingReport - 4.67.9 SeriesActIdHasRoot
		Conformance: ids SHALL contain exactly one [1..1] @root (CONF:9225)
		Analysis: ids SHALL contain exactly one [1..1] @root
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_templateId_4_67_1-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_templateId_4_67_1-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_templateId_4_67_1-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.63')
			Constraint name: SeriesActTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63'">Error: DiagnosticImagingReport - 4.67.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:10918, CONF:10919 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.63&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SeriesAct: 2.16.840.1.113883.10.20.22.4.63 -->

<pattern id="p-DiagnosticImagingReport_3A_SeriesAct_code_4_67_4-error_mdht" see="#p-DiagnosticImagingReport_3A_SeriesAct_code_4_67_4-error_mdht" name="p-DiagnosticImagingReport_3A_SeriesAct_code_4_67_4-error_mdht">
		<!--
			UML path: /SeriesAct
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']">
		<!--
			OCL: true
			Constraint name: SeriesActCodeP
		-->
	<assert test="true()">Error: DiagnosticImagingReport - 4.67.4 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113015&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9228)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '113015' and value.codeSystem = '1.2.840.10008.2.16.4'
			Constraint name: SeriesActCode
		-->
	<assert test="cda:code and cda:code[@code = '113015' and @codeSystem = '1.2.840.10008.2.16.4']">Error: DiagnosticImagingReport - 4.67.4 code
		Conformance: SHALL contain exactly one [1..1] code/@code=&quot;113015&quot;  (CodeSystem: 1.2.840.10008.2.16.4 DCM) (CONF:9228)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservationEntryRelationship -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_67_8_i-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_67_8_i-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_67_8_i-error_mdht">
		<!--
			UML path: /SeriesAct/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship">
		<!--
			OCL: self.observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation))
			Constraint name: SeriesActSOPInstanceObservationEntryRelationshipSOPInstanceObservation
		-->
	<assert test="cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">Error: DiagnosticImagingReport - 4.67.8.i sOPInstanceObservation
		Conformance: SHALL contain at least one [1..*] observation (CONF:9237, CONF:9238, CONF:15927)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_71_11-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_71_11-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_71_11-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies not self.effectiveTime.value.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeHasValue
		-->
	<assert test="not(cda:effectiveTime) or cda:effectiveTime/@value">Error: DiagnosticImagingReport - 4.71.11 SOPInstanceObservationEffectiveTimeHasValue
		Conformance: The effectiveTime, if present, SHALL contain exactly one [1..1] @value (CONF:9251)
		Analysis: The effectiveTime, if present, SHALL contain exactly one [1..1] @value
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_71_13-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_71_13-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_71_13-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.high.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeNoHigh
		-->
	<assert test="not(cda:effectiveTime) or not(cda:effectiveTime/cda:high)">Error: DiagnosticImagingReport - 4.71.13 SOPInstanceObservationEffectiveTimeNoHigh
		Conformance: The effectiveTime, if present, SHALL NOT contain [0..0] high (CONF:9253)
		Analysis: The effectiveTime, if present, SHALL NOT contain [0..0] high
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_classCode_4_71_2-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_classCode_4_71_2-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_classCode_4_71_2-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::DGIMG
			Constraint name: SOPInstanceObservationClassCode
		-->
	<assert test="@classCode = 'DGIMG'">Error: DiagnosticImagingReport - 4.71.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;DGIMG&quot;  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9240)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_text_4_71_6-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_text_4_71_6-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_text_4_71_6-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: SOPInstanceObservationText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: DiagnosticImagingReport - 4.71.6 text
		Conformance: SHOULD contain zero or one [0..1] text (CONF:9246)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_templateId_4_71_1-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_templateId_4_71_1-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_templateId_4_71_1-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.8')
			Constraint name: SOPInstanceObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8'">Error: DiagnosticImagingReport - 4.71.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.6.2.8&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_effectiveTime_4_71_4-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_effectiveTime_4_71_4-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_effectiveTime_4_71_4-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: SOPInstanceObservationEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: DiagnosticImagingReport - 4.71.4 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:9250)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_8-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_8-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_8-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::SOPInstanceObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: DiagnosticImagingReport - 4.71.8 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_moodCode_4_71_3-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_moodCode_4_71_3-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_moodCode_4_71_3-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: SOPInstanceObservationMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: DiagnosticImagingReport - 4.71.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_10-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_10-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_10-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::ReferencedFramesObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: DiagnosticImagingReport - 4.71.10 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_9-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_9-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_9-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::SOPInstanceObservation::PurposeofReferenceObservationEntryRelationship))
			Constraint name: SOPInstanceObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: DiagnosticImagingReport - 4.71.9 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_id_4_71_5-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_id_4_71_5-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_id_4_71_5-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: SOPInstanceObservationId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 4.71.5 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9242)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_71_12-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_71_12-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_71_12-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.low.oclIsUndefined()
			Constraint name: SOPInstanceObservationEffectiveTimeNoLow
		-->
	<assert test="not(cda:effectiveTime) or not(cda:effectiveTime/cda:low)">Error: DiagnosticImagingReport - 4.71.12 SOPInstanceObservationEffectiveTimeNoLow
		Conformance: The effectiveTime, if present, SHALL NOT contain [0..0] low (CONF:9252)
		Analysis: The effectiveTime, if present, SHALL NOT contain [0..0] low
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservation: 2.16.840.1.113883.10.20.6.2.8 -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservation_code_4_71_7-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservation_code_4_71_7-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservation_code_4_71_7-error_mdht">
		<!--
			UML path: /SOPInstanceObservation
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: SOPInstanceObservationCodeP
		-->
	<assert test="cda:code">Error: DiagnosticImagingReport - 4.71.7 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:9244), which SHALL be selected from (CodeSystem: 1.2.840.10008.2.6.1 DCMUID)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '1.2.840.10008.2.6.1'
			Constraint name: SOPInstanceObservationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '1.2.840.10008.2.6.1']">Error: DiagnosticImagingReport - 4.71.7 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:9244), which SHALL be selected from (CodeSystem: 1.2.840.10008.2.6.1 DCMUID)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SOPInstanceObservationEntryRelationship -->

<pattern id="p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_71_8_i-error_mdht" see="#p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_71_8_i-error_mdht" name="p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_71_8_i-error_mdht">
		<!--
			UML path: /SOPInstanceObservation/entryRelationship
			UML root path: /DiagnosticImagingReport/component/structuredBody/dICOMObjectCatalogSection/dICOMObjectCatalogSection/entry/studyAct/entryRelationship/seriesAct/entryRelationship/sOPInstanceObservation/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.6.1.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.6']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.63']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']/cda:entryRelationship">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation))->size() >= 0
			Constraint name: SOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.6.2.8']) &gt;= 0">Error: DiagnosticImagingReport - 4.71.8.i sOPInstanceObservation
		Conformance: MAY contain zero or more [0..*] observation (CONF:9254, CONF:9255, CONF:9256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-DiagnosticImagingReport_1A_Author_time_2_3_14_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Author_time_2_3_14_i-error_mdht" name="p-DiagnosticImagingReport_1A_Author_time_2_3_14_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author
			UML root path: /GeneralHeaderConstraints/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorTime
		-->
	<assert test="cda:time">Error: DiagnosticImagingReport - 2.3.14.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5445)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-DiagnosticImagingReport_1A_Author_assignedAuthor_2_3_14_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_Author_assignedAuthor_2_3_14_ii-error_mdht" name="p-DiagnosticImagingReport_1A_Author_assignedAuthor_2_3_14_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author
			UML root path: /GeneralHeaderConstraints/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::GeneralHeaderConstraints::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: DiagnosticImagingReport - 2.3.14.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedAuthor_telecom_2_3_14_ii_d-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedAuthor_telecom_2_3_14_ii_d-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedAuthor_telecom_2_3_14_ii_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTelecom
		-->
	<assert test="cda:telecom">Error: DiagnosticImagingReport - 2.3.14.ii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5428)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedAuthor_addr_2_3_14_ii_a-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedAuthor_addr_2_3_14_ii_a-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedAuthor_addr_2_3_14_ii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAddr
		-->
	<assert test="cda:addr">Error: DiagnosticImagingReport - 2.3.14.ii.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5452)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedAuthor_code_2_3_14_ii_b-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedAuthor_code_2_3_14_ii_b-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedAuthor_code_2_3_14_ii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.3.14.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:16787), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16788)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: DiagnosticImagingReport - 2.3.14.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:16787), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16788)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedAuthor_id_2_3_14_ii_c-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedAuthor_id_2_3_14_ii_c-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedAuthor_id_2_3_14_ii_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.14.ii.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:5449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_3_12_i_a_7-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_3_12_i_a_7-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_3_12_i_a_7-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		-->
	<assert test="@nullFlavor or count(cda:streetAddressLine) &gt;= 1 and count(cda:streetAddressLine) &lt;= 4">Error: DiagnosticImagingReport - 2.3.12.i.a.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		Conformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291)
		Analysis: SHALL contain at least one and not more than 4 streetAddressLine
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_postalCode_2_3_12_i_a_3-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_postalCode_2_3_12_i_a_3-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_postalCode_2_3_12_i_a_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.a.3 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_state_2_3_12_i_a_4-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_state_2_3_12_i_a_4-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_state_2_3_12_i_a_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.a.4 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_use_2_3_12_i_a_6-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_use_2_3_12_i_a_6-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_use_2_3_12_i_a_6-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: DiagnosticImagingReport - 2.3.12.i.a.6 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.a.6 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_city_2_3_12_i_a_1-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_city_2_3_12_i_a_1-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_city_2_3_12_i_a_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: DiagnosticImagingReport - 2.3.12.i.a.1 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_streetAddressLine_2_3_12_i_a_5-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_streetAddressLine_2_3_12_i_a_5-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_streetAddressLine_2_3_12_i_a_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: DiagnosticImagingReport - 2.3.12.i.a.5 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmAddress_country_2_3_12_i_a_2-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmAddress_country_2_3_12_i_a_2-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmAddress_country_2_3_12_i_a_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.a.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_3_14_ii_d_1-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_3_14_ii_d_1-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_3_14_ii_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor/telecom
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.14.ii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7995)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-DiagnosticImagingReport_1A_AuthoringDevice_softwareName_2_3_14_ii_e_2-error_mdht" see="#p-DiagnosticImagingReport_1A_AuthoringDevice_softwareName_2_3_14_ii_e_2-error_mdht" name="p-DiagnosticImagingReport_1A_AuthoringDevice_softwareName_2_3_14_ii_e_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.softwareName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName
		-->
	<assert test="cda:softwareName">Error: DiagnosticImagingReport - 2.3.14.ii.e.2 softwareName
		Conformance: SHALL contain exactly one [1..1] softwareName (CONF:16785)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-DiagnosticImagingReport_1A_AuthoringDevice_manufacturerModelName_2_3_14_ii_e_1-error_mdht" see="#p-DiagnosticImagingReport_1A_AuthoringDevice_manufacturerModelName_2_3_14_ii_e_1-error_mdht" name="p-DiagnosticImagingReport_1A_AuthoringDevice_manufacturerModelName_2_3_14_ii_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.manufacturerModelName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName
		-->
	<assert test="cda:manufacturerModelName">Error: DiagnosticImagingReport - 2.3.14.ii.e.1 manufacturerModelName
		Conformance: SHALL contain exactly one [1..1] manufacturerModelName (CONF:16784)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReport_1A_Person_name_2_3_14_ii_f_1-error_mdht" see="#p-DiagnosticImagingReport_1A_Person_name_2_3_14_ii_f_1-error_mdht" name="p-DiagnosticImagingReport_1A_Person_name_2_3_14_ii_f_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor/assignedPerson
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorPersonName
		-->
	<assert test="cda:name">Error: DiagnosticImagingReport - 2.3.14.ii.f.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:16789)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-DiagnosticImagingReport_1A_DataEnterer_assignedEntity_2_3_15_i-error_mdht" see="#p-DiagnosticImagingReport_1A_DataEnterer_assignedEntity_2_3_15_i-error_mdht" name="p-DiagnosticImagingReport_1A_DataEnterer_assignedEntity_2_3_15_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer
			UML root path: /GeneralHeaderConstraints/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.3.15.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_15_i_e-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_15_i_e-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_15_i_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: DiagnosticImagingReport - 2.3.15.i.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_15_i_b-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_15_i_b-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_15_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.3.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: DiagnosticImagingReport - 2.3.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_15_i_c-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_15_i_c-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_15_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.15.i.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:5443)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_15_i_d-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_15_i_d-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_15_i_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: DiagnosticImagingReport - 2.3.15.i.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5466)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_15_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_15_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_15_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: DiagnosticImagingReport - 2.3.15.i.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5460)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_ProviderOrganization_2_3_12_i_e-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_ProviderOrganization_2_3_12_i_e-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_ProviderOrganization_2_3_12_i_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: DiagnosticImagingReport - 2.3.12.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)
		Analysis: id SHOULD include zero or one [0..1] @root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_3_15_i_d_1-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_3_15_i_d_1-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_3_15_i_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity/telecom
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.15.i.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7996)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReport_1A_Person_name_2_3_15_i_e_1-error_mdht" see="#p-DiagnosticImagingReport_1A_Person_name_2_3_15_i_e_1-error_mdht" name="p-DiagnosticImagingReport_1A_Person_name_2_3_15_i_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity/assignedPerson
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: DiagnosticImagingReport - 2.3.15.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-DiagnosticImagingReport_1A_Custodian_assignedCustodian_2_3_16_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Custodian_assignedCustodian_2_3_16_i-error_mdht" name="p-DiagnosticImagingReport_1A_Custodian_assignedCustodian_2_3_16_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian
			UML root path: /GeneralHeaderConstraints/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodian
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: DiagnosticImagingReport - 2.3.16.i assignedCustodian
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:5520)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedCustodian_representedCustodianOrganization_2_3_16_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedCustodian_representedCustodianOrganization_2_3_16_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedCustodian_representedCustodianOrganization_2_3_16_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: DiagnosticImagingReport - 2.3.16.i.a representedCustodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:5521)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_CustodianOrganization_ProviderOrganization_2_3_12_i_e-error_mdht" see="#p-DiagnosticImagingReport_1A_CustodianOrganization_ProviderOrganization_2_3_12_i_e-error_mdht" name="p-DiagnosticImagingReport_1A_CustodianOrganization_ProviderOrganization_2_3_12_i_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: DiagnosticImagingReport - 2.3.12.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)
		Analysis: The id SHOULD include zero or one [0..1] @root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_CustodianOrganization_id_2_3_16_i_a_2-error_mdht" see="#p-DiagnosticImagingReport_1A_CustodianOrganization_id_2_3_16_i_a_2-error_mdht" name="p-DiagnosticImagingReport_1A_CustodianOrganization_id_2_3_16_i_a_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.16.i.a.2 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5522)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_CustodianOrganization_telecom_2_3_16_i_a_4-error_mdht" see="#p-DiagnosticImagingReport_1A_CustodianOrganization_telecom_2_3_16_i_a_4-error_mdht" name="p-DiagnosticImagingReport_1A_CustodianOrganization_telecom_2_3_16_i_a_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.telecom.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: DiagnosticImagingReport - 2.3.16.i.a.4 telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:5525)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_CustodianOrganization_name_2_3_16_i_a_3-error_mdht" see="#p-DiagnosticImagingReport_1A_CustodianOrganization_name_2_3_16_i_a_3-error_mdht" name="p-DiagnosticImagingReport_1A_CustodianOrganization_name_2_3_16_i_a_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.name.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName
		-->
	<assert test="cda:name">Error: DiagnosticImagingReport - 2.3.16.i.a.3 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5524)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_CustodianOrganization_addr_2_3_16_i_a_1-error_mdht" see="#p-DiagnosticImagingReport_1A_CustodianOrganization_addr_2_3_16_i_a_1-error_mdht" name="p-DiagnosticImagingReport_1A_CustodianOrganization_addr_2_3_16_i_a_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr
		-->
	<assert test="cda:addr">Error: DiagnosticImagingReport - 2.3.16.i.a.1 addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5559)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_3_16_i_a_4_i-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_3_16_i_a_4_i-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_3_16_i_a_4_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization/telecom
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.16.i.a.4.i use
		Conformance: SHOULD contain zero or one [0..1] @use
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-DiagnosticImagingReport_1A_LegalAuthenticator_time_2_3_18_i-error_mdht" see="#p-DiagnosticImagingReport_1A_LegalAuthenticator_time_2_3_18_i-error_mdht" name="p-DiagnosticImagingReport_1A_LegalAuthenticator_time_2_3_18_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator
			UML root path: /GeneralHeaderConstraints/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorTime
		-->
	<assert test="cda:time">Error: DiagnosticImagingReport - 2.3.18.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5580)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-DiagnosticImagingReport_1A_LegalAuthenticator_signatureCode_2_3_18_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_LegalAuthenticator_signatureCode_2_3_18_ii-error_mdht" name="p-DiagnosticImagingReport_1A_LegalAuthenticator_signatureCode_2_3_18_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator
			UML root path: /GeneralHeaderConstraints/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: DiagnosticImagingReport - 2.3.18.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5583, CONF:5584)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: DiagnosticImagingReport - 2.3.18.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5583, CONF:5584)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-DiagnosticImagingReport_1A_LegalAuthenticator_assignedEntity_2_3_18_iii-error_mdht" see="#p-DiagnosticImagingReport_1A_LegalAuthenticator_assignedEntity_2_3_18_iii-error_mdht" name="p-DiagnosticImagingReport_1A_LegalAuthenticator_assignedEntity_2_3_18_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator
			UML root path: /GeneralHeaderConstraints/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.3.18.iii assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5585)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_18_iii_c-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_18_iii_c-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_18_iii_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.18.iii.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:5586)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_18_iii_b-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_18_iii_b-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_18_iii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.3.18.iii.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:17000), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: DiagnosticImagingReport - 2.3.18.iii.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:17000), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_18_iii_d-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_18_iii_d-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_18_iii_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: DiagnosticImagingReport - 2.3.18.iii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5595)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_18_iii_e-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_18_iii_e-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_18_iii_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: DiagnosticImagingReport - 2.3.18.iii.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5597)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_18_iii_a-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_18_iii_a-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_18_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: DiagnosticImagingReport - 2.3.18.iii.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5589)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_3_18_iii_d_1-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_3_18_iii_d_1-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_3_18_iii_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity/telecom
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.18.iii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7999)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReport_1A_Person_name_2_3_18_iii_e_1-error_mdht" see="#p-DiagnosticImagingReport_1A_Person_name_2_3_18_iii_e_1-error_mdht" name="p-DiagnosticImagingReport_1A_Person_name_2_3_18_iii_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity/assignedPerson
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: DiagnosticImagingReport - 2.3.18.iii.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5598)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-DiagnosticImagingReport_1A_Authenticator_signatureCode_2_3_19_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_Authenticator_signatureCode_2_3_19_ii-error_mdht" name="p-DiagnosticImagingReport_1A_Authenticator_signatureCode_2_3_19_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator
			UML root path: /GeneralHeaderConstraints/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCodeP
		-->
	<assert test="true()">Error: DiagnosticImagingReport - 2.3.19.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5610)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: DiagnosticImagingReport - 2.3.19.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5610)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-DiagnosticImagingReport_1A_Authenticator_time_2_3_19_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Authenticator_time_2_3_19_i-error_mdht" name="p-DiagnosticImagingReport_1A_Authenticator_time_2_3_19_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator
			UML root path: /GeneralHeaderConstraints/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorTime
		-->
	<assert test="cda:time">Error: DiagnosticImagingReport - 2.3.19.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5608)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-DiagnosticImagingReport_1A_Authenticator_assignedEntity_2_3_19_iii-error_mdht" see="#p-DiagnosticImagingReport_1A_Authenticator_assignedEntity_2_3_19_iii-error_mdht" name="p-DiagnosticImagingReport_1A_Authenticator_assignedEntity_2_3_19_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator
			UML root path: /GeneralHeaderConstraints/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: DiagnosticImagingReport - 2.3.19.iii assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5612)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_19_iii_a-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_19_iii_a-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_19_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: DiagnosticImagingReport - 2.3.19.iii.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5616)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_19_iii_c-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_19_iii_c-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_19_iii_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.19.iii.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:5613)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_19_iii_b-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_19_iii_b-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_19_iii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.3.19.iii.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: DiagnosticImagingReport - 2.3.19.iii.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_19_iii_e-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_19_iii_e-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_19_iii_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: DiagnosticImagingReport - 2.3.19.iii.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5624)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_19_iii_d-error_mdht" see="#p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_19_iii_d-error_mdht" name="p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_19_iii_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: DiagnosticImagingReport - 2.3.19.iii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5622)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_3_19_iii_d_1-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_3_19_iii_d_1-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_3_19_iii_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity/telecom
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.19.iii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:8000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReport_1A_Person_name_2_3_19_iii_e_1-error_mdht" see="#p-DiagnosticImagingReport_1A_Person_name_2_3_19_iii_e_1-error_mdht" name="p-DiagnosticImagingReport_1A_Person_name_2_3_19_iii_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity/assignedPerson
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: DiagnosticImagingReport - 2.3.19.iii.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5625)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-DiagnosticImagingReport_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_3_21_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_3_21_ii-error_mdht" name="p-DiagnosticImagingReport_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_3_21_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/supportParticipant
			UML root path: /GeneralHeaderConstraints/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: DiagnosticImagingReport - 2.3.21.ii GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		Conformance: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity. (CONF:10006)
		Analysis: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity.
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-DiagnosticImagingReport_1A_ParticipantSupport_time_2_3_21_i-error_mdht" see="#p-DiagnosticImagingReport_1A_ParticipantSupport_time_2_3_21_i-error_mdht" name="p-DiagnosticImagingReport_1A_ParticipantSupport_time_2_3_21_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/supportParticipant
			UML root path: /GeneralHeaderConstraints/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: DiagnosticImagingReport - 2.3.21.i time
		Conformance: MAY contain zero or one [0..1] time (CONF:10004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-DiagnosticImagingReport_1A_Authorization_consent_2_3_24_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Authorization_consent_2_3_24_i-error_mdht" name="p-DiagnosticImagingReport_1A_Authorization_consent_2_3_24_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authorization
			UML root path: /GeneralHeaderConstraints/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: self.consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(consol::GeneralHeaderConstraints::Authorization::Consent))
			Constraint name: GeneralHeaderConstraintsAuthorizationConsent
		-->
	<assert test="count(cda:consent)=1">Error: DiagnosticImagingReport - 2.3.24.i consent
		Conformance: SHALL contain exactly one [1..1] consent (CONF:16793)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-DiagnosticImagingReport_1A_Consent_id_2_3_24_i_b-error_mdht" see="#p-DiagnosticImagingReport_1A_Consent_id_2_3_24_i_b-error_mdht" name="p-DiagnosticImagingReport_1A_Consent_id_2_3_24_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authorization/consent
			UML root path: /GeneralHeaderConstraints/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: DiagnosticImagingReport - 2.3.24.i.b id
		Conformance: MAY contain zero or more [0..*] id (CONF:16794)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-DiagnosticImagingReport_1A_Consent_statusCode_2_3_24_i_c-error_mdht" see="#p-DiagnosticImagingReport_1A_Consent_statusCode_2_3_24_i_c-error_mdht" name="p-DiagnosticImagingReport_1A_Consent_statusCode_2_3_24_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authorization/consent
			UML root path: /GeneralHeaderConstraints/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCodeP
		-->
	<assert test="cda:statusCode">Error: DiagnosticImagingReport - 2.3.24.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: DiagnosticImagingReport - 2.3.24.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-DiagnosticImagingReport_1A_Consent_code_2_3_24_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_Consent_code_2_3_24_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_Consent_code_2_3_24_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authorization/consent
			UML root path: /GeneralHeaderConstraints/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.3.24.i.a code
		Conformance: MAY contain zero or one [0..1] code (CONF:16795)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-DiagnosticImagingReport_1A_RecordTarget_patientRole_2_3_12_i-error_mdht" see="#p-DiagnosticImagingReport_1A_RecordTarget_patientRole_2_3_12_i-error_mdht" name="p-DiagnosticImagingReport_1A_RecordTarget_patientRole_2_3_12_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget
			UML root path: /GeneralHeaderConstraints/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: DiagnosticImagingReport - 2.3.12.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReport_1A_PatientRole_addr_2_3_12_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_PatientRole_addr_2_3_12_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_PatientRole_addr_2_3_12_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleAddr
		-->
	<assert test="cda:addr">Error: DiagnosticImagingReport - 2.3.12.i.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5271)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReport_1A_PatientRole_telecom_2_3_12_i_c-error_mdht" see="#p-DiagnosticImagingReport_1A_PatientRole_telecom_2_3_12_i_c-error_mdht" name="p-DiagnosticImagingReport_1A_PatientRole_telecom_2_3_12_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTelecom
		-->
	<assert test="cda:telecom">Error: DiagnosticImagingReport - 2.3.12.i.c telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5280)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReport_1A_PatientRole_id_2_3_12_i_b-error_mdht" see="#p-DiagnosticImagingReport_1A_PatientRole_id_2_3_12_i_b-error_mdht" name="p-DiagnosticImagingReport_1A_PatientRole_id_2_3_12_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.12.i.b id
		Conformance: SHALL contain at least one [1..*] id (CONF:5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReport_1A_PatientRole_providerOrganization_2_3_12_i_e-error_mdht" see="#p-DiagnosticImagingReport_1A_PatientRole_providerOrganization_2_3_12_i_e-error_mdht" name="p-DiagnosticImagingReport_1A_PatientRole_providerOrganization_2_3_12_i_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::ProviderOrganization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization
		-->
	<assert test="count(cda:providerOrganization) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.e providerOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-DiagnosticImagingReport_1A_PatientRole_patient_2_3_12_i_d-error_mdht" see="#p-DiagnosticImagingReport_1A_PatientRole_patient_2_3_12_i_d-error_mdht" name="p-DiagnosticImagingReport_1A_PatientRole_patient_2_3_12_i_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: DiagnosticImagingReport - 2.3.12.i.d patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:5283)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_c_1-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_c_1-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_c_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.c.1 use
		Conformance: SHOULD contain zero or one [0..1] @use
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_maritalStatusCode_2_3_12_i_d_4-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_maritalStatusCode_2_3_12_i_d_4-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_maritalStatusCode_2_3_12_i_d_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode">Error: DiagnosticImagingReport - 2.3.12.i.d.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode (CONF:5303), which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 STATIC 1
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined() and self.maritalStatusCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode and cda:maritalStatusCode[@codeSystem = '2.16.840.1.113883.5.2' and (@code = 'A' or @code = 'D' or @code = 'I' or @code = 'L' or @code = 'M' or @code = 'P' or @code = 'S' or @code = 'T' or @code = 'W')]">Error: DiagnosticImagingReport - 2.3.12.i.d.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode (CONF:5303), which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 STATIC 1
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_3_12_i_d_12-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_3_12_i_d_12-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_3_12_i_d_12-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: sDTCRaceCode->notEmpty() implies not raceCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode) or cda:raceCode">Error: DiagnosticImagingReport - 2.3.12.i.d.12 GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		Conformance: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode (CONF:31347)
		Analysis: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_religiousAffiliationCode_2_3_12_i_d_7-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_religiousAffiliationCode_2_3_12_i_d_7-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_religiousAffiliationCode_2_3_12_i_d_7-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode">Error: DiagnosticImagingReport - 2.3.12.i.d.7 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode (CONF:5317), which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 STATIC 1
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined() and self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode and cda:religiousAffiliationCode[@codeSystem = '2.16.840.1.113883.5.1076' and @code]">Error: DiagnosticImagingReport - 2.3.12.i.d.7 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode (CONF:5317), which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 STATIC 1
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_languageCommunication_2_3_12_i_d_11-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_languageCommunication_2_3_12_i_d_11-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_languageCommunication_2_3_12_i_d_11-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: DiagnosticImagingReport - 2.3.12.i.d.11 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:5406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_name_2_3_12_i_d_5-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_name_2_3_12_i_d_5-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_name_2_3_12_i_d_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientName
		-->
	<assert test="cda:name">Error: DiagnosticImagingReport - 2.3.12.i.d.5 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5284, CONF:10411)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_birthTime_2_3_12_i_d_2-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_birthTime_2_3_12_i_d_2-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_birthTime_2_3_12_i_d_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.birthTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		-->
	<assert test="cda:birthTime">Error: DiagnosticImagingReport - 2.3.12.i.d.2 birthTime
		Conformance: SHALL contain exactly one [1..1] birthTime (CONF:5298)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_administrativeGenderCode_2_3_12_i_d_1-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_administrativeGenderCode_2_3_12_i_d_1-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_administrativeGenderCode_2_3_12_i_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP
		-->
	<assert test="true()">Error: DiagnosticImagingReport - 2.3.12.i.d.1 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.administrativeGenderCode.oclIsUndefined() and self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode
		-->
	<assert test="cda:administrativeGenderCode and cda:administrativeGenderCode[@codeSystem = '2.16.840.1.113883.5.1' and (@code = 'F' or @code = 'M' or @code = 'UN')]">Error: DiagnosticImagingReport - 2.3.12.i.d.1 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_sDTCRaceCode_2_3_12_i_d_8-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_sDTCRaceCode_2_3_12_i_d_8-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_sDTCRaceCode_2_3_12_i_d_8-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCRaceCode->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or ext:sDTCRaceCode">Error: DiagnosticImagingReport - 2.3.12.i.d.8 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or not(ext:sDTCRaceCode[not(. and @codeSystem = '2.16.840.1.113883.6.238' and @code)])">Error: DiagnosticImagingReport - 2.3.12.i.d.8 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_ethnicGroupCode_2_3_12_i_d_3-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_ethnicGroupCode_2_3_12_i_d_3-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_ethnicGroupCode_2_3_12_i_d_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		-->
	<assert test="not(cda:ethnicGroupCode and not(cda:ethnicGroupCode/@nullFlavor)) or cda:ethnicGroupCode">Error: DiagnosticImagingReport - 2.3.12.i.d.3 ethnicGroupCode
		Conformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined() and self.ethnicGroupCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.ethnicGroupCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode
		-->
	<assert test="not(cda:ethnicGroupCode and not(cda:ethnicGroupCode/@nullFlavor)) or cda:ethnicGroupCode and cda:ethnicGroupCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '2135-2' or @code = '2186-5')]">Error: DiagnosticImagingReport - 2.3.12.i.d.3 ethnicGroupCode
		Conformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_guardian_2_3_12_i_d_9-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_guardian_2_3_12_i_d_9-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_guardian_2_3_12_i_d_9-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: DiagnosticImagingReport - 2.3.12.i.d.9 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:5325)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_raceCode_2_3_12_i_d_6-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_raceCode_2_3_12_i_d_6-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_raceCode_2_3_12_i_d_6-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		-->
	<assert test="not(cda:raceCode and not(cda:raceCode/@nullFlavor)) or cda:raceCode">Error: DiagnosticImagingReport - 2.3.12.i.d.6 raceCode
		Conformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined() and self.raceCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode
		-->
	<assert test="not(cda:raceCode and not(cda:raceCode/@nullFlavor)) or cda:raceCode and cda:raceCode[@codeSystem = '2.16.840.1.113883.6.238' and @code]">Error: DiagnosticImagingReport - 2.3.12.i.d.6 raceCode
		Conformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-DiagnosticImagingReport_1A_Patient_birthplace_2_3_12_i_d_10-error_mdht" see="#p-DiagnosticImagingReport_1A_Patient_birthplace_2_3_12_i_d_10-error_mdht" name="p-DiagnosticImagingReport_1A_Patient_birthplace_2_3_12_i_d_10-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		-->
	<assert test="count(cda:birthplace) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.d.10 birthplace
		Conformance: MAY contain zero or one [0..1] birthplace (CONF:5395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TS -->

<pattern id="p-DiagnosticImagingReport_1A_TS_value_2_3_12_i_d_2_i-error_mdht" see="#p-DiagnosticImagingReport_1A_TS_value_2_3_12_i_d_2_i-error_mdht" name="p-DiagnosticImagingReport_1A_TS_value_2_3_12_i_d_2_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.value.oclIsUndefined() ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		-->
	<assert test="@nullFlavor or @value">Error: DiagnosticImagingReport - 2.3.12.i.d.2.i value
		Conformance: SHALL contain exactly one [1..1] value (CONF:5299, CONF:5300)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_GeneralHeaderConstraints_2_5-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_GeneralHeaderConstraints_2_5-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_GeneralHeaderConstraints_2_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL: getText(true)=''
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		-->
	<assert test="string(@id=true()// text()) = ''">Error: DiagnosticImagingReport - 2.5 USRealmHeader
		Conformance: 
		Analysis: US Realm Patient Name SHALL NOT contain any mixed content other than whitespace
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_suffix_2_3_12_i_d_5_iv-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_suffix_2_3_12_i_d_5_iv-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_suffix_2_3_12_i_d_5_iv-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameSuffix
		-->
	<assert test="@nullFlavor or not(cda:suffix and cda:suffix[not(@nullFlavor)]) or count(cda:suffix) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.d.5.iv suffix
		Conformance: MAY contain zero or one [0..1] suffix (CONF:7161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_prefix_2_3_12_i_d_5_iii-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_prefix_2_3_12_i_d_5_iii-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_prefix_2_3_12_i_d_5_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNamePrefix
		-->
	<assert test="@nullFlavor or not(cda:prefix and cda:prefix[not(@nullFlavor)]) or cda:prefix">Error: DiagnosticImagingReport - 2.3.12.i.d.5.iii prefix
		Conformance: MAY contain zero or more [0..*] prefix (CONF:7155)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_family_2_3_12_i_d_5_i-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_family_2_3_12_i_d_5_i-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_family_2_3_12_i_d_5_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameFamily
		-->
	<assert test="@nullFlavor or count(cda:family) = 1">Error: DiagnosticImagingReport - 2.3.12.i.d.5.i family
		Conformance: SHALL contain exactly one [1..1] family (CONF:7159, CONF:7160)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_use_2_3_12_i_d_5_v-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_use_2_3_12_i_d_5_v-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_use_2_3_12_i_d_5_v-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'A' or . = 'ABC' or . = 'ASGN' or . = 'C' or . = 'I' or . = 'IDE' or . = 'L' or . = 'P' or . = 'PHON' or . = 'R' or . = 'SNDX' or . = 'SRCH' or . = 'SYL')])">Error: DiagnosticImagingReport - 2.3.12.i.d.5.v use
		Conformance: MAY contain zero or one [0..1] @use (CONF:7154), which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.d.5.v use
		Conformance: MAY contain zero or one [0..1] @use (CONF:7154), which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-DiagnosticImagingReport_1A_USRealmPatientName_given_2_3_12_i_d_5_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_USRealmPatientName_given_2_3_12_i_d_5_ii-error_mdht" name="p-DiagnosticImagingReport_1A_USRealmPatientName_given_2_3_12_i_d_5_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameGiven
		-->
	<assert test="@nullFlavor or cda:given">Error: DiagnosticImagingReport - 2.3.12.i.d.5.ii given
		Conformance: SHALL contain at least one [1..*] given (CONF:7157)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReport_1A_Guardian_telecom_2_3_12_i_d_9_iii-error_mdht" see="#p-DiagnosticImagingReport_1A_Guardian_telecom_2_3_12_i_d_9_iii-error_mdht" name="p-DiagnosticImagingReport_1A_Guardian_telecom_2_3_12_i_d_9_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: DiagnosticImagingReport - 2.3.12.i.d.9.iii telecom
		Conformance: MAY contain zero or more [0..*] telecom
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReport_1A_Guardian_code_2_3_12_i_d_9_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_Guardian_code_2_3_12_i_d_9_ii-error_mdht" name="p-DiagnosticImagingReport_1A_Guardian_code_2_3_12_i_d_9_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: DiagnosticImagingReport - 2.3.12.i.d.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:5326)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReport_1A_Guardian_guardianPerson_2_3_12_i_d_9_iv-error_mdht" see="#p-DiagnosticImagingReport_1A_Guardian_guardianPerson_2_3_12_i_d_9_iv-error_mdht" name="p-DiagnosticImagingReport_1A_Guardian_guardianPerson_2_3_12_i_d_9_iv-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::Person))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson
		-->
	<assert test="count(cda:guardianPerson)=1">Error: DiagnosticImagingReport - 2.3.12.i.d.9.iv guardianPerson
		Conformance: SHALL contain exactly one [1..1] guardianPerson
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReport_1A_Guardian_addr_2_3_12_i_d_9_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Guardian_addr_2_3_12_i_d_9_i-error_mdht" name="p-DiagnosticImagingReport_1A_Guardian_addr_2_3_12_i_d_9_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: DiagnosticImagingReport - 2.3.12.i.d.9.i addr
		Conformance: SHOULD contain zero or more [0..*] addr
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-DiagnosticImagingReport_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_3_12_i_d_9_v-error_mdht" see="#p-DiagnosticImagingReport_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_3_12_i_d_9_v-error_mdht" name="p-DiagnosticImagingReport_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_3_12_i_d_9_v-error_mdht">
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
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code[@codeSystem = '2.16.840.1.113883.5.111' and (@code = 'ADOPT' or @code = 'AUNT' or @code = 'CHILD' or @code = 'CHLDINLAW' or @code = 'COUSN' or @code = 'DOMPART' or @code = 'FAMMEMB' or @code = 'CHLDFOST' or @code = 'GRNDCHILD' or @code = 'GPARNT' or @code = 'GRPRN' or @code = 'GGRPRN' or @code = 'HSIB' or @code = 'MAUNT' or @code = 'MCOUSN' or @code = 'MGRPRN' or @code = 'MGGRPRN' or @code = 'MUNCLE' or @code = 'NCHILD' or @code = 'NPRN' or @code = 'NSIB' or @code = 'NBOR' or @code = 'NIENEPH' or @code = 'PRN' or @code = 'PRNINLAW' or @code = 'PAUNT' or @code = 'PCOUSN' or @code = 'PGRPRN' or @code = 'PGGRPRN' or @code = 'PUNCLE' or @code = 'ROOM' or @code = 'SIB' or @code = 'SIBINLAW' or @code = 'SIGOTHR' or @code = 'SPS' or @code = 'STEP' or @code = 'STPPRN' or @code = 'STPSIB' or @code = 'UNCLE' or @code = 'FRND' or @code = 'RESPRSN' or @code = 'EXCEST' or @code = 'GUADLTM' or @code = 'GUARD' or @code = 'POWATT' or @code = 'DPOWATT' or @code = 'HPOWATT' or @code = 'SPOWATT')]">Error: DiagnosticImagingReport - 2.3.12.i.d.9.v GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty
		Conformance: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC (CONF:5326)
		Analysis: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_d_9_iii_a-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_d_9_iii_a-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_d_9_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.d.9.iii.a use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-DiagnosticImagingReport_1A_Person_name_2_3_12_i_d_9_iv_a-error_mdht" see="#p-DiagnosticImagingReport_1A_Person_name_2_3_12_i_d_9_iv_a-error_mdht" name="p-DiagnosticImagingReport_1A_Person_name_2_3_12_i_d_9_iv_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/guardianPerson
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/guardianPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName
		-->
	<assert test="cda:name">Error: DiagnosticImagingReport - 2.3.12.i.d.9.iv.a name
		Conformance: SHALL contain at least one [1..*] name
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Birthplace -->

<pattern id="p-DiagnosticImagingReport_1A_Birthplace_place_2_3_12_i_d_10_i-error_mdht" see="#p-DiagnosticImagingReport_1A_Birthplace_place_2_3_12_i_d_10_i-error_mdht" name="p-DiagnosticImagingReport_1A_Birthplace_place_2_3_12_i_d_10_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">
		<!--
			OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace::Place))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
		-->
	<assert test="count(cda:place)=1">Error: DiagnosticImagingReport - 2.3.12.i.d.10.i place
		Conformance: SHALL contain exactly one [1..1] place (CONF:5396)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Place -->

<pattern id="p-DiagnosticImagingReport_1A_Place_addr_2_3_12_i_d_10_i_a-error_mdht" see="#p-DiagnosticImagingReport_1A_Place_addr_2_3_12_i_d_10_i_a-error_mdht" name="p-DiagnosticImagingReport_1A_Place_addr_2_3_12_i_d_10_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr
		-->
	<assert test="cda:addr">Error: DiagnosticImagingReport - 2.3.12.i.d.10.i.a addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5397)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReport_1A_LanguageCommunication_preferenceInd_2_3_12_i_d_11_i-error_mdht" see="#p-DiagnosticImagingReport_1A_LanguageCommunication_preferenceInd_2_3_12_i_d_11_i-error_mdht" name="p-DiagnosticImagingReport_1A_LanguageCommunication_preferenceInd_2_3_12_i_d_11_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: DiagnosticImagingReport - 2.3.12.i.d.11.i preferenceInd
		Conformance: MAY contain zero or one [0..1] preferenceInd (CONF:5414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReport_1A_LanguageCommunication_modeCode_2_3_12_i_d_11_iii-error_mdht" see="#p-DiagnosticImagingReport_1A_LanguageCommunication_modeCode_2_3_12_i_d_11_iii-error_mdht" name="p-DiagnosticImagingReport_1A_LanguageCommunication_modeCode_2_3_12_i_d_11_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode">Error: DiagnosticImagingReport - 2.3.12.i.d.11.iii modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode and cda:modeCode[@codeSystem = '2.16.840.1.113883.5.60' and (@code = 'ESGN' or @code = 'ESP' or @code = 'EWR' or @code = 'RSGN' or @code = 'RSP' or @code = 'RWR')]">Error: DiagnosticImagingReport - 2.3.12.i.d.11.iii modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReport_1A_LanguageCommunication_languageCode_2_3_12_i_d_11_iv-error_mdht" see="#p-DiagnosticImagingReport_1A_LanguageCommunication_languageCode_2_3_12_i_d_11_iv-error_mdht" name="p-DiagnosticImagingReport_1A_LanguageCommunication_languageCode_2_3_12_i_d_11_iv-error_mdht">
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
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: DiagnosticImagingReport - 2.3.12.i.d.11.iv languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: DiagnosticImagingReport - 2.3.12.i.d.11.iv languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-DiagnosticImagingReport_1A_LanguageCommunication_proficiencyLevelCode_2_3_12_i_d_11_ii-error_mdht" see="#p-DiagnosticImagingReport_1A_LanguageCommunication_proficiencyLevelCode_2_3_12_i_d_11_ii-error_mdht" name="p-DiagnosticImagingReport_1A_LanguageCommunication_proficiencyLevelCode_2_3_12_i_d_11_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode">Error: DiagnosticImagingReport - 2.3.12.i.d.11.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 STATIC (CONF:9965)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined() and self.proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.proficiencyLevelCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode and cda:proficiencyLevelCode[@codeSystem = '2.16.840.1.113883.5.61' and (@code = 'E' or @code = 'F' or @code = 'G' or @code = 'P')]">Error: DiagnosticImagingReport - 2.3.12.i.d.11.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 STATIC (CONF:9965)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_ProviderOrganization_id_2_3_12_i_e_2-error_mdht" see="#p-DiagnosticImagingReport_1A_ProviderOrganization_id_2_3_12_i_e_2-error_mdht" name="p-DiagnosticImagingReport_1A_ProviderOrganization_id_2_3_12_i_e_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId
		-->
	<assert test="cda:id">Error: DiagnosticImagingReport - 2.3.12.i.e.2 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5417)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_3_12_i_e_5-error_mdht" see="#p-DiagnosticImagingReport_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_3_12_i_e_5-error_mdht" name="p-DiagnosticImagingReport_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_3_12_i_e_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: DiagnosticImagingReport - 2.3.12.i.e.5 GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		Conformance: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996) (CONF:9996)
		Analysis: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_ProviderOrganization_addr_2_3_12_i_e_1-error_mdht" see="#p-DiagnosticImagingReport_1A_ProviderOrganization_addr_2_3_12_i_e_1-error_mdht" name="p-DiagnosticImagingReport_1A_ProviderOrganization_addr_2_3_12_i_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr
		-->
	<assert test="cda:addr">Error: DiagnosticImagingReport - 2.3.12.i.e.1 addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_ProviderOrganization_name_2_3_12_i_e_3-error_mdht" see="#p-DiagnosticImagingReport_1A_ProviderOrganization_name_2_3_12_i_e_3-error_mdht" name="p-DiagnosticImagingReport_1A_ProviderOrganization_name_2_3_12_i_e_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName
		-->
	<assert test="cda:name">Error: DiagnosticImagingReport - 2.3.12.i.e.3 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-DiagnosticImagingReport_1A_ProviderOrganization_telecom_2_3_12_i_e_4-error_mdht" see="#p-DiagnosticImagingReport_1A_ProviderOrganization_telecom_2_3_12_i_e_4-error_mdht" name="p-DiagnosticImagingReport_1A_ProviderOrganization_telecom_2_3_12_i_e_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: DiagnosticImagingReport - 2.3.12.i.e.4 telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5420)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_e_4_i-error_mdht" see="#p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_e_4_i-error_mdht" name="p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_e_4_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: DiagnosticImagingReport - 2.3.12.i.e.4.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7994)
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
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter/cda:encounterParticipant/cda:assignedEntity</assert>
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
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
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
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization">Cannot find context /cda:ClinicalDocument/cda:authorization</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget">Cannot find context /cda:ClinicalDocument/cda:recordTarget</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
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
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_templateId_2_3_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_author_2_3_14-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authenticator_2_3_19-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_confidentialityCode_2_3_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportSectionsHaveText_2_3_19-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_legalAuthenticator_2_3_18-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informationRecipient_2_3_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_informant_2_3_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportUseDiagnosticImagingCode_2_3_13-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_recordTarget_2_3_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_documentationOf_2_3_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_DiagnosticImagingReportAllSectionsHaveTitle_2_3_15-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_languageCode_2_3_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_inFulfillmentOf_2_3_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_title_2_3_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_setId_2_3_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_relatedDocument_2_3_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_typeId_2_3_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_dataEnterer_2_3_15-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_DiagnosticImagingReport_componentOf_2_3_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_effectiveTime_2_3_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_versionNumber_2_3_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_id_2_3_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_custodian_2_3_16-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_code_2_3_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_participant1_2_3_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_realmCode_2_3_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_supportParticipant_2_3_21-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_DiagnosticImagingReport_component_2_3_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DiagnosticImagingReport_authorization_2_3_24-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Participant_associatedEntity_2_3_7_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssociatedEntity_associatedPerson_2_3_7_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Person_name_2_3_7_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DocumentationOf_serviceEvent3_2_3_9_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ServiceEvent4_id_2_3_9_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ServiceEvent4_classCode_2_3_9_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ServiceEvent4_code_2_3_9_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ServiceEvent4_physicianReadingStudyPerformer_2_3_9_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_typeCode_2_3_9_i_d_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_templateId_2_3_9_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_assignedEntity_2_3_9_i_d_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PhysicianReadingStudyPerformer_time_2_3_9_i_d_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasDICOM_2_3_9_i_d_4_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_9_i_d_4_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId_2_3_9_i_d_4_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_9_i_d_4_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization_2_3_9_i_d_4_v-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_ComponentOf_encompassingEncounter_2_3_11_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_EncompassingEncounter7_physicianofRecordParticipant_2_3_11_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_EncompassingEncounter7_effectiveTime_2_3_11_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_EncompassingEncounter7_responsibleParty_2_3_11_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_EncompassingEncounter7_id_2_3_11_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_templateId_2_3_11_i_c_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_typeCode_2_3_11_i_c_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_PhysicianofRecordParticipant_assignedEntity_2_3_11_i_c_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_id_2_3_11_i_c_3_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_AssignedEntity_2_3_9_i_d_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode_2_3_11_i_c_3_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_code_2_3_11_i_c_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_assignedPerson_2_3_11_i_c_3_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedPerson_name_2_3_11_i_c_3_iii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_ResponsibleParty_assignedEntity_2_3_11_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_AssignedEntity_DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization_2_3_11_i_d_1_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_Component_structuredBody_2_3_12_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_StructuredBody_findingsSection_2_3_12_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_StructuredBody_dICOMObjectCatalogSection_2_3_12_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_Component_findingsSection_2_3_12_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_FindingsSection_templateId_3_16_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_Component_dICOMObjectCatalogSection_2_3_12_i_b_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_code_3_11_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_DICOMObjectCatalogSection_entry_3_11_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_2_DICOMObjectCatalogSection_templateId_3_11_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyActEntry_studyAct_3_11_3_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_effectiveTime_4_72_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_moodCode_4_72_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_classCode_4_72_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_StudyActIdsHaveRoot_4_72_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_text_4_72_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_templateId_4_72_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_StudyActNoIdExtension_4_72_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_id_4_72_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_code_4_72_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_StudyAct_entryRelationship_4_72_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesActEntryRelationship_seriesAct_4_72_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_moodCode_4_67_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_effectiveTime_4_67_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_text_4_67_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_entryRelationship_4_67_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_id_4_67_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_classCode_4_67_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_SeriesActIdHasRoot_4_67_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_templateId_4_67_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SeriesAct_code_4_67_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_67_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeHasValue_4_71_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoHigh_4_71_13-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_classCode_4_71_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_text_4_71_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_templateId_4_71_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_effectiveTime_4_71_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_moodCode_4_71_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_entryRelationship_4_71_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_id_4_71_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_SOPInstanceObservationEffectiveTimeNoLow_4_71_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservation_code_4_71_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_3A_SOPInstanceObservationEntryRelationship_sOPInstanceObservation_4_71_8_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Author_time_2_3_14_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Author_assignedAuthor_2_3_14_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedAuthor_telecom_2_3_14_ii_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedAuthor_addr_2_3_14_ii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedAuthor_code_2_3_14_ii_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedAuthor_id_2_3_14_ii_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_3_12_i_a_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_postalCode_2_3_12_i_a_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_state_2_3_12_i_a_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_use_2_3_12_i_a_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_city_2_3_12_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_streetAddressLine_2_3_12_i_a_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmAddress_country_2_3_12_i_a_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_3_14_ii_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AuthoringDevice_softwareName_2_3_14_ii_e_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AuthoringDevice_manufacturerModelName_2_3_14_ii_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Person_name_2_3_14_ii_f_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_DataEnterer_assignedEntity_2_3_15_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_15_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_15_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_15_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_15_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_15_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_ProviderOrganization_2_3_12_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_3_15_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Person_name_2_3_15_i_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Custodian_assignedCustodian_2_3_16_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedCustodian_representedCustodianOrganization_2_3_16_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_CustodianOrganization_ProviderOrganization_2_3_12_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_CustodianOrganization_id_2_3_16_i_a_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_CustodianOrganization_telecom_2_3_16_i_a_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_CustodianOrganization_name_2_3_16_i_a_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_CustodianOrganization_addr_2_3_16_i_a_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_3_16_i_a_4_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LegalAuthenticator_time_2_3_18_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LegalAuthenticator_signatureCode_2_3_18_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LegalAuthenticator_assignedEntity_2_3_18_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_18_iii_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_18_iii_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_18_iii_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_18_iii_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_18_iii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_3_18_iii_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Person_name_2_3_18_iii_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Authenticator_signatureCode_2_3_19_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Authenticator_time_2_3_19_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Authenticator_assignedEntity_2_3_19_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_addr_2_3_19_iii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_id_2_3_19_iii_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_code_2_3_19_iii_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_assignedPerson_2_3_19_iii_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_AssignedEntity_telecom_2_3_19_iii_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_3_19_iii_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Person_name_2_3_19_iii_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_3_21_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ParticipantSupport_time_2_3_21_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Authorization_consent_2_3_24_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Consent_id_2_3_24_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Consent_statusCode_2_3_24_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Consent_code_2_3_24_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_RecordTarget_patientRole_2_3_12_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PatientRole_addr_2_3_12_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PatientRole_telecom_2_3_12_i_c-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PatientRole_id_2_3_12_i_b-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PatientRole_providerOrganization_2_3_12_i_e-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_PatientRole_patient_2_3_12_i_d-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_c_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_maritalStatusCode_2_3_12_i_d_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_3_12_i_d_12-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_religiousAffiliationCode_2_3_12_i_d_7-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_languageCommunication_2_3_12_i_d_11-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_name_2_3_12_i_d_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_birthTime_2_3_12_i_d_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_administrativeGenderCode_2_3_12_i_d_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_sDTCRaceCode_2_3_12_i_d_8-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_ethnicGroupCode_2_3_12_i_d_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_guardian_2_3_12_i_d_9-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_raceCode_2_3_12_i_d_6-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Patient_birthplace_2_3_12_i_d_10-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TS_value_2_3_12_i_d_2_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_GeneralHeaderConstraints_2_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_suffix_2_3_12_i_d_5_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_prefix_2_3_12_i_d_5_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_family_2_3_12_i_d_5_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_use_2_3_12_i_d_5_v-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_USRealmPatientName_given_2_3_12_i_d_5_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Guardian_telecom_2_3_12_i_d_9_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Guardian_code_2_3_12_i_d_9_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Guardian_guardianPerson_2_3_12_i_d_9_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Guardian_addr_2_3_12_i_d_9_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_3_12_i_d_9_v-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_d_9_iii_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Person_name_2_3_12_i_d_9_iv_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Birthplace_place_2_3_12_i_d_10_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_Place_addr_2_3_12_i_d_10_i_a-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LanguageCommunication_preferenceInd_2_3_12_i_d_11_i-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LanguageCommunication_modeCode_2_3_12_i_d_11_iii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LanguageCommunication_languageCode_2_3_12_i_d_11_iv-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_LanguageCommunication_proficiencyLevelCode_2_3_12_i_d_11_ii-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ProviderOrganization_id_2_3_12_i_e_2-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_3_12_i_e_5-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ProviderOrganization_addr_2_3_12_i_e_1-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ProviderOrganization_name_2_3_12_i_e_3-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_ProviderOrganization_telecom_2_3_12_i_e_4-error_mdht"/>
	<active pattern = "p-DiagnosticImagingReport_1A_TEL_use_2_3_12_i_e_4_i-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
