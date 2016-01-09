using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol
{
    public class ContinuityOfCareDocumentFacade : facade.FacadeBase
    {

		public POCD_MT000040ClinicalDocument self;

		public static string TEMPLATEID = "2.16.840.1.113883.10.20.22.1.2";

		public ContinuityOfCareDocumentFacade()
		{
			this.self = new POCD_MT000040ClinicalDocument();
		}

		public ContinuityOfCareDocumentFacade(POCD_MT000040ClinicalDocument self)
		{
			this.self = self;
		}

		public static bool isKindOf(POCD_MT000040ClinicalDocument self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateTemplateId().self.@root = SetOrAdd(GetOrCreateTemplateId().self.@root, "2.16.840.1.113883.10.20.22.1.2");
			GetOrCreateCode();
			GetOrCreateCode().self.@code = SetOrAdd(GetOrCreateCode().self.@code, "34133-9");
			GetOrCreateCode().self.@codeSystem = SetOrAdd(GetOrCreateCode().self.@codeSystem, "2.16.840.1.113883.6.1");
			GetOrCreateLanguageCode();
			GetOrCreateDocumentationOf();
			GetOrCreateAuthor();
			GetOrCreateComponent();
			GetOrCreateCustodian();
			GetOrCreateRealmCode();
			GetOrCreateRealmCode().self.@code = SetOrAdd(GetOrCreateRealmCode().self.@code, "US");
			GetOrCreateTypeId();
			GetOrCreateId();
			GetOrCreateTitle();
			GetOrCreateEffectiveTime();
			GetOrCreateConfidentialityCode();
			GetOrCreateRecordTarget();
		}

		/**
		 *UML path: /ContinuityOfCareDocument
		 *UML root path: /ContinuityOfCareDocument
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{
				ValidateGeneralHeaderConstraintsTitle(vb, del);

				code().ForEach(x => x.Validate(vb, del));
				languageCode().ForEach(x => x.Validate(vb, del));
				documentationOf().ForEach(x => x.Validate(vb, del));
				author().ForEach(x => x.Validate(vb, del));
				component().ForEach(x => x.Validate(vb, del));
				dataEnterer().ForEach(x => x.Validate(vb, del));
				custodian().ForEach(x => x.Validate(vb, del));
				informationRecipient().ForEach(x => x.Validate(vb, del));
				legalAuthenticator().ForEach(x => x.Validate(vb, del));
				authenticator().ForEach(x => x.Validate(vb, del));
				informant().ForEach(x => x.Validate(vb, del));
				supportParticipant().ForEach(x => x.Validate(vb, del));
				inFulfillmentOf().ForEach(x => x.Validate(vb, del));
				authorization().ForEach(x => x.Validate(vb, del));
				realmCode().ForEach(x => x.Validate(vb, del));
				typeId().ForEach(x => x.Validate(vb, del));
				id().ForEach(x => x.Validate(vb, del));
				title().ForEach(x => x.Validate(vb, del));
				effectiveTime().ForEach(x => x.Validate(vb, del));
				confidentialityCode().ForEach(x => x.Validate(vb, del));
				recordTarget().ForEach(x => x.Validate(vb, del));
				componentOf().ForEach(x => x.Validate(vb, del));
				setId().ForEach(x => x.Validate(vb, del));
				versionNumber().ForEach(x => x.Validate(vb, del));
				templateId().ForEach(x => x.Validate(vb, del));
				copyTime().ForEach(x => x.Validate(vb, del));
				participant().ForEach(x => x.Validate(vb, del));
				relatedDocument().ForEach(x => x.Validate(vb, del));
		}
		/**
		 * OCL: not self.title.oclIsUndefined()
		 * Context: /ContinuityOfCareDocument
		 * Context Class: consol::ContinuityOfCareDocument
		 * Constraint Name: consol::GeneralHeaderConstraints::GeneralHeaderConstraintsTitle
		 */
		public bool ValidateGeneralHeaderConstraintsTitle(ValidationBuilder vb, DataElementLevel? del)
		{
			if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
			{
				return true;
			}
			bool result = !(Set(self.title).Count==0);
			if (!result && vb != null)
			{
				vb.AddValidationMessage(vb.PathName, null, "Error: ContinuityOfCareDocument - 2.2.6 title\n\t\tConformance: SHALL contain exactly one [1..1] title (CONF:5254)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a");
			}
			return result;
		}

		public List<facade.datatypes.CEFacade> code()
		{
			return Set(self.code).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = code();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "code");
				return lastOrDefault.Last();
			}
			return CreateAnotherCode();
		}

		public facade.datatypes.CEFacade CreateAnotherCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.code = SetOrAdd(self.code, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade Code()		{
			return GetOrCreateCode();
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

		public List<facade.consol.continuityofcaredocument.DocumentationOfFacade> documentationOf()
		{
			return Set(self.documentationOf).FindAll( x => facade.consol.continuityofcaredocument.DocumentationOfFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.DocumentationOfFacade(x));
		}

		public facade.consol.continuityofcaredocument.DocumentationOfFacade GetOrCreateDocumentationOf()
		{
			List<facade.consol.continuityofcaredocument.DocumentationOfFacade> lastOrDefault = documentationOf();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "documentationOf");
				return lastOrDefault.Last();
			}
			return CreateAnotherDocumentationOf();
		}

		public facade.consol.continuityofcaredocument.DocumentationOfFacade CreateAnotherDocumentationOf()
		{
			POCD_MT000040DocumentationOf element = new POCD_MT000040DocumentationOf();
			facade.consol.continuityofcaredocument.DocumentationOfFacade elementFacade = new facade.consol.continuityofcaredocument.DocumentationOfFacade(element);
			elementFacade.Init();
			self.documentationOf = SetOrAdd(self.documentationOf, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.DocumentationOfFacade DocumentationOf()		{
			return GetOrCreateDocumentationOf();
		}

		public List<facade.consol.continuityofcaredocument.AuthorFacade> author()
		{
			return Set(self.author).FindAll( x => facade.consol.continuityofcaredocument.AuthorFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.AuthorFacade(x));
		}

		public facade.consol.continuityofcaredocument.AuthorFacade GetOrCreateAuthor()
		{
			List<facade.consol.continuityofcaredocument.AuthorFacade> lastOrDefault = author();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "author");
				return lastOrDefault.Last();
			}
			return CreateAnotherAuthor();
		}

		public facade.consol.continuityofcaredocument.AuthorFacade CreateAnotherAuthor()
		{
			POCD_MT000040Author element = new POCD_MT000040Author();
			facade.consol.continuityofcaredocument.AuthorFacade elementFacade = new facade.consol.continuityofcaredocument.AuthorFacade(element);
			elementFacade.Init();
			self.author = SetOrAdd(self.author, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.AuthorFacade Author()		{
			return GetOrCreateAuthor();
		}

		public List<facade.consol.continuityofcaredocument.ComponentFacade> component()
		{
			return Set(self.component).FindAll( x => facade.consol.continuityofcaredocument.ComponentFacade.isKindOf(x)).ConvertAll( x => new facade.consol.continuityofcaredocument.ComponentFacade(x));
		}

		public facade.consol.continuityofcaredocument.ComponentFacade GetOrCreateComponent()
		{
			List<facade.consol.continuityofcaredocument.ComponentFacade> lastOrDefault = component();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "component");
				return lastOrDefault.Last();
			}
			return CreateAnotherComponent();
		}

		public facade.consol.continuityofcaredocument.ComponentFacade CreateAnotherComponent()
		{
			POCD_MT000040Component2 element = new POCD_MT000040Component2();
			facade.consol.continuityofcaredocument.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.ComponentFacade(element);
			elementFacade.Init();
			self.component = SetOrAdd(self.component, element);
			return elementFacade;
		}

		public facade.consol.continuityofcaredocument.ComponentFacade Component()		{
			return GetOrCreateComponent();
		}

		public List<facade.consol.generalheaderconstraints.DataEntererFacade> dataEnterer()
		{
			return Set(self.dataEnterer).FindAll( x => facade.consol.generalheaderconstraints.DataEntererFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.DataEntererFacade(x));
		}

		public facade.consol.generalheaderconstraints.DataEntererFacade GetOrCreateDataEnterer()
		{
			List<facade.consol.generalheaderconstraints.DataEntererFacade> lastOrDefault = dataEnterer();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "dataEnterer");
				return lastOrDefault.Last();
			}
			return CreateAnotherDataEnterer();
		}

		public facade.consol.generalheaderconstraints.DataEntererFacade CreateAnotherDataEnterer()
		{
			POCD_MT000040DataEnterer element = new POCD_MT000040DataEnterer();
			facade.consol.generalheaderconstraints.DataEntererFacade elementFacade = new facade.consol.generalheaderconstraints.DataEntererFacade(element);
			elementFacade.Init();
			self.dataEnterer = SetOrAdd(self.dataEnterer, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.DataEntererFacade DataEnterer()		{
			return GetOrCreateDataEnterer();
		}

		public List<facade.consol.generalheaderconstraints.CustodianFacade> custodian()
		{
			return Set(self.custodian).FindAll( x => facade.consol.generalheaderconstraints.CustodianFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.CustodianFacade(x));
		}

		public facade.consol.generalheaderconstraints.CustodianFacade GetOrCreateCustodian()
		{
			List<facade.consol.generalheaderconstraints.CustodianFacade> lastOrDefault = custodian();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "custodian");
				return lastOrDefault.Last();
			}
			return CreateAnotherCustodian();
		}

		public facade.consol.generalheaderconstraints.CustodianFacade CreateAnotherCustodian()
		{
			POCD_MT000040Custodian element = new POCD_MT000040Custodian();
			facade.consol.generalheaderconstraints.CustodianFacade elementFacade = new facade.consol.generalheaderconstraints.CustodianFacade(element);
			elementFacade.Init();
			self.custodian = SetOrAdd(self.custodian, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.CustodianFacade Custodian()		{
			return GetOrCreateCustodian();
		}

		public List<facade.consol.generalheaderconstraints.InformationRecipientFacade> informationRecipient()
		{
			return Set(self.informationRecipient).FindAll( x => facade.consol.generalheaderconstraints.InformationRecipientFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.InformationRecipientFacade(x));
		}

		public facade.consol.generalheaderconstraints.InformationRecipientFacade GetOrCreateInformationRecipient()
		{
			List<facade.consol.generalheaderconstraints.InformationRecipientFacade> lastOrDefault = informationRecipient();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "informationRecipient");
				return lastOrDefault.Last();
			}
			return CreateAnotherInformationRecipient();
		}

		public facade.consol.generalheaderconstraints.InformationRecipientFacade CreateAnotherInformationRecipient()
		{
			POCD_MT000040InformationRecipient element = new POCD_MT000040InformationRecipient();
			facade.consol.generalheaderconstraints.InformationRecipientFacade elementFacade = new facade.consol.generalheaderconstraints.InformationRecipientFacade(element);
			elementFacade.Init();
			self.informationRecipient = SetOrAdd(self.informationRecipient, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.InformationRecipientFacade InformationRecipient()		{
			return GetOrCreateInformationRecipient();
		}

		public List<facade.consol.generalheaderconstraints.LegalAuthenticatorFacade> legalAuthenticator()
		{
			return Set(self.legalAuthenticator).FindAll( x => facade.consol.generalheaderconstraints.LegalAuthenticatorFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.LegalAuthenticatorFacade(x));
		}

		public facade.consol.generalheaderconstraints.LegalAuthenticatorFacade GetOrCreateLegalAuthenticator()
		{
			List<facade.consol.generalheaderconstraints.LegalAuthenticatorFacade> lastOrDefault = legalAuthenticator();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "legalAuthenticator");
				return lastOrDefault.Last();
			}
			return CreateAnotherLegalAuthenticator();
		}

		public facade.consol.generalheaderconstraints.LegalAuthenticatorFacade CreateAnotherLegalAuthenticator()
		{
			POCD_MT000040LegalAuthenticator element = new POCD_MT000040LegalAuthenticator();
			facade.consol.generalheaderconstraints.LegalAuthenticatorFacade elementFacade = new facade.consol.generalheaderconstraints.LegalAuthenticatorFacade(element);
			elementFacade.Init();
			self.legalAuthenticator = SetOrAdd(self.legalAuthenticator, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.LegalAuthenticatorFacade LegalAuthenticator()		{
			return GetOrCreateLegalAuthenticator();
		}

		public List<facade.consol.generalheaderconstraints.AuthenticatorFacade> authenticator()
		{
			return Set(self.authenticator).FindAll( x => facade.consol.generalheaderconstraints.AuthenticatorFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.AuthenticatorFacade(x));
		}

		public facade.consol.generalheaderconstraints.AuthenticatorFacade GetOrCreateAuthenticator()
		{
			List<facade.consol.generalheaderconstraints.AuthenticatorFacade> lastOrDefault = authenticator();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "authenticator");
				return lastOrDefault.Last();
			}
			return CreateAnotherAuthenticator();
		}

		public facade.consol.generalheaderconstraints.AuthenticatorFacade CreateAnotherAuthenticator()
		{
			POCD_MT000040Authenticator element = new POCD_MT000040Authenticator();
			facade.consol.generalheaderconstraints.AuthenticatorFacade elementFacade = new facade.consol.generalheaderconstraints.AuthenticatorFacade(element);
			elementFacade.Init();
			self.authenticator = SetOrAdd(self.authenticator, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.AuthenticatorFacade Authenticator()		{
			return GetOrCreateAuthenticator();
		}

		public List<facade.consol.generalheaderconstraints.InformantFacade> informant()
		{
			return Set(self.informant).FindAll( x => facade.consol.generalheaderconstraints.InformantFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.InformantFacade(x));
		}

		public facade.consol.generalheaderconstraints.InformantFacade GetOrCreateInformant()
		{
			List<facade.consol.generalheaderconstraints.InformantFacade> lastOrDefault = informant();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "informant");
				return lastOrDefault.Last();
			}
			return CreateAnotherInformant();
		}

		public facade.consol.generalheaderconstraints.InformantFacade CreateAnotherInformant()
		{
			POCD_MT000040Informant12 element = new POCD_MT000040Informant12();
			facade.consol.generalheaderconstraints.InformantFacade elementFacade = new facade.consol.generalheaderconstraints.InformantFacade(element);
			elementFacade.Init();
			self.informant = SetOrAdd(self.informant, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.InformantFacade Informant()		{
			return GetOrCreateInformant();
		}

		public List<facade.consol.generalheaderconstraints.ParticipantSupportFacade> supportParticipant()
		{
			return Set(self.participant).FindAll( x => facade.consol.generalheaderconstraints.ParticipantSupportFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.ParticipantSupportFacade(x));
		}

		public facade.consol.generalheaderconstraints.ParticipantSupportFacade GetOrCreateSupportParticipant()
		{
			List<facade.consol.generalheaderconstraints.ParticipantSupportFacade> lastOrDefault = supportParticipant();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "participant");
				return lastOrDefault.Last();
			}
			return CreateAnotherSupportParticipant();
		}

		public facade.consol.generalheaderconstraints.ParticipantSupportFacade CreateAnotherSupportParticipant()
		{
			POCD_MT000040Participant1 element = new POCD_MT000040Participant1();
			facade.consol.generalheaderconstraints.ParticipantSupportFacade elementFacade = new facade.consol.generalheaderconstraints.ParticipantSupportFacade(element);
			elementFacade.Init();
			self.participant = SetOrAdd(self.participant, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.ParticipantSupportFacade SupportParticipant()		{
			return GetOrCreateSupportParticipant();
		}

		public List<facade.consol.generalheaderconstraints.InFulfillmentOfFacade> inFulfillmentOf()
		{
			return Set(self.inFulfillmentOf).FindAll( x => facade.consol.generalheaderconstraints.InFulfillmentOfFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.InFulfillmentOfFacade(x));
		}

		public facade.consol.generalheaderconstraints.InFulfillmentOfFacade GetOrCreateInFulfillmentOf()
		{
			List<facade.consol.generalheaderconstraints.InFulfillmentOfFacade> lastOrDefault = inFulfillmentOf();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "inFulfillmentOf");
				return lastOrDefault.Last();
			}
			return CreateAnotherInFulfillmentOf();
		}

		public facade.consol.generalheaderconstraints.InFulfillmentOfFacade CreateAnotherInFulfillmentOf()
		{
			POCD_MT000040InFulfillmentOf element = new POCD_MT000040InFulfillmentOf();
			facade.consol.generalheaderconstraints.InFulfillmentOfFacade elementFacade = new facade.consol.generalheaderconstraints.InFulfillmentOfFacade(element);
			elementFacade.Init();
			self.inFulfillmentOf = SetOrAdd(self.inFulfillmentOf, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.InFulfillmentOfFacade InFulfillmentOf()		{
			return GetOrCreateInFulfillmentOf();
		}

		public List<facade.consol.generalheaderconstraints.AuthorizationFacade> authorization()
		{
			return Set(self.authorization).FindAll( x => facade.consol.generalheaderconstraints.AuthorizationFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.AuthorizationFacade(x));
		}

		public facade.consol.generalheaderconstraints.AuthorizationFacade GetOrCreateAuthorization()
		{
			List<facade.consol.generalheaderconstraints.AuthorizationFacade> lastOrDefault = authorization();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "authorization");
				return lastOrDefault.Last();
			}
			return CreateAnotherAuthorization();
		}

		public facade.consol.generalheaderconstraints.AuthorizationFacade CreateAnotherAuthorization()
		{
			POCD_MT000040Authorization element = new POCD_MT000040Authorization();
			facade.consol.generalheaderconstraints.AuthorizationFacade elementFacade = new facade.consol.generalheaderconstraints.AuthorizationFacade(element);
			elementFacade.Init();
			self.authorization = SetOrAdd(self.authorization, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.AuthorizationFacade Authorization()		{
			return GetOrCreateAuthorization();
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

		public List<facade.datatypes.STFacade> title()
		{
			return Set(self.title).FindAll( x => x is ST).ConvertAll( x => x as ST).ConvertAll( x => new facade.datatypes.STFacade(x));
		}

		public facade.datatypes.STFacade GetOrCreateTitle()
		{
			List<facade.datatypes.STFacade> lastOrDefault = title();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "title");
				return lastOrDefault.Last();
			}
			return CreateAnotherTitle();
		}

		public facade.datatypes.STFacade CreateAnotherTitle()
		{
			ST element = new ST();
			facade.datatypes.STFacade elementFacade = new facade.datatypes.STFacade(element);
			elementFacade.Init();
			self.title = SetOrAdd(self.title, element);
			return elementFacade;
		}

		public facade.datatypes.STFacade Title()		{
			return GetOrCreateTitle();
		}

		public List<facade.datatypes.TSFacade> effectiveTime()
		{
			return Set(self.effectiveTime).FindAll( x => x is TS).ConvertAll( x => x as TS).ConvertAll( x => new facade.datatypes.TSFacade(x));
		}

		public facade.datatypes.TSFacade GetOrCreateEffectiveTime()
		{
			List<facade.datatypes.TSFacade> lastOrDefault = effectiveTime();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "effectiveTime");
				return lastOrDefault.Last();
			}
			return CreateAnotherEffectiveTime();
		}

		public facade.datatypes.TSFacade CreateAnotherEffectiveTime()
		{
			TS element = new TS();
			facade.datatypes.TSFacade elementFacade = new facade.datatypes.TSFacade(element);
			elementFacade.Init();
			self.effectiveTime = SetOrAdd(self.effectiveTime, element);
			return elementFacade;
		}

		public facade.datatypes.TSFacade EffectiveTime()		{
			return GetOrCreateEffectiveTime();
		}

		public List<facade.datatypes.CEFacade> confidentialityCode()
		{
			return Set(self.confidentialityCode).FindAll( x => x is CE).ConvertAll( x => x as CE).ConvertAll( x => new facade.datatypes.CEFacade(x));
		}

		public facade.datatypes.CEFacade GetOrCreateConfidentialityCode()
		{
			List<facade.datatypes.CEFacade> lastOrDefault = confidentialityCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "confidentialityCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherConfidentialityCode();
		}

		public facade.datatypes.CEFacade CreateAnotherConfidentialityCode()
		{
			CE element = new CE();
			facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
			elementFacade.Init();
			self.confidentialityCode = SetOrAdd(self.confidentialityCode, element);
			return elementFacade;
		}

		public facade.datatypes.CEFacade ConfidentialityCode()		{
			return GetOrCreateConfidentialityCode();
		}

		public List<facade.consol.generalheaderconstraints.RecordTargetFacade> recordTarget()
		{
			return Set(self.recordTarget).FindAll( x => facade.consol.generalheaderconstraints.RecordTargetFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.RecordTargetFacade(x));
		}

		public facade.consol.generalheaderconstraints.RecordTargetFacade GetOrCreateRecordTarget()
		{
			List<facade.consol.generalheaderconstraints.RecordTargetFacade> lastOrDefault = recordTarget();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "recordTarget");
				return lastOrDefault.Last();
			}
			return CreateAnotherRecordTarget();
		}

		public facade.consol.generalheaderconstraints.RecordTargetFacade CreateAnotherRecordTarget()
		{
			POCD_MT000040RecordTarget element = new POCD_MT000040RecordTarget();
			facade.consol.generalheaderconstraints.RecordTargetFacade elementFacade = new facade.consol.generalheaderconstraints.RecordTargetFacade(element);
			elementFacade.Init();
			self.recordTarget = SetOrAdd(self.recordTarget, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.RecordTargetFacade RecordTarget()		{
			return GetOrCreateRecordTarget();
		}

		public List<facade.consol.generalheaderconstraints.ComponentOfFacade> componentOf()
		{
			return Set(self.componentOf).FindAll( x => facade.consol.generalheaderconstraints.ComponentOfFacade.isKindOf(x)).ConvertAll( x => new facade.consol.generalheaderconstraints.ComponentOfFacade(x));
		}

		public facade.consol.generalheaderconstraints.ComponentOfFacade GetOrCreateComponentOf()
		{
			List<facade.consol.generalheaderconstraints.ComponentOfFacade> lastOrDefault = componentOf();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "componentOf");
				return lastOrDefault.Last();
			}
			return CreateAnotherComponentOf();
		}

		public facade.consol.generalheaderconstraints.ComponentOfFacade CreateAnotherComponentOf()
		{
			POCD_MT000040Component1 element = new POCD_MT000040Component1();
			facade.consol.generalheaderconstraints.ComponentOfFacade elementFacade = new facade.consol.generalheaderconstraints.ComponentOfFacade(element);
			elementFacade.Init();
			self.componentOf = SetOrAdd(self.componentOf, element);
			return elementFacade;
		}

		public facade.consol.generalheaderconstraints.ComponentOfFacade ComponentOf()		{
			return GetOrCreateComponentOf();
		}

		public List<facade.datatypes.IIFacade> setId()
		{
			return Set(self.setId).FindAll( x => x is II).ConvertAll( x => x as II).ConvertAll( x => new facade.datatypes.IIFacade(x));
		}

		public facade.datatypes.IIFacade GetOrCreateSetId()
		{
			List<facade.datatypes.IIFacade> lastOrDefault = setId();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "setId");
				return lastOrDefault.Last();
			}
			return CreateAnotherSetId();
		}

		public facade.datatypes.IIFacade CreateAnotherSetId()
		{
			II element = new II();
			facade.datatypes.IIFacade elementFacade = new facade.datatypes.IIFacade(element);
			elementFacade.Init();
			self.setId = SetOrAdd(self.setId, element);
			return elementFacade;
		}

		public facade.datatypes.IIFacade SetId()		{
			return GetOrCreateSetId();
		}

		public List<facade.datatypes.INTFacade> versionNumber()
		{
			return Set(self.versionNumber).FindAll( x => x is INT).ConvertAll( x => x as INT).ConvertAll( x => new facade.datatypes.INTFacade(x));
		}

		public facade.datatypes.INTFacade GetOrCreateVersionNumber()
		{
			List<facade.datatypes.INTFacade> lastOrDefault = versionNumber();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "versionNumber");
				return lastOrDefault.Last();
			}
			return CreateAnotherVersionNumber();
		}

		public facade.datatypes.INTFacade CreateAnotherVersionNumber()
		{
			INT element = new INT();
			facade.datatypes.INTFacade elementFacade = new facade.datatypes.INTFacade(element);
			elementFacade.Init();
			self.versionNumber = SetOrAdd(self.versionNumber, element);
			return elementFacade;
		}

		public facade.datatypes.INTFacade VersionNumber()		{
			return GetOrCreateVersionNumber();
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

		public List<facade.datatypes.TSFacade> copyTime()
		{
			return Set(self.copyTime).FindAll( x => x is TS).ConvertAll( x => x as TS).ConvertAll( x => new facade.datatypes.TSFacade(x));
		}

		public facade.datatypes.TSFacade GetOrCreateCopyTime()
		{
			List<facade.datatypes.TSFacade> lastOrDefault = copyTime();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "copyTime");
				return lastOrDefault.Last();
			}
			return CreateAnotherCopyTime();
		}

		public facade.datatypes.TSFacade CreateAnotherCopyTime()
		{
			TS element = new TS();
			facade.datatypes.TSFacade elementFacade = new facade.datatypes.TSFacade(element);
			elementFacade.Init();
			self.copyTime = SetOrAdd(self.copyTime, element);
			return elementFacade;
		}

		public facade.datatypes.TSFacade CopyTime()		{
			return GetOrCreateCopyTime();
		}

		public List<facade.cda.Participant1Facade> participant()
		{
			return Set(self.participant).FindAll( x => facade.cda.Participant1Facade.isKindOf(x)).ConvertAll( x => new facade.cda.Participant1Facade(x));
		}

		public facade.cda.Participant1Facade GetOrCreateParticipant()
		{
			List<facade.cda.Participant1Facade> lastOrDefault = participant();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "participant");
				return lastOrDefault.Last();
			}
			return CreateAnotherParticipant();
		}

		public facade.cda.Participant1Facade CreateAnotherParticipant()
		{
			POCD_MT000040Participant1 element = new POCD_MT000040Participant1();
			facade.cda.Participant1Facade elementFacade = new facade.cda.Participant1Facade(element);
			elementFacade.Init();
			self.participant = SetOrAdd(self.participant, element);
			return elementFacade;
		}

		public facade.cda.Participant1Facade Participant()		{
			return GetOrCreateParticipant();
		}

		public List<facade.cda.RelatedDocumentFacade> relatedDocument()
		{
			return Set(self.relatedDocument).FindAll( x => facade.cda.RelatedDocumentFacade.isKindOf(x)).ConvertAll( x => new facade.cda.RelatedDocumentFacade(x));
		}

		public facade.cda.RelatedDocumentFacade GetOrCreateRelatedDocument()
		{
			List<facade.cda.RelatedDocumentFacade> lastOrDefault = relatedDocument();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "relatedDocument");
				return lastOrDefault.Last();
			}
			return CreateAnotherRelatedDocument();
		}

		public facade.cda.RelatedDocumentFacade CreateAnotherRelatedDocument()
		{
			POCD_MT000040RelatedDocument element = new POCD_MT000040RelatedDocument();
			facade.cda.RelatedDocumentFacade elementFacade = new facade.cda.RelatedDocumentFacade(element);
			elementFacade.Init();
			self.relatedDocument = SetOrAdd(self.relatedDocument, element);
			return elementFacade;
		}

		public facade.cda.RelatedDocumentFacade RelatedDocument()		{
			return GetOrCreateRelatedDocument();
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

		public List<ActClinicalDocument> classCode()
		{
			return Set(self.@classCode);
		}

		public ActClinicalDocument GetOrCreateClassCode()
		{
			List<ActClinicalDocument> lastOrDefault = classCode();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "classCode");
				return lastOrDefault.Last();
			}
			return CreateAnotherClassCode();
		}

		public ActClinicalDocument CreateAnotherClassCode()
		{
			MarkSpecified(self, "classCode");
			ActClinicalDocument element = new ActClinicalDocument();
			self.@classCode = SetOrAdd(self.@classCode, element);
			return element;
		}

		public ActClinicalDocument ClassCode()		{
			return GetOrCreateClassCode();
		}

		public void ClassCode(ActClinicalDocument value)		{
			self.@classCode = SetOrAdd(self.@classCode, value);
		}

		public List<ActMood> moodCode()
		{
			return Set(self.@moodCode);
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

}
}
