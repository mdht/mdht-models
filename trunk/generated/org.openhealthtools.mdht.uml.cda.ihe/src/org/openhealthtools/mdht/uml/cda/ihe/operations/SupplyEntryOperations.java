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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SupplyActivityOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Supply Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasIntentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Intent Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasAssignedAuthorID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasAssignedAuthorPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerTimeEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Time Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerTimeIntent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Time Intent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerAssignedEntityID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Assigned Entity ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerEntityPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Entity Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryQuantityHasValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity Has Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryMedicationFullfillmentInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Medication Fullfillment Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#getMedicationFullfillmentInstructions() <em>Get Medication Fullfillment Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplyEntryOperations extends SupplyActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasIntentAuthor(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Intent Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasIntentAuthor(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.classCode=vocab::ActClassSupply::SPLY and self.moodCode=vocab::x_DocumentSubstanceMood::INT) implies self.author->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasIntentAuthor(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Intent Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasIntentAuthor(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasIntentAuthor(SupplyEntry supplyEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_INTENT_AUTHOR,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasIntentAuthor"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasAuthorTime(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasAuthorTime(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies self.author->forAll(author| author.time->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasAuthorTime(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasAuthorTime(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasAuthorTime(SupplyEntry supplyEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_AUTHOR_TIME,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasAuthorTime"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasAssignedAuthor(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasAssignedAuthor(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies  self.author->forAll(author| author.assignedAuthor->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasAssignedAuthor(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasAssignedAuthor(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasAssignedAuthor(SupplyEntry supplyEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasAssignedAuthor"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasAssignedAuthorID(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasAssignedAuthorID(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author.assignedAuthor->isEmpty() implies self.author.assignedAuthor->forAll ( assignedAuthor | assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasAssignedAuthorID(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasAssignedAuthorID(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasAssignedAuthorID(SupplyEntry supplyEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_ID,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasAssignedAuthorID"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasAssignedAuthorPersonOrOrg(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author Person Or Org</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasAssignedAuthorPersonOrOrg(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author.assignedAuthor->isEmpty() implies    (self.author.assignedAuthor.assignedPerson->size() > 0 and self.author.assignedAuthor.assignedPerson.name->size() > 0) or (self.author.assignedAuthor.representedOrganization->size() > 0 and self.author.assignedAuthor.representedOrganization.name->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasAssignedAuthorPersonOrOrg(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author Person Or Org</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasAssignedAuthorPersonOrOrg(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasAssignedAuthorPersonOrOrg(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasAssignedAuthorPersonOrOrg"),
					new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasPerformerTimeEvent(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Time Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerTimeEvent(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer->isEmpty()) and self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.performer->forAll(time->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasPerformerTimeEvent(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Time Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerTimeEvent(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasPerformerTimeEvent(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_PERFORMER_TIME_EVENT,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasPerformerTimeEvent"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasPerformerTimeIntent(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Time Intent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerTimeIntent(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer->isEmpty()) and self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.performer->forAll(time->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasPerformerTimeIntent(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Time Intent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerTimeIntent(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasPerformerTimeIntent(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_PERFORMER_TIME_INTENT,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasPerformerTimeIntent"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasPerformerAssignedEntity(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerAssignedEntity(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer->isEmpty()) implies self.performer->forAll(performer| not performer.assignedEntity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasPerformerAssignedEntity(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerAssignedEntity(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasPerformerAssignedEntity(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasPerformerAssignedEntity"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasPerformerAssignedEntityID(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Assigned Entity ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerAssignedEntityID(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer.assignedEntity->isEmpty())  implies self.performer.assignedEntity->forAll(id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasPerformerAssignedEntityID(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Assigned Entity ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerAssignedEntityID(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasPerformerAssignedEntityID(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY_ID,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasPerformerAssignedEntityID"),
					new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryHasPerformerEntityPersonOrOrg(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Entity Person Or Org</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerEntityPersonOrOrg(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer.assignedEntity->isEmpty()) implies self.performer.assignedEntity->forAll(assignedEntity | (not assignedEntity.assignedPerson->isEmpty() and assignedEntity.assignedPerson->forAll( assignedPerson | not assignedPerson.name->isEmpty() ) ) or (not assignedEntity.representedOrganization->isEmpty() and  assignedEntity.representedOrganization->forAll(representedOrganization | not representedOrganization.name->isEmpty() ) )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryHasPerformerEntityPersonOrOrg(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Entity Person Or Org</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryHasPerformerEntityPersonOrOrg(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryHasPerformerEntityPersonOrOrg(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG,
					IHEPlugin.INSTANCE.getString("SupplyEntryHasPerformerEntityPersonOrOrg"),
					new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryQuantityHasValue(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity Has Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryQuantityHasValue(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity->isEmpty() implies self.quantity.isDefined('value')";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryQuantityHasValue(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity Has Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryQuantityHasValue(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryQuantityHasValue(SupplyEntry supplyEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_QUANTITY_HAS_VALUE,
					IHEPlugin.INSTANCE.getString("SupplyEntryQuantityHasValue"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryTemplateId(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryTemplateId(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.7.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryTemplateId(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryTemplateId(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryTemplateId(SupplyEntry supplyEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("SupplyEntryTemplateId"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryQuantity(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryQuantity(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryQuantity(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryQuantity(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryQuantity(SupplyEntry supplyEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_QUANTITY,
					IHEPlugin.INSTANCE.getString("SupplyEntryQuantity"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryRepeatNumber(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryRepeatNumber(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryRepeatNumber(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryRepeatNumber(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryRepeatNumber(SupplyEntry supplyEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_REPEAT_NUMBER,
					IHEPlugin.INSTANCE.getString("SupplyEntryRepeatNumber"), new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyEntryMedicationFullfillmentInstructions(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Medication Fullfillment Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryMedicationFullfillmentInstructions(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ENTRY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::MedicationFullfillmentInstructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyEntryMedicationFullfillmentInstructions(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Medication Fullfillment Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyEntryMedicationFullfillmentInstructions(SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ENTRY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplyEntry The receiving '<em><b>Supply Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupplyEntryMedicationFullfillmentInstructions(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUPPLY_ENTRY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SUPPLY_ENTRY);
			try {
				VALIDATE_SUPPLY_ENTRY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ENTRY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUPPLY_ENTRY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supplyEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.SUPPLY_ENTRY__SUPPLY_ENTRY_MEDICATION_FULLFILLMENT_INSTRUCTIONS,
					IHEPlugin.INSTANCE.getString("SupplyEntryMedicationFullfillmentInstructions"),
					new Object[] { supplyEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationFullfillmentInstructions(SupplyEntry) <em>Get Medication Fullfillment Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationFullfillmentInstructions(SupplyEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::MedicationFullfillmentInstructions))->asSequence()->any(true).oclAsType(ihe::MedicationFullfillmentInstructions)";

	/**
	 * The cached OCL query for the '{@link #getMedicationFullfillmentInstructions(SupplyEntry) <em>Get Medication Fullfillment Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationFullfillmentInstructions(SupplyEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MedicationFullfillmentInstructions getMedicationFullfillmentInstructions(SupplyEntry supplyEntry) {
		if (GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.SUPPLY_ENTRY, IHEPackage.Literals.SUPPLY_ENTRY.getEAllOperations().get(85));
			try {
				GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY);
		return (MedicationFullfillmentInstructions) query.evaluate(supplyEntry);
	}

} // SupplyEntryOperations
