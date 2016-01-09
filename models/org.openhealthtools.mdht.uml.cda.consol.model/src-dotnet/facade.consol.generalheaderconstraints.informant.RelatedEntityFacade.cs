using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.informant
{
    public class RelatedEntityFacade : facade.FacadeBase
    {

		public POCD_MT000040RelatedEntity self;

		public RelatedEntityFacade()
		{
			this.self = new POCD_MT000040RelatedEntity();
		}

		public RelatedEntityFacade(POCD_MT000040RelatedEntity self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040RelatedEntity self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreatePerson();
			GetOrCreateClassCode();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/informant/relatedEntity
		 *UML root path: /GeneralHeaderConstraints/informant/relatedEntity
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				addr().ForEach(x => x.Validate(vb, del));
				person().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				code().ForEach(x => x.Validate(vb, del));
				telecom().ForEach(x => x.Validate(vb, del));
				effectiveTime().ForEach(x => x.Validate(vb, del));
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

		public List<facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade> person()
		{
			return Set(self.relatedPerson).FindAll( x => facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade(x));
		}

		public facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade GetOrCreatePerson()
		{
			List<facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade> lastOrDefault = person();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "relatedPerson");
				return lastOrDefault.Last();
			}
			return CreateAnotherPerson();
		}

		public facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade CreateAnotherPerson()
		{
			POCD_MT000040Person element = new POCD_MT000040Person();
			facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade elementFacade = new facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade(element);
			elementFacade.Init();
			self.relatedPerson = SetOrAdd(self.relatedPerson, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.informant.assignedentity.PersonFacade Person()		{
			return GetOrCreatePerson();
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

		public List<facade.datatypes.IVL_TSFacade> effectiveTime()
		{
			return Set(self.effectiveTime).FindAll( x => x is IVL_TS).ConvertAll( x => x as IVL_TS).ConvertAll( x => new facade.datatypes.IVL_TSFacade(x));
		}

		public facade.datatypes.IVL_TSFacade GetOrCreateEffectiveTime()
		{
			List<facade.datatypes.IVL_TSFacade> lastOrDefault = effectiveTime();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "effectiveTime");
				return lastOrDefault.Last();
			}
			return CreateAnotherEffectiveTime();
		}

		public facade.datatypes.IVL_TSFacade CreateAnotherEffectiveTime()
		{
			IVL_TS element = new IVL_TS();
			facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
			elementFacade.Init();
			self.effectiveTime = SetOrAdd(self.effectiveTime, element);
			return elementFacade;
		}

		public facade.datatypes.IVL_TSFacade EffectiveTime()		{
			return GetOrCreateEffectiveTime();
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

		public List<RoleClassMutualRelationship> classCode()
		{
			return Set(self.@classCode);
		}

		public RoleClassMutualRelationship GetOrCreateClassCode()
		{
			List<RoleClassMutualRelationship> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public RoleClassMutualRelationship CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			RoleClassMutualRelationship element = new RoleClassMutualRelationship();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public RoleClassMutualRelationship ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(RoleClassMutualRelationship value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

}
}
