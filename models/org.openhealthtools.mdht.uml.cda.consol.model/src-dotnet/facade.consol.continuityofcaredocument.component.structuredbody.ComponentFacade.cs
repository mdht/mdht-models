using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.continuityofcaredocument.component.structuredbody
{
    public class ComponentFacade : facade.FacadeBase
    {

		public POCD_MT000040Component3 self;

		public ComponentFacade()
		{
			this.self = new POCD_MT000040Component3();
		}

		public ComponentFacade(POCD_MT000040Component3 self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Component3 self)
		{
			return Flatten(Set(self.section).ConvertAll(i1346 => i1346.templateId)).Exists(id => Set(id.@root).Contains("2.16.840.1.113883.10.20.22.2.6.1"));
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateAllergiesSection();
			GetOrCreateSection();
		}

		/**
		 *UML path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection
		 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				allergiesSection().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				section().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.AllergiesSectionFacade> allergiesSection()
		{
			return Set(self.section).FindAll( x => facade.consol.AllergiesSectionFacade.isKindOf(x)).ConvertAll( x => new facade.consol.AllergiesSectionFacade(x));
		}

		public facade.consol.AllergiesSectionFacade GetOrCreateAllergiesSection()
		{
			List<facade.consol.AllergiesSectionFacade> lastOrDefault = allergiesSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "section");
				return lastOrDefault.Last();
			}
			return CreateAnotherAllergiesSection();
		}

		public facade.consol.AllergiesSectionFacade CreateAnotherAllergiesSection()
		{
			POCD_MT000040Section element = new POCD_MT000040Section();
			facade.consol.AllergiesSectionFacade elementFacade = new facade.consol.AllergiesSectionFacade(element);
			elementFacade.Init();
			self.section = SetOrAdd(self.section, element);
			return elementFacade;
		}

		public facade.consol.AllergiesSectionFacade AllergiesSection()		{
			return GetOrCreateAllergiesSection();
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

		public List<facade.cda.SectionFacade> section()
		{
			return Set(self.section).FindAll( x => facade.cda.SectionFacade.isKindOf(x)).ConvertAll( x => new facade.cda.SectionFacade(x));
		}

		public facade.cda.SectionFacade GetOrCreateSection()
		{
			List<facade.cda.SectionFacade> lastOrDefault = section();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "section");
				return lastOrDefault.Last();
			}
			return CreateAnotherSection();
		}

		public facade.cda.SectionFacade CreateAnotherSection()
		{
			POCD_MT000040Section element = new POCD_MT000040Section();
			facade.cda.SectionFacade elementFacade = new facade.cda.SectionFacade(element);
			elementFacade.Init();
			self.section = SetOrAdd(self.section, element);
			return elementFacade;
		}

		public facade.cda.SectionFacade Section()		{
			return GetOrCreateSection();
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

		public List<ActRelationshipHasComponent> typeCode()
		{
			return Set(self.@typeCode);
		}

		public ActRelationshipHasComponent GetOrCreateTypeCode()
		{
			List<ActRelationshipHasComponent> lastOrDefault = typeCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "typeCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherTypeCode();
		}

		public ActRelationshipHasComponent CreateAnotherTypeCode()
		{
			MarkSpecified(self, "typeCode");
			ActRelationshipHasComponent element = new ActRelationshipHasComponent();
			self.@typeCode = SetOrAdd(self.@typeCode, element);
			return element;
		}

		public ActRelationshipHasComponent TypeCode()		{
			return GetOrCreateTypeCode();
		}

		public void TypeCode(ActRelationshipHasComponent value)		{
			self.@typeCode = SetOrAdd(self.@typeCode, value);
		}

		public List<bool> contextConductionInd()
		{
			return Set(self.@contextConductionInd);
		}

		public bool GetOrCreateContextConductionInd()
		{
			List<bool> lastOrDefault = contextConductionInd();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "contextConductionInd");
				return lastOrDefault.Last();
			}
			return CreateAnotherContextConductionInd();
		}

		public bool CreateAnotherContextConductionInd()
		{
			MarkSpecified(self, "contextConductionInd");
			bool element = new bool();
			self.@contextConductionInd = SetOrAdd(self.@contextConductionInd, element);
			return element;
		}

		public bool ContextConductionInd()		{
			return GetOrCreateContextConductionInd();
		}

		public void ContextConductionInd(bool value)		{
			self.@contextConductionInd = SetOrAdd(self.@contextConductionInd, value);
		}

}
}
