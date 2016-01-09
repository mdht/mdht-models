package facade.consol.generalheaderconstraints.authenticator.assignedentity;

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

public class TELFacade extends facade.FacadeBase {

	public TEL self;

	public TELFacade()
	{
		this.self = DatatypesFactory.eINSTANCE.createTEL();
	}

	public TELFacade(TEL self)
	{
		this.self = self;
	}

	public static boolean isKindOf(TEL self)
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
	}

	/**
	 *UML path: /GeneralHeaderConstraints/authenticator/assignedEntity/telecom
	 *UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity/telecom
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(vb, del);

			useablePeriod().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
	 * Context: /GeneralHeaderConstraints/authenticator/assignedEntity/telecom
	 * Context Class: consol::GeneralHeaderConstraints::Authenticator::AssignedEntity::TEL
	 * Constraint Name: consol::GeneralHeaderConstraints::Authenticator::AssignedEntity::TEL::GeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i2553 -> i2553.isNullFlavorUndefined())) || Set(self.getUses()).count()==0 || One(Set(self.getUses()).count())<=1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.19.iii.d.1 use\n\t\tConformance: SHOULD contain zero or one [0..1] @use (CONF:8000)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<TelecommunicationAddressUse> use()
	{
		return Set(self.getUses());
	}

	public TelecommunicationAddressUse GetOrCreateUse()
	{
		Optional<TelecommunicationAddressUse> lastOrDefault = use().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getTEL_Use());
			return lastOrDefault.get();
		}
		return CreateAnotherUse();
	}

	public TelecommunicationAddressUse CreateAnotherUse()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getTEL_Use());
		TelecommunicationAddressUse element = TelecommunicationAddressUse.get(0);
		self.getUses().add(element);
		return element;
	}

	public TelecommunicationAddressUse Use() {
		return GetOrCreateUse();
	}

	public void Use(TelecommunicationAddressUse value) {
		self.getUses().add(value);
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getTEL_UseablePeriod());
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

	public Stream<String> value()
	{
		return Set(self.getValue());
	}

	public String GetOrCreateValue()
	{
		Optional<String> lastOrDefault = value().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getURL_Value());
			return lastOrDefault.get();
		}
		return CreateAnotherValue();
	}

	public String CreateAnotherValue()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE.getURL_Value());
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
