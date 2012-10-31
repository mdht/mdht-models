/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Screening Coded Results Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage#getHearingScreeningCodedResultsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HearingScreeningCodedResultsSectionTemplateId' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.15.3.2'"
 * @generated
 */
public interface HearingScreeningCodedResultsSection extends CodedResultsSection
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ihe::ProcedureEntry))->asSequence()->any(true).oclAsType(ihe::ProcedureEntry)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ihe::ProcedureEntry))->asSequence()->any(true).oclAsType(ihe::ProcedureEntry)'"
	 * @generated
	 */
  ProcedureEntry getQrphProcedureEntry();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference))->asSequence()->any(true).oclAsType(ihe::ExternalReference)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference))->asSequence()->any(true).oclAsType(ihe::ExternalReference)'"
	 * @generated
	 */
  ExternalReference getQrphExternalReference();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::SimpleObservation))->asSequence()->any(true).oclAsType(ihe::SimpleObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::SimpleObservation))->asSequence()->any(true).oclAsType(ihe::SimpleObservation)'"
	 * @generated
	 */
  SimpleObservation getQrphSimpleObservation();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HearingScreeningCodedResultsSection init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingScreeningCodedResultsSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingScreeningCodedResultsSection
