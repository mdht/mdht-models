/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methodof Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getMethodofDelivery()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Method of DeliveryTemplateId Method of DeliveryClassCode Method of DeliveryCode Method of DeliveryCodeP Method of DeliveryMoodCode Method of DeliveryFinal Route and Method Method of DeliveryForcepsAssociation Method of DeliveryVacuumExtractionAssociation Method of DeliveryFetal Presentation' templateId.root='2.16.840.1.113883.10.20.26.45' classCode='PROC' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' moodCode='EVN' constraints.validation.info='Method of DeliveryHysterotomyHysterectomyAssociation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethod constraints.validation.error='Final Route and MethodTemplateId Final Route and MethodClassCode Final Route and MethodCode Final Route and MethodMoodCode Final Route and MethodValue' templateId.root='null' classCode='OBS' moodCode='EVN' constraints.validation.info='Final Route and MethodEntryRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociation typeCode='COMP' constraints.validation.error='TrialOfLaborAssociationTypeCode TrialOfLaborAssociationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationTrialOfLabor classCode='OBS' constraints.validation.error='TrialOfLaborClassCode TrialOfLaborCode TrialOfLaborMoodCode TrialOfLaborValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryforcepsAssociation typeCode='COMP' constraints.validation.error='forcepsAssociationTypeCode forcepsAssociationForcepsDelivery'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryforcepsAssociationForcepsDelivery classCode='OBS' constraints.validation.error='ForcepsDeliveryClassCode ForcepsDeliveryCode ForcepsDeliveryMoodCode ForcepsDeliveryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryvacuumExtractionAssociation typeCode='COMP' constraints.validation.error='vacuumExtractionAssociationTypeCode vacuumExtractionAssociationVacuumExtraction'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryvacuumExtractionAssociationVacuumExtraction classCode='OBS' constraints.validation.error='VacuumExtractionClassCode VacuumExtractionCode VacuumExtractionCodeP VacuumExtractionMoodCode VacuumExtractionValue' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.VacuumExtractionCode='VacuumExtractionCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociation typeCode='COMP' constraints.validation.error='hysterotomyHysterectomyAssociationTypeCode hysterotomyHysterectomyAssociationHysterotomyHysterectomy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomy classCode='OBS' constraints.validation.error='hysterotomyHysterectomyClassCode hysterotomyHysterectomyCode hysterotomyHysterectomyMoodCode hysterotomyHysterectomyValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFetalPresentation constraints.validation.error='Fetal PresentationTemplateId Fetal PresentationClassCode Fetal PresentationCode Fetal PresentationMoodCode Fetal PresentationValue' templateId.root='null' classCode='OBS' moodCode='EVN'"
 * @generated
 */
public interface MethodofDelivery extends Procedure
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.45')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.45\')'"
   * @generated
   */
  boolean validateMethodofDeliveryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClass::PROC
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClass::PROC'"
   * @generated
   */
  boolean validateMethodofDeliveryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateMethodofDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateMethodofDeliveryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_DocumentProcedureMood::EVN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentProcedureMood::EVN'"
   * @generated
   */
  boolean validateMethodofDeliveryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateMethodofDeliveryFinalRouteandMethod(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateMethodofDeliveryForcepsAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateMethodofDeliveryVacuumExtractionAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateMethodofDeliveryHysterotomyHysterectomyAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation))'"
   * @generated
   */
  boolean validateMethodofDeliveryFetalPresentation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodofDelivery init();
} // MethodofDelivery
