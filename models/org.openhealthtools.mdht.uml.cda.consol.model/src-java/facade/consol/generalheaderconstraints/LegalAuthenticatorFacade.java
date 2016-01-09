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

public class LegalAuthenticatorFacade extends facade.FacadeBase {

	public LegalAuthenticator self;

	public static String CODE = "S";

	public static String CODESYSTEM = "2.16.840.1.113883.5.89";

	public LegalAuthenticatorFacade()
	{
		this.self = CDAFactory.eINSTANCE.createLegalAuthenticator();
	}

	public LegalAuthenticatorFacade(LegalAuthenticator self)
	{
		this.self = self;
	}

	public static boolean isKindOf(LegalAuthenticator self)
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
	 *UML path: /GeneralHeaderConstraints/legalAuthenticator
	 *UML root path: /GeneralHeaderConstraints/legalAuthenticator
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateGeneralHeaderConstraintsLegalAuthenticatorTime(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(vb, del);
			ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(vb, del);

			time().forEach(x -> x.Validate(vb, del));
			signatureCode().forEach(x -> x.Validate(vb, del));
			assignedEntity().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: not self.time.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/legalAuthenticator
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::GeneralHeaderConstraintsLegalAuthenticatorTime
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorTime(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getTime()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.i time\n\t\tConformance: SHALL contain exactly one [1..1] time (CONF:5580)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.signatureCode.oclIsUndefined()
	 * Context: /GeneralHeaderConstraints/legalAuthenticator
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getSignatureCode()).count()==0);
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.ii signatureCode\n\t\tConformance: SHALL contain exactly one [1..1] signatureCode/@code=\"S\"  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5583, CONF:5584)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and  let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in  value.code = 'S'
	 * Context: /GeneralHeaderConstraints/legalAuthenticator
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::GeneralHeaderConstraintsLegalAuthenticatorSignatureCode
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = !(Set(self.getSignatureCode()).count()==0) && true && Set(self.getSignatureCode()).filter(i2303 -> Set(i2303.getCode()).collect(Collectors.toList()).contains("S")).count()!=0;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.ii signatureCode\n\t\tConformance: SHALL contain exactly one [1..1] signatureCode/@code=\"S\"  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5583, CONF:5584)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity))
	 * Context: /GeneralHeaderConstraints/legalAuthenticator
	 * Context Class: consol::GeneralHeaderConstraints::LegalAuthenticator
	 * Constraint Name: consol::GeneralHeaderConstraints::LegalAuthenticator::GeneralHeaderConstraintsLegalAuthenticatorAssignedEntity
	 */
	public boolean ValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_HEADER)
		{
			return true;
		}
		boolean result = Set(self.getAssignedEntity()).filter(i2313 -> !(Set(i2313).count()==0) && true).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: USRealmHeader - 2.5.18.iii assignedEntity\n\t\tConformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5585)\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_Time());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_SignatureCode());
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

	public Stream<facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade> assignedEntity()
	{
		return Set(self.getAssignedEntity()).filter( x -> facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade.isKindOf(x)).map( x -> new facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade(x));
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade GetOrCreateAssignedEntity()
	{
		Optional<facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade> lastOrDefault = assignedEntity().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_AssignedEntity());
			return lastOrDefault.get();
		}
		return CreateAnotherAssignedEntity();
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade CreateAnotherAssignedEntity()
	{
		AssignedEntity element = CDAFactory.eINSTANCE.createAssignedEntity();
		facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade elementFacade = new facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade(element);
		elementFacade.Init();
		self.setAssignedEntity(element);
		return elementFacade;
	}

	public facade.consol.generalheaderconstraints.legalauthenticator.AssignedEntityFacade AssignedEntity() {
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_TemplateId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_NullFlavor());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_TypeCode());
			return lastOrDefault.get();
		}
		return CreateAnotherTypeCode();
	}

	public ParticipationType CreateAnotherTypeCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_TypeCode());
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

	public Stream<ContextControl> contextControlCode()
	{
		return Set(self.getContextControlCode());
	}

	public ContextControl GetOrCreateContextControlCode()
	{
		Optional<ContextControl> lastOrDefault = contextControlCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_ContextControlCode());
			return lastOrDefault.get();
		}
		return CreateAnotherContextControlCode();
	}

	public ContextControl CreateAnotherContextControlCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getLegalAuthenticator_ContextControlCode());
		ContextControl element = ContextControl.get(0);
		self.setContextControlCode(element);
		return element;
	}

	public ContextControl ContextControlCode() {
		return GetOrCreateContextControlCode();
	}

	public void ContextControlCode(ContextControl value) {
		self.setContextControlCode(value);
	}

}
