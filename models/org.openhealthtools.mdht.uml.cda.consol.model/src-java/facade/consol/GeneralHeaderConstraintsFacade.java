package facade.consol;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.openhealthtools.mdht.uml.cda.*;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.*;
import org.openhealthtools.mdht.uml.hl7.vocab.*;

public class GeneralHeaderConstraintsFacade extends facade.FacadeBase {

	public ClinicalDocument self;

	public static String TEMPLATEID = "2.16.840.1.113883.10.20.22.1.1";

	public GeneralHeaderConstraintsFacade()
	{
		this.self = CDAFactory.eINSTANCE.createClinicalDocument();
	}

	public GeneralHeaderConstraintsFacade(ClinicalDocument self)
	{
		this.self = self;
	}

	public static boolean isKindOf(ClinicalDocument self)
	{
		return true;
	}

	@Override
	public Object getModelElement()
	{
		return self;
	}

	public void Init()
	{
		GetOrCreateTemplateId().self.setRoot("2.16.840.1.113883.10.20.22.1.1");
		GetOrCreateRealmCode();
		GetOrCreateRealmCode().self.setCode("US");
		GetOrCreateTypeId();
		GetOrCreateId();
		GetOrCreateCode();
		GetOrCreateTitle();
		GetOrCreateEffectiveTime();
		GetOrCreateConfidentialityCode();
		GetOrCreateLanguageCode();
		GetOrCreateRecordTarget();
		GetOrCreateAuthor();
		GetOrCreateCustodian();
		GetOrCreateComponent();
	}

	/**
	 *UML path: /GeneralHeaderConstraints
	 *UML root path: /GeneralHeaderConstraints
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsSetIdVersionNumber(vb, del);
			ValidateGeneralHeaderConstraintsVersionNumberSetId(vb, del);
			ValidateGeneralHeaderConstraintsTemplateId(vb, del);
			ValidateGeneralHeaderConstraintsRealmCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRealmCode(vb, del);
			ValidateGeneralHeaderConstraintsTypeId(vb, del);
			ValidateGeneralHeaderConstraintsId(vb, del);
			ValidateGeneralHeaderConstraintsCode(vb, del);
			ValidateGeneralHeaderConstraintsTitle(vb, del);
			ValidateGeneralHeaderConstraintsEffectiveTime(vb, del);
			ValidateGeneralHeaderConstraintsConfidentialityCodeP(vb, del);
			ValidateGeneralHeaderConstraintsConfidentialityCode(vb, del);
			ValidateGeneralHeaderConstraintsLanguageCode(vb, del);
			ValidateGeneralHeaderConstraintsLanguageCodeP(vb, del);
			ValidateGeneralHeaderConstraintsSetId(vb, del);
			ValidateGeneralHeaderConstraintsVersionNumber(vb, del);
			ValidateGeneralHeaderConstraintsAuthor(vb, del);
			ValidateGeneralHeaderConstraintsDataEnterer(vb, del);
			ValidateGeneralHeaderConstraintsCustodian(vb, del);
			ValidateGeneralHeaderConstraintsInformationRecipient(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticator(vb, del);
			ValidateGeneralHeaderConstraintsAuthenticator(vb, del);
			ValidateGeneralHeaderConstraintsRecordTarget(vb, del);
			ValidateGeneralHeaderConstraintsComponentOf(vb, del);
			ValidateGeneralHeaderConstraintsInformant(vb, del);
			ValidateGeneralHeaderConstraintsSupportParticipant(vb, del);
			ValidateGeneralHeaderConstraintsInFulfillmentOf(vb, del);
			ValidateGeneralHeaderConstraintsDocumentationOf(vb, del);
			ValidateGeneralHeaderConstraintsAuthorization(vb, del);
			ValidateGeneralHeaderConstraintsTemplateId(vb, del);

			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			code().forEach(x -> x.Validate(vb, del));
			title().forEach(x -> x.Validate(vb, del));
			effectiveTime().forEach(x -> x.Validate(vb, del));
			confidentialityCode().forEach(x -> x.Validate(vb, del));
			languageCode().forEach(x -> x.Validate(vb, del));
			recordTarget().forEach(x -> x.Validate(vb, del));
			componentOf().forEach(x -> x.Validate(vb, del));
			author().forEach(x -> x.Validate(vb, del));
			dataEnterer().forEach(x -> x.Validate(vb, del));
			custodian().forEach(x -> x.Validate(vb, del));
			informationRecipient().forEach(x -> x.Validate(vb, del));
			legalAuthenticator().forEach(x -> x.Validate(vb, del));
			authenticator().forEach(x -> x.Validate(vb, del));
			setId().forEach(x -> x.Validate(vb, del));
			versionNumber().forEach(x -> x.Validate(vb, del));
			informant().forEach(x -> x.Validate(vb, del));
			supportParticipant().forEach(x -> x.Validate(vb, del));
			inFulfillmentOf().forEach(x -> x.Validate(vb, del));
			documentationOf().forEach(x -> x.Validate(vb, del));
			authorization().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			copyTime().forEach(x -> x.Validate(vb, del));
			participant().forEach(x -> x.Validate(vb, del));
			relatedDocument().forEach(x -> x.Validate(vb, del));
			component().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: not self.setId.oclIsUndefined() implies not self.versionNumber.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsSetIdVersionNumber
	 */
	public boolean ValidateGeneralHeaderConstraintsSetIdVersionNumber(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getSetId()).count()==0 || !(Set(self.getVersionNumber()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.27 GeneralHeaderConstraintsSetIdVersionNumber\n\t\tConformance: If setId is present versionNumber SHALL be present (CONF:6380)\n\t\tAnalysis: If setId is present versionNumber SHALL be present\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.versionNumber.oclIsUndefined() implies not self.setId.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsVersionNumberSetId
	 */
	public boolean ValidateGeneralHeaderConstraintsVersionNumberSetId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getVersionNumber()).count()==0 || !(Set(self.getSetId()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.27 GeneralHeaderConstraintsSetIdVersionNumber\n\t\tConformance: If setId is present versionNumber SHALL be present (CONF:6380)\n\t\tAnalysis: If versionNumber is present setId SHALL be present\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsTemplateId
	 */
	public boolean ValidateGeneralHeaderConstraintsTemplateId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getTemplateIds()).anyMatch(i533 -> Set(i533.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.1.1"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.1 templateId\n\t\tConformance: SHALL contain exactly one [1..1] templateId ( CONF:5252, CONF:10036 ) such that it SHALL contain exactly one [1..1] @root=\"2.16.840.1.113883.10.20.22.1.1\"\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: true
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsRealmCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRealmCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = true;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.2 realmCode\n\t\tConformance: SHALL contain exactly one [1..1] realmCode/@code=\"US\"  (CONF:16791)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and  let value : datatypes::CS = element.oclAsType(datatypes::CS) in  value.code = 'US')
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsRealmCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRealmCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getRealmCodes()).count())==1 && Set(self.getRealmCodes()).allMatch(i539 -> !(Set(i539).count()==0) && true && Set(i539).filter(i542 -> Set(i542.getCode()).collect(Collectors.toList()).contains("US")).count()!=0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.2 realmCode\n\t\tConformance: SHALL contain exactly one [1..1] realmCode/@code=\"US\"  (CONF:16791)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.typeId.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsTypeId
	 */
	public boolean ValidateGeneralHeaderConstraintsTypeId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getTypeId()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.3 typeId\n\t\tConformance: SHALL contain exactly one [1..1] typeId (CONF:5361)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsId
	 */
	public boolean ValidateGeneralHeaderConstraintsId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getId()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.4 id\n\t\tConformance: SHALL contain exactly one [1..1] id (CONF:5363)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.code.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsCode
	 */
	public boolean ValidateGeneralHeaderConstraintsCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.5 code\n\t\tConformance: SHALL contain exactly one [1..1] code (CONF:5253)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.title.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsTitle
	 */
	public boolean ValidateGeneralHeaderConstraintsTitle(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getTitle()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.6 title\n\t\tConformance: SHALL contain exactly one [1..1] title (CONF:5254)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.effectiveTime.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsEffectiveTime
	 */
	public boolean ValidateGeneralHeaderConstraintsEffectiveTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getEffectiveTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.7 effectiveTime\n\t\tConformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.confidentialityCode.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsConfidentialityCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsConfidentialityCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getConfidentialityCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.8 confidentialityCode\n\t\tConformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC (CONF:5259)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsConfidentialityCode
	 */
	public boolean ValidateGeneralHeaderConstraintsConfidentialityCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getConfidentialityCode()).count()==0) && true && Set(self.getConfidentialityCode()).filter(i563 -> Set(i563.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.25") && (Set(i563.getCode()).collect(Collectors.toList()).contains("N") || Set(i563.getCode()).collect(Collectors.toList()).contains("R") || Set(i563.getCode()).collect(Collectors.toList()).contains("V"))).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.8 confidentialityCode\n\t\tConformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC (CONF:5259)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and  let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in  not value.code.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsLanguageCode
	 */
	public boolean ValidateGeneralHeaderConstraintsLanguageCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getLanguageCode()).count()==0) && true && Set(self.getLanguageCode()).filter(i571 -> !(Set(i571.getCode()).count()==0)).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.9 languageCode\n\t\tConformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.languageCode.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsLanguageCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsLanguageCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getLanguageCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.9 languageCode\n\t\tConformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsSetId
	 */
	public boolean ValidateGeneralHeaderConstraintsSetId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getSetId()).count()==0) && Set(self.getSetId()).anyMatch(i579 -> i579.isNullFlavorUndefined())) || !(Set(self.getSetId()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.10 setId\n\t\tConformance: MAY contain zero or one [0..1] setId (CONF:5261)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsVersionNumber
	 */
	public boolean ValidateGeneralHeaderConstraintsVersionNumber(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getVersionNumber()).count()==0) && Set(self.getVersionNumber()).anyMatch(i583 -> i583.isNullFlavorUndefined())) || !(Set(self.getVersionNumber()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.11 versionNumber\n\t\tConformance: MAY contain zero or one [0..1] versionNumber (CONF:5264)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsAuthor
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthor(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getAuthors()).anyMatch(i587 -> !(Set(i587).count()==0) && true);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.14 author\n\t\tConformance: SHALL contain at least one [1..*] author (CONF:5444)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsDataEnterer
	 */
	public boolean ValidateGeneralHeaderConstraintsDataEnterer(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getDataEnterer()).filter(i593 -> !(Set(i593).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.15 dataEnterer\n\t\tConformance: MAY contain zero or one [0..1] dataEnterer (CONF:5441)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsCustodian
	 */
	public boolean ValidateGeneralHeaderConstraintsCustodian(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getCustodian()).filter(i599 -> !(Set(i599).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.16 custodian\n\t\tConformance: SHALL contain exactly one [1..1] custodian (iv., CONF:5519)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsInformationRecipient
	 */
	public boolean ValidateGeneralHeaderConstraintsInformationRecipient(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getInformationRecipients()).filter(i605 -> !(Set(i605).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.17 informationRecipient\n\t\tConformance: MAY contain zero or more [0..*] informationRecipient (CONF:5565)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsLegalAuthenticator
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticator(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getLegalAuthenticator()).filter(i611 -> !(Set(i611).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18 legalAuthenticator\n\t\tConformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:5579)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsAuthenticator
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthenticator(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getAuthenticators()).filter(i617 -> !(Set(i617).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.19 authenticator\n\t\tConformance: MAY contain zero or more [0..*] authenticator (CONF:5607)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsRecordTarget
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTarget(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getRecordTargets()).anyMatch(i623 -> !(Set(i623).count()==0) && true);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12 recordTarget\n\t\tConformance: SHALL contain at least one [1..*] recordTarget (CONF:5266)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsComponentOf
	 */
	public boolean ValidateGeneralHeaderConstraintsComponentOf(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = One(Set(self.getComponentOf()).filter(i629 -> !(Set(i629).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.13 componentOf\n\t\tConformance: MAY contain zero or one [0..1] componentOf (CONF:9955)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsInformant
	 */
	public boolean ValidateGeneralHeaderConstraintsInformant(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getInformants()).filter(i635 -> !(Set(i635).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.20 informant\n\t\tConformance: MAY contain zero or more [0..*] informant (CONF:8001)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsSupportParticipant
	 */
	public boolean ValidateGeneralHeaderConstraintsSupportParticipant(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getParticipants()).filter(i641 -> !(Set(i641).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.21 supportParticipant\n\t\tConformance: MAY contain zero or more [0..*] participant (CONF:10003)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsInFulfillmentOf
	 */
	public boolean ValidateGeneralHeaderConstraintsInFulfillmentOf(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getInFulfillmentOfs()).filter(i647 -> !(Set(i647).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.22 inFulfillmentOf\n\t\tConformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:9952)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.documentationOf->select(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))->size() >= 0
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsDocumentationOf
	 */
	public boolean ValidateGeneralHeaderConstraintsDocumentationOf(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getDocumentationOfs()).filter(i653 -> !(Set(i653).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.23 documentationOf\n\t\tConformance: MAY contain zero or more [0..*] documentationOf (CONF:14835)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsAuthorization
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthorization(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getAuthorizations()).filter(i659 -> !(Set(i659).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.24 authorization\n\t\tConformance: MAY contain zero or more [0..*] authorization (CONF:16792)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')
	 * Context: /GeneralHeaderConstraints
	 * Context Class: consol::GeneralHeaderConstraints
	 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsTemplateId
	 */
	public boolean ValidateGeneralHeaderConstraintsTemplateId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getTemplateIds()).anyMatch(i667 -> Set(i667.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.1.1"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.1 templateId\n\t\tConformance: SHALL contain exactly one [1..1] templateId ( CONF:5252, CONF:10036 ) such that it SHALL contain exactly one [1..1] @root=\"2.16.840.1.113883.10.20.22.1.1\"\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.CSFacade> realmCode()
	{
		return Set(self.getRealmCodes()).filter( x -> x instanceof CS).map( x -> (CS) x).map( x -> new facade.datatypes.CSFacade(x));
	}

	public facade.datatypes.CSFacade GetOrCreateRealmCode()
	{
		Optional<facade.datatypes.CSFacade> lastOrDefault = realmCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_RealmCode());
			return lastOrDefault.get();
		}
		return CreateAnotherRealmCode();
	}

	public facade.datatypes.CSFacade CreateAnotherRealmCode()
	{
		CS element = DatatypesFactory.eINSTANCE.createCS();
		facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
		elementFacade.Init();
		self.getRealmCodes().add(element);
		return elementFacade;
	}

	public facade.datatypes.CSFacade RealmCode() {
		return GetOrCreateRealmCode();
	}

	public Stream<facade.cda.InfrastructureRootTypeIdFacade> typeId()
	{
		return Set(self.getTypeId()).filter( x -> facade.cda.InfrastructureRootTypeIdFacade.isKindOf(x)).map( x -> new facade.cda.InfrastructureRootTypeIdFacade(x));
	}

	public facade.cda.InfrastructureRootTypeIdFacade GetOrCreateTypeId()
	{
		Optional<facade.cda.InfrastructureRootTypeIdFacade> lastOrDefault = typeId().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_TypeId());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeId();
	}

	public facade.cda.InfrastructureRootTypeIdFacade CreateAnotherTypeId()
	{
		InfrastructureRootTypeId element = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
		facade.cda.InfrastructureRootTypeIdFacade elementFacade = new facade.cda.InfrastructureRootTypeIdFacade(element);
		elementFacade.Init();
		self.setTypeId(element);
		return elementFacade;
	}

	public facade.cda.InfrastructureRootTypeIdFacade TypeId() {
		return GetOrCreateTypeId();
	}

	public Stream<facade.datatypes.IIFacade> id()
	{
		return Set(self.getId()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Id());
			return lastOrDefault.get();
		}
		return CreateAnotherId();
	}

	public facade.datatypes.IIFacade CreateAnotherId()
	{
		II element = DatatypesFactory.eINSTANCE.createII();
		facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
		elementFacade.Init();
		self.setId(element);
		return elementFacade;
	}

	public facade.datatypes.IIFacade Id() {
		return GetOrCreateId();
	}

	public Stream<facade.datatypes.CEFacade> code()
	{
		return Set(self.getCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = code().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Code());
			return lastOrDefault.get();
		}
		return CreateAnotherCode();
	}

	public facade.datatypes.CEFacade CreateAnotherCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade Code() {
		return GetOrCreateCode();
	}

	public Stream<facade.datatypes.STFacade> title()
	{
		return Set(self.getTitle()).filter( x -> x instanceof ST).map( x -> (ST) x).map( x -> new facade.datatypes.STFacade(x));
	}

	public facade.datatypes.STFacade GetOrCreateTitle()
	{
		Optional<facade.datatypes.STFacade> lastOrDefault = title().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Title());
			return lastOrDefault.get();
		}
		return CreateAnotherTitle();
	}

	public facade.datatypes.STFacade CreateAnotherTitle()
	{
		ST element = DatatypesFactory.eINSTANCE.createST();
		facade.datatypes.STFacade elementFacade = new facade.datatypes.STFacade(element);
		elementFacade.Init();
		self.setTitle(element);
		return elementFacade;
	}

	public facade.datatypes.STFacade Title() {
		return GetOrCreateTitle();
	}

	public Stream<facade.datatypes.TSFacade> effectiveTime()
	{
		return Set(self.getEffectiveTime()).filter( x -> x instanceof TS).map( x -> (TS) x).map( x -> new facade.datatypes.TSFacade(x));
	}

	public facade.datatypes.TSFacade GetOrCreateEffectiveTime()
	{
		Optional<facade.datatypes.TSFacade> lastOrDefault = effectiveTime().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_EffectiveTime());
			return lastOrDefault.get();
		}
		return CreateAnotherEffectiveTime();
	}

	public facade.datatypes.TSFacade CreateAnotherEffectiveTime()
	{
		TS element = DatatypesFactory.eINSTANCE.createTS();
		facade.datatypes.TSFacade elementFacade = new facade.datatypes.TSFacade(element);
		elementFacade.Init();
		self.setEffectiveTime(element);
		return elementFacade;
	}

	public facade.datatypes.TSFacade EffectiveTime() {
		return GetOrCreateEffectiveTime();
	}

	public Stream<facade.datatypes.CEFacade> confidentialityCode()
	{
		return Set(self.getConfidentialityCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateConfidentialityCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = confidentialityCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_ConfidentialityCode());
			return lastOrDefault.get();
		}
		return CreateAnotherConfidentialityCode();
	}

	public facade.datatypes.CEFacade CreateAnotherConfidentialityCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setConfidentialityCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade ConfidentialityCode() {
		return GetOrCreateConfidentialityCode();
	}

	public Stream<facade.datatypes.CSFacade> languageCode()
	{
		return Set(self.getLanguageCode()).filter( x -> x instanceof CS).map( x -> (CS) x).map( x -> new facade.datatypes.CSFacade(x));
	}

	public facade.datatypes.CSFacade GetOrCreateLanguageCode()
	{
		Optional<facade.datatypes.CSFacade> lastOrDefault = languageCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_LanguageCode());
			return lastOrDefault.get();
		}
		return CreateAnotherLanguageCode();
	}

	public facade.datatypes.CSFacade CreateAnotherLanguageCode()
	{
		CS element = DatatypesFactory.eINSTANCE.createCS();
		facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
		elementFacade.Init();
		self.setLanguageCode(element);
		return elementFacade;
	}

	public facade.datatypes.CSFacade LanguageCode() {
		return GetOrCreateLanguageCode();
	}

	public Stream<facade.consol.generalheaderconstraints.RecordTargetFacade> recordTarget()
	{
		return Set(self.getRecordTargets()).filter( x -> facade.consol.generalheaderconstraints.RecordTargetFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.RecordTargetFacade(x));
	}

	public facade.consol.generalheaderconstraints.RecordTargetFacade GetOrCreateRecordTarget()
	{
		Optional<facade.consol.generalheaderconstraints.RecordTargetFacade> lastOrDefault = recordTarget().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_RecordTarget());
			return lastOrDefault.get();
		}
		return CreateAnotherRecordTarget();
	}

	public facade.consol.generalheaderconstraints.RecordTargetFacade CreateAnotherRecordTarget()
	{
		RecordTarget element = CDAFactory.eINSTANCE.createRecordTarget();
		facade.consol.generalheaderconstraints.RecordTargetFacade elementFacade = new facade.consol.generalheaderconstraints.RecordTargetFacade(element);
		elementFacade.Init();
		self.getRecordTargets().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.RecordTargetFacade RecordTarget() {
		return GetOrCreateRecordTarget();
	}

	public Stream<facade.consol.generalheaderconstraints.ComponentOfFacade> componentOf()
	{
		return Set(self.getComponentOf()).filter( x -> facade.consol.generalheaderconstraints.ComponentOfFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.ComponentOfFacade(x));
	}

	public facade.consol.generalheaderconstraints.ComponentOfFacade GetOrCreateComponentOf()
	{
		Optional<facade.consol.generalheaderconstraints.ComponentOfFacade> lastOrDefault = componentOf().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_ComponentOf());
			return lastOrDefault.get();
		}
		return CreateAnotherComponentOf();
	}

	public facade.consol.generalheaderconstraints.ComponentOfFacade CreateAnotherComponentOf()
	{
		Component1 element = CDAFactory.eINSTANCE.createComponent1();
		facade.consol.generalheaderconstraints.ComponentOfFacade elementFacade = new facade.consol.generalheaderconstraints.ComponentOfFacade(element);
		elementFacade.Init();
		self.setComponentOf(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.ComponentOfFacade ComponentOf() {
		return GetOrCreateComponentOf();
	}

	public Stream<facade.consol.generalheaderconstraints.AuthorFacade> author()
	{
		return Set(self.getAuthors()).filter( x -> facade.consol.generalheaderconstraints.AuthorFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.AuthorFacade(x));
	}

	public facade.consol.generalheaderconstraints.AuthorFacade GetOrCreateAuthor()
	{
		Optional<facade.consol.generalheaderconstraints.AuthorFacade> lastOrDefault = author().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Author());
			return lastOrDefault.get();
		}
		return CreateAnotherAuthor();
	}

	public facade.consol.generalheaderconstraints.AuthorFacade CreateAnotherAuthor()
	{
		Author element = CDAFactory.eINSTANCE.createAuthor();
		facade.consol.generalheaderconstraints.AuthorFacade elementFacade = new facade.consol.generalheaderconstraints.AuthorFacade(element);
		elementFacade.Init();
		self.getAuthors().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.AuthorFacade Author() {
		return GetOrCreateAuthor();
	}

	public Stream<facade.consol.generalheaderconstraints.DataEntererFacade> dataEnterer()
	{
		return Set(self.getDataEnterer()).filter( x -> facade.consol.generalheaderconstraints.DataEntererFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.DataEntererFacade(x));
	}

	public facade.consol.generalheaderconstraints.DataEntererFacade GetOrCreateDataEnterer()
	{
		Optional<facade.consol.generalheaderconstraints.DataEntererFacade> lastOrDefault = dataEnterer().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_DataEnterer());
			return lastOrDefault.get();
		}
		return CreateAnotherDataEnterer();
	}

	public facade.consol.generalheaderconstraints.DataEntererFacade CreateAnotherDataEnterer()
	{
		DataEnterer element = CDAFactory.eINSTANCE.createDataEnterer();
		facade.consol.generalheaderconstraints.DataEntererFacade elementFacade = new facade.consol.generalheaderconstraints.DataEntererFacade(element);
		elementFacade.Init();
		self.setDataEnterer(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.DataEntererFacade DataEnterer() {
		return GetOrCreateDataEnterer();
	}

	public Stream<facade.consol.generalheaderconstraints.CustodianFacade> custodian()
	{
		return Set(self.getCustodian()).filter( x -> facade.consol.generalheaderconstraints.CustodianFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.CustodianFacade(x));
	}

	public facade.consol.generalheaderconstraints.CustodianFacade GetOrCreateCustodian()
	{
		Optional<facade.consol.generalheaderconstraints.CustodianFacade> lastOrDefault = custodian().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Custodian());
			return lastOrDefault.get();
		}
		return CreateAnotherCustodian();
	}

	public facade.consol.generalheaderconstraints.CustodianFacade CreateAnotherCustodian()
	{
		Custodian element = CDAFactory.eINSTANCE.createCustodian();
		facade.consol.generalheaderconstraints.CustodianFacade elementFacade = new facade.consol.generalheaderconstraints.CustodianFacade(element);
		elementFacade.Init();
		self.setCustodian(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.CustodianFacade Custodian() {
		return GetOrCreateCustodian();
	}

	public Stream<facade.consol.generalheaderconstraints.InformationRecipientFacade> informationRecipient()
	{
		return Set(self.getInformationRecipients()).filter( x -> facade.consol.generalheaderconstraints.InformationRecipientFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.InformationRecipientFacade(x));
	}

	public facade.consol.generalheaderconstraints.InformationRecipientFacade GetOrCreateInformationRecipient()
	{
		Optional<facade.consol.generalheaderconstraints.InformationRecipientFacade> lastOrDefault = informationRecipient().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_InformationRecipient());
			return lastOrDefault.get();
		}
		return CreateAnotherInformationRecipient();
	}

	public facade.consol.generalheaderconstraints.InformationRecipientFacade CreateAnotherInformationRecipient()
	{
		InformationRecipient element = CDAFactory.eINSTANCE.createInformationRecipient();
		facade.consol.generalheaderconstraints.InformationRecipientFacade elementFacade = new facade.consol.generalheaderconstraints.InformationRecipientFacade(element);
		elementFacade.Init();
		self.getInformationRecipients().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.InformationRecipientFacade InformationRecipient() {
		return GetOrCreateInformationRecipient();
	}

	public Stream<facade.consol.generalheaderconstraints.LegalAuthenticatorFacade> legalAuthenticator()
	{
		return Set(self.getLegalAuthenticator()).filter( x -> facade.consol.generalheaderconstraints.LegalAuthenticatorFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.LegalAuthenticatorFacade(x));
	}

	public facade.consol.generalheaderconstraints.LegalAuthenticatorFacade GetOrCreateLegalAuthenticator()
	{
		Optional<facade.consol.generalheaderconstraints.LegalAuthenticatorFacade> lastOrDefault = legalAuthenticator().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_LegalAuthenticator());
			return lastOrDefault.get();
		}
		return CreateAnotherLegalAuthenticator();
	}

	public facade.consol.generalheaderconstraints.LegalAuthenticatorFacade CreateAnotherLegalAuthenticator()
	{
		LegalAuthenticator element = CDAFactory.eINSTANCE.createLegalAuthenticator();
		facade.consol.generalheaderconstraints.LegalAuthenticatorFacade elementFacade = new facade.consol.generalheaderconstraints.LegalAuthenticatorFacade(element);
		elementFacade.Init();
		self.setLegalAuthenticator(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.LegalAuthenticatorFacade LegalAuthenticator() {
		return GetOrCreateLegalAuthenticator();
	}

	public Stream<facade.consol.generalheaderconstraints.AuthenticatorFacade> authenticator()
	{
		return Set(self.getAuthenticators()).filter( x -> facade.consol.generalheaderconstraints.AuthenticatorFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.AuthenticatorFacade(x));
	}

	public facade.consol.generalheaderconstraints.AuthenticatorFacade GetOrCreateAuthenticator()
	{
		Optional<facade.consol.generalheaderconstraints.AuthenticatorFacade> lastOrDefault = authenticator().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Authenticator());
			return lastOrDefault.get();
		}
		return CreateAnotherAuthenticator();
	}

	public facade.consol.generalheaderconstraints.AuthenticatorFacade CreateAnotherAuthenticator()
	{
		Authenticator element = CDAFactory.eINSTANCE.createAuthenticator();
		facade.consol.generalheaderconstraints.AuthenticatorFacade elementFacade = new facade.consol.generalheaderconstraints.AuthenticatorFacade(element);
		elementFacade.Init();
		self.getAuthenticators().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.AuthenticatorFacade Authenticator() {
		return GetOrCreateAuthenticator();
	}

	public Stream<facade.datatypes.IIFacade> setId()
	{
		return Set(self.getSetId()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateSetId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = setId().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_SetId());
			return lastOrDefault.get();
		}
		return CreateAnotherSetId();
	}

	public facade.datatypes.IIFacade CreateAnotherSetId()
	{
		II element = DatatypesFactory.eINSTANCE.createII();
		facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
		elementFacade.Init();
		self.setSetId(element);
		return elementFacade;
	}

	public facade.datatypes.IIFacade SetId() {
		return GetOrCreateSetId();
	}

	public Stream<facade.datatypes.INTFacade> versionNumber()
	{
		return Set(self.getVersionNumber()).filter( x -> x instanceof INT).map( x -> (INT) x).map( x -> new facade.datatypes.INTFacade(x));
	}

	public facade.datatypes.INTFacade GetOrCreateVersionNumber()
	{
		Optional<facade.datatypes.INTFacade> lastOrDefault = versionNumber().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_VersionNumber());
			return lastOrDefault.get();
		}
		return CreateAnotherVersionNumber();
	}

	public facade.datatypes.INTFacade CreateAnotherVersionNumber()
	{
		INT element = DatatypesFactory.eINSTANCE.createINT();
		facade.datatypes.INTFacade elementFacade = new facade.datatypes.INTFacade(element);
		elementFacade.Init();
		self.setVersionNumber(element);
		return elementFacade;
	}

	public facade.datatypes.INTFacade VersionNumber() {
		return GetOrCreateVersionNumber();
	}

	public Stream<facade.consol.generalheaderconstraints.InformantFacade> informant()
	{
		return Set(self.getInformants()).filter( x -> facade.consol.generalheaderconstraints.InformantFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.InformantFacade(x));
	}

	public facade.consol.generalheaderconstraints.InformantFacade GetOrCreateInformant()
	{
		Optional<facade.consol.generalheaderconstraints.InformantFacade> lastOrDefault = informant().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Informant());
			return lastOrDefault.get();
		}
		return CreateAnotherInformant();
	}

	public facade.consol.generalheaderconstraints.InformantFacade CreateAnotherInformant()
	{
		Informant12 element = CDAFactory.eINSTANCE.createInformant12();
		facade.consol.generalheaderconstraints.InformantFacade elementFacade = new facade.consol.generalheaderconstraints.InformantFacade(element);
		elementFacade.Init();
		self.getInformants().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.InformantFacade Informant() {
		return GetOrCreateInformant();
	}

	public Stream<facade.consol.generalheaderconstraints.ParticipantSupportFacade> supportParticipant()
	{
		return Set(self.getParticipants()).filter( x -> facade.consol.generalheaderconstraints.ParticipantSupportFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.ParticipantSupportFacade(x));
	}

	public facade.consol.generalheaderconstraints.ParticipantSupportFacade GetOrCreateSupportParticipant()
	{
		Optional<facade.consol.generalheaderconstraints.ParticipantSupportFacade> lastOrDefault = supportParticipant().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Participant());
			return lastOrDefault.get();
		}
		return CreateAnotherSupportParticipant();
	}

	public facade.consol.generalheaderconstraints.ParticipantSupportFacade CreateAnotherSupportParticipant()
	{
		Participant1 element = CDAFactory.eINSTANCE.createParticipant1();
		facade.consol.generalheaderconstraints.ParticipantSupportFacade elementFacade = new facade.consol.generalheaderconstraints.ParticipantSupportFacade(element);
		elementFacade.Init();
		self.getParticipants().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.ParticipantSupportFacade SupportParticipant() {
		return GetOrCreateSupportParticipant();
	}

	public Stream<facade.consol.generalheaderconstraints.InFulfillmentOfFacade> inFulfillmentOf()
	{
		return Set(self.getInFulfillmentOfs()).filter( x -> facade.consol.generalheaderconstraints.InFulfillmentOfFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.InFulfillmentOfFacade(x));
	}

	public facade.consol.generalheaderconstraints.InFulfillmentOfFacade GetOrCreateInFulfillmentOf()
	{
		Optional<facade.consol.generalheaderconstraints.InFulfillmentOfFacade> lastOrDefault = inFulfillmentOf().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_InFulfillmentOf());
			return lastOrDefault.get();
		}
		return CreateAnotherInFulfillmentOf();
	}

	public facade.consol.generalheaderconstraints.InFulfillmentOfFacade CreateAnotherInFulfillmentOf()
	{
		InFulfillmentOf element = CDAFactory.eINSTANCE.createInFulfillmentOf();
		facade.consol.generalheaderconstraints.InFulfillmentOfFacade elementFacade = new facade.consol.generalheaderconstraints.InFulfillmentOfFacade(element);
		elementFacade.Init();
		self.getInFulfillmentOfs().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.InFulfillmentOfFacade InFulfillmentOf() {
		return GetOrCreateInFulfillmentOf();
	}

	public Stream<facade.consol.generalheaderconstraints.DocumentationOfFacade> documentationOf()
	{
		return Set(self.getDocumentationOfs()).filter( x -> facade.consol.generalheaderconstraints.DocumentationOfFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.DocumentationOfFacade(x));
	}

	public facade.consol.generalheaderconstraints.DocumentationOfFacade GetOrCreateDocumentationOf()
	{
		Optional<facade.consol.generalheaderconstraints.DocumentationOfFacade> lastOrDefault = documentationOf().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_DocumentationOf());
			return lastOrDefault.get();
		}
		return CreateAnotherDocumentationOf();
	}

	public facade.consol.generalheaderconstraints.DocumentationOfFacade CreateAnotherDocumentationOf()
	{
		DocumentationOf element = CDAFactory.eINSTANCE.createDocumentationOf();
		facade.consol.generalheaderconstraints.DocumentationOfFacade elementFacade = new facade.consol.generalheaderconstraints.DocumentationOfFacade(element);
		elementFacade.Init();
		self.getDocumentationOfs().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.DocumentationOfFacade DocumentationOf() {
		return GetOrCreateDocumentationOf();
	}

	public Stream<facade.consol.generalheaderconstraints.AuthorizationFacade> authorization()
	{
		return Set(self.getAuthorizations()).filter( x -> facade.consol.generalheaderconstraints.AuthorizationFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.AuthorizationFacade(x));
	}

	public facade.consol.generalheaderconstraints.AuthorizationFacade GetOrCreateAuthorization()
	{
		Optional<facade.consol.generalheaderconstraints.AuthorizationFacade> lastOrDefault = authorization().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Authorization());
			return lastOrDefault.get();
		}
		return CreateAnotherAuthorization();
	}

	public facade.consol.generalheaderconstraints.AuthorizationFacade CreateAnotherAuthorization()
	{
		Authorization element = CDAFactory.eINSTANCE.createAuthorization();
		facade.consol.generalheaderconstraints.AuthorizationFacade elementFacade = new facade.consol.generalheaderconstraints.AuthorizationFacade(element);
		elementFacade.Init();
		self.getAuthorizations().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.AuthorizationFacade Authorization() {
		return GetOrCreateAuthorization();
	}

	public Stream<facade.datatypes.IIFacade> templateId()
	{
		return Set(self.getTemplateIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateTemplateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = templateId().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_TemplateId());
			return lastOrDefault.get();
		}
		return CreateAnotherTemplateId();
	}

	public facade.datatypes.IIFacade CreateAnotherTemplateId()
	{
		II element = DatatypesFactory.eINSTANCE.createII();
		facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
		elementFacade.Init();
		self.getTemplateIds().add(element);
		return elementFacade;
	}

	public facade.datatypes.IIFacade TemplateId() {
		return GetOrCreateTemplateId();
	}

	public Stream<facade.datatypes.TSFacade> copyTime()
	{
		return Set(self.getCopyTime()).filter( x -> x instanceof TS).map( x -> (TS) x).map( x -> new facade.datatypes.TSFacade(x));
	}

	public facade.datatypes.TSFacade GetOrCreateCopyTime()
	{
		Optional<facade.datatypes.TSFacade> lastOrDefault = copyTime().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_CopyTime());
			return lastOrDefault.get();
		}
		return CreateAnotherCopyTime();
	}

	public facade.datatypes.TSFacade CreateAnotherCopyTime()
	{
		TS element = DatatypesFactory.eINSTANCE.createTS();
		facade.datatypes.TSFacade elementFacade = new facade.datatypes.TSFacade(element);
		elementFacade.Init();
		self.setCopyTime(element);
		return elementFacade;
	}

	public facade.datatypes.TSFacade CopyTime() {
		return GetOrCreateCopyTime();
	}

	public Stream<facade.cda.Participant1Facade> participant()
	{
		return Set(self.getParticipants()).filter( x -> facade.cda.Participant1Facade.isKindOf(x)).map( x -> new facade.cda.Participant1Facade(x));
	}

	public facade.cda.Participant1Facade GetOrCreateParticipant()
	{
		Optional<facade.cda.Participant1Facade> lastOrDefault = participant().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Participant());
			return lastOrDefault.get();
		}
		return CreateAnotherParticipant();
	}

	public facade.cda.Participant1Facade CreateAnotherParticipant()
	{
		Participant1 element = CDAFactory.eINSTANCE.createParticipant1();
		facade.cda.Participant1Facade elementFacade = new facade.cda.Participant1Facade(element);
		elementFacade.Init();
		self.getParticipants().add(element);
		return elementFacade;
	}

	public facade.cda.Participant1Facade Participant() {
		return GetOrCreateParticipant();
	}

	public Stream<facade.cda.RelatedDocumentFacade> relatedDocument()
	{
		return Set(self.getRelatedDocuments()).filter( x -> facade.cda.RelatedDocumentFacade.isKindOf(x)).map( x -> new facade.cda.RelatedDocumentFacade(x));
	}

	public facade.cda.RelatedDocumentFacade GetOrCreateRelatedDocument()
	{
		Optional<facade.cda.RelatedDocumentFacade> lastOrDefault = relatedDocument().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_RelatedDocument());
			return lastOrDefault.get();
		}
		return CreateAnotherRelatedDocument();
	}

	public facade.cda.RelatedDocumentFacade CreateAnotherRelatedDocument()
	{
		RelatedDocument element = CDAFactory.eINSTANCE.createRelatedDocument();
		facade.cda.RelatedDocumentFacade elementFacade = new facade.cda.RelatedDocumentFacade(element);
		elementFacade.Init();
		self.getRelatedDocuments().add(element);
		return elementFacade;
	}

	public facade.cda.RelatedDocumentFacade RelatedDocument() {
		return GetOrCreateRelatedDocument();
	}

	public Stream<facade.cda.Component2Facade> component()
	{
		return Set(self.getComponent()).filter( x -> facade.cda.Component2Facade.isKindOf(x)).map( x -> new facade.cda.Component2Facade(x));
	}

	public facade.cda.Component2Facade GetOrCreateComponent()
	{
		Optional<facade.cda.Component2Facade> lastOrDefault = component().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherComponent();
	}

	public facade.cda.Component2Facade CreateAnotherComponent()
	{
		Component2 element = CDAFactory.eINSTANCE.createComponent2();
		facade.cda.Component2Facade elementFacade = new facade.cda.Component2Facade(element);
		elementFacade.Init();
		self.setComponent(element);
		return elementFacade;
	}

	public facade.cda.Component2Facade Component() {
		return GetOrCreateComponent();
	}

	public Stream<NullFlavor> nullFlavor()
	{
		return Set(self.getNullFlavor());
	}

	public NullFlavor GetOrCreateNullFlavor()
	{
		Optional<NullFlavor> lastOrDefault = nullFlavor().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_NullFlavor());
		NullFlavor element = NullFlavor.get(0);
		self.setNullFlavor(element);
		return element;
	}

	public NullFlavor NullFlavor() {
		return GetOrCreateNullFlavor();
	}

	public void NullFlavor(NullFlavor value) {
		self.setNullFlavor(value);
	}

	public Stream<ActClinicalDocument> classCode()
	{
		return Set(self.getClassCode());
	}

	public ActClinicalDocument GetOrCreateClassCode()
	{
		Optional<ActClinicalDocument> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public ActClinicalDocument CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_ClassCode());
		ActClinicalDocument element = ActClinicalDocument.get(0);
		self.setClassCode(element);
		return element;
	}

	public ActClinicalDocument ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(ActClinicalDocument value) {
		self.setClassCode(value);
	}

	public Stream<ActMood> moodCode()
	{
		return Set(self.getMoodCode());
	}

	public ActMood GetOrCreateMoodCode()
	{
		Optional<ActMood> lastOrDefault = moodCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_MoodCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMoodCode();
	}

	public ActMood CreateAnotherMoodCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getClinicalDocument_MoodCode());
		ActMood element = ActMood.get(0);
		self.setMoodCode(element);
		return element;
	}

	public ActMood MoodCode() {
		return GetOrCreateMoodCode();
	}

	public void MoodCode(ActMood value) {
		self.setMoodCode(value);
	}

}
