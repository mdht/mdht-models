using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class USRealmPatientNameFacade : facade.FacadeBase
    {

		public PN self;

		public USRealmPatientNameFacade()
		{
			this.self = new PN();
		}

		public USRealmPatientNameFacade(PN self)
		{
			this.self = self;
		}

		public static bool isKindOf(PN self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateFamily();
			GetOrCreateGiven();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{
				ValidateGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmPatientNameFamily(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmPatientNameGiven(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmPatientNamePrefix(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmPatientNameSuffix(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmPatientNameUse(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmPatientNameUseP(vb, del);

				family().ForEach(x => x.Validate(vb, del));
				given().ForEach(x => x.Validate(vb, del));
				prefix().ForEach(x => x.Validate(vb, del));
				suffix().ForEach(x => x.Validate(vb, del));
				delimiter().ForEach(x => x.Validate(vb, del));
				validTime().ForEach(x => x.Validate(vb, del));
		}
		/**
		 * OCL: getText(true)=''
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = Flatten(Set(self).ConvertAll(i1207 => getText(i1207, true))).Contains("");
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5 USRealmHeader\n\t\tConformance: \n\t\tAnalysis: US Realm Patient Name SHALL NOT contain any mixed content other than whitespace\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameFamily
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmPatientNameFamily(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || One(Set(self.family).Count)==1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.5.i family\n\t\tConformance: SHALL contain exactly one [1..1] family (CONF:7159, CONF:7160)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameGiven
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmPatientNameGiven(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || !(Set(self.given).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.5.ii given\n\t\tConformance: SHALL contain at least one [1..*] given (CONF:7157)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNamePrefix
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmPatientNamePrefix(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || !(!(Set(self.prefix).Count==0) && Set(self.prefix).Exists(i1261 => Set(i1261.@nullFlavor).Count==0)) || !(Set(self.prefix).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.5.iii prefix\n\t\tConformance: MAY contain zero or more [0..*] prefix (CONF:7155)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameSuffix
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmPatientNameSuffix(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || !(!(Set(self.suffix).Count==0) && Set(self.suffix).Exists(i1281 => Set(i1281.@nullFlavor).Count==0)) || One(Set(self.suffix).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.5.iv suffix\n\t\tConformance: MAY contain zero or one [0..1] suffix (CONF:7161)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::EntityNameUse) and  let value : vocab::EntityNameUse = element.oclAsType(vocab::EntityNameUse) in  value = vocab::EntityNameUse::A or value = vocab::EntityNameUse::ABC or value = vocab::EntityNameUse::ASGN or value = vocab::EntityNameUse::C or value = vocab::EntityNameUse::I or value = vocab::EntityNameUse::IDE or value = vocab::EntityNameUse::L or value = vocab::EntityNameUse::P or value = vocab::EntityNameUse::PHON or value = vocab::EntityNameUse::R or value = vocab::EntityNameUse::SNDX or value = vocab::EntityNameUse::SRCH or value = vocab::EntityNameUse::SYL)) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameUse
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmPatientNameUse(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || Set(self.@use).Count==0 || Set(self.@use).TrueForAll(i1301 => !(Set(i1301).Count==0) && true && Set(i1301).FindAll(i1304 => Set(i1304).Contains(EntityNameUse.A) || Set(i1304).Contains(EntityNameUse.ABC) || Set(i1304).Contains(EntityNameUse.ASGN) || Set(i1304).Contains(EntityNameUse.C) || Set(i1304).Contains(EntityNameUse.I) || Set(i1304).Contains(EntityNameUse.IDE) || Set(i1304).Contains(EntityNameUse.L) || Set(i1304).Contains(EntityNameUse.P) || Set(i1304).Contains(EntityNameUse.PHON) || Set(i1304).Contains(EntityNameUse.R) || Set(i1304).Contains(EntityNameUse.SNDX) || Set(i1304).Contains(EntityNameUse.SRCH) || Set(i1304).Contains(EntityNameUse.SYL)).Count!=0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.5.v use\n\t\tConformance: MAY contain zero or one [0..1] @use (CONF:7154), which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameUseP
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmPatientNameUseP(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || Set(self.@use).Count==0 || One(Set(self.@use).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.d.5.v use\n\t\tConformance: MAY contain zero or one [0..1] @use (CONF:7154), which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		public List<facade.datatypes.ENXPFacade> family()
		{
			return Set(self.family).FindAll( x => x is enfamily).ConvertAll( x => x as enfamily).ConvertAll( x => new facade.datatypes.ENXPFacade(x));
		}

		public facade.datatypes.ENXPFacade GetOrCreateFamily()
		{
			List<facade.datatypes.ENXPFacade> lastOrDefault = family();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "family");
				return lastOrDefault.Last();
			}
			return CreateAnotherFamily();
		}

		public facade.datatypes.ENXPFacade CreateAnotherFamily()
		{
			enfamily element = new enfamily();
			facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
			elementFacade.Init();
			self.family = SetOrAdd(self.family, element);
			return elementFacade;
		}

		public facade.datatypes.ENXPFacade Family()		{
			return GetOrCreateFamily();
		}

		public List<facade.datatypes.ENXPFacade> given()
		{
			return Set(self.given).FindAll( x => x is engiven).ConvertAll( x => x as engiven).ConvertAll( x => new facade.datatypes.ENXPFacade(x));
		}

		public facade.datatypes.ENXPFacade GetOrCreateGiven()
		{
			List<facade.datatypes.ENXPFacade> lastOrDefault = given();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "given");
				return lastOrDefault.Last();
			}
			return CreateAnotherGiven();
		}

		public facade.datatypes.ENXPFacade CreateAnotherGiven()
		{
			engiven element = new engiven();
			facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
			elementFacade.Init();
			self.given = SetOrAdd(self.given, element);
			return elementFacade;
		}

		public facade.datatypes.ENXPFacade Given()		{
			return GetOrCreateGiven();
		}

		public List<facade.datatypes.ENXPFacade> prefix()
		{
			return Set(self.prefix).FindAll( x => x is enprefix).ConvertAll( x => x as enprefix).ConvertAll( x => new facade.datatypes.ENXPFacade(x));
		}

		public facade.datatypes.ENXPFacade GetOrCreatePrefix()
		{
			List<facade.datatypes.ENXPFacade> lastOrDefault = prefix();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "prefix");
				return lastOrDefault.Last();
			}
			return CreateAnotherPrefix();
		}

		public facade.datatypes.ENXPFacade CreateAnotherPrefix()
		{
			enprefix element = new enprefix();
			facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
			elementFacade.Init();
			self.prefix = SetOrAdd(self.prefix, element);
			return elementFacade;
		}

		public facade.datatypes.ENXPFacade Prefix()		{
			return GetOrCreatePrefix();
		}

		public List<facade.datatypes.ENXPFacade> suffix()
		{
			return Set(self.suffix).FindAll( x => x is ensuffix).ConvertAll( x => x as ensuffix).ConvertAll( x => new facade.datatypes.ENXPFacade(x));
		}

		public facade.datatypes.ENXPFacade GetOrCreateSuffix()
		{
			List<facade.datatypes.ENXPFacade> lastOrDefault = suffix();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "suffix");
				return lastOrDefault.Last();
			}
			return CreateAnotherSuffix();
		}

		public facade.datatypes.ENXPFacade CreateAnotherSuffix()
		{
			ensuffix element = new ensuffix();
			facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
			elementFacade.Init();
			self.suffix = SetOrAdd(self.suffix, element);
			return elementFacade;
		}

		public facade.datatypes.ENXPFacade Suffix()		{
			return GetOrCreateSuffix();
		}

		public List<EntityNameUse> use()
		{
			return Set(self.@use);
		}

		public EntityNameUse GetOrCreateUse()
		{
			List<EntityNameUse> lastOrDefault = use();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "use");
				return lastOrDefault.Last();
			}
			return CreateAnotherUse();
		}

		public EntityNameUse CreateAnotherUse()
		{
			MarkSpecified(self, "use");
			EntityNameUse element = new EntityNameUse();
			self.@use = SetOrAdd(self.@use, element);
			return element;
		}

		public EntityNameUse Use()		{
			return GetOrCreateUse();
		}

		public void Use(EntityNameUse value)		{
			self.@use = SetOrAdd(self.@use, value);
		}

		public List<facade.datatypes.ENXPFacade> delimiter()
		{
			return Set(self.delimiter).FindAll( x => x is endelimiter).ConvertAll( x => x as endelimiter).ConvertAll( x => new facade.datatypes.ENXPFacade(x));
		}

		public facade.datatypes.ENXPFacade GetOrCreateDelimiter()
		{
			List<facade.datatypes.ENXPFacade> lastOrDefault = delimiter();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "delimiter");
				return lastOrDefault.Last();
			}
			return CreateAnotherDelimiter();
		}

		public facade.datatypes.ENXPFacade CreateAnotherDelimiter()
		{
			endelimiter element = new endelimiter();
			facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
			elementFacade.Init();
			self.delimiter = SetOrAdd(self.delimiter, element);
			return elementFacade;
		}

		public facade.datatypes.ENXPFacade Delimiter()		{
			return GetOrCreateDelimiter();
		}

		public List<string> part()
		{
			return Set(self.@Text);
		}

		public string GetOrCreatePart()
		{
			List<string> lastOrDefault = part();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "Text");
				return lastOrDefault.Last();
			}
			return CreateAnotherPart();
		}

		public string CreateAnotherPart()
		{
			MarkSpecified(self, "Text");
			string element = String.Empty;
			self.@Text = SetOrAdd(self.@Text, element);
			return element;
		}

		public string Part()		{
			return GetOrCreatePart();
		}

		public void Part(string value)		{
			self.@Text = SetOrAdd(self.@Text, value);
		}

		public List<facade.datatypes.IVL_TSFacade> validTime()
		{
			return Set(self.validTime).FindAll( x => x is IVL_TS).ConvertAll( x => x as IVL_TS).ConvertAll( x => new facade.datatypes.IVL_TSFacade(x));
		}

		public facade.datatypes.IVL_TSFacade GetOrCreateValidTime()
		{
			List<facade.datatypes.IVL_TSFacade> lastOrDefault = validTime();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "validTime");
				return lastOrDefault.Last();
			}
			return CreateAnotherValidTime();
		}

		public facade.datatypes.IVL_TSFacade CreateAnotherValidTime()
		{
			IVL_TS element = new IVL_TS();
			facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
			elementFacade.Init();
			self.validTime = SetOrAdd(self.validTime, element);
			return elementFacade;
		}

		public facade.datatypes.IVL_TSFacade ValidTime()		{
			return GetOrCreateValidTime();
		}

		public List<string> text()
		{
			return Set(self.@Text);
		}

		public string GetOrCreateText()
		{
			List<string> lastOrDefault = text();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "Text");
				return lastOrDefault.Last();
			}
			return CreateAnotherText();
		}

		public string CreateAnotherText()
		{
			MarkSpecified(self, "Text");
			string element = String.Empty;
			self.@Text = SetOrAdd(self.@Text, element);
			return element;
		}

		public string Text()		{
			return self.@Text == null ? String.Empty : string.Join(String.Empty, self.@Text);
		}

		public void Text(string value)		{
			self.@Text = new string[] { value };
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
