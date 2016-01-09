using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.recordtarget.patientrole.patient
{
    public class GuardianFacade : facade.FacadeBase
    {

		public POCD_MT000040Guardian self;

		public GuardianFacade()
		{
			this.self = new POCD_MT000040Guardian();
		}

		public GuardianFacade(POCD_MT000040Guardian self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Guardian self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateGuardianPerson();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				addr().ForEach(x => x.Validate(vb, del));
				code().ForEach(x => x.Validate(vb, del));
				telecom().ForEach(x => x.Validate(vb, del));
				guardianPerson().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				guardianOrganization().ForEach(x => x.Validate(vb, del));
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

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade> telecom()
		{
			return Set(self.telecom).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade GetOrCreateTelecom()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade> lastOrDefault = telecom();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "telecom");
				return lastOrDefault.Last();
			}
			return CreateAnotherTelecom();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade CreateAnotherTelecom()
		{
			TEL element = new TEL();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade(element);
			elementFacade.Init();
			self.telecom = SetOrAdd(self.telecom, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade Telecom()		{
			return GetOrCreateTelecom();
		}

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade> guardianPerson()
		{
			return Set(self.guardianPerson).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade GetOrCreateGuardianPerson()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade> lastOrDefault = guardianPerson();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "guardianPerson");
				return lastOrDefault.Last();
			}
			return CreateAnotherGuardianPerson();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade CreateAnotherGuardianPerson()
		{
			POCD_MT000040Person element = new POCD_MT000040Person();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade(element);
			elementFacade.Init();
			self.guardianPerson = SetOrAdd(self.guardianPerson, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade GuardianPerson()		{
			return GetOrCreateGuardianPerson();
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

		public List<facade.cda.OrganizationFacade> guardianOrganization()
		{
			return Set(self.guardianOrganization).FindAll( x => facade.cda.OrganizationFacade.isKindOf(x)).ConvertAll( x => new facade.cda.OrganizationFacade(x));
		}

		public facade.cda.OrganizationFacade GetOrCreateGuardianOrganization()
		{
			List<facade.cda.OrganizationFacade> lastOrDefault = guardianOrganization();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "guardianOrganization");
				return lastOrDefault.Last();
			}
			return CreateAnotherGuardianOrganization();
		}

		public facade.cda.OrganizationFacade CreateAnotherGuardianOrganization()
		{
			POCD_MT000040Organization element = new POCD_MT000040Organization();
			facade.cda.OrganizationFacade elementFacade = new facade.cda.OrganizationFacade(element);
			elementFacade.Init();
			self.guardianOrganization = SetOrAdd(self.guardianOrganization, element);
			return elementFacade;
		}

		public facade.cda.OrganizationFacade GuardianOrganization()		{
			return GetOrCreateGuardianOrganization();
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

		public List<RoleClass> classCode()
		{
			return Set(self.@classCode);
		}

		public RoleClass GetOrCreateClassCode()
		{
			List<RoleClass> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public RoleClass CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			RoleClass element = new RoleClass();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public RoleClass ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(RoleClass value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

}
}
