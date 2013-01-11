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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='Medications Administered Section' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Medications Administered Section' templateId.root='2.16.840.1.113883.17.3.10.1.18' constraints.validation.error='EMSMedicationsAdministeredSectionTemplateId EMSMedicationsAdministeredSectionCode EMSMedicationsAdministeredSectionCodeP EMSMedicationsAdministeredSectionTitle EMSMedicationsAdministeredSectionText EMSMedicationsAdministeredSectionEntry1' code.codeSystemName='LOINC' code.code='67849-0'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntry constraints.validation.info='MedicationAdministeredEntryEMSMedicationAdministered'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministered approachSiteCode.codeSystem='2.16.840.1.113883.6.96' constraints.validation.error='EMSMedicationAdministeredClassCode EMSMedicationAdministeredDoseQuantity EMSMedicationAdministeredEffectiveTime EMSMedicationAdministeredRouteCode EMSMedicationAdministeredRouteCodeP EMSMedicationAdministeredEMSMedicationConsumable EMSMedicationAdministeredMedicationAdministeredResponseRelationship EMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1.1' approachSiteCode.codeSystemName='SNOMEDCT' classCode='SBADM' routeCode.codeSystemName='FDA Route of Administration' constraints.validation.warning='EMSMedicationAdministeredApproachSiteCode' constraints.validation.dependOn.EMSMedicationAdministeredApproachSiteCode='EMSMedicationAdministeredApproachSiteCodeP' approachSiteCode.code='15562006' constraints.validation.info='EMSMedicationAdministeredNegationInd EMSMedicationAdministeredApproachSiteCodeP EMSMedicationAdministeredMedicationNotAdministeredEntryRelationship EMSMedicationAdministeredEMSMedicationComplicationRelationship EMSMedicationAdministeredEMSMedicationPerformerParticipation EMSMedicationAdministeredEMSMedicationAuthorizationRelationship EMSMedicationAdministeredMedicationAdministrationDeviceParticipant' approachSiteCode.displayName='structure of respiratory region of nose' constraints.validation.dependOn.EMSMedicationAdministeredRouteCode='EMSMedicationAdministeredRouteCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationship inversionInd='TRUE' constraints.validation.error='MedicationNotAdministeredReasonEntryRelationshipInversionInd MedicationNotAdministeredReasonEntryRelationshipTypeCode MedicationNotAdministeredReasonEntryRelationshipTypeCodeP MedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation' typeCode='RSON' constraints.validation.dependOn.MedicationNotAdministeredReasonEntryRelationshipTypeCode='MedicationNotAdministeredReasonEntryRelationshipTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationNotAdministeredReasonEntryRelationshipMedicationNotAdministeredReasonObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.5.4' code.displayName='Assertion' constraints.validation.error='MedicationNotAdministeredReasonObservationCode MedicationNotAdministeredReasonObservationValue MedicationNotAdministeredReasonObservationValueP' code.codeSystemName='HL7ActCode' code.code='ASSERTION' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumable constraints.validation.error='EMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct constraints.validation.error='EMSMedicationManfacturedProductEMSMedicationLabeledDrug'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrug code.codeSystem='2.16.840.1.113883.6.88' constraints.validation.error='EMSMedicationLabeledDrugCode' code.codeSystemName='RxNorm'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationship constraints.validation.error='EMSMedicationAdministeredResponseRelationshipMedicationResponseObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Response to medication' constraints.validation.dependOn.MedicationResponseObservationCode='MedicationResponseObservationCodeP' constraints.validation.error='MedicationResponseObservationCode MedicationResponseObservationCodeP MedicationResponseObservationValue' code.codeSystemName='LOINC' code.code='67540-5' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationship constraints.validation.error='EMSMedicationComplicationRelationshipEMSMedicationComplicationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Medication complication' constraints.validation.error='EMSMedicationComplicationObservationCode EMSMedicationComplicationObservationCodeP EMSMedicationComplicationObservationValue EMSMedicationComplicationObservationValueP' code.codeSystemName='LOINC' code.code='67541-3' constraints.validation.dependOn.EMSMedicationComplicationObservationCode='EMSMedicationComplicationObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship constraints.validation.error='EMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Prior administration' constraints.validation.error='EMSMedicationPriorAdministrationObservationCode EMSMedicationPriorAdministrationObservationCodeP EMSMedicationPriorAdministrationObservationValue' code.codeSystemName='LOINC' constraints.validation.dependOn.EMSMedicationPriorAdministrationObservationCode='EMSMedicationPriorAdministrationObservationCodeP' code.code='67539-7'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipation constraints.validation.error='EMSMedicationPerformerParticipationEMSMedicationPerformerRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRole code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='EMSMedicationPerformerRoleCode EMSMedicationPerformerRoleCodeP EMSMedicationPerformerRoleId' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationship constraints.validation.error='EMSMedicationAuthorizationRelationshipEMSMedicationAuthorization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorization code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='EMSMedicationAuthorizationClassCode EMSMedicationAuthorizationClassCodeP EMSMedicationAuthorizationCode' constraints.validation.dependOn.EMSMedicationAuthorizationClassCode='EMSMedicationAuthorizationClassCodeP' code.codeSystemName='LOINC' classCode='INFRM'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipant constraints.validation.error='MedicationAdministrationDeviceParticipantTypeCode MedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole' typeCode='DEV'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRole constraints.validation.error='MedicationAdministrationDeviceRoleClassCode' classCode='MANU'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionMedicationAdministeredEntryEMSMedicationAdministeredMedicationAdministrationDeviceParticipantMedicationAdministrationDeviceRoleMedicationAdministrationDevice constraints.validation.error='MedicationAdministrationDeviceCode'"
 * @generated
 */
public interface EMSMedicationsAdministeredSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.18')
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
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
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
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67849-0' and value.codeSystem = '2.16.840.1.113883.6.1')
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
   * not self.text.oclIsUndefined()
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
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Medications Administered Section')
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
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection::MedicationAdministeredEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection::MedicationAdministeredEntry))'"
   * @generated
   */
	boolean validateEMSMedicationsAdministeredSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection::MedicationAdministeredEntry))->asSequence()->first().oclAsType(emspcr::EMSMedicationsAdministeredSection::MedicationAdministeredEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection::MedicationAdministeredEntry))->asSequence()->first().oclAsType(emspcr::EMSMedicationsAdministeredSection::MedicationAdministeredEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSMedicationsAdministeredSection init();
} // EMSMedicationsAdministeredSection
