using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class ComponentOfFacade : facade.FacadeBase
    {

		public POCD_MT000040Component1 self;

		public ComponentOfFacade()
		{
			this.self = new POCD_MT000040Component1();
		}

		public ComponentOfFacade(POCD_MT000040Component1 self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Component1 self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateEncompassingEncounter();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/componentOf
		 *UML root path: /GeneralHeaderConstraints/componentOf
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				encompassingEncounter().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade> encompassingEncounter()
		{
			return Set(self.encompassingEncounter).FindAll( x => facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade(x));
		}

		public facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade GetOrCreateEncompassingEncounter()
		{
			List<facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade> lastOrDefault = encompassingEncounter();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "encompassingEncounter");
				return lastOrDefault.Last();
			}
			return CreateAnotherEncompassingEncounter();
		}

		public facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade CreateAnotherEncompassingEncounter()
		{
			POCD_MT000040EncompassingEncounter element = new POCD_MT000040EncompassingEncounter();
			facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade elementFacade = new facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade(element);
			elementFacade.Init();
			self.encompassingEncounter = SetOrAdd(self.encompassingEncounter, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.componentof.EncompassingEncounterFacade EncompassingEncounter()		{
			return GetOrCreateEncompassingEncounter();
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

		public List<ActRelationshipHasComponent> typeCode()
		{
			return Set(self.@typeCode);
		}

		public ActRelationshipHasComponent GetOrCreateTypeCode()
		{
			List<ActRelationshipHasComponent> lastOrDefault = typeCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "typeCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherTypeCode();
		}

		public ActRelationshipHasComponent CreateAnotherTypeCode()
		{
			MarkSpecified(self, "typeCode");
			ActRelationshipHasComponent element = new ActRelationshipHasComponent();
			self.@typeCode = SetOrAdd(self.@typeCode, element);
			return element;
		}

		public ActRelationshipHasComponent TypeCode()		{
			return GetOrCreateTypeCode();
		}

		public void TypeCode(ActRelationshipHasComponent value)		{
			self.@typeCode = SetOrAdd(self.@typeCode, value);
		}

}
}
