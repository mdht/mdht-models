/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph;

import java.lang.Iterable;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Early Hearing Care Plan Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage#getEarlyHearingCarePlanDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EarlyHearingCarePlanDocumentTemplateId EarlyHearingCarePlanDocumentCode EarlyHearingCarePlanDocumentCodeP' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.15.4.1' code.code='34817-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Otorhinolaryngology Evaluation and management' constraints.validation.dependOn.EarlyHearingCarePlanDocumentCode='EarlyHearingCarePlanDocumentCodeP'"
 * @generated
 */
public interface EarlyHearingCarePlanDocument extends MedicalDocument
{
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
  boolean validateEarlyHearingCarePlanDocumentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '34817-7' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'34817-7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
  boolean validateEarlyHearingCarePlanDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrph::RiskIndicatorsForHearingLossSection))->asSequence()->any(true).oclAsType(qrph::RiskIndicatorsForHearingLossSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrph::RiskIndicatorsForHearingLossSection))->asSequence()->any(true).oclAsType(qrph::RiskIndicatorsForHearingLossSection)'"
	 * @generated
	 */
  RiskIndicatorsForHearingLossSection getRiskIndicatorsForHearingLossSection();
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ActiveProblemsSection))->asSequence()->any(true).oclAsType(ihe::ActiveProblemsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ActiveProblemsSection))->asSequence()->any(true).oclAsType(ihe::ActiveProblemsSection)'"
	 * @generated
	 */
  ActiveProblemsSection getActiveProblemsSection();
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::PhysicalExamSection))->asSequence()->any(true).oclAsType(ihe::PhysicalExamSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::PhysicalExamSection))->asSequence()->any(true).oclAsType(ihe::PhysicalExamSection)'"
	 * @generated
	 */
  PhysicalExamSection getPhysicalExamSection();
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(ihe::ReviewOfSystemsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(ihe::ReviewOfSystemsSection)'"
	 * @generated
	 */
  ReviewOfSystemsSection getReviewOfSystemsSection();
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ProceduresAndInterventionsSection))->asSequence()->any(true).oclAsType(ihe::ProceduresAndInterventionsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ProceduresAndInterventionsSection))->asSequence()->any(true).oclAsType(ihe::ProceduresAndInterventionsSection)'"
	 * @generated
	 */
  ProceduresAndInterventionsSection getProceduresAndInterventionsSection();
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrph::HearingScreeningCodedResultsSection))->asSequence()->any(true).oclAsType(qrph::HearingScreeningCodedResultsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrph::HearingScreeningCodedResultsSection))->asSequence()->any(true).oclAsType(qrph::HearingScreeningCodedResultsSection)'"
	 * @generated
	 */
  HearingScreeningCodedResultsSection getHearingScreeningCodedResultsSection();
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarlyHearingCarePlanDocument init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EarlyHearingCarePlanDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EarlyHearingCarePlanDocument
