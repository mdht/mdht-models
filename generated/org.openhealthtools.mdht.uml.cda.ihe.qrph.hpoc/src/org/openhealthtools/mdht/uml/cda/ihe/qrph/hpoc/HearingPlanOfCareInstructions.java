/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.lang.Iterable;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.Instructions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Plan Of Care Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingPlanOfCareInstructions()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='InstructionsTemplateId InstructionsCode InstructionsCodeP InstructionsText HearingPlanOfCareInstructionsEffectiveTime InstructionsStatusCode InstructionsStatusCodeP' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.1' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.dependOn.InstructionsCode='InstructionsCodeP' statusCode.code='completed' constraints.validation.dependOn.InstructionsStatusCode='InstructionsStatusCodeP'"
 * @generated
 */
public interface HearingPlanOfCareInstructions extends Instructions
{
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
  boolean validateHearingPlanOfCareInstructionsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);
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
  boolean validateInstructionsStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareInstructions init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareInstructions init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingPlanOfCareInstructions
