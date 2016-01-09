using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.continuityofcaredocument
{
    public class ComponentFacade : facade.FacadeBase
    {

		public POCD_MT000040Component2 self;

		public ComponentFacade()
		{
			this.self = new POCD_MT000040Component2();
		}

		public ComponentFacade(POCD_MT000040Component2 self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Component2 self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateStructuredBody();
		}

		/**
		 *UML path: /ContinuityOfCareDocument/component
		 *UML root path: /ContinuityOfCareDocument/component
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				structuredBody().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				nonXMLBody().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.continuityofcaredocument.component.StructuredBodyFacade> structuredBody()
		{
			return Set(self.structuredBody).FindAll( x => facade.consol.continuityofcaredocument.component.StructuredBodyFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.StructuredBodyFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.StructuredBodyFacade GetOrCreateStructuredBody()
		{
			List<facade.consol.continuityofcaredocument.component.StructuredBodyFacade> lastOrDefault = structuredBody();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "structuredBody");
				return lastOrDefault.Last();
			}
			return CreateAnotherStructuredBody();
		}

		public facade.consol.continuityofcaredocument.component.StructuredBodyFacade CreateAnotherStructuredBody()
		{
			POCD_MT000040StructuredBody element = new POCD_MT000040StructuredBody();
			facade.consol.continuityofcaredocument.component.StructuredBodyFacade elementFacade = new facade.consol.continuityofcaredocument.component.StructuredBodyFacade(element);
			elementFacade.Init();
			self.structuredBody = SetOrAdd(self.structuredBody, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.StructuredBodyFacade StructuredBody()		{
			return GetOrCreateStructuredBody();
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

		public List<facade.cda.NonXMLBodyFacade> nonXMLBody()
		{
			return Set(self.nonXMLBody).FindAll( x => facade.cda.NonXMLBodyFacade.isKindOf(x)).ConvertAll( x => new facade.cda.NonXMLBodyFacade(x));
		}

		public facade.cda.NonXMLBodyFacade GetOrCreateNonXMLBody()
		{
			List<facade.cda.NonXMLBodyFacade> lastOrDefault = nonXMLBody();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "nonXMLBody");
				return lastOrDefault.Last();
			}
			return CreateAnotherNonXMLBody();
		}

		public facade.cda.NonXMLBodyFacade CreateAnotherNonXMLBody()
		{
			POCD_MT000040NonXMLBody element = new POCD_MT000040NonXMLBody();
			facade.cda.NonXMLBodyFacade elementFacade = new facade.cda.NonXMLBodyFacade(element);
			elementFacade.Init();
			self.nonXMLBody = SetOrAdd(self.nonXMLBody, element);
			return elementFacade;
		}

		public facade.cda.NonXMLBodyFacade NonXMLBody()		{
			return GetOrCreateNonXMLBody();
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
