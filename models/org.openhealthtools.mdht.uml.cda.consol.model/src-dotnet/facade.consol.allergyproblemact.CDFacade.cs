using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.allergyproblemact
{
    public class CDFacade : facade.FacadeBase
    {

		public CD self;

		public CDFacade()
		{
			this.self = new CD();
		}

		public CDFacade(CD self)
		{
			this.self = self;
		}

		public static bool isKindOf(CD self)
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
		 *UML path: /AllergyProblemAct/code
		 *UML root path: /ContinuityOfCareDocument/component/structuredBody/allergiesSection/allergiesSection/entry/allergyProblemAct/code
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				originalText().ForEach(x => x.Validate(vb, del));
				qualifier().ForEach(x => x.Validate(vb, del));
				translation().ForEach(x => x.Validate(vb, del));
		}
		public List<string> code()
		{
			return Set(self.@code);
		}

		public string GetOrCreateCode()
		{
			List<string> lastOrDefault = code();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "code");
				return lastOrDefault.Last();
			}
			return CreateAnotherCode();
		}

		public string CreateAnotherCode()
		{
			MarkSpecified(self, "code");
			string element = String.Empty;
			self.@code = SetOrAdd(self.@code, element);
			return element;
		}

		public string Code()		{
			return GetOrCreateCode();
		}

		public void Code(string value)		{
			self.@code = SetOrAdd(self.@code, value);
		}

		public List<string> codeSystem()
		{
			return Set(self.@codeSystem);
		}

		public string GetOrCreateCodeSystem()
		{
			List<string> lastOrDefault = codeSystem();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "codeSystem");
				return lastOrDefault.Last();
			}
			return CreateAnotherCodeSystem();
		}

		public string CreateAnotherCodeSystem()
		{
			MarkSpecified(self, "codeSystem");
			string element = String.Empty;
			self.@codeSystem = SetOrAdd(self.@codeSystem, element);
			return element;
		}

		public string CodeSystem()		{
			return GetOrCreateCodeSystem();
		}

		public void CodeSystem(string value)		{
			self.@codeSystem = SetOrAdd(self.@codeSystem, value);
		}

		public List<facade.datatypes.EDFacade> originalText()
		{
			return Set(self.originalText).FindAll( x => x is ED).ConvertAll( x => x as ED).ConvertAll( x => new facade.datatypes.EDFacade(x));
		}

		public facade.datatypes.EDFacade GetOrCreateOriginalText()
		{
			List<facade.datatypes.EDFacade> lastOrDefault = originalText();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "originalText");
				return lastOrDefault.Last();
			}
			return CreateAnotherOriginalText();
		}

		public facade.datatypes.EDFacade CreateAnotherOriginalText()
		{
			ED element = new ED();
			facade.datatypes.EDFacade elementFacade = new facade.datatypes.EDFacade(element);
			elementFacade.Init();
			self.originalText = SetOrAdd(self.originalText, element);
			return elementFacade;
		}

		public facade.datatypes.EDFacade OriginalText()		{
			return GetOrCreateOriginalText();
		}

		public List<facade.datatypes.CRFacade> qualifier()
		{
			return Set(self.qualifier).FindAll( x => x is CR).ConvertAll( x => x as CR).ConvertAll( x => new facade.datatypes.CRFacade(x));
		}

		public facade.datatypes.CRFacade GetOrCreateQualifier()
		{
			List<facade.datatypes.CRFacade> lastOrDefault = qualifier();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "qualifier");
				return lastOrDefault.Last();
			}
			return CreateAnotherQualifier();
		}

		public facade.datatypes.CRFacade CreateAnotherQualifier()
		{
			CR element = new CR();
			facade.datatypes.CRFacade elementFacade = new facade.datatypes.CRFacade(element);
			elementFacade.Init();
			self.qualifier = SetOrAdd(self.qualifier, element);
			return elementFacade;
		}

		public facade.datatypes.CRFacade Qualifier()		{
			return GetOrCreateQualifier();
		}

		public List<facade.datatypes.CDFacade> translation()
		{
			return Set(self.translation).FindAll( x => x is CD).ConvertAll( x => x as CD).ConvertAll( x => new facade.datatypes.CDFacade(x));
		}

		public facade.datatypes.CDFacade GetOrCreateTranslation()
		{
			List<facade.datatypes.CDFacade> lastOrDefault = translation();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "translation");
				return lastOrDefault.Last();
			}
			return CreateAnotherTranslation();
		}

		public facade.datatypes.CDFacade CreateAnotherTranslation()
		{
			CD element = new CD();
			facade.datatypes.CDFacade elementFacade = new facade.datatypes.CDFacade(element);
			elementFacade.Init();
			self.translation = SetOrAdd(self.translation, element);
			return elementFacade;
		}

		public facade.datatypes.CDFacade Translation()		{
			return GetOrCreateTranslation();
		}

		public List<string> codeSystemName()
		{
			return Set(self.@codeSystemName);
		}

		public string GetOrCreateCodeSystemName()
		{
			List<string> lastOrDefault = codeSystemName();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "codeSystemName");
				return lastOrDefault.Last();
			}
			return CreateAnotherCodeSystemName();
		}

		public string CreateAnotherCodeSystemName()
		{
			MarkSpecified(self, "codeSystemName");
			string element = String.Empty;
			self.@codeSystemName = SetOrAdd(self.@codeSystemName, element);
			return element;
		}

		public string CodeSystemName()		{
			return GetOrCreateCodeSystemName();
		}

		public void CodeSystemName(string value)		{
			self.@codeSystemName = SetOrAdd(self.@codeSystemName, value);
		}

		public List<string> codeSystemVersion()
		{
			return Set(self.@codeSystemVersion);
		}

		public string GetOrCreateCodeSystemVersion()
		{
			List<string> lastOrDefault = codeSystemVersion();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "codeSystemVersion");
				return lastOrDefault.Last();
			}
			return CreateAnotherCodeSystemVersion();
		}

		public string CreateAnotherCodeSystemVersion()
		{
			MarkSpecified(self, "codeSystemVersion");
			string element = String.Empty;
			self.@codeSystemVersion = SetOrAdd(self.@codeSystemVersion, element);
			return element;
		}

		public string CodeSystemVersion()		{
			return GetOrCreateCodeSystemVersion();
		}

		public void CodeSystemVersion(string value)		{
			self.@codeSystemVersion = SetOrAdd(self.@codeSystemVersion, value);
		}

		public List<string> displayName()
		{
			return Set(self.@displayName);
		}

		public string GetOrCreateDisplayName()
		{
			List<string> lastOrDefault = displayName();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "displayName");
				return lastOrDefault.Last();
			}
			return CreateAnotherDisplayName();
		}

		public string CreateAnotherDisplayName()
		{
			MarkSpecified(self, "displayName");
			string element = String.Empty;
			self.@displayName = SetOrAdd(self.@displayName, element);
			return element;
		}

		public string DisplayName()		{
			return GetOrCreateDisplayName();
		}

		public void DisplayName(string value)		{
			self.@displayName = SetOrAdd(self.@displayName, value);
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
