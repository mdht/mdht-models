/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProgressNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections ProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent GeneralHeaderConstraintsCode GeneralHeaderConstraintsCodeP ProgressNoteComponentOf ProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh ProgressNoteDocumentationOfServiceEvent2PreciseToTheDay ProgressNoteDocumentationOfServiceEvent2TemplateId ProgressNoteDocumentationOfServiceEvent2ClassCode ProgressNoteDocumentationOfServiceEvent2 ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility ProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay ProgressNoteComponentOfEncompassingEncounter6EffectiveTime ProgressNoteComponentOfEncompassingEncounter6Id ProgressNoteComponentOfEncompassingEncounter6Location ProgressNoteComponentOfEncompassingEncounter6' templateId.root='2.16.840.1.113883.10.20.22.1.9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.GeneralHeaderConstraintsCode='GeneralHeaderConstraintsCodeP' constraints.validation.warning='ProgressNoteDocumentationOf ProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow ProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute ProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset ProgressNoteDocumentationOfServiceEvent2EffectiveTime ProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute ProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.info='ProgressNoteAssessmentSection ProgressNotePlanOfCareSection ProgressNoteAssessmentAndPlanSection ProgressNoteAllergiesSectionEntriesOptional ProgressNoteChiefComplaintSection ProgressNoteInterventionsSection ProgressNoteMedicationsSectionEntriesOptional ProgressNoteObjectiveSection ProgressNotePhysicalExamSection ProgressNoteProblemSectionEntriesOptional ProgressNoteResultsSectionEntriesOptional ProgressNoteReviewOfSystemsSection ProgressNoteSubjectiveSection ProgressNoteVitalSignsSectionEntriesOptional ProgressNoteInstructionsSection ProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond ProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond' constraints.validation.query='ProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow ProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh ProgressNoteDocumentationOfServiceEvent2PreciseToTheDay ProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute ProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond ProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset ProgressNoteDocumentationOfServiceEvent2TemplateId ProgressNoteDocumentationOfServiceEvent2ClassCode ProgressNoteDocumentationOfServiceEvent2EffectiveTime ProgressNoteDocumentationOfServiceEvent2 ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility ProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay ProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute ProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond ProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset ProgressNoteComponentOfEncompassingEncounter6EffectiveTime ProgressNoteComponentOfEncompassingEncounter6Id ProgressNoteComponentOfEncompassingEncounter6Location ProgressNoteComponentOfEncompassingEncounter6'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteDocumentationOf constraints.validation.error='ProgressNoteDocumentationOfServiceEvent2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteDocumentationOfServiceEvent2 constraints.validation.error='ProgressNoteDocumentationOfServiceEvent2TemplateId ProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh ProgressNoteDocumentationOfServiceEvent2PreciseToTheDay ProgressNoteDocumentationOfServiceEvent2ClassCode' templateId.root='2.16.840.1.113883.10.20.21.3.1' constraints.validation.warning='ProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow ProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute ProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset ProgressNoteDocumentationOfServiceEvent2EffectiveTime' constraints.validation.info='ProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond' classCode='PCPR'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentOf constraints.validation.error='ProgressNoteComponentOfEncompassingEncounter6'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentOfEncompassingEncounter6 constraints.validation.error='ProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay ProgressNoteComponentOfEncompassingEncounter6EffectiveTime ProgressNoteComponentOfEncompassingEncounter6Id ProgressNoteComponentOfEncompassingEncounter6Location' constraints.validation.warning='ProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute ProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.info='ProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentOfEncompassingEncounter6Location constraints.validation.error='ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1 constraints.validation.error='ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id'"
 *        annotation="duplicates"
 * @generated
 */
public interface ProgressNote extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))'"
	 * @generated
	 */
	boolean validateProgressNoteAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))'"
	 * @generated
	 */
	boolean validateProgressNotePlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateProgressNoteAssessmentAndPlanSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateProgressNoteAllergiesSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))'"
	 * @generated
	 */
	boolean validateProgressNoteChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))'"
	 * @generated
	 */
	boolean validateProgressNoteInterventionsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateProgressNoteMedicationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))'"
	 * @generated
	 */
	boolean validateProgressNoteObjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))'"
	 * @generated
	 */
	boolean validateProgressNotePhysicalExamSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateProgressNoteProblemSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateProgressNoteResultsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))'"
	 * @generated
	 */
	boolean validateProgressNoteReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))'"
	 * @generated
	 */
	boolean validateProgressNoteSubjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateProgressNoteVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))'"
	 * @generated
	 */
	boolean validateProgressNoteInstructionsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(effectiveTime-&gt;forAll(not low.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(effectiveTime-&gt;forAll(width.oclIsUndefined() implies not high.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() &gt;= 8) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() &gt;= 8))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() &gt;= 12) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() &gt;= 12))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() &gt;= 14) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() &gt;= 14))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((not effectiveTime.low.value.oclIsUndefined() and effectiveTime.low.value.size() &gt; 8 implies effectiveTime.low.value.size() &gt;= 15) and (not effectiveTime.high.value.oclIsUndefined() and effectiveTime.high.value.size() &gt; 8 implies effectiveTime.high.value.size() &gt;= 15))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.21.3.1\'))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(isDefined(\'classCode\') and classCode=vocab::ActClassRoot::PCPR)'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null)-&gt;reject(serviceEvent-&gt;one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).location-&gt;excluding(null).healthCareFacility-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (id-&gt;size() =  1))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).location-&gt;excluding(null)-&gt;reject(healthCareFacility-&gt;one(healthCareFacility : cda::HealthCareFacility | not healthCareFacility.oclIsUndefined() and healthCareFacility.oclIsKindOf(cda::HealthCareFacility)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() &gt;= 8)'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() &gt;= 12)'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() &gt;= 14)'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(not effectiveTime.value.oclIsUndefined() and effectiveTime.value.size() &gt; 8 implies effectiveTime.value.size() &gt;= 15)'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6Id(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(location-&gt;one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6Location(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null)-&gt;reject(encompassingEncounter-&gt;one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AssessmentSection)'"
	 * @generated
	 */
	AssessmentSection getAssessmentSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlanOfCareSection)'"
	 * @generated
	 */
	PlanOfCareSection getPlanOfCareSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AssessmentAndPlanSection)'"
	 * @generated
	 */
	AssessmentAndPlanSection getAssessmentAndPlanSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AllergiesSectionEntriesOptional)'"
	 * @generated
	 */
	AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ChiefComplaintSection)'"
	 * @generated
	 */
	ChiefComplaintSection getChiefComplaintSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::InterventionsSection)'"
	 * @generated
	 */
	InterventionsSection getInterventionsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationsSectionEntriesOptional)'"
	 * @generated
	 */
	MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ObjectiveSection)'"
	 * @generated
	 */
	ObjectiveSection getObjectiveSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PhysicalExamSection)'"
	 * @generated
	 */
	PhysicalExamSection getPhysicalExamSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProblemSectionEntriesOptional)'"
	 * @generated
	 */
	ProblemSectionEntriesOptional getProblemSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ResultsSectionEntriesOptional)'"
	 * @generated
	 */
	ResultsSectionEntriesOptional getResultsSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ReviewOfSystemsSection)'"
	 * @generated
	 */
	ReviewOfSystemsSection getReviewOfSystemsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::SubjectiveSection)'"
	 * @generated
	 */
	SubjectiveSection getSubjectiveSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))-&gt;asSequence()-&gt;any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)'"
	 * @generated
	 */
	VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::InstructionsSection)'"
	 * @generated
	 */
	InstructionsSection getInstructionsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProgressNote
