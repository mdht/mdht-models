using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.recordtarget.patientrole.patient
{
    public class LanguageCommunicationFacade : facade.FacadeBase
    {

		public POCD_MT000040LanguageCommunication self;

		public LanguageCommunicationFacade()
		{
			this.self = new POCD_MT000040LanguageCommunication();
		}

		public LanguageCommunicationFacade(POCD_MT000040LanguageCommunication self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040LanguageCommunication self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateLanguageCode();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				preferenceInd().ForEach(x => x.Validate(vb, del));
				proficiencyLevelCode().ForEach(x => x.Validate(vb, del));
				modeCode().ForEach(x => x.Validate(vb, del));
				languageCode().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.datatypes.BLFacade> preferenceInd()
		{
			return Set(self.preferenceInd).FindAll( x => x is BL).ConvertAll( x => x as BL).ConvertAll( x => new facade.datatypes.BLFacade(x));
		}

		public facade.datatypes.BLFacade GetOrCreatePreferenceInd()
		{
			List<facade.datatypes.BLFacade> lastOrDefault = preferenceInd();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "preferenceInd");
				return lastOrDefault.Last();
			}
			return CreateAnotherPreferenceInd();
		}

		public facade.datatypes.BLFacade CreateAnotherPreferenceInd()
		{
			BL element = new BL();
			facade.datatypes.BLFacade elementFacade = new facade.datatypes.BLFacade(element);
			elementFacade.Init();
			self.preferenceInd = SetOrAdd(self.preferenceInd, element);
			return elementFacade;
		}

		public facade.datatypes.BLFacade PreferenceInd()		{
			return GetOrCreatePreferenceInd();
		}

		public List<facade.datatypes.CEFacade> proficiencyLevelCode()
		{
			return Set(self.proficiencyLevelCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateProficiencyLevelCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = proficiencyLevelCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "proficiencyLevelCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherProficiencyLevelCode();
		}

		public facade.datatypes.CEFacade CreateAnotherProficiencyLevelCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.proficiencyLevelCode = SetOrAdd(self.proficiencyLevelCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade ProficiencyLevelCode()		{
			return GetOrCreateProficiencyLevelCode();
		}

		public List<facade.datatypes.CEFacade> modeCode()
		{
			return Set(self.modeCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateModeCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = modeCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "modeCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherModeCode();
		}

		public facade.datatypes.CEFacade CreateAnotherModeCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.modeCode = SetOrAdd(self.modeCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade ModeCode()		{
			return GetOrCreateModeCode();
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

}
}
