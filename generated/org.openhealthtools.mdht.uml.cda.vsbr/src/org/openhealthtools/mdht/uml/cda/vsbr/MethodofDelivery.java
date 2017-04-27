/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methodof Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getMethodofDelivery()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of Delivery'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Method of DeliveryTemplateId Method of DeliveryClassCode Method of DeliveryMoodCode Method of DeliveryCode Method of DeliveryCodeP Method of DeliveryFinalRouteAndMethod Method of DeliveryFetalPresentation Method of DeliveryHysterotomyHysterectomyAssociation' templateId.root='2.16.840.1.113883.10.20.26.45' classCode='PROC' moodCode='EVN' code.code='72149-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Delivery method'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethod constraints.validation.error='Method of DeliveryFinal Route and MethodTemplateId Method of DeliveryFinal Route and MethodClassCode Method of DeliveryFinal Route and MethodMoodCode Method of DeliveryFinal Route and MethodCode Method of DeliveryFinal Route and MethodCodeP Method of DeliveryFinal Route and MethodValue Method of DeliveryFinal Route and MethodValueP Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborClassCode Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborMoodCode Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborCodeP Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborCode Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborValue Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTypeCode Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLabor' templateId.root='null' classCode='OBS' moodCode='EVN' code.code='73762-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Final route and method of delivery'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociation typeCode='COMP' constraints.validation.error='Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTypeCode Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLabor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationTrialOfLabor classCode='OBS' constraints.validation.error='Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborClassCode Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborMoodCode Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborCode Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborCodeP Method of DeliveryFinal Route and MethodTrialOfLaborAssociationTrialOfLaborValue' moodCode='EVN' code.code='73760-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='If cesarean, a trial of labor was attempted'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociation typeCode='COMP' constraints.validation.error='Method of DeliveryhysterotomyHysterectomyAssociationTypeCode Method of DeliveryhysterotomyHysterectomyAssociationHysterotomyHysterectomy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomy classCode='OBS' constraints.validation.error='Method of DeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomyClassCode Method of DeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomyCode Method of DeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomyCodeP Method of DeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomyMoodCode Method of DeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomyValue' code.code='73759-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Hysterotomy or hysterectomy was performed at delivery'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFetalPresentation constraints.validation.error='Method of DeliveryFetal PresentationTemplateId Method of DeliveryFetal PresentationClassCode Method of DeliveryFetal PresentationMoodCode Method of DeliveryFetal PresentationCode Method of DeliveryFetal PresentationCodeP Method of DeliveryFetal PresentationValue Method of DeliveryFetal PresentationValueP' templateId.root='null' classCode='OBS' moodCode='EVN' code.code='73761-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Fetal presentation at birth'"
 * @generated
 */
public interface MethodofDelivery extends org.eclipse.mdht.uml.cda.Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of DeliveryTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.45\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of DeliveryClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClass::PROC'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of DeliveryMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentProcedureMood::EVN'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of DeliveryCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'72149-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of DeliveryCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of DeliveryFinalRouteAndMethod'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation))'"
	 * @generated
	 */
	boolean validateMethodofDeliveryFinalRouteAndMethod(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of DeliveryFetalPresentation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation))'"
	 * @generated
	 */
	boolean validateMethodofDeliveryFetalPresentation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Method of DeliveryHysterotomyHysterectomyAssociation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateMethodofDeliveryHysterotomyHysterectomyAssociation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	public MethodofDelivery init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // MethodofDelivery
