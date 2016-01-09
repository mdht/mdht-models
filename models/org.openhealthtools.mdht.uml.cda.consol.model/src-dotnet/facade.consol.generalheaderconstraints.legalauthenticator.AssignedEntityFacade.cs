using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.legalauthenticator
{
    public class AssignedEntityFacade : facade.FacadeBase
    {

		public POCD_MT000040AssignedEntity self;

		public AssignedEntityFacade()
		{
			this.self = new POCD_MT000040AssignedEntity();
		}

		public AssignedEntityFacade(POCD_MT000040AssignedEntity self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040AssignedEntity self)
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
			GetOrCreateTelecom();
			GetOrCreateAssignedPerson();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		 *UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				addr().ForEach(x => x.Validate(vb, del));
				code().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				telecom().ForEach(x => x.Validate(vb, del));
				assignedPerson().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				representedOrganization().ForEach(x => x.Validate(vb, del));
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

		public List<facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade> telecom()
		{
			return Set(self.telecom).FindAll( x => facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade(x));
		}

		public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade GetOrCreateTelecom()
		{
			List<facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade> lastOrDefault = telecom();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "telecom");
				return lastOrDefault.Last();
			}
			return CreateAnotherTelecom();
		}

		public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade CreateAnotherTelecom()
		{
			TEL element = new TEL();
			facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade elementFacade = new facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade(element);
			elementFacade.Init();
			self.telecom = SetOrAdd(self.telecom, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade Telecom()		{
			return GetOrCreateTelecom();
		}

		public List<facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade> assignedPerson()
		{
			return Set(self.assignedPerson).FindAll( x => facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade(x));
		}

		public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade GetOrCreateAssignedPerson()
		{
			List<facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade> lastOrDefault = assignedPerson();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "assignedPerson");
				return lastOrDefault.Last();
			}
			return CreateAnotherAssignedPerson();
		}

		public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade CreateAnotherAssignedPerson()
		{
			POCD_MT000040Person element = new POCD_MT000040Person();
			facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade elementFacade = new facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade(element);
			elementFacade.Init();
			self.assignedPerson = SetOrAdd(self.assignedPerson, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade AssignedPerson()		{
			return GetOrCreateAssignedPerson();
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

		public List<facade.cda.OrganizationFacade> representedOrganization()
		{
			return Set(self.representedOrganization).FindAll( x => facade.cda.OrganizationFacade.isKindOf(x)).ConvertAll( x => new facade.cda.OrganizationFacade(x));
		}

		public facade.cda.OrganizationFacade GetOrCreateRepresentedOrganization()
		{
			List<facade.cda.OrganizationFacade> lastOrDefault = representedOrganization();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "representedOrganization");
				return lastOrDefault.Last();
			}
			return CreateAnotherRepresentedOrganization();
		}

		public facade.cda.OrganizationFacade CreateAnotherRepresentedOrganization()
		{
			POCD_MT000040Organization element = new POCD_MT000040Organization();
			facade.cda.OrganizationFacade elementFacade = new facade.cda.OrganizationFacade(element);
			elementFacade.Init();
			self.representedOrganization = SetOrAdd(self.representedOrganization, element);
			return elementFacade;
		}

		public facade.cda.OrganizationFacade RepresentedOrganization()		{
			return GetOrCreateRepresentedOrganization();
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
