using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class DocumentationOfFacade : facade.FacadeBase
    {

		public POCD_MT000040DocumentationOf self;

		public DocumentationOfFacade()
		{
			this.self = new POCD_MT000040DocumentationOf();
		}

		public DocumentationOfFacade(POCD_MT000040DocumentationOf self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040DocumentationOf self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateServiceEvent();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/documentationOf
		 *UML root path: /GeneralHeaderConstraints/documentationOf
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				serviceEvent().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade> serviceEvent()
		{
			return Set(self.serviceEvent).FindAll( x => facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade(x));
		}

		public facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade GetOrCreateServiceEvent()
		{
			List<facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade> lastOrDefault = serviceEvent();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "serviceEvent");
				return lastOrDefault.Last();
			}
			return CreateAnotherServiceEvent();
		}

		public facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade CreateAnotherServiceEvent()
		{
			POCD_MT000040ServiceEvent element = new POCD_MT000040ServiceEvent();
			facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade elementFacade = new facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade(element);
			elementFacade.Init();
			self.serviceEvent = SetOrAdd(self.serviceEvent, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.documentationof.ServiceEventFacade ServiceEvent()		{
			return GetOrCreateServiceEvent();
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

		public List<ActRelationshipType> typeCode()
		{
			return Set(self.@typeCode);
		}

		public ActRelationshipType GetOrCreateTypeCode()
		{
			List<ActRelationshipType> lastOrDefault = typeCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "typeCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherTypeCode();
		}

		public ActRelationshipType CreateAnotherTypeCode()
		{
			MarkSpecified(self, "typeCode");
			ActRelationshipType element = new ActRelationshipType();
			self.@typeCode = SetOrAdd(self.@typeCode, element);
			return element;
		}

		public ActRelationshipType TypeCode()		{
			return GetOrCreateTypeCode();
		}

		public void TypeCode(ActRelationshipType value)		{
			self.@typeCode = SetOrAdd(self.@typeCode, value);
		}

}
}
