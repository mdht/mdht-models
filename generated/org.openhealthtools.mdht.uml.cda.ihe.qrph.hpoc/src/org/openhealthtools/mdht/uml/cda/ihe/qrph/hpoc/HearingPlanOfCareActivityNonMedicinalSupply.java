/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingPlanOfCareActivityNonMedicinalSupply()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PlanOfCareActivitySupplyTemplateId HearingPlanOfCareActivityNonMedicinalSupplyCode HearingPlanOfCareActivityNonMedicinalSupplyCodeP HearingPlanOfCareActivityNonMedicinalSupplyText' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.7' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.warning='HearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime HearingPlanOfCareActivityNonMedicinalSupplyQuantity' constraints.validation.info='HearingPlanOfCareActivityNonMedicinalSupplyParticipant'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivityNonMedicinalSupplyParticipant typeCode='PRD' constraints.validation.error='HearingPlanOfCareActivityNonMedicinalSupplyParticipantTypeCode HearingPlanOfCareActivityNonMedicinalSupplyParticipantParticipantRole'"
 * @generated
 */
public interface HearingPlanOfCareActivityNonMedicinalSupply extends EObject
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.7\')'"
	 * @generated
	 */
	boolean validatePlanOfCareActivitySupplyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'IHE-TSC-7.3.1.1.2.5.9.001\' or value.code = \'IHE-TSC-7.3.1.1.2.5.9.002\' or value.code = \'IHE-TSC-7.3.1.1.2.5.9.003\' or value.code = \'IHE-TSC-7.3.1.1.2.5.9.004\'))'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingPlanOfCareActivityNonMedicinalSupply init();

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareActivityNonMedicinalSupply init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingPlanOfCareActivityNonMedicinalSupply
