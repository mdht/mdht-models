using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.generalheaderconstraints
{
    public class USRealmAddressFacade : facade.FacadeBase
    {

		public AD self;

		public USRealmAddressFacade()
		{
			this.self = new AD();
		}

		public USRealmAddressFacade(AD self)
		{
			this.self = self;
		}

		public static bool isKindOf(AD self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateCity();
			GetOrCreateStreetAddressLine();
		}

		/**
		 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{
				ValidateGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmAddressCity(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmAddressCountry(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmAddressPostalCode(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmAddressState(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmAddressUse(vb, del);
				ValidateGeneralHeaderConstraintsUSRealmAddressUseP(vb, del);

				city().ForEach(x => x.Validate(vb, del));
				country().ForEach(x => x.Validate(vb, del));
				postalCode().ForEach(x => x.Validate(vb, del));
				state().ForEach(x => x.Validate(vb, del));
				streetAddressLine().ForEach(x => x.Validate(vb, del));
				delimiter().ForEach(x => x.Validate(vb, del));
				county().ForEach(x => x.Validate(vb, del));
				houseNumber().ForEach(x => x.Validate(vb, del));
				houseNumberNumeric().ForEach(x => x.Validate(vb, del));
				direction().ForEach(x => x.Validate(vb, del));
				streetName().ForEach(x => x.Validate(vb, del));
				streetNameBase().ForEach(x => x.Validate(vb, del));
				streetNameType().ForEach(x => x.Validate(vb, del));
				additionalLocator().ForEach(x => x.Validate(vb, del));
				unitID().ForEach(x => x.Validate(vb, del));
				unitType().ForEach(x => x.Validate(vb, del));
				careOf().ForEach(x => x.Validate(vb, del));
				censusTract().ForEach(x => x.Validate(vb, del));
				deliveryAddressLine().ForEach(x => x.Validate(vb, del));
				deliveryInstallationType().ForEach(x => x.Validate(vb, del));
				deliveryInstallationArea().ForEach(x => x.Validate(vb, del));
				deliveryInstallationQualifier().ForEach(x => x.Validate(vb, del));
				deliveryMode().ForEach(x => x.Validate(vb, del));
				deliveryModeIdentifier().ForEach(x => x.Validate(vb, del));
				buildingNumberSuffix().ForEach(x => x.Validate(vb, del));
				postBox().ForEach(x => x.Validate(vb, del));
				precinct().ForEach(x => x.Validate(vb, del));
				useablePeriod().ForEach(x => x.Validate(vb, del));
		}
		/**
		 * OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || One(Set(self.streetAddressLine).Count)>=1 && One(Set(self.streetAddressLine).Count)<=4;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet\n\t\tConformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291)\n\t\tAnalysis: SHALL contain at least one and not more than 4 streetAddressLine\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressCity
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmAddressCity(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || One(Set(self.city).Count)==1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a.1 city\n\t\tConformance: SHALL contain exactly one [1..1] city (CONF:7292)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressCountry
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmAddressCountry(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || !(!(Set(self.country).Count==0) && Set(self.country).Exists(i765 => Set(i765.@nullFlavor).Count==0)) || One(Set(self.country).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a.2 country\n\t\tConformance: SHOULD contain zero or one [0..1] country (CONF:7295)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressPostalCode
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmAddressPostalCode(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || !(!(Set(self.postalCode).Count==0) && Set(self.postalCode).Exists(i781 => Set(i781.@nullFlavor).Count==0)) || One(Set(self.postalCode).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a.3 postalCode\n\t\tConformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressState
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmAddressState(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || !(!(Set(self.state).Count==0) && Set(self.state).Exists(i797 => Set(i797.@nullFlavor).Count==0)) || One(Set(self.state).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a.4 state\n\t\tConformance: SHOULD contain zero or one [0..1] state (CONF:7293)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || !(Set(self.streetAddressLine).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a.5 streetAddressLine\n\t\tConformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and  let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in  value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP)) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressUse
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmAddressUse(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || Set(self.@use).Count==0 || Set(self.@use).TrueForAll(i827 => !(Set(i827).Count==0) && true && Set(i827).FindAll(i830 => Set(i830).Contains(PostalAddressUse.BAD) || Set(i830).Contains(PostalAddressUse.DIR) || Set(i830).Contains(PostalAddressUse.H) || Set(i830).Contains(PostalAddressUse.HP) || Set(i830).Contains(PostalAddressUse.HV) || Set(i830).Contains(PostalAddressUse.PHYS) || Set(i830).Contains(PostalAddressUse.PST) || Set(i830).Contains(PostalAddressUse.PUB) || Set(i830).Contains(PostalAddressUse.TMP) || Set(i830).Contains(PostalAddressUse.WP)).Count!=0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a.6 use\n\t\tConformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		/**
		 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
		 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
		 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressUseP
		 */
		public bool ValidateGeneralHeaderConstraintsUSRealmAddressUseP(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.@nullFlavor).Count==0) || Set(self.@use).Count==0 || One(Set(self.@use).Count)<=1;
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: USRealmHeader - 2.5.12.i.a.6 use\n\t\tConformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		public List<facade.datatypes.ADXPFacade> city()
		{
			return Set(self.city).FindAll( x => x is adxpcity).ConvertAll( x => x as adxpcity).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateCity()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = city();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "city");
				return lastOrDefault.Last();
			}
			return CreateAnotherCity();
		}

		public facade.datatypes.ADXPFacade CreateAnotherCity()
		{
			adxpcity element = new adxpcity();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.city = SetOrAdd(self.city, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade City()		{
			return GetOrCreateCity();
		}

		public List<facade.datatypes.ADXPFacade> country()
		{
			return Set(self.county).FindAll( x => x is adxpcounty).ConvertAll( x => x as adxpcounty).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateCountry()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = country();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "county");
				return lastOrDefault.Last();
			}
			return CreateAnotherCountry();
		}

		public facade.datatypes.ADXPFacade CreateAnotherCountry()
		{
			adxpcounty element = new adxpcounty();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.county = SetOrAdd(self.county, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade Country()		{
			return GetOrCreateCountry();
		}

		public List<facade.datatypes.ADXPFacade> postalCode()
		{
			return Set(self.postalCode).FindAll( x => x is adxppostalCode).ConvertAll( x => x as adxppostalCode).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreatePostalCode()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = postalCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "postalCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherPostalCode();
		}

		public facade.datatypes.ADXPFacade CreateAnotherPostalCode()
		{
			adxppostalCode element = new adxppostalCode();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.postalCode = SetOrAdd(self.postalCode, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade PostalCode()		{
			return GetOrCreatePostalCode();
		}

		public List<facade.datatypes.ADXPFacade> state()
		{
			return Set(self.state).FindAll( x => x is adxpstate).ConvertAll( x => x as adxpstate).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateState()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = state();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "state");
				return lastOrDefault.Last();
			}
			return CreateAnotherState();
		}

		public facade.datatypes.ADXPFacade CreateAnotherState()
		{
			adxpstate element = new adxpstate();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.state = SetOrAdd(self.state, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade State()		{
			return GetOrCreateState();
		}

		public List<facade.datatypes.ADXPFacade> streetAddressLine()
		{
			return Set(self.streetAddressLine).FindAll( x => x is adxpstreetAddressLine).ConvertAll( x => x as adxpstreetAddressLine).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateStreetAddressLine()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = streetAddressLine();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "streetAddressLine");
				return lastOrDefault.Last();
			}
			return CreateAnotherStreetAddressLine();
		}

		public facade.datatypes.ADXPFacade CreateAnotherStreetAddressLine()
		{
			adxpstreetAddressLine element = new adxpstreetAddressLine();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.streetAddressLine = SetOrAdd(self.streetAddressLine, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade StreetAddressLine()		{
			return GetOrCreateStreetAddressLine();
		}

		public List<PostalAddressUse> use()
		{
			return Set(self.@use);
		}

		public PostalAddressUse GetOrCreateUse()
		{
			List<PostalAddressUse> lastOrDefault = use();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "use");
				return lastOrDefault.Last();
			}
			return CreateAnotherUse();
		}

		public PostalAddressUse CreateAnotherUse()
		{
			MarkSpecified(self, "use");
			PostalAddressUse element = new PostalAddressUse();
			self.@use = SetOrAdd(self.@use, element);
			return element;
		}

		public PostalAddressUse Use()		{
			return GetOrCreateUse();
		}

		public void Use(PostalAddressUse value)		{
			self.@use = SetOrAdd(self.@use, value);
		}

		public List<facade.datatypes.ADXPFacade> delimiter()
		{
			return Set(self.delimiter).FindAll( x => x is adxpdelimiter).ConvertAll( x => x as adxpdelimiter).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateDelimiter()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = delimiter();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "delimiter");
				return lastOrDefault.Last();
			}
			return CreateAnotherDelimiter();
		}

		public facade.datatypes.ADXPFacade CreateAnotherDelimiter()
		{
			adxpdelimiter element = new adxpdelimiter();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.delimiter = SetOrAdd(self.delimiter, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade Delimiter()		{
			return GetOrCreateDelimiter();
		}

		public List<facade.datatypes.ADXPFacade> county()
		{
			return Set(self.county).FindAll( x => x is adxpcounty).ConvertAll( x => x as adxpcounty).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateCounty()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = county();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "county");
				return lastOrDefault.Last();
			}
			return CreateAnotherCounty();
		}

		public facade.datatypes.ADXPFacade CreateAnotherCounty()
		{
			adxpcounty element = new adxpcounty();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.county = SetOrAdd(self.county, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade County()		{
			return GetOrCreateCounty();
		}

		public List<facade.datatypes.ADXPFacade> houseNumber()
		{
			return Set(self.houseNumber).FindAll( x => x is adxphouseNumber).ConvertAll( x => x as adxphouseNumber).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateHouseNumber()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = houseNumber();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "houseNumber");
				return lastOrDefault.Last();
			}
			return CreateAnotherHouseNumber();
		}

		public facade.datatypes.ADXPFacade CreateAnotherHouseNumber()
		{
			adxphouseNumber element = new adxphouseNumber();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.houseNumber = SetOrAdd(self.houseNumber, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade HouseNumber()		{
			return GetOrCreateHouseNumber();
		}

		public List<facade.datatypes.ADXPFacade> houseNumberNumeric()
		{
			return Set(self.houseNumberNumeric).FindAll( x => x is adxphouseNumberNumeric).ConvertAll( x => x as adxphouseNumberNumeric).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateHouseNumberNumeric()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = houseNumberNumeric();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "houseNumberNumeric");
				return lastOrDefault.Last();
			}
			return CreateAnotherHouseNumberNumeric();
		}

		public facade.datatypes.ADXPFacade CreateAnotherHouseNumberNumeric()
		{
			adxphouseNumberNumeric element = new adxphouseNumberNumeric();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.houseNumberNumeric = SetOrAdd(self.houseNumberNumeric, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade HouseNumberNumeric()		{
			return GetOrCreateHouseNumberNumeric();
		}

		public List<facade.datatypes.ADXPFacade> direction()
		{
			return Set(self.direction).FindAll( x => x is adxpdirection).ConvertAll( x => x as adxpdirection).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateDirection()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = direction();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "direction");
				return lastOrDefault.Last();
			}
			return CreateAnotherDirection();
		}

		public facade.datatypes.ADXPFacade CreateAnotherDirection()
		{
			adxpdirection element = new adxpdirection();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.direction = SetOrAdd(self.direction, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade Direction()		{
			return GetOrCreateDirection();
		}

		public List<facade.datatypes.ADXPFacade> streetName()
		{
			return Set(self.streetName).FindAll( x => x is adxpstreetName).ConvertAll( x => x as adxpstreetName).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateStreetName()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = streetName();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "streetName");
				return lastOrDefault.Last();
			}
			return CreateAnotherStreetName();
		}

		public facade.datatypes.ADXPFacade CreateAnotherStreetName()
		{
			adxpstreetName element = new adxpstreetName();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.streetName = SetOrAdd(self.streetName, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade StreetName()		{
			return GetOrCreateStreetName();
		}

		public List<facade.datatypes.ADXPFacade> streetNameBase()
		{
			return Set(self.streetNameBase).FindAll( x => x is adxpstreetNameBase).ConvertAll( x => x as adxpstreetNameBase).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateStreetNameBase()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = streetNameBase();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "streetNameBase");
				return lastOrDefault.Last();
			}
			return CreateAnotherStreetNameBase();
		}

		public facade.datatypes.ADXPFacade CreateAnotherStreetNameBase()
		{
			adxpstreetNameBase element = new adxpstreetNameBase();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.streetNameBase = SetOrAdd(self.streetNameBase, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade StreetNameBase()		{
			return GetOrCreateStreetNameBase();
		}

		public List<facade.datatypes.ADXPFacade> streetNameType()
		{
			return Set(self.streetNameType).FindAll( x => x is adxpstreetNameType).ConvertAll( x => x as adxpstreetNameType).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateStreetNameType()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = streetNameType();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "streetNameType");
				return lastOrDefault.Last();
			}
			return CreateAnotherStreetNameType();
		}

		public facade.datatypes.ADXPFacade CreateAnotherStreetNameType()
		{
			adxpstreetNameType element = new adxpstreetNameType();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.streetNameType = SetOrAdd(self.streetNameType, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade StreetNameType()		{
			return GetOrCreateStreetNameType();
		}

		public List<facade.datatypes.ADXPFacade> additionalLocator()
		{
			return Set(self.additionalLocator).FindAll( x => x is adxpadditionalLocator).ConvertAll( x => x as adxpadditionalLocator).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateAdditionalLocator()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = additionalLocator();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "additionalLocator");
				return lastOrDefault.Last();
			}
			return CreateAnotherAdditionalLocator();
		}

		public facade.datatypes.ADXPFacade CreateAnotherAdditionalLocator()
		{
			adxpadditionalLocator element = new adxpadditionalLocator();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.additionalLocator = SetOrAdd(self.additionalLocator, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade AdditionalLocator()		{
			return GetOrCreateAdditionalLocator();
		}

		public List<facade.datatypes.ADXPFacade> unitID()
		{
			return Set(self.unitID).FindAll( x => x is adxpunitID).ConvertAll( x => x as adxpunitID).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateUnitID()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = unitID();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "unitID");
				return lastOrDefault.Last();
			}
			return CreateAnotherUnitID();
		}

		public facade.datatypes.ADXPFacade CreateAnotherUnitID()
		{
			adxpunitID element = new adxpunitID();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.unitID = SetOrAdd(self.unitID, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade UnitID()		{
			return GetOrCreateUnitID();
		}

		public List<facade.datatypes.ADXPFacade> unitType()
		{
			return Set(self.unitType).FindAll( x => x is adxpunitType).ConvertAll( x => x as adxpunitType).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateUnitType()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = unitType();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "unitType");
				return lastOrDefault.Last();
			}
			return CreateAnotherUnitType();
		}

		public facade.datatypes.ADXPFacade CreateAnotherUnitType()
		{
			adxpunitType element = new adxpunitType();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.unitType = SetOrAdd(self.unitType, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade UnitType()		{
			return GetOrCreateUnitType();
		}

		public List<facade.datatypes.ADXPFacade> careOf()
		{
			return Set(self.careOf).FindAll( x => x is adxpcareOf).ConvertAll( x => x as adxpcareOf).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateCareOf()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = careOf();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "careOf");
				return lastOrDefault.Last();
			}
			return CreateAnotherCareOf();
		}

		public facade.datatypes.ADXPFacade CreateAnotherCareOf()
		{
			adxpcareOf element = new adxpcareOf();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.careOf = SetOrAdd(self.careOf, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade CareOf()		{
			return GetOrCreateCareOf();
		}

		public List<facade.datatypes.ADXPFacade> censusTract()
		{
			return Set(self.censusTract).FindAll( x => x is adxpcensusTract).ConvertAll( x => x as adxpcensusTract).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateCensusTract()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = censusTract();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "censusTract");
				return lastOrDefault.Last();
			}
			return CreateAnotherCensusTract();
		}

		public facade.datatypes.ADXPFacade CreateAnotherCensusTract()
		{
			adxpcensusTract element = new adxpcensusTract();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.censusTract = SetOrAdd(self.censusTract, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade CensusTract()		{
			return GetOrCreateCensusTract();
		}

		public List<facade.datatypes.ADXPFacade> deliveryAddressLine()
		{
			return Set(self.deliveryAddressLine).FindAll( x => x is adxpdeliveryAddressLine).ConvertAll( x => x as adxpdeliveryAddressLine).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateDeliveryAddressLine()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = deliveryAddressLine();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "deliveryAddressLine");
				return lastOrDefault.Last();
			}
			return CreateAnotherDeliveryAddressLine();
		}

		public facade.datatypes.ADXPFacade CreateAnotherDeliveryAddressLine()
		{
			adxpdeliveryAddressLine element = new adxpdeliveryAddressLine();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.deliveryAddressLine = SetOrAdd(self.deliveryAddressLine, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade DeliveryAddressLine()		{
			return GetOrCreateDeliveryAddressLine();
		}

		public List<facade.datatypes.ADXPFacade> deliveryInstallationType()
		{
			return Set(self.deliveryInstallationType).FindAll( x => x is adxpdeliveryInstallationType).ConvertAll( x => x as adxpdeliveryInstallationType).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateDeliveryInstallationType()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = deliveryInstallationType();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "deliveryInstallationType");
				return lastOrDefault.Last();
			}
			return CreateAnotherDeliveryInstallationType();
		}

		public facade.datatypes.ADXPFacade CreateAnotherDeliveryInstallationType()
		{
			adxpdeliveryInstallationType element = new adxpdeliveryInstallationType();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.deliveryInstallationType = SetOrAdd(self.deliveryInstallationType, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade DeliveryInstallationType()		{
			return GetOrCreateDeliveryInstallationType();
		}

		public List<facade.datatypes.ADXPFacade> deliveryInstallationArea()
		{
			return Set(self.deliveryInstallationArea).FindAll( x => x is adxpdeliveryInstallationArea).ConvertAll( x => x as adxpdeliveryInstallationArea).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateDeliveryInstallationArea()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = deliveryInstallationArea();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "deliveryInstallationArea");
				return lastOrDefault.Last();
			}
			return CreateAnotherDeliveryInstallationArea();
		}

		public facade.datatypes.ADXPFacade CreateAnotherDeliveryInstallationArea()
		{
			adxpdeliveryInstallationArea element = new adxpdeliveryInstallationArea();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.deliveryInstallationArea = SetOrAdd(self.deliveryInstallationArea, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade DeliveryInstallationArea()		{
			return GetOrCreateDeliveryInstallationArea();
		}

		public List<facade.datatypes.ADXPFacade> deliveryInstallationQualifier()
		{
			return Set(self.deliveryInstallationQualifier).FindAll( x => x is adxpdeliveryInstallationQualifier).ConvertAll( x => x as adxpdeliveryInstallationQualifier).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateDeliveryInstallationQualifier()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = deliveryInstallationQualifier();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "deliveryInstallationQualifier");
				return lastOrDefault.Last();
			}
			return CreateAnotherDeliveryInstallationQualifier();
		}

		public facade.datatypes.ADXPFacade CreateAnotherDeliveryInstallationQualifier()
		{
			adxpdeliveryInstallationQualifier element = new adxpdeliveryInstallationQualifier();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.deliveryInstallationQualifier = SetOrAdd(self.deliveryInstallationQualifier, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade DeliveryInstallationQualifier()		{
			return GetOrCreateDeliveryInstallationQualifier();
		}

		public List<facade.datatypes.ADXPFacade> deliveryMode()
		{
			return Set(self.deliveryMode).FindAll( x => x is adxpdeliveryMode).ConvertAll( x => x as adxpdeliveryMode).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateDeliveryMode()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = deliveryMode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "deliveryMode");
				return lastOrDefault.Last();
			}
			return CreateAnotherDeliveryMode();
		}

		public facade.datatypes.ADXPFacade CreateAnotherDeliveryMode()
		{
			adxpdeliveryMode element = new adxpdeliveryMode();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.deliveryMode = SetOrAdd(self.deliveryMode, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade DeliveryMode()		{
			return GetOrCreateDeliveryMode();
		}

		public List<facade.datatypes.ADXPFacade> deliveryModeIdentifier()
		{
			return Set(self.deliveryModeIdentifier).FindAll( x => x is adxpdeliveryModeIdentifier).ConvertAll( x => x as adxpdeliveryModeIdentifier).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateDeliveryModeIdentifier()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = deliveryModeIdentifier();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "deliveryModeIdentifier");
				return lastOrDefault.Last();
			}
			return CreateAnotherDeliveryModeIdentifier();
		}

		public facade.datatypes.ADXPFacade CreateAnotherDeliveryModeIdentifier()
		{
			adxpdeliveryModeIdentifier element = new adxpdeliveryModeIdentifier();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.deliveryModeIdentifier = SetOrAdd(self.deliveryModeIdentifier, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade DeliveryModeIdentifier()		{
			return GetOrCreateDeliveryModeIdentifier();
		}

		public List<facade.datatypes.ADXPFacade> buildingNumberSuffix()
		{
			return Set(self.buildingNumberSuffix).FindAll( x => x is adxpbuildingNumberSuffix).ConvertAll( x => x as adxpbuildingNumberSuffix).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreateBuildingNumberSuffix()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = buildingNumberSuffix();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "buildingNumberSuffix");
				return lastOrDefault.Last();
			}
			return CreateAnotherBuildingNumberSuffix();
		}

		public facade.datatypes.ADXPFacade CreateAnotherBuildingNumberSuffix()
		{
			adxpbuildingNumberSuffix element = new adxpbuildingNumberSuffix();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.buildingNumberSuffix = SetOrAdd(self.buildingNumberSuffix, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade BuildingNumberSuffix()		{
			return GetOrCreateBuildingNumberSuffix();
		}

		public List<facade.datatypes.ADXPFacade> postBox()
		{
			return Set(self.postBox).FindAll( x => x is adxppostBox).ConvertAll( x => x as adxppostBox).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreatePostBox()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = postBox();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "postBox");
				return lastOrDefault.Last();
			}
			return CreateAnotherPostBox();
		}

		public facade.datatypes.ADXPFacade CreateAnotherPostBox()
		{
			adxppostBox element = new adxppostBox();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.postBox = SetOrAdd(self.postBox, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade PostBox()		{
			return GetOrCreatePostBox();
		}

		public List<facade.datatypes.ADXPFacade> precinct()
		{
			return Set(self.precinct).FindAll( x => x is adxpprecinct).ConvertAll( x => x as adxpprecinct).ConvertAll( x => new facade.datatypes.ADXPFacade(x));
		}

		public facade.datatypes.ADXPFacade GetOrCreatePrecinct()
		{
			List<facade.datatypes.ADXPFacade> lastOrDefault = precinct();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "precinct");
				return lastOrDefault.Last();
			}
			return CreateAnotherPrecinct();
		}

		public facade.datatypes.ADXPFacade CreateAnotherPrecinct()
		{
			adxpprecinct element = new adxpprecinct();
			facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
			elementFacade.Init();
			self.precinct = SetOrAdd(self.precinct, element);
			return elementFacade;
		}

		public facade.datatypes.ADXPFacade Precinct()		{
			return GetOrCreatePrecinct();
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

		public List<bool> isNotOrdered()
		{
			return Set(self.@isNotOrdered);
		}

		public bool GetOrCreateIsNotOrdered()
		{
			List<bool> lastOrDefault = isNotOrdered();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "isNotOrdered");
				return lastOrDefault.Last();
			}
			return CreateAnotherIsNotOrdered();
		}

		public bool CreateAnotherIsNotOrdered()
		{
			MarkSpecified(self, "isNotOrdered");
			bool element = new bool();
			self.@isNotOrdered = SetOrAdd(self.@isNotOrdered, element);
			return element;
		}

		public bool IsNotOrdered()		{
			return GetOrCreateIsNotOrdered();
		}

		public void IsNotOrdered(bool value)		{
			self.@isNotOrdered = SetOrAdd(self.@isNotOrdered, value);
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
