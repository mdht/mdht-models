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

public class GuardianFacade extends facade.FacadeBase {

	public Guardian self;

	public GuardianFacade()
	{
		this.self = CDAFactory.eINSTANCE.createGuardian();
	}

	public GuardianFacade(Guardian self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Guardian self)
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
		GetOrCreateGuardianPerson();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(vb, del);

			addr().forEach(x -> x.Validate(vb, del));
			code().forEach(x -> x.Validate(vb, del));
			telecom().forEach(x -> x.Validate(vb, del));
			guardianPerson().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
			guardianOrganization().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: (not code.oclIsUndefined()) and code.isNullFlavorUndefined() implies (code.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = code.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'ADOPT' or value.code = 'AUNT' or value.code = 'CHILD' or value.code = 'CHLDINLAW' or value.code = 'COUSN' or value.code = 'DOMPART' or value.code = 'FAMMEMB' or value.code = 'CHLDFOST' or value.code = 'GRNDCHILD' or value.code = 'GPARNT' or value.code = 'GRPRN' or value.code = 'GGRPRN' or value.code = 'HSIB' or value.code = 'MAUNT' or value.code = 'MCOUSN' or value.code = 'MGRPRN' or value.code = 'MGGRPRN' or value.code = 'MUNCLE' or value.code = 'NCHILD' or value.code = 'NPRN' or value.code = 'NSIB' or value.code = 'NBOR' or value.code = 'NIENEPH' or value.code = 'PRN' or value.code = 'PRNINLAW' or value.code = 'PAUNT' or value.code = 'PCOUSN' or value.code = 'PGRPRN' or value.code = 'PGGRPRN' or value.code = 'PUNCLE' or value.code = 'ROOM' or value.code = 'SIB' or value.code = 'SIBINLAW' or value.code = 'SIGOTHR' or value.code = 'SPS' or value.code = 'STEP' or value.code = 'STPPRN' or value.code = 'STPSIB' or value.code = 'UNCLE' or value.code = 'FRND' or value.code = 'RESPRSN' or value.code = 'EXCEST' or value.code = 'GUADLTM' or value.code = 'GUARD' or value.code = 'POWATT' or value.code = 'DPOWATT' or value.code = 'HPOWATT' or value.code = 'SPOWATT'))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getCode()).count()==0) && Set(self.getCode()).anyMatch(i1387 -> i1387.isNullFlavorUndefined())) || true && Set(self.getCode()).filter(i1390 -> Set(i1390.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.111") && (Set(i1390.getCode()).collect(Collectors.toList()).contains("ADOPT") || Set(i1390.getCode()).collect(Collectors.toList()).contains("AUNT") || Set(i1390.getCode()).collect(Collectors.toList()).contains("CHILD") || Set(i1390.getCode()).collect(Collectors.toList()).contains("CHLDINLAW") || Set(i1390.getCode()).collect(Collectors.toList()).contains("COUSN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("DOMPART") || Set(i1390.getCode()).collect(Collectors.toList()).contains("FAMMEMB") || Set(i1390.getCode()).collect(Collectors.toList()).contains("CHLDFOST") || Set(i1390.getCode()).collect(Collectors.toList()).contains("GRNDCHILD") || Set(i1390.getCode()).collect(Collectors.toList()).contains("GPARNT") || Set(i1390.getCode()).collect(Collectors.toList()).contains("GRPRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("GGRPRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("HSIB") || Set(i1390.getCode()).collect(Collectors.toList()).contains("MAUNT") || Set(i1390.getCode()).collect(Collectors.toList()).contains("MCOUSN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("MGRPRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("MGGRPRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("MUNCLE") || Set(i1390.getCode()).collect(Collectors.toList()).contains("NCHILD") || Set(i1390.getCode()).collect(Collectors.toList()).contains("NPRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("NSIB") || Set(i1390.getCode()).collect(Collectors.toList()).contains("NBOR") || Set(i1390.getCode()).collect(Collectors.toList()).contains("NIENEPH") || Set(i1390.getCode()).collect(Collectors.toList()).contains("PRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("PRNINLAW") || Set(i1390.getCode()).collect(Collectors.toList()).contains("PAUNT") || Set(i1390.getCode()).collect(Collectors.toList()).contains("PCOUSN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("PGRPRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("PGGRPRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("PUNCLE") || Set(i1390.getCode()).collect(Collectors.toList()).contains("ROOM") || Set(i1390.getCode()).collect(Collectors.toList()).contains("SIB") || Set(i1390.getCode()).collect(Collectors.toList()).contains("SIBINLAW") || Set(i1390.getCode()).collect(Collectors.toList()).contains("SIGOTHR") || Set(i1390.getCode()).collect(Collectors.toList()).contains("SPS") || Set(i1390.getCode()).collect(Collectors.toList()).contains("STEP") || Set(i1390.getCode()).collect(Collectors.toList()).contains("STPPRN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("STPSIB") || Set(i1390.getCode()).collect(Collectors.toList()).contains("UNCLE") || Set(i1390.getCode()).collect(Collectors.toList()).contains("FRND") || Set(i1390.getCode()).collect(Collectors.toList()).contains("RESPRSN") || Set(i1390.getCode()).collect(Collectors.toList()).contains("EXCEST") || Set(i1390.getCode()).collect(Collectors.toList()).contains("GUADLTM") || Set(i1390.getCode()).collect(Collectors.toList()).contains("GUARD") || Set(i1390.getCode()).collect(Collectors.toList()).contains("POWATT") || Set(i1390.getCode()).collect(Collectors.toList()).contains("DPOWATT") || Set(i1390.getCode()).collect(Collectors.toList()).contains("HPOWATT") || Set(i1390.getCode()).collect(Collectors.toList()).contains("SPOWATT"))).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.9.v GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty\n\t\tConformance: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC (CONF:5326)\n\t\tAnalysis: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getAddrs()).count()==0) && Set(self.getAddrs()).anyMatch(i1411 -> Set(i1411).anyMatch(i1412 -> i1412.isNullFlavorUndefined()))) || !(Set(self.getAddrs()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.9.i addr\n\t\tConformance: SHOULD contain zero or more [0..*] addr\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getCode()).count()==0) && Set(self.getCode()).anyMatch(i1433 -> i1433.isNullFlavorUndefined())) || !(Set(self.getCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.9.ii code\n\t\tConformance: SHOULD contain zero or one [0..1] code (CONF:5326)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getTelecoms()).count()==0) && Set(self.getTelecoms()).anyMatch(i1453 -> Set(i1453).anyMatch(i1454 -> i1454.isNullFlavorUndefined()))) || !(Set(self.getTelecoms()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.9.iii telecom\n\t\tConformance: MAY contain zero or more [0..*] telecom\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::Person))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getGuardianPerson()).filter(i1475 -> !(Set(i1475).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.9.iv guardianPerson\n\t\tConformance: SHALL contain exactly one [1..1] guardianPerson\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_Addr());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_Code());
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

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade> telecom()
	{
		return Set(self.getTelecoms()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade GetOrCreateTelecom()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade> lastOrDefault = telecom().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_Telecom());
			return lastOrDefault.get();
		}
		return CreateAnotherTelecom();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade CreateAnotherTelecom()
	{
		TEL element = DatatypesFactory.eINSTANCE.createTEL();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade(element);
		elementFacade.Init();
		self.getTelecoms().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.TELFacade Telecom() {
		return GetOrCreateTelecom();
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade> guardianPerson()
	{
		return Set(self.getGuardianPerson()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade GetOrCreateGuardianPerson()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade> lastOrDefault = guardianPerson().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_GuardianPerson());
			return lastOrDefault.get();
		}
		return CreateAnotherGuardianPerson();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade CreateAnotherGuardianPerson()
	{
		Person element = CDAFactory.eINSTANCE.createPerson();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade(element);
		elementFacade.Init();
		self.setGuardianPerson(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.guardian.PersonFacade GuardianPerson() {
		return GetOrCreateGuardianPerson();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_TemplateId());
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

	public Stream<facade.datatypes.IIFacade> id()
	{
		return Set(self.getIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_Id());
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

	public Stream<facade.cda.OrganizationFacade> guardianOrganization()
	{
		return Set(self.getGuardianOrganization()).filter( x -> facade.cda.OrganizationFacade.isKindOf(x)).map( x -> new facade.cda.OrganizationFacade(x));
	}

	public facade.cda.OrganizationFacade GetOrCreateGuardianOrganization()
	{
		Optional<facade.cda.OrganizationFacade> lastOrDefault = guardianOrganization().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_GuardianOrganization());
			return lastOrDefault.get();
		}
		return CreateAnotherGuardianOrganization();
	}

	public facade.cda.OrganizationFacade CreateAnotherGuardianOrganization()
	{
		Organization element = CDAFactory.eINSTANCE.createOrganization();
		facade.cda.OrganizationFacade elementFacade = new facade.cda.OrganizationFacade(element);
		elementFacade.Init();
		self.setGuardianOrganization(element);
		return elementFacade;
	}

	public facade.cda.OrganizationFacade GuardianOrganization() {
		return GetOrCreateGuardianOrganization();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_NullFlavor());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public RoleClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getGuardian_ClassCode());
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
