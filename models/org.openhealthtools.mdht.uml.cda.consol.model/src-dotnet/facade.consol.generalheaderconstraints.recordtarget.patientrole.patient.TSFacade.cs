using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.recordtarget.patientrole.patient
{
    public class TSFacade : facade.FacadeBase
    {

		public TS self;

		public TSFacade()
		{
			this.self = new TS();
		}

		public TSFacade(TS self)
		{
			this.self = self;
		}

		public static bool isKindOf(TS self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
		}

		/**
		 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
		 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{
				ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(vb, del);

		}
		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (not self.value.oclIsUndefined() ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::TS
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::TS::GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || !(Set(self.@value).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.2.i value\n\t\tConformance: SHALL contain exactly one [1..1] value (CONF:5299, CONF:5300)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		public List<string> value()
		{
			return Set(self.@value);
		}

		public string GetOrCreateValue()
		{
			List<string> lastOrDefault = value();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "value");
				return lastOrDefault.Last();
			}
			return CreateAnotherValue();
		}

		public string CreateAnotherValue()
		{
			MarkSpecified(self, "value");
			string element = String.Empty;
			self.@value = SetOrAdd(self.@value, element);
			return element;
		}

		public string Value()		{
			return GetOrCreateValue();
		}

		public void Value(string value)		{
			self.@value = SetOrAdd(self.@value, value);
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

}
}
