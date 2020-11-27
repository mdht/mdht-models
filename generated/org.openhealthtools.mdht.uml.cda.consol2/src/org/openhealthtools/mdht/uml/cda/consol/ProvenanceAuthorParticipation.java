/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Author;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Author Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProvenanceAuthorParticipation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProvenanceAuthorParticipationTemplateId ProvenanceAuthorParticipationTime ProvenanceAuthorParticipationAssignedAuthor ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName ProvenanceAuthorParticipationProvenanceAssignedAuthorId ProvenanceAuthorParticipationProvenanceAssignedAuthorCode ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization' templateId.root='2.16.840.1.113883.10.20.22.5 .6' templateId.extension='2019-10-01' constraints.validation.query='ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom ProvenanceAuthorParticipationProvenanceAssignedAuthorId ProvenanceAuthorParticipationProvenanceAssignedAuthorCode ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice' constraints.validation.warning='ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson' constraints.validation.info='ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProvenanceAuthorParticipationProvenanceAssignedAuthor constraints.validation.error='ProvenanceAuthorParticipationProvenanceAssignedAuthorId ProvenanceAuthorParticipationProvenanceAssignedAuthorCode ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson' constraints.validation.info='ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson constraints.validation.error='ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName AssignedPersonProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily AssignedPersonProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven' constraints.validation.query='AssignedPersonProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily AssignedPersonProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPN constraints.validation.error='ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily ProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization constraints.validation.warning='ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom' constraints.validation.error='ProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName'"
 * @generated
 */
public interface ProvenanceAuthorParticipation extends Author {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.5 .6\' and id.extension = \'2019-10-01\')'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null).assignedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((family-&gt;isEmpty() or family-&gt;exists(element | element.isNullFlavorUndefined())) implies (family-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null).assignedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((given-&gt;isEmpty() or given-&gt;exists(element | element.isNullFlavorUndefined())) implies (not given-&gt;isEmpty()) )))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null).assignedPerson-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (not name-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null).representedOrganization-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null).representedOrganization-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (not name-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null).representedOrganization-&gt;excluding(null)-&gt;reject((telecom-&gt;isEmpty() or telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (not telecom-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and (value.code = \'DAUINLAW\' or value.code = \'FTH\' or value.code = \'DAU\' or value.code = \'HPOWATT\' or value.code = \'MTH\' or value.code = \'SON\' or value.code = \'SELF\' or value.code = \'SONINLAW\')))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null)-&gt;reject(assignedPerson.oclIsTypeOf(consol::ProvenanceAuthorParticipation::ProvenanceAssignedAuthor::AssignedPerson))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null)-&gt;reject(representedOrganization.oclIsTypeOf(consol::ProvenanceAuthorParticipation::ProvenanceAssignedAuthor::RepresentedOrganization))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;excluding(null)-&gt;reject(assignedAuthoringDevice-&gt;one(assignedAuthoringDevice : cda::AuthoringDevice | not assignedAuthoringDevice.oclIsUndefined() and assignedAuthoringDevice.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAuthorParticipation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAuthorParticipation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProvenanceAuthorParticipation
