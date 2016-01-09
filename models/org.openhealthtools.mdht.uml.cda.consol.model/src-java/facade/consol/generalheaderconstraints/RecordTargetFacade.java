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

public class RecordTargetFacade extends facade.FacadeBase {

	public RecordTarget self;

	public RecordTargetFacade()
	{
		this.self = CDAFactory.eINSTANCE.createRecordTarget();
	}

	public RecordTargetFacade(RecordTarget self)
	{
		this.self = self;
	}

	public static boolean isKindOf(RecordTarget self)
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
		GetOrCreatePatientRole();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget
	 *UML root path: /GeneralHeaderConstraints/recordTarget
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsRecordTargetPatientRole(vb, del);

			patientRole().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole))
	 * Context: /GeneralHeaderConstraints/recordTarget
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::GeneralHeaderConstraintsRecordTargetPatientRole
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRole(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getPatientRole()).filter(i671 -> !(Set(i671).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i patientRole\n\t\tConformance: SHALL contain exactly one [1..1] patientRole (CONF:5268)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade> patientRole()
	{
		return Set(self.getPatientRole()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade GetOrCreatePatientRole()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade> lastOrDefault = patientRole().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_PatientRole());
			return lastOrDefault.get();
		}
		return CreateAnotherPatientRole();
	}

	public facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade CreateAnotherPatientRole()
	{
		PatientRole element = CDAFactory.eINSTANCE.createPatientRole();
		facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade(element);
		elementFacade.Init();
		self.setPatientRole(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.PatientRoleFacade PatientRole() {
		return GetOrCreatePatientRole();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_NullFlavor());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public ParticipationType CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_TypeCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_ContextControlCode());
			return lastOrDefault.get();
		}
		return CreateAnotherContextControlCode();
	}

	public ContextControl CreateAnotherContextControlCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getRecordTarget_ContextControlCode());
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
