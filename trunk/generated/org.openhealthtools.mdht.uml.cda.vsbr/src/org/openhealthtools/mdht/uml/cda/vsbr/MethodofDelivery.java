/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methodof Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getMethodofDelivery()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Method of DeliveryTemplateId Method of DeliveryClassCode Method of DeliveryMoodCode Method of DeliveryCode Method of DeliveryCodeP Method of DeliveryFinal Route and Method Method of DeliveryForcepsAssociation Method of DeliveryVacuumExtractionAssociation Method of DeliveryFetal Presentation' templateId.root='2.16.840.1.113883.10.20.26.45' classCode='PROC' moodCode='EVN' code.code='72149-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Delivery method' constraints.validation.info='Method of DeliveryHysterotomyHysterectomyAssociation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethod constraints.validation.error='Final Route and MethodTemplateId Final Route and MethodClassCode Final Route and MethodCode Final Route and MethodCodeP Final Route and MethodMoodCode Final Route and MethodValue Final Route and MethodValueP' templateId.root='null' classCode='OBS' code.code='73762-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Final route and method of delivery'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociation typeCode='COMP' constraints.validation.error='TrialOfLaborAssociationTypeCode TrialOfLaborAssociationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationTrialOfLabor classCode='OBS' constraints.validation.error='TrialOfLaborClassCode TrialOfLaborCode TrialOfLaborCodeP TrialOfLaborMoodCode TrialOfLaborValue' code.code='73760-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='If cesarean, a trial of labor was attempted' constraints.validation.dependOn.TrialOfLaborCode='TrialOfLaborCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryforcepsAssociation typeCode='COMP' constraints.validation.error='forcepsAssociationTypeCode forcepsAssociationForcepsDelivery'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryforcepsAssociationForcepsDelivery classCode='OBS' constraints.validation.error='ForcepsDeliveryClassCode ForcepsDeliveryCode ForcepsDeliveryCodeP ForcepsDeliveryMoodCode ForcepsDeliveryValue' code.code='64646001' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Failed forceps delivery' constraints.validation.dependOn.ForcepsDeliveryCode='ForcepsDeliveryCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryvacuumExtractionAssociation typeCode='COMP' constraints.validation.error='vacuumExtractionAssociationTypeCode vacuumExtractionAssociationVacuumExtraction'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryvacuumExtractionAssociationVacuumExtraction classCode='OBS' constraints.validation.error='VacuumExtractionClassCode VacuumExtractionCode VacuumExtractionCodeP VacuumExtractionMoodCode VacuumExtractionValue' code.code='14331002' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Failed vacuum extraction delivery' constraints.validation.dependOn.VacuumExtractionCode='VacuumExtractionCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociation typeCode='COMP' constraints.validation.error='hysterotomyHysterectomyAssociationTypeCode hysterotomyHysterectomyAssociationHysterotomyHysterectomy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomy classCode='OBS' constraints.validation.error='hysterotomyHysterectomyClassCode hysterotomyHysterectomyCode hysterotomyHysterectomyCodeP hysterotomyHysterectomyMoodCode hysterotomyHysterectomyValue' code.code='73759-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Hysterotomy or hysterectomy was performed at delivery' constraints.validation.dependOn.hysterotomyHysterectomyCode='hysterotomyHysterectomyCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFetalPresentation constraints.validation.error='Fetal PresentationTemplateId Fetal PresentationClassCode Fetal PresentationCode Fetal PresentationCodeP Fetal PresentationMoodCode Fetal PresentationValue Fetal PresentationValueP' templateId.root='null' classCode='OBS' code.code='73761-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Fetal presentation at birth'"
 * @generated
 */
public interface MethodofDelivery extends Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'72149-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateMethodofDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMethodofDeliveryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateMethodofDeliveryHysterotomyHysterectomyAssociation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodofDelivery init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MethodofDelivery
