using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.author.assignedauthor
{
    public class AuthoringDeviceFacade : facade.FacadeBase
    {

		public POCD_MT000040AuthoringDevice self;

		public AuthoringDeviceFacade()
		{
			this.self = new POCD_MT000040AuthoringDevice();
		}

		public AuthoringDeviceFacade(POCD_MT000040AuthoringDevice self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040AuthoringDevice self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateManufacturerModelName();
			GetOrCreateSoftwareName();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
		 *UML root path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				manufacturerModelName().ForEach(x => x.Validate(vb, del));
				softwareName().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				code().ForEach(x => x.Validate(vb, del));
				asMaintainedEntity().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.datatypes.SCFacade> manufacturerModelName()
		{
			return Set(self.manufacturerModelName).FindAll( x => x is SC).ConvertAll( x => x as SC).ConvertAll( x => new facade.datatypes.SCFacade(x));
		}

		public facade.datatypes.SCFacade GetOrCreateManufacturerModelName()
		{
			List<facade.datatypes.SCFacade> lastOrDefault = manufacturerModelName();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "manufacturerModelName");
				return lastOrDefault.Last();
			}
			return CreateAnotherManufacturerModelName();
		}

		public facade.datatypes.SCFacade CreateAnotherManufacturerModelName()
		{
			SC element = new SC();
			facade.datatypes.SCFacade elementFacade = new facade.datatypes.SCFacade(element);
			elementFacade.Init();
			self.manufacturerModelName = SetOrAdd(self.manufacturerModelName, element);
			return elementFacade;
		}

		public facade.datatypes.SCFacade ManufacturerModelName()		{
			return GetOrCreateManufacturerModelName();
		}

		public List<facade.datatypes.SCFacade> softwareName()
		{
			return Set(self.softwareName).FindAll( x => x is SC).ConvertAll( x => x as SC).ConvertAll( x => new facade.datatypes.SCFacade(x));
		}

		public facade.datatypes.SCFacade GetOrCreateSoftwareName()
		{
			List<facade.datatypes.SCFacade> lastOrDefault = softwareName();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "softwareName");
				return lastOrDefault.Last();
			}
			return CreateAnotherSoftwareName();
		}

		public facade.datatypes.SCFacade CreateAnotherSoftwareName()
		{
			SC element = new SC();
			facade.datatypes.SCFacade elementFacade = new facade.datatypes.SCFacade(element);
			elementFacade.Init();
			self.softwareName = SetOrAdd(self.softwareName, element);
			return elementFacade;
		}

		public facade.datatypes.SCFacade SoftwareName()		{
			return GetOrCreateSoftwareName();
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

		public List<facade.cda.MaintainedEntityFacade> asMaintainedEntity()
		{
			return Set(self.asMaintainedEntity).FindAll( x => facade.cda.MaintainedEntityFacade.isKindOf(x)).ConvertAll( x => new facade.cda.MaintainedEntityFacade(x));
		}

		public facade.cda.MaintainedEntityFacade GetOrCreateAsMaintainedEntity()
		{
			List<facade.cda.MaintainedEntityFacade> lastOrDefault = asMaintainedEntity();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "asMaintainedEntity");
				return lastOrDefault.Last();
			}
			return CreateAnotherAsMaintainedEntity();
		}

		public facade.cda.MaintainedEntityFacade CreateAnotherAsMaintainedEntity()
		{
			POCD_MT000040MaintainedEntity element = new POCD_MT000040MaintainedEntity();
			facade.cda.MaintainedEntityFacade elementFacade = new facade.cda.MaintainedEntityFacade(element);
			elementFacade.Init();
			self.asMaintainedEntity = SetOrAdd(self.asMaintainedEntity, element);
			return elementFacade;
		}

		public facade.cda.MaintainedEntityFacade AsMaintainedEntity()		{
			return GetOrCreateAsMaintainedEntity();
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

		public List<EntityClassDevice> classCode()
		{
			return Set(self.@classCode);
		}

		public EntityClassDevice GetOrCreateClassCode()
		{
			List<EntityClassDevice> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public EntityClassDevice CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			EntityClassDevice element = new EntityClassDevice();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public EntityClassDevice ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(EntityClassDevice value)		{
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
