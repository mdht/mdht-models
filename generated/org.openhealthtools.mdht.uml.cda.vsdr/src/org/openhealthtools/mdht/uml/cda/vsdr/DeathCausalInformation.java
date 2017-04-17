/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Death Causal Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getDeathCausalInformation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal Information'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Death Causal InformationTemplateId Death Causal InformationClassCode Death Causal InformationMoodCode Death Causal InformationCode Death Causal InformationStatusCode Death Causal InformationStatusCodeP Death Causal InformationComponentCause Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue Death Causal InformationComponentCauseSequenceNumber Death Causal InformationComponentCauseTypeCode Death Causal InformationComponentCauseDeathCause Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue Death Causal InformationComponentOtherSignificantConditionTypeCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantCondition' templateId.root='2.16.840.1.113883.10.20.26.1.6' classCode='CLUSTER' moodCode='EVN' code.code='69453-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cause Of Death (US Standard Certificate of Death)' statusCode.code='Active'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantCondition typeCode='COMP' constraints.validation.error='Death Causal InformationComponentOtherSignificantConditionTypeCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantCondition Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue' constraints.validation.query='Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition classCode='OBS' constraints.validation.error='Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue' moodCode='EVN' code.code='69441-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Other Significant Condition'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCause constraints.validation.error='Death Causal InformationComponentCauseSequenceNumber Death Causal InformationComponentCauseTypeCode Death Causal InformationComponentCauseDeathCause Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue' typeCode='COMP' constraints.validation.query='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCause classCode='OBS' constraints.validation.error='Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval' code.code='21984-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cause of Death'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseInterval typeCode='COMP' constraints.validation.error='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue' constraints.validation.query='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval classCode='OBS' constraints.validation.error='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue' code.code='69440-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Disease onset to death interval'"
 * @generated
 */
public interface DeathCausalInformation extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1.6\')'"
	 * @generated
	 */
	boolean validateDeathCausalInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validateDeathCausalInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateDeathCausalInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'69453-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
	 * @generated
	 */
	boolean validateDeathCausalInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationStatusCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDeathCausalInformationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationStatusCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'Active\')'"
	 * @generated
	 */
	boolean validateDeathCausalInformationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCause'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='1..4->includes(self.component->select(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))->size())'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCause(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentOtherSignificantCondition'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentOtherSignificantCondition(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(not code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'69440-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(value->forAll(element | element.oclIsTypeOf(datatypes::ED)))'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'21984-0\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCauseValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCauseValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseSequenceNumber'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(not sequenceNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseSequenceNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentCauseDeathCause'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentCauseDeathCause(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'69441-4\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentOtherSignificantConditionTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Death Causal InformationComponentOtherSignificantConditionOtherSignificantCondition'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeathCausalInformation init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeathCausalInformation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DeathCausalInformation
