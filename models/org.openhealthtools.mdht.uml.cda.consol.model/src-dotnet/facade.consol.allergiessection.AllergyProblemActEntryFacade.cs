using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.allergiessection
{
    public class AllergyProblemActEntryFacade : facade.FacadeBase
    {

		public POCD_MT000040Entry self;

		public AllergyProblemActEntryFacade()
		{
			this.self = new POCD_MT000040Entry();
		}

		public AllergyProblemActEntryFacade(POCD_MT000040Entry self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Entry self)
		{
			return Flatten(Set(self.act).ConvertAll(i1347 => i1347.templateId)).Exists(id => Set(id.@root).Contains("2.16.840.1.113883.10.20.22.4.30"));
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateAllergyProblemAct();
		}

		/**
		 *UML path: /AllergiesSection/entry
		 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection/entry
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				allergyProblemAct().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				act().ForEach(x => x.Validate(vb, del));
				encounter().ForEach(x => x.Validate(vb, del));
				observation().ForEach(x => x.Validate(vb, del));
				observationMedia().ForEach(x => x.Validate(vb, del));
				organizer().ForEach(x => x.Validate(vb, del));
				procedure().ForEach(x => x.Validate(vb, del));
				regionOfInterest().ForEach(x => x.Validate(vb, del));
				substanceAdministration().ForEach(x => x.Validate(vb, del));
				supply().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.consol.AllergyProblemActFacade> allergyProblemAct()
		{
			return Set(self.act).FindAll( x => facade.consol.AllergyProblemActFacade.isKindOf(x)).ConvertAll( x => new facade.consol.AllergyProblemActFacade(x));
		}

		public facade.consol.AllergyProblemActFacade GetOrCreateAllergyProblemAct()
		{
			List<facade.consol.AllergyProblemActFacade> lastOrDefault = allergyProblemAct();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "act");
				return lastOrDefault.Last();
			}
			return CreateAnotherAllergyProblemAct();
		}

		public facade.consol.AllergyProblemActFacade CreateAnotherAllergyProblemAct()
		{
			POCD_MT000040Act element = new POCD_MT000040Act();
			facade.consol.AllergyProblemActFacade elementFacade = new facade.consol.AllergyProblemActFacade(element);
			elementFacade.Init();
			self.act = SetOrAdd(self.act, element);
			return elementFacade;
		}

		public facade.consol.AllergyProblemActFacade AllergyProblemAct()		{
			return GetOrCreateAllergyProblemAct();
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

		public List<facade.cda.ActFacade> act()
		{
			return Set(self.act).FindAll( x => facade.cda.ActFacade.isKindOf(x)).ConvertAll( x => new facade.cda.ActFacade(x));
		}

		public facade.cda.ActFacade GetOrCreateAct()
		{
			List<facade.cda.ActFacade> lastOrDefault = act();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "act");
				return lastOrDefault.Last();
			}
			return CreateAnotherAct();
		}

		public facade.cda.ActFacade CreateAnotherAct()
		{
			POCD_MT000040Act element = new POCD_MT000040Act();
			facade.cda.ActFacade elementFacade = new facade.cda.ActFacade(element);
			elementFacade.Init();
			self.act = SetOrAdd(self.act, element);
			return elementFacade;
		}

		public facade.cda.ActFacade Act()		{
			return GetOrCreateAct();
		}

		public List<facade.cda.EncounterFacade> encounter()
		{
			return Set(self.encounter).FindAll( x => facade.cda.EncounterFacade.isKindOf(x)).ConvertAll( x => new facade.cda.EncounterFacade(x));
		}

		public facade.cda.EncounterFacade GetOrCreateEncounter()
		{
			List<facade.cda.EncounterFacade> lastOrDefault = encounter();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "encounter");
				return lastOrDefault.Last();
			}
			return CreateAnotherEncounter();
		}

		public facade.cda.EncounterFacade CreateAnotherEncounter()
		{
			POCD_MT000040Encounter element = new POCD_MT000040Encounter();
			facade.cda.EncounterFacade elementFacade = new facade.cda.EncounterFacade(element);
			elementFacade.Init();
			self.encounter = SetOrAdd(self.encounter, element);
			return elementFacade;
		}

		public facade.cda.EncounterFacade Encounter()		{
			return GetOrCreateEncounter();
		}

		public List<facade.cda.ObservationFacade> observation()
		{
			return Set(self.observation).FindAll( x => facade.cda.ObservationFacade.isKindOf(x)).ConvertAll( x => new facade.cda.ObservationFacade(x));
		}

		public facade.cda.ObservationFacade GetOrCreateObservation()
		{
			List<facade.cda.ObservationFacade> lastOrDefault = observation();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "observation");
				return lastOrDefault.Last();
			}
			return CreateAnotherObservation();
		}

		public facade.cda.ObservationFacade CreateAnotherObservation()
		{
			POCD_MT000040Observation element = new POCD_MT000040Observation();
			facade.cda.ObservationFacade elementFacade = new facade.cda.ObservationFacade(element);
			elementFacade.Init();
			self.observation = SetOrAdd(self.observation, element);
			return elementFacade;
		}

		public facade.cda.ObservationFacade Observation()		{
			return GetOrCreateObservation();
		}

		public List<facade.cda.ObservationMediaFacade> observationMedia()
		{
			return Set(self.observationMedia).FindAll( x => facade.cda.ObservationMediaFacade.isKindOf(x)).ConvertAll( x => new facade.cda.ObservationMediaFacade(x));
		}

		public facade.cda.ObservationMediaFacade GetOrCreateObservationMedia()
		{
			List<facade.cda.ObservationMediaFacade> lastOrDefault = observationMedia();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "observationMedia");
				return lastOrDefault.Last();
			}
			return CreateAnotherObservationMedia();
		}

		public facade.cda.ObservationMediaFacade CreateAnotherObservationMedia()
		{
			POCD_MT000040ObservationMedia element = new POCD_MT000040ObservationMedia();
			facade.cda.ObservationMediaFacade elementFacade = new facade.cda.ObservationMediaFacade(element);
			elementFacade.Init();
			self.observationMedia = SetOrAdd(self.observationMedia, element);
			return elementFacade;
		}

		public facade.cda.ObservationMediaFacade ObservationMedia()		{
			return GetOrCreateObservationMedia();
		}

		public List<facade.cda.OrganizerFacade> organizer()
		{
			return Set(self.organizer).FindAll( x => facade.cda.OrganizerFacade.isKindOf(x)).ConvertAll( x => new facade.cda.OrganizerFacade(x));
		}

		public facade.cda.OrganizerFacade GetOrCreateOrganizer()
		{
			List<facade.cda.OrganizerFacade> lastOrDefault = organizer();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "organizer");
				return lastOrDefault.Last();
			}
			return CreateAnotherOrganizer();
		}

		public facade.cda.OrganizerFacade CreateAnotherOrganizer()
		{
			POCD_MT000040Organizer element = new POCD_MT000040Organizer();
			facade.cda.OrganizerFacade elementFacade = new facade.cda.OrganizerFacade(element);
			elementFacade.Init();
			self.organizer = SetOrAdd(self.organizer, element);
			return elementFacade;
		}

		public facade.cda.OrganizerFacade Organizer()		{
			return GetOrCreateOrganizer();
		}

		public List<facade.cda.ProcedureFacade> procedure()
		{
			return Set(self.procedure).FindAll( x => facade.cda.ProcedureFacade.isKindOf(x)).ConvertAll( x => new facade.cda.ProcedureFacade(x));
		}

		public facade.cda.ProcedureFacade GetOrCreateProcedure()
		{
			List<facade.cda.ProcedureFacade> lastOrDefault = procedure();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "procedure");
				return lastOrDefault.Last();
			}
			return CreateAnotherProcedure();
		}

		public facade.cda.ProcedureFacade CreateAnotherProcedure()
		{
			POCD_MT000040Procedure element = new POCD_MT000040Procedure();
			facade.cda.ProcedureFacade elementFacade = new facade.cda.ProcedureFacade(element);
			elementFacade.Init();
			self.procedure = SetOrAdd(self.procedure, element);
			return elementFacade;
		}

		public facade.cda.ProcedureFacade Procedure()		{
			return GetOrCreateProcedure();
		}

		public List<facade.cda.RegionOfInterestFacade> regionOfInterest()
		{
			return Set(self.regionOfInterest).FindAll( x => facade.cda.RegionOfInterestFacade.isKindOf(x)).ConvertAll( x => new facade.cda.RegionOfInterestFacade(x));
		}

		public facade.cda.RegionOfInterestFacade GetOrCreateRegionOfInterest()
		{
			List<facade.cda.RegionOfInterestFacade> lastOrDefault = regionOfInterest();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "regionOfInterest");
				return lastOrDefault.Last();
			}
			return CreateAnotherRegionOfInterest();
		}

		public facade.cda.RegionOfInterestFacade CreateAnotherRegionOfInterest()
		{
			POCD_MT000040RegionOfInterest element = new POCD_MT000040RegionOfInterest();
			facade.cda.RegionOfInterestFacade elementFacade = new facade.cda.RegionOfInterestFacade(element);
			elementFacade.Init();
			self.regionOfInterest = SetOrAdd(self.regionOfInterest, element);
			return elementFacade;
		}

		public facade.cda.RegionOfInterestFacade RegionOfInterest()		{
			return GetOrCreateRegionOfInterest();
		}

		public List<facade.cda.SubstanceAdministrationFacade> substanceAdministration()
		{
			return Set(self.substanceAdministration).FindAll( x => facade.cda.SubstanceAdministrationFacade.isKindOf(x)).ConvertAll( x => new facade.cda.SubstanceAdministrationFacade(x));
		}

		public facade.cda.SubstanceAdministrationFacade GetOrCreateSubstanceAdministration()
		{
			List<facade.cda.SubstanceAdministrationFacade> lastOrDefault = substanceAdministration();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "substanceAdministration");
				return lastOrDefault.Last();
			}
			return CreateAnotherSubstanceAdministration();
		}

		public facade.cda.SubstanceAdministrationFacade CreateAnotherSubstanceAdministration()
		{
			POCD_MT000040SubstanceAdministration element = new POCD_MT000040SubstanceAdministration();
			facade.cda.SubstanceAdministrationFacade elementFacade = new facade.cda.SubstanceAdministrationFacade(element);
			elementFacade.Init();
			self.substanceAdministration = SetOrAdd(self.substanceAdministration, element);
			return elementFacade;
		}

		public facade.cda.SubstanceAdministrationFacade SubstanceAdministration()		{
			return GetOrCreateSubstanceAdministration();
		}

		public List<facade.cda.SupplyFacade> supply()
		{
			return Set(self.supply).FindAll( x => facade.cda.SupplyFacade.isKindOf(x)).ConvertAll( x => new facade.cda.SupplyFacade(x));
		}

		public facade.cda.SupplyFacade GetOrCreateSupply()
		{
			List<facade.cda.SupplyFacade> lastOrDefault = supply();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "supply");
				return lastOrDefault.Last();
			}
			return CreateAnotherSupply();
		}

		public facade.cda.SupplyFacade CreateAnotherSupply()
		{
			POCD_MT000040Supply element = new POCD_MT000040Supply();
			facade.cda.SupplyFacade elementFacade = new facade.cda.SupplyFacade(element);
			elementFacade.Init();
			self.supply = SetOrAdd(self.supply, element);
			return elementFacade;
		}

		public facade.cda.SupplyFacade Supply()		{
			return GetOrCreateSupply();
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

		public List<x_ActRelationshipEntry> typeCode()
		{
			return Set(self.@typeCode);
		}

		public x_ActRelationshipEntry GetOrCreateTypeCode()
		{
			List<x_ActRelationshipEntry> lastOrDefault = typeCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "typeCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherTypeCode();
		}

		public x_ActRelationshipEntry CreateAnotherTypeCode()
		{
			MarkSpecified(self, "typeCode");
			x_ActRelationshipEntry element = new x_ActRelationshipEntry();
			self.@typeCode = SetOrAdd(self.@typeCode, element);
			return element;
		}

		public x_ActRelationshipEntry TypeCode()		{
			return GetOrCreateTypeCode();
		}

		public void TypeCode(x_ActRelationshipEntry value)		{
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
