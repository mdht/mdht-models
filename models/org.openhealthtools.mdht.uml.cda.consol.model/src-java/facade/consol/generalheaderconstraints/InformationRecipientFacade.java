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

public class InformationRecipientFacade extends facade.FacadeBase {

	public InformationRecipient self;

	public InformationRecipientFacade()
	{
		this.self = CDAFactory.eINSTANCE.createInformationRecipient();
	}

	public InformationRecipientFacade(InformationRecipient self)
	{
		this.self = self;
	}

	public static boolean isKindOf(InformationRecipient self)
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
		GetOrCreateIntendedRecipient();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/informationRecipient
	 *UML root path: /GeneralHeaderConstraints/informationRecipient
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(vb, del);

			intendedRecipient().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient))
	 * Context: /GeneralHeaderConstraints/informationRecipient
	 * Context Class: consol::GeneralHeaderConstraints::InformationRecipient
	 * Constraint Name: consol::GeneralHeaderConstraints::InformationRecipient::GeneralHeaderConstraintsInformationRecipientIntendedRecipient
	 */
	public boolean ValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getIntendedRecipient()).filter(i2223 -> !(Set(i2223).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.17.i intendedRecipient\n\t\tConformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:5566)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade> intendedRecipient()
	{
		return Set(self.getIntendedRecipient()).filter( x -> facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade(x));
	}

	public facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade GetOrCreateIntendedRecipient()
	{
		Optional<facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade> lastOrDefault = intendedRecipient().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformationRecipient_IntendedRecipient());
			return lastOrDefault.get();
		}
		return CreateAnotherIntendedRecipient();
	}

	public facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade CreateAnotherIntendedRecipient()
	{
		IntendedRecipient element = CDAFactory.eINSTANCE.createIntendedRecipient();
		facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade elementFacade = new facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade(element);
		elementFacade.Init();
		self.setIntendedRecipient(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.informationrecipient.IntendedRecipientFacade IntendedRecipient() {
		return GetOrCreateIntendedRecipient();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformationRecipient_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformationRecipient_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformationRecipient_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformationRecipient_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformationRecipient_NullFlavor());
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

	public Stream<x_InformationRecipient> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public x_InformationRecipient GetOrCreateTypeCode()
	{
		Optional<x_InformationRecipient> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformationRecipient_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public x_InformationRecipient CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformationRecipient_TypeCode());
		x_InformationRecipient element = x_InformationRecipient.get(0);
		self.setTypeCode(element);
		return element;
	}

	public x_InformationRecipient TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(x_InformationRecipient value) {
		self.setTypeCode(value);
	}

}
