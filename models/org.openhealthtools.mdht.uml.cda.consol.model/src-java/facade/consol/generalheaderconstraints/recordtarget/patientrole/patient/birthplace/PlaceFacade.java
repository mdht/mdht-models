package facade.consol.generalheaderconstraints.recordtarget.patientrole.patient.birthplace;

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

public class PlaceFacade extends facade.FacadeBase {

	public Place self;

	public PlaceFacade()
	{
		this.self = CDAFactory.eINSTANCE.createPlace();
	}

	public PlaceFacade(Place self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Place self)
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
		GetOrCreateAddr();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
	 *UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(vb, del);

			addr().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			name().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: not self.addr.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
	 * Context Class: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace::Place
	 * Constraint Name: consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace::Place::GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr
	 */
	public boolean ValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getAddr()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.12.i.d.10.i.a addr\n\t\tConformance: SHALL contain exactly one [1..1] addr (CONF:5397)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.ADFacade> addr()
	{
		return Set(self.getAddr()).filter( x -> x instanceof AD).map( x -> (AD) x).map( x -> new facade.datatypes.ADFacade(x));
	}

	public facade.datatypes.ADFacade GetOrCreateAddr()
	{
		Optional<facade.datatypes.ADFacade> lastOrDefault = addr().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_Addr());
			return lastOrDefault.get();
		}
		return CreateAnotherAddr();
	}

	public facade.datatypes.ADFacade CreateAnotherAddr()
	{
		AD element = DatatypesFactory.eINSTANCE.createAD();
		facade.datatypes.ADFacade elementFacade = new facade.datatypes.ADFacade(element);
		elementFacade.Init();
		self.setAddr(element);
		return elementFacade;
	}

	public facade.datatypes.ADFacade Addr() {
		return GetOrCreateAddr();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_TemplateId());
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

	public Stream<facade.datatypes.ENFacade> name()
	{
		return Set(self.getName()).filter( x -> x instanceof EN).map( x -> (EN) x).map( x -> new facade.datatypes.ENFacade(x));
	}

	public facade.datatypes.ENFacade GetOrCreateName()
	{
		Optional<facade.datatypes.ENFacade> lastOrDefault = name().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_Name());
			return lastOrDefault.get();
		}
		return CreateAnotherName();
	}

	public facade.datatypes.ENFacade CreateAnotherName()
	{
		EN element = DatatypesFactory.eINSTANCE.createEN();
		facade.datatypes.ENFacade elementFacade = new facade.datatypes.ENFacade(element);
		elementFacade.Init();
		self.setName(element);
		return elementFacade;
	}

	public facade.datatypes.ENFacade Name() {
		return GetOrCreateName();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_NullFlavor());
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

	public Stream<EntityClassPlace> classCode()
	{
		return Set(self.getClassCode());
	}

	public EntityClassPlace GetOrCreateClassCode()
	{
		Optional<EntityClassPlace> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public EntityClassPlace CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_ClassCode());
		EntityClassPlace element = EntityClassPlace.get(0);
		self.setClassCode(element);
		return element;
	}

	public EntityClassPlace ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(EntityClassPlace value) {
		self.setClassCode(value);
	}

	public Stream<EntityDeterminer> determinerCode()
	{
		return Set(self.getDeterminerCode());
	}

	public EntityDeterminer GetOrCreateDeterminerCode()
	{
		Optional<EntityDeterminer> lastOrDefault = determinerCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_DeterminerCode());
			return lastOrDefault.get();
		}
		return CreateAnotherDeterminerCode();
	}

	public EntityDeterminer CreateAnotherDeterminerCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getPlace_DeterminerCode());
		EntityDeterminer element = EntityDeterminer.get(0);
		self.setDeterminerCode(element);
		return element;
	}

	public EntityDeterminer DeterminerCode() {
		return GetOrCreateDeterminerCode();
	}

	public void DeterminerCode(EntityDeterminer value) {
		self.setDeterminerCode(value);
	}

}
