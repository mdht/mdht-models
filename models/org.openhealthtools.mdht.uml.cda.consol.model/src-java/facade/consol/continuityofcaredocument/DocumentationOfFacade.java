package facade.consol.continuityofcaredocument;

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

public class DocumentationOfFacade extends facade.FacadeBase {

	public DocumentationOf self;

	public DocumentationOfFacade()
	{
		this.self = CDAFactory.eINSTANCE.createDocumentationOf();
	}

	public DocumentationOfFacade(DocumentationOf self)
	{
		this.self = self;
	}

	public static boolean isKindOf(DocumentationOf self)
	{
		return Flatten(Set(self.getServiceEvent()).map(i3194 -> Set(i3194.getClassCode()))).collect(Collectors.toList()).contains(ActClassRoot.PCPR);
	}

	@Override
	public Object getModelElement()
	{
		return self;
	}

	public void Init()
	{
		GetOrCreateServiceEvent();
	}

	/**
	 *UML path: /ContinuityOfCareDocument/documentationOf
	 *UML root path: /ContinuityOfCareDocument/documentationOf
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateContinuityOfCareDocumentDocumentationOfServiceEvent(vb, del);

			serviceEvent().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent))
	 * Context: /ContinuityOfCareDocument/documentationOf
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ContinuityOfCareDocumentDocumentationOfServiceEvent
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEvent(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getServiceEvent()).filter(i3182 -> !(Set(i3182).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i serviceEvent\n\t\tConformance: SHALL contain exactly one [1..1] serviceEvent (CONF:8480)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade> serviceEvent()
	{
		return Set(self.getServiceEvent()).filter( x -> facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade(x));
	}

	public facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade GetOrCreateServiceEvent()
	{
		Optional<facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade> lastOrDefault = serviceEvent().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getDocumentationOf_ServiceEvent());
			return lastOrDefault.get();
		}
		return CreateAnotherServiceEvent();
	}

	public facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade CreateAnotherServiceEvent()
	{
		ServiceEvent element = CDAFactory.eINSTANCE.createServiceEvent();
		facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade elementFacade = new facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade(element);
		elementFacade.Init();
		self.setServiceEvent(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.documentationof.ServiceEventFacade ServiceEvent() {
		return GetOrCreateServiceEvent();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getDocumentationOf_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getDocumentationOf_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getDocumentationOf_TemplateId());
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

	public Stream<NullFlavor> nullFlavor()
	{
		return Set(self.getNullFlavor());
	}

	public NullFlavor GetOrCreateNullFlavor()
	{
		Optional<NullFlavor> lastOrDefault = nullFlavor().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getDocumentationOf_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getDocumentationOf_NullFlavor());
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

	public Stream<ActRelationshipType> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public ActRelationshipType GetOrCreateTypeCode()
	{
		Optional<ActRelationshipType> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getDocumentationOf_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public ActRelationshipType CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getDocumentationOf_TypeCode());
		ActRelationshipType element = ActRelationshipType.get(0);
		self.setTypeCode(element);
		return element;
	}

	public ActRelationshipType TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(ActRelationshipType value) {
		self.setTypeCode(value);
	}

}
