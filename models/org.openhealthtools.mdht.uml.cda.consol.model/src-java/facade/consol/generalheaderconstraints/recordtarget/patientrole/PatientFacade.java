package facade.consol.generalheaderconstraints.recordtarget.patientrole;

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

public class PatientFacade extends facade.FacadeBase {

	public Patient self;

	public PatientFacade()
	{
		this.self = CDAFactory.eINSTANCE.createPatient();
	}

	public PatientFacade(Patient self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Patient self)
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
		GetOrCreateAdministrativeGenderCode();
		GetOrCreateBirthTime();
		GetOrCreateName();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(vb, del);
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(vb, del);

			administrativeGenderCode().forEach(x -> x.Validate(vb, del));
			birthTime().forEach(x -> x.Validate(vb, del));
			ethnicGroupCode().forEach(x -> x.Validate(vb, del));
			maritalStatusCode().forEach(x -> x.Validate(vb, del));
			name().forEach(x -> x.Validate(vb, del));
			raceCode().forEach(x -> x.Validate(vb, del));
			religiousAffiliationCode().forEach(x -> x.Validate(vb, del));
			guardian().forEach(x -> x.Validate(vb, del));
			birthplace().forEach(x -> x.Validate(vb, del));
			languageCommunication().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			id().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: sDTCRaceCode->notEmpty() implies not raceCode.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getSDTCRaceCodes())) || !(Set(self.getRaceCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.12 GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode\n\t\tConformance: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode (CONF:31347)\n\t\tAnalysis: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: true
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = true;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.1 administrativeGenderCode\n\t\tConformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.administrativeGenderCode.oclIsUndefined() and self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getAdministrativeGenderCode()).count()==0) && true && Set(self.getAdministrativeGenderCode()).filter(i923 -> Set(i923.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.1") && (Set(i923.getCode()).collect(Collectors.toList()).contains("F") || Set(i923.getCode()).collect(Collectors.toList()).contains("M") || Set(i923.getCode()).collect(Collectors.toList()).contains("UN"))).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.1 administrativeGenderCode\n\t\tConformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.birthTime.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getBirthTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.2 birthTime\n\t\tConformance: SHALL contain exactly one [1..1] birthTime (CONF:5298)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getEthnicGroupCode()).count()==0) && Set(self.getEthnicGroupCode()).anyMatch(i955 -> i955.isNullFlavorUndefined())) || !(Set(self.getEthnicGroupCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.3 ethnicGroupCode\n\t\tConformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined() and self.ethnicGroupCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.ethnicGroupCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5'))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getEthnicGroupCode()).count()==0) && Set(self.getEthnicGroupCode()).anyMatch(i971 -> i971.isNullFlavorUndefined())) || !(Set(self.getEthnicGroupCode()).count()==0) && true && Set(self.getEthnicGroupCode()).filter(i974 -> Set(i974.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.6.238") && (Set(i974.getCode()).collect(Collectors.toList()).contains("2135-2") || Set(i974.getCode()).collect(Collectors.toList()).contains("2186-5"))).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.3 ethnicGroupCode\n\t\tConformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getMaritalStatusCode()).count()==0) && Set(self.getMaritalStatusCode()).anyMatch(i993 -> i993.isNullFlavorUndefined())) || !(Set(self.getMaritalStatusCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.4 maritalStatusCode\n\t\tConformance: SHOULD contain zero or one [0..1] maritalStatusCode (CONF:5303), which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 STATIC 1\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined() and self.maritalStatusCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W'))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getMaritalStatusCode()).count()==0) && Set(self.getMaritalStatusCode()).anyMatch(i1009 -> i1009.isNullFlavorUndefined())) || !(Set(self.getMaritalStatusCode()).count()==0) && true && Set(self.getMaritalStatusCode()).filter(i1012 -> Set(i1012.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.2") && (Set(i1012.getCode()).collect(Collectors.toList()).contains("A") || Set(i1012.getCode()).collect(Collectors.toList()).contains("D") || Set(i1012.getCode()).collect(Collectors.toList()).contains("I") || Set(i1012.getCode()).collect(Collectors.toList()).contains("L") || Set(i1012.getCode()).collect(Collectors.toList()).contains("M") || Set(i1012.getCode()).collect(Collectors.toList()).contains("P") || Set(i1012.getCode()).collect(Collectors.toList()).contains("S") || Set(i1012.getCode()).collect(Collectors.toList()).contains("T") || Set(i1012.getCode()).collect(Collectors.toList()).contains("W"))).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.4 maritalStatusCode\n\t\tConformance: SHOULD contain zero or one [0..1] maritalStatusCode (CONF:5303), which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 STATIC 1\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.name->isEmpty()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientName
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getNames()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.5 name\n\t\tConformance: SHALL contain at least one [1..*] name (CONF:5284, CONF:10411)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getRaceCode()).count()==0) && Set(self.getRaceCode()).anyMatch(i1045 -> i1045.isNullFlavorUndefined())) || !(Set(self.getRaceCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.6 raceCode\n\t\tConformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined() and self.raceCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getRaceCode()).count()==0) && Set(self.getRaceCode()).anyMatch(i1061 -> i1061.isNullFlavorUndefined())) || !(Set(self.getRaceCode()).count()==0) && true && Set(self.getRaceCode()).filter(i1064 -> Set(i1064.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.6.238") && !(Set(i1064.getCode()).count()==0)).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.6 raceCode\n\t\tConformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getReligiousAffiliationCode()).count()==0) && Set(self.getReligiousAffiliationCode()).anyMatch(i1083 -> i1083.isNullFlavorUndefined())) || !(Set(self.getReligiousAffiliationCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.7 religiousAffiliationCode\n\t\tConformance: MAY contain zero or one [0..1] religiousAffiliationCode (CONF:5317), which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 STATIC 1\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined() and self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getReligiousAffiliationCode()).count()==0) && Set(self.getReligiousAffiliationCode()).anyMatch(i1099 -> i1099.isNullFlavorUndefined())) || !(Set(self.getReligiousAffiliationCode()).count()==0) && true && Set(self.getReligiousAffiliationCode()).filter(i1102 -> Set(i1102.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.1076") && !(Set(i1102.getCode()).count()==0)).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.7 religiousAffiliationCode\n\t\tConformance: MAY contain zero or one [0..1] religiousAffiliationCode (CONF:5317), which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 STATIC 1\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCRaceCode->isEmpty())
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getSDTCRaceCodes()).count()==0) && Set(self.getSDTCRaceCodes()).anyMatch(i1121 -> Set(i1121).anyMatch(i1122 -> i1122.isNullFlavorUndefined()))) || !(Set(self.getSDTCRaceCodes()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.8 sDTCRaceCode\n\t\tConformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = element.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(!(Set(self.getSDTCRaceCodes()).count()==0) && Set(self.getSDTCRaceCodes()).anyMatch(i1139 -> Set(i1139).anyMatch(i1140 -> i1140.isNullFlavorUndefined()))) || Set(self.getSDTCRaceCodes()).allMatch(i1141 -> !(Set(i1141).count()==0) && true && Set(i1141).filter(i1144 -> Set(i1144.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.6.238") && !(Set(i1144.getCode()).count()==0)).count()!=0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.8 sDTCRaceCode\n\t\tConformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getGuardians()).filter(i1165 -> !(Set(i1165).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.9 guardian\n\t\tConformance: MAY contain zero or more [0..*] guardian (CONF:5325)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getBirthplace()).filter(i1183 -> !(Set(i1183).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.10 birthplace\n\t\tConformance: MAY contain zero or one [0..1] birthplace (CONF:5395)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = One(Set(self.getLanguageCommunications()).filter(i1201 -> !(Set(i1201).count()==0) && true).count())>=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.11 languageCommunication\n\t\tConformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:5406)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.CEFacade> administrativeGenderCode()
	{
		return Set(self.getAdministrativeGenderCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateAdministrativeGenderCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = administrativeGenderCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_AdministrativeGenderCode());
			return lastOrDefault.get();
		}
		return CreateAnotherAdministrativeGenderCode();
	}

	public facade.datatypes.CEFacade CreateAnotherAdministrativeGenderCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setAdministrativeGenderCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade AdministrativeGenderCode() {
		return GetOrCreateAdministrativeGenderCode();
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade> birthTime()
	{
		return Set(self.getBirthTime()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade GetOrCreateBirthTime()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade> lastOrDefault = birthTime().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_BirthTime());
			return lastOrDefault.get();
		}
		return CreateAnotherBirthTime();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade CreateAnotherBirthTime()
	{
		TS element = DatatypesFactory.eINSTANCE.createTS();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade(element);
		elementFacade.Init();
		self.setBirthTime(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade BirthTime() {
		return GetOrCreateBirthTime();
	}

	public Stream<facade.datatypes.CEFacade> ethnicGroupCode()
	{
		return Set(self.getEthnicGroupCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateEthnicGroupCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = ethnicGroupCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_EthnicGroupCode());
			return lastOrDefault.get();
		}
		return CreateAnotherEthnicGroupCode();
	}

	public facade.datatypes.CEFacade CreateAnotherEthnicGroupCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setEthnicGroupCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade EthnicGroupCode() {
		return GetOrCreateEthnicGroupCode();
	}

	public Stream<facade.datatypes.CEFacade> maritalStatusCode()
	{
		return Set(self.getMaritalStatusCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateMaritalStatusCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = maritalStatusCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_MaritalStatusCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMaritalStatusCode();
	}

	public facade.datatypes.CEFacade CreateAnotherMaritalStatusCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setMaritalStatusCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade MaritalStatusCode() {
		return GetOrCreateMaritalStatusCode();
	}

	public Stream<facade.consol.generalheaderconstraints.USRealmPatientNameFacade> name()
	{
		return Set(self.getNames()).filter( x -> facade.consol.generalheaderconstraints.USRealmPatientNameFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.USRealmPatientNameFacade(x));
	}

	public facade.consol.generalheaderconstraints.USRealmPatientNameFacade GetOrCreateName()
	{
		Optional<facade.consol.generalheaderconstraints.USRealmPatientNameFacade> lastOrDefault = name().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_Name());
			return lastOrDefault.get();
		}
		return CreateAnotherName();
	}

	public facade.consol.generalheaderconstraints.USRealmPatientNameFacade CreateAnotherName()
	{
		PN element = DatatypesFactory.eINSTANCE.createPN();
		facade.consol.generalheaderconstraints.USRealmPatientNameFacade elementFacade = new facade.consol.generalheaderconstraints.USRealmPatientNameFacade(element);
		elementFacade.Init();
		self.getNames().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.USRealmPatientNameFacade Name() {
		return GetOrCreateName();
	}

	public Stream<facade.datatypes.CEFacade> raceCode()
	{
		return Set(self.getRaceCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateRaceCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = raceCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_RaceCode());
			return lastOrDefault.get();
		}
		return CreateAnotherRaceCode();
	}

	public facade.datatypes.CEFacade CreateAnotherRaceCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setRaceCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade RaceCode() {
		return GetOrCreateRaceCode();
	}

	public Stream<facade.datatypes.CEFacade> religiousAffiliationCode()
	{
		return Set(self.getReligiousAffiliationCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateReligiousAffiliationCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = religiousAffiliationCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_ReligiousAffiliationCode());
			return lastOrDefault.get();
		}
		return CreateAnotherReligiousAffiliationCode();
	}

	public facade.datatypes.CEFacade CreateAnotherReligiousAffiliationCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setReligiousAffiliationCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade ReligiousAffiliationCode() {
		return GetOrCreateReligiousAffiliationCode();
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade> guardian()
	{
		return Set(self.getGuardians()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade GetOrCreateGuardian()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade> lastOrDefault = guardian().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_Guardian());
			return lastOrDefault.get();
		}
		return CreateAnotherGuardian();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade CreateAnotherGuardian()
	{
		Guardian element = CDAFactory.eINSTANCE.createGuardian();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade(element);
		elementFacade.Init();
		self.getGuardians().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade Guardian() {
		return GetOrCreateGuardian();
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade> birthplace()
	{
		return Set(self.getBirthplace()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade GetOrCreateBirthplace()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade> lastOrDefault = birthplace().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_Birthplace());
			return lastOrDefault.get();
		}
		return CreateAnotherBirthplace();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade CreateAnotherBirthplace()
	{
		Birthplace element = CDAFactory.eINSTANCE.createBirthplace();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade(element);
		elementFacade.Init();
		self.setBirthplace(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade Birthplace() {
		return GetOrCreateBirthplace();
	}

	public Stream<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade> languageCommunication()
	{
		return Set(self.getLanguageCommunications()).filter( x -> facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade(x));
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade GetOrCreateLanguageCommunication()
	{
		Optional<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade> lastOrDefault = languageCommunication().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_LanguageCommunication());
			return lastOrDefault.get();
		}
		return CreateAnotherLanguageCommunication();
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade CreateAnotherLanguageCommunication()
	{
		LanguageCommunication element = CDAFactory.eINSTANCE.createLanguageCommunication();
		facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade(element);
		elementFacade.Init();
		self.getLanguageCommunications().add(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade LanguageCommunication() {
		return GetOrCreateLanguageCommunication();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_TemplateId());
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
		return Set(self.getId()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_Id());
			return lastOrDefault.get();
		}
		return CreateAnotherId();
	}

	public facade.datatypes.IIFacade CreateAnotherId()
	{
		II element = DatatypesFactory.eINSTANCE.createII();
		facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
		elementFacade.Init();
		self.setId(element);
		return elementFacade;
	}

	public facade.datatypes.IIFacade Id() {
		return GetOrCreateId();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_NullFlavor());
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

	public Stream<EntityClass> classCode()
	{
		return Set(self.getClassCode());
	}

	public EntityClass GetOrCreateClassCode()
	{
		Optional<EntityClass> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public EntityClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_ClassCode());
		EntityClass element = EntityClass.get(0);
		self.setClassCode(element);
		return element;
	}

	public EntityClass ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(EntityClass value) {
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_DeterminerCode());
			return lastOrDefault.get();
		}
		return CreateAnotherDeterminerCode();
	}

	public EntityDeterminer CreateAnotherDeterminerCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPatient_DeterminerCode());
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
