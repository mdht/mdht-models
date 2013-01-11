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
 * A representation of the model object '<em><b>EMS Past Medical History Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSPastMedicalHistorySection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Past Medical History' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Past Medical History Section' templateId.root='2.16.840.1.113883.17.3.10.1.19' constraints.validation.error='EMSPastMedicalHistorySectionTemplateId EMSPastMedicalHistorySectionCode EMSPastMedicalHistorySectionCodeP EMSPastMedicalHistorySectionTitle EMSPastMedicalHistorySectionText EMSPastMedicalHistorySectionEntry1 EMSPastMedicalHistorySectionEntry2' code.codeSystemName='LOINC' code.code='67842-5'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntry constraints.validation.info='HistoryOfConditionsEntryEMSHistoryOfConditions'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizer constraints.validation.error='EMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponent' constraints.validation.info='EMSHistoryOfConditionsOrganizerHistoryOfConditionComponent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponent constraints.validation.error='ExistenceOfHistoryOfConditionComponentEMSExistenceOfHistoryOfCondition'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerExistenceOfHistoryOfConditionComponentEMSExistenceOfHistoryOfCondition code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Has the patient had any significant medical conditions' constraints.validation.error='EMSExistenceOfHistoryOfConditionCode EMSExistenceOfHistoryOfConditionValue' code.codeSystemName='LOINC' code.code='67793-0'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponent constraints.validation.error='HistoryOfConditionComponentEMSHistoryOfCondition'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfConditionsEntryEMSHistoryOfConditionsOrganizerHistoryOfConditionComponentEMSHistoryOfCondition constraints.validation.dependOn.EMSHistoryOfConditionCode='EMSHistoryOfConditionCodeP' value.codeSystemName='ICD-10 CM' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS History of Condition' constraints.validation.error='EMSHistoryOfConditionCode EMSHistoryOfConditionCodeP EMSHistoryOfConditionValue EMSHistoryOfConditionValueP' code.codeSystemName='LOINC' code.code='68487-8' value.codeSystem='2.16.840.1.113883.6.90'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizer constraints.validation.error='EMSHistoryOfProceduresOrganizerComponent' constraints.validation.info='EMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponent constraints.validation.error='EMSExistenceOfHistoryOfProcedureComponentProcedure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSExistenceOfHistoryOfProcedureComponentEMSExistenceOfHistoryOfProcedures code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS existence of history of procedures' constraints.validation.error='EMSExistenceOfHistoryOfProceduresCode EMSExistenceOfHistoryOfProceduresValue' code.codeSystemName='LOINC' code.code='67792-2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponent constraints.validation.error='EMSHistoryOfProceduresComponentEMSHistoryOfProcedure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistorySectionHistoryOfProceduresEntryEMSHistoryOfProceduresOrganizerEMSHistoryOfProceduresComponentEMSHistoryOfProcedure code.codeSystem='2.16.840.1.113883.6.4' constraints.validation.error='EMSHistoryOfProcedureCode' code.codeSystemName='ICD-10 PCS'"
 * @generated
 */
public interface EMSPastMedicalHistorySection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.19')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.19\')'"
   * @generated
   */
	boolean validateEMSPastMedicalHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67842-5' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67842-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSPastMedicalHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSPastMedicalHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Past Medical History')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Past Medical History\')'"
   * @generated
   */
	boolean validateEMSPastMedicalHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSPastMedicalHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistorySection::HistoryOfConditionsEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistorySection::HistoryOfConditionsEntry))'"
   * @generated
   */
	boolean validateEMSPastMedicalHistorySectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistorySection::HistoryOfProceduresEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistorySection::HistoryOfProceduresEntry))'"
   * @generated
   */
	boolean validateEMSPastMedicalHistorySectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistorySection::HistoryOfConditionsEntry))->asSequence()->first().oclAsType(emspcr::EMSPastMedicalHistorySection::HistoryOfConditionsEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistorySection::HistoryOfConditionsEntry))->asSequence()->first().oclAsType(emspcr::EMSPastMedicalHistorySection::HistoryOfConditionsEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistorySection::HistoryOfProceduresEntry))->asSequence()->first().oclAsType(emspcr::EMSPastMedicalHistorySection::HistoryOfProceduresEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistorySection::HistoryOfProceduresEntry))->asSequence()->first().oclAsType(emspcr::EMSPastMedicalHistorySection::HistoryOfProceduresEntry)'"
   * @generated
   */
  void getEntry2();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSPastMedicalHistorySection init();
} // EMSPastMedicalHistorySection
