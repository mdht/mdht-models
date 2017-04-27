/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Screening Outcome Observation Right</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingScreeningOutcomeObservationRight()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HearingScreeningOutcomeObservationRightTemplateId HearingScreeningOutcomeObservationRightClassCode HearingScreeningOutcomeObservationRightMoodCode HearingScreeningOutcomeObservationRightId HearingScreeningOutcomeObservationRightCode HearingScreeningOutcomeObservationRightCodeP HearingScreeningOutcomeObservationRightText HearingScreeningOutcomeObservationRightStatusCode HearingScreeningOutcomeObservationRightStatusCodeP HearingScreeningOutcomeObservationRightEffectiveTime HearingScreeningOutcomeObservationRightValue HearingScreeningOutcomeObservationRightMethodCode HearingScreeningOutcomeObservationRightTargetSiteCode' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.11' classCode='OBS' moodCode='EVN' constraints.validation.info='HearingScreeningOutcomeObservationRightNegationInd HearingScreeningOutcomeObservationRightMethodCodeP HearingScreeningOutcomeObservationRightTargetSiteCodeP HearingScreeningOutcomeObservationRightEntryRelationship HearingScreeningOutcomeObservationRightAuthor' code.code='73744-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Newborn Hearing screen panel of Ear - right' constraints.validation.dependOn.HearingScreeningOutcomeObservationRightCode='HearingScreeningOutcomeObservationRightCodeP' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC' constraints.validation.dependOn.HearingScreeningOutcomeObservationRightMethodCode='HearingScreeningOutcomeObservationRightMethodCodeP' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.HearingScreeningOutcomeObservationRightTargetSiteCode='HearingScreeningOutcomeObservationRightTargetSiteCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningOutcomeObservationRightEntryRelationship typeCode='RSON' constraints.validation.error='HearingScreeningOutcomeObservationRightEntryRelationshipTypeCode HearingScreeningOutcomeObservationRightEntryRelationshipTypeCodeP HearingScreeningOutcomeObservationRightEntryRelationshipAct' constraints.validation.dependOn.HearingScreeningOutcomeObservationRightEntryRelationshipTypeCode='HearingScreeningOutcomeObservationRightEntryRelationshipTypeCodeP'"
 * @generated
 */
public interface HearingScreeningOutcomeObservationRight extends Observation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.11\')'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);
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
  boolean validateHearingScreeningOutcomeObservationRightMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.negationInd.oclIsUndefined()'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightId(DiagnosticChain diagnostics, Map<Object, Object> context);
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
  boolean validateHearingScreeningOutcomeObservationRightCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'73744-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightCode(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightText(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'aborted\' or value.code = \'active\' or value.code = \'cancelled\' or value.code = \'completed\' or value.code = \'held\' or value.code = \'suspended\')'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
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
  boolean validateHearingScreeningOutcomeObservationRightEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightValue(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA10387-1\' or value.code = \'LA10388-9\' or value.code = \'LA10389-7\' or value.code = \'LA10390-5\' or value.code = \'LA10391-3\' or value.code = \'LA12406-7\')))'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'89644007\' or value.code = \'25577004\')))'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
  boolean validateHearingScreeningOutcomeObservationRightAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingScreeningOutcomeObservationRight init();
		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingScreeningOutcomeObservationRight init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingScreeningOutcomeObservationRight
