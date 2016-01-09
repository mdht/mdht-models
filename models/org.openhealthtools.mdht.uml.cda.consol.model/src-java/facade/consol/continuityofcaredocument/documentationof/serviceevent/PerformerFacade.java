package facade.consol.continuityofcaredocument.documentationof.serviceevent;

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

public class PerformerFacade extends facade.FacadeBase {

	public Performer1 self;

	public PerformerFacade()
	{
		this.self = CDAFactory.eINSTANCE.createPerformer1();
	}

	public PerformerFacade(Performer1 self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Performer1 self)
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
		GetOrCreateTypeCode();
		self.setTypeCode(x_ServiceEventPerformer.PRF);
	}

	/**
	 *UML path: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer
	 *UML root path: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(vb, del);
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(vb, del);

			assignedEntity().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			functionCode().forEach(x -> x.Validate(vb, del));
			time().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.typeCode=vocab::x_ServiceEventPerformer::PRF
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::ContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getTypeCode()).collect(Collectors.toList()).contains(x_ServiceEventPerformer.PRF);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.c.1 typeCode\n\t\tConformance: SHALL contain exactly one [1..1] @typeCode=\"PRF\"  (CONF:8458)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.assignedEntity->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity))->size() <= 1
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getAssignedEntity()).filter(i3285 -> !(Set(i3285).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.c.2 assignedEntity\n\t\tConformance: MAY contain zero or one [0..1] assignedEntity (CONF:8459)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<x_ServiceEventPerformer> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public x_ServiceEventPerformer GetOrCreateTypeCode()
	{
		Optional<x_ServiceEventPerformer> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public x_ServiceEventPerformer CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_TypeCode());
		x_ServiceEventPerformer element = x_ServiceEventPerformer.get(0);
		self.setTypeCode(element);
		return element;
	}

	public x_ServiceEventPerformer TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(x_ServiceEventPerformer value) {
		self.setTypeCode(value);
	}

	public Stream<facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade> assignedEntity()
	{
		return Set(self.getAssignedEntity()).filter( x -> facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade(x));
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade GetOrCreateAssignedEntity()
	{
		Optional<facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade> lastOrDefault = assignedEntity().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_AssignedEntity());
			return lastOrDefault.get();
		}
		return CreateAnotherAssignedEntity();
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade CreateAnotherAssignedEntity()
	{
		AssignedEntity element = CDAFactory.eINSTANCE.createAssignedEntity();
		facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade elementFacade = new facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade(element);
		elementFacade.Init();
		self.setAssignedEntity(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.documentationof.serviceevent.performer.AssignedEntityFacade AssignedEntity() {
		return GetOrCreateAssignedEntity();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_TemplateId());
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

	public Stream<facade.datatypes.CEFacade> functionCode()
	{
		return Set(self.getFunctionCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateFunctionCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = functionCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_FunctionCode());
			return lastOrDefault.get();
		}
		return CreateAnotherFunctionCode();
	}

	public facade.datatypes.CEFacade CreateAnotherFunctionCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setFunctionCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade FunctionCode() {
		return GetOrCreateFunctionCode();
	}

	public Stream<facade.datatypes.IVL_TSFacade> time()
	{
		return Set(self.getTime()).filter( x -> x instanceof IVL_TS).map( x -> (IVL_TS) x).map( x -> new facade.datatypes.IVL_TSFacade(x));
	}

	public facade.datatypes.IVL_TSFacade GetOrCreateTime()
	{
		Optional<facade.datatypes.IVL_TSFacade> lastOrDefault = time().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_Time());
			return lastOrDefault.get();
		}
		return CreateAnotherTime();
	}

	public facade.datatypes.IVL_TSFacade CreateAnotherTime()
	{
		IVL_TS element = DatatypesFactory.eINSTANCE.createIVL_TS();
		facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
		elementFacade.Init();
		self.setTime(element);
		return elementFacade;
	}

	public facade.datatypes.IVL_TSFacade Time() {
		return GetOrCreateTime();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_NullFlavor());
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

}
