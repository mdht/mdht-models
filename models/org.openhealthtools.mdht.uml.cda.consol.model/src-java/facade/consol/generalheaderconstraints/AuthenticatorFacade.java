package facade.consol.generalheaderconstraints;

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

public class AuthenticatorFacade extends facade.FacadeBase {

	public Authenticator self;

	public static String CODE = "S";

	public static String CODESYSTEM = "2.16.840.1.113883.5.89";

	public AuthenticatorFacade()
	{
		this.self = CDAFactory.eINSTANCE.createAuthenticator();
	}

	public AuthenticatorFacade(Authenticator self)
	{
		this.self = self;
	}

	public static boolean isKindOf(Authenticator self)
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
		GetOrCreateTime();
		GetOrCreateSignatureCode();
		GetOrCreateSignatureCode().self.setCode("S");
		GetOrCreateSignatureCode().self.setCodeSystem("2.16.840.1.113883.5.89");
		GetOrCreateAssignedEntity();
	}

	/**
	 *UML path: /GeneralHeaderConstraints/authenticator
	 *UML root path: /GeneralHeaderConstraints/authenticator
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsAuthenticatorTime(vb, del);
			ValidateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(vb, del);
			ValidateGeneralHeaderConstraintsAuthenticatorSignatureCode(vb, del);
			ValidateGeneralHeaderConstraintsAuthenticatorAssignedEntity(vb, del);

			time().forEach(x -> x.Validate(vb, del));
			signatureCode().forEach(x -> x.Validate(vb, del));
			assignedEntity().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: not self.time.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/authenticator
	 * Context Class: consol::GeneralHeaderConstraints::Authenticator
	 * Constraint Name: consol::GeneralHeaderConstraints::Authenticator::GeneralHeaderConstraintsAuthenticatorTime
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthenticatorTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.19.i time\n\t\tConformance: SHALL contain exactly one [1..1] time (CONF:5608)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: true
	 * Context: /GeneralHeaderConstraints/authenticator
	 * Context Class: consol::GeneralHeaderConstraints::Authenticator
	 * Constraint Name: consol::GeneralHeaderConstraints::Authenticator::GeneralHeaderConstraintsAuthenticatorSignatureCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = true;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.19.ii signatureCode\n\t\tConformance: SHALL contain exactly one [1..1] signatureCode/@code=\"S\"  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5610)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and  let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in  value.code = 'S'
	 * Context: /GeneralHeaderConstraints/authenticator
	 * Context Class: consol::GeneralHeaderConstraints::Authenticator
	 * Constraint Name: consol::GeneralHeaderConstraints::Authenticator::GeneralHeaderConstraintsAuthenticatorSignatureCode
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthenticatorSignatureCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getSignatureCode()).count()==0) && true && Set(self.getSignatureCode()).filter(i2449 -> Set(i2449.getCode()).collect(Collectors.toList()).contains("S")).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.19.ii signatureCode\n\t\tConformance: SHALL contain exactly one [1..1] signatureCode/@code=\"S\"  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5610)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity))
	 * Context: /GeneralHeaderConstraints/authenticator
	 * Context Class: consol::GeneralHeaderConstraints::Authenticator
	 * Constraint Name: consol::GeneralHeaderConstraints::Authenticator::GeneralHeaderConstraintsAuthenticatorAssignedEntity
	 */
	public boolean ValidateGeneralHeaderConstraintsAuthenticatorAssignedEntity(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getAssignedEntity()).filter(i2459 -> !(Set(i2459).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.19.iii assignedEntity\n\t\tConformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5612)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.datatypes.TSFacade> time()
	{
		return Set(self.getTime()).filter( x -> x instanceof TS).map( x -> (TS) x).map( x -> new facade.datatypes.TSFacade(x));
	}

	public facade.datatypes.TSFacade GetOrCreateTime()
	{
		Optional<facade.datatypes.TSFacade> lastOrDefault = time().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_Time());
			return lastOrDefault.get();
		}
		return CreateAnotherTime();
	}

	public facade.datatypes.TSFacade CreateAnotherTime()
	{
		TS element = DatatypesFactory.eINSTANCE.createTS();
		facade.datatypes.TSFacade elementFacade = new facade.datatypes.TSFacade(element);
		elementFacade.Init();
		self.setTime(element);
		return elementFacade;
	}

	public facade.datatypes.TSFacade Time() {
		return GetOrCreateTime();
	}

	public Stream<facade.datatypes.CSFacade> signatureCode()
	{
		return Set(self.getSignatureCode()).filter( x -> x instanceof CS).map( x -> (CS) x).map( x -> new facade.datatypes.CSFacade(x));
	}

	public facade.datatypes.CSFacade GetOrCreateSignatureCode()
	{
		Optional<facade.datatypes.CSFacade> lastOrDefault = signatureCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_SignatureCode());
			return lastOrDefault.get();
		}
		return CreateAnotherSignatureCode();
	}

	public facade.datatypes.CSFacade CreateAnotherSignatureCode()
	{
		CS element = DatatypesFactory.eINSTANCE.createCS();
		facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
		elementFacade.Init();
		self.setSignatureCode(element);
		return elementFacade;
	}

	public facade.datatypes.CSFacade SignatureCode() {
		return GetOrCreateSignatureCode();
	}

	public Stream<facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade> assignedEntity()
	{
		return Set(self.getAssignedEntity()).filter( x -> facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade(x));
	}

	public facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade GetOrCreateAssignedEntity()
	{
		Optional<facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade> lastOrDefault = assignedEntity().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_AssignedEntity());
			return lastOrDefault.get();
		}
		return CreateAnotherAssignedEntity();
	}

	public facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade CreateAnotherAssignedEntity()
	{
		AssignedEntity element = CDAFactory.eINSTANCE.createAssignedEntity();
		facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade(element);
		elementFacade.Init();
		self.setAssignedEntity(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.authenticator.AssignedEntityFacade AssignedEntity() {
		return GetOrCreateAssignedEntity();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_TemplateId());
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

	public Stream<NullFlavor> nullFlavor()
	{
		return Set(self.getNullFlavor());
	}

	public NullFlavor GetOrCreateNullFlavor()
	{
		Optional<NullFlavor> lastOrDefault = nullFlavor().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_NullFlavor());
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

	public Stream<ParticipationType> typeCode()
	{
		return Set(self.getTypeCode());
	}

	public ParticipationType GetOrCreateTypeCode()
	{
		Optional<ParticipationType> lastOrDefault = typeCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public ParticipationType CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getAuthenticator_TypeCode());
		ParticipationType element = ParticipationType.get(0);
		self.setTypeCode(element);
		return element;
	}

	public ParticipationType TypeCode() {
		return GetOrCreateTypeCode();
	}

	public void TypeCode(ParticipationType value) {
		self.setTypeCode(value);
	}

}
