package facade.consol.generalheaderconstraints;

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

public class InFulfillmentOfFacade extends facade.FacadeBase {

	public InFulfillmentOf self;

	public InFulfillmentOfFacade()
	{
		this.self = CDAFactory.eINSTANCE.createInFulfillmentOf();
	}

	public InFulfillmentOfFacade(InFulfillmentOf self)
	{
		this.self = self;
	}

	public static boolean isKindOf(InFulfillmentOf self)
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
		GetOrCreateOrder();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/inFulfillmentOf
	 *UML root path: /GeneralHeaderConstraints/inFulfillmentOf
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsInFulfillmentOfOrder(vb, del);

			order().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(consol::GeneralHeaderConstraints::InFulfillmentOf::Order))
	 * Context: /GeneralHeaderConstraints/inFulfillmentOf
	 * Context Class: consol::GeneralHeaderConstraints::InFulfillmentOf
	 * Constraint Name: consol::GeneralHeaderConstraints::InFulfillmentOf::GeneralHeaderConstraintsInFulfillmentOfOrder
	 */
	public boolean ValidateGeneralHeaderConstraintsInFulfillmentOfOrder(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getOrder()).filter(i2741 -> !(Set(i2741).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.22.i order\n\t\tConformance: SHALL contain exactly one [1..1] order (CONF:9953)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade> order()
	{
		return Set(self.getOrder()).filter( x -> facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade(x));
	}

	public facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade GetOrCreateOrder()
	{
		Optional<facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade> lastOrDefault = order().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInFulfillmentOf_Order());
			return lastOrDefault.get();
		}
		return CreateAnotherOrder();
	}

	public facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade CreateAnotherOrder()
	{
		Order element = CDAFactory.eINSTANCE.createOrder();
		facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade elementFacade = new facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade(element);
		elementFacade.Init();
		self.setOrder(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.infulfillmentof.OrderFacade Order() {
		return GetOrCreateOrder();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInFulfillmentOf_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInFulfillmentOf_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInFulfillmentOf_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInFulfillmentOf_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInFulfillmentOf_NullFlavor());
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

	public Stream<ActRelationshipFulfills> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public ActRelationshipFulfills GetOrCreateTypeCode()
	{
		Optional<ActRelationshipFulfills> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInFulfillmentOf_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public ActRelationshipFulfills CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInFulfillmentOf_TypeCode());
		ActRelationshipFulfills element = ActRelationshipFulfills.get(0);
		self.setTypeCode(element);
		return element;
	}

	public ActRelationshipFulfills TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(ActRelationshipFulfills value) {
		self.setTypeCode(value);
	}

}
