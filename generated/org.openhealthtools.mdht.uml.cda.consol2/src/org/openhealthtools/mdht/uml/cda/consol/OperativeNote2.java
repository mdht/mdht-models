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
 * A representation of the model object '<em><b>Operative Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getOperativeNote2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='USRealmHeader2TemplateId OperativeNote2Code OperativeNote2CodeP OperativeNote2DocumentationOf OperativeNote2AnesthesiaSection2 OperativeNote2ComplicationsSection2 OperativeNote2PreoperativeDiagnosisSection2 OperativeNote2ProcedureEstimatedBloodLossSection OperativeNote2ProcedureFindingsSection2 OperativeNote2ProcedureSpecimensTakenSection OperativeNote2ProcedureDescriptionSection OperativeNote2PostoperativeDiagnosisSection OperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity OperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNote2DocumentationOfServiceEventProcedureCodes OperativeNote2DocumentationOfServiceEventEffectiveTime OperativeNote2DocumentationOfServiceEventCode OperativeNote2DocumentationOfServiceEventPerformer OperativeNote2DocumentationOfServiceEvent OperativeNote2AuthorizationConsentClassCode OperativeNote2AuthorizationConsentMoodCode OperativeNote2AuthorizationConsentStatusCode OperativeNote2AuthorizationTypeCode OperativeNote2AuthorizationConsent' templateId.root='2.16.840.1.113883.10.20.22.1.7' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.OperativeNote2Code='OperativeNote2CodeP' constraints.validation.info='OperativeNote2Authorization OperativeNote2ProcedureImplantsSection OperativeNote2OperativeNoteFluidSection OperativeNote2OperativeNoteSurgicalProcedureSection OperativeNote2PlanOfTreatmentSection2 OperativeNote2PlannedProcedureSection2 OperativeNote2ProcedureDispositionSection OperativeNote2ProcedureIndicationsSection2 OperativeNote2SurgicalDrainsSection OperativeNote2DocumentationOfServiceEventPerformerAssistants' constraints.validation.query='OperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity OperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNote2DocumentationOfServiceEventProcedureCodes OperativeNote2DocumentationOfServiceEventEffectiveTime OperativeNote2DocumentationOfServiceEventCode OperativeNote2DocumentationOfServiceEventPerformer OperativeNote2DocumentationOfServiceEventPerformerAssistants OperativeNote2DocumentationOfServiceEvent OperativeNote2AuthorizationConsentClassCode OperativeNote2AuthorizationConsentMoodCode OperativeNote2AuthorizationConsentStatusCode OperativeNote2AuthorizationTypeCode OperativeNote2AuthorizationConsent' constraints.validation.warning='OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP' constraints.validation.dependOn.OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode='OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode='OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOf constraints.validation.error='OperativeNote2DocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEvent constraints.validation.error='OperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNote2DocumentationOfServiceEventProcedureCodes OperativeNote2DocumentationOfServiceEventEffectiveTime OperativeNote2DocumentationOfServiceEventCode OperativeNote2DocumentationOfServiceEventPerformer ServiceEventOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerTypeCode ServiceEventOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode ServiceEventOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity' constraints.validation.info='OperativeNote2DocumentationOfServiceEventPerformerAssistants' constraints.validation.query='ServiceEventOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerTypeCode ServiceEventOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode ServiceEventOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity' constraints.validation.warning='OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP' constraints.validation.dependOn.OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode='OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode='OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventPerformer typeCode='PPRF' constraints.validation.error='OperativeNote2DocumentationOfServiceEventPerformerTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode' constraints.validation.warning='OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode='OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDT constraints.validation.error='OperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventPerformerAssistants typeCode='SPRF' constraints.validation.error='OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode' constraints.validation.warning='OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP' constraints.validation.dependOn.OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode='OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2Authorization typeCode='AUTH' constraints.validation.error='OperativeNote2AuthorizationTypeCode OperativeNote2AuthorizationConsent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2AuthorizationConsent classCode='CONS' constraints.validation.error='OperativeNote2AuthorizationConsentClassCode OperativeNote2AuthorizationConsentMoodCode OperativeNote2AuthorizationConsentStatusCode' moodCode='EVN'"
 *        annotation="duplicates"
 * @generated
 */
public interface OperativeNote2 extends USRealmHeader2 {
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
	boolean validateOperativeNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'11504-8\' or value.code = \'34137-0\' or value.code = \'28583-3\' or value.code = \'28624-5\' or value.code = \'28573-4\' or value.code = \'34877-1\' or value.code = \'34874-8\' or value.code = \'34870-6\' or value.code = \'34868-0\' or value.code = \'34818-5\'))'"
	 * @generated
	 */
	boolean validateOperativeNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;one(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))'"
	 * @generated
	 */
	boolean validateOperativeNote2Authorization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2))'"
	 * @generated
	 */
	boolean validateOperativeNote2AnesthesiaSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComplicationsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection2))'"
	 * @generated
	 */
	boolean validateOperativeNote2PreoperativeDiagnosisSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2ProcedureEstimatedBloodLossSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2))'"
	 * @generated
	 */
	boolean validateOperativeNote2ProcedureFindingsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2ProcedureSpecimensTakenSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2ProcedureDescriptionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2PostoperativeDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2ProcedureImplantsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2OperativeNoteFluidSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2OperativeNoteSurgicalProcedureSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))'"
	 * @generated
	 */
	boolean validateOperativeNote2PlanOfTreatmentSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2))'"
	 * @generated
	 */
	boolean validateOperativeNote2PlannedProcedureSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2ProcedureDispositionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2))'"
	 * @generated
	 */
	boolean validateOperativeNote2ProcedureIndicationsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))'"
	 * @generated
	 */
	boolean validateOperativeNote2SurgicalDrainsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;reject(typeCode=vocab::x_ServiceEventPerformer::PPRF)'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;reject(typeCode=vocab::x_ServiceEventPerformer::SPRF)'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(code.codeSystem = \'2.16.840.1.113883.6.104\' or code.codeSystem = \'2.16.840.1.113883.6.12\' or code.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
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
	boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(performer-&gt;select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;notEmpty())'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(performer-&gt;select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;notEmpty())'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(DiagnosticChain diagnostics,
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
	boolean validateOperativeNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null).consent-&gt;excluding(null)-&gt;reject(isDefined(\'classCode\') and classCode=vocab::ActClass::CONS)'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationConsentClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null).consent-&gt;excluding(null)-&gt;reject(isDefined(\'moodCode\') and moodCode=vocab::ActMood::EVN)'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationConsentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null).consent-&gt;excluding(null)-&gt;reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationConsentStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null)-&gt;reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipType::AUTH)'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null)-&gt;reject(consent-&gt;one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(cda::Consent)))'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationConsent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AnesthesiaSection2)'"
	 * @generated
	 */
	AnesthesiaSection2 getAnesthesiaSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ComplicationsSection2)'"
	 * @generated
	 */
	ComplicationsSection2 getComplicationsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PreoperativeDiagnosisSection2)'"
	 * @generated
	 */
	PreoperativeDiagnosisSection2 getPreoperativeDiagnosisSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureEstimatedBloodLossSection)'"
	 * @generated
	 */
	ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureFindingsSection2)'"
	 * @generated
	 */
	ProcedureFindingsSection2 getProcedureFindingsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureSpecimensTakenSection)'"
	 * @generated
	 */
	ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureDescriptionSection)'"
	 * @generated
	 */
	ProcedureDescriptionSection getProcedureDescriptionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PostoperativeDiagnosisSection)'"
	 * @generated
	 */
	PostoperativeDiagnosisSection getPostoperativeDiagnosisSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureImplantsSection)'"
	 * @generated
	 */
	ProcedureImplantsSection getProcedureImplantsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::OperativeNoteFluidSection)'"
	 * @generated
	 */
	OperativeNoteFluidSection getOperativeNoteFluidSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::OperativeNoteSurgicalProcedureSection)'"
	 * @generated
	 */
	OperativeNoteSurgicalProcedureSection getOperativeNoteSurgicalProcedureSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlanOfTreatmentSection2)'"
	 * @generated
	 */
	PlanOfTreatmentSection2 getPlanOfTreatmentSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlannedProcedureSection2)'"
	 * @generated
	 */
	PlannedProcedureSection2 getPlannedProcedureSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureDispositionSection)'"
	 * @generated
	 */
	ProcedureDispositionSection getProcedureDispositionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureIndicationsSection2)'"
	 * @generated
	 */
	ProcedureIndicationsSection2 getProcedureIndicationsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::SurgicalDrainsSection)'"
	 * @generated
	 */
	SurgicalDrainsSection getSurgicalDrainsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNote2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OperativeNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // OperativeNote2
