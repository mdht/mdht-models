/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autopsy Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getAutopsyPerformance()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Autopsy PerformanceTemplateId Autopsy PerformanceClassCode Autopsy PerformanceMoodCode Autopsy PerformanceCode Autopsy PerformanceCodeP Autopsy PerformanceEffectiveTime Autopsy PerformanceValue Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician Autopsy PerformanceAutopsyPerformerTypeCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRole' templateId.root='2.16.840.1.113883.10.20.26.1.2' classCode='OBS' moodCode='EVN' code.code='21986-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Autopsy Status'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformer typeCode='PRF' constraints.validation.error='Autopsy PerformanceAutopsyPerformerTypeCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRole Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician' constraints.validation.query='Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole classCode='ASSIGNED' constraints.validation.error='Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName' constraints.validation.query='Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician classCode='PSN' constraints.validation.error='Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName' determinerCode='INSTANCE'"
 * @generated
 */
public interface AutopsyPerformance extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1.2\')'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'21986-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
	 * @generated
	 */
	boolean validateAutopsyPerformanceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceAutopsyPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClass::PSN)'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminer::INSTANCE)'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceAutopsyPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutopsyPerformance init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AutopsyPerformance init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AutopsyPerformance
