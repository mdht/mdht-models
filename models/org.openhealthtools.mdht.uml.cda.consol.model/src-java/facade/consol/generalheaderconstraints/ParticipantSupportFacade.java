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

public class ParticipantSupportFacade extends facade.FacadeBase {

	public Participant1 self;

	public ParticipantSupportFacade()
	{
		this.self = CDAFactory.eINSTANCE.createParticipant1();
	}

	public ParticipantSupportFacade(Participant1 self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Participant1 self)
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
		GetOrCreateAssociatedEntity();
		GetOrCreateTypeCode();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/supportParticipant
	 *UML root path: /GeneralHeaderConstraints/supportParticipant
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(vb, del);
			ValidateGeneralHeaderConstraintsParticipantSupportTime(vb, del);

			time().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			functionCode().forEach(x -> x.Validate(vb, del));
			associatedEntity().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/supportParticipant
	 * Context Class: consol::GeneralHeaderConstraints::ParticipantSupport
	 * Constraint Name: consol::GeneralHeaderConstraints::ParticipantSupport::GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
	 */
	public boolean ValidateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Flatten(Set(self.getAssociatedEntity()).map(i2725 -> Set(i2725.getAssociatedPerson()))).count()==0) || !(Flatten(Set(self.getAssociatedEntity()).map(i2726 -> Set(i2726.getScopingOrganization()))).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.21.ii GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization\n\t\tConformance: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity. (CONF:10006)\n\t\tAnalysis: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity.\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/supportParticipant
	 * Context Class: consol::GeneralHeaderConstraints::ParticipantSupport
	 * Constraint Name: consol::GeneralHeaderConstraints::ParticipantSupport::GeneralHeaderConstraintsParticipantSupportTime
	 */
	public boolean ValidateGeneralHeaderConstraintsParticipantSupportTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getTime()).count()==0) && Set(self.getTime()).anyMatch(i2733 -> i2733.isNullFlavorUndefined())) || !(Set(self.getTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.21.i time\n\t\tConformance: MAY contain zero or one [0..1] time (CONF:10004)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.IVL_TSFacade> time()
	{
		return Set(self.getTime()).filter( x -> x instanceof IVL_TS).map( x -> (IVL_TS) x).map( x -> new facade.datatypes.IVL_TSFacade(x));
	}

	public facade.datatypes.IVL_TSFacade GetOrCreateTime()
	{
		Optional<facade.datatypes.IVL_TSFacade> lastOrDefault = time().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_Time());
			return lastOrDefault.get();
		}
		return CreateAnotherTime();
	}

	public facade.datatypes.IVL_TSFacade CreateAnotherTime()
	{
		IVL_TS element = DatatypesFactory.eINSTANCE.createIVL_TS();
		facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
		elementFacade.Init();
		self.setTime(element);
		return elementFacade;
	}

	public facade.datatypes.IVL_TSFacade Time() {
		return GetOrCreateTime();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_TemplateId());
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

	public Stream<facade.datatypes.CEFacade> functionCode()
	{
		return Set(self.getFunctionCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateFunctionCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = functionCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_FunctionCode());
			return lastOrDefault.get();
		}
		return CreateAnotherFunctionCode();
	}

	public facade.datatypes.CEFacade CreateAnotherFunctionCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setFunctionCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade FunctionCode() {
		return GetOrCreateFunctionCode();
	}

	public Stream<facade.cda.AssociatedEntityFacade> associatedEntity()
	{
		return Set(self.getAssociatedEntity()).filter( x -> facade.cda.AssociatedEntityFacade.isKindOf(x)).map( x -> new facade.cda.AssociatedEntityFacade(x));
	}

	public facade.cda.AssociatedEntityFacade GetOrCreateAssociatedEntity()
	{
		Optional<facade.cda.AssociatedEntityFacade> lastOrDefault = associatedEntity().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_AssociatedEntity());
			return lastOrDefault.get();
		}
		return CreateAnotherAssociatedEntity();
	}

	public facade.cda.AssociatedEntityFacade CreateAnotherAssociatedEntity()
	{
		AssociatedEntity element = CDAFactory.eINSTANCE.createAssociatedEntity();
		facade.cda.AssociatedEntityFacade elementFacade = new facade.cda.AssociatedEntityFacade(element);
		elementFacade.Init();
		self.setAssociatedEntity(element);
		return elementFacade;
	}

	public facade.cda.AssociatedEntityFacade AssociatedEntity() {
		return GetOrCreateAssociatedEntity();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_NullFlavor());
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

	public Stream<ParticipationType> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public ParticipationType GetOrCreateTypeCode()
	{
		Optional<ParticipationType> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public ParticipationType CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_TypeCode());
		ParticipationType element = ParticipationType.get(0);
		self.setTypeCode(element);
		return element;
	}

	public ParticipationType TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(ParticipationType value) {
		self.setTypeCode(value);
	}

	public Stream<ContextControl> contextControlCode()
	{
		return Set(self.getContextControlCode());
	}

	public ContextControl GetOrCreateContextControlCode()
	{
		Optional<ContextControl> lastOrDefault = contextControlCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_ContextControlCode());
			return lastOrDefault.get();
		}
		return CreateAnotherContextControlCode();
	}

	public ContextControl CreateAnotherContextControlCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getParticipant1_ContextControlCode());
		ContextControl element = ContextControl.get(0);
		self.setContextControlCode(element);
		return element;
	}

	public ContextControl ContextControlCode() {
		return GetOrCreateContextControlCode();
	}

	public void ContextControlCode(ContextControl value) {
		self.setContextControlCode(value);
	}

}
