using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol
{
    public class AllergiesSectionFacade : facade.FacadeBase
    {

		public POCD_MT000040Section self;

		public static string TEMPLATEID = "2.16.840.1.113883.10.20.22.2.6.1";

		public AllergiesSectionFacade()
		{
			this.self = new POCD_MT000040Section();
		}

		public AllergiesSectionFacade(POCD_MT000040Section self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Section self)
		{
			return Set(self.templateId).Exists(id => Set(id.@root).Contains("2.16.840.1.113883.10.20.22.2.6.1"));
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateTemplateId().self.@root = SetOrAdd(GetOrCreateTemplateId().self.@root, "2.16.840.1.113883.10.20.22.2.6.1");
			GetOrCreateCode();
			GetOrCreateCode().self.@code = SetOrAdd(GetOrCreateCode().self.@code, "48765-2");
			GetOrCreateCode().self.@codeSystem = SetOrAdd(GetOrCreateCode().self.@codeSystem, "2.16.840.1.113883.6.1");
			GetOrCreateTitle();
			GetOrCreateText();
			GetOrCreateEntry();
		}

		/**
		 *UML path: /AllergiesSection
		 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				code().ForEach(x => x.Validate(vb, del));
				title().ForEach(x => x.Validate(vb, del));
				text().ForEach(x => x.Validate(vb, del));
				entry().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				confidentialityCode().ForEach(x => x.Validate(vb, del));
				languageCode().ForEach(x => x.Validate(vb, del));
				subject().ForEach(x => x.Validate(vb, del));
				author().ForEach(x => x.Validate(vb, del));
				informant().ForEach(x => x.Validate(vb, del));
				component().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.datatypes.CEFacade> code()
		{
			return Set(self.code).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = code();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "code");
				return lastOrDefault.Last();
			}
			return CreateAnotherCode();
		}

		public facade.datatypes.CEFacade CreateAnotherCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.code = SetOrAdd(self.code, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade Code()		{
			return GetOrCreateCode();
		}

		public List<facade.datatypes.STFacade> title()
		{
			return Set(self.title).FindAll( x => x is ST).ConvertAll( x => x as ST).ConvertAll( x => new facade.datatypes.STFacade(x));
		}

		public facade.datatypes.STFacade GetOrCreateTitle()
		{
			List<facade.datatypes.STFacade> lastOrDefault = title();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "title");
				return lastOrDefault.Last();
			}
			return CreateAnotherTitle();
		}

		public facade.datatypes.STFacade CreateAnotherTitle()
		{
			ST element = new ST();
			facade.datatypes.STFacade elementFacade = new facade.datatypes.STFacade(element);
			elementFacade.Init();
			self.title = SetOrAdd(self.title, element);
			return elementFacade;
		}

		public facade.datatypes.STFacade Title()		{
			return GetOrCreateTitle();
		}

		public List<facade.cda.StrucDocTextFacade> text()
		{
			return Set(self.text).FindAll( x => facade.cda.StrucDocTextFacade.isKindOf(x)).ConvertAll( x => new facade.cda.StrucDocTextFacade(x));
		}

		public facade.cda.StrucDocTextFacade GetOrCreateText()
		{
			List<facade.cda.StrucDocTextFacade> lastOrDefault = text();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "text");
				return lastOrDefault.Last();
			}
			return CreateAnotherText();
		}

		public facade.cda.StrucDocTextFacade CreateAnotherText()
		{
			StrucDocText element = new StrucDocText();
			facade.cda.StrucDocTextFacade elementFacade = new facade.cda.StrucDocTextFacade(element);
			elementFacade.Init();
			self.text = SetOrAdd(self.text, element);
			return elementFacade;
		}

		public facade.cda.StrucDocTextFacade Text()		{
			return GetOrCreateText();
		}

		public List<facade.consol.allergiessection.AllergyProblemActEntryFacade> entry()
		{
			return Set(self.entry).FindAll( x => facade.consol.allergiessection.AllergyProblemActEntryFacade.isKindOf(x)).ConvertAll( x => new facade.consol.allergiessection.AllergyProblemActEntryFacade(x));
		}

		public facade.consol.allergiessection.AllergyProblemActEntryFacade GetOrCreateEntry()
		{
			List<facade.consol.allergiessection.AllergyProblemActEntryFacade> lastOrDefault = entry();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "entry");
				return lastOrDefault.Last();
			}
			return CreateAnotherEntry();
		}

		public facade.consol.allergiessection.AllergyProblemActEntryFacade CreateAnotherEntry()
		{
			POCD_MT000040Entry element = new POCD_MT000040Entry();
			facade.consol.allergiessection.AllergyProblemActEntryFacade elementFacade = new facade.consol.allergiessection.AllergyProblemActEntryFacade(element);
			elementFacade.Init();
			self.entry = SetOrAdd(self.entry, element);
			return elementFacade;
		}

		public facade.consol.allergiessection.AllergyProblemActEntryFacade Entry()		{
			return GetOrCreateEntry();
		}

		public List<facade.datatypes.CSFacade> realmCode()
		{
			return Set(self.realmCode).FindAll( x => x is CS).ConvertAll( x => x as CS).ConvertAll( x => new facade.datatypes.CSFacade(x));
		}

		public facade.datatypes.CSFacade GetOrCreateRealmCode()
		{
			List<facade.datatypes.CSFacade> lastOrDefault = realmCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "realmCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherRealmCode();
		}

		public facade.datatypes.CSFacade CreateAnotherRealmCode()
		{
			CS element = new CS();
			facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
			elementFacade.Init();
			self.realmCode = SetOrAdd(self.realmCode, element);
			return elementFacade;
		}

		public facade.datatypes.CSFacade RealmCode()		{
			return GetOrCreateRealmCode();
		}

		public List<facade.cda.InfrastructureRootTypeIdFacade> typeId()
		{
			return Set(self.typeId).FindAll( x => facade.cda.InfrastructureRootTypeIdFacade.isKindOf(x)).ConvertAll( x => new facade.cda.InfrastructureRootTypeIdFacade(x));
		}

		public facade.cda.InfrastructureRootTypeIdFacade GetOrCreateTypeId()
		{
			List<facade.cda.InfrastructureRootTypeIdFacade> lastOrDefault = typeId();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "typeId");
				return lastOrDefault.Last();
			}
			return CreateAnotherTypeId();
		}

		public facade.cda.InfrastructureRootTypeIdFacade CreateAnotherTypeId()
		{
			POCD_MT000040InfrastructureRoottypeId element = new POCD_MT000040InfrastructureRoottypeId();
			facade.cda.InfrastructureRootTypeIdFacade elementFacade = new facade.cda.InfrastructureRootTypeIdFacade(element);
			elementFacade.Init();
			self.typeId = SetOrAdd(self.typeId, element);
			return elementFacade;
		}

		public facade.cda.InfrastructureRootTypeIdFacade TypeId()		{
			return GetOrCreateTypeId();
		}

		public List<facade.datatypes.IIFacade> templateId()
		{
			return Set(self.templateId).FindAll( x => x is II).ConvertAll( x => x as II).ConvertAll( x => new facade.datatypes.IIFacade(x));
		}

		public facade.datatypes.IIFacade GetOrCreateTemplateId()
		{
			List<facade.datatypes.IIFacade> lastOrDefault = templateId();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "templateId");
				return lastOrDefault.Last();
			}
			return CreateAnotherTemplateId();
		}

		public facade.datatypes.IIFacade CreateAnotherTemplateId()
		{
			II element = new II();
			facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
			elementFacade.Init();
			self.templateId = SetOrAdd(self.templateId, element);
			return elementFacade;
		}

		public facade.datatypes.IIFacade TemplateId()		{
			return GetOrCreateTemplateId();
		}

		public List<facade.datatypes.IIFacade> id()
		{
			return Set(self.id).FindAll( x => x is II).ConvertAll( x => x as II).ConvertAll( x => new facade.datatypes.IIFacade(x));
		}

		public facade.datatypes.IIFacade GetOrCreateId()
		{
			List<facade.datatypes.IIFacade> lastOrDefault = id();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "id");
				return lastOrDefault.Last();
			}
			return CreateAnotherId();
		}

		public facade.datatypes.IIFacade CreateAnotherId()
		{
			II element = new II();
			facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
			elementFacade.Init();
			self.id = SetOrAdd(self.id, element);
			return elementFacade;
		}

		public facade.datatypes.IIFacade Id()		{
			return GetOrCreateId();
		}

		public List<facade.datatypes.CEFacade> confidentialityCode()
		{
			return Set(self.confidentialityCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateConfidentialityCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = confidentialityCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "confidentialityCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherConfidentialityCode();
		}

		public facade.datatypes.CEFacade CreateAnotherConfidentialityCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.confidentialityCode = SetOrAdd(self.confidentialityCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade ConfidentialityCode()		{
			return GetOrCreateConfidentialityCode();
		}

		public List<facade.datatypes.CSFacade> languageCode()
		{
			return Set(self.languageCode).FindAll( x => x is CS).ConvertAll( x => x as CS).ConvertAll( x => new facade.datatypes.CSFacade(x));
		}

		public facade.datatypes.CSFacade GetOrCreateLanguageCode()
		{
			List<facade.datatypes.CSFacade> lastOrDefault = languageCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "languageCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherLanguageCode();
		}

		public facade.datatypes.CSFacade CreateAnotherLanguageCode()
		{
			CS element = new CS();
			facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
			elementFacade.Init();
			self.languageCode = SetOrAdd(self.languageCode, element);
			return elementFacade;
		}

		public facade.datatypes.CSFacade LanguageCode()		{
			return GetOrCreateLanguageCode();
		}

		public List<facade.cda.SubjectFacade> subject()
		{
			return Set(self.subject).FindAll( x => facade.cda.SubjectFacade.isKindOf(x)).ConvertAll( x => new facade.cda.SubjectFacade(x));
		}

		public facade.cda.SubjectFacade GetOrCreateSubject()
		{
			List<facade.cda.SubjectFacade> lastOrDefault = subject();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "subject");
				return lastOrDefault.Last();
			}
			return CreateAnotherSubject();
		}

		public facade.cda.SubjectFacade CreateAnotherSubject()
		{
			POCD_MT000040Subject element = new POCD_MT000040Subject();
			facade.cda.SubjectFacade elementFacade = new facade.cda.SubjectFacade(element);
			elementFacade.Init();
			self.subject = SetOrAdd(self.subject, element);
			return elementFacade;
		}

		public facade.cda.SubjectFacade Subject()		{
			return GetOrCreateSubject();
		}

		public List<facade.cda.AuthorFacade> author()
		{
			return Set(self.author).FindAll( x => facade.cda.AuthorFacade.isKindOf(x)).ConvertAll( x => new facade.cda.AuthorFacade(x));
		}

		public facade.cda.AuthorFacade GetOrCreateAuthor()
		{
			List<facade.cda.AuthorFacade> lastOrDefault = author();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "author");
				return lastOrDefault.Last();
			}
			return CreateAnotherAuthor();
		}

		public facade.cda.AuthorFacade CreateAnotherAuthor()
		{
			POCD_MT000040Author element = new POCD_MT000040Author();
			facade.cda.AuthorFacade elementFacade = new facade.cda.AuthorFacade(element);
			elementFacade.Init();
			self.author = SetOrAdd(self.author, element);
			return elementFacade;
		}

		public facade.cda.AuthorFacade Author()		{
			return GetOrCreateAuthor();
		}

		public List<facade.cda.Informant12Facade> informant()
		{
			return Set(self.informant).FindAll( x => facade.cda.Informant12Facade.isKindOf(x)).ConvertAll( x => new facade.cda.Informant12Facade(x));
		}

		public facade.cda.Informant12Facade GetOrCreateInformant()
		{
			List<facade.cda.Informant12Facade> lastOrDefault = informant();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "informant");
				return lastOrDefault.Last();
			}
			return CreateAnotherInformant();
		}

		public facade.cda.Informant12Facade CreateAnotherInformant()
		{
			POCD_MT000040Informant12 element = new POCD_MT000040Informant12();
			facade.cda.Informant12Facade elementFacade = new facade.cda.Informant12Facade(element);
			elementFacade.Init();
			self.informant = SetOrAdd(self.informant, element);
			return elementFacade;
		}

		public facade.cda.Informant12Facade Informant()		{
			return GetOrCreateInformant();
		}

		public List<facade.cda.Component5Facade> component()
		{
			return Set(self.component).FindAll( x => facade.cda.Component5Facade.isKindOf(x)).ConvertAll( x => new facade.cda.Component5Facade(x));
		}

		public facade.cda.Component5Facade GetOrCreateComponent()
		{
			List<facade.cda.Component5Facade> lastOrDefault = component();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherComponent();
		}

		public facade.cda.Component5Facade CreateAnotherComponent()
		{
			POCD_MT000040Component5 element = new POCD_MT000040Component5();
			facade.cda.Component5Facade elementFacade = new facade.cda.Component5Facade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.cda.Component5Facade Component()		{
			return GetOrCreateComponent();
		}

		public List<NullFlavor> nullFlavor()
		{
			return Set(self.@nullFlavor);
		}

		public NullFlavor GetOrCreateNullFlavor()
		{
			List<NullFlavor> lastOrDefault = nullFlavor();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "nullFlavor");
				return lastOrDefault.Last();
			}
			return CreateAnotherNullFlavor();
		}

		public NullFlavor CreateAnotherNullFlavor()
		{
			MarkSpecified(self, "nullFlavor");
			NullFlavor element = new NullFlavor();
			self.@nullFlavor = SetOrAdd(self.@nullFlavor, element);
			return element;
		}

		public NullFlavor NullFlavor()		{
			return GetOrCreateNullFlavor();
		}

		public void NullFlavor(NullFlavor value)		{
			self.@nullFlavor = SetOrAdd(self.@nullFlavor, value);
		}

		public List<ActClass> classCode()
		{
			return Set(self.@classCode);
		}

		public ActClass GetOrCreateClassCode()
		{
			List<ActClass> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public ActClass CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			ActClass element = new ActClass();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public ActClass ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(ActClass value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

		public List<ActMood> moodCode()
		{
			return Set(self.@moodCode);
		}

		public ActMood GetOrCreateMoodCode()
		{
			List<ActMood> lastOrDefault = moodCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "moodCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherMoodCode();
		}

		public ActMood CreateAnotherMoodCode()
		{
			MarkSpecified(self, "moodCode");
			ActMood element = new ActMood();
			self.@moodCode = SetOrAdd(self.@moodCode, element);
			return element;
		}

		public ActMood MoodCode()		{
			return GetOrCreateMoodCode();
		}

		public void MoodCode(ActMood value)		{
			self.@moodCode = SetOrAdd(self.@moodCode, value);
		}

}
}
