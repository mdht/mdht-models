using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.documentationof.serviceevent
{
    public class Performer1Facade : facade.FacadeBase
    {

		public POCD_MT000040Performer1 self;

		public Performer1Facade()
		{
			this.self = new POCD_MT000040Performer1();
		}

		public Performer1Facade(POCD_MT000040Performer1 self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Performer1 self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateAssignedEntity();
			GetOrCreateTypeCode();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		 *UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				functionCode().ForEach(x => x.Validate(vb, del));
				assignedEntity().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				time().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.datatypes.CEFacade> functionCode()
		{
			return Set(self.functionCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateFunctionCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = functionCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "functionCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherFunctionCode();
		}

		public facade.datatypes.CEFacade CreateAnotherFunctionCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.functionCode = SetOrAdd(self.functionCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade FunctionCode()		{
			return GetOrCreateFunctionCode();
		}

		public List<facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade> assignedEntity()
		{
			return Set(self.assignedEntity).FindAll( x => facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade(x));
		}

		public facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade GetOrCreateAssignedEntity()
		{
			List<facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade> lastOrDefault = assignedEntity();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "assignedEntity");
				return lastOrDefault.Last();
			}
			return CreateAnotherAssignedEntity();
		}

		public facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade CreateAnotherAssignedEntity()
		{
			POCD_MT000040AssignedEntity element = new POCD_MT000040AssignedEntity();
			facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade(element);
			elementFacade.Init();
			self.assignedEntity = SetOrAdd(self.assignedEntity, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade AssignedEntity()		{
			return GetOrCreateAssignedEntity();
		}

		public List<x_ServiceEventPerformer> typeCode()
		{
			return Set(self.@typeCode);
		}

		public x_ServiceEventPerformer GetOrCreateTypeCode()
		{
			List<x_ServiceEventPerformer> lastOrDefault = typeCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "typeCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherTypeCode();
		}

		public x_ServiceEventPerformer CreateAnotherTypeCode()
		{
			MarkSpecified(self, "typeCode");
			x_ServiceEventPerformer element = new x_ServiceEventPerformer();
			self.@typeCode = SetOrAdd(self.@typeCode, element);
			return element;
		}

		public x_ServiceEventPerformer TypeCode()		{
			return GetOrCreateTypeCode();
		}

		public void TypeCode(x_ServiceEventPerformer value)		{
			self.@typeCode = SetOrAdd(self.@typeCode, value);
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

		public List<facade.datatypes.IVL_TSFacade> time()
		{
			return Set(self.time).FindAll( x => x is IVL_TS).ConvertAll( x => x as IVL_TS).ConvertAll( x => new facade.datatypes.IVL_TSFacade(x));
		}

		public facade.datatypes.IVL_TSFacade GetOrCreateTime()
		{
			List<facade.datatypes.IVL_TSFacade> lastOrDefault = time();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "time");
				return lastOrDefault.Last();
			}
			return CreateAnotherTime();
		}

		public facade.datatypes.IVL_TSFacade CreateAnotherTime()
		{
			IVL_TS element = new IVL_TS();
			facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
			elementFacade.Init();
			self.time = SetOrAdd(self.time, element);
			return elementFacade;
		}

		public facade.datatypes.IVL_TSFacade Time()		{
			return GetOrCreateTime();
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

}
}
