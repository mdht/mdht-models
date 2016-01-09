package facade.consol.generalheaderconstraints.legalauthenticator;

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
	 *UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	 *UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(vb, del);

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
	 * Context: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getIds()).anyMatch(i2323 -> Set(i2323.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.4.6"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.e ProviderOrganization\n\t\tConformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)\n\t\tAnalysis: The id MAY include zero or one [0..1] root =\"2.16.840.1.113883.4.6\" National Provider Identifier (CONF:9996)\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.addr->isEmpty()
	 * Context: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getAddrs()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.iii.a addr\n\t\tConformance: SHALL contain at least one [1..*] addr (CONF:5589)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getCode()).count()==0) && Set(self.getCode()).anyMatch(i2343 -> i2343.isNullFlavorUndefined())) || !(Set(self.getCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.iii.b code\n\t\tConformance: MAY contain zero or one [0..1] code (CONF:17000), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getCode()).count()==0) && Set(self.getCode()).anyMatch(i2355 -> i2355.isNullFlavorUndefined())) || !(Set(self.getCode()).count()==0) && true && Set(self.getCode()).filter(i2358 -> Set(i2358.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.6.101") && !(Set(i2358.getCode()).count()==0)).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.iii.b code\n\t\tConformance: MAY contain zero or one [0..1] code (CONF:17000), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id->isEmpty()
	 * Context: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getIds()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.iii.c id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:5586)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.telecom->isEmpty()
	 * Context: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getTelecoms()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.iii.d telecom\n\t\tConformance: SHALL contain at least one [1..*] telecom (CONF:5595)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::Person))
	 * Context: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getAssignedPerson()).filter(i2393 -> !(Set(i2393).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.iii.e assignedPerson\n\t\tConformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5597)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
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

	public Stream<facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade> telecom()
	{
		return Set(self.getTelecoms()).filter( x -> facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade(x));
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade GetOrCreateTelecom()
	{
		Optional<facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade> lastOrDefault = telecom().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_Telecom());
			return lastOrDefault.get();
		}
		return CreateAnotherTelecom();
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade CreateAnotherTelecom()
	{
		TEL element = DatatypesFactory.eINSTANCE.createTEL();
		facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade elementFacade = new facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade(element);
		elementFacade.Init();
		self.getTelecoms().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.TELFacade Telecom() {
		return GetOrCreateTelecom();
	}

	public Stream<facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade> assignedPerson()
	{
		return Set(self.getAssignedPerson()).filter( x -> facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade(x));
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade GetOrCreateAssignedPerson()
	{
		Optional<facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade> lastOrDefault = assignedPerson().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_AssignedPerson());
			return lastOrDefault.get();
		}
		return CreateAnotherAssignedPerson();
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade CreateAnotherAssignedPerson()
	{
		Person element = CDAFactory.eINSTANCE.createPerson();
		facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade elementFacade = new facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade(element);
		elementFacade.Init();
		self.setAssignedPerson(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.assignedentity.PersonFacade AssignedPerson() {
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
