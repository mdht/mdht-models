/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Assessment Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getPhysicalAssessmentOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='PhysicalAssessmentOrganizerComponent1 PhysicalAssessmentOrganizerComponent2 PhysicalAssessmentOrganizerComponent3 PhysicalAssessmentOrganizerComponent4 PhysicalAssessmentOrganizerComponent5 PhysicalAssessmentOrganizerComponent6 PhysicalAssessmentOrganizerComponent7 PhysicalAssessmentOrganizerComponent8 PhysicalAssessmentOrganizerComponent9 PhysicalAssessmentOrganizerComponent10 PhysicalAssessmentOrganizerComponent11 PhysicalAssessmentOrganizerComponent12 PhysicalAssessmentOrganizerComponent13 PhysicalAssessmentOrganizerComponent14' constraints.validation.error='PhysicalAssessmentOrganizerTemplateId' templateId.root='2.16.840.1.1133883.17.3.10.1.78'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerBodyWeightComponent constraints.validation.error='BodyWeightComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClassComponent constraints.validation.error='LengthBasedPatientBodyWeightClassComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerSkinAssessmentComponent constraints.validation.error='SkinAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerHeadAssessmentComponent constraints.validation.error='HeadAssessmentComponentObservation HeadAssessmentComponentTemplateId' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerFaceAssessmentComponent constraints.validation.error='FaceAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerNeckAssessmentComponent constraints.validation.error='NeckAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerChestAndLungsAssessmentComponent constraints.validation.error='ChestAndLungsAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerHeartAssessmentComponent constraints.validation.error='HeartAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerAbdomenAssessmentComponent constraints.validation.error='AbdomenAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerPelvicAndGenitourinaryAssessmentComponent constraints.validation.error='PelvicAndGenitourinaryAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerBackAndSpineAssessmentComponent constraints.validation.error='BackAndSpineAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerExtremitiesAssessmentComponent constraints.validation.error='ExtremitiesAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerEyeAssessmentComponent constraints.validation.info='EyeAssessmentComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPhysicalAssessmentOrganizerMentalStatusAssessmentComponent constraints.validation.info='MentalStatusAssessmentComponentObservation'"
 * @generated
 */
public interface PhysicalAssessmentOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::SkinAssessment))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent5(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent6(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent7(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent8(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent9(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent10(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent11(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent12(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent13(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerComponent14(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.78\')'"
	 * @generated
	 */
	boolean validatePhysicalAssessmentOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::SkinAssessment))->asSequence()->any(true).oclAsType(emspcr::SkinAssessment)'"
	 * @generated
	 */
	SkinAssessment getComponent3();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAssessmentOrganizer init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicalAssessmentOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicalAssessmentOrganizer
