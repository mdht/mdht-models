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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSSceneSectionTemplateId EMSSceneSectionCode EMSSceneSectionTitle EMSSceneSectionText EMSSceneSectionEntry1 EMSSceneSectionEntry3' templateId.root='2.16.840.1.113883.17.3.10.1.8' code.code='67665-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Scene Section' title.mixed='EMS Scene'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntry constraints.validation.error='EMSFirstUnitEntryEMSFirstUnitIndicator EMSFirstUnitEntryEMSFirstUnitOnScene'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitIndicator code.code='67481-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS reporter is first unit on scene' constraints.validation.error='EMSFirstUnitIndicatorCode EMSFirstUnitIndicatorCodeP EMSFirstUnitIndicatorValue EMSFirstUnitIndicatorMoodCode' constraints.validation.dependOn.EMSFirstUnitIndicatorCode='EMSFirstUnitIndicatorCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSFirstUnitEntryEMSFirstUnitOnScene code.code='67481-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Name of first unit on scene' constraints.validation.error='EMSFirstUnitOnSceneCode EMSFirstUnitOnSceneCodeP EMSFirstUnitOnSceneValue EMSFirstUnitOnSceneMoodCode' constraints.validation.dependOn.EMSFirstUnitOnSceneCode='EMSFirstUnitOnSceneCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntry constraints.validation.error='EMSScenePatientCountEntryEMSScenePatientCount EMSScenePatientCountEntryEMSMassCasualtyIndicator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSScenePatientCount code.code='67489-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Count of patients at scene' constraints.validation.error='EMSScenePatientCountCode EMSScenePatientCountCodeP EMSScenePatientCountValue EMSScenePatientCountMoodCode' constraints.validation.dependOn.EMSScenePatientCountCode='EMSScenePatientCountCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionEMSScenePatientCountEntryEMSMassCasualtyIndicator code.code='67490-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Mass Casualty Incident Indicator' constraints.validation.error='EMSMassCasualtyIndicatorCode EMSMassCasualtyIndicatorCodeP EMSMassCasualtyIndicatorValue EMSMassCasualtyIndicatorMoodCode' constraints.validation.dependOn.EMSMassCasualtyIndicatorCode='EMSMassCasualtyIndicatorCodeP' moodCode='EVN'"
 * @generated
 */
public interface EMSSceneSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67665-0\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateEMSSceneSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	* @generated
	*/
	boolean validateEMSSceneSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	* @generated
	*/
	boolean validateEMSSceneSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSSceneSection init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSceneSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSSceneSection
