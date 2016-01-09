using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class DataEntererFacade : facade.FacadeBase
    {

		public POCD_MT000040DataEnterer self;

		public DataEntererFacade()
		{
			this.self = new POCD_MT000040DataEnterer();
		}

		public DataEntererFacade(POCD_MT000040DataEnterer self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040DataEnterer self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateAssignedEntity();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/dataEnterer
		 *UML root path: /GeneralHeaderConstraints/dataEnterer
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				assignedEntity().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				time().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade> assignedEntity()
		{
			return Set(self.assignedEntity).FindAll( x => facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade(x));
		}

		public facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade GetOrCreateAssignedEntity()
		{
			List<facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade> lastOrDefault = assignedEntity();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "assignedEntity");
				return lastOrDefault.Last();
			}
			return CreateAnotherAssignedEntity();
		}

		public facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade CreateAnotherAssignedEntity()
		{
			POCD_MT000040AssignedEntity element = new POCD_MT000040AssignedEntity();
			facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade(element);
			elementFacade.Init();
			self.assignedEntity = SetOrAdd(self.assignedEntity, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.dataenterer.AssignedEntityFacade AssignedEntity()		{
			return GetOrCreateAssignedEntity();
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

		public List<facade.datatypes.TSFacade> time()
		{
			return Set(self.time).FindAll( x => x is TS).ConvertAll( x => x as TS).ConvertAll( x => new facade.datatypes.TSFacade(x));
		}

		public facade.datatypes.TSFacade GetOrCreateTime()
		{
			List<facade.datatypes.TSFacade> lastOrDefault = time();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "time");
				return lastOrDefault.Last();
			}
			return CreateAnotherTime();
		}

		public facade.datatypes.TSFacade CreateAnotherTime()
		{
			TS element = new TS();
			facade.datatypes.TSFacade elementFacade = new facade.datatypes.TSFacade(element);
			elementFacade.Init();
			self.time = SetOrAdd(self.time, element);
			return elementFacade;
		}

		public facade.datatypes.TSFacade Time()		{
			return GetOrCreateTime();
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
