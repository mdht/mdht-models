package facade.consol.generalheaderconstraints.recordtarget.patientrole.patient;

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

public class BirthplaceFacade extends facade.FacadeBase {

	public Birthplace self;

	public BirthplaceFacade()
	{
		this.self = CDAFactory.eINSTANCE.createBirthplace();
	}

	public BirthplaceFacade(Birthplace self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Birthplace self)
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
		GetOrCreatePlace();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(vb, del);

			place().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace::Place))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace::GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getPlace()).filter(i1541 -> !(Set(i1541).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.10.i place\n\t\tConformance: SHALL contain exactly one [1..1] place (CONF:5396)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade> place()
	{
		return Set(self.getPlace()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade GetOrCreatePlace()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade> lastOrDefault = place().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getBirthplace_Place());
			return lastOrDefault.get();
		}
		return CreateAnotherPlace();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade CreateAnotherPlace()
	{
		Place element = CDAFactory.eINSTANCE.createPlace();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade(element);
		elementFacade.Init();
		self.setPlace(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace.PlaceFacade Place() {
		return GetOrCreatePlace();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getBirthplace_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getBirthplace_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getBirthplace_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getBirthplace_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getBirthplace_NullFlavor());
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

	public Stream<RoleClass> classCode()
	{
		return Set(self.getClassCode());
	}

	public RoleClass GetOrCreateClassCode()
	{
		Optional<RoleClass> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getBirthplace_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public RoleClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getBirthplace_ClassCode());
		RoleClass element = RoleClass.get(0);
		self.setClassCode(element);
		return element;
	}

	public RoleClass ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(RoleClass value) {
		self.setClassCode(value);
	}

}
