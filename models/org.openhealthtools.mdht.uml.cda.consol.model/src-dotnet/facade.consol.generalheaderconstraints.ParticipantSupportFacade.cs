using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class ParticipantSupportFacade : facade.FacadeBase
    {

		public POCD_MT000040Participant1 self;

		public ParticipantSupportFacade()
		{
			this.self = new POCD_MT000040Participant1();
		}

		public ParticipantSupportFacade(POCD_MT000040Participant1 self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Participant1 self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateAssociatedEntity();
			GetOrCreateTypeCode();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/supportParticipant
		 *UML root path: /GeneralHeaderConstraints/supportParticipant
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				time().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				functionCode().ForEach(x => x.Validate(vb, del));
				associatedEntity().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.datatypes.IVL_TSFacade> time()
		{
			return Set(self.time).FindAll( x => x is IVL_TS).ConvertAll( x => x as IVL_TS).ConvertAll( x => new facade.datatypes.IVL_TSFacade(x));
		}

		public facade.datatypes.IVL_TSFacade GetOrCreateTime()
		{
			List<facade.datatypes.IVL_TSFacade> lastOrDefault = time();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "time");
				return lastOrDefault.Last();
			}
			return CreateAnotherTime();
		}

		public facade.datatypes.IVL_TSFacade CreateAnotherTime()
		{
			IVL_TS element = new IVL_TS();
			facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
			elementFacade.Init();
			self.time = SetOrAdd(self.time, element);
			return elementFacade;
		}

		public facade.datatypes.IVL_TSFacade Time()		{
			return GetOrCreateTime();
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

		public List<facade.datatypes.CEFacade> functionCode()
		{
			return Set(self.functionCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateFunctionCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = functionCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "functionCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherFunctionCode();
		}

		public facade.datatypes.CEFacade CreateAnotherFunctionCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.functionCode = SetOrAdd(self.functionCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade FunctionCode()		{
			return GetOrCreateFunctionCode();
		}

		public List<facade.cda.AssociatedEntityFacade> associatedEntity()
		{
			return Set(self.associatedEntity).FindAll( x => facade.cda.AssociatedEntityFacade.isKindOf(x)).ConvertAll( x => new facade.cda.AssociatedEntityFacade(x));
		}

		public facade.cda.AssociatedEntityFacade GetOrCreateAssociatedEntity()
		{
			List<facade.cda.AssociatedEntityFacade> lastOrDefault = associatedEntity();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "associatedEntity");
				return lastOrDefault.Last();
			}
			return CreateAnotherAssociatedEntity();
		}

		public facade.cda.AssociatedEntityFacade CreateAnotherAssociatedEntity()
		{
			POCD_MT000040AssociatedEntity element = new POCD_MT000040AssociatedEntity();
			facade.cda.AssociatedEntityFacade elementFacade = new facade.cda.AssociatedEntityFacade(element);
			elementFacade.Init();
			self.associatedEntity = SetOrAdd(self.associatedEntity, element);
			return elementFacade;
		}

		public facade.cda.AssociatedEntityFacade AssociatedEntity()		{
			return GetOrCreateAssociatedEntity();
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

		public List<ParticipationType> typeCode()
		{
			return Set(self.@typeCode);
		}

		public ParticipationType GetOrCreateTypeCode()
		{
			List<ParticipationType> lastOrDefault = typeCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "typeCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherTypeCode();
		}

		public ParticipationType CreateAnotherTypeCode()
		{
			MarkSpecified(self, "typeCode");
			ParticipationType element = new ParticipationType();
			self.@typeCode = SetOrAdd(self.@typeCode, element);
			return element;
		}

		public ParticipationType TypeCode()		{
			return GetOrCreateTypeCode();
		}

		public void TypeCode(ParticipationType value)		{
			self.@typeCode = SetOrAdd(self.@typeCode, value);
		}

		public List<ContextControl> contextControlCode()
		{
			return Set(self.@contextControlCode);
		}

		public ContextControl GetOrCreateContextControlCode()
		{
			List<ContextControl> lastOrDefault = contextControlCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "contextControlCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherContextControlCode();
		}

		public ContextControl CreateAnotherContextControlCode()
		{
			MarkSpecified(self, "contextControlCode");
			ContextControl element = new ContextControl();
			self.@contextControlCode = SetOrAdd(self.@contextControlCode, element);
			return element;
		}

		public ContextControl ContextControlCode()		{
			return GetOrCreateContextControlCode();
		}

		public void ContextControlCode(ContextControl value)		{
			self.@contextControlCode = SetOrAdd(self.@contextControlCode, value);
		}

}
}
