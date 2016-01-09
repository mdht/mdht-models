using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.recordtarget.patientrole.patient
{
    public class BirthplaceFacade : facade.FacadeBase
    {

		public POCD_MT000040Birthplace self;

		public BirthplaceFacade()
		{
			this.self = new POCD_MT000040Birthplace();
		}

		public BirthplaceFacade(POCD_MT000040Birthplace self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Birthplace self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreatePlace();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
		 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				place().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade> place()
		{
			return Set(self.place).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade GetOrCreatePlace()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade> lastOrDefault = place();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "place");
				return lastOrDefault.Last();
			}
			return CreateAnotherPlace();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade CreateAnotherPlace()
		{
			POCD_MT000040Place element = new POCD_MT000040Place();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade(element);
			elementFacade.Init();
			self.place = SetOrAdd(self.place, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade Place()		{
			return GetOrCreatePlace();
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
