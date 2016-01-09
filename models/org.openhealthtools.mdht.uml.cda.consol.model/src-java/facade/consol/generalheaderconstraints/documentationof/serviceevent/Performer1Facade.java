package facade.consol.generalheaderconstraints.documentationof.serviceevent;

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

public class Performer1Facade extends facade.FacadeBase {

	public Performer1 self;

	public Performer1Facade()
	{
		this.self = CDAFactory.eINSTANCE.createPerformer1();
	}

	public Performer1Facade(Performer1 self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Performer1 self)
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
		GetOrCreateAssignedEntity();
		GetOrCreateTypeCode();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
	 *UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(vb, del);
			ValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(vb, del);
			ValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(vb, del);
			ValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(vb, del);

			functionCode().forEach(x -> x.Validate(vb, del));
			assignedEntity().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			time().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
	 * Context Class: consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1
	 * Constraint Name: consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1::GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getFunctionCode()).count()==0) && Set(self.getFunctionCode()).anyMatch(i2805 -> i2805.isNullFlavorUndefined())) || !(Set(self.getFunctionCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.23.i.b.1 functionCode\n\t\tConformance: MAY contain zero or one [0..1] functionCode (CONF:16818), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.5.88 ParticipationFunction) (CONF:16819)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.88')
	 * Context: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
	 * Context Class: consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1
	 * Constraint Name: consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1::GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode
	 */
	public boolean ValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getFunctionCode()).count()==0) && Set(self.getFunctionCode()).anyMatch(i2821 -> i2821.isNullFlavorUndefined())) || !(Set(self.getFunctionCode()).count()==0) && true && Set(self.getFunctionCode()).filter(i2824 -> Set(i2824.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.88")).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.23.i.b.1 functionCode\n\t\tConformance: MAY contain zero or one [0..1] functionCode (CONF:16818), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.5.88 ParticipationFunction) (CONF:16819)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: isDefined('typeCode')
	 * Context: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
	 * Context Class: consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1
	 * Constraint Name: consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1::GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode
	 */
	public boolean ValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self).anyMatch(i2843 -> i2843.isDefined("typeCode"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.23.i.b.2 typeCode\n\t\tConformance: SHALL contain exactly one [1..1] @typeCode (CONF:14840)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1::AssignedEntity))
	 * Context: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
	 * Context Class: consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1
	 * Constraint Name: consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1::GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity
	 */
	public boolean ValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getAssignedEntity()).filter(i2857 -> !(Set(i2857).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.23.i.b.3 assignedEntity\n\t\tConformance: SHALL contain exactly one [1..1] assignedEntity (CONF:14841)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_FunctionCode());
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

	public Stream<facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade> assignedEntity()
	{
		return Set(self.getAssignedEntity()).filter( x -> facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade(x));
	}

	public facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade GetOrCreateAssignedEntity()
	{
		Optional<facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade> lastOrDefault = assignedEntity().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_AssignedEntity());
			return lastOrDefault.get();
		}
		return CreateAnotherAssignedEntity();
	}

	public facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade CreateAnotherAssignedEntity()
	{
		AssignedEntity element = CDAFactory.eINSTANCE.createAssignedEntity();
		facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade(element);
		elementFacade.Init();
		self.setAssignedEntity(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.documentationof.serviceevent.performer1.AssignedEntityFacade AssignedEntity() {
		return GetOrCreateAssignedEntity();
	}

	public Stream<x_ServiceEventPerformer> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public x_ServiceEventPerformer GetOrCreateTypeCode()
	{
		Optional<x_ServiceEventPerformer> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public x_ServiceEventPerformer CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_TypeCode());
		x_ServiceEventPerformer element = x_ServiceEventPerformer.get(0);
		self.setTypeCode(element);
		return element;
	}

	public x_ServiceEventPerformer TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(x_ServiceEventPerformer value) {
		self.setTypeCode(value);
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_TemplateId());
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

	public Stream<facade.datatypes.IVL_TSFacade> time()
	{
		return Set(self.getTime()).filter( x -> x instanceof IVL_TS).map( x -> (IVL_TS) x).map( x -> new facade.datatypes.IVL_TSFacade(x));
	}

	public facade.datatypes.IVL_TSFacade GetOrCreateTime()
	{
		Optional<facade.datatypes.IVL_TSFacade> lastOrDefault = time().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_Time());
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

	public Stream<NullFlavor> nullFlavor()
	{
		return Set(self.getNullFlavor());
	}

	public NullFlavor GetOrCreateNullFlavor()
	{
		Optional<NullFlavor> lastOrDefault = nullFlavor().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPerformer1_NullFlavor());
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

}
