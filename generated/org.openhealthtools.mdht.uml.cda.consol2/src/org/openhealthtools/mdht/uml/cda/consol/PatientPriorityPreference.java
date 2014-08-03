/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Priority Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPatientPriorityPreference()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PatientPriorityPreferenceTemplateId PatientPriorityPreferenceClassCode PatientPriorityPreferenceMoodCode PatientPriorityPreferenceId PatientPriorityPreferenceCode PatientPriorityPreferenceCodeP PatientPriorityPreferenceValue PatientPriorityPreferenceValueP' templateId.root='2.16.840.1.113883.10.20.22.4.142' classCode='OBS' moodCode='EVN' code.code='PAT' code.displayName='Patient request' constraints.validation.dependOn.PatientPriorityPreferenceCode='PatientPriorityPreferenceCodeP' priorityCode.codeSystem='2.16.840.1.113883.6.96' priorityCode.codeSystemName='SNOMEDCT' constraints.validation.warning='PatientPriorityPreferencePriorityCode PatientPriorityPreferencePriorityCodeP' constraints.validation.dependOn.PatientPriorityPreferencePriorityCode='PatientPriorityPreferencePriorityCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.info='PatientPriorityPreferenceCDCodeSystem' constraints.validation.query='PatientPriorityPreferenceCDCodeSystem'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPatientPriorityPreferenceCD constraints.validation.info='PatientPriorityPreferenceCDCodeSystem'"
 * @generated
 */
public interface PatientPriorityPreference extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.142\')'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferenceId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientPriorityPreferenceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'PAT\')'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferencePriorityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined() and self.priorityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.priorityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'255216001\' or value.code = \'81170007\' or value.code = \'70905002\' or value.code = \'29970001\' or value.code = \'32088001\' or value.code = \'53046009\' or value.code = \'86777004\' or value.code = \'51601003\' or value.code = \'58584009\' or value.code = \'28226006\' or value.code = \'40397004\' or value.code = \'46213005\'))'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferencePriorityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'394849002\' or value.code = \'394848005\' or value.code = \'441808003\')))'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferenceValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not codeSystem.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validatePatientPriorityPreferenceCDCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientPriorityPreference init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientPriorityPreference init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PatientPriorityPreference
