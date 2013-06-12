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

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neurological Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getNeurologicalAssessment()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='NeurologicalAssessmentTemplateId NeurologicalAssessmentCode NeurologicalAssessmentCodeP NeurologicalAssessmentValue NeurologicalAssessmentValueP NeurologicalAssessmentMoodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.141' code.code='67536-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Neurological status assessment' constraints.validation.dependOn.NeurologicalAssessmentCode='NeurologicalAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 * @generated
 */
public interface NeurologicalAssessment extends Observation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.141\')'"
	* @generated
	*/
	boolean validateNeurologicalAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateNeurologicalAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'67536-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateNeurologicalAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA15899-0\' or value.code = \'LA17286-8\' or value.code = \'LA17291-8\' or value.code = \'LA17292-6\' or value.code = \'LA17293-4\' or value.code = \'LA17294-2\' or value.code = \'LA17295-9\' or value.code = \'LA17296-7\' or value.code = \'LA17297-5\' or value.code = \'LA17298-3\' or value.code = \'LA17299-1\' or value.code = \'LA17300-7\' or value.code = \'LA17301-5\' or value.code = \'LA17302-3\' or value.code = \'LA17303-1\' or value.code = \'LA17304-9\' or value.code = \'LA17305-6\' or value.code = \'LA18261-0\' or value.code = \'LA18262-8\' or value.code = \'LA18263-6\' or value.code = \'LA18264-4\' or value.code = \'LA18265-1\' or value.code = \'LA6630-3\')))'"
	* @generated
	*/
	boolean validateNeurologicalAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	* @generated
	*/
	boolean validateNeurologicalAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	* @generated
	*/
	boolean validateNeurologicalAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public NeurologicalAssessment init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurologicalAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // NeurologicalAssessment
