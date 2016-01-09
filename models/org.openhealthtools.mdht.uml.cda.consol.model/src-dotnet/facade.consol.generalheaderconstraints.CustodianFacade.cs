using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class CustodianFacade : facade.FacadeBase
    {

		public POCD_MT000040Custodian self;

		public CustodianFacade()
		{
			this.self = new POCD_MT000040Custodian();
		}

		public CustodianFacade(POCD_MT000040Custodian self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Custodian self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateAssignedCustodian();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/custodian
		 *UML root path: /GeneralHeaderConstraints/custodian
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				assignedCustodian().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade> assignedCustodian()
		{
			return Set(self.assignedCustodian).FindAll( x => facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade(x));
		}

		public facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade GetOrCreateAssignedCustodian()
		{
			List<facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade> lastOrDefault = assignedCustodian();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "assignedCustodian");
				return lastOrDefault.Last();
			}
			return CreateAnotherAssignedCustodian();
		}

		public facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade CreateAnotherAssignedCustodian()
		{
			POCD_MT000040AssignedCustodian element = new POCD_MT000040AssignedCustodian();
			facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade elementFacade = new facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade(element);
			elementFacade.Init();
			self.assignedCustodian = SetOrAdd(self.assignedCustodian, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.custodian.AssignedCustodianFacade AssignedCustodian()		{
			return GetOrCreateAssignedCustodian();
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

}
}
