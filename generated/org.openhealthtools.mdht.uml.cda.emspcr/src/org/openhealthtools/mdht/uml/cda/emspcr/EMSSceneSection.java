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
 * A representation of the model object '<em><b>EMS Scene Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSSceneSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Scene' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Scene Section' templateId.root='2.16.840.1.113883.17.3.10.1.8' constraints.validation.error='EMSSceneSectionTemplateId EMSSceneSectionCode EMSSceneSectionTitle EMSSceneSectionText EMSSceneSectionEntry1 EMSSceneSectionEntry3' code.codeSystemName='LOINC' code.code='67665-0'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntry constraints.validation.error='EMSFirstUnitEntryEMSFirstUnitIndicator EMSFirstUnitEntryEMSFirstUnitOnScene'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitIndicator code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS reporter is first unit on scene' constraints.validation.error='EMSFirstUnitIndicatorCode EMSFirstUnitIndicatorCodeP EMSFirstUnitIndicatorValue' code.codeSystemName='LOINC' code.code='67665-0' constraints.validation.dependOn.EMSFirstUnitIndicatorCode='EMSFirstUnitIndicatorCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitOnScene constraints.validation.dependOn.EMSFirstUnitOnSceneCode='EMSFirstUnitOnSceneCodeP' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Name of first unit on scene' constraints.validation.error='EMSFirstUnitOnSceneCode EMSFirstUnitOnSceneCodeP EMSFirstUnitOnSceneValue' code.codeSystemName='LOINC' code.code='67481-2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntry constraints.validation.error='EMSScenePatientCountEntryEMSScenePatientCount EMSScenePatientCountEntryEMSMassCasualtyIndicator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSScenePatientCount code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Count of patients at scene' constraints.validation.error='EMSScenePatientCountCode EMSScenePatientCountCodeP EMSScenePatientCountValue' code.codeSystemName='LOINC' constraints.validation.dependOn.EMSScenePatientCountCode='EMSScenePatientCountCodeP' code.code='67489-5'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSMassCasualtyIndicator constraints.validation.error='EMSMassCasualtyIndicatorCode EMSMassCasualtyIndicatorValue'"
 * @generated
 */
public interface EMSSceneSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.8')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.8\')'"
   * @generated
   */
	boolean validateEMSSceneSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67665-0' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67665-0\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSSceneSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSceneSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Scene')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Scene\')'"
   * @generated
   */
	boolean validateEMSSceneSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSceneSection::EMSFirstUnitEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSceneSection::EMSFirstUnitEntry))'"
   * @generated
   */
	boolean validateEMSSceneSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSceneSection::EMSScenePatientCountEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSceneSection::EMSScenePatientCountEntry))'"
   * @generated
   */
	boolean validateEMSSceneSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSceneSection::EMSFirstUnitEntry))->asSequence()->first().oclAsType(emspcr::EMSSceneSection::EMSFirstUnitEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSceneSection::EMSFirstUnitEntry))->asSequence()->first().oclAsType(emspcr::EMSSceneSection::EMSFirstUnitEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSceneSection::EMSScenePatientCountEntry))->asSequence()->first().oclAsType(emspcr::EMSSceneSection::EMSScenePatientCountEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSceneSection::EMSScenePatientCountEntry))->asSequence()->first().oclAsType(emspcr::EMSSceneSection::EMSScenePatientCountEntry)'"
   * @generated
   */
  void getEntry3();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSSceneSection init();
} // EMSSceneSection
