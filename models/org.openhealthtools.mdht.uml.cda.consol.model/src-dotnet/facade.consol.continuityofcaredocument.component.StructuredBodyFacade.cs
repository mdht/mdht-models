using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.continuityofcaredocument.component
{
    public class StructuredBodyFacade : facade.FacadeBase
    {

		public POCD_MT000040StructuredBody self;

		public StructuredBodyFacade()
		{
			this.self = new POCD_MT000040StructuredBody();
		}

		public StructuredBodyFacade(POCD_MT000040StructuredBody self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040StructuredBody self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateAllergiesSection();
			GetOrCreateMedicationsSection();
			GetOrCreateProblemSection();
			GetOrCreateProceduresSection();
			GetOrCreateResultsSection();
			GetOrCreateAdvanceDirectivesSection();
			GetOrCreateEncountersSection();
			GetOrCreateFamilyHistorySection();
			GetOrCreateFunctionalStatusSection();
			GetOrCreateImmunizationsSectionEntriesOptional();
			GetOrCreateMedicalEquipmentSection();
			GetOrCreatePayersSection();
			GetOrCreatePlanOfCareSection();
			GetOrCreateSocialHistorySection();
			GetOrCreateVitalSignsSectionEntriesOptional();
			GetOrCreateComponent();
		}

		/**
		 *UML path: /ContinuityOfCareDocument/component/structuredBody
		 *UML root path: /ContinuityOfCareDocument/component/structuredBody
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				allergiesSection().ForEach(x => x.Validate(vb, del));
				medicationsSection().ForEach(x => x.Validate(vb, del));
				problemSection().ForEach(x => x.Validate(vb, del));
				proceduresSection().ForEach(x => x.Validate(vb, del));
				resultsSection().ForEach(x => x.Validate(vb, del));
				advanceDirectivesSection().ForEach(x => x.Validate(vb, del));
				encountersSection().ForEach(x => x.Validate(vb, del));
				familyHistorySection().ForEach(x => x.Validate(vb, del));
				functionalStatusSection().ForEach(x => x.Validate(vb, del));
				immunizationsSectionEntriesOptional().ForEach(x => x.Validate(vb, del));
				medicalEquipmentSection().ForEach(x => x.Validate(vb, del));
				payersSection().ForEach(x => x.Validate(vb, del));
				planOfCareSection().ForEach(x => x.Validate(vb, del));
				socialHistorySection().ForEach(x => x.Validate(vb, del));
				vitalSignsSectionEntriesOptional().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				confidentialityCode().ForEach(x => x.Validate(vb, del));
				languageCode().ForEach(x => x.Validate(vb, del));
				component().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> allergiesSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateAllergiesSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = allergiesSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherAllergiesSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherAllergiesSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade AllergiesSection()		{
			return GetOrCreateAllergiesSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> medicationsSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateMedicationsSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = medicationsSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherMedicationsSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherMedicationsSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade MedicationsSection()		{
			return GetOrCreateMedicationsSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> problemSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateProblemSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = problemSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherProblemSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherProblemSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade ProblemSection()		{
			return GetOrCreateProblemSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> proceduresSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateProceduresSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = proceduresSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherProceduresSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherProceduresSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade ProceduresSection()		{
			return GetOrCreateProceduresSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> resultsSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateResultsSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = resultsSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherResultsSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherResultsSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade ResultsSection()		{
			return GetOrCreateResultsSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> advanceDirectivesSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateAdvanceDirectivesSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = advanceDirectivesSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherAdvanceDirectivesSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherAdvanceDirectivesSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade AdvanceDirectivesSection()		{
			return GetOrCreateAdvanceDirectivesSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> encountersSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateEncountersSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = encountersSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherEncountersSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherEncountersSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade EncountersSection()		{
			return GetOrCreateEncountersSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> familyHistorySection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateFamilyHistorySection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = familyHistorySection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherFamilyHistorySection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherFamilyHistorySection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade FamilyHistorySection()		{
			return GetOrCreateFamilyHistorySection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> functionalStatusSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateFunctionalStatusSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = functionalStatusSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherFunctionalStatusSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherFunctionalStatusSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade FunctionalStatusSection()		{
			return GetOrCreateFunctionalStatusSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> immunizationsSectionEntriesOptional()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateImmunizationsSectionEntriesOptional()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = immunizationsSectionEntriesOptional();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherImmunizationsSectionEntriesOptional();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherImmunizationsSectionEntriesOptional()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade ImmunizationsSectionEntriesOptional()		{
			return GetOrCreateImmunizationsSectionEntriesOptional();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> medicalEquipmentSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateMedicalEquipmentSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = medicalEquipmentSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherMedicalEquipmentSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherMedicalEquipmentSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade MedicalEquipmentSection()		{
			return GetOrCreateMedicalEquipmentSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> payersSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreatePayersSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = payersSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherPayersSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherPayersSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade PayersSection()		{
			return GetOrCreatePayersSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> planOfCareSection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreatePlanOfCareSection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = planOfCareSection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherPlanOfCareSection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherPlanOfCareSection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade PlanOfCareSection()		{
			return GetOrCreatePlanOfCareSection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> socialHistorySection()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateSocialHistorySection()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = socialHistorySection();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherSocialHistorySection();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherSocialHistorySection()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade SocialHistorySection()		{
			return GetOrCreateSocialHistorySection();
		}

		public List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> vitalSignsSectionEntriesOptional()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateVitalSignsSectionEntriesOptional()
		{
			List<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = vitalSignsSectionEntriesOptional();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherVitalSignsSectionEntriesOptional();
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherVitalSignsSectionEntriesOptional()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade VitalSignsSectionEntriesOptional()		{
			return GetOrCreateVitalSignsSectionEntriesOptional();
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

		public List<facade.datatypes.CEFacade> confidentialityCode()
		{
			return Set(self.confidentialityCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateConfidentialityCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = confidentialityCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "confidentialityCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherConfidentialityCode();
		}

		public facade.datatypes.CEFacade CreateAnotherConfidentialityCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.confidentialityCode = SetOrAdd(self.confidentialityCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade ConfidentialityCode()		{
			return GetOrCreateConfidentialityCode();
		}

		public List<facade.datatypes.CSFacade> languageCode()
		{
			return Set(self.languageCode).FindAll( x => x is CS).ConvertAll( x => x as CS).ConvertAll( x => new facade.datatypes.CSFacade(x));
		}

		public facade.datatypes.CSFacade GetOrCreateLanguageCode()
		{
			List<facade.datatypes.CSFacade> lastOrDefault = languageCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "languageCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherLanguageCode();
		}

		public facade.datatypes.CSFacade CreateAnotherLanguageCode()
		{
			CS element = new CS();
			facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
			elementFacade.Init();
			self.languageCode = SetOrAdd(self.languageCode, element);
			return elementFacade;
		}

		public facade.datatypes.CSFacade LanguageCode()		{
			return GetOrCreateLanguageCode();
		}

		public List<facade.cda.Component3Facade> component()
		{
			return Set(self.component).FindAll( x => facade.cda.Component3Facade.isKindOf(x)).ConvertAll( x => new facade.cda.Component3Facade(x));
		}

		public facade.cda.Component3Facade GetOrCreateComponent()
		{
			List<facade.cda.Component3Facade> lastOrDefault = component();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherComponent();
		}

		public facade.cda.Component3Facade CreateAnotherComponent()
		{
			POCD_MT000040Component3 element = new POCD_MT000040Component3();
			facade.cda.Component3Facade elementFacade = new facade.cda.Component3Facade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.cda.Component3Facade Component()		{
			return GetOrCreateComponent();
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

		public List<ActClass> classCode()
		{
			return Set(self.@classCode);
		}

		public ActClass GetOrCreateClassCode()
		{
			List<ActClass> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public ActClass CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			ActClass element = new ActClass();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public ActClass ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(ActClass value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

		public List<ActMood> moodCode()
		{
			return Set(self.@moodCode);
		}

		public ActMood GetOrCreateMoodCode()
		{
			List<ActMood> lastOrDefault = moodCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "moodCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherMoodCode();
		}

		public ActMood CreateAnotherMoodCode()
		{
			MarkSpecified(self, "moodCode");
			ActMood element = new ActMood();
			self.@moodCode = SetOrAdd(self.@moodCode, element);
			return element;
		}

		public ActMood MoodCode()		{
			return GetOrCreateMoodCode();
		}

		public void MoodCode(ActMood value)		{
			self.@moodCode = SetOrAdd(self.@moodCode, value);
		}

}
}
