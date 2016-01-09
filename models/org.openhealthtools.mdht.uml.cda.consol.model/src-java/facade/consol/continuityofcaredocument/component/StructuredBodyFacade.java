package facade.consol.continuityofcaredocument.component;

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

public class StructuredBodyFacade extends facade.FacadeBase {

	public StructuredBody self;

	public StructuredBodyFacade()
	{
		this.self = CDAFactory.eINSTANCE.createStructuredBody();
	}

	public StructuredBodyFacade(StructuredBody self)
	{
		this.self = self;
	}

	public static boolean isKindOf(StructuredBody self)
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
		GetOrCreateAllergiesSection();
		GetOrCreateMedicationsSection();
		GetOrCreateProblemSection();
		GetOrCreateProceduresSection();
		GetOrCreateResultsSection();
		GetOrCreateAdvanceDirectivesSection();
		GetOrCreateEncountersSection();
		GetOrCreateFamilyHistorySection();
		GetOrCreateFunctionalStatusSection();
		GetOrCreateImmunizationsSectionEntriesOptional();
		GetOrCreateMedicalEquipmentSection();
		GetOrCreatePayersSection();
		GetOrCreatePlanOfCareSection();
		GetOrCreateSocialHistorySection();
		GetOrCreateVitalSignsSectionEntriesOptional();
		GetOrCreateComponent();
	}

	/**
	 *UML path: /ContinuityOfCareDocument/component/structuredBody
	 *UML root path: /ContinuityOfCareDocument/component/structuredBody
	*/
	public void Validate(DiagnosticChain vb, DataElementLevel del)
	{
			ValidateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyProblemSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyProceduresSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyResultsSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyEncountersSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyPayersSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection(vb, del);
			ValidateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional(vb, del);

			allergiesSection().forEach(x -> x.Validate(vb, del));
			medicationsSection().forEach(x -> x.Validate(vb, del));
			problemSection().forEach(x -> x.Validate(vb, del));
			proceduresSection().forEach(x -> x.Validate(vb, del));
			resultsSection().forEach(x -> x.Validate(vb, del));
			advanceDirectivesSection().forEach(x -> x.Validate(vb, del));
			encountersSection().forEach(x -> x.Validate(vb, del));
			familyHistorySection().forEach(x -> x.Validate(vb, del));
			functionalStatusSection().forEach(x -> x.Validate(vb, del));
			immunizationsSectionEntriesOptional().forEach(x -> x.Validate(vb, del));
			medicalEquipmentSection().forEach(x -> x.Validate(vb, del));
			payersSection().forEach(x -> x.Validate(vb, del));
			planOfCareSection().forEach(x -> x.Validate(vb, del));
			socialHistorySection().forEach(x -> x.Validate(vb, del));
			vitalSignsSectionEntriesOptional().forEach(x -> x.Validate(vb, del));
			realmCode().forEach(x -> x.Validate(vb, del));
			typeId().forEach(x -> x.Validate(vb, del));
			templateId().forEach(x -> x.Validate(vb, del));
			confidentialityCode().forEach(x -> x.Validate(vb, del));
			languageCode().forEach(x -> x.Validate(vb, del));
			component().forEach(x -> x.Validate(vb, del));
	}
	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyAllergiesSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3435 -> !(Set(i3435).count()==0) && Flatten(Set(One(Set(i3435)).getSection()).map(i3437 -> Set(i3437.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.a allergiesSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyMedicationsSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3452 -> !(Set(i3452).count()==0) && Flatten(Set(One(Set(i3452)).getSection()).map(i3454 -> Set(i3454.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.b medicationsSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyProblemSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyProblemSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3469 -> !(Set(i3469).count()==0) && Flatten(Set(One(Set(i3469)).getSection()).map(i3471 -> Set(i3471.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.c problemSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyProceduresSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyProceduresSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3486 -> !(Set(i3486).count()==0) && Flatten(Set(One(Set(i3486)).getSection()).map(i3488 -> Set(i3488.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.d proceduresSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyResultsSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyResultsSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3503 -> !(Set(i3503).count()==0) && Flatten(Set(One(Set(i3503)).getSection()).map(i3505 -> Set(i3505.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.e resultsSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3520 -> !(Set(i3520).count()==0) && Flatten(Set(One(Set(i3520)).getSection()).map(i3522 -> Set(i3522.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.f advanceDirectivesSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyEncountersSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyEncountersSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3536 -> !(Set(i3536).count()==0) && Flatten(Set(One(Set(i3536)).getSection()).map(i3538 -> Set(i3538.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.g encountersSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3552 -> !(Set(i3552).count()==0) && Flatten(Set(One(Set(i3552)).getSection()).map(i3554 -> Set(i3554.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.h familyHistorySection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3568 -> !(Set(i3568).count()==0) && Flatten(Set(One(Set(i3568)).getSection()).map(i3570 -> Set(i3570.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.i functionalStatusSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3584 -> !(Set(i3584).count()==0) && Flatten(Set(One(Set(i3584)).getSection()).map(i3586 -> Set(i3586.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.j immunizationsSectionEntriesOptional\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3600 -> !(Set(i3600).count()==0) && Flatten(Set(One(Set(i3600)).getSection()).map(i3602 -> Set(i3602.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.k medicalEquipmentSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyPayersSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyPayersSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3616 -> !(Set(i3616).count()==0) && Flatten(Set(One(Set(i3616)).getSection()).map(i3618 -> Set(i3618.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.l payersSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3632 -> !(Set(i3632).count()==0) && Flatten(Set(One(Set(i3632)).getSection()).map(i3634 -> Set(i3634.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.m planOfCareSection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodySocialHistorySection
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3648 -> !(Set(i3648).count()==0) && Flatten(Set(One(Set(i3648)).getSection()).map(i3650 -> Set(i3650.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.n socialHistorySection\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	/**
	 * OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::ContinuityOfCareDocument::Component::StructuredBody::Component))
	 * Context: /ContinuityOfCareDocument/component/structuredBody
	 * Context Class: consol::ContinuityOfCareDocument::Component::StructuredBody
	 * Constraint Name: consol::ContinuityOfCareDocument::Component::StructuredBody::ContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional
	 */
	public boolean ValidateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional(DiagnosticChain vb, DataElementLevel del)
	{
		if (del != null && del != DataElementLevel.DEL_CDA_BODY_LEVEL_2)
		{
			return true;
		}
		boolean result = Set(self.getComponents()).filter(i3664 -> !(Set(i3664).count()==0) && Flatten(Set(One(Set(i3664)).getSection()).map(i3666 -> Set(i3666.getTemplateIds()))).anyMatch(id -> Set(id.getRoot()).collect(Collectors.toList()).contains("2.16.840.1.113883.10.20.22.2.6.1"))).count()==1;
		if (!result && vb != null)
		{
			vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, "Error: ContinuityOfCareDocument - 2.2.7.i.o vitalSignsSectionEntriesOptional\n\t\tConformance: SHALL contain exactly one [1..1] component\n\t\tAnalysis: n/a\n\t\tValidation message: n/a", new Object [] { self }));
		}
		return result;
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> allergiesSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateAllergiesSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = allergiesSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherAllergiesSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherAllergiesSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade AllergiesSection() {
		return GetOrCreateAllergiesSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> medicationsSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateMedicationsSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = medicationsSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherMedicationsSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherMedicationsSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade MedicationsSection() {
		return GetOrCreateMedicationsSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> problemSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateProblemSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = problemSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherProblemSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherProblemSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade ProblemSection() {
		return GetOrCreateProblemSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> proceduresSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateProceduresSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = proceduresSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherProceduresSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherProceduresSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade ProceduresSection() {
		return GetOrCreateProceduresSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> resultsSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateResultsSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = resultsSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherResultsSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherResultsSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade ResultsSection() {
		return GetOrCreateResultsSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> advanceDirectivesSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateAdvanceDirectivesSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = advanceDirectivesSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherAdvanceDirectivesSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherAdvanceDirectivesSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade AdvanceDirectivesSection() {
		return GetOrCreateAdvanceDirectivesSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> encountersSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateEncountersSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = encountersSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherEncountersSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherEncountersSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade EncountersSection() {
		return GetOrCreateEncountersSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> familyHistorySection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateFamilyHistorySection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = familyHistorySection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherFamilyHistorySection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherFamilyHistorySection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade FamilyHistorySection() {
		return GetOrCreateFamilyHistorySection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> functionalStatusSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateFunctionalStatusSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = functionalStatusSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherFunctionalStatusSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherFunctionalStatusSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade FunctionalStatusSection() {
		return GetOrCreateFunctionalStatusSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> immunizationsSectionEntriesOptional()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateImmunizationsSectionEntriesOptional()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = immunizationsSectionEntriesOptional().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherImmunizationsSectionEntriesOptional();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherImmunizationsSectionEntriesOptional()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade ImmunizationsSectionEntriesOptional() {
		return GetOrCreateImmunizationsSectionEntriesOptional();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> medicalEquipmentSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateMedicalEquipmentSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = medicalEquipmentSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherMedicalEquipmentSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherMedicalEquipmentSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade MedicalEquipmentSection() {
		return GetOrCreateMedicalEquipmentSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> payersSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreatePayersSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = payersSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherPayersSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherPayersSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade PayersSection() {
		return GetOrCreatePayersSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> planOfCareSection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreatePlanOfCareSection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = planOfCareSection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherPlanOfCareSection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherPlanOfCareSection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade PlanOfCareSection() {
		return GetOrCreatePlanOfCareSection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> socialHistorySection()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateSocialHistorySection()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = socialHistorySection().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherSocialHistorySection();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherSocialHistorySection()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade SocialHistorySection() {
		return GetOrCreateSocialHistorySection();
	}

	public Stream<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> vitalSignsSectionEntriesOptional()
	{
		return Set(self.getComponents()).filter( x -> facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade.isKindOf(x)).map( x -> new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(x));
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade GetOrCreateVitalSignsSectionEntriesOptional()
	{
		Optional<facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade> lastOrDefault = vitalSignsSectionEntriesOptional().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherVitalSignsSectionEntriesOptional();
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade CreateAnotherVitalSignsSectionEntriesOptional()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade elementFacade = new facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.consol.continuityofcaredocument.component.structuredbody.ComponentFacade VitalSignsSectionEntriesOptional() {
		return GetOrCreateVitalSignsSectionEntriesOptional();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_RealmCode());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_TypeId());
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_TemplateId());
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

	public Stream<facade.datatypes.CEFacade> confidentialityCode()
	{
		return Set(self.getConfidentialityCode()).filter( x -> x instanceof CE).map( x -> (CE) x).map( x -> new facade.datatypes.CEFacade(x));
	}

	public facade.datatypes.CEFacade GetOrCreateConfidentialityCode()
	{
		Optional<facade.datatypes.CEFacade> lastOrDefault = confidentialityCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_ConfidentialityCode());
			return lastOrDefault.get();
		}
		return CreateAnotherConfidentialityCode();
	}

	public facade.datatypes.CEFacade CreateAnotherConfidentialityCode()
	{
		CE element = DatatypesFactory.eINSTANCE.createCE();
		facade.datatypes.CEFacade elementFacade = new facade.datatypes.CEFacade(element);
		elementFacade.Init();
		self.setConfidentialityCode(element);
		return elementFacade;
	}

	public facade.datatypes.CEFacade ConfidentialityCode() {
		return GetOrCreateConfidentialityCode();
	}

	public Stream<facade.datatypes.CSFacade> languageCode()
	{
		return Set(self.getLanguageCode()).filter( x -> x instanceof CS).map( x -> (CS) x).map( x -> new facade.datatypes.CSFacade(x));
	}

	public facade.datatypes.CSFacade GetOrCreateLanguageCode()
	{
		Optional<facade.datatypes.CSFacade> lastOrDefault = languageCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_LanguageCode());
			return lastOrDefault.get();
		}
		return CreateAnotherLanguageCode();
	}

	public facade.datatypes.CSFacade CreateAnotherLanguageCode()
	{
		CS element = DatatypesFactory.eINSTANCE.createCS();
		facade.datatypes.CSFacade elementFacade = new facade.datatypes.CSFacade(element);
		elementFacade.Init();
		self.setLanguageCode(element);
		return elementFacade;
	}

	public facade.datatypes.CSFacade LanguageCode() {
		return GetOrCreateLanguageCode();
	}

	public Stream<facade.cda.Component3Facade> component()
	{
		return Set(self.getComponents()).filter( x -> facade.cda.Component3Facade.isKindOf(x)).map( x -> new facade.cda.Component3Facade(x));
	}

	public facade.cda.Component3Facade GetOrCreateComponent()
	{
		Optional<facade.cda.Component3Facade> lastOrDefault = component().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_Component());
			return lastOrDefault.get();
		}
		return CreateAnotherComponent();
	}

	public facade.cda.Component3Facade CreateAnotherComponent()
	{
		Component3 element = CDAFactory.eINSTANCE.createComponent3();
		facade.cda.Component3Facade elementFacade = new facade.cda.Component3Facade(element);
		elementFacade.Init();
		self.getComponents().add(element);
		return elementFacade;
	}

	public facade.cda.Component3Facade Component() {
		return GetOrCreateComponent();
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
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_NullFlavor());
			return lastOrDefault.get();
		}
		return CreateAnotherNullFlavor();
	}

	public NullFlavor CreateAnotherNullFlavor()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_NullFlavor());
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

	public Stream<ActClass> classCode()
	{
		return Set(self.getClassCode());
	}

	public ActClass GetOrCreateClassCode()
	{
		Optional<ActClass> lastOrDefault = classCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_ClassCode());
			return lastOrDefault.get();
		}
		return CreateAnotherClassCode();
	}

	public ActClass CreateAnotherClassCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_ClassCode());
		ActClass element = ActClass.get(0);
		self.setClassCode(element);
		return element;
	}

	public ActClass ClassCode() {
		return GetOrCreateClassCode();
	}

	public void ClassCode(ActClass value) {
		self.setClassCode(value);
	}

	public Stream<ActMood> moodCode()
	{
		return Set(self.getMoodCode());
	}

	public ActMood GetOrCreateMoodCode()
	{
		Optional<ActMood> lastOrDefault = moodCode().reduce((a, b) -> b);
		if (lastOrDefault.isPresent())
		{
			MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_MoodCode());
			return lastOrDefault.get();
		}
		return CreateAnotherMoodCode();
	}

	public ActMood CreateAnotherMoodCode()
	{
		MarkSpecified(self, org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE.getStructuredBody_MoodCode());
		ActMood element = ActMood.get(0);
		self.setMoodCode(element);
		return element;
	}

	public ActMood MoodCode() {
		return GetOrCreateMoodCode();
	}

	public void MoodCode(ActMood value) {
		self.setMoodCode(value);
	}

}
