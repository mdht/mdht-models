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

public class AllergiesSectionFacade extends facade.FacadeBase {

	public Section self;

	public static String TEMPLATEID = "2.16.840.1.113883.10.20.22.2.6.1";

	public AllergiesSectionFacade()
	{
		this.self = CDAFactory.eINSTANCE.createSection();
	}

	public AllergiesSectionFacade(Section self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Section self)
	{
		return Set(self.getTemplateIds()).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"));
	}

	@Override
	public Object getModelElement()
	{
		return self;
	}

	public void Init()
	{
		GetOrCreateTemplateId().self.setRoot("2.16.840.1.113883.10.20.22.2.6.1");
		GetOrCreateCode();
		GetOrCreateCode().self.setCode("48765-2");
		GetOrCreateCode().self.setCodeSystem("2.16.840.1.113883.6.1");
		GetOrCreateTitle();
		GetOrCreateText();
		GetOrCreateEntry();
	}

	/**
	 *UML path: /AllergiesSection
	 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateAllergiesSectionEntriesOptionalTemplateId(vb, del);
			ValidateAllergiesSectionCodeP(vb, del);
			ValidateAllergiesSectionCode(vb, del);
			ValidateAllergiesSectionTitle(vb, del);
			ValidateAllergiesSectionText(vb, del);
			ValidateAllergiesSectionEntry(vb, del);
			ValidateAllergiesSectionEntriesOptionalTemplateId(vb, del);

			code().forEach(x -> x.Validate(vb, del));
			title().forEach(x -> x.Validate(vb, del));
			text().forEach(x -> x.Validate(vb, del));
			entry().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			confidentialityCode().forEach(x -> x.Validate(vb, del));
			languageCode().forEach(x -> x.Validate(vb, del));
			subject().forEach(x -> x.Validate(vb, del));
			author().forEach(x -> x.Validate(vb, del));
			informant().forEach(x -> x.Validate(vb, del));
			component().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.6.1')
	 * Context: /AllergiesSection
	 * Context Class: consol::AllergiesSection
	 * Constraint Name: consol::AllergiesSection::AllergiesSectionEntriesOptionalTemplateId
	 */
	public boolean ValidateAllergiesSectionEntriesOptionalTemplateId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getTemplateIds()).anyMatch(i3701 -> Set(i3701.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 3.3.1 templateId\n\t\tConformance: SHALL contain exactly one [1..1] templateId ( CONF:7527, CONF:10379 ) such that it SHALL contain exactly one [1..1] @root=\"2.16.840.1.113883.10.20.22.2.6.1\"\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.code.oclIsUndefined()
	 * Context: /AllergiesSection
	 * Context Class: consol::AllergiesSection
	 * Constraint Name: consol::AllergiesSection::AllergiesSectionCodeP
	 */
	public boolean ValidateAllergiesSectionCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = !(Set(self.getCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 3.3.3 code\n\t\tConformance: SHALL contain exactly one [1..1] code (CONF:15349)/@code=\"48765-2\" Allergies, adverse reactions, alerts (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15350)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in  value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1'
	 * Context: /AllergiesSection
	 * Context Class: consol::AllergiesSection
	 * Constraint Name: consol::AllergiesSection::AllergiesSectionCode
	 */
	public boolean ValidateAllergiesSectionCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = !(Set(self.getCode()).count()==0) && true && Set(self.getCode()).filter(i3745 -> Set(i3745.getCode()).collect(Collectors.toList()).contains("48765-2") && Set(i3745.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.6.1")).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 3.3.3 code\n\t\tConformance: SHALL contain exactly one [1..1] code (CONF:15349)/@code=\"48765-2\" Allergies, adverse reactions, alerts (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15350)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.title.oclIsUndefined()
	 * Context: /AllergiesSection
	 * Context Class: consol::AllergiesSection
	 * Constraint Name: consol::AllergiesSection::AllergiesSectionTitle
	 */
	public boolean ValidateAllergiesSectionTitle(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = !(Set(self.getTitle()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 3.3.4 title\n\t\tConformance: SHALL contain exactly one [1..1] title (CONF:7534)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.text.oclIsUndefined()
	 * Context: /AllergiesSection
	 * Context Class: consol::AllergiesSection
	 * Constraint Name: consol::AllergiesSection::AllergiesSectionText
	 */
	public boolean ValidateAllergiesSectionText(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = !(Set(self.getText()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 3.3.5 text\n\t\tConformance: SHALL contain exactly one [1..1] text (CONF:7530)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::AllergiesSection::AllergyProblemActEntry))
	 * Context: /AllergiesSection
	 * Context Class: consol::AllergiesSection
	 * Constraint Name: consol::AllergiesSection::AllergiesSectionEntry
	 */
	public boolean ValidateAllergiesSectionEntry(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(One(Set(self.getNullFlavor()))!=NullFlavor.NI) || Set(self.getEntries()).filter(i3809 -> !(Set(i3809).count()==0) && Flatten(Set(One(Set(i3809)).getActs()).map(i3811 -> Set(i3811.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.30"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 3.3.6 entry\n\t\tConformance: SHALL contain exactly one [1..1] entry\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.6.1')
	 * Context: /AllergiesSection
	 * Context Class: consol::AllergiesSection
	 * Constraint Name: consol::AllergiesSection::AllergiesSectionEntriesOptionalTemplateId
	 */
	public boolean ValidateAllergiesSectionEntriesOptionalTemplateId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getTemplateIds()).anyMatch(i3836 -> Set(i3836.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 3.3.1 templateId\n\t\tConformance: SHALL contain exactly one [1..1] templateId ( CONF:7527, CONF:10379 ) such that it SHALL contain exactly one [1..1] @root=\"2.16.840.1.113883.10.20.22.2.6.1\"\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Code());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Title());
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

	public Stream<facade.cda.StrucDocTextFacade> text()
	{
		return Set(self.getText()).filter( x -> facade.cda.StrucDocTextFacade.isKindOf(x)).map( x -> new facade.cda.StrucDocTextFacade(x));
	}

	public facade.cda.StrucDocTextFacade GetOrCreateText()
	{
		Optional<facade.cda.StrucDocTextFacade> lastOrDefault = text().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Text());
			return lastOrDefault.get();
		}
		return CreateAnotherText();
	}

	public facade.cda.StrucDocTextFacade CreateAnotherText()
	{
		StrucDocText element = CDAFactory.eINSTANCE.createStrucDocText();
		facade.cda.StrucDocTextFacade elementFacade = new facade.cda.StrucDocTextFacade(element);
		elementFacade.Init();
		self.setText(element);
		return elementFacade;
	}

	public facade.cda.StrucDocTextFacade Text() {
		return GetOrCreateText();
	}

	public Stream<facade.consol.allergiessection.AllergyProblemActEntryFacade> entry()
	{
		return Set(self.getEntries()).filter( x -> facade.consol.allergiessection.AllergyProblemActEntryFacade.isKindOf(x)).map( x -> new facade.consol.allergiessection.AllergyProblemActEntryFacade(x));
	}

	public facade.consol.allergiessection.AllergyProblemActEntryFacade GetOrCreateEntry()
	{
		Optional<facade.consol.allergiessection.AllergyProblemActEntryFacade> lastOrDefault = entry().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Entry());
			return lastOrDefault.get();
		}
		return CreateAnotherEntry();
	}

	public facade.consol.allergiessection.AllergyProblemActEntryFacade CreateAnotherEntry()
	{
		Entry element = CDAFactory.eINSTANCE.createEntry();
		facade.consol.allergiessection.AllergyProblemActEntryFacade elementFacade = new facade.consol.allergiessection.AllergyProblemActEntryFacade(element);
		elementFacade.Init();
		self.getEntries().add(element);
		return elementFacade;
	}

	public facade.consol.allergiessection.AllergyProblemActEntryFacade Entry() {
		return GetOrCreateEntry();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_TypeId());
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

	public Stream<facade.datatypes.IIFacade> templateId()
	{
		return Set(self.getTemplateIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateTemplateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = templateId().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_TemplateId());
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

	public Stream<facade.datatypes.IIFacade> id()
	{
		return Set(self.getId()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Id());
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

	public Stream<facade.datatypes.CEFacade> confidentialityCode()
	{
		return Set(self.getConfidentialityCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateConfidentialityCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = confidentialityCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_ConfidentialityCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_LanguageCode());
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

	public Stream<facade.cda.SubjectFacade> subject()
	{
		return Set(self.getSubject()).filter( x -> facade.cda.SubjectFacade.isKindOf(x)).map( x -> new facade.cda.SubjectFacade(x));
	}

	public facade.cda.SubjectFacade GetOrCreateSubject()
	{
		Optional<facade.cda.SubjectFacade> lastOrDefault = subject().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Subject());
			return lastOrDefault.get();
		}
		return CreateAnotherSubject();
	}

	public facade.cda.SubjectFacade CreateAnotherSubject()
	{
		Subject element = CDAFactory.eINSTANCE.createSubject();
		facade.cda.SubjectFacade elementFacade = new facade.cda.SubjectFacade(element);
		elementFacade.Init();
		self.setSubject(element);
		return elementFacade;
	}

	public facade.cda.SubjectFacade Subject() {
		return GetOrCreateSubject();
	}

	public Stream<facade.cda.AuthorFacade> author()
	{
		return Set(self.getAuthors()).filter( x -> facade.cda.AuthorFacade.isKindOf(x)).map( x -> new facade.cda.AuthorFacade(x));
	}

	public facade.cda.AuthorFacade GetOrCreateAuthor()
	{
		Optional<facade.cda.AuthorFacade> lastOrDefault = author().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Author());
			return lastOrDefault.get();
		}
		return CreateAnotherAuthor();
	}

	public facade.cda.AuthorFacade CreateAnotherAuthor()
	{
		Author element = CDAFactory.eINSTANCE.createAuthor();
		facade.cda.AuthorFacade elementFacade = new facade.cda.AuthorFacade(element);
		elementFacade.Init();
		self.getAuthors().add(element);
		return elementFacade;
	}

	public facade.cda.AuthorFacade Author() {
		return GetOrCreateAuthor();
	}

	public Stream<facade.cda.Informant12Facade> informant()
	{
		return Set(self.getInformants()).filter( x -> facade.cda.Informant12Facade.isKindOf(x)).map( x -> new facade.cda.Informant12Facade(x));
	}

	public facade.cda.Informant12Facade GetOrCreateInformant()
	{
		Optional<facade.cda.Informant12Facade> lastOrDefault = informant().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Informant());
			return lastOrDefault.get();
		}
		return CreateAnotherInformant();
	}

	public facade.cda.Informant12Facade CreateAnotherInformant()
	{
		Informant12 element = CDAFactory.eINSTANCE.createInformant12();
		facade.cda.Informant12Facade elementFacade = new facade.cda.Informant12Facade(element);
		elementFacade.Init();
		self.getInformants().add(element);
		return elementFacade;
	}

	public facade.cda.Informant12Facade Informant() {
		return GetOrCreateInformant();
	}

	public Stream<facade.cda.Component5Facade> component()
	{
		return Set(self.getComponents()).filter( x -> facade.cda.Component5Facade.isKindOf(x)).map( x -> new facade.cda.Component5Facade(x));
	}

	public facade.cda.Component5Facade GetOrCreateComponent()
	{
		Optional<facade.cda.Component5Facade> lastOrDefault = component().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherComponent();
	}

	public facade.cda.Component5Facade CreateAnotherComponent()
	{
		Component5 element = CDAFactory.eINSTANCE.createComponent5();
		facade.cda.Component5Facade elementFacade = new facade.cda.Component5Facade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.cda.Component5Facade Component() {
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_NullFlavor());
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

	public Stream<ActClass> classCode()
	{
		return Set(self.getClassCode());
	}

	public ActClass GetOrCreateClassCode()
	{
		Optional<ActClass> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public ActClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_ClassCode());
		ActClass element = ActClass.get(0);
		self.setClassCode(element);
		return element;
	}

	public ActClass ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(ActClass value) {
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_MoodCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMoodCode();
	}

	public ActMood CreateAnotherMoodCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getSection_MoodCode());
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
