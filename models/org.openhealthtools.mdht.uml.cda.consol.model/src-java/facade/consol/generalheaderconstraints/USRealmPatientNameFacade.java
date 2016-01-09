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

public class USRealmPatientNameFacade extends facade.FacadeBase {

	public PN self;

	public USRealmPatientNameFacade()
	{
		this.self = DatatypesFactory.eINSTANCE.createPN();
	}

	public USRealmPatientNameFacade(PN self)
	{
		this.self = self;
	}

	public static boolean isKindOf(PN self)
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
		GetOrCreateFamily();
		GetOrCreateGiven();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmPatientNameFamily(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmPatientNameGiven(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmPatientNamePrefix(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmPatientNameSuffix(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmPatientNameUse(vb, del);
			ValidateGeneralHeaderConstraintsUSRealmPatientNameUseP(vb, del);

			family().forEach(x -> x.Validate(vb, del));
			given().forEach(x -> x.Validate(vb, del));
			prefix().forEach(x -> x.Validate(vb, del));
			suffix().forEach(x -> x.Validate(vb, del));
			delimiter().forEach(x -> x.Validate(vb, del));
			validTime().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: getText(true)=''
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Flatten(Set(self).map(i1237 -> Set(i1237.getText(true)))).collect(Collectors.toList()).contains("");
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5 USRealmHeader\n\t\tConformance: \n\t\tAnalysis: US Realm Patient Name SHALL NOT contain any mixed content other than whitespace\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameFamily
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmPatientNameFamily(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i1255 -> i1255.isNullFlavorUndefined())) || One(Set(self.getFamilies()).count())==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.5.i family\n\t\tConformance: SHALL contain exactly one [1..1] family (CONF:7159, CONF:7160)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameGiven
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmPatientNameGiven(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i1275 -> i1275.isNullFlavorUndefined())) || !(Set(self.getGivens()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.5.ii given\n\t\tConformance: SHALL contain at least one [1..*] given (CONF:7157)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNamePrefix
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmPatientNamePrefix(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i1295 -> i1295.isNullFlavorUndefined())) || !(!(Set(self.getPrefixes()).count()==0) && Set(self.getPrefixes()).anyMatch(i1296 -> Set(i1296).anyMatch(i1297 -> i1297.isNullFlavorUndefined()))) || !(Set(self.getPrefixes()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.5.iii prefix\n\t\tConformance: MAY contain zero or more [0..*] prefix (CONF:7155)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameSuffix
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmPatientNameSuffix(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i1319 -> i1319.isNullFlavorUndefined())) || !(!(Set(self.getSuffixes()).count()==0) && Set(self.getSuffixes()).anyMatch(i1320 -> Set(i1320).anyMatch(i1321 -> i1321.isNullFlavorUndefined()))) || One(Set(self.getSuffixes()).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.5.iv suffix\n\t\tConformance: MAY contain zero or one [0..1] suffix (CONF:7161)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::EntityNameUse) and  let value : vocab::EntityNameUse = element.oclAsType(vocab::EntityNameUse) in  value = vocab::EntityNameUse::A or value = vocab::EntityNameUse::ABC or value = vocab::EntityNameUse::ASGN or value = vocab::EntityNameUse::C or value = vocab::EntityNameUse::I or value = vocab::EntityNameUse::IDE or value = vocab::EntityNameUse::L or value = vocab::EntityNameUse::P or value = vocab::EntityNameUse::PHON or value = vocab::EntityNameUse::R or value = vocab::EntityNameUse::SNDX or value = vocab::EntityNameUse::SRCH or value = vocab::EntityNameUse::SYL)) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameUse
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmPatientNameUse(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i1343 -> i1343.isNullFlavorUndefined())) || Set(self.getUses()).count()==0 || Set(self.getUses()).allMatch(i1344 -> !(Set(i1344).count()==0) && true && Set(i1344).filter(i1347 -> Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.A) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.ABC) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.ASGN) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.C) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.I) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.IDE) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.L) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.P) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.PHON) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.R) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.SNDX) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.SRCH) || Set(i1347).collect(Collectors.toList()).contains(EntityNameUse.SYL)).count()!=0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.5.v use\n\t\tConformance: MAY contain zero or one [0..1] @use (CONF:7154), which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
	 * Context Class: consol::GeneralHeaderConstraints::USRealmPatientName
	 * Constraint Name: consol::GeneralHeaderConstraints::USRealmPatientName::GeneralHeaderConstraintsUSRealmPatientNameUseP
	 */
	public boolean ValidateGeneralHeaderConstraintsUSRealmPatientNameUseP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i1369 -> i1369.isNullFlavorUndefined())) || Set(self.getUses()).count()==0 || One(Set(self.getUses()).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.5.v use\n\t\tConformance: MAY contain zero or one [0..1] @use (CONF:7154), which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.ENXPFacade> family()
	{
		return Set(self.getFamilies()).filter( x -> x instanceof ENXP).map( x -> (ENXP) x).map( x -> new facade.datatypes.ENXPFacade(x));
	}

	public facade.datatypes.ENXPFacade GetOrCreateFamily()
	{
		Optional<facade.datatypes.ENXPFacade> lastOrDefault = family().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Family());
			return lastOrDefault.get();
		}
		return CreateAnotherFamily();
	}

	public facade.datatypes.ENXPFacade CreateAnotherFamily()
	{
		ENXP element = DatatypesFactory.eINSTANCE.createENXP();
		facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
		elementFacade.Init();
		self.getFamilies().add(element);
		return elementFacade;
	}

	public facade.datatypes.ENXPFacade Family() {
		return GetOrCreateFamily();
	}

	public Stream<facade.datatypes.ENXPFacade> given()
	{
		return Set(self.getGivens()).filter( x -> x instanceof ENXP).map( x -> (ENXP) x).map( x -> new facade.datatypes.ENXPFacade(x));
	}

	public facade.datatypes.ENXPFacade GetOrCreateGiven()
	{
		Optional<facade.datatypes.ENXPFacade> lastOrDefault = given().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Given());
			return lastOrDefault.get();
		}
		return CreateAnotherGiven();
	}

	public facade.datatypes.ENXPFacade CreateAnotherGiven()
	{
		ENXP element = DatatypesFactory.eINSTANCE.createENXP();
		facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
		elementFacade.Init();
		self.getGivens().add(element);
		return elementFacade;
	}

	public facade.datatypes.ENXPFacade Given() {
		return GetOrCreateGiven();
	}

	public Stream<facade.datatypes.ENXPFacade> prefix()
	{
		return Set(self.getPrefixes()).filter( x -> x instanceof ENXP).map( x -> (ENXP) x).map( x -> new facade.datatypes.ENXPFacade(x));
	}

	public facade.datatypes.ENXPFacade GetOrCreatePrefix()
	{
		Optional<facade.datatypes.ENXPFacade> lastOrDefault = prefix().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Prefix());
			return lastOrDefault.get();
		}
		return CreateAnotherPrefix();
	}

	public facade.datatypes.ENXPFacade CreateAnotherPrefix()
	{
		ENXP element = DatatypesFactory.eINSTANCE.createENXP();
		facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
		elementFacade.Init();
		self.getPrefixes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ENXPFacade Prefix() {
		return GetOrCreatePrefix();
	}

	public Stream<facade.datatypes.ENXPFacade> suffix()
	{
		return Set(self.getSuffixes()).filter( x -> x instanceof ENXP).map( x -> (ENXP) x).map( x -> new facade.datatypes.ENXPFacade(x));
	}

	public facade.datatypes.ENXPFacade GetOrCreateSuffix()
	{
		Optional<facade.datatypes.ENXPFacade> lastOrDefault = suffix().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Suffix());
			return lastOrDefault.get();
		}
		return CreateAnotherSuffix();
	}

	public facade.datatypes.ENXPFacade CreateAnotherSuffix()
	{
		ENXP element = DatatypesFactory.eINSTANCE.createENXP();
		facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
		elementFacade.Init();
		self.getSuffixes().add(element);
		return elementFacade;
	}

	public facade.datatypes.ENXPFacade Suffix() {
		return GetOrCreateSuffix();
	}

	public Stream<EntityNameUse> use()
	{
		return Set(self.getUses());
	}

	public EntityNameUse GetOrCreateUse()
	{
		Optional<EntityNameUse> lastOrDefault = use().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Use());
			return lastOrDefault.get();
		}
		return CreateAnotherUse();
	}

	public EntityNameUse CreateAnotherUse()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Use());
		EntityNameUse element = EntityNameUse.get(0);
		self.getUses().add(element);
		return element;
	}

	public EntityNameUse Use() {
		return GetOrCreateUse();
	}

	public void Use(EntityNameUse value) {
		self.getUses().add(value);
	}

	public Stream<facade.datatypes.ENXPFacade> delimiter()
	{
		return Set(self.getDelimiters()).filter( x -> x instanceof ENXP).map( x -> (ENXP) x).map( x -> new facade.datatypes.ENXPFacade(x));
	}

	public facade.datatypes.ENXPFacade GetOrCreateDelimiter()
	{
		Optional<facade.datatypes.ENXPFacade> lastOrDefault = delimiter().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Delimiter());
			return lastOrDefault.get();
		}
		return CreateAnotherDelimiter();
	}

	public facade.datatypes.ENXPFacade CreateAnotherDelimiter()
	{
		ENXP element = DatatypesFactory.eINSTANCE.createENXP();
		facade.datatypes.ENXPFacade elementFacade = new facade.datatypes.ENXPFacade(element);
		elementFacade.Init();
		self.getDelimiters().add(element);
		return elementFacade;
	}

	public facade.datatypes.ENXPFacade Delimiter() {
		return GetOrCreateDelimiter();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Part());
			return lastOrDefault.get();
		}
		return CreateAnotherPart();
	}

	public String CreateAnotherPart()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Part());
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

	public Stream<facade.datatypes.IVL_TSFacade> validTime()
	{
		return Set(self.getValidTime()).filter( x -> x instanceof IVL_TS).map( x -> (IVL_TS) x).map( x -> new facade.datatypes.IVL_TSFacade(x));
	}

	public facade.datatypes.IVL_TSFacade GetOrCreateValidTime()
	{
		Optional<facade.datatypes.IVL_TSFacade> lastOrDefault = validTime().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_ValidTime());
			return lastOrDefault.get();
		}
		return CreateAnotherValidTime();
	}

	public facade.datatypes.IVL_TSFacade CreateAnotherValidTime()
	{
		IVL_TS element = DatatypesFactory.eINSTANCE.createIVL_TS();
		facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
		elementFacade.Init();
		self.setValidTime(element);
		return elementFacade;
	}

	public facade.datatypes.IVL_TSFacade ValidTime() {
		return GetOrCreateValidTime();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Mixed());
			return lastOrDefault.get();
		}
		return CreateAnotherText();
	}

	public String CreateAnotherText()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getEN_Mixed());
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
