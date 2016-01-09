package facade.consol.generalheaderconstraints;

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

public class USRealmAddressFacade extends facade.FacadeBase {

	public AD self;

	public USRealmAddressFacade()
	{
		this.self = DatatypesFactory.eINSTANCE.createAD();
	}

	public USRealmAddressFacade(AD self)
	{
		this.self = self;
	}

	public static boolean isKindOf(AD self)
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
		GetOrCreateCity();
		GetOrCreateStreetAddressLine();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmAddressCity(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmAddressCountry(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmAddressPostalCode(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmAddressState(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmAddressUse(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmAddressUseP(vb, del);

			city().forEach(x -> x.Validate(vb, del));
			country().forEach(x -> x.Validate(vb, del));
			postalCode().forEach(x -> x.Validate(vb, del));
			state().forEach(x -> x.Validate(vb, del));
			streetAddressLine().forEach(x -> x.Validate(vb, del));
			delimiter().forEach(x -> x.Validate(vb, del));
			county().forEach(x -> x.Validate(vb, del));
			houseNumber().forEach(x -> x.Validate(vb, del));
			houseNumberNumeric().forEach(x -> x.Validate(vb, del));
			direction().forEach(x -> x.Validate(vb, del));
			streetName().forEach(x -> x.Validate(vb, del));
			streetNameBase().forEach(x -> x.Validate(vb, del));
			streetNameType().forEach(x -> x.Validate(vb, del));
			additionalLocator().forEach(x -> x.Validate(vb, del));
			unitID().forEach(x -> x.Validate(vb, del));
			unitType().forEach(x -> x.Validate(vb, del));
			careOf().forEach(x -> x.Validate(vb, del));
			censusTract().forEach(x -> x.Validate(vb, del));
			deliveryAddressLine().forEach(x -> x.Validate(vb, del));
			deliveryInstallationType().forEach(x -> x.Validate(vb, del));
			deliveryInstallationArea().forEach(x -> x.Validate(vb, del));
			deliveryInstallationQualifier().forEach(x -> x.Validate(vb, del));
			deliveryMode().forEach(x -> x.Validate(vb, del));
			deliveryModeIdentifier().forEach(x -> x.Validate(vb, del));
			buildingNumberSuffix().forEach(x -> x.Validate(vb, del));
			postBox().forEach(x -> x.Validate(vb, del));
			precinct().forEach(x -> x.Validate(vb, del));
			useablePeriod().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i739 -> i739.isNullFlavorUndefined())) || One(Set(self.getStreetAddressLines()).count())>=1 && One(Set(self.getStreetAddressLines()).count())<=4;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet\n\t\tConformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291)\n\t\tAnalysis: SHALL contain at least one and not more than 4 streetAddressLine\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressCity
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmAddressCity(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i753 -> i753.isNullFlavorUndefined())) || One(Set(self.getCities()).count())==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a.1 city\n\t\tConformance: SHALL contain exactly one [1..1] city (CONF:7292)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressCountry
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmAddressCountry(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i769 -> i769.isNullFlavorUndefined())) || !(!(Set(self.getCountries()).count()==0) && Set(self.getCountries()).anyMatch(i770 -> Set(i770).anyMatch(i771 -> i771.isNullFlavorUndefined()))) || One(Set(self.getCountries()).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a.2 country\n\t\tConformance: SHOULD contain zero or one [0..1] country (CONF:7295)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressPostalCode
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmAddressPostalCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i789 -> i789.isNullFlavorUndefined())) || !(!(Set(self.getPostalCodes()).count()==0) && Set(self.getPostalCodes()).anyMatch(i790 -> Set(i790).anyMatch(i791 -> i791.isNullFlavorUndefined()))) || One(Set(self.getPostalCodes()).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a.3 postalCode\n\t\tConformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressState
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmAddressState(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i809 -> i809.isNullFlavorUndefined())) || !(!(Set(self.getStates()).count()==0) && Set(self.getStates()).anyMatch(i810 -> Set(i810).anyMatch(i811 -> i811.isNullFlavorUndefined()))) || One(Set(self.getStates()).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a.4 state\n\t\tConformance: SHOULD contain zero or one [0..1] state (CONF:7293)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i829 -> i829.isNullFlavorUndefined())) || !(Set(self.getStreetAddressLines()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a.5 streetAddressLine\n\t\tConformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and  let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in  value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP)) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressUse
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmAddressUse(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i845 -> i845.isNullFlavorUndefined())) || Set(self.getUses()).count()==0 || Set(self.getUses()).allMatch(i846 -> !(Set(i846).count()==0) && true && Set(i846).filter(i849 -> Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.BAD) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.DIR) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.H) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.HP) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.HV) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.PHYS) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.PST) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.PUB) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.TMP) || Set(i849).collect(Collectors.toList()).contains(PostalAddressUse.WP)).count()!=0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a.6 use\n\t\tConformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/addr
	 * Context Class: consol::GeneralHeaderConstraints::USRealmAddress
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmAddress::GeneralHeaderConstraintsUSRealmAddressUseP
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmAddressUseP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i867 -> i867.isNullFlavorUndefined())) || Set(self.getUses()).count()==0 || One(Set(self.getUses()).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.a.6 use\n\t\tConformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.ADXPFacade> city()
	{
		return Set(self.getCities()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateCity()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = city().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_City());
			return lastOrDefault.get();
		}
		return CreateAnotherCity();
	}

	public facade.datatypes.ADXPFacade CreateAnotherCity()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getCities().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade City() {
		return GetOrCreateCity();
	}

	public Stream<facade.datatypes.ADXPFacade> country()
	{
		return Set(self.getCounties()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateCountry()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = country().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_County());
			return lastOrDefault.get();
		}
		return CreateAnotherCountry();
	}

	public facade.datatypes.ADXPFacade CreateAnotherCountry()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getCounties().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade Country() {
		return GetOrCreateCountry();
	}

	public Stream<facade.datatypes.ADXPFacade> postalCode()
	{
		return Set(self.getPostalCodes()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreatePostalCode()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = postalCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_PostalCode());
			return lastOrDefault.get();
		}
		return CreateAnotherPostalCode();
	}

	public facade.datatypes.ADXPFacade CreateAnotherPostalCode()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getPostalCodes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade PostalCode() {
		return GetOrCreatePostalCode();
	}

	public Stream<facade.datatypes.ADXPFacade> state()
	{
		return Set(self.getStates()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateState()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = state().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_State());
			return lastOrDefault.get();
		}
		return CreateAnotherState();
	}

	public facade.datatypes.ADXPFacade CreateAnotherState()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getStates().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade State() {
		return GetOrCreateState();
	}

	public Stream<facade.datatypes.ADXPFacade> streetAddressLine()
	{
		return Set(self.getStreetAddressLines()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateStreetAddressLine()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = streetAddressLine().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_StreetAddressLine());
			return lastOrDefault.get();
		}
		return CreateAnotherStreetAddressLine();
	}

	public facade.datatypes.ADXPFacade CreateAnotherStreetAddressLine()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getStreetAddressLines().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade StreetAddressLine() {
		return GetOrCreateStreetAddressLine();
	}

	public Stream<PostalAddressUse> use()
	{
		return Set(self.getUses());
	}

	public PostalAddressUse GetOrCreateUse()
	{
		Optional<PostalAddressUse> lastOrDefault = use().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Use());
			return lastOrDefault.get();
		}
		return CreateAnotherUse();
	}

	public PostalAddressUse CreateAnotherUse()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Use());
		PostalAddressUse element = PostalAddressUse.get(0);
		self.getUses().add(element);
		return element;
	}

	public PostalAddressUse Use() {
		return GetOrCreateUse();
	}

	public void Use(PostalAddressUse value) {
		self.getUses().add(value);
	}

	public Stream<facade.datatypes.ADXPFacade> delimiter()
	{
		return Set(self.getDelimiters()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateDelimiter()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = delimiter().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Delimiter());
			return lastOrDefault.get();
		}
		return CreateAnotherDelimiter();
	}

	public facade.datatypes.ADXPFacade CreateAnotherDelimiter()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getDelimiters().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade Delimiter() {
		return GetOrCreateDelimiter();
	}

	public Stream<facade.datatypes.ADXPFacade> county()
	{
		return Set(self.getCounties()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateCounty()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = county().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_County());
			return lastOrDefault.get();
		}
		return CreateAnotherCounty();
	}

	public facade.datatypes.ADXPFacade CreateAnotherCounty()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getCounties().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade County() {
		return GetOrCreateCounty();
	}

	public Stream<facade.datatypes.ADXPFacade> houseNumber()
	{
		return Set(self.getHouseNumbers()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateHouseNumber()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = houseNumber().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_HouseNumber());
			return lastOrDefault.get();
		}
		return CreateAnotherHouseNumber();
	}

	public facade.datatypes.ADXPFacade CreateAnotherHouseNumber()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getHouseNumbers().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade HouseNumber() {
		return GetOrCreateHouseNumber();
	}

	public Stream<facade.datatypes.ADXPFacade> houseNumberNumeric()
	{
		return Set(self.getHouseNumberNumerics()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateHouseNumberNumeric()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = houseNumberNumeric().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_HouseNumberNumeric());
			return lastOrDefault.get();
		}
		return CreateAnotherHouseNumberNumeric();
	}

	public facade.datatypes.ADXPFacade CreateAnotherHouseNumberNumeric()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getHouseNumberNumerics().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade HouseNumberNumeric() {
		return GetOrCreateHouseNumberNumeric();
	}

	public Stream<facade.datatypes.ADXPFacade> direction()
	{
		return Set(self.getDirections()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateDirection()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = direction().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Direction());
			return lastOrDefault.get();
		}
		return CreateAnotherDirection();
	}

	public facade.datatypes.ADXPFacade CreateAnotherDirection()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getDirections().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade Direction() {
		return GetOrCreateDirection();
	}

	public Stream<facade.datatypes.ADXPFacade> streetName()
	{
		return Set(self.getStreetNames()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateStreetName()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = streetName().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_StreetName());
			return lastOrDefault.get();
		}
		return CreateAnotherStreetName();
	}

	public facade.datatypes.ADXPFacade CreateAnotherStreetName()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getStreetNames().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade StreetName() {
		return GetOrCreateStreetName();
	}

	public Stream<facade.datatypes.ADXPFacade> streetNameBase()
	{
		return Set(self.getStreetNameBases()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateStreetNameBase()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = streetNameBase().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_StreetNameBase());
			return lastOrDefault.get();
		}
		return CreateAnotherStreetNameBase();
	}

	public facade.datatypes.ADXPFacade CreateAnotherStreetNameBase()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getStreetNameBases().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade StreetNameBase() {
		return GetOrCreateStreetNameBase();
	}

	public Stream<facade.datatypes.ADXPFacade> streetNameType()
	{
		return Set(self.getStreetNameTypes()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateStreetNameType()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = streetNameType().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_StreetNameType());
			return lastOrDefault.get();
		}
		return CreateAnotherStreetNameType();
	}

	public facade.datatypes.ADXPFacade CreateAnotherStreetNameType()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getStreetNameTypes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade StreetNameType() {
		return GetOrCreateStreetNameType();
	}

	public Stream<facade.datatypes.ADXPFacade> additionalLocator()
	{
		return Set(self.getAdditionalLocators()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateAdditionalLocator()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = additionalLocator().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_AdditionalLocator());
			return lastOrDefault.get();
		}
		return CreateAnotherAdditionalLocator();
	}

	public facade.datatypes.ADXPFacade CreateAnotherAdditionalLocator()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getAdditionalLocators().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade AdditionalLocator() {
		return GetOrCreateAdditionalLocator();
	}

	public Stream<facade.datatypes.ADXPFacade> unitID()
	{
		return Set(self.getUnitIDs()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateUnitID()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = unitID().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_UnitID());
			return lastOrDefault.get();
		}
		return CreateAnotherUnitID();
	}

	public facade.datatypes.ADXPFacade CreateAnotherUnitID()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getUnitIDs().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade UnitID() {
		return GetOrCreateUnitID();
	}

	public Stream<facade.datatypes.ADXPFacade> unitType()
	{
		return Set(self.getUnitTypes()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateUnitType()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = unitType().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_UnitType());
			return lastOrDefault.get();
		}
		return CreateAnotherUnitType();
	}

	public facade.datatypes.ADXPFacade CreateAnotherUnitType()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getUnitTypes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade UnitType() {
		return GetOrCreateUnitType();
	}

	public Stream<facade.datatypes.ADXPFacade> careOf()
	{
		return Set(self.getCareOfs()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateCareOf()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = careOf().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_CareOf());
			return lastOrDefault.get();
		}
		return CreateAnotherCareOf();
	}

	public facade.datatypes.ADXPFacade CreateAnotherCareOf()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getCareOfs().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade CareOf() {
		return GetOrCreateCareOf();
	}

	public Stream<facade.datatypes.ADXPFacade> censusTract()
	{
		return Set(self.getCensusTracts()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateCensusTract()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = censusTract().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_CensusTract());
			return lastOrDefault.get();
		}
		return CreateAnotherCensusTract();
	}

	public facade.datatypes.ADXPFacade CreateAnotherCensusTract()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getCensusTracts().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade CensusTract() {
		return GetOrCreateCensusTract();
	}

	public Stream<facade.datatypes.ADXPFacade> deliveryAddressLine()
	{
		return Set(self.getDeliveryAddressLines()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateDeliveryAddressLine()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = deliveryAddressLine().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_DeliveryAddressLine());
			return lastOrDefault.get();
		}
		return CreateAnotherDeliveryAddressLine();
	}

	public facade.datatypes.ADXPFacade CreateAnotherDeliveryAddressLine()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getDeliveryAddressLines().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade DeliveryAddressLine() {
		return GetOrCreateDeliveryAddressLine();
	}

	public Stream<facade.datatypes.ADXPFacade> deliveryInstallationType()
	{
		return Set(self.getDeliveryInstallationTypes()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateDeliveryInstallationType()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = deliveryInstallationType().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_DeliveryInstallationType());
			return lastOrDefault.get();
		}
		return CreateAnotherDeliveryInstallationType();
	}

	public facade.datatypes.ADXPFacade CreateAnotherDeliveryInstallationType()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getDeliveryInstallationTypes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade DeliveryInstallationType() {
		return GetOrCreateDeliveryInstallationType();
	}

	public Stream<facade.datatypes.ADXPFacade> deliveryInstallationArea()
	{
		return Set(self.getDeliveryInstallationAreas()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateDeliveryInstallationArea()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = deliveryInstallationArea().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_DeliveryInstallationArea());
			return lastOrDefault.get();
		}
		return CreateAnotherDeliveryInstallationArea();
	}

	public facade.datatypes.ADXPFacade CreateAnotherDeliveryInstallationArea()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getDeliveryInstallationAreas().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade DeliveryInstallationArea() {
		return GetOrCreateDeliveryInstallationArea();
	}

	public Stream<facade.datatypes.ADXPFacade> deliveryInstallationQualifier()
	{
		return Set(self.getDeliveryInstallationQualifiers()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateDeliveryInstallationQualifier()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = deliveryInstallationQualifier().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_DeliveryInstallationQualifier());
			return lastOrDefault.get();
		}
		return CreateAnotherDeliveryInstallationQualifier();
	}

	public facade.datatypes.ADXPFacade CreateAnotherDeliveryInstallationQualifier()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getDeliveryInstallationQualifiers().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade DeliveryInstallationQualifier() {
		return GetOrCreateDeliveryInstallationQualifier();
	}

	public Stream<facade.datatypes.ADXPFacade> deliveryMode()
	{
		return Set(self.getDeliveryModes()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateDeliveryMode()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = deliveryMode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_DeliveryMode());
			return lastOrDefault.get();
		}
		return CreateAnotherDeliveryMode();
	}

	public facade.datatypes.ADXPFacade CreateAnotherDeliveryMode()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getDeliveryModes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade DeliveryMode() {
		return GetOrCreateDeliveryMode();
	}

	public Stream<facade.datatypes.ADXPFacade> deliveryModeIdentifier()
	{
		return Set(self.getDeliveryModeIdentifiers()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateDeliveryModeIdentifier()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = deliveryModeIdentifier().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_DeliveryModeIdentifier());
			return lastOrDefault.get();
		}
		return CreateAnotherDeliveryModeIdentifier();
	}

	public facade.datatypes.ADXPFacade CreateAnotherDeliveryModeIdentifier()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getDeliveryModeIdentifiers().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade DeliveryModeIdentifier() {
		return GetOrCreateDeliveryModeIdentifier();
	}

	public Stream<facade.datatypes.ADXPFacade> buildingNumberSuffix()
	{
		return Set(self.getBuildingNumberSuffixes()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreateBuildingNumberSuffix()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = buildingNumberSuffix().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_BuildingNumberSuffix());
			return lastOrDefault.get();
		}
		return CreateAnotherBuildingNumberSuffix();
	}

	public facade.datatypes.ADXPFacade CreateAnotherBuildingNumberSuffix()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getBuildingNumberSuffixes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade BuildingNumberSuffix() {
		return GetOrCreateBuildingNumberSuffix();
	}

	public Stream<facade.datatypes.ADXPFacade> postBox()
	{
		return Set(self.getPostBoxes()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreatePostBox()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = postBox().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_PostBox());
			return lastOrDefault.get();
		}
		return CreateAnotherPostBox();
	}

	public facade.datatypes.ADXPFacade CreateAnotherPostBox()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getPostBoxes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade PostBox() {
		return GetOrCreatePostBox();
	}

	public Stream<facade.datatypes.ADXPFacade> precinct()
	{
		return Set(self.getPrecincts()).filter( x -> x instanceof ADXP).map( x -> (ADXP) x).map( x -> new facade.datatypes.ADXPFacade(x));
	}

	public facade.datatypes.ADXPFacade GetOrCreatePrecinct()
	{
		Optional<facade.datatypes.ADXPFacade> lastOrDefault = precinct().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Precinct());
			return lastOrDefault.get();
		}
		return CreateAnotherPrecinct();
	}

	public facade.datatypes.ADXPFacade CreateAnotherPrecinct()
	{
		ADXP element = DatatypesFactory.eINSTANCE.createADXP();
		facade.datatypes.ADXPFacade elementFacade = new facade.datatypes.ADXPFacade(element);
		elementFacade.Init();
		self.getPrecincts().add(element);
		return elementFacade;
	}

	public facade.datatypes.ADXPFacade Precinct() {
		return GetOrCreatePrecinct();
	}

	public Stream<String> part()
	{
		return Set(self.getText());
	}

	public String GetOrCreatePart()
	{
		Optional<String> lastOrDefault = part().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Part());
			return lastOrDefault.get();
		}
		return CreateAnotherPart();
	}

	public String CreateAnotherPart()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Part());
		String element = "";
		self.addText(element);
		return element;
	}

	public String Part() {
		return GetOrCreatePart();
	}

	public void Part(String value) {
		self.addText(value);
	}

	public Stream<facade.datatypes.SXCM_TSFacade> useablePeriod()
	{
		return Set(self.getUseablePeriods()).filter( x -> x instanceof SXCM_TS).map( x -> (SXCM_TS) x).map( x -> new facade.datatypes.SXCM_TSFacade(x));
	}

	public facade.datatypes.SXCM_TSFacade GetOrCreateUseablePeriod()
	{
		Optional<facade.datatypes.SXCM_TSFacade> lastOrDefault = useablePeriod().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_UseablePeriod());
			return lastOrDefault.get();
		}
		return CreateAnotherUseablePeriod();
	}

	public facade.datatypes.SXCM_TSFacade CreateAnotherUseablePeriod()
	{
		SXCM_TS element = DatatypesFactory.eINSTANCE.createSXCM_TS();
		facade.datatypes.SXCM_TSFacade elementFacade = new facade.datatypes.SXCM_TSFacade(element);
		elementFacade.Init();
		self.getUseablePeriods().add(element);
		return elementFacade;
	}

	public facade.datatypes.SXCM_TSFacade UseablePeriod() {
		return GetOrCreateUseablePeriod();
	}

	public Stream<Boolean> isNotOrdered()
	{
		return Set(self.getIsNotOrdered());
	}

	public Boolean GetOrCreateIsNotOrdered()
	{
		Optional<Boolean> lastOrDefault = isNotOrdered().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_IsNotOrdered());
			return lastOrDefault.get();
		}
		return CreateAnotherIsNotOrdered();
	}

	public Boolean CreateAnotherIsNotOrdered()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_IsNotOrdered());
		Boolean element = Boolean.FALSE;
		self.setIsNotOrdered(element);
		return element;
	}

	public Boolean IsNotOrdered() {
		return GetOrCreateIsNotOrdered();
	}

	public void IsNotOrdered(Boolean value) {
		self.setIsNotOrdered(value);
	}

	public Stream<String> text()
	{
		return Set(self.getText());
	}

	public String GetOrCreateText()
	{
		Optional<String> lastOrDefault = text().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Mixed());
			return lastOrDefault.get();
		}
		return CreateAnotherText();
	}

	public String CreateAnotherText()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getAD_Mixed());
		String element = "";
		self.addText(element);
		return element;
	}

	public String Text() {
		return GetOrCreateText();
	}

	public void Text(String value) {
		self.addText(value);
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getANY_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getANY_NullFlavor());
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
