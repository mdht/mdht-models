using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class InformantFacade : facade.FacadeBase
    {

		public POCD_MT000040Informant12 self;

		public InformantFacade()
		{
			this.self = new POCD_MT000040Informant12();
		}

		public InformantFacade(POCD_MT000040Informant12 self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Informant12 self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
		}

		/**
		 *UML path: /GeneralHeaderConstraints/informant
		 *UML root path: /GeneralHeaderConstraints/informant
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				assignedEntity().ForEach(x => x.Validate(vb, del));
				relatedEntity().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.informant.AssignedEntityFacade> assignedEntity()
		{
			return Set(self.assignedEntity).FindAll( x => facade.consol.generalheaderconstraints.informant.AssignedEntityFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.informant.AssignedEntityFacade(x));
		}

		public facade.consol.generalheaderconstraints.informant.AssignedEntityFacade GetOrCreateAssignedEntity()
		{
			List<facade.consol.generalheaderconstraints.informant.AssignedEntityFacade> lastOrDefault = assignedEntity();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "assignedEntity");
				return lastOrDefault.Last();
			}
			return CreateAnotherAssignedEntity();
		}

		public facade.consol.generalheaderconstraints.informant.AssignedEntityFacade CreateAnotherAssignedEntity()
		{
			POCD_MT000040AssignedEntity element = new POCD_MT000040AssignedEntity();
			facade.consol.generalheaderconstraints.informant.AssignedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.informant.AssignedEntityFacade(element);
			elementFacade.Init();
			self.assignedEntity = SetOrAdd(self.assignedEntity, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.informant.AssignedEntityFacade AssignedEntity()		{
			return GetOrCreateAssignedEntity();
		}

		public List<facade.consol.generalheaderconstraints.informant.RelatedEntityFacade> relatedEntity()
		{
			return Set(self.relatedEntity).FindAll( x => facade.consol.generalheaderconstraints.informant.RelatedEntityFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.informant.RelatedEntityFacade(x));
		}

		public facade.consol.generalheaderconstraints.informant.RelatedEntityFacade GetOrCreateRelatedEntity()
		{
			List<facade.consol.generalheaderconstraints.informant.RelatedEntityFacade> lastOrDefault = relatedEntity();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "relatedEntity");
				return lastOrDefault.Last();
			}
			return CreateAnotherRelatedEntity();
		}

		public facade.consol.generalheaderconstraints.informant.RelatedEntityFacade CreateAnotherRelatedEntity()
		{
			POCD_MT000040RelatedEntity element = new POCD_MT000040RelatedEntity();
			facade.consol.generalheaderconstraints.informant.RelatedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.informant.RelatedEntityFacade(element);
			elementFacade.Init();
			self.relatedEntity = SetOrAdd(self.relatedEntity, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.informant.RelatedEntityFacade RelatedEntity()		{
			return GetOrCreateRelatedEntity();
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
