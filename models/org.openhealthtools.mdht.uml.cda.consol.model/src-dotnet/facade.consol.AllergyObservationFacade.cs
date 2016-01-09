using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol
{
    public class AllergyObservationFacade : facade.FacadeBase
    {

		public POCD_MT000040Observation self;

		public static string TEMPLATEID = "2.16.840.1.113883.10.20.22.4.7";

		public AllergyObservationFacade()
		{
			this.self = new POCD_MT000040Observation();
		}

		public AllergyObservationFacade(POCD_MT000040Observation self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040Observation self)
		{
			return Set(self.templateId).Exists(id => Set(id.@root).Contains("2.16.840.1.113883.10.20.22.4.7"));
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateTemplateId().self.@root = SetOrAdd(GetOrCreateTemplateId().self.@root, "2.16.840.1.113883.10.20.22.4.7");
			GetOrCreateClassCode();
			self.@classCode = SetOrAdd(self.@classCode, ActClass.OBS);
			GetOrCreateMoodCode();
			self.@moodCode = SetOrAdd(self.@moodCode, ActMood.EVN);
			GetOrCreateId();
			GetOrCreateCode();
			GetOrCreateCode().self.@code = SetOrAdd(GetOrCreateCode().self.@code, "ASSERTION");
			GetOrCreateCode().self.@codeSystem = SetOrAdd(GetOrCreateCode().self.@codeSystem, "2.16.840.1.113883.5.4");
			GetOrCreateStatusCode();
			GetOrCreateStatusCode().self.@code = SetOrAdd(GetOrCreateStatusCode().self.@code, "completed");
			GetOrCreateStatusCode().self.@codeSystem = SetOrAdd(GetOrCreateStatusCode().self.@codeSystem, "2.16.840.1.113883.5.14");
			GetOrCreateEffectiveTime();
			GetOrCreateValue();
			GetOrCreateEntryRelationship();
		}

		/**
		 *UML path: /AllergyObservation
		 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection/entry/allergyProblemAct/entryRelationship/allergyObservation
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				id().ForEach(x => x.Validate(vb, del));
				code().ForEach(x => x.Validate(vb, del));
				statusCode().ForEach(x => x.Validate(vb, del));
				effectiveTime().ForEach(x => x.Validate(vb, del));
				value().ForEach(x => x.Validate(vb, del));
				participant().ForEach(x => x.Validate(vb, del));
				entryRelationship().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				derivationExpr().ForEach(x => x.Validate(vb, del));
				text().ForEach(x => x.Validate(vb, del));
				priorityCode().ForEach(x => x.Validate(vb, del));
				repeatNumber().ForEach(x => x.Validate(vb, del));
				languageCode().ForEach(x => x.Validate(vb, del));
				interpretationCode().ForEach(x => x.Validate(vb, del));
				methodCode().ForEach(x => x.Validate(vb, del));
				targetSiteCode().ForEach(x => x.Validate(vb, del));
				subject().ForEach(x => x.Validate(vb, del));
				specimen().ForEach(x => x.Validate(vb, del));
				performer().ForEach(x => x.Validate(vb, del));
				author().ForEach(x => x.Validate(vb, del));
				informant().ForEach(x => x.Validate(vb, del));
				reference().ForEach(x => x.Validate(vb, del));
				precondition().ForEach(x => x.Validate(vb, del));
				referenceRange().ForEach(x => x.Validate(vb, del));
		}
		public List<ActClass> classCode()
		{
			return Set(self.@classCode).FindAll( x => x is ActClass).ConvertAll( x => (ActClass) x);
		}

		public ActClass GetOrCreateClassCode()
		{
			List<ActClass> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public ActClass CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			ActClass element = new ActClass();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public ActClass ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(ActClass value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

		public List<ActMood> moodCode()
		{
			return Set(self.@moodCode).FindAll( x => x is ActMood).ConvertAll( x => (ActMood) x);
		}

		public ActMood GetOrCreateMoodCode()
		{
			List<ActMood> lastOrDefault = moodCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "moodCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherMoodCode();
		}

		public ActMood CreateAnotherMoodCode()
		{
			MarkSpecified(self, "moodCode");
			ActMood element = new ActMood();
			self.@moodCode = SetOrAdd(self.@moodCode, element);
			return element;
		}

		public ActMood MoodCode()		{
			return GetOrCreateMoodCode();
		}

		public void MoodCode(ActMood value)		{
			self.@moodCode = SetOrAdd(self.@moodCode, value);
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

		public List<facade.datatypes.CDFacade> code()
		{
			return Set(self.code).FindAll( x => x is CD).ConvertAll( x => x as CD).ConvertAll( x => new facade.datatypes.CDFacade(x));
		}

		public facade.datatypes.CDFacade GetOrCreateCode()
		{
			List<facade.datatypes.CDFacade> lastOrDefault = code();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "code");
				return lastOrDefault.Last();
			}
			return CreateAnotherCode();
		}

		public facade.datatypes.CDFacade CreateAnotherCode()
		{
			CD element = new CD();
			facade.datatypes.CDFacade elementFacade = new facade.datatypes.CDFacade(element);
			elementFacade.Init();
			self.code = SetOrAdd(self.code, element);
			return elementFacade;
		}

		public facade.datatypes.CDFacade Code()		{
			return GetOrCreateCode();
		}

		public List<facade.datatypes.CSFacade> statusCode()
		{
			return Set(self.statusCode).FindAll( x => x is CS).ConvertAll( x => x as CS).ConvertAll( x => new facade.datatypes.CSFacade(x));
		}

		public facade.datatypes.CSFacade GetOrCreateStatusCode()
		{
			List<facade.datatypes.CSFacade> lastOrDefault = statusCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "statusCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherStatusCode();
		}

		public facade.datatypes.CSFacade CreateAnotherStatusCode()
		{
			CS element = new CS();
			facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
			elementFacade.Init();
			self.statusCode = SetOrAdd(self.statusCode, element);
			return elementFacade;
		}

		public facade.datatypes.CSFacade StatusCode()		{
			return GetOrCreateStatusCode();
		}

		public List<facade.datatypes.IVL_TSFacade> effectiveTime()
		{
			return Set(self.effectiveTime).FindAll( x => x is IVL_TS).ConvertAll( x => x as IVL_TS).ConvertAll( x => new facade.datatypes.IVL_TSFacade(x));
		}

		public facade.datatypes.IVL_TSFacade GetOrCreateEffectiveTime()
		{
			List<facade.datatypes.IVL_TSFacade> lastOrDefault = effectiveTime();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "effectiveTime");
				return lastOrDefault.Last();
			}
			return CreateAnotherEffectiveTime();
		}

		public facade.datatypes.IVL_TSFacade CreateAnotherEffectiveTime()
		{
			IVL_TS element = new IVL_TS();
			facade.datatypes.IVL_TSFacade elementFacade = new facade.datatypes.IVL_TSFacade(element);
			elementFacade.Init();
			self.effectiveTime = SetOrAdd(self.effectiveTime, element);
			return elementFacade;
		}

		public facade.datatypes.IVL_TSFacade EffectiveTime()		{
			return GetOrCreateEffectiveTime();
		}

		public List<facade.datatypes.CDFacade> value()
		{
			return Set(self.value).FindAll( x => x is CD).ConvertAll( x => x as CD).ConvertAll( x => new facade.datatypes.CDFacade(x));
		}

		public facade.datatypes.CDFacade GetOrCreateValue()
		{
			List<facade.datatypes.CDFacade> lastOrDefault = value();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "value");
				return lastOrDefault.Last();
			}
			return CreateAnotherValue();
		}

		public facade.datatypes.CDFacade CreateAnotherValue()
		{
			CD element = new CD();
			facade.datatypes.CDFacade elementFacade = new facade.datatypes.CDFacade(element);
			elementFacade.Init();
			self.value = SetOrAdd(self.value, element);
			return elementFacade;
		}

		public facade.datatypes.CDFacade Value()		{
			return GetOrCreateValue();
		}

		public List<facade.consol.allergyobservation.ParticipantFacade> participant()
		{
			return Set(self.participant).FindAll( x => facade.consol.allergyobservation.ParticipantFacade.isKindOf(x)).ConvertAll( x => new facade.consol.allergyobservation.ParticipantFacade(x));
		}

		public facade.consol.allergyobservation.ParticipantFacade GetOrCreateParticipant()
		{
			List<facade.consol.allergyobservation.ParticipantFacade> lastOrDefault = participant();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "participant");
				return lastOrDefault.Last();
			}
			return CreateAnotherParticipant();
		}

		public facade.consol.allergyobservation.ParticipantFacade CreateAnotherParticipant()
		{
			POCD_MT000040Participant2 element = new POCD_MT000040Participant2();
			facade.consol.allergyobservation.ParticipantFacade elementFacade = new facade.consol.allergyobservation.ParticipantFacade(element);
			elementFacade.Init();
			self.participant = SetOrAdd(self.participant, element);
			return elementFacade;
		}

		public facade.consol.allergyobservation.ParticipantFacade Participant()		{
			return GetOrCreateParticipant();
		}

		public List<facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade> entryRelationship()
		{
			return Set(self.entryRelationship).FindAll( x => facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade.isKindOf(x)).ConvertAll( x => new facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade(x));
		}

		public facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade GetOrCreateEntryRelationship()
		{
			List<facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade> lastOrDefault = entryRelationship();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "entryRelationship");
				return lastOrDefault.Last();
			}
			return CreateAnotherEntryRelationship();
		}

		public facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade CreateAnotherEntryRelationship()
		{
			POCD_MT000040EntryRelationship element = new POCD_MT000040EntryRelationship();
			facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade elementFacade = new facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade(element);
			elementFacade.Init();
			self.entryRelationship = SetOrAdd(self.entryRelationship, element);
			return elementFacade;
		}

		public facade.consol.allergyobservation.AllergyStatusObservationEntryRelationshipFacade EntryRelationship()		{
			return GetOrCreateEntryRelationship();
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

		public List<facade.datatypes.STFacade> derivationExpr()
		{
			return Set(self.derivationExpr).FindAll( x => x is ST).ConvertAll( x => x as ST).ConvertAll( x => new facade.datatypes.STFacade(x));
		}

		public facade.datatypes.STFacade GetOrCreateDerivationExpr()
		{
			List<facade.datatypes.STFacade> lastOrDefault = derivationExpr();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "derivationExpr");
				return lastOrDefault.Last();
			}
			return CreateAnotherDerivationExpr();
		}

		public facade.datatypes.STFacade CreateAnotherDerivationExpr()
		{
			ST element = new ST();
			facade.datatypes.STFacade elementFacade = new facade.datatypes.STFacade(element);
			elementFacade.Init();
			self.derivationExpr = SetOrAdd(self.derivationExpr, element);
			return elementFacade;
		}

		public facade.datatypes.STFacade DerivationExpr()		{
			return GetOrCreateDerivationExpr();
		}

		public List<facade.datatypes.EDFacade> text()
		{
			return Set(self.text).FindAll( x => x is ED).ConvertAll( x => x as ED).ConvertAll( x => new facade.datatypes.EDFacade(x));
		}

		public facade.datatypes.EDFacade GetOrCreateText()
		{
			List<facade.datatypes.EDFacade> lastOrDefault = text();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "text");
				return lastOrDefault.Last();
			}
			return CreateAnotherText();
		}

		public facade.datatypes.EDFacade CreateAnotherText()
		{
			ED element = new ED();
			facade.datatypes.EDFacade elementFacade = new facade.datatypes.EDFacade(element);
			elementFacade.Init();
			self.text = SetOrAdd(self.text, element);
			return elementFacade;
		}

		public facade.datatypes.EDFacade Text()		{
			return GetOrCreateText();
		}

		public List<facade.datatypes.CEFacade> priorityCode()
		{
			return Set(self.priorityCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreatePriorityCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = priorityCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "priorityCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherPriorityCode();
		}

		public facade.datatypes.CEFacade CreateAnotherPriorityCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.priorityCode = SetOrAdd(self.priorityCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade PriorityCode()		{
			return GetOrCreatePriorityCode();
		}

		public List<facade.datatypes.IVL_INTFacade> repeatNumber()
		{
			return Set(self.repeatNumber).FindAll( x => x is IVL_INT).ConvertAll( x => x as IVL_INT).ConvertAll( x => new facade.datatypes.IVL_INTFacade(x));
		}

		public facade.datatypes.IVL_INTFacade GetOrCreateRepeatNumber()
		{
			List<facade.datatypes.IVL_INTFacade> lastOrDefault = repeatNumber();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "repeatNumber");
				return lastOrDefault.Last();
			}
			return CreateAnotherRepeatNumber();
		}

		public facade.datatypes.IVL_INTFacade CreateAnotherRepeatNumber()
		{
			IVL_INT element = new IVL_INT();
			facade.datatypes.IVL_INTFacade elementFacade = new facade.datatypes.IVL_INTFacade(element);
			elementFacade.Init();
			self.repeatNumber = SetOrAdd(self.repeatNumber, element);
			return elementFacade;
		}

		public facade.datatypes.IVL_INTFacade RepeatNumber()		{
			return GetOrCreateRepeatNumber();
		}

		public List<facade.datatypes.CSFacade> languageCode()
		{
			return Set(self.languageCode).FindAll( x => x is CS).ConvertAll( x => x as CS).ConvertAll( x => new facade.datatypes.CSFacade(x));
		}

		public facade.datatypes.CSFacade GetOrCreateLanguageCode()
		{
			List<facade.datatypes.CSFacade> lastOrDefault = languageCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "languageCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherLanguageCode();
		}

		public facade.datatypes.CSFacade CreateAnotherLanguageCode()
		{
			CS element = new CS();
			facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
			elementFacade.Init();
			self.languageCode = SetOrAdd(self.languageCode, element);
			return elementFacade;
		}

		public facade.datatypes.CSFacade LanguageCode()		{
			return GetOrCreateLanguageCode();
		}

		public List<facade.datatypes.CEFacade> interpretationCode()
		{
			return Set(self.interpretationCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateInterpretationCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = interpretationCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "interpretationCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherInterpretationCode();
		}

		public facade.datatypes.CEFacade CreateAnotherInterpretationCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.interpretationCode = SetOrAdd(self.interpretationCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade InterpretationCode()		{
			return GetOrCreateInterpretationCode();
		}

		public List<facade.datatypes.CEFacade> methodCode()
		{
			return Set(self.methodCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateMethodCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = methodCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "methodCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherMethodCode();
		}

		public facade.datatypes.CEFacade CreateAnotherMethodCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.methodCode = SetOrAdd(self.methodCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade MethodCode()		{
			return GetOrCreateMethodCode();
		}

		public List<facade.datatypes.CDFacade> targetSiteCode()
		{
			return Set(self.targetSiteCode).FindAll( x => x is CD).ConvertAll( x => x as CD).ConvertAll( x => new facade.datatypes.CDFacade(x));
		}

		public facade.datatypes.CDFacade GetOrCreateTargetSiteCode()
		{
			List<facade.datatypes.CDFacade> lastOrDefault = targetSiteCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "targetSiteCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherTargetSiteCode();
		}

		public facade.datatypes.CDFacade CreateAnotherTargetSiteCode()
		{
			CD element = new CD();
			facade.datatypes.CDFacade elementFacade = new facade.datatypes.CDFacade(element);
			elementFacade.Init();
			self.targetSiteCode = SetOrAdd(self.targetSiteCode, element);
			return elementFacade;
		}

		public facade.datatypes.CDFacade TargetSiteCode()		{
			return GetOrCreateTargetSiteCode();
		}

		public List<facade.cda.SubjectFacade> subject()
		{
			return Set(self.subject).FindAll( x => facade.cda.SubjectFacade.isKindOf(x)).ConvertAll( x => new facade.cda.SubjectFacade(x));
		}

		public facade.cda.SubjectFacade GetOrCreateSubject()
		{
			List<facade.cda.SubjectFacade> lastOrDefault = subject();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "subject");
				return lastOrDefault.Last();
			}
			return CreateAnotherSubject();
		}

		public facade.cda.SubjectFacade CreateAnotherSubject()
		{
			POCD_MT000040Subject element = new POCD_MT000040Subject();
			facade.cda.SubjectFacade elementFacade = new facade.cda.SubjectFacade(element);
			elementFacade.Init();
			self.subject = SetOrAdd(self.subject, element);
			return elementFacade;
		}

		public facade.cda.SubjectFacade Subject()		{
			return GetOrCreateSubject();
		}

		public List<facade.cda.SpecimenFacade> specimen()
		{
			return Set(self.specimen).FindAll( x => facade.cda.SpecimenFacade.isKindOf(x)).ConvertAll( x => new facade.cda.SpecimenFacade(x));
		}

		public facade.cda.SpecimenFacade GetOrCreateSpecimen()
		{
			List<facade.cda.SpecimenFacade> lastOrDefault = specimen();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "specimen");
				return lastOrDefault.Last();
			}
			return CreateAnotherSpecimen();
		}

		public facade.cda.SpecimenFacade CreateAnotherSpecimen()
		{
			POCD_MT000040Specimen element = new POCD_MT000040Specimen();
			facade.cda.SpecimenFacade elementFacade = new facade.cda.SpecimenFacade(element);
			elementFacade.Init();
			self.specimen = SetOrAdd(self.specimen, element);
			return elementFacade;
		}

		public facade.cda.SpecimenFacade Specimen()		{
			return GetOrCreateSpecimen();
		}

		public List<facade.cda.Performer2Facade> performer()
		{
			return Set(self.performer).FindAll( x => facade.cda.Performer2Facade.isKindOf(x)).ConvertAll( x => new facade.cda.Performer2Facade(x));
		}

		public facade.cda.Performer2Facade GetOrCreatePerformer()
		{
			List<facade.cda.Performer2Facade> lastOrDefault = performer();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "performer");
				return lastOrDefault.Last();
			}
			return CreateAnotherPerformer();
		}

		public facade.cda.Performer2Facade CreateAnotherPerformer()
		{
			POCD_MT000040Performer2 element = new POCD_MT000040Performer2();
			facade.cda.Performer2Facade elementFacade = new facade.cda.Performer2Facade(element);
			elementFacade.Init();
			self.performer = SetOrAdd(self.performer, element);
			return elementFacade;
		}

		public facade.cda.Performer2Facade Performer()		{
			return GetOrCreatePerformer();
		}

		public List<facade.cda.AuthorFacade> author()
		{
			return Set(self.author).FindAll( x => facade.cda.AuthorFacade.isKindOf(x)).ConvertAll( x => new facade.cda.AuthorFacade(x));
		}

		public facade.cda.AuthorFacade GetOrCreateAuthor()
		{
			List<facade.cda.AuthorFacade> lastOrDefault = author();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "author");
				return lastOrDefault.Last();
			}
			return CreateAnotherAuthor();
		}

		public facade.cda.AuthorFacade CreateAnotherAuthor()
		{
			POCD_MT000040Author element = new POCD_MT000040Author();
			facade.cda.AuthorFacade elementFacade = new facade.cda.AuthorFacade(element);
			elementFacade.Init();
			self.author = SetOrAdd(self.author, element);
			return elementFacade;
		}

		public facade.cda.AuthorFacade Author()		{
			return GetOrCreateAuthor();
		}

		public List<facade.cda.Informant12Facade> informant()
		{
			return Set(self.informant).FindAll( x => facade.cda.Informant12Facade.isKindOf(x)).ConvertAll( x => new facade.cda.Informant12Facade(x));
		}

		public facade.cda.Informant12Facade GetOrCreateInformant()
		{
			List<facade.cda.Informant12Facade> lastOrDefault = informant();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "informant");
				return lastOrDefault.Last();
			}
			return CreateAnotherInformant();
		}

		public facade.cda.Informant12Facade CreateAnotherInformant()
		{
			POCD_MT000040Informant12 element = new POCD_MT000040Informant12();
			facade.cda.Informant12Facade elementFacade = new facade.cda.Informant12Facade(element);
			elementFacade.Init();
			self.informant = SetOrAdd(self.informant, element);
			return elementFacade;
		}

		public facade.cda.Informant12Facade Informant()		{
			return GetOrCreateInformant();
		}

		public List<facade.cda.ReferenceFacade> reference()
		{
			return Set(self.reference).FindAll( x => facade.cda.ReferenceFacade.isKindOf(x)).ConvertAll( x => new facade.cda.ReferenceFacade(x));
		}

		public facade.cda.ReferenceFacade GetOrCreateReference()
		{
			List<facade.cda.ReferenceFacade> lastOrDefault = reference();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "reference");
				return lastOrDefault.Last();
			}
			return CreateAnotherReference();
		}

		public facade.cda.ReferenceFacade CreateAnotherReference()
		{
			POCD_MT000040Reference element = new POCD_MT000040Reference();
			facade.cda.ReferenceFacade elementFacade = new facade.cda.ReferenceFacade(element);
			elementFacade.Init();
			self.reference = SetOrAdd(self.reference, element);
			return elementFacade;
		}

		public facade.cda.ReferenceFacade Reference()		{
			return GetOrCreateReference();
		}

		public List<facade.cda.PreconditionFacade> precondition()
		{
			return Set(self.precondition).FindAll( x => facade.cda.PreconditionFacade.isKindOf(x)).ConvertAll( x => new facade.cda.PreconditionFacade(x));
		}

		public facade.cda.PreconditionFacade GetOrCreatePrecondition()
		{
			List<facade.cda.PreconditionFacade> lastOrDefault = precondition();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "precondition");
				return lastOrDefault.Last();
			}
			return CreateAnotherPrecondition();
		}

		public facade.cda.PreconditionFacade CreateAnotherPrecondition()
		{
			POCD_MT000040Precondition element = new POCD_MT000040Precondition();
			facade.cda.PreconditionFacade elementFacade = new facade.cda.PreconditionFacade(element);
			elementFacade.Init();
			self.precondition = SetOrAdd(self.precondition, element);
			return elementFacade;
		}

		public facade.cda.PreconditionFacade Precondition()		{
			return GetOrCreatePrecondition();
		}

		public List<facade.cda.ReferenceRangeFacade> referenceRange()
		{
			return Set(self.referenceRange).FindAll( x => facade.cda.ReferenceRangeFacade.isKindOf(x)).ConvertAll( x => new facade.cda.ReferenceRangeFacade(x));
		}

		public facade.cda.ReferenceRangeFacade GetOrCreateReferenceRange()
		{
			List<facade.cda.ReferenceRangeFacade> lastOrDefault = referenceRange();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "referenceRange");
				return lastOrDefault.Last();
			}
			return CreateAnotherReferenceRange();
		}

		public facade.cda.ReferenceRangeFacade CreateAnotherReferenceRange()
		{
			POCD_MT000040ReferenceRange element = new POCD_MT000040ReferenceRange();
			facade.cda.ReferenceRangeFacade elementFacade = new facade.cda.ReferenceRangeFacade(element);
			elementFacade.Init();
			self.referenceRange = SetOrAdd(self.referenceRange, element);
			return elementFacade;
		}

		public facade.cda.ReferenceRangeFacade ReferenceRange()		{
			return GetOrCreateReferenceRange();
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

		public List<bool> negationInd()
		{
			return Set(self.@negationInd);
		}

		public bool GetOrCreateNegationInd()
		{
			List<bool> lastOrDefault = negationInd();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "negationInd");
				return lastOrDefault.Last();
			}
			return CreateAnotherNegationInd();
		}

		public bool CreateAnotherNegationInd()
		{
			MarkSpecified(self, "negationInd");
			bool element = new bool();
			self.@negationInd = SetOrAdd(self.@negationInd, element);
			return element;
		}

		public bool NegationInd()		{
			return GetOrCreateNegationInd();
		}

		public void NegationInd(bool value)		{
			self.@negationInd = SetOrAdd(self.@negationInd, value);
		}

}
}
