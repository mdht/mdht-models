using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol.continuityofcaredocument.documentationof.serviceevent
{
    public class EffectiveTimeFacade : facade.FacadeBase
    {

		public IVL_TS self;

		public EffectiveTimeFacade()
		{
			this.self = new IVL_TS();
		}

		public EffectiveTimeFacade(IVL_TS self)
		{
			this.self = self;
		}

		public static bool isKindOf(IVL_TS self)
		{
			return true;
		}

		override public object getModelElement()
		{
			return self;
		}

		public void Init()
		{
			GetOrCreateHigh();
			GetOrCreateLow();
		}

		/**
		 *UML path: /ContinuityOfCareDocument/documentationOf/serviceEvent/effectiveTime
		 *UML root path: /ContinuityOfCareDocument/documentationOf/serviceEvent/effectiveTime
		*/
		public void Validate(ValidationBuilder vb, DataElementLevel? del)
		{

				high().ForEach(x => x.Validate(vb, del));
				low().ForEach(x => x.Validate(vb, del));
				center().ForEach(x => x.Validate(vb, del));
				width().ForEach(x => x.Validate(vb, del));
		}
		public List<facade.datatypes.IVXB_TSFacade> high()
		{
			return Set(self.high).FindAll( x => x is IVXB_TS).ConvertAll( x => x as IVXB_TS).ConvertAll( x => new facade.datatypes.IVXB_TSFacade(x));
		}

		public facade.datatypes.IVXB_TSFacade GetOrCreateHigh()
		{
			List<facade.datatypes.IVXB_TSFacade> lastOrDefault = high();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "high");
				return lastOrDefault.Last();
			}
			return CreateAnotherHigh();
		}

		public facade.datatypes.IVXB_TSFacade CreateAnotherHigh()
		{
			IVXB_TS element = new IVXB_TS();
			facade.datatypes.IVXB_TSFacade elementFacade = new facade.datatypes.IVXB_TSFacade(element);
			elementFacade.Init();
			self.high = SetOrAdd(self.high, element);
			return elementFacade;
		}

		public facade.datatypes.IVXB_TSFacade High()		{
			return GetOrCreateHigh();
		}

		public List<facade.datatypes.IVXB_TSFacade> low()
		{
			return Set(self.low).FindAll( x => x is IVXB_TS).ConvertAll( x => x as IVXB_TS).ConvertAll( x => new facade.datatypes.IVXB_TSFacade(x));
		}

		public facade.datatypes.IVXB_TSFacade GetOrCreateLow()
		{
			List<facade.datatypes.IVXB_TSFacade> lastOrDefault = low();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "low");
				return lastOrDefault.Last();
			}
			return CreateAnotherLow();
		}

		public facade.datatypes.IVXB_TSFacade CreateAnotherLow()
		{
			IVXB_TS element = new IVXB_TS();
			facade.datatypes.IVXB_TSFacade elementFacade = new facade.datatypes.IVXB_TSFacade(element);
			elementFacade.Init();
			self.low = SetOrAdd(self.low, element);
			return elementFacade;
		}

		public facade.datatypes.IVXB_TSFacade Low()		{
			return GetOrCreateLow();
		}

		public List<facade.datatypes.TSFacade> center()
		{
			return Set(self.center).FindAll( x => x is TS).ConvertAll( x => x as TS).ConvertAll( x => new facade.datatypes.TSFacade(x));
		}

		public facade.datatypes.TSFacade GetOrCreateCenter()
		{
			List<facade.datatypes.TSFacade> lastOrDefault = center();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "center");
				return lastOrDefault.Last();
			}
			return CreateAnotherCenter();
		}

		public facade.datatypes.TSFacade CreateAnotherCenter()
		{
			TS element = new TS();
			facade.datatypes.TSFacade elementFacade = new facade.datatypes.TSFacade(element);
			elementFacade.Init();
			self.center = SetOrAdd(self.center, element);
			return elementFacade;
		}

		public facade.datatypes.TSFacade Center()		{
			return GetOrCreateCenter();
		}

		public List<facade.datatypes.PQFacade> width()
		{
			return Set(self.width).FindAll( x => x is PQ).ConvertAll( x => x as PQ).ConvertAll( x => new facade.datatypes.PQFacade(x));
		}

		public facade.datatypes.PQFacade GetOrCreateWidth()
		{
			List<facade.datatypes.PQFacade> lastOrDefault = width();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "width");
				return lastOrDefault.Last();
			}
			return CreateAnotherWidth();
		}

		public facade.datatypes.PQFacade CreateAnotherWidth()
		{
			PQ element = new PQ();
			facade.datatypes.PQFacade elementFacade = new facade.datatypes.PQFacade(element);
			elementFacade.Init();
			self.width = SetOrAdd(self.width, element);
			return elementFacade;
		}

		public facade.datatypes.PQFacade Width()		{
			return GetOrCreateWidth();
		}

		public List<SetOperator> @operator()
		{
			return Set(self.@operator);
		}

		public SetOperator GetOrCreateOperator()
		{
			List<SetOperator> lastOrDefault = @operator();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "operator");
				return lastOrDefault.Last();
			}
			return CreateAnotherOperator();
		}

		public SetOperator CreateAnotherOperator()
		{
			MarkSpecified(self, "operator");
			SetOperator element = new SetOperator();
			self.@operator = SetOrAdd(self.@operator, element);
			return element;
		}

		public SetOperator Operator()		{
			return GetOrCreateOperator();
		}

		public void Operator(SetOperator value)		{
			self.@operator = SetOrAdd(self.@operator, value);
		}

		public List<string> value()
		{
			return Set(self.@value);
		}

		public string GetOrCreateValue()
		{
			List<string> lastOrDefault = value();
			if (lastOrDefault.Count != 0)
			{
				MarkSpecified(self, "value");
				return lastOrDefault.Last();
			}
			return CreateAnotherValue();
		}

		public string CreateAnotherValue()
		{
			MarkSpecified(self, "value");
			string element = String.Empty;
			self.@value = SetOrAdd(self.@value, element);
			return element;
		}

		public string Value()		{
			return GetOrCreateValue();
		}

		public void Value(string value)		{
			self.@value = SetOrAdd(self.@value, value);
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
