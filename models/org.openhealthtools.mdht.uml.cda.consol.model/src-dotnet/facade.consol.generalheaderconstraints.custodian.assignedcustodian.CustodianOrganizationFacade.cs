using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.custodian.assignedcustodian
{
    public class CustodianOrganizationFacade : facade.FacadeBase
    {

		public POCD_MT000040CustodianOrganization self;

		public CustodianOrganizationFacade()
		{
			this.self = new POCD_MT000040CustodianOrganization();
		}

		public CustodianOrganizationFacade(POCD_MT000040CustodianOrganization self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040CustodianOrganization self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateAddr();
			GetOrCreateId();
			GetOrCreateName();
			GetOrCreateTelecom();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		 *UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				addr().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				name().ForEach(x => x.Validate(vb, del));
				telecom().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.USRealmAddressFacade> addr()
		{
			return Set(self.addr).FindAll( x => facade.consol.generalheaderconstraints.USRealmAddressFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.USRealmAddressFacade(x));
		}

		public facade.consol.generalheaderconstraints.USRealmAddressFacade GetOrCreateAddr()
		{
			List<facade.consol.generalheaderconstraints.USRealmAddressFacade> lastOrDefault = addr();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "addr");
				return lastOrDefault.Last();
			}
			return CreateAnotherAddr();
		}

		public facade.consol.generalheaderconstraints.USRealmAddressFacade CreateAnotherAddr()
		{
			AD element = new AD();
			facade.consol.generalheaderconstraints.USRealmAddressFacade elementFacade = new facade.consol.generalheaderconstraints.USRealmAddressFacade(element);
			elementFacade.Init();
			self.addr = SetOrAdd(self.addr, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.USRealmAddressFacade Addr()		{
			return GetOrCreateAddr();
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

		public List<facade.datatypes.ONFacade> name()
		{
			return Set(self.name).FindAll( x => x is ON).ConvertAll( x => x as ON).ConvertAll( x => new facade.datatypes.ONFacade(x));
		}

		public facade.datatypes.ONFacade GetOrCreateName()
		{
			List<facade.datatypes.ONFacade> lastOrDefault = name();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "name");
				return lastOrDefault.Last();
			}
			return CreateAnotherName();
		}

		public facade.datatypes.ONFacade CreateAnotherName()
		{
			ON element = new ON();
			facade.datatypes.ONFacade elementFacade = new facade.datatypes.ONFacade(element);
			elementFacade.Init();
			self.name = SetOrAdd(self.name, element);
			return elementFacade;
		}

		public facade.datatypes.ONFacade Name()		{
			return GetOrCreateName();
		}

		public List<facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade> telecom()
		{
			return Set(self.telecom).FindAll( x => facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade(x));
		}

		public facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade GetOrCreateTelecom()
		{
			List<facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade> lastOrDefault = telecom();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "telecom");
				return lastOrDefault.Last();
			}
			return CreateAnotherTelecom();
		}

		public facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade CreateAnotherTelecom()
		{
			TEL element = new TEL();
			facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade elementFacade = new facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade(element);
			elementFacade.Init();
			self.telecom = SetOrAdd(self.telecom, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade Telecom()		{
			return GetOrCreateTelecom();
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

		public List<EntityClassOrganization> classCode()
		{
			return Set(self.@classCode);
		}

		public EntityClassOrganization GetOrCreateClassCode()
		{
			List<EntityClassOrganization> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public EntityClassOrganization CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			EntityClassOrganization element = new EntityClassOrganization();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public EntityClassOrganization ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(EntityClassOrganization value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

		public List<EntityDeterminer> determinerCode()
		{
			return Set(self.@determinerCode);
		}

		public EntityDeterminer GetOrCreateDeterminerCode()
		{
			List<EntityDeterminer> lastOrDefault = determinerCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "determinerCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherDeterminerCode();
		}

		public EntityDeterminer CreateAnotherDeterminerCode()
		{
			MarkSpecified(self, "determinerCode");
			EntityDeterminer element = new EntityDeterminer();
			self.@determinerCode = SetOrAdd(self.@determinerCode, element);
			return element;
		}

		public EntityDeterminer DeterminerCode()		{
			return GetOrCreateDeterminerCode();
		}

		public void DeterminerCode(EntityDeterminer value)		{
			self.@determinerCode = SetOrAdd(self.@determinerCode, value);
		}

}
}
