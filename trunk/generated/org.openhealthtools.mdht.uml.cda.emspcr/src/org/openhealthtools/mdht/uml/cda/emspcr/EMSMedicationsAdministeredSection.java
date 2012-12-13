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
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Medications Administered Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSMedicationsAdministeredSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSMedicationsAdministeredSectionTemplateId EMSMedicationsAdministeredSectionCode EMSMedicationsAdministeredSectionCodeP EMSMedicationsAdministeredSectionTitle EMSMedicationsAdministeredSectionText EMSMedicationsAdministeredSectionEntry1' templateId.root='2.16.840.1.113883.17.3.10.1.18' code.code='67849-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Medications Administered Section' title.mixed='Medications Administered Section'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntry constraints.validation.info='MedicationAdministeredEntryEMSMedicationAdministered'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministered classCode='SBADM' constraints.validation.error='EMSMedicationAdministeredClassCode EMSMedicationAdministeredDoseQuantity EMSMedicationAdministeredEffectiveTime EMSMedicationAdministeredRouteCode EMSMedicationAdministeredRouteCodeP EMSMedicationAdministeredEMSMedicationConsumable EMSMedicationAdministeredMedicationAdministeredResponseRelationship EMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship' constraints.validation.info='EMSMedicationAdministeredNegationInd EMSMedicationAdministeredApproachSiteCodeP EMSMedicationAdministeredMedicationNotAdministeredEntryRelationship EMSMedicationAdministeredEMSMedicationComplicationRelationship EMSMedicationAdministeredEMSMedicationPerformerParticipation EMSMedicationAdministeredEMSMedicationAuthorizationRelationship EMSMedicationAdministeredMedicationAdministrationDeviceParticipant' routeCode.codeSystem='2.16.840.1.113883.6.1' routeCode.codeSystemName='LOINC' constraints.validation.dependOn.EMSMedicationAdministeredRouteCode='EMSMedicationAdministeredRouteCodeP' approachSiteCode.code='15562006' approachSiteCode.codeSystem='2.16.840.1.113883.6.96' approachSiteCode.codeSystemName='SNOMEDCT' approachSiteCode.displayName='structure of respiratory region of nose' constraints.validation.warning='EMSMedicationAdministeredApproachSiteCode' constraints.validation.dependOn.EMSMedicationAdministeredApproachSiteCode='EMSMedicationAdministeredApproachSiteCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationship inversionInd='TRUE' constraints.validation.error='MedicationNotAdministeredReasonEntryRelationshipInversionInd MedicationNotAdministeredReasonEntryRelationshipTypeCode MedicationNotAdministeredReasonEntryRelationshipTypeCodeP MedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation' typeCode='RSON' constraints.validation.dependOn.MedicationNotAdministeredReasonEntryRelationshipTypeCode='MedicationNotAdministeredReasonEntryRelationshipTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.error='MedicationNotAdministeredReasonObservationCode MedicationNotAdministeredReasonObservationValue MedicationNotAdministeredReasonObservationValueP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumable constraints.validation.error='EMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct constraints.validation.error='EMSMedicationManfacturedProductEMSMedicationLabeledDrug'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrug code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.error='EMSMedicationLabeledDrugCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationship constraints.validation.error='EMSMedicationAdministeredResponseRelationshipMedicationResponseObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservation code.code='67540-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Response to medication' constraints.validation.error='MedicationResponseObservationCode MedicationResponseObservationCodeP MedicationResponseObservationValue' constraints.validation.dependOn.MedicationResponseObservationCode='MedicationResponseObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationship constraints.validation.error='EMSMedicationComplicationRelationshipEMSMedicationComplicationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservation code.code='67541-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Medication complication' constraints.validation.error='EMSMedicationComplicationObservationCode EMSMedicationComplicationObservationCodeP EMSMedicationComplicationObservationValue EMSMedicationComplicationObservationValueP' constraints.validation.dependOn.EMSMedicationComplicationObservationCode='EMSMedicationComplicationObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship constraints.validation.error='EMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation code.code='67539-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Prior administration' constraints.validation.error='EMSMedicationPriorAdministrationObservationCode EMSMedicationPriorAdministrationObservationCodeP EMSMedicationPriorAdministrationObservationValue' constraints.validation.dependOn.EMSMedicationPriorAdministrationObservationCode='EMSMedicationPriorAdministrationObservationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipation constraints.validation.error='EMSMedicationPerformerParticipationEMSMedicationPerformerRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRole code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSMedicationPerformerRoleCode EMSMedicationPerformerRoleCodeP EMSMedicationPerformerRoleId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationship constraints.validation.error='EMSMedicationAuthorizationRelationshipEMSMedicationAuthorization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorization classCode='INFRM' constraints.validation.error='EMSMedicationAuthorizationClassCode EMSMedicationAuthorizationClassCodeP EMSMedicationAuthorizationCode' constraints.validation.dependOn.EMSMedicationAuthorizationClassCode='EMSMedicationAuthorizationClassCodeP' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipant typeCode='DEV' constraints.validation.error='MedicationAdministrationDeviceParticipantTypeCode MedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole classCode='MANU' constraints.validation.error='MedicationAdministrationDeviceRoleClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDevice constraints.validation.error='MedicationAdministrationDeviceCode'"
 * @generated
 */
public interface EMSMedicationsAdministeredSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.18\')'"
	* @generated
	*/
	boolean validateEMSMedicationsAdministeredSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSMedicationsAdministeredSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67849-0\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateEMSMedicationsAdministeredSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	* @generated
	*/
	boolean validateEMSMedicationsAdministeredSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Medications Administered Section\')'"
	* @generated
	*/
	boolean validateEMSMedicationsAdministeredSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	* @generated
	*/
	boolean validateEMSMedicationsAdministeredSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSMedicationsAdministeredSection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSMedicationsAdministeredSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSMedicationsAdministeredSection
