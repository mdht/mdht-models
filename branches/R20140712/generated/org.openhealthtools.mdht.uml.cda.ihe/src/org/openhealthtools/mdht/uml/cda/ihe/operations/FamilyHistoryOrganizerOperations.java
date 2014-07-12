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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerHasParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#getIHEFamilyHistoryObservations() <em>Get IHE Family History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizerOperations extends
		org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistoryOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEFamilyHistoryOrganizerHasParticipant(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.FAMILY_HISTORY_ORGANIZER__IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT,
					IHEPlugin.INSTANCE.getString("IHEFamilyHistoryOrganizerHasParticipant"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::PRS)";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.FAMILY_HISTORY_ORGANIZER__IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE,
					IHEPlugin.INSTANCE.getString("IHEFamilyHistoryOrganizerHasParticipantParticipantRole"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.code->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.FAMILY_HISTORY_ORGANIZER__IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE,
					IHEPlugin.INSTANCE.getString("IHEFamilyHistoryOrganizerHasParticipantRoleCode"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->one(pe : cda::PlayingEntity | pe.classCode = vocab::EntityClassRoot::PSN)";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.FAMILY_HISTORY_ORGANIZER__IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY,
					IHEPlugin.INSTANCE.getString("IHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.FAMILY_HISTORY_ORGANIZER__IHE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("IHEFamilyHistoryOrganizerTemplateId"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEFamilyHistoryOrganizerCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.111')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEFamilyHistoryOrganizerCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEFamilyHistoryOrganizerCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.FAMILY_HISTORY_ORGANIZER__IHE_FAMILY_HISTORY_ORGANIZER_CODE,
					IHEPlugin.INSTANCE.getString("IHEFamilyHistoryOrganizerCode"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Family History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(ihe::FamilyHistoryObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Family History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.FAMILY_HISTORY_ORGANIZER__IHE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION,
					IHEPlugin.INSTANCE.getString("IHEFamilyHistoryOrganizerFamilyHistoryObservation"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIHEFamilyHistoryObservations(FamilyHistoryOrganizer) <em>Get IHE Family History Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHEFamilyHistoryObservations(FamilyHistoryOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IHE_FAMILY_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::FamilyHistoryObservation)).oclAsType(ihe::FamilyHistoryObservation)";

	/**
	 * The cached OCL query for the '{@link #getIHEFamilyHistoryObservations(FamilyHistoryOrganizer) <em>Get IHE Family History Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHEFamilyHistoryObservations(FamilyHistoryOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IHE_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<FamilyHistoryObservation> getIHEFamilyHistoryObservations(
			FamilyHistoryOrganizer familyHistoryOrganizer) {
		if (GET_IHE_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER,
				IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER.getEAllOperations().get(75));
			try {
				GET_IHE_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_IHE_FAMILY_HISTORY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IHE_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FamilyHistoryObservation> result = (Collection<FamilyHistoryObservation>) query.evaluate(familyHistoryOrganizer);
		return new BasicEList.UnmodifiableEList<FamilyHistoryObservation>(result.size(), result.toArray());
	}

} // FamilyHistoryOrganizerOperations
