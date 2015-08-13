/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Screening Results Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingScreeningResultsOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultOrganizerTemplateId ResultOrganizerClassCode ResultOrganizerCode ResultOrganizerCodeP ResultOrganizerStatusCode ResultOrganizerStatusCodeP HearingScreeningResultsOrganizerComponentResultObservation' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.12' classCode='CLUSTER' code.code='417491009' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Neonatal Hearing Test (Procedure)' constraints.validation.dependOn.ResultOrganizerCode='ResultOrganizerCodeP' constraints.validation.dependOn.ResultOrganizerStatusCode='ResultOrganizerStatusCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultsOrganizerComponentResultObservation constraints.validation.error='HearingScreeningResultsOrganizerComponentResultObservationObservation'"
 * @generated
 */
public interface HearingScreeningResultsOrganizer extends ResultOrganizer
{
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
  boolean validateResultOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
   * @generated
   */
  boolean validateHearingScreeningResultsOrganizerComponentResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingScreeningResultsOrganizer init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingScreeningResultsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingScreeningResultsOrganizer
