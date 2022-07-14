/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Identifier Observation V2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDeviceIdentifierObservationV2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DeviceIdentifierObservationV2TemplateId DeviceIdentifierObservationV2Code DeviceIdentifierObservationV2CodeP DeviceIdentifierObservationV2Value DeviceIdentifierObservationV2IIUDI issuing agency DeviceIdentifierObservationV2IIRoot DeviceIdentifierObservationV2IIDisplayable' templateId.root='2.16.840.1.113883.10.20.22.4.304' templateId.extension='2022-06-01' code.code='C101722' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Primary DI Number' constraints.validation.dependOn.DeviceIdentifierObservationV2Code='DeviceIdentifierObservationV2CodeP' constraints.validation.query='DeviceIdentifierObservationV2IIUDI issuing agency DeviceIdentifierObservationV2IIRoot DeviceIdentifierObservationV2IIExtension DeviceIdentifierObservationV2IIDisplayable' constraints.validation.warning='DeviceIdentifierObservationV2IIExtension'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDeviceIdentifierObservationV2II constraints.validation.error='DeviceIdentifierObservationV2IIRoot DeviceIdentifierObservationV2IIDisplayable' constraints.validation.warning='DeviceIdentifierObservationV2IIExtension' displayable='true'"
 * @generated
 */
public interface DeviceIdentifierObservationV2 extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.304\' and id.extension = \'2022-06-01\')'"
	 * @generated
	 */
	boolean validateDeviceIdentifierObservationV2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDeviceIdentifierObservationV2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'C101722\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\')'"
	 * @generated
	 */
	boolean validateDeviceIdentifierObservationV2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;forAll(element | element.oclIsTypeOf(datatypes::II)))'"
	 * @generated
	 */
	boolean validateDeviceIdentifierObservationV2Value(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceIdentifierObservationV2IIUDI issuing agency'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(matches(\'root\',\'\\\\\\\\b1.3.160\\\\\\\\b\'))'"
	 * @generated
	 */
	boolean validateDeviceIdentifierObservationV2IIUDIissuingagency(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateDeviceIdentifierObservationV2IIRoot(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not extension.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateDeviceIdentifierObservationV2IIExtension(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not displayable.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateDeviceIdentifierObservationV2IIDisplayable(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceIdentifierObservationV2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DeviceIdentifierObservationV2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DeviceIdentifierObservationV2
