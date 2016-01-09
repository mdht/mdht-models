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

public class AllergyObservationFacade extends facade.FacadeBase {

	public Observation self;

	public static String TEMPLATEID = "2.16.840.1.113883.10.20.22.4.7";

	public AllergyObservationFacade()
	{
		this.self = CDAFactory.eINSTANCE.createObservation();
	}

	public AllergyObservationFacade(Observation self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Observation self)
	{
		return Set(self.getTemplateIds()).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.7"));
	}

	@Override
	public Object getModelElement()
	{
		return self;
	}

	public void Init()
	{
		GetOrCreateTemplateId().self.setRoot("2.16.840.1.113883.10.20.22.4.7");
		GetOrCreateClassCode();
		self.setClassCode(ActClass.OBS);
		GetOrCreateMoodCode();
		self.setMoodCode(ActMood.EVN);
		GetOrCreateId();
		GetOrCreateCode();
		GetOrCreateCode().self.setCode("ASSERTION");
		GetOrCreateCode().self.setCodeSystem("2.16.840.1.113883.5.4");
		GetOrCreateStatusCode();
		GetOrCreateStatusCode().self.setCode("completed");
		GetOrCreateStatusCode().self.setCodeSystem("2.16.840.1.113883.5.14");
		GetOrCreateEffectiveTime();
		GetOrCreateValue();
		GetOrCreateEntryRelationship();
	}

	/**
	 *UML path: /AllergyObservation
	 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection/entry/allergyProblemAct/entryRelationship/allergyObservation
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateAllergyObservationValueOriginalText(vb, del);
			ValidateAllergyObservationOriginalTextReference(vb, del);
			ValidateAllergyObservationOriginalTextReferenceValue(vb, del);
			ValidateAllergyObservationReferenceValue(vb, del);
			ValidateAllergyObservationAllergyStatusInversionIndicator(vb, del);
			ValidateAllergyObservationReactionInversionIndicator(vb, del);
			ValidateAllergyObservationTemplateId(vb, del);
			ValidateAllergyObservationClassCode(vb, del);
			ValidateAllergyObservationMoodCode(vb, del);
			ValidateAllergyObservationId(vb, del);
			ValidateAllergyObservationCodeP(vb, del);
			ValidateAllergyObservationCode(vb, del);
			ValidateAllergyObservationStatusCodeP(vb, del);
			ValidateAllergyObservationStatusCode(vb, del);
			ValidateAllergyObservationEffectiveTime(vb, del);
			ValidateAllergyObservationValueP(vb, del);
			ValidateAllergyObservationValue(vb, del);
			ValidateAllergyObservationParticipant(vb, del);
			ValidateAllergyObservationEntryRelationship(vb, del);
			ValidateAllergyObservationEntryRelationship(vb, del);
			ValidateAllergyObservationEntryRelationship(vb, del);

			id().forEach(x -> x.Validate(vb, del));
			code().forEach(x -> x.Validate(vb, del));
			statusCode().forEach(x -> x.Validate(vb, del));
			effectiveTime().forEach(x -> x.Validate(vb, del));
			value().forEach(x -> x.Validate(vb, del));
			participant().forEach(x -> x.Validate(vb, del));
			entryRelationship().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			derivationExpr().forEach(x -> x.Validate(vb, del));
			text().forEach(x -> x.Validate(vb, del));
			priorityCode().forEach(x -> x.Validate(vb, del));
			repeatNumber().forEach(x -> x.Validate(vb, del));
			languageCode().forEach(x -> x.Validate(vb, del));
			interpretationCode().forEach(x -> x.Validate(vb, del));
			methodCode().forEach(x -> x.Validate(vb, del));
			targetSiteCode().forEach(x -> x.Validate(vb, del));
			subject().forEach(x -> x.Validate(vb, del));
			specimen().forEach(x -> x.Validate(vb, del));
			performer().forEach(x -> x.Validate(vb, del));
			author().forEach(x -> x.Validate(vb, del));
			informant().forEach(x -> x.Validate(vb, del));
			reference().forEach(x -> x.Validate(vb, del));
			precondition().forEach(x -> x.Validate(vb, del));
			referenceRange().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.value.oclAsType(datatypes::CD).originalText->size() = 1
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationValueOriginalText
	 */
	public boolean ValidateAllergyObservationValueOriginalText(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = One(Flatten(Flatten(Set(self.getValues()).map(i4343 -> Set(Flatten(Set(i4343).map(i4344 -> Set((CD) i4344)))))).map(i4345 -> Set(i4345.getOriginalText()))).count())==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.15 AllergyObservationValueOriginalText\n\t\tConformance: value SHOULD contain zero or one [0..1] originalText (CONF:7422)\n\t\tAnalysis: value SHOULD contain zero or one [0..1] originalText\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.value.oclAsType(datatypes::CD).originalText->size() = 1 implies self.value.oclAsType(datatypes::CD).originalText->one(reference->size() = 1)
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationOriginalTextReference
	 */
	public boolean ValidateAllergyObservationOriginalTextReference(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(One(Flatten(Flatten(Set(self.getValues()).map(i4387 -> Set(Flatten(Set(i4387).map(i4388 -> Set((CD) i4388)))))).map(i4389 -> Set(i4389.getOriginalText()))).count())==1) || Flatten(Flatten(Set(self.getValues()).map(i4390 -> Set(Flatten(Set(i4390).map(i4391 -> Set((CD) i4391)))))).map(i4392 -> Set(i4392.getOriginalText()))).filter(i4393 -> One(Set(i4393.getReference()).count())==1).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.16 AllergyObservationOriginalTextReference\n\t\tConformance: originalText, if present, MAY contain zero or one [0..1] reference (CONF:15949)\n\t\tAnalysis: originalText, if present, MAY contain zero or one [0..1] reference\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.value.oclAsType(datatypes::CD).originalText.reference->size() = 1 implies self.value.oclAsType(datatypes::CD).originalText.reference.value->size() = 1
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationOriginalTextReferenceValue
	 */
	public boolean ValidateAllergyObservationOriginalTextReferenceValue(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(One(Flatten(Flatten(Flatten(Set(self.getValues()).map(i4439 -> Set(Flatten(Set(i4439).map(i4440 -> Set((CD) i4440)))))).map(i4441 -> Set(i4441.getOriginalText()))).map(i4442 -> Set(i4442.getReference()))).count())==1) || One(Flatten(Flatten(Flatten(Flatten(Set(self.getValues()).map(i4443 -> Set(Flatten(Set(i4443).map(i4444 -> Set((CD) i4444)))))).map(i4445 -> Set(i4445.getOriginalText()))).map(i4446 -> Set(i4446.getReference()))).map(i4447 -> Set(i4447.getValue()))).count())==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.16 AllergyObservationOriginalTextReference\n\t\tConformance: originalText, if present, MAY contain zero or one [0..1] reference (CONF:15949)\n\t\tAnalysis: reference, if present, SHOULD contain zero or one [0..1] reference/@value\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.code.originalText.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationReferenceValue
	 */
	public boolean ValidateAllergyObservationReferenceValue(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Flatten(Flatten(Flatten(Set(self.getCode()).map(i4495 -> Set(i4495.getOriginalText()))).map(i4496 -> Set(i4496.getReference()))).map(i4497 -> Set(i4497.getValue()))).count()==0 || !(Flatten(Flatten(Flatten(Set(self).map(i4498 -> Set(i4498.getSection()))).map(i4499 -> Set(i4499.getText()))).map(i4507 -> Set(i4507.getText(Flatten(Flatten(Flatten(Flatten(Set(self.getCode()).map(i4500 -> Set(i4500.getOriginalText()))).map(i4501 -> Set(i4501.getReference()))).map(i4502 -> Set(i4502.getValue()))).map(i4506 -> Set(i4506.substring(2, One(Flatten(Flatten(Flatten(Set(self.getCode()).map(i4503 -> Set(i4503.getOriginalText()))).map(i4504 -> Set(i4504.getReference()))).map(i4505 -> Set(i4505.getValue())))).length())))))))).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.17 AllergyObservationReferenceValue\n\t\tConformance: reference/@value SHALL begin with a '#' and SHALL point to its corresponding narrative (CONF:15951)\n\t\tAnalysis: reference/@value SHALL begin with a '#' and SHALL point to its corresponding narrative\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::AllergyStatusObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationAllergyStatusInversionIndicator
	 */
	public boolean ValidateAllergyObservationAllergyStatusInversionIndicator(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getEntryRelationships()).filter(i4559 -> Flatten(Set(One(Set(i4559.getObservation()))).map(i4561 -> Set(i4561.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.28"))).allMatch(i4562 -> Set(i4562.getInversionInd()).collect(Collectors.toList()).contains(true));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.18 AllergyObservationAllergyStatusInversionIndicator\n\t\tConformance: entryRelationship with target entry AllergyStatusObservation SHALL contain exactly one [1..1] @inversionInd=\"true\" True (CONF:7446)\n\t\tAnalysis: entryRelationship with target entry AllergyStatusObservation SHALL contain exactly one [1..1] @inversionInd=\"true\" True\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationReactionInversionIndicator
	 */
	public boolean ValidateAllergyObservationReactionInversionIndicator(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getEntryRelationships()).filter(i4605 -> Flatten(Set(One(Set(i4605.getObservation()))).map(i4607 -> Set(i4607.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.9"))).allMatch(i4608 -> Set(i4608.getInversionInd()).collect(Collectors.toList()).contains(true));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.19 AllergyObservationReactionInversionIndicator\n\t\tConformance: entryRelationship with target entry Reaction Observation SHALL contain exactly one [1..1] @inversionInd=\"true\" True (CONF:7449)\n\t\tAnalysis: entryRelationship with target entry Reaction Observation SHALL contain exactly one [1..1] @inversionInd=\"true\" True\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.7')
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationTemplateId
	 */
	public boolean ValidateAllergyObservationTemplateId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getTemplateIds()).anyMatch(i4651 -> Set(i4651.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.4.7"));
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.1 templateId\n\t\tConformance: SHALL contain exactly one [1..1] templateId ( CONF:7381, CONF:10488 ) such that it SHALL contain exactly one [1..1] @root=\"2.16.840.1.113883.10.20.22.4.7\"\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.classCode=vocab::ActClassObservation::OBS
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationClassCode
	 */
	public boolean ValidateAllergyObservationClassCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getClassCode()).collect(Collectors.toList()).contains(ActClassObservation.OBS);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.2 classCode\n\t\tConformance: SHALL contain exactly one [1..1] @classCode=\"OBS\" Observation (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:7379)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationMoodCode
	 */
	public boolean ValidateAllergyObservationMoodCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getMoodCode()).collect(Collectors.toList()).contains(x_ActMoodDocumentObservation.EVN);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.3 moodCode\n\t\tConformance: SHALL contain exactly one [1..1] @moodCode=\"EVN\" Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:7380)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.id->isEmpty()
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationId
	 */
	public boolean ValidateAllergyObservationId(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getIds()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.4 id\n\t\tConformance: SHALL contain at least one [1..*] id (CONF:7382)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.code.oclIsUndefined()
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationCodeP
	 */
	public boolean ValidateAllergyObservationCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.5 code\n\t\tConformance: SHALL contain exactly one [1..1] code (CONF:15947)/@code=\"ASSERTION\"  (CodeSystem: 2.16.840.1.113883.5.4 HL7ActCode) (CONF:15948)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and  let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in  value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationCode
	 */
	public boolean ValidateAllergyObservationCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getCode()).count()==0) && true && Set(self.getCode()).filter(i4851 -> Set(i4851.getCode()).collect(Collectors.toList()).contains("ASSERTION") && Set(i4851.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.5.4")).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.5 code\n\t\tConformance: SHALL contain exactly one [1..1] code (CONF:15947)/@code=\"ASSERTION\"  (CodeSystem: 2.16.840.1.113883.5.4 HL7ActCode) (CONF:15948)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: true
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationStatusCodeP
	 */
	public boolean ValidateAllergyObservationStatusCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = true;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.6 statusCode\n\t\tConformance: SHALL contain exactly one [1..1] statusCode/@code=\"completed\"  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:7386)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and  let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in  value.code = 'completed'
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationStatusCode
	 */
	public boolean ValidateAllergyObservationStatusCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getStatusCode()).count()==0) && true && Set(self.getStatusCode()).filter(i4937 -> Set(i4937.getCode()).collect(Collectors.toList()).contains("completed")).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.6 statusCode\n\t\tConformance: SHALL contain exactly one [1..1] statusCode/@code=\"completed\"  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:7386)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.effectiveTime.oclIsUndefined()
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationEffectiveTime
	 */
	public boolean ValidateAllergyObservationEffectiveTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = !(Set(self.getEffectiveTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.7 effectiveTime\n\t\tConformance: SHALL contain exactly one [1..1] effectiveTime (CONF:7387)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: true
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationValueP
	 */
	public boolean ValidateAllergyObservationValueP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = true;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.8 value\n\t\tConformance: SHALL contain exactly one [1..1] value with @xsi:type=\"CD\", which SHALL be selected from ValueSet Allergy/Adverse Event Type 2.16.840.1.113883.3.88.12.3221.6.2 DYNAMIC (CONF:7390, CONF:9139)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and  let value : datatypes::CD = element.oclAsType(datatypes::CD) in  value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '420134006' or value.code = '418038007' or value.code = '419511003' or value.code = '418471000' or value.code = '419199007' or value.code = '416098002' or value.code = '414285001' or value.code = '59037007' or value.code = '235719002' or value.code = '232347008' or value.code = '426232007'))
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationValue
	 */
	public boolean ValidateAllergyObservationValue(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = One(Set(self.getValues()).count())==1 && Set(self.getValues()).allMatch(i5061 -> !(Set(i5061).count()==0) && Set(i5061).allMatch(i5062 -> i5062 instanceof CD) && Flatten(Set(i5061).map(i5063 -> Set((CD) i5063))).filter(i5064 -> Set(i5064.getCodeSystem()).collect(Collectors.toList()).contains("2.16.840.1.113883.6.96") && (Set(i5064.getCode()).collect(Collectors.toList()).contains("420134006") || Set(i5064.getCode()).collect(Collectors.toList()).contains("418038007") || Set(i5064.getCode()).collect(Collectors.toList()).contains("419511003") || Set(i5064.getCode()).collect(Collectors.toList()).contains("418471000") || Set(i5064.getCode()).collect(Collectors.toList()).contains("419199007") || Set(i5064.getCode()).collect(Collectors.toList()).contains("416098002") || Set(i5064.getCode()).collect(Collectors.toList()).contains("414285001") || Set(i5064.getCode()).collect(Collectors.toList()).contains("59037007") || Set(i5064.getCode()).collect(Collectors.toList()).contains("235719002") || Set(i5064.getCode()).collect(Collectors.toList()).contains("232347008") || Set(i5064.getCode()).collect(Collectors.toList()).contains("426232007"))).count()!=0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.8 value\n\t\tConformance: SHALL contain exactly one [1..1] value with @xsi:type=\"CD\", which SHALL be selected from ValueSet Allergy/Adverse Event Type 2.16.840.1.113883.3.88.12.3221.6.2 DYNAMIC (CONF:7390, CONF:9139)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->size() <= 1
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationParticipant
	 */
	public boolean ValidateAllergyObservationParticipant(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = One(Set(self.getParticipants()).filter(i5109 -> !(Set(i5109).count()==0) && true).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.9 participant\n\t\tConformance: SHOULD contain zero or one [0..1] participant (CONF:7402)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::AllergyObservation::AllergyStatusObservationEntryRelationship))
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationEntryRelationship
	 */
	public boolean ValidateAllergyObservationEntryRelationship(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getEntryRelationships()).filter(i5154 -> !(Set(i5154).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.10 entryRelationship\n\t\tConformance: SHALL contain exactly one [1..1] entryRelationship\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::AllergyObservation::ReactionObservationEntryRelationship))
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationEntryRelationship
	 */
	public boolean ValidateAllergyObservationEntryRelationship(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getEntryRelationships()).filter(i5198 -> !(Set(i5198).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.11 entryRelationship\n\t\tConformance: SHALL contain exactly one [1..1] entryRelationship\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::AllergyObservation::SeverityObservationEntryRelationship))
	 * Context: /AllergyObservation
	 * Context Class: consol::AllergyObservation
	 * Constraint Name: consol::AllergyObservation::AllergyObservationEntryRelationship
	 */
	public boolean ValidateAllergyObservationEntryRelationship(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_3)
		{
			return true;
		}
		boolean result = Set(self.getEntryRelationships()).filter(i5242 -> !(Set(i5242).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 4.4.12 entryRelationship\n\t\tConformance: SHALL contain exactly one [1..1] entryRelationship\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public ActClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_ClassCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_MoodCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMoodCode();
	}

	public ActMood CreateAnotherMoodCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_MoodCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Id());
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

	public Stream<facade.datatypes.CDFacade> code()
	{
		return Set(self.getCode()).filter( x -> x instanceof CD).map( x -> (CD) x).map( x -> new facade.datatypes.CDFacade(x));
	}

	public facade.datatypes.CDFacade GetOrCreateCode()
	{
		Optional<facade.datatypes.CDFacade> lastOrDefault = code().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Code());
			return lastOrDefault.get();
		}
		return CreateAnotherCode();
	}

	public facade.datatypes.CDFacade CreateAnotherCode()
	{
		CD element = DatatypesFactory.eINSTANCE.createCD();
		facade.datatypes.CDFacade elementFacade = new facade.datatypes.CDFacade(element);
		elementFacade.Init();
		self.setCode(element);
		return elementFacade;
	}

	public facade.datatypes.CDFacade Code() {
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_StatusCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_EffectiveTime());
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

	public Stream<facade.datatypes.CDFacade> value()
	{
		return Set(self.getValues()).filter( x -> x instanceof CD).map( x -> (CD) x).map( x -> new facade.datatypes.CDFacade(x));
	}

	public facade.datatypes.CDFacade GetOrCreateValue()
	{
		Optional<facade.datatypes.CDFacade> lastOrDefault = value().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Value());
			return lastOrDefault.get();
		}
		return CreateAnotherValue();
	}

	public facade.datatypes.CDFacade CreateAnotherValue()
	{
		CD element = DatatypesFactory.eINSTANCE.createCD();
		facade.datatypes.CDFacade elementFacade = new facade.datatypes.CDFacade(element);
		elementFacade.Init();
		self.getValues().add(element);
		return elementFacade;
	}

	public facade.datatypes.CDFacade Value() {
		return GetOrCreateValue();
	}

	public Stream<facade.consol.allergyobservation.ParticipantFacade> participant()
	{
		return Set(self.getParticipants()).filter( x -> facade.consol.allergyobservation.ParticipantFacade.isKindOf(x)).map( x -> new facade.consol.allergyobservation.ParticipantFacade(x));
	}

	public facade.consol.allergyobservation.ParticipantFacade GetOrCreateParticipant()
	{
		Optional<facade.consol.allergyobservation.ParticipantFacade> lastOrDefault = participant().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Participant());
			return lastOrDefault.get();
		}
		return CreateAnotherParticipant();
	}

	public facade.consol.allergyobservation.ParticipantFacade CreateAnotherParticipant()
	{
		Participant2 element = CDAFactory.eINSTANCE.createParticipant2();
		facade.consol.allergyobservation.ParticipantFacade elementFacade = new facade.consol.allergyobservation.ParticipantFacade(element);
		elementFacade.Init();
		self.getParticipants().add(element);
		return elementFacade;
	}

	public facade.consol.allergyobservation.ParticipantFacade Participant() {
		return GetOrCreateParticipant();
	}

	public Stream<facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade> entryRelationship()
	{
		return Set(self.getEntryRelationships()).filter( x -> facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade.isKindOf(x)).map( x -> new facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade(x));
	}

	public facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade GetOrCreateEntryRelationship()
	{
		Optional<facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade> lastOrDefault = entryRelationship().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_EntryRelationship());
			return lastOrDefault.get();
		}
		return CreateAnotherEntryRelationship();
	}

	public facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade CreateAnotherEntryRelationship()
	{
		EntryRelationship element = CDAFactory.eINSTANCE.createEntryRelationship();
		facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade elementFacade = new facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade(element);
		elementFacade.Init();
		self.getEntryRelationships().add(element);
		return elementFacade;
	}

	public facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade EntryRelationship() {
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_TemplateId());
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

	public Stream<facade.datatypes.STFacade> derivationExpr()
	{
		return Set(self.getDerivationExpr()).filter( x -> x instanceof ST).map( x -> (ST) x).map( x -> new facade.datatypes.STFacade(x));
	}

	public facade.datatypes.STFacade GetOrCreateDerivationExpr()
	{
		Optional<facade.datatypes.STFacade> lastOrDefault = derivationExpr().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_DerivationExpr());
			return lastOrDefault.get();
		}
		return CreateAnotherDerivationExpr();
	}

	public facade.datatypes.STFacade CreateAnotherDerivationExpr()
	{
		ST element = DatatypesFactory.eINSTANCE.createST();
		facade.datatypes.STFacade elementFacade = new facade.datatypes.STFacade(element);
		elementFacade.Init();
		self.setDerivationExpr(element);
		return elementFacade;
	}

	public facade.datatypes.STFacade DerivationExpr() {
		return GetOrCreateDerivationExpr();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Text());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_PriorityCode());
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

	public Stream<facade.datatypes.IVL_INTFacade> repeatNumber()
	{
		return Set(self.getRepeatNumber()).filter( x -> x instanceof IVL_INT).map( x -> (IVL_INT) x).map( x -> new facade.datatypes.IVL_INTFacade(x));
	}

	public facade.datatypes.IVL_INTFacade GetOrCreateRepeatNumber()
	{
		Optional<facade.datatypes.IVL_INTFacade> lastOrDefault = repeatNumber().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_RepeatNumber());
			return lastOrDefault.get();
		}
		return CreateAnotherRepeatNumber();
	}

	public facade.datatypes.IVL_INTFacade CreateAnotherRepeatNumber()
	{
		IVL_INT element = DatatypesFactory.eINSTANCE.createIVL_INT();
		facade.datatypes.IVL_INTFacade elementFacade = new facade.datatypes.IVL_INTFacade(element);
		elementFacade.Init();
		self.setRepeatNumber(element);
		return elementFacade;
	}

	public facade.datatypes.IVL_INTFacade RepeatNumber() {
		return GetOrCreateRepeatNumber();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_LanguageCode());
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

	public Stream<facade.datatypes.CEFacade> interpretationCode()
	{
		return Set(self.getInterpretationCodes()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateInterpretationCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = interpretationCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_InterpretationCode());
			return lastOrDefault.get();
		}
		return CreateAnotherInterpretationCode();
	}

	public facade.datatypes.CEFacade CreateAnotherInterpretationCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.getInterpretationCodes().add(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade InterpretationCode() {
		return GetOrCreateInterpretationCode();
	}

	public Stream<facade.datatypes.CEFacade> methodCode()
	{
		return Set(self.getMethodCodes()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateMethodCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = methodCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_MethodCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMethodCode();
	}

	public facade.datatypes.CEFacade CreateAnotherMethodCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.getMethodCodes().add(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade MethodCode() {
		return GetOrCreateMethodCode();
	}

	public Stream<facade.datatypes.CDFacade> targetSiteCode()
	{
		return Set(self.getTargetSiteCodes()).filter( x -> x instanceof CD).map( x -> (CD) x).map( x -> new facade.datatypes.CDFacade(x));
	}

	public facade.datatypes.CDFacade GetOrCreateTargetSiteCode()
	{
		Optional<facade.datatypes.CDFacade> lastOrDefault = targetSiteCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_TargetSiteCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTargetSiteCode();
	}

	public facade.datatypes.CDFacade CreateAnotherTargetSiteCode()
	{
		CD element = DatatypesFactory.eINSTANCE.createCD();
		facade.datatypes.CDFacade elementFacade = new facade.datatypes.CDFacade(element);
		elementFacade.Init();
		self.getTargetSiteCodes().add(element);
		return elementFacade;
	}

	public facade.datatypes.CDFacade TargetSiteCode() {
		return GetOrCreateTargetSiteCode();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Subject());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Specimen());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Performer());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Author());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Informant());
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

	public Stream<facade.cda.ReferenceFacade> reference()
	{
		return Set(self.getReferences()).filter( x -> facade.cda.ReferenceFacade.isKindOf(x)).map( x -> new facade.cda.ReferenceFacade(x));
	}

	public facade.cda.ReferenceFacade GetOrCreateReference()
	{
		Optional<facade.cda.ReferenceFacade> lastOrDefault = reference().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Reference());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_Precondition());
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

	public Stream<facade.cda.ReferenceRangeFacade> referenceRange()
	{
		return Set(self.getReferenceRanges()).filter( x -> facade.cda.ReferenceRangeFacade.isKindOf(x)).map( x -> new facade.cda.ReferenceRangeFacade(x));
	}

	public facade.cda.ReferenceRangeFacade GetOrCreateReferenceRange()
	{
		Optional<facade.cda.ReferenceRangeFacade> lastOrDefault = referenceRange().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_ReferenceRange());
			return lastOrDefault.get();
		}
		return CreateAnotherReferenceRange();
	}

	public facade.cda.ReferenceRangeFacade CreateAnotherReferenceRange()
	{
		ReferenceRange element = CDAFactory.eINSTANCE.createReferenceRange();
		facade.cda.ReferenceRangeFacade elementFacade = new facade.cda.ReferenceRangeFacade(element);
		elementFacade.Init();
		self.getReferenceRanges().add(element);
		return elementFacade;
	}

	public facade.cda.ReferenceRangeFacade ReferenceRange() {
		return GetOrCreateReferenceRange();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_NullFlavor());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_NegationInd());
			return lastOrDefault.get();
		}
		return CreateAnotherNegationInd();
	}

	public Boolean CreateAnotherNegationInd()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getObservation_NegationInd());
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
