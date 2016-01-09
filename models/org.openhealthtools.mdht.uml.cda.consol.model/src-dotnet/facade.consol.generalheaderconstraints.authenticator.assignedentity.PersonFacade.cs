using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.authenticator.assignedentity
{
    public class PersonFacade : facade.FacadeBase
    {

		public POCD_MT000040Person self;

		public PersonFacade()
		{
			this.self = new POCD_MT000040Person();
		}

		public PersonFacade(POCD_MT000040Person self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Person self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateName();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/authenticator/assignedEntity/assignedPerson
		 *UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity/assignedPerson
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				name().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.datatypes.PNFacade> name()
		{
			return Set(self.name).FindAll( x => x is PN).ConvertAll( x => x as PN).ConvertAll( x => new facade.datatypes.PNFacade(x));
		}

		public facade.datatypes.PNFacade GetOrCreateName()
		{
			List<facade.datatypes.PNFacade> lastOrDefault = name();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "name");
				return lastOrDefault.Last();
			}
			return CreateAnotherName();
		}

		public facade.datatypes.PNFacade CreateAnotherName()
		{
			PN element = new PN();
			facade.datatypes.PNFacade elementFacade = new facade.datatypes.PNFacade(element);
			elementFacade.Init();
			self.name = SetOrAdd(self.name, element);
			return elementFacade;
		}

		public facade.datatypes.PNFacade Name()		{
			return GetOrCreateName();
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

		public List<EntityClass> classCode()
		{
			return Set(self.@classCode);
		}

		public EntityClass GetOrCreateClassCode()
		{
			List<EntityClass> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public EntityClass CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			EntityClass element = new EntityClass();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public EntityClass ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(EntityClass value)		{
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
