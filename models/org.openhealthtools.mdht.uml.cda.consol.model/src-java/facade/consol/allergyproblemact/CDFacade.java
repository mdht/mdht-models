package facade.consol.allergyproblemact;

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

public class CDFacade extends facade.FacadeBase {

	public CD self;

	public CDFacade()
	{
		this.self = DatatypesFactory.eINSTANCE.createCD();
	}

	public CDFacade(CD self)
	{
		this.self = self;
	}

	public static boolean isKindOf(CD self)
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
		GetOrCreateCode();
		GetOrCreateCodeSystem();
	}

	/**
	 *UML path: /AllergyProblemAct/code
	 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection/entry/allergyProblemAct/code
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateAllergyProblemActCDCodeAndCodeSystemValues(vb, del);
			ValidateAllergyProblemActCDCode(vb, del);
			ValidateAllergyProblemActCDCodeSystem(vb, del);

			originalText().forEach(x -> x.Validate(vb, del));
			qualifier().forEach(x -> x.Validate(vb, del));
			translation().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: (code = 'CONC' and codeSystem = '2.16.840.1.113883.5.6') or (code = '48765-2' and codeSystem = '2.16.840.1.113883.6.1')
	 * Context: /AllergyProblemAct/code
	 * Context Class: consol::AllergyProblemAct::CD
	 * Constraint Name: consol::AllergyProblemAct::CD::AllergyProblemActCDCodeAndCodeSystemValues
	 */
	public boolean ValidateAllergyProblemActCDCodeAndCodeSystemValues(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getCode()).collect(Collectors.toList()).contains("CONC") && Set(self.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.6") || Set(self.getCode()).collect(Collectors.toList()).contains("48765-2") && Set(self.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.6.1");
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.5.iii AllergyProblemActCDCodeAndCodeSystemValues\n\t\tConformance: /@code SHALL=\"CONC\" Concern (CodeSystem: HL7ActClass 2.16.840.1.113883.5.6) or code/@code SHALL=\"48765-2\" Allergies, adverse reactions, alerts (CodeSystem: LOINC 2.16.840.1.113883.6.1 STATIC) (CONF:NEW)\n\t\tAnalysis: /@code SHALL=\"CONC\" Concern (CodeSystem: HL7ActClass 2.16.840.1.113883.5.6) or code/@code SHALL=\"48765-2\" Allergies, adverse reactions, alerts (CodeSystem: LOINC 2.16.840.1.113883.6.1 STATIC)\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (not self.code.oclIsUndefined() ))
	 * Context: /AllergyProblemAct/code
	 * Context Class: consol::AllergyProblemAct::CD
	 * Constraint Name: consol::AllergyProblemAct::CD::AllergyProblemActCDCode
	 */
	public boolean ValidateAllergyProblemActCDCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i4234 -> i4234.isNullFlavorUndefined())) || !(Set(self.getCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.5.i code\n\t\tConformance: SHALL contain exactly one [1..1] code (CONF:NEW)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (not self.codeSystem.oclIsUndefined() ))
	 * Context: /AllergyProblemAct/code
	 * Context Class: consol::AllergyProblemAct::CD
	 * Constraint Name: consol::AllergyProblemAct::CD::AllergyProblemActCDCodeSystem
	 */
	public boolean ValidateAllergyProblemActCDCodeSystem(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i4268 -> i4268.isNullFlavorUndefined())) || !(Set(self.getCodeSystem()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.5.ii codeSystem\n\t\tConformance: SHALL contain exactly one [1..1] codeSystem (CONF:NEW)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<String> code()
	{
		return Set(self.getCode());
	}

	public String GetOrCreateCode()
	{
		Optional<String> lastOrDefault = code().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_Code());
			return lastOrDefault.get();
		}
		return CreateAnotherCode();
	}

	public String CreateAnotherCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_Code());
		String element = "";
		self.setCode(element);
		return element;
	}

	public String Code() {
		return GetOrCreateCode();
	}

	public void Code(String value) {
		self.setCode(value);
	}

	public Stream<String> codeSystem()
	{
		return Set(self.getCodeSystem());
	}

	public String GetOrCreateCodeSystem()
	{
		Optional<String> lastOrDefault = codeSystem().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_CodeSystem());
			return lastOrDefault.get();
		}
		return CreateAnotherCodeSystem();
	}

	public String CreateAnotherCodeSystem()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_CodeSystem());
		String element = "";
		self.setCodeSystem(element);
		return element;
	}

	public String CodeSystem() {
		return GetOrCreateCodeSystem();
	}

	public void CodeSystem(String value) {
		self.setCodeSystem(value);
	}

	public Stream<facade.datatypes.EDFacade> originalText()
	{
		return Set(self.getOriginalText()).filter( x -> x instanceof ED).map( x -> (ED) x).map( x -> new facade.datatypes.EDFacade(x));
	}

	public facade.datatypes.EDFacade GetOrCreateOriginalText()
	{
		Optional<facade.datatypes.EDFacade> lastOrDefault = originalText().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_OriginalText());
			return lastOrDefault.get();
		}
		return CreateAnotherOriginalText();
	}

	public facade.datatypes.EDFacade CreateAnotherOriginalText()
	{
		ED element = DatatypesFactory.eINSTANCE.createED();
		facade.datatypes.EDFacade elementFacade = new facade.datatypes.EDFacade(element);
		elementFacade.Init();
		self.setOriginalText(element);
		return elementFacade;
	}

	public facade.datatypes.EDFacade OriginalText() {
		return GetOrCreateOriginalText();
	}

	public Stream<facade.datatypes.CRFacade> qualifier()
	{
		return Set(self.getQualifiers()).filter( x -> x instanceof CR).map( x -> (CR) x).map( x -> new facade.datatypes.CRFacade(x));
	}

	public facade.datatypes.CRFacade GetOrCreateQualifier()
	{
		Optional<facade.datatypes.CRFacade> lastOrDefault = qualifier().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_Qualifier());
			return lastOrDefault.get();
		}
		return CreateAnotherQualifier();
	}

	public facade.datatypes.CRFacade CreateAnotherQualifier()
	{
		CR element = DatatypesFactory.eINSTANCE.createCR();
		facade.datatypes.CRFacade elementFacade = new facade.datatypes.CRFacade(element);
		elementFacade.Init();
		self.getQualifiers().add(element);
		return elementFacade;
	}

	public facade.datatypes.CRFacade Qualifier() {
		return GetOrCreateQualifier();
	}

	public Stream<facade.datatypes.CDFacade> translation()
	{
		return Set(self.getTranslations()).filter( x -> x instanceof CD).map( x -> (CD) x).map( x -> new facade.datatypes.CDFacade(x));
	}

	public facade.datatypes.CDFacade GetOrCreateTranslation()
	{
		Optional<facade.datatypes.CDFacade> lastOrDefault = translation().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_Translation());
			return lastOrDefault.get();
		}
		return CreateAnotherTranslation();
	}

	public facade.datatypes.CDFacade CreateAnotherTranslation()
	{
		CD element = DatatypesFactory.eINSTANCE.createCD();
		facade.datatypes.CDFacade elementFacade = new facade.datatypes.CDFacade(element);
		elementFacade.Init();
		self.getTranslations().add(element);
		return elementFacade;
	}

	public facade.datatypes.CDFacade Translation() {
		return GetOrCreateTranslation();
	}

	public Stream<String> codeSystemName()
	{
		return Set(self.getCodeSystemName());
	}

	public String GetOrCreateCodeSystemName()
	{
		Optional<String> lastOrDefault = codeSystemName().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_CodeSystemName());
			return lastOrDefault.get();
		}
		return CreateAnotherCodeSystemName();
	}

	public String CreateAnotherCodeSystemName()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_CodeSystemName());
		String element = "";
		self.setCodeSystemName(element);
		return element;
	}

	public String CodeSystemName() {
		return GetOrCreateCodeSystemName();
	}

	public void CodeSystemName(String value) {
		self.setCodeSystemName(value);
	}

	public Stream<String> codeSystemVersion()
	{
		return Set(self.getCodeSystemVersion());
	}

	public String GetOrCreateCodeSystemVersion()
	{
		Optional<String> lastOrDefault = codeSystemVersion().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_CodeSystemVersion());
			return lastOrDefault.get();
		}
		return CreateAnotherCodeSystemVersion();
	}

	public String CreateAnotherCodeSystemVersion()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_CodeSystemVersion());
		String element = "";
		self.setCodeSystemVersion(element);
		return element;
	}

	public String CodeSystemVersion() {
		return GetOrCreateCodeSystemVersion();
	}

	public void CodeSystemVersion(String value) {
		self.setCodeSystemVersion(value);
	}

	public Stream<String> displayName()
	{
		return Set(self.getDisplayName());
	}

	public String GetOrCreateDisplayName()
	{
		Optional<String> lastOrDefault = displayName().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_DisplayName());
			return lastOrDefault.get();
		}
		return CreateAnotherDisplayName();
	}

	public String CreateAnotherDisplayName()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getCD_DisplayName());
		String element = "";
		self.setDisplayName(element);
		return element;
	}

	public String DisplayName() {
		return GetOrCreateDisplayName();
	}

	public void DisplayName(String value) {
		self.setDisplayName(value);
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
