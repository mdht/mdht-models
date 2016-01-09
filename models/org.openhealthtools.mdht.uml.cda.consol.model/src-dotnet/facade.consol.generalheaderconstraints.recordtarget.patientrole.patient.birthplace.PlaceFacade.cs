using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace
{
    public class PlaceFacade : facade.FacadeBase
    {

		public POCD_MT000040Place self;

		public PlaceFacade()
		{
			this.self = new POCD_MT000040Place();
		}

		public PlaceFacade(POCD_MT000040Place self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Place self)
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
		}

		/**
		 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
		 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				addr().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				name().ForEach(x => x.Validate(vb, del));
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

		public List<facade.datatypes.ENFacade> name()
		{
			return Set(self.name).FindAll( x => x is EN).ConvertAll( x => x as EN).ConvertAll( x => new facade.datatypes.ENFacade(x));
		}

		public facade.datatypes.ENFacade GetOrCreateName()
		{
			List<facade.datatypes.ENFacade> lastOrDefault = name();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "name");
				return lastOrDefault.Last();
			}
			return CreateAnotherName();
		}

		public facade.datatypes.ENFacade CreateAnotherName()
		{
			EN element = new EN();
			facade.datatypes.ENFacade elementFacade = new facade.datatypes.ENFacade(element);
			elementFacade.Init();
			self.name = SetOrAdd(self.name, element);
			return elementFacade;
		}

		public facade.datatypes.ENFacade Name()		{
			return GetOrCreateName();
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

		public List<EntityClassPlace> classCode()
		{
			return Set(self.@classCode);
		}

		public EntityClassPlace GetOrCreateClassCode()
		{
			List<EntityClassPlace> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public EntityClassPlace CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			EntityClassPlace element = new EntityClassPlace();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public EntityClassPlace ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(EntityClassPlace value)		{
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
