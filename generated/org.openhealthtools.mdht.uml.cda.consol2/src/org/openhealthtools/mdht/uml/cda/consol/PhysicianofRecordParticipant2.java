/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physicianof Record Participant2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianofRecordParticipant2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicianofRecordParticipant2TemplateId PhysicianofRecordParticipantAssignedEntity PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix PhysicianofRecordParticipantAssignedEntityAssignedPersonName' templateId.root='2.16.840.1.113883.10.20.6.2.2' templateId.extension='2014-06-09' constraints.validation.query='PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix PhysicianofRecordParticipantAssignedEntityAssignedPersonName PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization' constraints.validation.warning='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson' constraints.validation.info='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipant2AssignedEntity constraints.validation.warning='PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson' constraints.validation.info='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipant2AssignedEntityAssignedPerson constraints.validation.error='PhysicianofRecordParticipantAssignedEntityAssignedPersonName AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven AssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix' constraints.validation.query='AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven AssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix AssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipant2AssignedEntityRepresentedOrganization constraints.validation.warning='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName'"
 *        annotation="duplicates"
 * @generated
 */
public interface PhysicianofRecordParticipant2 extends PhysicianofRecordParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.2\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).assignedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(getText(true)&lt;&gt;\'\')'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).assignedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (use-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::EntityNameUse) and \nlet value : vocab::EntityNameUse = element.oclAsType(vocab::EntityNameUse) in \nvalue = vocab::EntityNameUse::A or value = vocab::EntityNameUse::ABC or value = vocab::EntityNameUse::ASGN or value = vocab::EntityNameUse::C or value = vocab::EntityNameUse::I or value = vocab::EntityNameUse::IDE or value = vocab::EntityNameUse::L or value = vocab::EntityNameUse::P or value = vocab::EntityNameUse::PHON or value = vocab::EntityNameUse::R or value = vocab::EntityNameUse::SNDX or value = vocab::EntityNameUse::SRCH or value = vocab::EntityNameUse::SYL) )))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).assignedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (family-&gt;isEmpty() )))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).assignedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (given-&gt;isEmpty() )))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).assignedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (prefix-&gt;isEmpty() )))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).assignedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (suffix-&gt;isEmpty() )))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).representedOrganization-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject(representedOrganization-&gt;one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicianofRecordParticipant2
