/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityObservationOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProcedureActivityObservationOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationCodeCodeSystems(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationCodeCodeSystems(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem = '2.16.840.1.113883.6.1' xor self.code.codeSystem = '2.16.840.1.113883.6.96' xor self.code.codeSystem = '2.16.840.1.113883.6.12' xor self.code.codeSystem = '2.16.840.1.113883.6.4'";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationCodeCodeSystems(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationCodeCodeSystems(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationCodeCodeSystems(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationCodeCodeSystems"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationCodeOriginalText(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Original Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationCodeOriginalText(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not code.oclIsUndefined() implies not code.originalText.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationCodeOriginalText(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Original Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationCodeOriginalText(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationCodeOriginalText(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationCodeOriginalText"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationOriginalTextReference(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationOriginalTextReference(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.oclIsUndefined() implies self.code.originalText->one(reference->size() = 1)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationOriginalTextReference(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationOriginalTextReference(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationOriginalTextReference(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationOriginalTextReference"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationOriginalTextReferenceValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationOriginalTextReferenceValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.originalText.reference->size() = 1 implies self.code.originalText.reference.value->size() = 1";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationOriginalTextReferenceValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationOriginalTextReferenceValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationOriginalTextReferenceValue(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationOriginalTextReferenceValue"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationReferenceValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Reference Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationReferenceValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationReferenceValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Reference Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationReferenceValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationReferenceValue(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationReferenceValue"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEncounterInversion(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Encounter Inversion</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEncounterInversion(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.encounter->size() > 0)->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEncounterInversion(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Encounter Inversion</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEncounterInversion(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationEncounterInversion(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEncounterInversion"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationServiceDeliveryLocationTypeCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location Type Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationServiceDeliveryLocationTypeCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(par : cda::Participant2 | par.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))->forAll(p : cda::Participant2 | p.typeCode=vocab::ParticipationType::LOC)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationServiceDeliveryLocationTypeCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location Type Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationServiceDeliveryLocationTypeCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationServiceDeliveryLocationTypeCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationServiceDeliveryLocationTypeCode"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationInstructionsInversion(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationInstructionsInversion(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instructions))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationInstructionsInversion(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationInstructionsInversion(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationInstructionsInversion(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationInstructionsInversion"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.13')";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationTemplateId(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationTemplateId"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationClassCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationClassCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationClassCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationClassCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationClassCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationClassCode"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationMoodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationMoodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_ActMoodDocumentObservation) and "
			+ "let value : vocab::x_ActMoodDocumentObservation = self.moodCode.oclAsType(vocab::x_ActMoodDocumentObservation) in "
			+ "value = vocab::x_ActMoodDocumentObservation::EVN or value = vocab::x_ActMoodDocumentObservation::INT";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationMoodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationMoodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationMoodCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationMoodCode"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationId(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationId"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationCode"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationStatusCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationStatusCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "
			+ "value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled')";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationStatusCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationStatusCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationStatusCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationStatusCode"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationValue(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationValue(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationValue"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEffectiveTime(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEffectiveTime(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEffectiveTime(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEffectiveTime(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationEffectiveTime(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEffectiveTime"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationPriorityCodeP(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationPriorityCodeP(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationPriorityCodeP(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationPriorityCodeP(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationPriorityCodeP(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationPriorityCodeP"),
					new Object[] { procedureActivityObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationPriorityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationPriorityCodeP", passToken);
				}
				passToken.add(procedureActivityObservation);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationPriorityCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationPriorityCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined() and self.priorityCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.priorityCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.7' and (value.code = 'A' or value.code = 'CR' or value.code = 'CS' or value.code = 'CSP' or value.code = 'CSR' or value.code = 'EL' or value.code = 'EM' or value.code = 'P' or value.code = 'PRN' or value.code = 'R' or value.code = 'RR' or value.code = 'S' or value.code = 'T' or value.code = 'UD' or value.code = 'UR'))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationPriorityCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationPriorityCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationPriorityCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationPriorityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(procedureActivityObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationPriorityCode"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationMethodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Method Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationMethodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationMethodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Method Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationMethodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationMethodCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationMethodCode"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationTargetSiteCodeP(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationTargetSiteCodeP(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationTargetSiteCodeP(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationTargetSiteCodeP(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationTargetSiteCodeP(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationTargetSiteCodeP"),
					new Object[] { procedureActivityObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationTargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationTargetSiteCodeP",
						passToken);
				}
				passToken.add(procedureActivityObservation);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationTargetSiteCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationTargetSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(procedureActivityObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationTargetSiteCode"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationPerformer(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationPerformer(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationPerformer(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationPerformer(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationPerformer(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationPerformer"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationServiceDeliveryLocation(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationServiceDeliveryLocation(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationServiceDeliveryLocation(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationServiceDeliveryLocation(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationServiceDeliveryLocation(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationServiceDeliveryLocation"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationInstructions(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationInstructions(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationInstructions(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationInstructions(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationInstructions(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationInstructions"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationIndication(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationIndication(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationIndication(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationIndication(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationIndication(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_INDICATION,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationIndication"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationMedicationActivity(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationMedicationActivity(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationMedicationActivity(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationMedicationActivity(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationMedicationActivity(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationMedicationActivity"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEntryRelationship(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationship(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter))->notEmpty()";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEntryRelationship(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationship(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityObservationEntryRelationship(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEntryRelationship"),
					new Object[] { procedureActivityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Id</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() = 1))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() = 1))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Represented Organization</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Represented Organization</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationProcedureObservationPerformerAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter)).encounter->excluding(null)->reject(classCode=vocab::ActClass::ENC)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter)).encounter->excluding(null)->reject(moodCode=vocab::x_DocumentEncounterMood::EVN)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter)).encounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEntryRelationshipInversionInd(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Inversion Ind</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipInversionInd(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter))->reject(not inversionInd.oclIsUndefined() and inversionInd=true)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEntryRelationshipInversionInd(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Inversion Ind</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipInversionInd(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationEntryRelationshipInversionInd(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEntryRelationshipInversionInd"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEntryRelationshipTypeCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Type Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipTypeCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter))->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEntryRelationshipTypeCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Type Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipTypeCode(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationEntryRelationshipTypeCode(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEntryRelationshipTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter))->reject(encounter->one(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter)))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(ProcedureActivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityObservation The receiving '<em><b>Procedure Activity Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(
			ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureActivityObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationEntryRelationshipProcedureObservationEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getServiceDeliveryLocations(ProcedureActivityObservation) <em>Get Service Delivery Locations</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getServiceDeliveryLocations(ProcedureActivityObservation)
	* @generated
	* @ordered
	*/
	protected static final String GET_SERVICE_DELIVERY_LOCATIONS__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ServiceDeliveryLocation)).oclAsType(consol::ServiceDeliveryLocation)";

	/**
	* The cached OCL query for the '{@link #getServiceDeliveryLocations(ProcedureActivityObservation) <em>Get Service Delivery Locations</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getServiceDeliveryLocations(ProcedureActivityObservation)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static EList<ServiceDeliveryLocation> getServiceDeliveryLocations(
			ProcedureActivityObservation procedureActivityObservation) {
		if (GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION.getEAllOperations().get(93));
			try {
				GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY = helper.createQuery(GET_SERVICE_DELIVERY_LOCATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ServiceDeliveryLocation> result = (Collection<ServiceDeliveryLocation>) query.evaluate(procedureActivityObservation);
		return new BasicEList.UnmodifiableEList<ServiceDeliveryLocation>(result.size(), result.toArray());
	}

	/**
	* The cached OCL expression body for the '{@link #getInstructions(ProcedureActivityObservation) <em>Get Instructions</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInstructions(ProcedureActivityObservation)
	* @generated
	* @ordered
	*/
	protected static final String GET_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->any(true).oclAsType(consol::Instructions)";

	/**
	* The cached OCL query for the '{@link #getInstructions(ProcedureActivityObservation) <em>Get Instructions</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInstructions(ProcedureActivityObservation)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static Instructions getInstructions(ProcedureActivityObservation procedureActivityObservation) {
		if (GET_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION.getEAllOperations().get(94));
			try {
				GET_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS__EOCL_QRY);
		return (Instructions) query.evaluate(procedureActivityObservation);
	}

	/**
	* The cached OCL expression body for the '{@link #getIndications(ProcedureActivityObservation) <em>Get Indications</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getIndications(ProcedureActivityObservation)
	* @generated
	* @ordered
	*/
	protected static final String GET_INDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)";

	/**
	* The cached OCL query for the '{@link #getIndications(ProcedureActivityObservation) <em>Get Indications</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getIndications(ProcedureActivityObservation)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_INDICATIONS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static EList<Indication> getIndications(ProcedureActivityObservation procedureActivityObservation) {
		if (GET_INDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION.getEAllOperations().get(95));
			try {
				GET_INDICATIONS__EOCL_QRY = helper.createQuery(GET_INDICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication> result = (Collection<Indication>) query.evaluate(procedureActivityObservation);
		return new BasicEList.UnmodifiableEList<Indication>(result.size(), result.toArray());
	}

	/**
	* The cached OCL expression body for the '{@link #getMedicationActivities(ProcedureActivityObservation) <em>Get Medication Activities</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationActivities(ProcedureActivityObservation)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity)).oclAsType(consol::MedicationActivity)";

	/**
	* The cached OCL query for the '{@link #getMedicationActivities(ProcedureActivityObservation) <em>Get Medication Activities</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationActivities(ProcedureActivityObservation)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITIES__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static EList<MedicationActivity> getMedicationActivities(
			ProcedureActivityObservation procedureActivityObservation) {
		if (GET_MEDICATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION.getEAllOperations().get(96));
			try {
				GET_MEDICATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity> result = (Collection<MedicationActivity>) query.evaluate(procedureActivityObservation);
		return new BasicEList.UnmodifiableEList<MedicationActivity>(result.size(), result.toArray());
	}

} // ProcedureActivityObservationOperations
