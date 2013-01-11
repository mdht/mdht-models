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
 * A representation of the model object '<em><b>EMS Dispatch Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSDispatchSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Dispatch' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Dispatch Section' templateId.root='2.16.840.1.113883.17.3.10.1.2' constraints.validation.error='EMSDispatchSectionTemplateId EMSDispatchSectionCode EMSDispatchSectionTitle EMSDispatchSectionText EMSDispatchSectionEntry1 EMSDispatchSectionEntry2' code.codeSystemName='LOINC' code.code='67660-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionEMDEntry constraints.validation.info='EMDEntryEMSEmergencyMedicalDispatchObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionEMDEntryEMSEmergencyMedicalDispatchObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMDPerformed' constraints.validation.error='EMSEmergencyMedicalDispatchObservationCode EMSEmergencyMedicalDispatchObservationCodeP EMSEmergencyMedicalDispatchObservationValue EMSEmergencyMedicalDispatchObservationValueP' code.codeSystemName='LOINC' code.code='67488-7' value.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSEmergencyMedicalDispatchObservationCode='EMSEmergencyMedicalDispatchObservationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionDispatchComplaintEntry constraints.validation.info='DispatchComplaintEntryEMSComplaintReportedByDispatch'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchSectionDispatchComplaintEntryEMSComplaintReportedByDispatch value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSComplaintReportedByDispatchCode='EMSComplaintReportedByDispatchCodeP' code.displayName='Complaint reported by dispatch' constraints.validation.error='EMSComplaintReportedByDispatchCode EMSComplaintReportedByDispatchCodeP EMSComplaintReportedByDispatchValue EMSComplaintReportedByDispatchValueP' code.codeSystemName='LOINC' code.code='67570-2' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSDispatchSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.2')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.2\')'"
   * @generated
   */
	boolean validateEMSDispatchSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67660-1' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67660-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSDispatchSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSDispatchSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Dispatch')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Dispatch\')'"
   * @generated
   */
	boolean validateEMSDispatchSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispatchSection::EMDEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispatchSection::EMDEntry))'"
   * @generated
   */
	boolean validateEMSDispatchSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispatchSection::DispatchComplaintEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispatchSection::DispatchComplaintEntry))'"
   * @generated
   */
	boolean validateEMSDispatchSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispatchSection::EMDEntry))->asSequence()->first().oclAsType(emspcr::EMSDispatchSection::EMDEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispatchSection::EMDEntry))->asSequence()->first().oclAsType(emspcr::EMSDispatchSection::EMDEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispatchSection::DispatchComplaintEntry))->asSequence()->first().oclAsType(emspcr::EMSDispatchSection::DispatchComplaintEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispatchSection::DispatchComplaintEntry))->asSequence()->first().oclAsType(emspcr::EMSDispatchSection::DispatchComplaintEntry)'"
   * @generated
   */
  void getEntry2();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSDispatchSection init();
} // EMSDispatchSection
