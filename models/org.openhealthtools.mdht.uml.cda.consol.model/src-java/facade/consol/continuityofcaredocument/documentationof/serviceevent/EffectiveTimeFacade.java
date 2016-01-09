package facade.consol.continuityofcaredocument.documentationof.serviceevent;

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

public class EffectiveTimeFacade extends facade.FacadeBase {

	public IVL_TS self;

	public EffectiveTimeFacade()
	{
		this.self = DatatypesFactory.eINSTANCE.createIVL_TS();
	}

	public EffectiveTimeFacade(IVL_TS self)
	{
		this.self = self;
	}

	public static boolean isKindOf(IVL_TS self)
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
		GetOrCreateHigh();
		GetOrCreateLow();
	}

	/**
	 *UML path: /ContinuityOfCareDocument/documentationOf/serviceEvent/effectiveTime
	 *UML root path: /ContinuityOfCareDocument/documentationOf/serviceEvent/effectiveTime
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(vb, del);
			ValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(vb, del);

			high().forEach(x -> x.Validate(vb, del));
			low().forEach(x -> x.Validate(vb, del));
			center().forEach(x -> x.Validate(vb, del));
			width().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (not self.high.oclIsUndefined() ))
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent/effectiveTime
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::EffectiveTime
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::EffectiveTime::ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i3235 -> i3235.isNullFlavorUndefined())) || !(Set(self.getHigh()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.b.1 high\n\t\tConformance: SHALL contain exactly one [1..1] high (CONF:8455)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (not self.low.oclIsUndefined() ))
	 * Context: /ContinuityOfCareDocument/documentationOf/serviceEvent/effectiveTime
	 * Context Class: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::EffectiveTime
	 * Constraint Name: consol::ContinuityOfCareDocument::DocumentationOf::ServiceEvent::EffectiveTime::ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow
	 */
	public boolean ValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i3253 -> i3253.isNullFlavorUndefined())) || !(Set(self.getLow()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.5.i.b.2 low\n\t\tConformance: SHALL contain exactly one [1..1] low (CONF:8454)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.IVXB_TSFacade> high()
	{
		return Set(self.getHigh()).filter( x -> x instanceof IVXB_TS).map( x -> (IVXB_TS) x).map( x -> new facade.datatypes.IVXB_TSFacade(x));
	}

	public facade.datatypes.IVXB_TSFacade GetOrCreateHigh()
	{
		Optional<facade.datatypes.IVXB_TSFacade> lastOrDefault = high().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getIVL_TS_High());
			return lastOrDefault.get();
		}
		return CreateAnotherHigh();
	}

	public facade.datatypes.IVXB_TSFacade CreateAnotherHigh()
	{
		IVXB_TS element = DatatypesFactory.eINSTANCE.createIVXB_TS();
		facade.datatypes.IVXB_TSFacade elementFacade = new facade.datatypes.IVXB_TSFacade(element);
		elementFacade.Init();
		self.setHigh(element);
		return elementFacade;
	}

	public facade.datatypes.IVXB_TSFacade High() {
		return GetOrCreateHigh();
	}

	public Stream<facade.datatypes.IVXB_TSFacade> low()
	{
		return Set(self.getLow()).filter( x -> x instanceof IVXB_TS).map( x -> (IVXB_TS) x).map( x -> new facade.datatypes.IVXB_TSFacade(x));
	}

	public facade.datatypes.IVXB_TSFacade GetOrCreateLow()
	{
		Optional<facade.datatypes.IVXB_TSFacade> lastOrDefault = low().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getIVL_TS_Low());
			return lastOrDefault.get();
		}
		return CreateAnotherLow();
	}

	public facade.datatypes.IVXB_TSFacade CreateAnotherLow()
	{
		IVXB_TS element = DatatypesFactory.eINSTANCE.createIVXB_TS();
		facade.datatypes.IVXB_TSFacade elementFacade = new facade.datatypes.IVXB_TSFacade(element);
		elementFacade.Init();
		self.setLow(element);
		return elementFacade;
	}

	public facade.datatypes.IVXB_TSFacade Low() {
		return GetOrCreateLow();
	}

	public Stream<facade.datatypes.TSFacade> center()
	{
		return Set(self.getCenter()).filter( x -> x instanceof TS).map( x -> (TS) x).map( x -> new facade.datatypes.TSFacade(x));
	}

	public facade.datatypes.TSFacade GetOrCreateCenter()
	{
		Optional<facade.datatypes.TSFacade> lastOrDefault = center().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getIVL_TS_Center());
			return lastOrDefault.get();
		}
		return CreateAnotherCenter();
	}

	public facade.datatypes.TSFacade CreateAnotherCenter()
	{
		TS element = DatatypesFactory.eINSTANCE.createTS();
		facade.datatypes.TSFacade elementFacade = new facade.datatypes.TSFacade(element);
		elementFacade.Init();
		self.setCenter(element);
		return elementFacade;
	}

	public facade.datatypes.TSFacade Center() {
		return GetOrCreateCenter();
	}

	public Stream<facade.datatypes.PQFacade> width()
	{
		return Set(self.getWidth()).filter( x -> x instanceof PQ).map( x -> (PQ) x).map( x -> new facade.datatypes.PQFacade(x));
	}

	public facade.datatypes.PQFacade GetOrCreateWidth()
	{
		Optional<facade.datatypes.PQFacade> lastOrDefault = width().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getIVL_TS_Width());
			return lastOrDefault.get();
		}
		return CreateAnotherWidth();
	}

	public facade.datatypes.PQFacade CreateAnotherWidth()
	{
		PQ element = DatatypesFactory.eINSTANCE.createPQ();
		facade.datatypes.PQFacade elementFacade = new facade.datatypes.PQFacade(element);
		elementFacade.Init();
		self.setWidth(element);
		return elementFacade;
	}

	public facade.datatypes.PQFacade Width() {
		return GetOrCreateWidth();
	}

	public Stream<SetOperator> operator()
	{
		return Set(self.getOperator());
	}

	public SetOperator GetOrCreateOperator()
	{
		Optional<SetOperator> lastOrDefault = operator().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getSXCM_TS_Operator());
			return lastOrDefault.get();
		}
		return CreateAnotherOperator();
	}

	public SetOperator CreateAnotherOperator()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getSXCM_TS_Operator());
		SetOperator element = SetOperator.get(0);
		self.setOperator(element);
		return element;
	}

	public SetOperator Operator() {
		return GetOrCreateOperator();
	}

	public void Operator(SetOperator value) {
		self.setOperator(value);
	}

	public Stream<String> value()
	{
		return Set(self.getValue());
	}

	public String GetOrCreateValue()
	{
		Optional<String> lastOrDefault = value().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getTS_Value());
			return lastOrDefault.get();
		}
		return CreateAnotherValue();
	}

	public String CreateAnotherValue()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getTS_Value());
		String element = "";
		self.setValue(element);
		return element;
	}

	public String Value() {
		return GetOrCreateValue();
	}

	public void Value(String value) {
		self.setValue(value);
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
