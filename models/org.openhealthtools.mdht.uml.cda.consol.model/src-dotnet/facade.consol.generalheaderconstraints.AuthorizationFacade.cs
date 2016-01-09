using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class AuthorizationFacade : facade.FacadeBase
    {

		public POCD_MT000040Authorization self;

		public AuthorizationFacade()
		{
			this.self = new POCD_MT000040Authorization();
		}

		public AuthorizationFacade(POCD_MT000040Authorization self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Authorization self)
		{
			return Flatten(Flatten(Set(self.consent).ConvertAll(i1341 => i1341.statusCode)).ConvertAll(i1342 => i1342.@code)).Contains("completed");
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateConsent();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/authorization
		 *UML root path: /GeneralHeaderConstraints/authorization
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				consent().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.authorization.ConsentFacade> consent()
		{
			return Set(self.consent).FindAll( x => facade.consol.generalheaderconstraints.authorization.ConsentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.authorization.ConsentFacade(x));
		}

		public facade.consol.generalheaderconstraints.authorization.ConsentFacade GetOrCreateConsent()
		{
			List<facade.consol.generalheaderconstraints.authorization.ConsentFacade> lastOrDefault = consent();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "consent");
				return lastOrDefault.Last();
			}
			return CreateAnotherConsent();
		}

		public facade.consol.generalheaderconstraints.authorization.ConsentFacade CreateAnotherConsent()
		{
			POCD_MT000040Consent element = new POCD_MT000040Consent();
			facade.consol.generalheaderconstraints.authorization.ConsentFacade elementFacade = new facade.consol.generalheaderconstraints.authorization.ConsentFacade(element);
			elementFacade.Init();
			self.consent = SetOrAdd(self.consent, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.authorization.ConsentFacade Consent()		{
			return GetOrCreateConsent();
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
