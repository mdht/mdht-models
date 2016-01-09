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

public class LanguageCommunicationFacade extends facade.FacadeBase {

	public LanguageCommunication self;

	public LanguageCommunicationFacade()
	{
		this.self = CDAFactory.eINSTANCE.createLanguageCommunication();
	}

	public LanguageCommunicationFacade(LanguageCommunication self)
	{
		this.self = self;
	}

	public static boolean isKindOf(LanguageCommunication self)
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
		GetOrCreateLanguageCode();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(vb, del);

			preferenceInd().forEach(x -> x.Validate(vb, del));
			proficiencyLevelCode().forEach(x -> x.Validate(vb, del));
			modeCode().forEach(x -> x.Validate(vb, del));
			languageCode().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getPreferenceInd()).count()==0) && Set(self.getPreferenceInd()).anyMatch(i1585 -> i1585.isNullFlavorUndefined())) || !(Set(self.getPreferenceInd()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.11.i preferenceInd\n\t\tConformance: MAY contain zero or one [0..1] preferenceInd (CONF:5414)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getProficiencyLevelCode()).count()==0) && Set(self.getProficiencyLevelCode()).anyMatch(i1605 -> i1605.isNullFlavorUndefined())) || !(Set(self.getProficiencyLevelCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.11.ii proficiencyLevelCode\n\t\tConformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 STATIC (CONF:9965)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined() and self.proficiencyLevelCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.proficiencyLevelCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P'))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getProficiencyLevelCode()).count()==0) && Set(self.getProficiencyLevelCode()).anyMatch(i1625 -> i1625.isNullFlavorUndefined())) || !(Set(self.getProficiencyLevelCode()).count()==0) && true && Set(self.getProficiencyLevelCode()).filter(i1628 -> Set(i1628.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.61") && (Set(i1628.getCode()).collect(Collectors.toList()).contains("E") || Set(i1628.getCode()).collect(Collectors.toList()).contains("F") || Set(i1628.getCode()).collect(Collectors.toList()).contains("G") || Set(i1628.getCode()).collect(Collectors.toList()).contains("P"))).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.11.ii proficiencyLevelCode\n\t\tConformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 STATIC (CONF:9965)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getModeCode()).count()==0) && Set(self.getModeCode()).anyMatch(i1651 -> i1651.isNullFlavorUndefined())) || !(Set(self.getModeCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.11.iii modeCode\n\t\tConformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR'))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getModeCode()).count()==0) && Set(self.getModeCode()).anyMatch(i1671 -> i1671.isNullFlavorUndefined())) || !(Set(self.getModeCode()).count()==0) && true && Set(self.getModeCode()).filter(i1674 -> Set(i1674.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.60") && (Set(i1674.getCode()).collect(Collectors.toList()).contains("ESGN") || Set(i1674.getCode()).collect(Collectors.toList()).contains("ESP") || Set(i1674.getCode()).collect(Collectors.toList()).contains("EWR") || Set(i1674.getCode()).collect(Collectors.toList()).contains("RSGN") || Set(i1674.getCode()).collect(Collectors.toList()).contains("RSP") || Set(i1674.getCode()).collect(Collectors.toList()).contains("RWR"))).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.11.iii modeCode\n\t\tConformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and  let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in  not value.code.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getLanguageCode()).count()==0) && true && Set(self.getLanguageCode()).filter(i1699 -> !(Set(i1699.getCode()).count()==0)).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.11.iv languageCode\n\t\tConformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.languageCode.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getLanguageCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.11.iv languageCode\n\t\tConformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.BLFacade> preferenceInd()
	{
		return Set(self.getPreferenceInd()).filter( x -> x instanceof BL).map( x -> (BL) x).map( x -> new facade.datatypes.BLFacade(x));
	}

	public facade.datatypes.BLFacade GetOrCreatePreferenceInd()
	{
		Optional<facade.datatypes.BLFacade> lastOrDefault = preferenceInd().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_PreferenceInd());
			return lastOrDefault.get();
		}
		return CreateAnotherPreferenceInd();
	}

	public facade.datatypes.BLFacade CreateAnotherPreferenceInd()
	{
		BL element = DatatypesFactory.eINSTANCE.createBL();
		facade.datatypes.BLFacade elementFacade = new facade.datatypes.BLFacade(element);
		elementFacade.Init();
		self.setPreferenceInd(element);
		return elementFacade;
	}

	public facade.datatypes.BLFacade PreferenceInd() {
		return GetOrCreatePreferenceInd();
	}

	public Stream<facade.datatypes.CEFacade> proficiencyLevelCode()
	{
		return Set(self.getProficiencyLevelCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateProficiencyLevelCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = proficiencyLevelCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_ProficiencyLevelCode());
			return lastOrDefault.get();
		}
		return CreateAnotherProficiencyLevelCode();
	}

	public facade.datatypes.CEFacade CreateAnotherProficiencyLevelCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setProficiencyLevelCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade ProficiencyLevelCode() {
		return GetOrCreateProficiencyLevelCode();
	}

	public Stream<facade.datatypes.CEFacade> modeCode()
	{
		return Set(self.getModeCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateModeCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = modeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_ModeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherModeCode();
	}

	public facade.datatypes.CEFacade CreateAnotherModeCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setModeCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade ModeCode() {
		return GetOrCreateModeCode();
	}

	public Stream<facade.datatypes.CSFacade> languageCode()
	{
		return Set(self.getLanguageCode()).filter( x -> x instanceof CS).map( x -> (CS) x).map( x -> new facade.datatypes.CSFacade(x));
	}

	public facade.datatypes.CSFacade GetOrCreateLanguageCode()
	{
		Optional<facade.datatypes.CSFacade> lastOrDefault = languageCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_LanguageCode());
			return lastOrDefault.get();
		}
		return CreateAnotherLanguageCode();
	}

	public facade.datatypes.CSFacade CreateAnotherLanguageCode()
	{
		CS element = DatatypesFactory.eINSTANCE.createCS();
		facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
		elementFacade.Init();
		self.setLanguageCode(element);
		return elementFacade;
	}

	public facade.datatypes.CSFacade LanguageCode() {
		return GetOrCreateLanguageCode();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLanguageCommunication_NullFlavor());
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
