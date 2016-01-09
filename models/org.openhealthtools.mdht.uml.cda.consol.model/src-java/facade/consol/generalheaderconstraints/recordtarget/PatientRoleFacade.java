package facade.consol.generalheaderconstraints.recordtarget;

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

public class PatientRoleFacade extends facade.FacadeBase {

	public PatientRole self;

	public PatientRoleFacade()
	{
		this.self = CDAFactory.eINSTANCE.createPatientRole();
	}

	public PatientRoleFacade(PatientRole self)
	{
		this.self = self;
	}

	public static boolean isKindOf(PatientRole self)
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
		GetOrCreatePatient();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRoleId(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatient(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(vb, del);

			addr().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			telecom().forEach(x -> x.Validate(vb, del));
			patient().forEach(x -> x.Validate(vb, del));
			providerOrganization().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: not self.addr->isEmpty()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRoleAddr
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getAddrs()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a addr\n\t\tConformance: SHALL contain at least one [1..*] addr (CONF:5271)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id->isEmpty()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRoleId
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRoleId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getIds()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.b id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:5268)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.telecom->isEmpty()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRoleTelecom
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getTelecoms()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.c telecom\n\t\tConformance: SHALL contain at least one [1..*] telecom (CONF:5280)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRolePatient
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatient(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getPatient()).filter(i711 -> !(Set(i711).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d patient\n\t\tConformance: SHALL contain exactly one [1..1] patient (CONF:5283)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::ProviderOrganization))->size() <= 1
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getProviderOrganization()).filter(i725 -> !(Set(i725).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.e providerOrganization\n\t\tConformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_Addr());
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

	public Stream<facade.datatypes.IIFacade> id()
	{
		return Set(self.getIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_Id());
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

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade> telecom()
	{
		return Set(self.getTelecoms()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade GetOrCreateTelecom()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade> lastOrDefault = telecom().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_Telecom());
			return lastOrDefault.get();
		}
		return CreateAnotherTelecom();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade CreateAnotherTelecom()
	{
		TEL element = DatatypesFactory.eINSTANCE.createTEL();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade(element);
		elementFacade.Init();
		self.getTelecoms().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade Telecom() {
		return GetOrCreateTelecom();
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade> patient()
	{
		return Set(self.getPatient()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade GetOrCreatePatient()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade> lastOrDefault = patient().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_Patient());
			return lastOrDefault.get();
		}
		return CreateAnotherPatient();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade CreateAnotherPatient()
	{
		Patient element = CDAFactory.eINSTANCE.createPatient();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade(element);
		elementFacade.Init();
		self.setPatient(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade Patient() {
		return GetOrCreatePatient();
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade> providerOrganization()
	{
		return Set(self.getProviderOrganization()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade GetOrCreateProviderOrganization()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade> lastOrDefault = providerOrganization().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_ProviderOrganization());
			return lastOrDefault.get();
		}
		return CreateAnotherProviderOrganization();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade CreateAnotherProviderOrganization()
	{
		Organization element = CDAFactory.eINSTANCE.createOrganization();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade(element);
		elementFacade.Init();
		self.setProviderOrganization(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade ProviderOrganization() {
		return GetOrCreateProviderOrganization();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_NullFlavor());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public RoleClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatientRole_ClassCode());
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
