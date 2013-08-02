/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getSupplyEntry()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SupplyEntryTemplateId SupplyEntryHasAuthorTime SupplyEntryHasAssignedAuthor SupplyEntryHasAssignedAuthorPersonOrOrg SupplyEntryHasPerformerTimeEvent SupplyEntryHasPerformerAssignedEntity SupplyEntryHasPerformerEntityPersonOrOrg SupplyEntryQuantityHasValue' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.7.3' constraints.validation.info='SupplyEntryHasIntentAuthor SupplyEntryMedicationFullfillmentInstructions' constraints.validation.warning='SupplyEntryHasAssignedAuthorID SupplyEntryHasPerformerTimeIntent SupplyEntryHasPerformerAssignedEntityID SupplyEntryQuantity SupplyEntryRepeatNumber'"
 * @generated
 */
public interface SupplyEntry extends SupplyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.classCode=vocab::ActClassSupply::SPLY and self.moodCode=vocab::x_DocumentSubstanceMood::INT) implies self.author->size() > 0'"
	 * @generated
	 */
	boolean validateSupplyEntryHasIntentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.author->isEmpty() implies self.author->forAll(author| author.time->size() = 1)'"
	 * @generated
	 */
	boolean validateSupplyEntryHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.author->isEmpty() implies  self.author->forAll(author| author.assignedAuthor->size() = 1)'"
	 * @generated
	 */
	boolean validateSupplyEntryHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.author.assignedAuthor->isEmpty() implies self.author.assignedAuthor->forAll ( assignedAuthor | assignedAuthor.id->size() > 0)'"
	 * @generated
	 */
	boolean validateSupplyEntryHasAssignedAuthorID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.author.assignedAuthor->isEmpty() implies    (self.author.assignedAuthor.assignedPerson->size() > 0 and self.author.assignedAuthor.assignedPerson.name->size() > 0) or (self.author.assignedAuthor.representedOrganization->size() > 0 and self.author.assignedAuthor.representedOrganization.name->size() > 0)'"
	 * @generated
	 */
	boolean validateSupplyEntryHasAssignedAuthorPersonOrOrg(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.performer->isEmpty()) and self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.performer->forAll(time->size() = 1)'"
	 * @generated
	 */
	boolean validateSupplyEntryHasPerformerTimeEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.performer->isEmpty()) and self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.performer->forAll(time->size() = 1)'"
	 * @generated
	 */
	boolean validateSupplyEntryHasPerformerTimeIntent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.performer->isEmpty()) implies self.performer->forAll(performer| not performer.assignedEntity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSupplyEntryHasPerformerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.performer.assignedEntity->isEmpty())  implies self.performer.assignedEntity->forAll(id->size() > 0)'"
	 * @generated
	 */
	boolean validateSupplyEntryHasPerformerAssignedEntityID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.performer.assignedEntity->isEmpty()) implies self.performer.assignedEntity->forAll(assignedEntity | (not assignedEntity.assignedPerson->isEmpty() and assignedEntity.assignedPerson->forAll( assignedPerson | not assignedPerson.name->isEmpty() ) ) or (not assignedEntity.representedOrganization->isEmpty() and  assignedEntity.representedOrganization->forAll(representedOrganization | not representedOrganization.name->isEmpty() ) )  )'"
	 * @generated
	 */
	boolean validateSupplyEntryHasPerformerEntityPersonOrOrg(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.quantity->isEmpty() implies self.quantity.isDefined(\'value\')'"
	 * @generated
	 */
	boolean validateSupplyEntryQuantityHasValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.7.3\')'"
	 * @generated
	 */
	boolean validateSupplyEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSupplyEntryQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSupplyEntryRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::MedicationFullfillmentInstructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateSupplyEntryMedicationFullfillmentInstructions(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::MedicationFullfillmentInstructions))->asSequence()->any(true).oclAsType(ihe::MedicationFullfillmentInstructions)'"
	 * @generated
	 */
	MedicationFullfillmentInstructions getMedicationFullfillmentInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyEntry init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyEntry init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SupplyEntry
