package facade.consol.allergyproblemact;

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

public class AllergyObservationEntryRelationshipFacade extends facade.FacadeBase {

	public EntryRelationship self;

	public AllergyObservationEntryRelationshipFacade()
	{
		this.self = CDAFactory.eINSTANCE.createEntryRelationship();
	}

	public AllergyObservationEntryRelationshipFacade(EntryRelationship self)
	{
		this.self = self;
	}

	public static boolean isKindOf(EntryRelationship self)
	{
		return Flatten(Set(self.getObservations()).map(i4342 -> Set(i4342.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.7"));
	}

	@Override
	public Object getModelElement()
	{
		return self;
	}

	public void Init()
	{
		GetOrCreateAllergyObservation();
		GetOrCreateTypeCode();
	}

	/**
	 *UML path: /AllergyProblemAct/entryRelationship
	 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection/entry/allergyProblemAct/entryRelationship
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateAllergyProblemActAllergyObservationEntryRelationshipAllergyObservation(vb, del);

			allergyObservation().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			sequenceNumber().forEach(x -> x.Validate(vb, del));
			seperatableInd().forEach(x -> x.Validate(vb, del));
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
	 * OCL: self.observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation))
	 * Context: /AllergyProblemAct/entryRelationship
	 * Context Class: consol::AllergyProblemAct::AllergyObservationEntryRelationship
	 * Constraint Name: consol::AllergyProblemAct::AllergyObservationEntryRelationship::AllergyProblemActAllergyObservationEntryRelationshipAllergyObservation
	 */
	public boolean ValidateAllergyProblemActAllergyObservationEntryRelationshipAllergyObservation(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getObservation()).anyMatch(i4302 -> !(Set(i4302).count()==0) && Set(One(Set(i4302)).getTemplateIds()).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.7")));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.8.i allergyObservation\n\t\tConformance: SHALL contain at least one [1..*] observation (CONF:7509, CONF:7915, CONF:14925)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.AllergyObservationFacade> allergyObservation()
	{
		return Set(self.getObservation()).filter( x -> facade.consol.AllergyObservationFacade.isKindOf(x)).map( x -> new facade.consol.AllergyObservationFacade(x));
	}

	public facade.consol.AllergyObservationFacade GetOrCreateAllergyObservation()
	{
		Optional<facade.consol.AllergyObservationFacade> lastOrDefault = allergyObservation().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_Observation());
			return lastOrDefault.get();
		}
		return CreateAnotherAllergyObservation();
	}

	public facade.consol.AllergyObservationFacade CreateAnotherAllergyObservation()
	{
		Observation element = CDAFactory.eINSTANCE.createObservation();
		facade.consol.AllergyObservationFacade elementFacade = new facade.consol.AllergyObservationFacade(element);
		elementFacade.Init();
		self.setObservation(element);
		return elementFacade;
	}

	public facade.consol.AllergyObservationFacade AllergyObservation() {
		return GetOrCreateAllergyObservation();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_TemplateId());
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

	public Stream<facade.datatypes.INTFacade> sequenceNumber()
	{
		return Set(self.getSequenceNumber()).filter( x -> x instanceof INT).map( x -> (INT) x).map( x -> new facade.datatypes.INTFacade(x));
	}

	public facade.datatypes.INTFacade GetOrCreateSequenceNumber()
	{
		Optional<facade.datatypes.INTFacade> lastOrDefault = sequenceNumber().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_SequenceNumber());
			return lastOrDefault.get();
		}
		return CreateAnotherSequenceNumber();
	}

	public facade.datatypes.INTFacade CreateAnotherSequenceNumber()
	{
		INT element = DatatypesFactory.eINSTANCE.createINT();
		facade.datatypes.INTFacade elementFacade = new facade.datatypes.INTFacade(element);
		elementFacade.Init();
		self.setSequenceNumber(element);
		return elementFacade;
	}

	public facade.datatypes.INTFacade SequenceNumber() {
		return GetOrCreateSequenceNumber();
	}

	public Stream<facade.datatypes.BLFacade> seperatableInd()
	{
		return Set(self.getSeperatableInd()).filter( x -> x instanceof BL).map( x -> (BL) x).map( x -> new facade.datatypes.BLFacade(x));
	}

	public facade.datatypes.BLFacade GetOrCreateSeperatableInd()
	{
		Optional<facade.datatypes.BLFacade> lastOrDefault = seperatableInd().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_SeperatableInd());
			return lastOrDefault.get();
		}
		return CreateAnotherSeperatableInd();
	}

	public facade.datatypes.BLFacade CreateAnotherSeperatableInd()
	{
		BL element = DatatypesFactory.eINSTANCE.createBL();
		facade.datatypes.BLFacade elementFacade = new facade.datatypes.BLFacade(element);
		elementFacade.Init();
		self.setSeperatableInd(element);
		return elementFacade;
	}

	public facade.datatypes.BLFacade SeperatableInd() {
		return GetOrCreateSeperatableInd();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_Act());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_Encounter());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_Observation());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_ObservationMedia());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_Organizer());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_Procedure());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_RegionOfInterest());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_SubstanceAdministration());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_Supply());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_NullFlavor());
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

	public Stream<x_ActRelationshipEntryRelationship> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public x_ActRelationshipEntryRelationship GetOrCreateTypeCode()
	{
		Optional<x_ActRelationshipEntryRelationship> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public x_ActRelationshipEntryRelationship CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_TypeCode());
		x_ActRelationshipEntryRelationship element = x_ActRelationshipEntryRelationship.get(0);
		self.setTypeCode(element);
		return element;
	}

	public x_ActRelationshipEntryRelationship TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(x_ActRelationshipEntryRelationship value) {
		self.setTypeCode(value);
	}

	public Stream<Boolean> inversionInd()
	{
		return Set(self.getInversionInd());
	}

	public Boolean GetOrCreateInversionInd()
	{
		Optional<Boolean> lastOrDefault = inversionInd().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_InversionInd());
			return lastOrDefault.get();
		}
		return CreateAnotherInversionInd();
	}

	public Boolean CreateAnotherInversionInd()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_InversionInd());
		Boolean element = Boolean.FALSE;
		self.setInversionInd(element);
		return element;
	}

	public Boolean InversionInd() {
		return GetOrCreateInversionInd();
	}

	public void InversionInd(Boolean value) {
		self.setInversionInd(value);
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_ContextConductionInd());
			return lastOrDefault.get();
		}
		return CreateAnotherContextConductionInd();
	}

	public Boolean CreateAnotherContextConductionInd()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_ContextConductionInd());
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

	public Stream<Boolean> negationInd()
	{
		return Set(self.getNegationInd());
	}

	public Boolean GetOrCreateNegationInd()
	{
		Optional<Boolean> lastOrDefault = negationInd().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_NegationInd());
			return lastOrDefault.get();
		}
		return CreateAnotherNegationInd();
	}

	public Boolean CreateAnotherNegationInd()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEntryRelationship_NegationInd());
		Boolean element = Boolean.FALSE;
		self.setNegationInd(element);
		return element;
	}

	public Boolean NegationInd() {
		return GetOrCreateNegationInd();
	}

	public void NegationInd(Boolean value) {
		self.setNegationInd(value);
	}

}
