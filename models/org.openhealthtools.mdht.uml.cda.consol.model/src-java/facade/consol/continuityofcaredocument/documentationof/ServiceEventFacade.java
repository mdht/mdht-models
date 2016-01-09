package facade.consol.continuityofcaredocument.documentationof;

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

public class ServiceEventFacade extends facade.FacadeBase {

	public ServiceEvent self;

	public ServiceEventFacade()
	{
		this.self = CDAFactory.eINSTANCE.createServiceEvent();
	}

	public ServiceEventFacade(ServiceEvent self)
	{
		this.self = self;
	}

	public static boolean isKindOf(ServiceEvent self)
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
		GetOrCreateClassCode();
		self.setClassCode(ActClassRoot.PCPR);
		GetOrCreateEffectiveTime();
	}

	/**
	 *UML path: /ContinuityOfCareDocument/documentationOf/serviceEvent
	 *UML root path: /ContinuityOfCareDocument/documentationOf/serviceEvent
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(vb, del);
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(vb, del);
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(vb, del);

			effectiveTime().forEach(x -> x.Validate(vb, del));
			performer().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			code().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: isDefined('classCode') and self.classCode=vocab::ActClassRoot::PCPR
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::ContinuityOfCareDocumentDocumentationOfServiceEventClassCode
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self).anyMatch(i3195 -> i3195.isDefined("classCode")) && Set(self.getClassCode()).collect(Collectors.toList()).contains(ActClassRoot.PCPR);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.a classCode\n\t\tConformance: SHALL contain exactly one [1..1] @classCode=\"PCPR\"  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:8453)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.effectiveTime.oclIsUndefined()
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getEffectiveTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.b effectiveTime\n\t\tConformance: SHALL contain exactly one [1..1] effectiveTime (CONF:8481)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer))->size() >= 0
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::ContinuityOfCareDocumentDocumentationOfServiceEventPerformer
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getPerformers()).filter(i3219 -> !(Set(i3219).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.c performer\n\t\tConformance: SHOULD contain zero or more [0..*] performer (CONF:8482)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<ActClassRoot> classCode()
	{
		return Set(self.getClassCode());
	}

	public ActClassRoot GetOrCreateClassCode()
	{
		Optional<ActClassRoot> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public ActClassRoot CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_ClassCode());
		ActClassRoot element = ActClassRoot.get(0);
		self.setClassCode(element);
		return element;
	}

	public ActClassRoot ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(ActClassRoot value) {
		self.setClassCode(value);
	}

	public Stream<facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade> effectiveTime()
	{
		return Set(self.getEffectiveTime()).filter( x -> facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade(x));
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade GetOrCreateEffectiveTime()
	{
		Optional<facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade> lastOrDefault = effectiveTime().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_EffectiveTime());
			return lastOrDefault.get();
		}
		return CreateAnotherEffectiveTime();
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade CreateAnotherEffectiveTime()
	{
		IVL_TS element = DatatypesFactory.eINSTANCE.createIVL_TS();
		facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade elementFacade = new facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade(element);
		elementFacade.Init();
		self.setEffectiveTime(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.EffectiveTimeFacade EffectiveTime() {
		return GetOrCreateEffectiveTime();
	}

	public Stream<facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade> performer()
	{
		return Set(self.getPerformers()).filter( x -> facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade(x));
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade GetOrCreatePerformer()
	{
		Optional<facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade> lastOrDefault = performer().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_Performer());
			return lastOrDefault.get();
		}
		return CreateAnotherPerformer();
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade CreateAnotherPerformer()
	{
		Performer1 element = CDAFactory.eINSTANCE.createPerformer1();
		facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade elementFacade = new facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade(element);
		elementFacade.Init();
		self.getPerformers().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.PerformerFacade Performer() {
		return GetOrCreatePerformer();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_TemplateId());
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

	public Stream<facade.datatypes.IIFacade> id()
	{
		return Set(self.getIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_Id());
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

	public Stream<facade.datatypes.CEFacade> code()
	{
		return Set(self.getCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = code().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_Code());
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

	public Stream<NullFlavor> nullFlavor()
	{
		return Set(self.getNullFlavor());
	}

	public NullFlavor GetOrCreateNullFlavor()
	{
		Optional<NullFlavor> lastOrDefault = nullFlavor().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_NullFlavor());
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

	public Stream<ActMood> moodCode()
	{
		return Set(self.getMoodCode());
	}

	public ActMood GetOrCreateMoodCode()
	{
		Optional<ActMood> lastOrDefault = moodCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_MoodCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMoodCode();
	}

	public ActMood CreateAnotherMoodCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getServiceEvent_MoodCode());
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
