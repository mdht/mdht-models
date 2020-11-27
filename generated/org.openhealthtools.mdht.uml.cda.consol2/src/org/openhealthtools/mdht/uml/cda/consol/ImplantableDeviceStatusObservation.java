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
 * A representation of the model object '<em><b>Implantable Device Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImplantableDeviceStatusObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ImplantableDeviceStatusObservationTemplateId ImplantableDeviceStatusObservationCode ImplantableDeviceStatusObservationCodeP ImplantableDeviceStatusObservationValue ImplantableDeviceStatusObservationValueP' templateId.root='2.16.840.1.113883.10.20.22.4.305' templateId.extension='2019-06-21' code.code='C160939' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Implantable Device Status' constraints.validation.dependOn.ImplantableDeviceStatusObservationCode='ImplantableDeviceStatusObservationCodeP' value.codeSystem='2.16.840.1.113883.3.26.1.1' value.codeSystemName='NCI Thesaurus'"
 * @generated
 */
public interface ImplantableDeviceStatusObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.305\' and id.extension = \'2019-06-21\')'"
	 * @generated
	 */
	boolean validateImplantableDeviceStatusObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateImplantableDeviceStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'C160939\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\')'"
	 * @generated
	 */
	boolean validateImplantableDeviceStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() = 1 and self.value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and (value.code = \'C45329\' or value.code = \'C154407\' or value.code = \'C122711\' or value.code = \'C160942\')))'"
	 * @generated
	 */
	boolean validateImplantableDeviceStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() =  1 and self.value-&gt;forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validateImplantableDeviceStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplantableDeviceStatusObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplantableDeviceStatusObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);

} // ImplantableDeviceStatusObservation
