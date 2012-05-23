/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Clinical Laboratory Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getHumanClinicalLaboratoryTestResult()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.23.31' constraints.validation.error='Human Clinical Laboratory Test ResultTemplateId Human Clinical Laboratory Test ResultClassCode Human Clinical Laboratory Test ResultCode Human Clinical Laboratory Test ResultId Human Clinical Laboratory Test ResultMoodCode' constraints.validation.warning='Human Clinical Laboratory Test ResultValue' classCode='OBS' constraints.validation.info='Human Clinical Laboratory Test ResultStatusCode Human Clinical Laboratory Test ResultMethodCode' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociation constraints.validation.error='laboratoryTestResultCategoryAssociationTypeCode' typeCode='COMP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategory constraints.validation.error='laboratoryTestResultCategoryClassCode laboratoryTestResultCategoryCode laboratoryTestResultCategoryMoodCode laboratoryTestResultCategoryValue' classCode='OBS' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociation constraints.validation.error='laboratoryTestResultSubCategoryAssociationTypeCode' typeCode='COMP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategory constraints.validation.error='laboratoryTestResultSubCategoryClassCode laboratoryTestResultSubCategoryCode laboratoryTestResultSubCategoryMoodCode laboratoryTestResultSubCategoryValue' classCode='OBS' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultreferenceRangeAssociation constraints.validation.error='referenceRangeAssociationTypeCode' typeCode='REFV'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRange interpretationCode.codeSystemName='ObservationInterpretation' code.codeSystem='2.16.840.1.113883.3.26.1.1' constraints.validation.error='referenceRangeClassCode referenceRangeCode referenceRangeCodeP referenceRangeInterpretationCode referenceRangeMoodCode referenceRangeValue' code.codeSystemName='NCI Thesaurus' classCode='OBS' interpretationCode.codeSystem='2.16.840.1.113883.5.83' moodCode='EVN.CRT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultfastingAssociation constraints.validation.error='fastingAssociationTypeCode' typeCode='COMP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultfastingAssociationfastingStatus constraints.validation.dependOn.fastingStatusCode='fastingStatusCodeP' code.codeSystem='2.16.840.1.113883.3.26.1.1' constraints.validation.error='fastingStatusClassCode fastingStatusCode fastingStatusCodeP fastingStatusMoodCode fastingStatusValue' code.codeSystemName='NCI Thesaurus' classCode='OBS' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlabToxicityAssociation constraints.validation.error='labToxicityAssociationTypeCode' typeCode='COMP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalLaboratoryTestResultlabToxicityAssociationlabToxicityGrade value.codeSystemName='NCI Thesaurus' code.codeSystem='2.16.840.1.113883.3.26.1.1' constraints.validation.error='labToxicityGradeClassCode labToxicityGradeCode labToxicityGradeCodeP labToxicityGradeMoodCode labToxicityGradeValue labToxicityGradeValueP' code.codeSystemName='NCI Thesaurus' classCode='OBS' code.code='TBD' moodCode='EVN' value.codeSystem='2.16.840.1.113883.3.26.1.1' constraints.validation.dependOn.labToxicityGradeCode='labToxicityGradeCodeP'"
 * @generated
 */
public interface HumanClinicalLaboratoryTestResult extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.31')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.31\')'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())'"
   * @generated
   */
  boolean validateHumanClinicalLaboratoryTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalLaboratoryTestResult init();
} // HumanClinicalLaboratoryTestResult
