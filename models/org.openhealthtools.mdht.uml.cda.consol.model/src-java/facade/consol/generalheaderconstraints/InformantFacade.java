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

public class InformantFacade extends facade.FacadeBase {

	public Informant12 self;

	public InformantFacade()
	{
		this.self = CDAFactory.eINSTANCE.createInformant12();
	}

	public InformantFacade(Informant12 self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Informant12 self)
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
	 *UML path: /GeneralHeaderConstraints/informant
	 *UML root path: /GeneralHeaderConstraints/informant
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(vb, del);
			ValidateGeneralHeaderConstraintsInformantAssignedEntity(vb, del);
			ValidateGeneralHeaderConstraintsInformantRelatedEntity(vb, del);

			assignedEntity().forEach(x -> x.Validate(vb, del));
			relatedEntity().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/informant
	 * Context Class: consol::GeneralHeaderConstraints::Informant
	 * Constraint Name: consol::GeneralHeaderConstraints::Informant::GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity
	 */
	public boolean ValidateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getAssignedEntity()).count()==0 ^ Set(self.getRelatedEntity()).count()==0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.20.iii GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity\n\t\tConformance: SHALL satisfy: contain exactly one [1..1] assignedEntity OR exactly one [1..1] relatedEntity (CONF:8002)\n\t\tAnalysis: contain exactly one [1..1] assignedEntity OR exactly one [1..1] relatedEntity\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.assignedEntity->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity))->size() <= 1
	 * Context: /GeneralHeaderConstraints/informant
	 * Context Class: consol::GeneralHeaderConstraints::Informant
	 * Constraint Name: consol::GeneralHeaderConstraints::Informant::GeneralHeaderConstraintsInformantAssignedEntity
	 */
	public boolean ValidateGeneralHeaderConstraintsInformantAssignedEntity(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getAssignedEntity()).filter(i2585 -> !(Set(i2585).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.20.i assignedEntity\n\t\tConformance: MAY contain zero or one [0..1] assignedEntity\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.relatedEntity->select(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::RelatedEntity))->size() <= 1
	 * Context: /GeneralHeaderConstraints/informant
	 * Context Class: consol::GeneralHeaderConstraints::Informant
	 * Constraint Name: consol::GeneralHeaderConstraints::Informant::GeneralHeaderConstraintsInformantRelatedEntity
	 */
	public boolean ValidateGeneralHeaderConstraintsInformantRelatedEntity(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getRelatedEntity()).filter(i2595 -> !(Set(i2595).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.20.ii relatedEntity\n\t\tConformance: MAY contain zero or one [0..1] relatedEntity\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.generalheaderconstraints.informant.AssignedEntityFacade> assignedEntity()
	{
		return Set(self.getAssignedEntity()).filter( x -> facade.consol.generalheaderconstraints.informant.AssignedEntityFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.informant.AssignedEntityFacade(x));
	}

	public facade.consol.generalheaderconstraints.informant.AssignedEntityFacade GetOrCreateAssignedEntity()
	{
		Optional<facade.consol.generalheaderconstraints.informant.AssignedEntityFacade> lastOrDefault = assignedEntity().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_AssignedEntity());
			return lastOrDefault.get();
		}
		return CreateAnotherAssignedEntity();
	}

	public facade.consol.generalheaderconstraints.informant.AssignedEntityFacade CreateAnotherAssignedEntity()
	{
		AssignedEntity element = CDAFactory.eINSTANCE.createAssignedEntity();
		facade.consol.generalheaderconstraints.informant.AssignedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.informant.AssignedEntityFacade(element);
		elementFacade.Init();
		self.setAssignedEntity(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.informant.AssignedEntityFacade AssignedEntity() {
		return GetOrCreateAssignedEntity();
	}

	public Stream<facade.consol.generalheaderconstraints.informant.RelatedEntityFacade> relatedEntity()
	{
		return Set(self.getRelatedEntity()).filter( x -> facade.consol.generalheaderconstraints.informant.RelatedEntityFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.informant.RelatedEntityFacade(x));
	}

	public facade.consol.generalheaderconstraints.informant.RelatedEntityFacade GetOrCreateRelatedEntity()
	{
		Optional<facade.consol.generalheaderconstraints.informant.RelatedEntityFacade> lastOrDefault = relatedEntity().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_RelatedEntity());
			return lastOrDefault.get();
		}
		return CreateAnotherRelatedEntity();
	}

	public facade.consol.generalheaderconstraints.informant.RelatedEntityFacade CreateAnotherRelatedEntity()
	{
		RelatedEntity element = CDAFactory.eINSTANCE.createRelatedEntity();
		facade.consol.generalheaderconstraints.informant.RelatedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.informant.RelatedEntityFacade(element);
		elementFacade.Init();
		self.setRelatedEntity(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.informant.RelatedEntityFacade RelatedEntity() {
		return GetOrCreateRelatedEntity();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_NullFlavor());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public ParticipationType CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_TypeCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_ContextControlCode());
			return lastOrDefault.get();
		}
		return CreateAnotherContextControlCode();
	}

	public ContextControl CreateAnotherContextControlCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getInformant12_ContextControlCode());
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
