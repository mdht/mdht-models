/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Document2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getUnstructuredDocument2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId UnstructuredDocument2RecordTarget UnstructuredDocument2Custodian UnstructuredDocument2Component UnstructuredDocument2RecordTargetPatientRoleId UnstructuredDocument2RecordTargetPatientRole UnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization UnstructuredDocument2CustodianAssignedCustodian UnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation UnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats UnstructuredDocument2ComponentNonXMLBodyText UnstructuredDocument2ComponentNonXMLBody' templateId.root='2.16.840.1.113883.10.20.22.1.10' templateId.extension='2015-08-01' constraints.validation.query='UnstructuredDocument2RecordTargetPatientRoleId UnstructuredDocument2RecordTargetPatientRole UnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization UnstructuredDocument2CustodianAssignedCustodian UnstructuredDocument2ComponentNonXMLBodyEDMediaType UnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation UnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats UnstructuredDocument2ComponentNonXMLBodyText UnstructuredDocument2ComponentNonXMLBody' constraints.validation.info='UnstructuredDocument2ComponentNonXMLBodyEDMediaType'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocument2RecordTarget constraints.validation.error='UnstructuredDocument2RecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocument2RecordTargetPatientRole constraints.validation.error='UnstructuredDocument2RecordTargetPatientRoleId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocument2Custodian constraints.validation.error='UnstructuredDocument2CustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocument2CustodianAssignedCustodian constraints.validation.error='UnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocument2Component constraints.validation.error='UnstructuredDocument2ComponentNonXMLBody'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocument2ComponentNonXMLBody constraints.validation.error='UnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation UnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats UnstructuredDocument2ComponentNonXMLBodyText' constraints.validation.info='UnstructuredDocument2ComponentNonXMLBodyEDMediaType' constraints.validation.query='UnstructuredDocument2ComponentNonXMLBodyEDMediaType'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocument2ComponentNonXMLBodyED mediaType='text/plain' constraints.validation.info='UnstructuredDocument2ComponentNonXMLBodyEDMediaType'"
 * @generated
 */
public interface UnstructuredDocument2 extends USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2RecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2Custodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2Component(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2RecordTargetPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2RecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2CustodianAssignedCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).nonXMLBody->excluding(null).text->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not mediaType.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).nonXMLBody->excluding(null)->reject(not text.reference.value.oclIsUndefined() xor ( text.representation = \'B64\' and (not text.mediaType.oclIsUndefined()) ))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).nonXMLBody->excluding(null)->reject(not text.mediaType.oclIsUndefined()  implies (text.mediaType = \'application/msword\' or text.mediaType = \'application/pdf\' or text.mediaType = \'text/plain\' or text.mediaType = \'text/rtf\' or text.mediaType = \'text/html\' or text.mediaType = \'image/gif\' or text.mediaType = \'image/tiff\' or text.mediaType = \'image/jpeg\' or text.mediaType = \'image/png\'))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).nonXMLBody->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2ComponentNonXMLBodyText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(nonXMLBody->one(nonXMLBody : cda::NonXMLBody | not nonXMLBody.oclIsUndefined() and nonXMLBody.oclIsKindOf(cda::NonXMLBody)))'"
	 * @generated
	 */
	boolean validateUnstructuredDocument2ComponentNonXMLBody(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // UnstructuredDocument2
