using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.recordtarget.patientrole
{
    public class PatientFacade : facade.FacadeBase
    {

		public POCD_MT000040Patient self;

		public PatientFacade()
		{
			this.self = new POCD_MT000040Patient();
		}

		public PatientFacade(POCD_MT000040Patient self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Patient self)
		{
			return true;
		}

		override public object getModelElement()
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
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
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

				administrativeGenderCode().ForEach(x => x.Validate(vb, del));
				birthTime().ForEach(x => x.Validate(vb, del));
				ethnicGroupCode().ForEach(x => x.Validate(vb, del));
				maritalStatusCode().ForEach(x => x.Validate(vb, del));
				name().ForEach(x => x.Validate(vb, del));
				raceCode().ForEach(x => x.Validate(vb, del));
				religiousAffiliationCode().ForEach(x => x.Validate(vb, del));
				guardian().ForEach(x => x.Validate(vb, del));
				birthplace().ForEach(x => x.Validate(vb, del));
				languageCommunication().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
		}
		/**
		 * OCL: sDTCRaceCode->notEmpty() implies not raceCode.oclIsUndefined()
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.sDTCRaceCode)) || !(Set(self.raceCode).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.12 GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode\n\t\tConformance: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode (CONF:31347)\n\t\tAnalysis: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: true
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = true;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.1 administrativeGenderCode\n\t\tConformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: not self.administrativeGenderCode.oclIsUndefined() and self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.administrativeGenderCode).Count==0) && true && Set(self.administrativeGenderCode).FindAll(i899 => Set(i899.@codeSystem).Contains("2.16.840.1.113883.5.1") && (Set(i899.@code).Contains("F") || Set(i899.@code).Contains("M") || Set(i899.@code).Contains("UN"))).Count!=0;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.1 administrativeGenderCode\n\t\tConformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: not self.birthTime.oclIsUndefined()
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.birthTime).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.2 birthTime\n\t\tConformance: SHALL contain exactly one [1..1] birthTime (CONF:5298)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined())
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.ethnicGroupCode).Count==0) && Flatten(Set(self.ethnicGroupCode).ConvertAll(i931 => i931.@nullFlavor)).Count==0) || !(Set(self.ethnicGroupCode).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.3 ethnicGroupCode\n\t\tConformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined() and self.ethnicGroupCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.ethnicGroupCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5'))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.ethnicGroupCode).Count==0) && Flatten(Set(self.ethnicGroupCode).ConvertAll(i947 => i947.@nullFlavor)).Count==0) || !(Set(self.ethnicGroupCode).Count==0) && true && Set(self.ethnicGroupCode).FindAll(i950 => Set(i950.@codeSystem).Contains("2.16.840.1.113883.6.238") && (Set(i950.@code).Contains("2135-2") || Set(i950.@code).Contains("2186-5"))).Count!=0;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.3 ethnicGroupCode\n\t\tConformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined())
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.maritalStatusCode).Count==0) && Flatten(Set(self.maritalStatusCode).ConvertAll(i969 => i969.@nullFlavor)).Count==0) || !(Set(self.maritalStatusCode).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.4 maritalStatusCode\n\t\tConformance: SHOULD contain zero or one [0..1] maritalStatusCode (CONF:5303), which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 STATIC 1\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined() and self.maritalStatusCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W'))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.maritalStatusCode).Count==0) && Flatten(Set(self.maritalStatusCode).ConvertAll(i985 => i985.@nullFlavor)).Count==0) || !(Set(self.maritalStatusCode).Count==0) && true && Set(self.maritalStatusCode).FindAll(i988 => Set(i988.@codeSystem).Contains("2.16.840.1.113883.5.2") && (Set(i988.@code).Contains("A") || Set(i988.@code).Contains("D") || Set(i988.@code).Contains("I") || Set(i988.@code).Contains("L") || Set(i988.@code).Contains("M") || Set(i988.@code).Contains("P") || Set(i988.@code).Contains("S") || Set(i988.@code).Contains("T") || Set(i988.@code).Contains("W"))).Count!=0;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.4 maritalStatusCode\n\t\tConformance: SHOULD contain zero or one [0..1] maritalStatusCode (CONF:5303), which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 STATIC 1\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: not self.name->isEmpty()
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientName
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.name).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.5 name\n\t\tConformance: SHALL contain at least one [1..*] name (CONF:5284, CONF:10411)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined())
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.raceCode).Count==0) && Flatten(Set(self.raceCode).ConvertAll(i1021 => i1021.@nullFlavor)).Count==0) || !(Set(self.raceCode).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.6 raceCode\n\t\tConformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined() and self.raceCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined())
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.raceCode).Count==0) && Flatten(Set(self.raceCode).ConvertAll(i1037 => i1037.@nullFlavor)).Count==0) || !(Set(self.raceCode).Count==0) && true && Set(self.raceCode).FindAll(i1040 => Set(i1040.@codeSystem).Contains("2.16.840.1.113883.6.238") && !(Set(i1040.@code).Count==0)).Count!=0;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.6 raceCode\n\t\tConformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined())
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.religiousAffiliationCode).Count==0) && Flatten(Set(self.religiousAffiliationCode).ConvertAll(i1059 => i1059.@nullFlavor)).Count==0) || !(Set(self.religiousAffiliationCode).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.7 religiousAffiliationCode\n\t\tConformance: MAY contain zero or one [0..1] religiousAffiliationCode (CONF:5317), which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 STATIC 1\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined() and self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined())
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.religiousAffiliationCode).Count==0) && Flatten(Set(self.religiousAffiliationCode).ConvertAll(i1075 => i1075.@nullFlavor)).Count==0) || !(Set(self.religiousAffiliationCode).Count==0) && true && Set(self.religiousAffiliationCode).FindAll(i1078 => Set(i1078.@codeSystem).Contains("2.16.840.1.113883.5.1076") && !(Set(i1078.@code).Count==0)).Count!=0;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.7 religiousAffiliationCode\n\t\tConformance: MAY contain zero or one [0..1] religiousAffiliationCode (CONF:5317), which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 STATIC 1\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCRaceCode->isEmpty())
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.sDTCRaceCode).Count==0) && Set(self.sDTCRaceCode).Exists(i1097 => Set(i1097.@nullFlavor).Count==0)) || !(Set(self.sDTCRaceCode).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.8 sDTCRaceCode\n\t\tConformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and  let value : datatypes::CE = element.oclAsType(datatypes::CE) in  value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(!(Set(self.sDTCRaceCode).Count==0) && Set(self.sDTCRaceCode).Exists(i1113 => Set(i1113.@nullFlavor).Count==0)) || Set(self.sDTCRaceCode).TrueForAll(i1114 => !(Set(i1114).Count==0) && true && Set(i1114).FindAll(i1117 => Set(i1117.@codeSystem).Contains("2.16.840.1.113883.6.238") && !(Set(i1117.@code).Count==0)).Count!=0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.8 sDTCRaceCode\n\t\tConformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = One(Set(self.guardian).FindAll(i1137 => !(Set(i1137).Count==0) && true).Count)>=0;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.9 guardian\n\t\tConformance: MAY contain zero or more [0..*] guardian (CONF:5325)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = One(Set(self.birthplace).FindAll(i1155 => !(Set(i1155).Count==0) && true).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.10 birthplace\n\t\tConformance: MAY contain zero or one [0..1] birthplace (CONF:5395)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = One(Set(self.languageCommunication).FindAll(i1173 => !(Set(i1173).Count==0) && true).Count)>=0;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.11 languageCommunication\n\t\tConformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:5406)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		public List<facade.datatypes.CEFacade> administrativeGenderCode()
		{
			return Set(self.administrativeGenderCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateAdministrativeGenderCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = administrativeGenderCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "administrativeGenderCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherAdministrativeGenderCode();
		}

		public facade.datatypes.CEFacade CreateAnotherAdministrativeGenderCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.administrativeGenderCode = SetOrAdd(self.administrativeGenderCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade AdministrativeGenderCode()		{
			return GetOrCreateAdministrativeGenderCode();
		}

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade> birthTime()
		{
			return Set(self.birthTime).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade GetOrCreateBirthTime()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade> lastOrDefault = birthTime();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "birthTime");
				return lastOrDefault.Last();
			}
			return CreateAnotherBirthTime();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade CreateAnotherBirthTime()
		{
			TS element = new TS();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade(element);
			elementFacade.Init();
			self.birthTime = SetOrAdd(self.birthTime, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.TSFacade BirthTime()		{
			return GetOrCreateBirthTime();
		}

		public List<facade.datatypes.CEFacade> ethnicGroupCode()
		{
			return Set(self.ethnicGroupCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateEthnicGroupCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = ethnicGroupCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "ethnicGroupCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherEthnicGroupCode();
		}

		public facade.datatypes.CEFacade CreateAnotherEthnicGroupCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.ethnicGroupCode = SetOrAdd(self.ethnicGroupCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade EthnicGroupCode()		{
			return GetOrCreateEthnicGroupCode();
		}

		public List<facade.datatypes.CEFacade> maritalStatusCode()
		{
			return Set(self.maritalStatusCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateMaritalStatusCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = maritalStatusCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "maritalStatusCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherMaritalStatusCode();
		}

		public facade.datatypes.CEFacade CreateAnotherMaritalStatusCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.maritalStatusCode = SetOrAdd(self.maritalStatusCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade MaritalStatusCode()		{
			return GetOrCreateMaritalStatusCode();
		}

		public List<facade.consol.generalheaderconstraints.USRealmPatientNameFacade> name()
		{
			return Set(self.name).FindAll( x => facade.consol.generalheaderconstraints.USRealmPatientNameFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.USRealmPatientNameFacade(x));
		}

		public facade.consol.generalheaderconstraints.USRealmPatientNameFacade GetOrCreateName()
		{
			List<facade.consol.generalheaderconstraints.USRealmPatientNameFacade> lastOrDefault = name();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "name");
				return lastOrDefault.Last();
			}
			return CreateAnotherName();
		}

		public facade.consol.generalheaderconstraints.USRealmPatientNameFacade CreateAnotherName()
		{
			PN element = new PN();
			facade.consol.generalheaderconstraints.USRealmPatientNameFacade elementFacade = new facade.consol.generalheaderconstraints.USRealmPatientNameFacade(element);
			elementFacade.Init();
			self.name = SetOrAdd(self.name, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.USRealmPatientNameFacade Name()		{
			return GetOrCreateName();
		}

		public List<facade.datatypes.CEFacade> raceCode()
		{
			return Set(self.raceCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateRaceCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = raceCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "raceCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherRaceCode();
		}

		public facade.datatypes.CEFacade CreateAnotherRaceCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.raceCode = SetOrAdd(self.raceCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade RaceCode()		{
			return GetOrCreateRaceCode();
		}

		public List<facade.datatypes.CEFacade> religiousAffiliationCode()
		{
			return Set(self.religiousAffiliationCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateReligiousAffiliationCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = religiousAffiliationCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "religiousAffiliationCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherReligiousAffiliationCode();
		}

		public facade.datatypes.CEFacade CreateAnotherReligiousAffiliationCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.religiousAffiliationCode = SetOrAdd(self.religiousAffiliationCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade ReligiousAffiliationCode()		{
			return GetOrCreateReligiousAffiliationCode();
		}

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade> guardian()
		{
			return Set(self.guardian).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade GetOrCreateGuardian()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade> lastOrDefault = guardian();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "guardian");
				return lastOrDefault.Last();
			}
			return CreateAnotherGuardian();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade CreateAnotherGuardian()
		{
			POCD_MT000040Guardian element = new POCD_MT000040Guardian();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade(element);
			elementFacade.Init();
			self.guardian = SetOrAdd(self.guardian, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.GuardianFacade Guardian()		{
			return GetOrCreateGuardian();
		}

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade> birthplace()
		{
			return Set(self.birthplace).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade GetOrCreateBirthplace()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade> lastOrDefault = birthplace();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "birthplace");
				return lastOrDefault.Last();
			}
			return CreateAnotherBirthplace();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade CreateAnotherBirthplace()
		{
			POCD_MT000040Birthplace element = new POCD_MT000040Birthplace();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade(element);
			elementFacade.Init();
			self.birthplace = SetOrAdd(self.birthplace, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.BirthplaceFacade Birthplace()		{
			return GetOrCreateBirthplace();
		}

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade> languageCommunication()
		{
			return Set(self.languageCommunication).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade GetOrCreateLanguageCommunication()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade> lastOrDefault = languageCommunication();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "languageCommunication");
				return lastOrDefault.Last();
			}
			return CreateAnotherLanguageCommunication();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade CreateAnotherLanguageCommunication()
		{
			POCD_MT000040LanguageCommunication element = new POCD_MT000040LanguageCommunication();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade(element);
			elementFacade.Init();
			self.languageCommunication = SetOrAdd(self.languageCommunication, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.LanguageCommunicationFacade LanguageCommunication()		{
			return GetOrCreateLanguageCommunication();
		}

		public List<facade.datatypes.CSFacade> realmCode()
		{
			return Set(self.realmCode).FindAll( x => x is CS).ConvertAll( x => x as CS).ConvertAll( x => new facade.datatypes.CSFacade(x));
		}

		public facade.datatypes.CSFacade GetOrCreateRealmCode()
		{
			List<facade.datatypes.CSFacade> lastOrDefault = realmCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "realmCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherRealmCode();
		}

		public facade.datatypes.CSFacade CreateAnotherRealmCode()
		{
			CS element = new CS();
			facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
			elementFacade.Init();
			self.realmCode = SetOrAdd(self.realmCode, element);
			return elementFacade;
		}

		public facade.datatypes.CSFacade RealmCode()		{
			return GetOrCreateRealmCode();
		}

		public List<facade.cda.InfrastructureRootTypeIdFacade> typeId()
		{
			return Set(self.typeId).FindAll( x => facade.cda.InfrastructureRootTypeIdFacade.isKindOf(x)).ConvertAll( x => new facade.cda.InfrastructureRootTypeIdFacade(x));
		}

		public facade.cda.InfrastructureRootTypeIdFacade GetOrCreateTypeId()
		{
			List<facade.cda.InfrastructureRootTypeIdFacade> lastOrDefault = typeId();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "typeId");
				return lastOrDefault.Last();
			}
			return CreateAnotherTypeId();
		}

		public facade.cda.InfrastructureRootTypeIdFacade CreateAnotherTypeId()
		{
			POCD_MT000040InfrastructureRoottypeId element = new POCD_MT000040InfrastructureRoottypeId();
			facade.cda.InfrastructureRootTypeIdFacade elementFacade = new facade.cda.InfrastructureRootTypeIdFacade(element);
			elementFacade.Init();
			self.typeId = SetOrAdd(self.typeId, element);
			return elementFacade;
		}

		public facade.cda.InfrastructureRootTypeIdFacade TypeId()		{
			return GetOrCreateTypeId();
		}

		public List<facade.datatypes.IIFacade> templateId()
		{
			return Set(self.templateId).FindAll( x => x is II).ConvertAll( x => x as II).ConvertAll( x => new facade.datatypes.IIFacade(x));
		}

		public facade.datatypes.IIFacade GetOrCreateTemplateId()
		{
			List<facade.datatypes.IIFacade> lastOrDefault = templateId();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "templateId");
				return lastOrDefault.Last();
			}
			return CreateAnotherTemplateId();
		}

		public facade.datatypes.IIFacade CreateAnotherTemplateId()
		{
			II element = new II();
			facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
			elementFacade.Init();
			self.templateId = SetOrAdd(self.templateId, element);
			return elementFacade;
		}

		public facade.datatypes.IIFacade TemplateId()		{
			return GetOrCreateTemplateId();
		}

		public List<facade.datatypes.IIFacade> id()
		{
			return Set(self.id).FindAll( x => x is II).ConvertAll( x => x as II).ConvertAll( x => new facade.datatypes.IIFacade(x));
		}

		public facade.datatypes.IIFacade GetOrCreateId()
		{
			List<facade.datatypes.IIFacade> lastOrDefault = id();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "id");
				return lastOrDefault.Last();
			}
			return CreateAnotherId();
		}

		public facade.datatypes.IIFacade CreateAnotherId()
		{
			II element = new II();
			facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
			elementFacade.Init();
			self.id = SetOrAdd(self.id, element);
			return elementFacade;
		}

		public facade.datatypes.IIFacade Id()		{
			return GetOrCreateId();
		}

		public List<NullFlavor> nullFlavor()
		{
			return Set(self.@nullFlavor);
		}

		public NullFlavor GetOrCreateNullFlavor()
		{
			List<NullFlavor> lastOrDefault = nullFlavor();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "nullFlavor");
				return lastOrDefault.Last();
			}
			return CreateAnotherNullFlavor();
		}

		public NullFlavor CreateAnotherNullFlavor()
		{
			MarkSpecified(self, "nullFlavor");
			NullFlavor element = new NullFlavor();
			self.@nullFlavor = SetOrAdd(self.@nullFlavor, element);
			return element;
		}

		public NullFlavor NullFlavor()		{
			return GetOrCreateNullFlavor();
		}

		public void NullFlavor(NullFlavor value)		{
			self.@nullFlavor = SetOrAdd(self.@nullFlavor, value);
		}

		public List<EntityClass> classCode()
		{
			return Set(self.@classCode);
		}

		public EntityClass GetOrCreateClassCode()
		{
			List<EntityClass> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public EntityClass CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			EntityClass element = new EntityClass();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public EntityClass ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(EntityClass value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

		public List<EntityDeterminer> determinerCode()
		{
			return Set(self.@determinerCode);
		}

		public EntityDeterminer GetOrCreateDeterminerCode()
		{
			List<EntityDeterminer> lastOrDefault = determinerCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "determinerCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherDeterminerCode();
		}

		public EntityDeterminer CreateAnotherDeterminerCode()
		{
			MarkSpecified(self, "determinerCode");
			EntityDeterminer element = new EntityDeterminer();
			self.@determinerCode = SetOrAdd(self.@determinerCode, element);
			return element;
		}

		public EntityDeterminer DeterminerCode()		{
			return GetOrCreateDeterminerCode();
		}

		public void DeterminerCode(EntityDeterminer value)		{
			self.@determinerCode = SetOrAdd(self.@determinerCode, value);
		}

}
}
