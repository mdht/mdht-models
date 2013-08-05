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
 * A representation of the model object '<em><b>Patient Location In Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getPatientLocationInVehicle()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PatientLocationInVehicleTemplateId PatientLocationInVehicleCode PatientLocationInVehicleValue PatientLocationInVehicleMoodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.55' code.code='67498-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Location of patient in vehicle' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 * @generated
 */
public interface PatientLocationInVehicle extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.55\')'"
	 * @generated
	 */
	boolean validatePatientLocationInVehicleTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'67498-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validatePatientLocationInVehicleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA17361-9\' or value.code = \'LA17362-7\' or value.code = \'LA17363-5\' or value.code = \'LA17364-3\' or value.code = \'LA17365-0\' or value.code = \'LA17366-8\' or value.code = \'LA17367-6\' or value.code = \'LA17368-4\' or value.code = \'LA17369-2\' or value.code = \'LA17370-0\' or value.code = \'LA17371-8\' or value.code = \'LA17372-6\' or value.code = \'LA17373-4\' or value.code = \'LA17374-2\' or value.code = \'LA4489-6\')))'"
	 * @generated
	 */
	boolean validatePatientLocationInVehicleValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientLocationInVehicleMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLocationInVehicle init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLocationInVehicle init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PatientLocationInVehicle
