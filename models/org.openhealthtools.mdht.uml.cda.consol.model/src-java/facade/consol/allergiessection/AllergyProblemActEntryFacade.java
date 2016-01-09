package facade.consol.allergiessection;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.openhealthtools.mdht.uml.cda.*;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.*;
import org.openhealthtools.mdht.uml.hl7.vocab.*;

public class AllergyProblemActEntryFacade extends facade.FacadeBase {

	public Entry self;

	public AllergyProblemActEntryFacade()
	{
		this.self = CDAFactory.eINSTANCE.createEntry();
	}

	public AllergyProblemActEntryFacade(Entry self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Entry self)
	{
		return Flatten(Set(self.getActs()).map(i3888 -> Set(i3888.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.30"));
	}

	@Override
	public Object getModelElement()
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
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateAllergiesSectionAllergyProblemActEntryAllergyProblemAct(vb, del);

			allergyProblemAct().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			act().forEach(x -> x.Validate(vb, del));
			encounter().forEach(x -> x.Validate(vb, del));
			observation().forEach(x -> x.Validate(vb, del));
			observationMedia().forEach(x -> x.Validate(vb, del));
			organizer().forEach(x -> x.Validate(vb, del));
			procedure().forEach(x -> x.Validate(vb, del));
			regionOfInterest().forEach(x -> x.Validate(vb, del));
			substanceAdministration().forEach(x -> x.Validate(vb, del));
			supply().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyProblemAct))
	 * Context: /AllergiesSection/entry
	 * Context Class: consol::AllergiesSection::AllergyProblemActEntry
	 * Constraint Name: consol::AllergiesSection::AllergyProblemActEntry::AllergiesSectionAllergyProblemActEntryAllergyProblemAct
	 */
	public boolean ValidateAllergiesSectionAllergyProblemActEntryAllergyProblemAct(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getAct()).anyMatch(i3858 -> !(Set(i3858).count()==0) && Set(One(Set(i3858)).getTemplateIds()).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.30")));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 3.3.6.i allergyProblemAct\n\t\tConformance: SHALL contain at least one [1..*] act (CONF:7531, CONF:7532)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.AllergyProblemActFacade> allergyProblemAct()
	{
		return Set(self.getAct()).filter( x -> facade.consol.AllergyProblemActFacade.isKindOf(x)).map( x -> new facade.consol.AllergyProblemActFacade(x));
	}

	public facade.consol.AllergyProblemActFacade GetOrCreateAllergyProblemAct()
	{
		Optional<facade.consol.AllergyProblemActFacade> lastOrDefault = allergyProblemAct().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_Act());
			return lastOrDefault.get();
		}
		return CreateAnotherAllergyProblemAct();
	}

	public facade.consol.AllergyProblemActFacade CreateAnotherAllergyProblemAct()
	{
		Act element = CDAFactory.eINSTANCE.createAct();
		facade.consol.AllergyProblemActFacade elementFacade = new facade.consol.AllergyProblemActFacade(element);
		elementFacade.Init();
		self.setAct(element);
		return elementFacade;
	}

	public facade.consol.AllergyProblemActFacade AllergyProblemAct() {
		return GetOrCreateAllergyProblemAct();
	}

	public Stream<facade.datatypes.CSFacade> realmCode()
	{
		return Set(self.getRealmCodes()).filter( x -> x instanceof CS).map( x -> (CS) x).map( x -> new facade.datatypes.CSFacade(x));
	}

	public facade.datatypes.CSFacade GetOrCreateRealmCode()
	{
		Optional<facade.datatypes.CSFacade> lastOrDefault = realmCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_RealmCode());
			return lastOrDefault.get();
		}
		return CreateAnotherRealmCode();
	}

	public facade.datatypes.CSFacade CreateAnotherRealmCode()
	{
		CS element = DatatypesFactory.eINSTANCE.createCS();
		facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
		elementFacade.Init();
		self.getRealmCodes().add(element);
		return elementFacade;
	}

	public facade.datatypes.CSFacade RealmCode() {
		return GetOrCreateRealmCode();
	}

	public Stream<facade.cda.InfrastructureRootTypeIdFacade> typeId()
	{
		return Set(self.getTypeId()).filter( x -> facade.cda.InfrastructureRootTypeIdFacade.isKindOf(x)).map( x -> new facade.cda.InfrastructureRootTypeIdFacade(x));
	}

	public facade.cda.InfrastructureRootTypeIdFacade GetOrCreateTypeId()
	{
		Optional<facade.cda.InfrastructureRootTypeIdFacade> lastOrDefault = typeId().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_TypeId());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeId();
	}

	public facade.cda.InfrastructureRootTypeIdFacade CreateAnotherTypeId()
	{
		InfrastructureRootTypeId element = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
		facade.cda.InfrastructureRootTypeIdFacade elementFacade = new facade.cda.InfrastructureRootTypeIdFacade(element);
		elementFacade.Init();
		self.setTypeId(element);
		return elementFacade;
	}

	public facade.cda.InfrastructureRootTypeIdFacade TypeId() {
		return GetOrCreateTypeId();
	}

	public Stream<facade.datatypes.IIFacade> templateId()
	{
		return Set(self.getTemplateIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateTemplateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = templateId().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_TemplateId());
			return lastOrDefault.get();
		}
		return CreateAnotherTemplateId();
	}

	public facade.datatypes.IIFacade CreateAnotherTemplateId()
	{
		II element = DatatypesFactory.eINSTANCE.createII();
		facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
		elementFacade.Init();
		self.getTemplateIds().add(element);
		return elementFacade;
	}

	public facade.datatypes.IIFacade TemplateId() {
		return GetOrCreateTemplateId();
	}

	public Stream<facade.cda.ActFacade> act()
	{
		return Set(self.getAct()).filter( x -> facade.cda.ActFacade.isKindOf(x)).map( x -> new facade.cda.ActFacade(x));
	}

	public facade.cda.ActFacade GetOrCreateAct()
	{
		Optional<facade.cda.ActFacade> lastOrDefault = act().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_Act());
			return lastOrDefault.get();
		}
		return CreateAnotherAct();
	}

	public facade.cda.ActFacade CreateAnotherAct()
	{
		Act element = CDAFactory.eINSTANCE.createAct();
		facade.cda.ActFacade elementFacade = new facade.cda.ActFacade(element);
		elementFacade.Init();
		self.setAct(element);
		return elementFacade;
	}

	public facade.cda.ActFacade Act() {
		return GetOrCreateAct();
	}

	public Stream<facade.cda.EncounterFacade> encounter()
	{
		return Set(self.getEncounter()).filter( x -> facade.cda.EncounterFacade.isKindOf(x)).map( x -> new facade.cda.EncounterFacade(x));
	}

	public facade.cda.EncounterFacade GetOrCreateEncounter()
	{
		Optional<facade.cda.EncounterFacade> lastOrDefault = encounter().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_Encounter());
			return lastOrDefault.get();
		}
		return CreateAnotherEncounter();
	}

	public facade.cda.EncounterFacade CreateAnotherEncounter()
	{
		Encounter element = CDAFactory.eINSTANCE.createEncounter();
		facade.cda.EncounterFacade elementFacade = new facade.cda.EncounterFacade(element);
		elementFacade.Init();
		self.setEncounter(element);
		return elementFacade;
	}

	public facade.cda.EncounterFacade Encounter() {
		return GetOrCreateEncounter();
	}

	public Stream<facade.cda.ObservationFacade> observation()
	{
		return Set(self.getObservation()).filter( x -> facade.cda.ObservationFacade.isKindOf(x)).map( x -> new facade.cda.ObservationFacade(x));
	}

	public facade.cda.ObservationFacade GetOrCreateObservation()
	{
		Optional<facade.cda.ObservationFacade> lastOrDefault = observation().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_Observation());
			return lastOrDefault.get();
		}
		return CreateAnotherObservation();
	}

	public facade.cda.ObservationFacade CreateAnotherObservation()
	{
		Observation element = CDAFactory.eINSTANCE.createObservation();
		facade.cda.ObservationFacade elementFacade = new facade.cda.ObservationFacade(element);
		elementFacade.Init();
		self.setObservation(element);
		return elementFacade;
	}

	public facade.cda.ObservationFacade Observation() {
		return GetOrCreateObservation();
	}

	public Stream<facade.cda.ObservationMediaFacade> observationMedia()
	{
		return Set(self.getObservationMedia()).filter( x -> facade.cda.ObservationMediaFacade.isKindOf(x)).map( x -> new facade.cda.ObservationMediaFacade(x));
	}

	public facade.cda.ObservationMediaFacade GetOrCreateObservationMedia()
	{
		Optional<facade.cda.ObservationMediaFacade> lastOrDefault = observationMedia().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_ObservationMedia());
			return lastOrDefault.get();
		}
		return CreateAnotherObservationMedia();
	}

	public facade.cda.ObservationMediaFacade CreateAnotherObservationMedia()
	{
		ObservationMedia element = CDAFactory.eINSTANCE.createObservationMedia();
		facade.cda.ObservationMediaFacade elementFacade = new facade.cda.ObservationMediaFacade(element);
		elementFacade.Init();
		self.setObservationMedia(element);
		return elementFacade;
	}

	public facade.cda.ObservationMediaFacade ObservationMedia() {
		return GetOrCreateObservationMedia();
	}

	public Stream<facade.cda.OrganizerFacade> organizer()
	{
		return Set(self.getOrganizer()).filter( x -> facade.cda.OrganizerFacade.isKindOf(x)).map( x -> new facade.cda.OrganizerFacade(x));
	}

	public facade.cda.OrganizerFacade GetOrCreateOrganizer()
	{
		Optional<facade.cda.OrganizerFacade> lastOrDefault = organizer().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_Organizer());
			return lastOrDefault.get();
		}
		return CreateAnotherOrganizer();
	}

	public facade.cda.OrganizerFacade CreateAnotherOrganizer()
	{
		Organizer element = CDAFactory.eINSTANCE.createOrganizer();
		facade.cda.OrganizerFacade elementFacade = new facade.cda.OrganizerFacade(element);
		elementFacade.Init();
		self.setOrganizer(element);
		return elementFacade;
	}

	public facade.cda.OrganizerFacade Organizer() {
		return GetOrCreateOrganizer();
	}

	public Stream<facade.cda.ProcedureFacade> procedure()
	{
		return Set(self.getProcedure()).filter( x -> facade.cda.ProcedureFacade.isKindOf(x)).map( x -> new facade.cda.ProcedureFacade(x));
	}

	public facade.cda.ProcedureFacade GetOrCreateProcedure()
	{
		Optional<facade.cda.ProcedureFacade> lastOrDefault = procedure().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_Procedure());
			return lastOrDefault.get();
		}
		return CreateAnotherProcedure();
	}

	public facade.cda.ProcedureFacade CreateAnotherProcedure()
	{
		Procedure element = CDAFactory.eINSTANCE.createProcedure();
		facade.cda.ProcedureFacade elementFacade = new facade.cda.ProcedureFacade(element);
		elementFacade.Init();
		self.setProcedure(element);
		return elementFacade;
	}

	public facade.cda.ProcedureFacade Procedure() {
		return GetOrCreateProcedure();
	}

	public Stream<facade.cda.RegionOfInterestFacade> regionOfInterest()
	{
		return Set(self.getRegionOfInterest()).filter( x -> facade.cda.RegionOfInterestFacade.isKindOf(x)).map( x -> new facade.cda.RegionOfInterestFacade(x));
	}

	public facade.cda.RegionOfInterestFacade GetOrCreateRegionOfInterest()
	{
		Optional<facade.cda.RegionOfInterestFacade> lastOrDefault = regionOfInterest().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_RegionOfInterest());
			return lastOrDefault.get();
		}
		return CreateAnotherRegionOfInterest();
	}

	public facade.cda.RegionOfInterestFacade CreateAnotherRegionOfInterest()
	{
		RegionOfInterest element = CDAFactory.eINSTANCE.createRegionOfInterest();
		facade.cda.RegionOfInterestFacade elementFacade = new facade.cda.RegionOfInterestFacade(element);
		elementFacade.Init();
		self.setRegionOfInterest(element);
		return elementFacade;
	}

	public facade.cda.RegionOfInterestFacade RegionOfInterest() {
		return GetOrCreateRegionOfInterest();
	}

	public Stream<facade.cda.SubstanceAdministrationFacade> substanceAdministration()
	{
		return Set(self.getSubstanceAdministration()).filter( x -> facade.cda.SubstanceAdministrationFacade.isKindOf(x)).map( x -> new facade.cda.SubstanceAdministrationFacade(x));
	}

	public facade.cda.SubstanceAdministrationFacade GetOrCreateSubstanceAdministration()
	{
		Optional<facade.cda.SubstanceAdministrationFacade> lastOrDefault = substanceAdministration().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_SubstanceAdministration());
			return lastOrDefault.get();
		}
		return CreateAnotherSubstanceAdministration();
	}

	public facade.cda.SubstanceAdministrationFacade CreateAnotherSubstanceAdministration()
	{
		SubstanceAdministration element = CDAFactory.eINSTANCE.createSubstanceAdministration();
		facade.cda.SubstanceAdministrationFacade elementFacade = new facade.cda.SubstanceAdministrationFacade(element);
		elementFacade.Init();
		self.setSubstanceAdministration(element);
		return elementFacade;
	}

	public facade.cda.SubstanceAdministrationFacade SubstanceAdministration() {
		return GetOrCreateSubstanceAdministration();
	}

	public Stream<facade.cda.SupplyFacade> supply()
	{
		return Set(self.getSupply()).filter( x -> facade.cda.SupplyFacade.isKindOf(x)).map( x -> new facade.cda.SupplyFacade(x));
	}

	public facade.cda.SupplyFacade GetOrCreateSupply()
	{
		Optional<facade.cda.SupplyFacade> lastOrDefault = supply().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_Supply());
			return lastOrDefault.get();
		}
		return CreateAnotherSupply();
	}

	public facade.cda.SupplyFacade CreateAnotherSupply()
	{
		Supply element = CDAFactory.eINSTANCE.createSupply();
		facade.cda.SupplyFacade elementFacade = new facade.cda.SupplyFacade(element);
		elementFacade.Init();
		self.setSupply(element);
		return elementFacade;
	}

	public facade.cda.SupplyFacade Supply() {
		return GetOrCreateSupply();
	}

	public Stream<NullFlavor> nullFlavor()
	{
		return Set(self.getNullFlavor());
	}

	public NullFlavor GetOrCreateNullFlavor()
	{
		Optional<NullFlavor> lastOrDefault = nullFlavor().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_NullFlavor());
		NullFlavor element = NullFlavor.get(0);
		self.setNullFlavor(element);
		return element;
	}

	public NullFlavor NullFlavor() {
		return GetOrCreateNullFlavor();
	}

	public void NullFlavor(NullFlavor value) {
		self.setNullFlavor(value);
	}

	public Stream<x_ActRelationshipEntry> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public x_ActRelationshipEntry GetOrCreateTypeCode()
	{
		Optional<x_ActRelationshipEntry> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public x_ActRelationshipEntry CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_TypeCode());
		x_ActRelationshipEntry element = x_ActRelationshipEntry.get(0);
		self.setTypeCode(element);
		return element;
	}

	public x_ActRelationshipEntry TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(x_ActRelationshipEntry value) {
		self.setTypeCode(value);
	}

	public Stream<Boolean> contextConductionInd()
	{
		return Set(self.getContextConductionInd());
	}

	public Boolean GetOrCreateContextConductionInd()
	{
		Optional<Boolean> lastOrDefault = contextConductionInd().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_ContextConductionInd());
			return lastOrDefault.get();
		}
		return CreateAnotherContextConductionInd();
	}

	public Boolean CreateAnotherContextConductionInd()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntry_ContextConductionInd());
		Boolean element = Boolean.FALSE;
		self.setContextConductionInd(element);
		return element;
	}

	public Boolean ContextConductionInd() {
		return GetOrCreateContextConductionInd();
	}

	public void ContextConductionInd(Boolean value) {
		self.setContextConductionInd(value);
	}

}
