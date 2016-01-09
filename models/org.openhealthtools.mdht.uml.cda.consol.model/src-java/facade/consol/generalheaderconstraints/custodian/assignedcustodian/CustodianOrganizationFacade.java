package facade.consol.generalheaderconstraints.custodian.assignedcustodian;

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

public class CustodianOrganizationFacade extends facade.FacadeBase {

	public CustodianOrganization self;

	public CustodianOrganizationFacade()
	{
		this.self = CDAFactory.eINSTANCE.createCustodianOrganization();
	}

	public CustodianOrganizationFacade(CustodianOrganization self)
	{
		this.self = self;
	}

	public static boolean isKindOf(CustodianOrganization self)
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
		GetOrCreateAddr();
		GetOrCreateId();
		GetOrCreateName();
		GetOrCreateTelecom();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
	 *UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(vb, del);
			ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(vb, del);
			ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(vb, del);
			ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(vb, del);
			ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(vb, del);

			addr().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			name().forEach(x -> x.Validate(vb, del));
			telecom().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
	 * Context: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
	 * Context Class: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization
	 * Constraint Name: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization::GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier
	 */
	public boolean ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getIds()).anyMatch(i2135 -> Set(i2135.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.4.6"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.e ProviderOrganization\n\t\tConformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)\n\t\tAnalysis: The id SHOULD include zero or one [0..1] @root =\"2.16.840.1.113883.4.6\" National Provider Identifier (CONF:9996)\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.addr.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
	 * Context Class: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization
	 * Constraint Name: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization::GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr
	 */
	public boolean ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getAddr()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.16.i.a.1 addr\n\t\tConformance: SHALL contain exactly one [1..1] addr (CONF:5559)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id->isEmpty()
	 * Context: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
	 * Context Class: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization
	 * Constraint Name: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization::GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId
	 */
	public boolean ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getIds()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.16.i.a.2 id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:5522)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.name.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
	 * Context Class: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization
	 * Constraint Name: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization::GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName
	 */
	public boolean ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getName()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.16.i.a.3 name\n\t\tConformance: SHALL contain exactly one [1..1] name (CONF:5524)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.telecom.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
	 * Context Class: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization
	 * Constraint Name: consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization::GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom
	 */
	public boolean ValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getTelecom()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.16.i.a.4 telecom\n\t\tConformance: SHALL contain exactly one [1..1] telecom (CONF:5525)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.generalheaderconstraints.USRealmAddressFacade> addr()
	{
		return Set(self.getAddr()).filter( x -> facade.consol.generalheaderconstraints.USRealmAddressFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.USRealmAddressFacade(x));
	}

	public facade.consol.generalheaderconstraints.USRealmAddressFacade GetOrCreateAddr()
	{
		Optional<facade.consol.generalheaderconstraints.USRealmAddressFacade> lastOrDefault = addr().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_Addr());
			return lastOrDefault.get();
		}
		return CreateAnotherAddr();
	}

	public facade.consol.generalheaderconstraints.USRealmAddressFacade CreateAnotherAddr()
	{
		AD element = DatatypesFactory.eINSTANCE.createAD();
		facade.consol.generalheaderconstraints.USRealmAddressFacade elementFacade = new facade.consol.generalheaderconstraints.USRealmAddressFacade(element);
		elementFacade.Init();
		self.setAddr(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.USRealmAddressFacade Addr() {
		return GetOrCreateAddr();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_Id());
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

	public Stream<facade.datatypes.ONFacade> name()
	{
		return Set(self.getName()).filter( x -> x instanceof ON).map( x -> (ON) x).map( x -> new facade.datatypes.ONFacade(x));
	}

	public facade.datatypes.ONFacade GetOrCreateName()
	{
		Optional<facade.datatypes.ONFacade> lastOrDefault = name().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_Name());
			return lastOrDefault.get();
		}
		return CreateAnotherName();
	}

	public facade.datatypes.ONFacade CreateAnotherName()
	{
		ON element = DatatypesFactory.eINSTANCE.createON();
		facade.datatypes.ONFacade elementFacade = new facade.datatypes.ONFacade(element);
		elementFacade.Init();
		self.setName(element);
		return elementFacade;
	}

	public facade.datatypes.ONFacade Name() {
		return GetOrCreateName();
	}

	public Stream<facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade> telecom()
	{
		return Set(self.getTelecom()).filter( x -> facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade(x));
	}

	public facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade GetOrCreateTelecom()
	{
		Optional<facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade> lastOrDefault = telecom().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_Telecom());
			return lastOrDefault.get();
		}
		return CreateAnotherTelecom();
	}

	public facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade CreateAnotherTelecom()
	{
		TEL element = DatatypesFactory.eINSTANCE.createTEL();
		facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade elementFacade = new facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade(element);
		elementFacade.Init();
		self.setTelecom(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.custodian.assignedcustodian.custodianorganization.TELFacade Telecom() {
		return GetOrCreateTelecom();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_NullFlavor());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public EntityClassOrganization CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_ClassCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_DeterminerCode());
			return lastOrDefault.get();
		}
		return CreateAnotherDeterminerCode();
	}

	public EntityDeterminer CreateAnotherDeterminerCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getCustodianOrganization_DeterminerCode());
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
