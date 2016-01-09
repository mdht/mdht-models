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

public class ComponentFacade extends facade.FacadeBase {

	public Component2 self;

	public ComponentFacade()
	{
		this.self = CDAFactory.eINSTANCE.createComponent2();
	}

	public ComponentFacade(Component2 self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Component2 self)
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
		GetOrCreateStructuredBody();
	}

	/**
	 *UML path: /ContinuityOfCareDocument/component
	 *UML root path: /ContinuityOfCareDocument/component
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateContinuityOfCareDocumentComponentStructuredBody(vb, del);

			structuredBody().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			nonXMLBody().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody))
	 * Context: /ContinuityOfCareDocument/component
	 * Context Class: consol::ContinuityOfCareDocument::Component
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::ContinuityOfCareDocumentComponentStructuredBody
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBody(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getStructuredBody()).filter(i3425 -> !(Set(i3425).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i structuredBody\n\t\tConformance: SHALL contain exactly one [1..1] structuredBody\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.continuityofcaredocument.component.StructuredBodyFacade> structuredBody()
	{
		return Set(self.getStructuredBody()).filter( x -> facade.consol.continuityofcaredocument.component.StructuredBodyFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.StructuredBodyFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.StructuredBodyFacade GetOrCreateStructuredBody()
	{
		Optional<facade.consol.continuityofcaredocument.component.StructuredBodyFacade> lastOrDefault = structuredBody().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_StructuredBody());
			return lastOrDefault.get();
		}
		return CreateAnotherStructuredBody();
	}

	public facade.consol.continuityofcaredocument.component.StructuredBodyFacade CreateAnotherStructuredBody()
	{
		StructuredBody element = CDAFactory.eINSTANCE.createStructuredBody();
		facade.consol.continuityofcaredocument.component.StructuredBodyFacade elementFacade = new facade.consol.continuityofcaredocument.component.StructuredBodyFacade(element);
		elementFacade.Init();
		self.setStructuredBody(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.StructuredBodyFacade StructuredBody() {
		return GetOrCreateStructuredBody();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_TemplateId());
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

	public Stream<facade.cda.NonXMLBodyFacade> nonXMLBody()
	{
		return Set(self.getNonXMLBody()).filter( x -> facade.cda.NonXMLBodyFacade.isKindOf(x)).map( x -> new facade.cda.NonXMLBodyFacade(x));
	}

	public facade.cda.NonXMLBodyFacade GetOrCreateNonXMLBody()
	{
		Optional<facade.cda.NonXMLBodyFacade> lastOrDefault = nonXMLBody().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_NonXMLBody());
			return lastOrDefault.get();
		}
		return CreateAnotherNonXMLBody();
	}

	public facade.cda.NonXMLBodyFacade CreateAnotherNonXMLBody()
	{
		NonXMLBody element = CDAFactory.eINSTANCE.createNonXMLBody();
		facade.cda.NonXMLBodyFacade elementFacade = new facade.cda.NonXMLBodyFacade(element);
		elementFacade.Init();
		self.setNonXMLBody(element);
		return elementFacade;
	}

	public facade.cda.NonXMLBodyFacade NonXMLBody() {
		return GetOrCreateNonXMLBody();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_NullFlavor());
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

	public Stream<ActRelationshipHasComponent> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public ActRelationshipHasComponent GetOrCreateTypeCode()
	{
		Optional<ActRelationshipHasComponent> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public ActRelationshipHasComponent CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_TypeCode());
		ActRelationshipHasComponent element = ActRelationshipHasComponent.get(0);
		self.setTypeCode(element);
		return element;
	}

	public ActRelationshipHasComponent TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(ActRelationshipHasComponent value) {
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_ContextConductionInd());
			return lastOrDefault.get();
		}
		return CreateAnotherContextConductionInd();
	}

	public Boolean CreateAnotherContextConductionInd()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getComponent2_ContextConductionInd());
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
