/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mental Status Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMentalStatusObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultObservationTemplateId ResultObservationClassCode ResultObservationMoodCode ResultObservationId ResultObservationCode ResultObservationCodeP ResultObservationStatusCode ResultObservationStatusCodeP ResultObservationEffectiveTime ResultObservationValue ResultObservationText ResultObservationInterpretationCode ResultObservationMethodCode ResultObservationTargetSiteCode CognitiveStatusResultObservationAuthor CognitiveStatusResultObservationNonMedicinalSupplyActivity CognitiveStatusResultObservationCaregiverCharacteristics MentalStatusObservation2CDTranslation MentalStatusObservation2CDTranslationP CognitiveStatusResultObservationReferenceRangeObservationRange' templateId.root='2.16.840.1.113883.10.20.22.4.74' templateId.extension='2015-08-01' constraints.validation.warning='CognitiveStatusResultObservationValueDatatype MentalStatusObservation2AuthorParticipation' constraints.validation.info='ResultObservationTextReference ResultObservationTextReferenceValue ResultObservationReferenceValue ResultObservationCodeValue ResultObservationNoObservationRangeCode ResultObservationAuthorMultiplicity CognitiveStatusResultObservationAssessmentScaleObservation CognitiveStatusResultObservationReferenceRange CognitiveStatusResultObservationReferenceRangeObservationRangeNoCode' classCode='OBS' moodCode='EVN' constraints.validation.dependOn.ResultObservationCode='ResultObservationCodeP' constraints.validation.dependOn.ResultObservationStatusCode='ResultObservationStatusCodeP' constraints.validation.query='MentalStatusObservation2CDTranslation MentalStatusObservation2CDTranslationP CognitiveStatusResultObservationReferenceRangeObservationRangeNoCode CognitiveStatusResultObservationReferenceRangeObservationRange'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMentalStatusObservation2CD translation.code='75275-8' translation.codeSystem='2.16.840.1.113883.6.1' translation.codeSystemName='LOINC' translation.displayName='Cognitive Function' constraints.validation.error='MentalStatusObservation2CDTranslation MentalStatusObservation2CDTranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMentalStatusObservation2ReferenceRange constraints.validation.error='CognitiveStatusResultObservationReferenceRangeObservationRange'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMentalStatusObservation2ReferenceRangeObservationRange constraints.validation.info='CognitiveStatusResultObservationReferenceRangeObservationRangeNoCode'"
 * @generated
 */
public interface MentalStatusObservation2 extends CognitiveStatusResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateMentalStatusObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'75275-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')) )))'"
	 * @generated
	 */
	boolean validateMentalStatusObservation2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() =  1) )))'"
	 * @generated
	 */
	boolean validateMentalStatusObservation2CDTranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)'"
	 * @generated
	 */
	EList<AssessmentScaleObservation> getConsolAssessmentScaleObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)).oclAsType(consol::NonMedicinalSupplyActivity)'"
	 * @generated
	 */
	EList<NonMedicinalSupplyActivity> getConsolNonMedicinalSupplyActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)'"
	 * @generated
	 */
	EList<CaregiverCharacteristics> getConsolCaregiverCharacteristicss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MentalStatusObservation2
