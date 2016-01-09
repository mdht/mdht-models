package facade.consol.generalheaderconstraints.dataenterer;

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

public class AssignedEntityFacade extends facade.FacadeBase {

	public AssignedEntity self;

	public AssignedEntityFacade()
	{
		this.self = CDAFactory.eINSTANCE.createAssignedEntity();
	}

	public AssignedEntityFacade(AssignedEntity self)
	{
		this.self = self;
	}

	public static boolean isKindOf(AssignedEntity self)
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
		GetOrCreateTelecom();
		GetOrCreateAssignedPerson();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	 *UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(vb, del);
			ValidateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(vb, del);
			ValidateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(vb, del);
			ValidateGeneralHeaderConstraintsDataEntererAssignedEntityCode(vb, del);
			ValidateGeneralHeaderConstraintsDataEntererAssignedEntityId(vb, del);
			ValidateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(vb, del);
			ValidateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(vb, del);

			addr().forEach(x -> x.Validate(vb, del));
			code().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			telecom().forEach(x -> x.Validate(vb, del));
			assignedPerson().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			representedOrganization().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
	 * Context: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::GeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier
	 */
	public boolean ValidateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getIds()).anyMatch(i1999 -> Set(i1999.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.4.6"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.e ProviderOrganization\n\t\tConformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)\n\t\tAnalysis: id SHOULD include zero or one [0..1] @root =\"2.16.840.1.113883.4.6\" National Provider Identifier\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.addr->isEmpty()
	 * Context: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::GeneralHeaderConstraintsDataEntererAssignedEntityAddr
	 */
	public boolean ValidateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getAddrs()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.15.i.a addr\n\t\tConformance: SHALL contain at least one [1..*] addr (CONF:5460)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getCode()).count()==0) && Set(self.getCode()).anyMatch(i2019 -> i2019.isNullFlavorUndefined())) || !(Set(self.getCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.15.i.b code\n\t\tConformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.6.101')
	 * Context: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::GeneralHeaderConstraintsDataEntererAssignedEntityCode
	 */
	public boolean ValidateGeneralHeaderConstraintsDataEntererAssignedEntityCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getCode()).count()==0) && Set(self.getCode()).anyMatch(i2031 -> i2031.isNullFlavorUndefined())) || !(Set(self.getCode()).count()==0) && true && Set(self.getCode()).filter(i2034 -> Set(i2034.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.6.101")).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.15.i.b code\n\t\tConformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id->isEmpty()
	 * Context: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::GeneralHeaderConstraintsDataEntererAssignedEntityId
	 */
	public boolean ValidateGeneralHeaderConstraintsDataEntererAssignedEntityId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getIds()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.15.i.c id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:5443)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.telecom->isEmpty()
	 * Context: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::GeneralHeaderConstraintsDataEntererAssignedEntityTelecom
	 */
	public boolean ValidateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getTelecoms()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.15.i.d telecom\n\t\tConformance: SHALL contain at least one [1..*] telecom (CONF:5466)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::Person))
	 * Context: /GeneralHeaderConstraints/dataEnterer/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson
	 */
	public boolean ValidateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getAssignedPerson()).filter(i2069 -> !(Set(i2069).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.15.i.e assignedPerson\n\t\tConformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5469)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.generalheaderconstraints.USRealmAddressFacade> addr()
	{
		return Set(self.getAddrs()).filter( x -> facade.consol.generalheaderconstraints.USRealmAddressFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.USRealmAddressFacade(x));
	}

	public facade.consol.generalheaderconstraints.USRealmAddressFacade GetOrCreateAddr()
	{
		Optional<facade.consol.generalheaderconstraints.USRealmAddressFacade> lastOrDefault = addr().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_Addr());
			return lastOrDefault.get();
		}
		return CreateAnotherAddr();
	}

	public facade.consol.generalheaderconstraints.USRealmAddressFacade CreateAnotherAddr()
	{
		AD element = DatatypesFactory.eINSTANCE.createAD();
		facade.consol.generalheaderconstraints.USRealmAddressFacade elementFacade = new facade.consol.generalheaderconstraints.USRealmAddressFacade(element);
		elementFacade.Init();
		self.getAddrs().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.USRealmAddressFacade Addr() {
		return GetOrCreateAddr();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_Code());
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

	public Stream<facade.datatypes.IIFacade> id()
	{
		return Set(self.getIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_Id());
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

	public Stream<facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade> telecom()
	{
		return Set(self.getTelecoms()).filter( x -> facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade(x));
	}

	public facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade GetOrCreateTelecom()
	{
		Optional<facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade> lastOrDefault = telecom().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_Telecom());
			return lastOrDefault.get();
		}
		return CreateAnotherTelecom();
	}

	public facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade CreateAnotherTelecom()
	{
		TEL element = DatatypesFactory.eINSTANCE.createTEL();
		facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade elementFacade = new facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade(element);
		elementFacade.Init();
		self.getTelecoms().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.dataenterer.assignedentity.TELFacade Telecom() {
		return GetOrCreateTelecom();
	}

	public Stream<facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade> assignedPerson()
	{
		return Set(self.getAssignedPerson()).filter( x -> facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade(x));
	}

	public facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade GetOrCreateAssignedPerson()
	{
		Optional<facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade> lastOrDefault = assignedPerson().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_AssignedPerson());
			return lastOrDefault.get();
		}
		return CreateAnotherAssignedPerson();
	}

	public facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade CreateAnotherAssignedPerson()
	{
		Person element = CDAFactory.eINSTANCE.createPerson();
		facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade elementFacade = new facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade(element);
		elementFacade.Init();
		self.setAssignedPerson(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.dataenterer.assignedentity.PersonFacade AssignedPerson() {
		return GetOrCreateAssignedPerson();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_TemplateId());
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

	public Stream<facade.cda.OrganizationFacade> representedOrganization()
	{
		return Set(self.getRepresentedOrganizations()).filter( x -> facade.cda.OrganizationFacade.isKindOf(x)).map( x -> new facade.cda.OrganizationFacade(x));
	}

	public facade.cda.OrganizationFacade GetOrCreateRepresentedOrganization()
	{
		Optional<facade.cda.OrganizationFacade> lastOrDefault = representedOrganization().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_RepresentedOrganization());
			return lastOrDefault.get();
		}
		return CreateAnotherRepresentedOrganization();
	}

	public facade.cda.OrganizationFacade CreateAnotherRepresentedOrganization()
	{
		Organization element = CDAFactory.eINSTANCE.createOrganization();
		facade.cda.OrganizationFacade elementFacade = new facade.cda.OrganizationFacade(element);
		elementFacade.Init();
		self.getRepresentedOrganizations().add(element);
		return elementFacade;
	}

	public facade.cda.OrganizationFacade RepresentedOrganization() {
		return GetOrCreateRepresentedOrganization();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_NullFlavor());
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

	public Stream<RoleClassAssignedEntity> classCode()
	{
		return Set(self.getClassCode());
	}

	public RoleClassAssignedEntity GetOrCreateClassCode()
	{
		Optional<RoleClassAssignedEntity> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public RoleClassAssignedEntity CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_ClassCode());
		RoleClassAssignedEntity element = RoleClassAssignedEntity.get(0);
		self.setClassCode(element);
		return element;
	}

	public RoleClassAssignedEntity ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(RoleClassAssignedEntity value) {
		self.setClassCode(value);
	}

}
