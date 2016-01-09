using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints.recordtarget.patientrole
{
    public class TELFacade : facade.FacadeBase
    {

		public TEL self;

		public TELFacade()
		{
			this.self = new TEL();
		}

		public TELFacade(TEL self)
		{
			this.self = self;
		}

		public static bool isKindOf(TEL self)
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
		 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/telecom
		 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/telecom
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{
				ValidateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(vb, del);

				useablePeriod().ForEach(x => x.Validate(vb, del));
		}
		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/telecom
		 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::TEL
		 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::TEL::GeneralHeaderConstraintsRecordTargetPatientRoleTELUse
		 */
		public bool ValidateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || Set(self.@use).Count==0 || One(Set(self.@use).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.c.1 use\n\t\tConformance: SHOULD contain zero or one [0..1] @use\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		public List<TelecommunicationAddressUse> use()
		{
			return Set(self.@use);
		}

		public TelecommunicationAddressUse GetOrCreateUse()
		{
			List<TelecommunicationAddressUse> lastOrDefault = use();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "use");
				return lastOrDefault.Last();
			}
			return CreateAnotherUse();
		}

		public TelecommunicationAddressUse CreateAnotherUse()
		{
			MarkSpecified(self, "use");
			TelecommunicationAddressUse element = new TelecommunicationAddressUse();
			self.@use = SetOrAdd(self.@use, element);
			return element;
		}

		public TelecommunicationAddressUse Use()		{
			return GetOrCreateUse();
		}

		public void Use(TelecommunicationAddressUse value)		{
			self.@use = SetOrAdd(self.@use, value);
		}

		public List<facade.datatypes.SXCM_TSFacade> useablePeriod()
		{
			return Set(self.useablePeriod).FindAll( x => x is SXCM_TS).ConvertAll( x => x as SXCM_TS).ConvertAll( x => new facade.datatypes.SXCM_TSFacade(x));
		}

		public facade.datatypes.SXCM_TSFacade GetOrCreateUseablePeriod()
		{
			List<facade.datatypes.SXCM_TSFacade> lastOrDefault = useablePeriod();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "useablePeriod");
				return lastOrDefault.Last();
			}
			return CreateAnotherUseablePeriod();
		}

		public facade.datatypes.SXCM_TSFacade CreateAnotherUseablePeriod()
		{
			SXCM_TS element = new SXCM_TS();
			facade.datatypes.SXCM_TSFacade elementFacade = new facade.datatypes.SXCM_TSFacade(element);
			elementFacade.Init();
			self.useablePeriod = SetOrAdd(self.useablePeriod, element);
			return elementFacade;
		}

		public facade.datatypes.SXCM_TSFacade UseablePeriod()		{
			return GetOrCreateUseablePeriod();
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
