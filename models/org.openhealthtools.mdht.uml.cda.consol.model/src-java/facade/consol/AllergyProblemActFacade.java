package facade.consol;

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

public class AllergyProblemActFacade extends facade.FacadeBase {

	public Act self;

	public static String TEMPLATEID = "2.16.840.1.113883.10.20.22.4.30";

	public AllergyProblemActFacade()
	{
		this.self = CDAFactory.eINSTANCE.createAct();
	}

	public AllergyProblemActFacade(Act self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Act self)
	{
		return Set(self.getTemplateIds()).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.30"));
	}

	@Override
	public Object getModelElement()
	{
		return self;
	}

	public void Init()
	{
		GetOrCreateTemplateId().self.setRoot("2.16.840.1.113883.10.20.22.4.30");
		GetOrCreateClassCode();
		self.setClassCode(ActClass.ACT);
		GetOrCreateMoodCode();
		self.setMoodCode(ActMood.EVN);
		GetOrCreateId();
		GetOrCreateCode();
		GetOrCreateStatusCode();
		GetOrCreateEffectiveTime();
		GetOrCreateEntryRelationship();
	}

	/**
	 *UML path: /AllergyProblemAct
	 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection/entry/allergyProblemAct
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateAllergyProblemActEffectiveTimeLow(vb, del);
			ValidateAllergyProblemActTemplateId(vb, del);
			ValidateAllergyProblemActClassCode(vb, del);
			ValidateAllergyProblemActMoodCode(vb, del);
			ValidateAllergyProblemActId(vb, del);
			ValidateAllergyProblemActCode(vb, del);
			ValidateAllergyProblemActStatusCodeP(vb, del);
			ValidateAllergyProblemActStatusCode(vb, del);
			ValidateAllergyProblemActEffectiveTime(vb, del);
			ValidateAllergyProblemActEntryRelationship(vb, del);

			id().forEach(x -> x.Validate(vb, del));
			code().forEach(x -> x.Validate(vb, del));
			statusCode().forEach(x -> x.Validate(vb, del));
			effectiveTime().forEach(x -> x.Validate(vb, del));
			entryRelationship().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			text().forEach(x -> x.Validate(vb, del));
			priorityCode().forEach(x -> x.Validate(vb, del));
			languageCode().forEach(x -> x.Validate(vb, del));
			subject().forEach(x -> x.Validate(vb, del));
			specimen().forEach(x -> x.Validate(vb, del));
			performer().forEach(x -> x.Validate(vb, del));
			author().forEach(x -> x.Validate(vb, del));
			informant().forEach(x -> x.Validate(vb, del));
			participant().forEach(x -> x.Validate(vb, del));
			reference().forEach(x -> x.Validate(vb, del));
			precondition().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: (self.statusCode.code = 'active') implies not self.effectiveTime.low.oclIsUndefined()
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActEffectiveTimeLow
	 */
	public boolean ValidateAllergyProblemActEffectiveTimeLow(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Flatten(Set(self.getStatusCode()).map(i3889 -> Set(i3889.getCode()))).collect(Collectors.toList()).contains("active")) || !(Flatten(Set(self.getEffectiveTime()).map(i3890 -> Set(i3890.getLow()))).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.9 AllergyProblemActEffectiveTimeLow\n\t\tConformance: SHALL satisfy: AllergyProblemActEffectiveTimeLow (CONF:7504)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.30')
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActTemplateId
	 */
	public boolean ValidateAllergyProblemActTemplateId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getTemplateIds()).anyMatch(i3921 -> Set(i3921.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.30"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.1 templateId\n\t\tConformance: SHALL contain exactly one [1..1] templateId ( CONF:7471, CONF:10489 ) such that it SHALL contain exactly one [1..1] @root=\"2.16.840.1.113883.10.20.22.4.30\"\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActClassCode
	 */
	public boolean ValidateAllergyProblemActClassCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getClassCode()).collect(Collectors.toList()).contains(x_ActClassDocumentEntryAct.ACT);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.2 classCode\n\t\tConformance: SHALL contain exactly one [1..1] @classCode=\"ACT\" Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:7469)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.moodCode=vocab::x_DocumentActMood::EVN
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActMoodCode
	 */
	public boolean ValidateAllergyProblemActMoodCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getMoodCode()).collect(Collectors.toList()).contains(x_DocumentActMood.EVN);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.3 moodCode\n\t\tConformance: SHALL contain exactly one [1..1] @moodCode=\"EVN\" Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:7470)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id->isEmpty()
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActId
	 */
	public boolean ValidateAllergyProblemActId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getIds()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.4 id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:7472)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.code.oclIsUndefined()
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActCode
	 */
	public boolean ValidateAllergyProblemActCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.5 code\n\t\tConformance: SHALL contain exactly one [1..1] code (CONF:NEW)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: true
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActStatusCodeP
	 */
	public boolean ValidateAllergyProblemActStatusCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = true;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.6 statusCode\n\t\tConformance: SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet ProblemActStatusCode 2.16.840.1.113883.11.20.9.19 STATIC 2011-09-09 (CONF:7485)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and  let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in  value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed'
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActStatusCode
	 */
	public boolean ValidateAllergyProblemActStatusCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getStatusCode()).count()==0) && true && Set(self.getStatusCode()).filter(i4101 -> Set(i4101.getCode()).collect(Collectors.toList()).contains("active") || Set(i4101.getCode()).collect(Collectors.toList()).contains("suspended") || Set(i4101.getCode()).collect(Collectors.toList()).contains("aborted") || Set(i4101.getCode()).collect(Collectors.toList()).contains("completed")).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.6 statusCode\n\t\tConformance: SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet ProblemActStatusCode 2.16.840.1.113883.11.20.9.19 STATIC 2011-09-09 (CONF:7485)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.effectiveTime.oclIsUndefined()
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActEffectiveTime
	 */
	public boolean ValidateAllergyProblemActEffectiveTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getEffectiveTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.7 effectiveTime\n\t\tConformance: SHALL contain exactly one [1..1] effectiveTime (CONF:7498)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::AllergyProblemAct::AllergyObservationEntryRelationship))
	 * Context: /AllergyProblemAct
	 * Context Class: consol::AllergyProblemAct
	 * Constraint Name: consol::AllergyProblemAct::AllergyProblemActEntryRelationship
	 */
	public boolean ValidateAllergyProblemActEntryRelationship(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getEntryRelationships()).filter(i4165 -> !(Set(i4165).count()==0) && Flatten(Set(One(Set(i4165)).getObservations()).map(i4167 -> Set(i4167.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.7"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.5.8 entryRelationship\n\t\tConformance: SHALL contain exactly one [1..1] entryRelationship\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<ActClass> classCode()
	{
		return Set(self.getClassCode()).filter( x -> x instanceof ActClass).map( x -> (ActClass) x);
	}

	public ActClass GetOrCreateClassCode()
	{
		Optional<ActClass> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public ActClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_ClassCode());
		ActClass element = ActClass.get(0);
		self.setClassCode(element);
		return element;
	}

	public ActClass ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(ActClass value) {
		self.setClassCode(value);
	}

	public Stream<ActMood> moodCode()
	{
		return Set(self.getMoodCode()).filter( x -> x instanceof ActMood).map( x -> (ActMood) x);
	}

	public ActMood GetOrCreateMoodCode()
	{
		Optional<ActMood> lastOrDefault = moodCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_MoodCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMoodCode();
	}

	public ActMood CreateAnotherMoodCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_MoodCode());
		ActMood element = ActMood.get(0);
		self.setMoodCode(element);
		return element;
	}

	public ActMood MoodCode() {
		return GetOrCreateMoodCode();
	}

	public void MoodCode(ActMood value) {
		self.setMoodCode(value);
	}

	public Stream<facade.datatypes.IIFacade> id()
	{
		return Set(self.getIds()).filter( x -> x instanceof II).map( x -> (II) x).map( x -> new facade.datatypes.IIFacade(x));
	}

	public facade.datatypes.IIFacade GetOrCreateId()
	{
		Optional<facade.datatypes.IIFacade> lastOrDefault = id().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Id());
			return lastOrDefault.get();
		}
		return CreateAnotherId();
	}

	public facade.datatypes.IIFacade CreateAnotherId()
	{
		II element = DatatypesFactory.eINSTANCE.createII();
		facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
		elementFacade.Init();
		self.getIds().add(element);
		return elementFacade;
	}

	public facade.datatypes.IIFacade Id() {
		return GetOrCreateId();
	}

	public Stream<facade.consol.allergyproblemact.CDFacade> code()
	{
		return Set(self.getCode()).filter( x -> facade.consol.allergyproblemact.CDFacade.isKindOf(x)).map( x -> new facade.consol.allergyproblemact.CDFacade(x));
	}

	public facade.consol.allergyproblemact.CDFacade GetOrCreateCode()
	{
		Optional<facade.consol.allergyproblemact.CDFacade> lastOrDefault = code().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Code());
			return lastOrDefault.get();
		}
		return CreateAnotherCode();
	}

	public facade.consol.allergyproblemact.CDFacade CreateAnotherCode()
	{
		CD element = DatatypesFactory.eINSTANCE.createCD();
		facade.consol.allergyproblemact.CDFacade elementFacade = new facade.consol.allergyproblemact.CDFacade(element);
		elementFacade.Init();
		self.setCode(element);
		return elementFacade;
	}

	public facade.consol.allergyproblemact.CDFacade Code() {
		return GetOrCreateCode();
	}

	public Stream<facade.datatypes.CSFacade> statusCode()
	{
		return Set(self.getStatusCode()).filter( x -> x instanceof CS).map( x -> (CS) x).map( x -> new facade.datatypes.CSFacade(x));
	}

	public facade.datatypes.CSFacade GetOrCreateStatusCode()
	{
		Optional<facade.datatypes.CSFacade> lastOrDefault = statusCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_StatusCode());
			return lastOrDefault.get();
		}
		return CreateAnotherStatusCode();
	}

	public facade.datatypes.CSFacade CreateAnotherStatusCode()
	{
		CS element = DatatypesFactory.eINSTANCE.createCS();
		facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
		elementFacade.Init();
		self.setStatusCode(element);
		return elementFacade;
	}

	public facade.datatypes.CSFacade StatusCode() {
		return GetOrCreateStatusCode();
	}

	public Stream<facade.datatypes.IVL_TSFacade> effectiveTime()
	{
		return Set(self.getEffectiveTime()).filter( x -> x instanceof IVL_TS).map( x -> (IVL_TS) x).map( x -> new facade.datatypes.IVL_TSFacade(x));
	}

	public facade.datatypes.IVL_TSFacade GetOrCreateEffectiveTime()
	{
		Optional<facade.datatypes.IVL_TSFacade> lastOrDefault = effectiveTime().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_EffectiveTime());
			return lastOrDefault.get();
		}
		return CreateAnotherEffectiveTime();
	}

	public facade.datatypes.IVL_TSFacade CreateAnotherEffectiveTime()
	{
		IVL_TS element = DatatypesFactory.eINSTANCE.createIVL_TS();
		facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
		elementFacade.Init();
		self.setEffectiveTime(element);
		return elementFacade;
	}

	public facade.datatypes.IVL_TSFacade EffectiveTime() {
		return GetOrCreateEffectiveTime();
	}

	public Stream<facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade> entryRelationship()
	{
		return Set(self.getEntryRelationships()).filter( x -> facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade.isKindOf(x)).map( x -> new facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade(x));
	}

	public facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade GetOrCreateEntryRelationship()
	{
		Optional<facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade> lastOrDefault = entryRelationship().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_EntryRelationship());
			return lastOrDefault.get();
		}
		return CreateAnotherEntryRelationship();
	}

	public facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade CreateAnotherEntryRelationship()
	{
		EntryRelationship element = CDAFactory.eINSTANCE.createEntryRelationship();
		facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade elementFacade = new facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade(element);
		elementFacade.Init();
		self.getEntryRelationships().add(element);
		return elementFacade;
	}

	public facade.consol.allergyproblemact.AllergyObservationEntryRelationshipFacade EntryRelationship() {
		return GetOrCreateEntryRelationship();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_TemplateId());
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

	public Stream<facade.datatypes.EDFacade> text()
	{
		return Set(self.getText()).filter( x -> x instanceof ED).map( x -> (ED) x).map( x -> new facade.datatypes.EDFacade(x));
	}

	public facade.datatypes.EDFacade GetOrCreateText()
	{
		Optional<facade.datatypes.EDFacade> lastOrDefault = text().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Text());
			return lastOrDefault.get();
		}
		return CreateAnotherText();
	}

	public facade.datatypes.EDFacade CreateAnotherText()
	{
		ED element = DatatypesFactory.eINSTANCE.createED();
		facade.datatypes.EDFacade elementFacade = new facade.datatypes.EDFacade(element);
		elementFacade.Init();
		self.setText(element);
		return elementFacade;
	}

	public facade.datatypes.EDFacade Text() {
		return GetOrCreateText();
	}

	public Stream<facade.datatypes.CEFacade> priorityCode()
	{
		return Set(self.getPriorityCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreatePriorityCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = priorityCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_PriorityCode());
			return lastOrDefault.get();
		}
		return CreateAnotherPriorityCode();
	}

	public facade.datatypes.CEFacade CreateAnotherPriorityCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setPriorityCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade PriorityCode() {
		return GetOrCreatePriorityCode();
	}

	public Stream<facade.datatypes.CSFacade> languageCode()
	{
		return Set(self.getLanguageCode()).filter( x -> x instanceof CS).map( x -> (CS) x).map( x -> new facade.datatypes.CSFacade(x));
	}

	public facade.datatypes.CSFacade GetOrCreateLanguageCode()
	{
		Optional<facade.datatypes.CSFacade> lastOrDefault = languageCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_LanguageCode());
			return lastOrDefault.get();
		}
		return CreateAnotherLanguageCode();
	}

	public facade.datatypes.CSFacade CreateAnotherLanguageCode()
	{
		CS element = DatatypesFactory.eINSTANCE.createCS();
		facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
		elementFacade.Init();
		self.setLanguageCode(element);
		return elementFacade;
	}

	public facade.datatypes.CSFacade LanguageCode() {
		return GetOrCreateLanguageCode();
	}

	public Stream<facade.cda.SubjectFacade> subject()
	{
		return Set(self.getSubject()).filter( x -> facade.cda.SubjectFacade.isKindOf(x)).map( x -> new facade.cda.SubjectFacade(x));
	}

	public facade.cda.SubjectFacade GetOrCreateSubject()
	{
		Optional<facade.cda.SubjectFacade> lastOrDefault = subject().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Subject());
			return lastOrDefault.get();
		}
		return CreateAnotherSubject();
	}

	public facade.cda.SubjectFacade CreateAnotherSubject()
	{
		Subject element = CDAFactory.eINSTANCE.createSubject();
		facade.cda.SubjectFacade elementFacade = new facade.cda.SubjectFacade(element);
		elementFacade.Init();
		self.setSubject(element);
		return elementFacade;
	}

	public facade.cda.SubjectFacade Subject() {
		return GetOrCreateSubject();
	}

	public Stream<facade.cda.SpecimenFacade> specimen()
	{
		return Set(self.getSpecimens()).filter( x -> facade.cda.SpecimenFacade.isKindOf(x)).map( x -> new facade.cda.SpecimenFacade(x));
	}

	public facade.cda.SpecimenFacade GetOrCreateSpecimen()
	{
		Optional<facade.cda.SpecimenFacade> lastOrDefault = specimen().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Specimen());
			return lastOrDefault.get();
		}
		return CreateAnotherSpecimen();
	}

	public facade.cda.SpecimenFacade CreateAnotherSpecimen()
	{
		Specimen element = CDAFactory.eINSTANCE.createSpecimen();
		facade.cda.SpecimenFacade elementFacade = new facade.cda.SpecimenFacade(element);
		elementFacade.Init();
		self.getSpecimens().add(element);
		return elementFacade;
	}

	public facade.cda.SpecimenFacade Specimen() {
		return GetOrCreateSpecimen();
	}

	public Stream<facade.cda.Performer2Facade> performer()
	{
		return Set(self.getPerformers()).filter( x -> facade.cda.Performer2Facade.isKindOf(x)).map( x -> new facade.cda.Performer2Facade(x));
	}

	public facade.cda.Performer2Facade GetOrCreatePerformer()
	{
		Optional<facade.cda.Performer2Facade> lastOrDefault = performer().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Performer());
			return lastOrDefault.get();
		}
		return CreateAnotherPerformer();
	}

	public facade.cda.Performer2Facade CreateAnotherPerformer()
	{
		Performer2 element = CDAFactory.eINSTANCE.createPerformer2();
		facade.cda.Performer2Facade elementFacade = new facade.cda.Performer2Facade(element);
		elementFacade.Init();
		self.getPerformers().add(element);
		return elementFacade;
	}

	public facade.cda.Performer2Facade Performer() {
		return GetOrCreatePerformer();
	}

	public Stream<facade.cda.AuthorFacade> author()
	{
		return Set(self.getAuthors()).filter( x -> facade.cda.AuthorFacade.isKindOf(x)).map( x -> new facade.cda.AuthorFacade(x));
	}

	public facade.cda.AuthorFacade GetOrCreateAuthor()
	{
		Optional<facade.cda.AuthorFacade> lastOrDefault = author().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Author());
			return lastOrDefault.get();
		}
		return CreateAnotherAuthor();
	}

	public facade.cda.AuthorFacade CreateAnotherAuthor()
	{
		Author element = CDAFactory.eINSTANCE.createAuthor();
		facade.cda.AuthorFacade elementFacade = new facade.cda.AuthorFacade(element);
		elementFacade.Init();
		self.getAuthors().add(element);
		return elementFacade;
	}

	public facade.cda.AuthorFacade Author() {
		return GetOrCreateAuthor();
	}

	public Stream<facade.cda.Informant12Facade> informant()
	{
		return Set(self.getInformants()).filter( x -> facade.cda.Informant12Facade.isKindOf(x)).map( x -> new facade.cda.Informant12Facade(x));
	}

	public facade.cda.Informant12Facade GetOrCreateInformant()
	{
		Optional<facade.cda.Informant12Facade> lastOrDefault = informant().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Informant());
			return lastOrDefault.get();
		}
		return CreateAnotherInformant();
	}

	public facade.cda.Informant12Facade CreateAnotherInformant()
	{
		Informant12 element = CDAFactory.eINSTANCE.createInformant12();
		facade.cda.Informant12Facade elementFacade = new facade.cda.Informant12Facade(element);
		elementFacade.Init();
		self.getInformants().add(element);
		return elementFacade;
	}

	public facade.cda.Informant12Facade Informant() {
		return GetOrCreateInformant();
	}

	public Stream<facade.cda.Participant2Facade> participant()
	{
		return Set(self.getParticipants()).filter( x -> facade.cda.Participant2Facade.isKindOf(x)).map( x -> new facade.cda.Participant2Facade(x));
	}

	public facade.cda.Participant2Facade GetOrCreateParticipant()
	{
		Optional<facade.cda.Participant2Facade> lastOrDefault = participant().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Participant());
			return lastOrDefault.get();
		}
		return CreateAnotherParticipant();
	}

	public facade.cda.Participant2Facade CreateAnotherParticipant()
	{
		Participant2 element = CDAFactory.eINSTANCE.createParticipant2();
		facade.cda.Participant2Facade elementFacade = new facade.cda.Participant2Facade(element);
		elementFacade.Init();
		self.getParticipants().add(element);
		return elementFacade;
	}

	public facade.cda.Participant2Facade Participant() {
		return GetOrCreateParticipant();
	}

	public Stream<facade.cda.ReferenceFacade> reference()
	{
		return Set(self.getReferences()).filter( x -> facade.cda.ReferenceFacade.isKindOf(x)).map( x -> new facade.cda.ReferenceFacade(x));
	}

	public facade.cda.ReferenceFacade GetOrCreateReference()
	{
		Optional<facade.cda.ReferenceFacade> lastOrDefault = reference().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Reference());
			return lastOrDefault.get();
		}
		return CreateAnotherReference();
	}

	public facade.cda.ReferenceFacade CreateAnotherReference()
	{
		Reference element = CDAFactory.eINSTANCE.createReference();
		facade.cda.ReferenceFacade elementFacade = new facade.cda.ReferenceFacade(element);
		elementFacade.Init();
		self.getReferences().add(element);
		return elementFacade;
	}

	public facade.cda.ReferenceFacade Reference() {
		return GetOrCreateReference();
	}

	public Stream<facade.cda.PreconditionFacade> precondition()
	{
		return Set(self.getPreconditions()).filter( x -> facade.cda.PreconditionFacade.isKindOf(x)).map( x -> new facade.cda.PreconditionFacade(x));
	}

	public facade.cda.PreconditionFacade GetOrCreatePrecondition()
	{
		Optional<facade.cda.PreconditionFacade> lastOrDefault = precondition().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_Precondition());
			return lastOrDefault.get();
		}
		return CreateAnotherPrecondition();
	}

	public facade.cda.PreconditionFacade CreateAnotherPrecondition()
	{
		Precondition element = CDAFactory.eINSTANCE.createPrecondition();
		facade.cda.PreconditionFacade elementFacade = new facade.cda.PreconditionFacade(element);
		elementFacade.Init();
		self.getPreconditions().add(element);
		return elementFacade;
	}

	public facade.cda.PreconditionFacade Precondition() {
		return GetOrCreatePrecondition();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_NullFlavor());
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

	public Stream<Boolean> negationInd()
	{
		return Set(self.getNegationInd());
	}

	public Boolean GetOrCreateNegationInd()
	{
		Optional<Boolean> lastOrDefault = negationInd().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_NegationInd());
			return lastOrDefault.get();
		}
		return CreateAnotherNegationInd();
	}

	public Boolean CreateAnotherNegationInd()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAct_NegationInd());
		Boolean element = Boolean.FALSE;
		self.setNegationInd(element);
		return element;
	}

	public Boolean NegationInd() {
		return GetOrCreateNegationInd();
	}

	public void NegationInd(Boolean value) {
		self.setNegationInd(value);
	}

}
