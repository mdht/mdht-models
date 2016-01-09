package facade.consol.generalheaderconstraints.informationrecipient;

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

public class IntendedRecipientFacade extends facade.FacadeBase {

	public IntendedRecipient self;

	public IntendedRecipientFacade()
	{
		this.self = CDAFactory.eINSTANCE.createIntendedRecipient();
	}

	public IntendedRecipientFacade(IntendedRecipient self)
	{
		this.self = self;
	}

	public static boolean isKindOf(IntendedRecipient self)
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
	}

	/**
	 *UML path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
	 *UML root path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(vb, del);
			ValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientReceivedOrganization(vb, del);

			informationRecipient().forEach(x -> x.Validate(vb, del));
			receivedOrganization().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			addr().forEach(x -> x.Validate(vb, del));
			telecom().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.informationRecipient->select(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Person))->size() <= 1
	 * Context: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
	 * Context Class: consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient
	 * Constraint Name: consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient
	 */
	public boolean ValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getInformationRecipient()).filter(i2233 -> !(Set(i2233).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.17.i.a informationRecipient\n\t\tConformance: MAY contain zero or one [0..1] informationRecipient (CONF:5568)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.receivedOrganization->select(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Organization))->size() <= 1
	 * Context: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
	 * Context Class: consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient
	 * Constraint Name: consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::GeneralHeaderConstraintsInformationRecipientIntendedRecipientReceivedOrganization
	 */
	public boolean ValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientReceivedOrganization(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getReceivedOrganization()).filter(i2247 -> !(Set(i2247).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.17.i.b receivedOrganization\n\t\tConformance: MAY contain zero or one [0..1] receivedOrganization (CONF:5577)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade> informationRecipient()
	{
		return Set(self.getInformationRecipient()).filter( x -> facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade(x));
	}

	public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade GetOrCreateInformationRecipient()
	{
		Optional<facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade> lastOrDefault = informationRecipient().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_InformationRecipient());
			return lastOrDefault.get();
		}
		return CreateAnotherInformationRecipient();
	}

	public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade CreateAnotherInformationRecipient()
	{
		Person element = CDAFactory.eINSTANCE.createPerson();
		facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade elementFacade = new facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade(element);
		elementFacade.Init();
		self.setInformationRecipient(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.PersonFacade InformationRecipient() {
		return GetOrCreateInformationRecipient();
	}

	public Stream<facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade> receivedOrganization()
	{
		return Set(self.getReceivedOrganization()).filter( x -> facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade(x));
	}

	public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade GetOrCreateReceivedOrganization()
	{
		Optional<facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade> lastOrDefault = receivedOrganization().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_ReceivedOrganization());
			return lastOrDefault.get();
		}
		return CreateAnotherReceivedOrganization();
	}

	public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade CreateAnotherReceivedOrganization()
	{
		Organization element = CDAFactory.eINSTANCE.createOrganization();
		facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade elementFacade = new facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade(element);
		elementFacade.Init();
		self.setReceivedOrganization(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient.OrganizationFacade ReceivedOrganization() {
		return GetOrCreateReceivedOrganization();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_Id());
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

	public Stream<facade.datatypes.ADFacade> addr()
	{
		return Set(self.getAddrs()).filter( x -> x instanceof AD).map( x -> (AD) x).map( x -> new facade.datatypes.ADFacade(x));
	}

	public facade.datatypes.ADFacade GetOrCreateAddr()
	{
		Optional<facade.datatypes.ADFacade> lastOrDefault = addr().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_Addr());
			return lastOrDefault.get();
		}
		return CreateAnotherAddr();
	}

	public facade.datatypes.ADFacade CreateAnotherAddr()
	{
		AD element = DatatypesFactory.eINSTANCE.createAD();
		facade.datatypes.ADFacade elementFacade = new facade.datatypes.ADFacade(element);
		elementFacade.Init();
		self.getAddrs().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADFacade Addr() {
		return GetOrCreateAddr();
	}

	public Stream<facade.datatypes.TELFacade> telecom()
	{
		return Set(self.getTelecoms()).filter( x -> x instanceof TEL).map( x -> (TEL) x).map( x -> new facade.datatypes.TELFacade(x));
	}

	public facade.datatypes.TELFacade GetOrCreateTelecom()
	{
		Optional<facade.datatypes.TELFacade> lastOrDefault = telecom().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_Telecom());
			return lastOrDefault.get();
		}
		return CreateAnotherTelecom();
	}

	public facade.datatypes.TELFacade CreateAnotherTelecom()
	{
		TEL element = DatatypesFactory.eINSTANCE.createTEL();
		facade.datatypes.TELFacade elementFacade = new facade.datatypes.TELFacade(element);
		elementFacade.Init();
		self.getTelecoms().add(element);
		return elementFacade;
	}

	public facade.datatypes.TELFacade Telecom() {
		return GetOrCreateTelecom();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_NullFlavor());
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

	public Stream<x_InformationRecipientRole> classCode()
	{
		return Set(self.getClassCode());
	}

	public x_InformationRecipientRole GetOrCreateClassCode()
	{
		Optional<x_InformationRecipientRole> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public x_InformationRecipientRole CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getIntendedRecipient_ClassCode());
		x_InformationRecipientRole element = x_InformationRecipientRole.get(0);
		self.setClassCode(element);
		return element;
	}

	public x_InformationRecipientRole ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(x_InformationRecipientRole value) {
		self.setClassCode(value);
	}

}
