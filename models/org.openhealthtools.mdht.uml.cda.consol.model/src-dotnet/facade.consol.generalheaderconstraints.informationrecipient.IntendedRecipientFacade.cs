using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.informationrecipient
{
    public class IntendedRecipientFacade : facade.FacadeBase
    {

		public POCD_MT000040IntendedRecipient self;

		public IntendedRecipientFacade()
		{
			this.self = new POCD_MT000040IntendedRecipient();
		}

		public IntendedRecipientFacade(POCD_MT000040IntendedRecipient self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040IntendedRecipient self)
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
		 *UML path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
		 *UML root path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				informationRecipient().ForEach(x => x.Validate(vb, del));
				receivedOrganization().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				addr().ForEach(x => x.Validate(vb, del));
				telecom().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade> informationRecipient()
		{
			return Set(self.informationRecipient).FindAll( x => facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade(x));
		}

		public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade GetOrCreateInformationRecipient()
		{
			List<facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade> lastOrDefault = informationRecipient();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "informationRecipient");
				return lastOrDefault.Last();
			}
			return CreateAnotherInformationRecipient();
		}

		public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade CreateAnotherInformationRecipient()
		{
			POCD_MT000040Person element = new POCD_MT000040Person();
			facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade elementFacade = new facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade(element);
			elementFacade.Init();
			self.informationRecipient = SetOrAdd(self.informationRecipient, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade InformationRecipient()		{
			return GetOrCreateInformationRecipient();
		}

		public List<facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade> receivedOrganization()
		{
			return Set(self.receivedOrganization).FindAll( x => facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade(x));
		}

		public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade GetOrCreateReceivedOrganization()
		{
			List<facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade> lastOrDefault = receivedOrganization();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "receivedOrganization");
				return lastOrDefault.Last();
			}
			return CreateAnotherReceivedOrganization();
		}

		public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade CreateAnotherReceivedOrganization()
		{
			POCD_MT000040Organization element = new POCD_MT000040Organization();
			facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade elementFacade = new facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade(element);
			elementFacade.Init();
			self.receivedOrganization = SetOrAdd(self.receivedOrganization, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade ReceivedOrganization()		{
			return GetOrCreateReceivedOrganization();
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

		public List<facade.datatypes.ADFacade> addr()
		{
			return Set(self.addr).FindAll( x => x is AD).ConvertAll( x => x as AD).ConvertAll( x => new facade.datatypes.ADFacade(x));
		}

		public facade.datatypes.ADFacade GetOrCreateAddr()
		{
			List<facade.datatypes.ADFacade> lastOrDefault = addr();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "addr");
				return lastOrDefault.Last();
			}
			return CreateAnotherAddr();
		}

		public facade.datatypes.ADFacade CreateAnotherAddr()
		{
			AD element = new AD();
			facade.datatypes.ADFacade elementFacade = new facade.datatypes.ADFacade(element);
			elementFacade.Init();
			self.addr = SetOrAdd(self.addr, element);
			return elementFacade;
		}

		public facade.datatypes.ADFacade Addr()		{
			return GetOrCreateAddr();
		}

		public List<facade.datatypes.TELFacade> telecom()
		{
			return Set(self.telecom).FindAll( x => x is TEL).ConvertAll( x => x as TEL).ConvertAll( x => new facade.datatypes.TELFacade(x));
		}

		public facade.datatypes.TELFacade GetOrCreateTelecom()
		{
			List<facade.datatypes.TELFacade> lastOrDefault = telecom();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "telecom");
				return lastOrDefault.Last();
			}
			return CreateAnotherTelecom();
		}

		public facade.datatypes.TELFacade CreateAnotherTelecom()
		{
			TEL element = new TEL();
			facade.datatypes.TELFacade elementFacade = new facade.datatypes.TELFacade(element);
			elementFacade.Init();
			self.telecom = SetOrAdd(self.telecom, element);
			return elementFacade;
		}

		public facade.datatypes.TELFacade Telecom()		{
			return GetOrCreateTelecom();
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

		public List<x_InformationRecipientRole> classCode()
		{
			return Set(self.@classCode);
		}

		public x_InformationRecipientRole GetOrCreateClassCode()
		{
			List<x_InformationRecipientRole> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public x_InformationRecipientRole CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			x_InformationRecipientRole element = new x_InformationRecipientRole();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public x_InformationRecipientRole ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(x_InformationRecipientRole value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

}
}
