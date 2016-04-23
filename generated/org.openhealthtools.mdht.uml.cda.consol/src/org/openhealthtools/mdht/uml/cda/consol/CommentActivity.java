/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCommentActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CommentActivityTemplateId CommentActivityTextReference CommentActivityTextReferenceValue CommentActivityReferenceValue CommentActivityClassCode CommentActivityMoodCode CommentActivityCode CommentActivityText CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse CommentActivityAuthorAssignedAuthorHasPersonOrOrganization CommentActivityAuthorAssignedAuthorAssignPersonName CommentActivityAuthorAssignedAuthorAddr CommentActivityAuthorAssignedAuthorId CommentActivityAuthorTime CommentActivityAuthorAssignedAuthor' templateId.root='2.16.840.1.113883.10.20.22.4.64' classCode='ACT' moodCode='EVN' code.code='48767-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Annotation comment' constraints.validation.info='CommentActivityAuthor' constraints.validation.query='CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse CommentActivityAuthorAssignedAuthorHasPersonOrOrganization CommentActivityAuthorAssignedAuthorAssignPersonName CommentActivityAuthorAssignedAuthorAddr CommentActivityAuthorAssignedAuthorId CommentActivityAuthorTime CommentActivityAuthorAssignedAuthor' constraints.validation.warning='CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP' constraints.validation.dependOn.CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCommentActivityAuthor constraints.validation.error='CommentActivityAuthorTime CommentActivityAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCommentActivityAuthorAssignedAuthor constraints.validation.error='CommentActivityAuthorAssignedAuthorHasPersonOrOrganization CommentActivityAuthorAssignedAuthorAssignPersonName CommentActivityAuthorAssignedAuthorAddr CommentActivityAuthorAssignedAuthorId AssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity AssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine AssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse' constraints.validation.query='AssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity AssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry AssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode AssignedAuthorGeneralHeaderConstraintsUSRealmAddressState AssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine AssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP AssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse' constraints.validation.warning='AssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry AssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode AssignedAuthorGeneralHeaderConstraintsUSRealmAddressState AssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP' constraints.validation.dependOn.AssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP'"
 * @generated
 */
public interface CommentActivity extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)'"
	 * @generated
	 */
	boolean validateCommentActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))'"
	 * @generated
	 */
	boolean validateCommentActivityTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()'"
	 * @generated
	 */
	boolean validateCommentActivityReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.64\')'"
	 * @generated
	 */
	boolean validateCommentActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validateCommentActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validateCommentActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'48767-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateCommentActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCommentActivityText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1) )))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(element | not element.oclIsUndefined() and element.name->size() = 1) or representedOrganization->one(element | not element.oclIsUndefined() and element.name->size() = 1))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson.name->forAll(name | name.oclIsTypeOf(datatypes::PN)))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorAssignPersonName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
	 * @generated
	 */
	boolean validateCommentActivityAuthorAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentActivity init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommentActivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CommentActivity
