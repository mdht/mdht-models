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
 * A representation of the model object '<em><b>Protocol Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getProtocolObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProtocolObservationTemplateId ProtocolObservationCode ProtocolObservationCodeP ProtocolObservationValue ProtocolObservationValueP ProtocolObservationMoodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.93' code.code='67537-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS protocol' constraints.validation.dependOn.ProtocolObservationCode='ProtocolObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProtocolObservationProtocolAgeCategoryRelationship constraints.validation.error='ProtocolAgeCategoryRelationshipProtocolAgeCategory'"
 * @generated
 */
public interface ProtocolObservation extends Observation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.93\')'"
	* @generated
	*/
	boolean validateProtocolObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProtocolObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'67537-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateProtocolObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA17398-1\' or value.code = \'LA17491-4\' or value.code = \'LA17492-2\' or value.code = \'LA17494-8\' or value.code = \'LA17495-5\' or value.code = \'LA17496-3\' or value.code = \'LA17497-1\' or value.code = \'LA17498-9\' or value.code = \'LA17499-7\' or value.code = \'LA17500-2\' or value.code = \'LA17501-0\' or value.code = \'LA17502-8\' or value.code = \'LA17503-6\' or value.code = \'LA17504-4\' or value.code = \'LA17505-1\' or value.code = \'LA17506-9\' or value.code = \'LA17507-7\' or value.code = \'LA17508-5\' or value.code = \'LA17509-3\' or value.code = \'LA17510-1\' or value.code = \'LA17511-9\' or value.code = \'LA17512-7\' or value.code = \'LA17513-5\' or value.code = \'LA17514-3\' or value.code = \'LA17515-0\' or value.code = \'LA17516-8\' or value.code = \'LA17517-6\' or value.code = \'LA17518-4\' or value.code = \'LA17519-2\' or value.code = \'LA17520-0\' or value.code = \'LA17521-8\' or value.code = \'LA17522-6\' or value.code = \'LA17523-4\' or value.code = \'LA17524-2\' or value.code = \'LA17525-9\' or value.code = \'LA17526-7\' or value.code = \'LA17527-5\' or value.code = \'LA17528-3\' or value.code = \'LA17529-1\' or value.code = \'LA17530-9\' or value.code = \'LA17531-7\' or value.code = \'LA17532-5\' or value.code = \'LA17533-3\' or value.code = \'LA17534-1\' or value.code = \'LA17535-8\' or value.code = \'LA17536-6\' or value.code = \'LA17537-4\' or value.code = \'LA17538-2\' or value.code = \'LA17539-0\' or value.code = \'LA17540-8\' or value.code = \'LA17541-6\' or value.code = \'LA17542-4\' or value.code = \'LA17543-2\' or value.code = \'LA17544-0\' or value.code = \'LA17545-7\' or value.code = \'LA17546-5\' or value.code = \'LA17547-3\' or value.code = \'LA17548-1\' or value.code = \'LA17549-9\' or value.code = \'LA17550-7\' or value.code = \'LA17551-5\' or value.code = \'LA17552-3\' or value.code = \'LA17553-1\' or value.code = \'LA17554-9\' or value.code = \'LA17555-6\' or value.code = \'LA17556-4\' or value.code = \'LA17557-2\' or value.code = \'LA17558-0\' or value.code = \'LA17559-8\' or value.code = \'LA17560-6\' or value.code = \'LA17561-4\' or value.code = \'LA17562-2\' or value.code = \'LA17563-0\' or value.code = \'LA17564-8\' or value.code = \'LA17565-5\' or value.code = \'LA17566-3\' or value.code = \'LA17567-1\' or value.code = \'LA17568-9\' or value.code = \'LA17569-7\' or value.code = \'LA17570-5\' or value.code = \'LA18269-3\' or value.code = \'LA46-8\' or value.code = \'LA6630-3\')))'"
	* @generated
	*/
	boolean validateProtocolObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProtocolObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProtocolObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProtocolObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProtocolObservation
