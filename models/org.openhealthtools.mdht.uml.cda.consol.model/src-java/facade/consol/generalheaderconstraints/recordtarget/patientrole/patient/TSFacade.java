package facade.consol.generalheaderconstraints.recordtarget.patientrole.patient;

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

public class TSFacade extends facade.FacadeBase {

	public TS self;

	public TSFacade()
	{
		this.self = DatatypesFactory.eINSTANCE.createTS();
	}

	public TSFacade(TS self)
	{
		this.self = self;
	}

	public static boolean isKindOf(TS self)
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
		GetOrCreateValue();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(vb, del);

	}
	/**
	 * OCL:  ( self.isNullFlavorUndefined() implies (not self.value.oclIsUndefined() ))
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::TS
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::TS::GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self).anyMatch(i1219 -> i1219.isNullFlavorUndefined())) || !(Set(self.getValue()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.2.i value\n\t\tConformance: SHALL contain exactly one [1..1] value (CONF:5299, CONF:5300)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
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
