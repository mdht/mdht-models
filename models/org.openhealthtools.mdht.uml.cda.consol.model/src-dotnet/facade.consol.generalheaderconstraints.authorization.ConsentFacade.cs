using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.authorization
{
    public class ConsentFacade : facade.FacadeBase
    {

		public POCD_MT000040Consent self;

		public static string CODE = "completed";

		public static string CODESYSTEM = "2.16.840.1.113883.5.6";

		public ConsentFacade()
		{
			this.self = new POCD_MT000040Consent();
		}

		public ConsentFacade(POCD_MT000040Consent self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Consent self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateStatusCode();
			GetOrCreateStatusCode().self.@code = SetOrAdd(GetOrCreateStatusCode().self.@code, "completed");
			GetOrCreateStatusCode().self.@codeSystem = SetOrAdd(GetOrCreateStatusCode().self.@codeSystem, "2.16.840.1.113883.5.6");
		}

		/**
		 *UML path: /GeneralHeaderConstraints/authorization/consent
		 *UML root path: /GeneralHeaderConstraints/authorization/consent
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				code().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				statusCode().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
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

		public List<facade.datatypes.CSFacade> statusCode()
		{
			return Set(self.statusCode).FindAll( x => x is CS).ConvertAll( x => x as CS).ConvertAll( x => new facade.datatypes.CSFacade(x));
		}

		public facade.datatypes.CSFacade GetOrCreateStatusCode()
		{
			List<facade.datatypes.CSFacade> lastOrDefault = statusCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "statusCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherStatusCode();
		}

		public facade.datatypes.CSFacade CreateAnotherStatusCode()
		{
			CS element = new CS();
			facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
			elementFacade.Init();
			self.statusCode = SetOrAdd(self.statusCode, element);
			return elementFacade;
		}

		public facade.datatypes.CSFacade StatusCode()		{
			return GetOrCreateStatusCode();
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
