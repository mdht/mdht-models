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

import org.openhealthtools.mdht.uml.cda.Author;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAuthorParticipation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AuthorParticipationTemplateId AuthorParticipationTime AuthorParticipationAssignedAuthor AuthorParticipationAssignedAuthorRepresentedOrganizationClassCode AuthorParticipationAssignedAuthorId' templateId.root='2.16.840.1.113883.10.20.22.4.119' constraints.validation.info='AuthorParticipationAssignedAuthorAssignedPersonName AuthorParticipationAssignedAuthorRepresentedOrganizationId AuthorParticipationAssignedAuthorRepresentedOrganizationName AuthorParticipationAssignedAuthorRepresentedOrganizationTelecom AuthorParticipationAssignedAuthorRepresentedOrganizationAddr AuthorParticipationAssignedAuthorAssignedPerson AuthorParticipationAssignedAuthorRepresentedOrganization' constraints.validation.query='AuthorParticipationAssignedAuthorAssignedPersonName AuthorParticipationAssignedAuthorRepresentedOrganizationClassCode AuthorParticipationAssignedAuthorRepresentedOrganizationId AuthorParticipationAssignedAuthorRepresentedOrganizationName AuthorParticipationAssignedAuthorRepresentedOrganizationTelecom AuthorParticipationAssignedAuthorRepresentedOrganizationAddr AuthorParticipationAssignedAuthorCodeTerminology AuthorParticipationAssignedAuthorId AuthorParticipationAssignedAuthorCode AuthorParticipationAssignedAuthorAssignedPerson AuthorParticipationAssignedAuthorRepresentedOrganization' constraints.validation.warning='AuthorParticipationAssignedAuthorCodeTerminology AuthorParticipationAssignedAuthorCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAuthorParticipationAssignedAuthor constraints.validation.warning='AuthorParticipationAssignedAuthorCodeTerminology AuthorParticipationAssignedAuthorCode' constraints.validation.error='AuthorParticipationAssignedAuthorId' constraints.validation.info='AuthorParticipationAssignedAuthorAssignedPerson AuthorParticipationAssignedAuthorRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAuthorParticipationAssignedAuthorAssignedPerson constraints.validation.info='AuthorParticipationAssignedAuthorAssignedPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAuthorParticipationAssignedAuthorRepresentedOrganization classCode='ORG' constraints.validation.error='AuthorParticipationAssignedAuthorRepresentedOrganizationClassCode' constraints.validation.info='AuthorParticipationAssignedAuthorRepresentedOrganizationId AuthorParticipationAssignedAuthorRepresentedOrganizationName AuthorParticipationAssignedAuthorRepresentedOrganizationTelecom AuthorParticipationAssignedAuthorRepresentedOrganizationAddr'"
 * @generated
 */
public interface AuthorParticipation extends Author {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.119\')'"
	 * @generated
	 */
	boolean validateAuthorParticipationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAuthorParticipationTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorAssignedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassOrganization::ORG)'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null)->reject(code.codeSystem = \'2.16.840.1.113883.6.101\' or code.codeSystem = \'2.16.840.1.113883.5.111\')'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorCodeTerminology(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validateAuthorParticipationAssignedAuthorRepresentedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorParticipation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorParticipation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AuthorParticipation
