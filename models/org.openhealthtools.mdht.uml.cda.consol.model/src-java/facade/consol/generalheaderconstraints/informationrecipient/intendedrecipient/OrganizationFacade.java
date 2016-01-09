package facade.consol.generalheaderconstraints.informationrecipient.intendedrecipient;

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

public class OrganizationFacade extends facade.FacadeBase {

	public Organization self;

	public OrganizationFacade()
	{
		this.self = CDAFactory.eINSTANCE.createOrganization();
	}

	public OrganizationFacade(Organization self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Organization self)
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
		GetOrCreateName();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient/receivedOrganization
	 *UML root path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient/receivedOrganization
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(vb, del);

			name().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			telecom().forEach(x -> x.Validate(vb, del));
			addr().forEach(x -> x.Validate(vb, del));
			standardIndustryClassCode().forEach(x -> x.Validate(vb, del));
			asOrganizationPartOf().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.name->size() = 1
	 * Context: /GeneralHeaderConstraints/informationRecipient/intendedRecipient/receivedOrganization
	 * Context Class: consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Organization
	 * Constraint Name: consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Organization::GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName
	 */
	public boolean ValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getNames()).count())==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.17.i.b.1 name\n\t\tConformance: SHALL contain exactly one [1..1] name (CONF:5578)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.ONFacade> name()
	{
		return Set(self.getNames()).filter( x -> x instanceof ON).map( x -> (ON) x).map( x -> new facade.datatypes.ONFacade(x));
	}

	public facade.datatypes.ONFacade GetOrCreateName()
	{
		Optional<facade.datatypes.ONFacade> lastOrDefault = name().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_Name());
			return lastOrDefault.get();
		}
		return CreateAnotherName();
	}

	public facade.datatypes.ONFacade CreateAnotherName()
	{
		ON element = DatatypesFactory.eINSTANCE.createON();
		facade.datatypes.ONFacade elementFacade = new facade.datatypes.ONFacade(element);
		elementFacade.Init();
		self.getNames().add(element);
		return elementFacade;
	}

	public facade.datatypes.ONFacade Name() {
		return GetOrCreateName();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_Id());
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

	public Stream<facade.datatypes.TELFacade> telecom()
	{
		return Set(self.getTelecoms()).filter( x -> x instanceof TEL).map( x -> (TEL) x).map( x -> new facade.datatypes.TELFacade(x));
	}

	public facade.datatypes.TELFacade GetOrCreateTelecom()
	{
		Optional<facade.datatypes.TELFacade> lastOrDefault = telecom().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_Telecom());
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

	public Stream<facade.datatypes.ADFacade> addr()
	{
		return Set(self.getAddrs()).filter( x -> x instanceof AD).map( x -> (AD) x).map( x -> new facade.datatypes.ADFacade(x));
	}

	public facade.datatypes.ADFacade GetOrCreateAddr()
	{
		Optional<facade.datatypes.ADFacade> lastOrDefault = addr().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_Addr());
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

	public Stream<facade.datatypes.CEFacade> standardIndustryClassCode()
	{
		return Set(self.getStandardIndustryClassCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateStandardIndustryClassCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = standardIndustryClassCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_StandardIndustryClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherStandardIndustryClassCode();
	}

	public facade.datatypes.CEFacade CreateAnotherStandardIndustryClassCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setStandardIndustryClassCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade StandardIndustryClassCode() {
		return GetOrCreateStandardIndustryClassCode();
	}

	public Stream<facade.cda.OrganizationPartOfFacade> asOrganizationPartOf()
	{
		return Set(self.getAsOrganizationPartOf()).filter( x -> facade.cda.OrganizationPartOfFacade.isKindOf(x)).map( x -> new facade.cda.OrganizationPartOfFacade(x));
	}

	public facade.cda.OrganizationPartOfFacade GetOrCreateAsOrganizationPartOf()
	{
		Optional<facade.cda.OrganizationPartOfFacade> lastOrDefault = asOrganizationPartOf().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_AsOrganizationPartOf());
			return lastOrDefault.get();
		}
		return CreateAnotherAsOrganizationPartOf();
	}

	public facade.cda.OrganizationPartOfFacade CreateAnotherAsOrganizationPartOf()
	{
		OrganizationPartOf element = CDAFactory.eINSTANCE.createOrganizationPartOf();
		facade.cda.OrganizationPartOfFacade elementFacade = new facade.cda.OrganizationPartOfFacade(element);
		elementFacade.Init();
		self.setAsOrganizationPartOf(element);
		return elementFacade;
	}

	public facade.cda.OrganizationPartOfFacade AsOrganizationPartOf() {
		return GetOrCreateAsOrganizationPartOf();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_NullFlavor());
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

	public Stream<EntityClassOrganization> classCode()
	{
		return Set(self.getClassCode());
	}

	public EntityClassOrganization GetOrCreateClassCode()
	{
		Optional<EntityClassOrganization> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public EntityClassOrganization CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_ClassCode());
		EntityClassOrganization element = EntityClassOrganization.get(0);
		self.setClassCode(element);
		return element;
	}

	public EntityClassOrganization ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(EntityClassOrganization value) {
		self.setClassCode(value);
	}

	public Stream<EntityDeterminer> determinerCode()
	{
		return Set(self.getDeterminerCode());
	}

	public EntityDeterminer GetOrCreateDeterminerCode()
	{
		Optional<EntityDeterminer> lastOrDefault = determinerCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_DeterminerCode());
			return lastOrDefault.get();
		}
		return CreateAnotherDeterminerCode();
	}

	public EntityDeterminer CreateAnotherDeterminerCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getOrganization_DeterminerCode());
		EntityDeterminer element = EntityDeterminer.get(0);
		self.setDeterminerCode(element);
		return element;
	}

	public EntityDeterminer DeterminerCode() {
		return GetOrCreateDeterminerCode();
	}

	public void DeterminerCode(EntityDeterminer value) {
		self.setDeterminerCode(value);
	}

}
