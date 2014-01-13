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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getAdditionalVitalSignsOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='AdditionalVitalSignsOrganizerStrokeScoreComponent AdditionalVitalSignsOrganizerPainScoreComponent AdditionalVitalSignsOrganizerLevelOfResponsivenessComponent AdditionalVitalSignsOrganizerBloodGlucoseComponent AdditionalVitalSignsOrganizerCarbonMonoxideComponent AdditionalVitalSignsOrganizerCarbonDioxideComponent AdditionalVitalSignsOrganizerCardiacRhythmComponent AdditionalVitalSignsOrganizerEffectiveTime AdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer' constraints.validation.error='AdditionalVitalSignsOrganizerTemplateId AdditionalVitalSignsOrganizerMoodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.30' moodCode='EVN'"
 * @generated
 */
public interface AdditionalVitalSignsOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::StrokeScore))'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerStrokeScoreComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::PainScore))'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerPainScoreComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::LevelOfResponsiveness))'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::BloodGlucose))'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::CarbonMonoxide))'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::CarbonDioxide))'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::CardiacRhythm))'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.30\')'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdditionalVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.organizer.oclIsUndefined() and component.organizer.oclIsKindOf(emspcr::GlasgowComaScoreOrganizer))'"
	 * @generated
	 */
	boolean validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::StrokeScore))->asSequence()->any(true).oclAsType(emspcr::StrokeScore)'"
	 * @generated
	 */
	StrokeScore getStrokeScoreComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PainScore))->asSequence()->any(true).oclAsType(emspcr::PainScore)'"
	 * @generated
	 */
	PainScore getPainScoreComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::LevelOfResponsiveness))->asSequence()->any(true).oclAsType(emspcr::LevelOfResponsiveness)'"
	 * @generated
	 */
	LevelOfResponsiveness getLevelOfResponsivenessComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::BloodGlucose))->asSequence()->any(true).oclAsType(emspcr::BloodGlucose)'"
	 * @generated
	 */
	BloodGlucose getBloodGlucoseComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CarbonMonoxide))->asSequence()->any(true).oclAsType(emspcr::CarbonMonoxide)'"
	 * @generated
	 */
	CarbonMonoxide getCarbonMonoxideComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CarbonDioxide))->asSequence()->any(true).oclAsType(emspcr::CarbonDioxide)'"
	 * @generated
	 */
	CarbonDioxide getCarbonDioxideComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CardiacRhythm))->asSequence()->any(true).oclAsType(emspcr::CardiacRhythm)'"
	 * @generated
	 */
	CardiacRhythm getCardiacRhythmComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::GlasgowComaScoreOrganizer)).oclAsType(emspcr::GlasgowComaScoreOrganizer)'"
	 * @generated
	 */
	EList<GlasgowComaScoreOrganizer> getGlasgowComaScoreOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalVitalSignsOrganizer init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditionalVitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdditionalVitalSignsOrganizer
