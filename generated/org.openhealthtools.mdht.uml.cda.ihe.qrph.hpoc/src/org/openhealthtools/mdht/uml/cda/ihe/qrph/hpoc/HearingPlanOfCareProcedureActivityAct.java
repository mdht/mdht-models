/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.lang.Iterable;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Plan Of Care Procedure Activity Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingPlanOfCareProcedureActivityAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureActivityActTemplateId ProcedureActivityActId ProcedureActivityActCode HearingPlanOfCareProcedureActivityActText' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.21'"
 * @generated
 */
public interface HearingPlanOfCareProcedureActivityAct extends ProcedureActivityAct
{
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
  boolean validateHearingPlanOfCareProcedureActivityActText(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareProcedureActivityAct init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareProcedureActivityAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingPlanOfCareProcedureActivityAct
