package facade.consol.continuityofcaredocument.documentationof.serviceevent.performer;

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
		GetOrCreateId();
	}

	/**
	 *UML path: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer/assignedEntity
	 *UML root path: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer/assignedEntity
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(vb, del);
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(vb, del);
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(vb, del);
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(vb, del);

			code().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			addr().forEach(x -> x.Validate(vb, del));
			telecom().forEach(x -> x.Validate(vb, del));
			assignedPerson().forEach(x -> x.Validate(vb, del));
			representedOrganization().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.id->exists(root='2.16.840.1.113883.4.6')
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer/assignedEntity
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity::ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getIds()).anyMatch(i3305 -> Set(i3305.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.4.6"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.c.2.iii ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier\n\t\tConformance: SHOULD include zero or one [0..1] id where id/@root =\"2.16.840.1.113883.4.6\" National Provider Identifier (CONF:10027)\n\t\tAnalysis: SHOULD include zero or one [0..1] id where id/@root =\"2.16.840.1.113883.4.6\" National Provider Identifier\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer/assignedEntity
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity::ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getCode()).count()==0) && Set(self.getCode()).anyMatch(i3325 -> i3325.isNullFlavorUndefined())) || true;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.c.2.i code\n\t\tConformance: MAY contain zero or one [0..1] code, which MAY be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:8461)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in  not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer/assignedEntity
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity::ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getCode()).count()==0) && Set(self.getCode()).anyMatch(i3347 -> i3347.isNullFlavorUndefined())) || !(Set(self.getCode()).count()==0) && true && Set(self.getCode()).filter(i3350 -> !(Set(i3350.getCodeSystem()).count()==0) || !(Set(i3350.getCodeSystemName()).count()==0)).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.c.2.i code\n\t\tConformance: MAY contain zero or one [0..1] code, which MAY be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:8461)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id->isEmpty()
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent/performer/assignedEntity
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity::ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getIds()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.c.2.ii id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:10027)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
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

	public Stream<facade.datatypes.ADFacade> addr()
	{
		return Set(self.getAddrs()).filter( x -> x instanceof AD).map( x -> (AD) x).map( x -> new facade.datatypes.ADFacade(x));
	}

	public facade.datatypes.ADFacade GetOrCreateAddr()
	{
		Optional<facade.datatypes.ADFacade> lastOrDefault = addr().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_Addr());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_Telecom());
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

	public Stream<facade.cda.PersonFacade> assignedPerson()
	{
		return Set(self.getAssignedPerson()).filter( x -> facade.cda.PersonFacade.isKindOf(x)).map( x -> new facade.cda.PersonFacade(x));
	}

	public facade.cda.PersonFacade GetOrCreateAssignedPerson()
	{
		Optional<facade.cda.PersonFacade> lastOrDefault = assignedPerson().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAssignedEntity_AssignedPerson());
			return lastOrDefault.get();
		}
		return CreateAnotherAssignedPerson();
	}

	public facade.cda.PersonFacade CreateAnotherAssignedPerson()
	{
		Person element = CDAFactory.eINSTANCE.createPerson();
		facade.cda.PersonFacade elementFacade = new facade.cda.PersonFacade(element);
		elementFacade.Init();
		self.setAssignedPerson(element);
		return elementFacade;
	}

	public facade.cda.PersonFacade AssignedPerson() {
		return GetOrCreateAssignedPerson();
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
