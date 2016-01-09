using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.custodian
{
    public class AssignedCustodianFacade : facade.FacadeBase
    {

		public POCD_MT000040AssignedCustodian self;

		public AssignedCustodianFacade()
		{
			this.self = new POCD_MT000040AssignedCustodian();
		}

		public AssignedCustodianFacade(POCD_MT000040AssignedCustodian self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040AssignedCustodian self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateRepresentedCustodianOrganization();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/custodian/assignedCustodian
		 *UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				representedCustodianOrganization().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade> representedCustodianOrganization()
		{
			return Set(self.representedCustodianOrganization).FindAll( x => facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade(x));
		}

		public facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade GetOrCreateRepresentedCustodianOrganization()
		{
			List<facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade> lastOrDefault = representedCustodianOrganization();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "representedCustodianOrganization");
				return lastOrDefault.Last();
			}
			return CreateAnotherRepresentedCustodianOrganization();
		}

		public facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade CreateAnotherRepresentedCustodianOrganization()
		{
			POCD_MT000040CustodianOrganization element = new POCD_MT000040CustodianOrganization();
			facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade elementFacade = new facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade(element);
			elementFacade.Init();
			self.representedCustodianOrganization = SetOrAdd(self.representedCustodianOrganization, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.custodian.assignedcustodian.CustodianOrganizationFacade RepresentedCustodianOrganization()		{
			return GetOrCreateRepresentedCustodianOrganization();
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

		public List<RoleClassAssignedEntity> classCode()
		{
			return Set(self.@classCode);
		}

		public RoleClassAssignedEntity GetOrCreateClassCode()
		{
			List<RoleClassAssignedEntity> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public RoleClassAssignedEntity CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			RoleClassAssignedEntity element = new RoleClassAssignedEntity();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public RoleClassAssignedEntity ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(RoleClassAssignedEntity value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

}
}
