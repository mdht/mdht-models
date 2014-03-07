/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue 
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transfer Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryIIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformer1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransferSummaryOperations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryId(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_ID,
					ConsolPlugin.INSTANCE.getString("TransferSummaryId"), new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryCodeP(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_CODE_P,
					ConsolPlugin.INSTANCE.getString("TransferSummaryCodeP"), new Object[] { transferSummary }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP", passToken);
				}
				passToken.add(transferSummary);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryCode(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(transferSummary)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_CODE,
					ConsolPlugin.INSTANCE.getString("TransferSummaryCode"), new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryTitle(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_TITLE,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTitle"), new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryParticipantSupport(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT,
					ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantSupport"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryParticipantCallbackContact(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT,
					ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContact"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryDocumentationOf(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF,
					ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOf"), new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryIIRoot(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary II Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryIIRoot(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryIIRoot(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary II Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryIIRoot(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryIIRoot(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_II_ROOT,
						ConsolPlugin.INSTANCE.getString("TransferSummaryIIRoot"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantSupportAssociatedEntityClassCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and "
			+ "let value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in "
			+ "value = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantSupportAssociatedEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantSupportAssociatedEntityAssociatedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IND)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportTypeCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantSupportTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantSupportAssociatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssociative::ASSIGNED)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactAssociatedEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityId(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactAssociatedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactAssociatedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactAssociatedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(scopingOrganization->one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntity(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("TransferSummaryParticipantCallbackContactAssociatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOfServiceEventPerformerTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOfServiceEventPerformerAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOfServiceEventClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventEffectiveTime(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventEffectiveTime(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventEffectiveTime(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventEffectiveTime(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventEffectiveTime(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOfServiceEventEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1,
						ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOfServiceEventPerformer1"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEvent(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT,
						ConsolPlugin.INSTANCE.getString("TransferSummaryDocumentationOfServiceEvent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

} // TransferSummaryOperations
