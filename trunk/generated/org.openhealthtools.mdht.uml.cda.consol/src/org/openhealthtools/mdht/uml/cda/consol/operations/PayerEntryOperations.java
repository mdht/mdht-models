/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PayerEntry;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payer Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryPayerEntityIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Payer Entity Is Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryCoveredPartyIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party Is Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryCoveredPartyTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntrySubscriberIsAllowed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber Is Allowed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntrySubscriberTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryEntryRelationshipREFR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Entry Relationship REFR</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryEntryRelationshipTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Entry Relationship Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryPayerEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Payer Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryCoveredParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntrySubscriber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#getPayerEntity() <em>Get Payer Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#getCoveredParty() <em>Get Covered Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#getSubscriber() <em>Get Subscriber</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayerEntryOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayerEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryPayerEntityIsRequired(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Payer Entity Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryPayerEntityIsRequired(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(perf : cda::Performer2 | perf.typeCode = vocab::ParticipationPhysicalPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryPayerEntityIsRequired(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Payer Entity Is Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryPayerEntityIsRequired(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->one(perf : cda::Performer2 | perf.typeCode = vocab::ParticipationPhysicalPerformer::PRF)
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryPayerEntityIsRequired(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_PAYER_ENTITY_IS_REQUIRED,
						 ConsolPlugin.INSTANCE.getString("PayerEntryPayerEntityIsRequired"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryCoveredPartyIsRequired(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryCoveredPartyIsRequired(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::COV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryCoveredPartyIsRequired(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party Is Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryCoveredPartyIsRequired(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::COV)
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryCoveredPartyIsRequired(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_COVERED_PARTY_IS_REQUIRED,
						 ConsolPlugin.INSTANCE.getString("PayerEntryCoveredPartyIsRequired"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryCoveredPartyTime(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryCoveredPartyTime(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::COV"+
"  implies not part.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryCoveredPartyTime(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryCoveredPartyTime(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::COV
	 *   implies not part.time.oclIsUndefined())
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryCoveredPartyTime(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_COVERED_PARTY_TIME,
						 ConsolPlugin.INSTANCE.getString("PayerEntryCoveredPartyTime"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntrySubscriberIsAllowed(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber Is Allowed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntrySubscriberIsAllowed(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::HLD)";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntrySubscriberIsAllowed(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber Is Allowed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntrySubscriberIsAllowed(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::HLD)
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntrySubscriberIsAllowed(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_SUBSCRIBER_IS_ALLOWED,
						 ConsolPlugin.INSTANCE.getString("PayerEntrySubscriberIsAllowed"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntrySubscriberTime(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntrySubscriberTime(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::HLD"+
"  implies not part.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntrySubscriberTime(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntrySubscriberTime(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::HLD
	 *   implies not part.time.oclIsUndefined())
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntrySubscriberTime(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_SUBSCRIBER_TIME,
						 ConsolPlugin.INSTANCE.getString("PayerEntrySubscriberTime"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryEntryRelationshipREFR(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Entry Relationship REFR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryEntryRelationshipREFR(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(rel : cda::EntryRelationship | rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryEntryRelationshipREFR(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Entry Relationship REFR</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryEntryRelationshipREFR(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(rel : cda::EntryRelationship | rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryEntryRelationshipREFR(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_ENTRY_RELATIONSHIP_REFR,
						 ConsolPlugin.INSTANCE.getString("PayerEntryEntryRelationshipREFR"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryEntryRelationshipTarget(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Entry Relationship Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryEntryRelationshipTarget(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(rel : cda::EntryRelationship | rel.act.oclIsKindOf(ccd::AuthorizationActivity)"+
"  or rel.act.oclIsKindOf(ccd::CoveragePlanDescription))";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryEntryRelationshipTarget(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Entry Relationship Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryEntryRelationshipTarget(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(rel : cda::EntryRelationship | rel.act.oclIsKindOf(ccd::AuthorizationActivity)
	 *   or rel.act.oclIsKindOf(ccd::CoveragePlanDescription))
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryEntryRelationshipTarget(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_ENTRY_RELATIONSHIP_TARGET,
						 ConsolPlugin.INSTANCE.getString("PayerEntryEntryRelationshipTarget"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryTemplateId(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryTemplateId(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.18')";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryTemplateId(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryTemplateId(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.18')
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryTemplateId(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PayerEntryTemplateId"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryClassCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryClassCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryClassCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryClassCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryClassCode(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("PayerEntryClassCode"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryMoodCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryMoodCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryMoodCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryMoodCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryMoodCode(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("PayerEntryMoodCode"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryId(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryId(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryId(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryId(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryId(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_ID,
						 ConsolPlugin.INSTANCE.getString("PayerEntryId"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryStatusCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryStatusCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryStatusCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryStatusCode(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryStatusCode(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("PayerEntryStatusCode"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryPayerEntity(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Payer Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryPayerEntity(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryPayerEntity(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Payer Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryPayerEntity(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryPayerEntity(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_PAYER_ENTITY,
						 ConsolPlugin.INSTANCE.getString("PayerEntryPayerEntity"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntryCoveredParty(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryCoveredParty(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(cda::ParticipantRole))";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntryCoveredParty(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntryCoveredParty(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(cda::ParticipantRole))
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntryCoveredParty(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_COVERED_PARTY,
						 ConsolPlugin.INSTANCE.getString("PayerEntryCoveredParty"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntrySubscriber(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntrySubscriber(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTRY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(cda::ParticipantRole))";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntrySubscriber(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntrySubscriber(PayerEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTRY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(cda::ParticipantRole))
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntrySubscriber(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTRY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_ENTRY);
			try {
				VALIDATE_PAYER_ENTRY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTRY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTRY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_ENTRY__PAYER_ENTRY_SUBSCRIBER,
						 ConsolPlugin.INSTANCE.getString("PayerEntrySubscriber"),
						 new Object [] { payerEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayerEntity(PayerEntry) <em>Get Payer Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerEntity(PayerEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYER_ENTITY__EOCL_EXP = "self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))->asSequence()->first().oclAsType(cda::AssignedEntity)";

	/**
	 * The cached OCL query for the '{@link #getPayerEntity(PayerEntry) <em>Get Payer Entity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerEntity(PayerEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYER_ENTITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))->asSequence()->first().oclAsType(cda::AssignedEntity)
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AssignedEntity getPayerEntity(PayerEntry payerEntry) {
		if (GET_PAYER_ENTITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PAYER_ENTRY, ConsolPackage.Literals.PAYER_ENTRY.getEAllOperations().get(64));
			try {
				GET_PAYER_ENTITY__EOCL_QRY = helper.createQuery(GET_PAYER_ENTITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYER_ENTITY__EOCL_QRY);
		return (AssignedEntity) query.evaluate(payerEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCoveredParty(PayerEntry) <em>Get Covered Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredParty(PayerEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COVERED_PARTY__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)";

	/**
	 * The cached OCL query for the '{@link #getCoveredParty(PayerEntry) <em>Get Covered Party</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredParty(PayerEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COVERED_PARTY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ParticipantRole getCoveredParty(PayerEntry payerEntry) {
		if (GET_COVERED_PARTY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PAYER_ENTRY, ConsolPackage.Literals.PAYER_ENTRY.getEAllOperations().get(65));
			try {
				GET_COVERED_PARTY__EOCL_QRY = helper.createQuery(GET_COVERED_PARTY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COVERED_PARTY__EOCL_QRY);
		return (ParticipantRole) query.evaluate(payerEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubscriber(PayerEntry) <em>Get Subscriber</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber(PayerEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSCRIBER__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)";

	/**
	 * The cached OCL query for the '{@link #getSubscriber(PayerEntry) <em>Get Subscriber</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber(PayerEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBSCRIBER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)
	 * @param payerEntry The receiving '<em><b>Payer Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ParticipantRole getSubscriber(PayerEntry payerEntry) {
		if (GET_SUBSCRIBER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PAYER_ENTRY, ConsolPackage.Literals.PAYER_ENTRY.getEAllOperations().get(66));
			try {
				GET_SUBSCRIBER__EOCL_QRY = helper.createQuery(GET_SUBSCRIBER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSCRIBER__EOCL_QRY);
		return (ParticipantRole) query.evaluate(payerEntry);
	}

} // PayerEntryOperations