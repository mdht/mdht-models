/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

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
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Alert Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationAgentRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Agent Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationPlayingEntityRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationAgentRepresentationVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Agent Representation Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationPlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationPlayingEntityCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationAlertStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Alert Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#getAlertStatusObservation() <em>Get Alert Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#getReactionObservations() <em>Get Reaction Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlertObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlertObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationInformationSource(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationInformationSource(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationInformationSource(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationInformationSource(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationInformationSource(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_INFORMATION_SOURCE,
						 CCDPlugin.INSTANCE.getString("AlertObservationInformationSource"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationAgentRepresentation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Agent Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationAgentRepresentation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | participant.typeCode = vocab::ParticipationType::CSM )";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationAgentRepresentation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Agent Representation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationAgentRepresentation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | participant.typeCode = vocab::ParticipationType::CSM )
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationAgentRepresentation(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_AGENT_REPRESENTATION,
						 CCDPlugin.INSTANCE.getString("AlertObservationAgentRepresentation"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationPlayingEntityRequired(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationPlayingEntityRequired(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationPlayingEntityRequired(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationPlayingEntityRequired(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity->size() > 0
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationPlayingEntityRequired(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED,
						 CCDPlugin.INSTANCE.getString("AlertObservationPlayingEntityRequired"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationAgentRepresentationVocab(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Agent Representation Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationAgentRepresentationVocab(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(entity : cda::Participant2 |"+
"  entity.typeCode = 'CSM')";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationAgentRepresentationVocab(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Agent Representation Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationAgentRepresentationVocab(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(entity : cda::Participant2 |
	 *   entity.typeCode = 'CSM')
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationAgentRepresentationVocab(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB,
						 CCDPlugin.INSTANCE.getString("AlertObservationAgentRepresentationVocab"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationParticipantRoleClassCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationParticipantRoleClassCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->one(entity : cda::ParticipantRole |"+
"  entity.classCode = 'MANU')";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationParticipantRoleClassCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationParticipantRoleClassCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole->one(entity : cda::ParticipantRole |
	 *   entity.classCode = 'MANU')
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationParticipantRoleClassCode(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("AlertObservationParticipantRoleClassCode"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationPlayingEntityClassCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationPlayingEntityClassCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->one(entity : cda::PlayingEntity |"+
"  entity.classCode = vocab::EntityClassRoot::MMAT and not entity.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationPlayingEntityClassCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationPlayingEntityClassCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity->one(entity : cda::PlayingEntity |
	 *   entity.classCode = vocab::EntityClassRoot::MMAT and not entity.code.oclIsUndefined())
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationPlayingEntityClassCode(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("AlertObservationPlayingEntityClassCode"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationPlayingEntityCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationPlayingEntityCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->one(entity : cda::PlayingEntity |  not entity.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationPlayingEntityCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationPlayingEntityCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity->one(entity : cda::PlayingEntity |  not entity.code.oclIsUndefined())
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationPlayingEntityCode(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_CODE,
						 CCDPlugin.INSTANCE.getString("AlertObservationPlayingEntityCode"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationPlayingEntityCodeVocab(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Code Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationPlayingEntityCodeVocab(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->one(entity : cda::PlayingEntity | not entity.code.oclIsUndefined() and (entity.code.codeSystem='2.16.840.1.113883.6.88' xor entity.code.codeSystem='2.16.840.1.113883.6.59'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationPlayingEntityCodeVocab(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Code Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationPlayingEntityCodeVocab(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity->one(entity : cda::PlayingEntity | not entity.code.oclIsUndefined() and (entity.code.codeSystem='2.16.840.1.113883.6.88' xor entity.code.codeSystem='2.16.840.1.113883.6.59'))
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationPlayingEntityCodeVocab(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB,
						 CCDPlugin.INSTANCE.getString("AlertObservationPlayingEntityCodeVocab"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationTemplateId(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationTemplateId(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationTemplateId(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationTemplateId(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.18')
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationTemplateId(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("AlertObservationTemplateId"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationMoodCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationMoodCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationMoodCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationMoodCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationMoodCode(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("AlertObservationMoodCode"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationStatusCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationStatusCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationStatusCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationStatusCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationStatusCode(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("AlertObservationStatusCode"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationEffectiveTime(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationEffectiveTime(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationEffectiveTime(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationEffectiveTime(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationEffectiveTime(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_EFFECTIVE_TIME,
						 CCDPlugin.INSTANCE.getString("AlertObservationEffectiveTime"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationAlertStatusObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Alert Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationAlertStatusObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::AlertStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationAlertStatusObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Alert Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationAlertStatusObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::AlertStatusObservation))
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationAlertStatusObservation(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("AlertObservationAlertStatusObservation"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationReactionObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationReactionObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationReactionObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationReactionObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertObservationReactionObservation(AlertObservation alertObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_REACTION_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("AlertObservationReactionObservation"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAlertStatusObservation(AlertObservation) <em>Get Alert Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertStatusObservation(AlertObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALERT_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::AlertStatusObservation))->asSequence()->first().oclAsType(ccd::AlertStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getAlertStatusObservation(AlertObservation) <em>Get Alert Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertStatusObservation(AlertObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALERT_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::AlertStatusObservation))->asSequence()->first().oclAsType(ccd::AlertStatusObservation)
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AlertStatusObservation getAlertStatusObservation(AlertObservation alertObservation) {
		if (GET_ALERT_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.ALERT_OBSERVATION, CCDPackage.Literals.ALERT_OBSERVATION.getEAllOperations().get(63));
			try {
				GET_ALERT_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_ALERT_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALERT_STATUS_OBSERVATION__EOCL_QRY);
		return (AlertStatusObservation) query.evaluate(alertObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservations(AlertObservation) <em>Get Reaction Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations(AlertObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation)).oclAsType(ccd::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservations(AlertObservation) <em>Get Reaction Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations(AlertObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation)).oclAsType(ccd::ReactionObservation)
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ReactionObservation> getReactionObservations(AlertObservation alertObservation) {
		if (GET_REACTION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.ALERT_OBSERVATION, CCDPackage.Literals.ALERT_OBSERVATION.getEAllOperations().get(64));
			try {
				GET_REACTION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation> result = (Collection<ReactionObservation>) query.evaluate(alertObservation);
		return new BasicEList.UnmodifiableEList<ReactionObservation>(result.size(), result.toArray());
	}

} // AlertObservationOperations
