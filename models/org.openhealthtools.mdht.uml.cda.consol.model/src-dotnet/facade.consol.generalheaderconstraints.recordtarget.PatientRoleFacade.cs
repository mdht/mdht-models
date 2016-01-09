using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.recordtarget
{
    public class PatientRoleFacade : facade.FacadeBase
    {

		public POCD_MT000040PatientRole self;

		public PatientRoleFacade()
		{
			this.self = new POCD_MT000040PatientRole();
		}

		public PatientRoleFacade(POCD_MT000040PatientRole self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040PatientRole self)
		{
			return true;
		}

		override public object getModelElement()
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
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{
				ValidateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(vb, del);
				ValidateGeneralHeaderConstraintsRecordTargetPatientRoleId(vb, del);
				ValidateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(vb, del);
				ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatient(vb, del);
				ValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(vb, del);

				addr().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				telecom().ForEach(x => x.Validate(vb, del));
				patient().ForEach(x => x.Validate(vb, del));
				providerOrganization().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
		}
		/**
		 * OCL: not self.addr->isEmpty()
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRoleAddr
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.addr).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a addr\n\t\tConformance: SHALL contain at least one [1..*] addr (CONF:5271)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: not self.id->isEmpty()
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRoleId
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRoleId(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.id).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.b id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:5268)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: not self.telecom->isEmpty()
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRoleTelecom
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.telecom).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.c telecom\n\t\tConformance: SHALL contain at least one [1..*] telecom (CONF:5280)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRolePatient
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatient(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = Set(self.patient).FindAll(i711 => !(Set(i711).Count==0) && true).Count==1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d patient\n\t\tConformance: SHALL contain exactly one [1..1] patient (CONF:5283)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::ProviderOrganization))->size() <= 1
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = One(Set(self.providerOrganization).FindAll(i725 => !(Set(i725).Count==0) && true).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.e providerOrganization\n\t\tConformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		public List<facade.consol.generalheaderconstraints.USRealmAddressFacade> addr()
		{
			return Set(self.addr).FindAll( x => facade.consol.generalheaderconstraints.USRealmAddressFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.USRealmAddressFacade(x));
		}

		public facade.consol.generalheaderconstraints.USRealmAddressFacade GetOrCreateAddr()
		{
			List<facade.consol.generalheaderconstraints.USRealmAddressFacade> lastOrDefault = addr();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "addr");
				return lastOrDefault.Last();
			}
			return CreateAnotherAddr();
		}

		public facade.consol.generalheaderconstraints.USRealmAddressFacade CreateAnotherAddr()
		{
			AD element = new AD();
			facade.consol.generalheaderconstraints.USRealmAddressFacade elementFacade = new facade.consol.generalheaderconstraints.USRealmAddressFacade(element);
			elementFacade.Init();
			self.addr = SetOrAdd(self.addr, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.USRealmAddressFacade Addr()		{
			return GetOrCreateAddr();
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

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade> telecom()
		{
			return Set(self.telecom).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade GetOrCreateTelecom()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade> lastOrDefault = telecom();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "telecom");
				return lastOrDefault.Last();
			}
			return CreateAnotherTelecom();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade CreateAnotherTelecom()
		{
			TEL element = new TEL();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade(element);
			elementFacade.Init();
			self.telecom = SetOrAdd(self.telecom, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.TELFacade Telecom()		{
			return GetOrCreateTelecom();
		}

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade> patient()
		{
			return Set(self.patient).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade GetOrCreatePatient()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade> lastOrDefault = patient();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "patient");
				return lastOrDefault.Last();
			}
			return CreateAnotherPatient();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade CreateAnotherPatient()
		{
			POCD_MT000040Patient element = new POCD_MT000040Patient();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade(element);
			elementFacade.Init();
			self.patient = SetOrAdd(self.patient, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.PatientFacade Patient()		{
			return GetOrCreatePatient();
		}

		public List<facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade> providerOrganization()
		{
			return Set(self.providerOrganization).FindAll( x => facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade(x));
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade GetOrCreateProviderOrganization()
		{
			List<facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade> lastOrDefault = providerOrganization();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "providerOrganization");
				return lastOrDefault.Last();
			}
			return CreateAnotherProviderOrganization();
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade CreateAnotherProviderOrganization()
		{
			POCD_MT000040Organization element = new POCD_MT000040Organization();
			facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade elementFacade = new facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade(element);
			elementFacade.Init();
			self.providerOrganization = SetOrAdd(self.providerOrganization, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.recordtarget.patientrole.ProviderOrganizationFacade ProviderOrganization()		{
			return GetOrCreateProviderOrganization();
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

		public List<RoleClass> classCode()
		{
			return Set(self.@classCode);
		}

		public RoleClass GetOrCreateClassCode()
		{
			List<RoleClass> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public RoleClass CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			RoleClass element = new RoleClass();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public RoleClass ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(RoleClass value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

}
}
