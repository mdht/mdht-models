package facade.consol.generalheaderconstraints.componentof;

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

public class EncompassingEncounterFacade extends facade.FacadeBase {

	public EncompassingEncounter self;

	public EncompassingEncounterFacade()
	{
		this.self = CDAFactory.eINSTANCE.createEncompassingEncounter();
	}

	public EncompassingEncounterFacade(EncompassingEncounter self)
	{
		this.self = self;
	}

	public static boolean isKindOf(EncompassingEncounter self)
	{
		return true;
	}

	@Override
	public Object getModelElement()
	{
		return self;
	}

	public void Init()
	{
		GetOrCreateEffectiveTime();
		GetOrCreateId();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/componentOf/encompassingEncounter
	 *UML root path: /GeneralHeaderConstraints/componentOf/encompassingEncounter
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(vb, del);
			ValidateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(vb, del);

			effectiveTime().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			code().forEach(x -> x.Validate(vb, del));
			dischargeDispositionCode().forEach(x -> x.Validate(vb, del));
			responsibleParty().forEach(x -> x.Validate(vb, del));
			encounterParticipant().forEach(x -> x.Validate(vb, del));
			location().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: not self.effectiveTime.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/componentOf/encompassingEncounter
	 * Context Class: consol::GeneralHeaderConstraints::ComponentOf::EncompassingEncounter
	 * Constraint Name: consol::GeneralHeaderConstraints::ComponentOf::EncompassingEncounter::GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime
	 */
	public boolean ValidateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = !(Set(self.getEffectiveTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.13.i.a effectiveTime\n\t\tConformance: SHALL contain exactly one [1..1] effectiveTime (CONF:9958)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id->isEmpty()
	 * Context: /GeneralHeaderConstraints/componentOf/encompassingEncounter
	 * Context Class: consol::GeneralHeaderConstraints::ComponentOf::EncompassingEncounter
	 * Constraint Name: consol::GeneralHeaderConstraints::ComponentOf::EncompassingEncounter::GeneralHeaderConstraintsComponentOfEncompassingEncounterId
	 */
	public boolean ValidateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = !(Set(self.getIds()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.13.i.b id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:9959)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.IVL_TSFacade> effectiveTime()
	{
		return Set(self.getEffectiveTime()).filter( x -> x instanceof IVL_TS).map( x -> (IVL_TS) x).map( x -> new facade.datatypes.IVL_TSFacade(x));
	}

	public facade.datatypes.IVL_TSFacade GetOrCreateEffectiveTime()
	{
		Optional<facade.datatypes.IVL_TSFacade> lastOrDefault = effectiveTime().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_EffectiveTime());
			return lastOrDefault.get();
		}
		return CreateAnotherEffectiveTime();
	}

	public facade.datatypes.IVL_TSFacade CreateAnotherEffectiveTime()
	{
		IVL_TS element = DatatypesFactory.eINSTANCE.createIVL_TS();
		facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
		elementFacade.Init();
		self.setEffectiveTime(element);
		return elementFacade;
	}

	public facade.datatypes.IVL_TSFacade EffectiveTime() {
		return GetOrCreateEffectiveTime();
	}

	public Stream<facade.datatypes.IIFacade> id()
	{
		return Set(self.getIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_Id());
			return lastOrDefault.get();
		}
		return CreateAnotherId();
	}

	public facade.datatypes.IIFacade CreateAnotherId()
	{
		II element = DatatypesFactory.eINSTANCE.createII();
		facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
		elementFacade.Init();
		self.getIds().add(element);
		return elementFacade;
	}

	public facade.datatypes.IIFacade Id() {
		return GetOrCreateId();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_TemplateId());
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

	public Stream<facade.datatypes.CEFacade> code()
	{
		return Set(self.getCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = code().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_Code());
			return lastOrDefault.get();
		}
		return CreateAnotherCode();
	}

	public facade.datatypes.CEFacade CreateAnotherCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade Code() {
		return GetOrCreateCode();
	}

	public Stream<facade.datatypes.CEFacade> dischargeDispositionCode()
	{
		return Set(self.getDischargeDispositionCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateDischargeDispositionCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = dischargeDispositionCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_DischargeDispositionCode());
			return lastOrDefault.get();
		}
		return CreateAnotherDischargeDispositionCode();
	}

	public facade.datatypes.CEFacade CreateAnotherDischargeDispositionCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setDischargeDispositionCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade DischargeDispositionCode() {
		return GetOrCreateDischargeDispositionCode();
	}

	public Stream<facade.cda.ResponsiblePartyFacade> responsibleParty()
	{
		return Set(self.getResponsibleParty()).filter( x -> facade.cda.ResponsiblePartyFacade.isKindOf(x)).map( x -> new facade.cda.ResponsiblePartyFacade(x));
	}

	public facade.cda.ResponsiblePartyFacade GetOrCreateResponsibleParty()
	{
		Optional<facade.cda.ResponsiblePartyFacade> lastOrDefault = responsibleParty().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_ResponsibleParty());
			return lastOrDefault.get();
		}
		return CreateAnotherResponsibleParty();
	}

	public facade.cda.ResponsiblePartyFacade CreateAnotherResponsibleParty()
	{
		ResponsibleParty element = CDAFactory.eINSTANCE.createResponsibleParty();
		facade.cda.ResponsiblePartyFacade elementFacade = new facade.cda.ResponsiblePartyFacade(element);
		elementFacade.Init();
		self.setResponsibleParty(element);
		return elementFacade;
	}

	public facade.cda.ResponsiblePartyFacade ResponsibleParty() {
		return GetOrCreateResponsibleParty();
	}

	public Stream<facade.cda.EncounterParticipantFacade> encounterParticipant()
	{
		return Set(self.getEncounterParticipants()).filter( x -> facade.cda.EncounterParticipantFacade.isKindOf(x)).map( x -> new facade.cda.EncounterParticipantFacade(x));
	}

	public facade.cda.EncounterParticipantFacade GetOrCreateEncounterParticipant()
	{
		Optional<facade.cda.EncounterParticipantFacade> lastOrDefault = encounterParticipant().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_EncounterParticipant());
			return lastOrDefault.get();
		}
		return CreateAnotherEncounterParticipant();
	}

	public facade.cda.EncounterParticipantFacade CreateAnotherEncounterParticipant()
	{
		EncounterParticipant element = CDAFactory.eINSTANCE.createEncounterParticipant();
		facade.cda.EncounterParticipantFacade elementFacade = new facade.cda.EncounterParticipantFacade(element);
		elementFacade.Init();
		self.getEncounterParticipants().add(element);
		return elementFacade;
	}

	public facade.cda.EncounterParticipantFacade EncounterParticipant() {
		return GetOrCreateEncounterParticipant();
	}

	public Stream<facade.cda.LocationFacade> location()
	{
		return Set(self.getLocation()).filter( x -> facade.cda.LocationFacade.isKindOf(x)).map( x -> new facade.cda.LocationFacade(x));
	}

	public facade.cda.LocationFacade GetOrCreateLocation()
	{
		Optional<facade.cda.LocationFacade> lastOrDefault = location().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_Location());
			return lastOrDefault.get();
		}
		return CreateAnotherLocation();
	}

	public facade.cda.LocationFacade CreateAnotherLocation()
	{
		Location element = CDAFactory.eINSTANCE.createLocation();
		facade.cda.LocationFacade elementFacade = new facade.cda.LocationFacade(element);
		elementFacade.Init();
		self.setLocation(element);
		return elementFacade;
	}

	public facade.cda.LocationFacade Location() {
		return GetOrCreateLocation();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_NullFlavor());
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

	public Stream<ActClass> classCode()
	{
		return Set(self.getClassCode());
	}

	public ActClass GetOrCreateClassCode()
	{
		Optional<ActClass> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public ActClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_ClassCode());
		ActClass element = ActClass.get(0);
		self.setClassCode(element);
		return element;
	}

	public ActClass ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(ActClass value) {
		self.setClassCode(value);
	}

	public Stream<ActMood> moodCode()
	{
		return Set(self.getMoodCode());
	}

	public ActMood GetOrCreateMoodCode()
	{
		Optional<ActMood> lastOrDefault = moodCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_MoodCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMoodCode();
	}

	public ActMood CreateAnotherMoodCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getEncompassingEncounter_MoodCode());
		ActMood element = ActMood.get(0);
		self.setMoodCode(element);
		return element;
	}

	public ActMood MoodCode() {
		return GetOrCreateMoodCode();
	}

	public void MoodCode(ActMood value) {
		self.setMoodCode(value);
	}

}
