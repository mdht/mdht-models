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
 * A representation of the model object '<em><b>EMS Advance Directives Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSAdvanceDirectivesSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSAdvanceDirectivesSectionTemplateId EMSAdvanceDirectivesSectionCode EMSAdvanceDirectivesSectionTitle EMSAdvanceDirectivesSectionText EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation' templateId.root='2.16.840.1.113883.17.3.10.1.12' code.code='67840-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Advance Directives Section' title.mixed='EMS Advance Directives Section' constraints.validation.query='EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntry constraints.validation.error='EMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation constraints.validation.error='EMSAdvancedDirectiveObservationTemplateId EMSAdvancedDirectiveObservationCode EMSAdvancedDirectiveObservationValue EMSAdvancedDirectiveObservationValueP EMSAdvancedDirectiveObservationMoodCode' templateId.root='null' code.code='67516-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Advanced directive' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 * @generated
 */
public interface EMSAdvanceDirectivesSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.12\')'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67840-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Advance Directives Section\')'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSAdvanceDirectivesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null).observation->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = \'null\'))'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'67516-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\'))'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA137-2\' or value.code = \'LA17059-9\' or value.code = \'LA17319-7\' or value.code = \'LA17320-5\' or value.code = \'LA17321-3\' or value.code = \'LA17322-1\'))))'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null).observation->excluding(null)->reject(isDefined(\'moodCode\'))'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	* @generated
	*/
	boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSAdvanceDirectivesSection init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAdvanceDirectivesSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSAdvanceDirectivesSection
