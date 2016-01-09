using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.documentationof
{
    public class ServiceEventFacade : facade.FacadeBase
    {

		public POCD_MT000040ServiceEvent self;

		public ServiceEventFacade()
		{
			this.self = new POCD_MT000040ServiceEvent();
		}

		public ServiceEventFacade(POCD_MT000040ServiceEvent self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040ServiceEvent self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateEffectiveTime();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		 *UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				effectiveTime().ForEach(x => x.Validate(vb, del));
				performer().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				code().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.datatypes.IVL_TSFacade> effectiveTime()
		{
			return Set(self.effectiveTime).FindAll( x => x is IVL_TS).ConvertAll( x => x as IVL_TS).ConvertAll( x => new facade.datatypes.IVL_TSFacade(x));
		}

		public facade.datatypes.IVL_TSFacade GetOrCreateEffectiveTime()
		{
			List<facade.datatypes.IVL_TSFacade> lastOrDefault = effectiveTime();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "effectiveTime");
				return lastOrDefault.Last();
			}
			return CreateAnotherEffectiveTime();
		}

		public facade.datatypes.IVL_TSFacade CreateAnotherEffectiveTime()
		{
			IVL_TS element = new IVL_TS();
			facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
			elementFacade.Init();
			self.effectiveTime = SetOrAdd(self.effectiveTime, element);
			return elementFacade;
		}

		public facade.datatypes.IVL_TSFacade EffectiveTime()		{
			return GetOrCreateEffectiveTime();
		}

		public List<facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade> performer()
		{
			return Set(self.performer).FindAll( x => facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade(x));
		}

		public facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade GetOrCreatePerformer()
		{
			List<facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade> lastOrDefault = performer();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "performer");
				return lastOrDefault.Last();
			}
			return CreateAnotherPerformer();
		}

		public facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade CreateAnotherPerformer()
		{
			POCD_MT000040Performer1 element = new POCD_MT000040Performer1();
			facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade elementFacade = new facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade(element);
			elementFacade.Init();
			self.performer = SetOrAdd(self.performer, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.documentationof.serviceevent.Performer1Facade Performer()		{
			return GetOrCreatePerformer();
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

		public List<ActClassRoot> classCode()
		{
			return Set(self.@classCode);
		}

		public ActClassRoot GetOrCreateClassCode()
		{
			List<ActClassRoot> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public ActClassRoot CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			ActClassRoot element = new ActClassRoot();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public ActClassRoot ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(ActClassRoot value)		{
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
