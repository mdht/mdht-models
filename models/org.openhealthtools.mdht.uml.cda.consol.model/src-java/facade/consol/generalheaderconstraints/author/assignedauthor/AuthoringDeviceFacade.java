package facade.consol.generalheaderconstraints.author.assignedauthor;

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

public class AuthoringDeviceFacade extends facade.FacadeBase {

	public AuthoringDevice self;

	public AuthoringDeviceFacade()
	{
		this.self = CDAFactory.eINSTANCE.createAuthoringDevice();
	}

	public AuthoringDeviceFacade(AuthoringDevice self)
	{
		this.self = self;
	}

	public static boolean isKindOf(AuthoringDevice self)
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
		GetOrCreateManufacturerModelName();
		GetOrCreateSoftwareName();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
	 *UML root path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(vb, del);
			ValidateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(vb, del);

			manufacturerModelName().forEach(x -> x.Validate(vb, del));
			softwareName().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			code().forEach(x -> x.Validate(vb, del));
			asMaintainedEntity().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: not self.manufacturerModelName.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
	 * Context Class: consol::GeneralHeaderConstraints::Author::AssignedAuthor::AuthoringDevice
	 * Constraint Name: consol::GeneralHeaderConstraints::Author::AssignedAuthor::AuthoringDevice::GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getManufacturerModelName()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.14.ii.e.1 manufacturerModelName\n\t\tConformance: SHALL contain exactly one [1..1] manufacturerModelName (CONF:16784)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.softwareName.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
	 * Context Class: consol::GeneralHeaderConstraints::Author::AssignedAuthor::AuthoringDevice
	 * Constraint Name: consol::GeneralHeaderConstraints::Author::AssignedAuthor::AuthoringDevice::GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getSoftwareName()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.14.ii.e.2 softwareName\n\t\tConformance: SHALL contain exactly one [1..1] softwareName (CONF:16785)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.SCFacade> manufacturerModelName()
	{
		return Set(self.getManufacturerModelName()).filter( x -> x instanceof SC).map( x -> (SC) x).map( x -> new facade.datatypes.SCFacade(x));
	}

	public facade.datatypes.SCFacade GetOrCreateManufacturerModelName()
	{
		Optional<facade.datatypes.SCFacade> lastOrDefault = manufacturerModelName().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_ManufacturerModelName());
			return lastOrDefault.get();
		}
		return CreateAnotherManufacturerModelName();
	}

	public facade.datatypes.SCFacade CreateAnotherManufacturerModelName()
	{
		SC element = DatatypesFactory.eINSTANCE.createSC();
		facade.datatypes.SCFacade elementFacade = new facade.datatypes.SCFacade(element);
		elementFacade.Init();
		self.setManufacturerModelName(element);
		return elementFacade;
	}

	public facade.datatypes.SCFacade ManufacturerModelName() {
		return GetOrCreateManufacturerModelName();
	}

	public Stream<facade.datatypes.SCFacade> softwareName()
	{
		return Set(self.getSoftwareName()).filter( x -> x instanceof SC).map( x -> (SC) x).map( x -> new facade.datatypes.SCFacade(x));
	}

	public facade.datatypes.SCFacade GetOrCreateSoftwareName()
	{
		Optional<facade.datatypes.SCFacade> lastOrDefault = softwareName().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_SoftwareName());
			return lastOrDefault.get();
		}
		return CreateAnotherSoftwareName();
	}

	public facade.datatypes.SCFacade CreateAnotherSoftwareName()
	{
		SC element = DatatypesFactory.eINSTANCE.createSC();
		facade.datatypes.SCFacade elementFacade = new facade.datatypes.SCFacade(element);
		elementFacade.Init();
		self.setSoftwareName(element);
		return elementFacade;
	}

	public facade.datatypes.SCFacade SoftwareName() {
		return GetOrCreateSoftwareName();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_TemplateId());
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

	public Stream<facade.datatypes.CEFacade> code()
	{
		return Set(self.getCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = code().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_Code());
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

	public Stream<facade.cda.MaintainedEntityFacade> asMaintainedEntity()
	{
		return Set(self.getAsMaintainedEntities()).filter( x -> facade.cda.MaintainedEntityFacade.isKindOf(x)).map( x -> new facade.cda.MaintainedEntityFacade(x));
	}

	public facade.cda.MaintainedEntityFacade GetOrCreateAsMaintainedEntity()
	{
		Optional<facade.cda.MaintainedEntityFacade> lastOrDefault = asMaintainedEntity().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_AsMaintainedEntity());
			return lastOrDefault.get();
		}
		return CreateAnotherAsMaintainedEntity();
	}

	public facade.cda.MaintainedEntityFacade CreateAnotherAsMaintainedEntity()
	{
		MaintainedEntity element = CDAFactory.eINSTANCE.createMaintainedEntity();
		facade.cda.MaintainedEntityFacade elementFacade = new facade.cda.MaintainedEntityFacade(element);
		elementFacade.Init();
		self.getAsMaintainedEntities().add(element);
		return elementFacade;
	}

	public facade.cda.MaintainedEntityFacade AsMaintainedEntity() {
		return GetOrCreateAsMaintainedEntity();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_NullFlavor());
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

	public Stream<EntityClassDevice> classCode()
	{
		return Set(self.getClassCode());
	}

	public EntityClassDevice GetOrCreateClassCode()
	{
		Optional<EntityClassDevice> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public EntityClassDevice CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_ClassCode());
		EntityClassDevice element = EntityClassDevice.get(0);
		self.setClassCode(element);
		return element;
	}

	public EntityClassDevice ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(EntityClassDevice value) {
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_DeterminerCode());
			return lastOrDefault.get();
		}
		return CreateAnotherDeterminerCode();
	}

	public EntityDeterminer CreateAnotherDeterminerCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthoringDevice_DeterminerCode());
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
