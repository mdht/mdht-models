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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationValueOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Code Terminology Value Set Group SRFI</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getReactionObservations() <em>Get Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getSeverityObservation() <em>Get Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getAllergyStatusObservation() <em>Get Allergy Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationValueOriginalText(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValueOriginalText(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value.oclAsType(datatypes::CD).originalText->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationValueOriginalText(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValueOriginalText(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationValueOriginalText(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationValueOriginalText"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationOriginalTextReference(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationOriginalTextReference(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value.oclAsType(datatypes::CD).originalText->size() = 1 implies self.value.oclAsType(datatypes::CD).originalText->one(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationOriginalTextReference(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationOriginalTextReference(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationOriginalTextReference(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationOriginalTextReference"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationOriginalTextReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationOriginalTextReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value.oclAsType(datatypes::CD).originalText.reference->size() = 1 implies self.value.oclAsType(datatypes::CD).originalText.reference.value->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationOriginalTextReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationOriginalTextReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationOriginalTextReferenceValue(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationOriginalTextReferenceValue"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationReferenceValue(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationReferenceValue"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyStatusInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyStatusInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::AllergyStatusObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyStatusInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyStatusInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationAllergyStatusInversionIndicator(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationAllergyStatusInversionIndicator"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationReactionInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationReactionInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationReactionInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationReactionInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationReactionInversionIndicator(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationReactionInversionIndicator"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationSeverityInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationSeverityInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationSeverityInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationSeverityInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationSeverityInversionIndicator(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationSeverityInversionIndicator"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationTemplateId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationTemplateId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationTemplateId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationTemplateId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationTemplateId(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationTemplateId"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationClassCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationClassCode"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationMoodCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationMoodCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationMoodCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationMoodCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationMoodCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationMoodCode"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationId(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationId"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationCodeP(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCodeP(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationCodeP(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCodeP(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationCodeP(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationCodeP"),
					new Object[] { allergyObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationCodeP", passToken);
				}
				passToken.add(allergyObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(allergyObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationCode"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationStatusCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationStatusCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationStatusCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationStatusCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationStatusCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationStatusCode"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationEffectiveTime(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationEffectiveTime(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationEffectiveTime(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationEffectiveTime(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationEffectiveTime(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationEffectiveTime"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '420134006' or value.code = '418038007' or value.code = '419511003' or value.code = '418471000' or value.code = '419199007' or value.code = '416098002' or value.code = '414285001' or value.code = '59037007' or value.code = '235719002' or value.code = '232347008' or value.code = '426232007')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationValue(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationValue"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationReactionObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationReactionObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationReactionObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationReactionObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationReactionObservation(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_REACTION_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationReactionObservation"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationSeverityObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationSeverityObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationSeverityObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationSeverityObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationSeverityObservation(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_SEVERITY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationSeverityObservation"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyStatusObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyStatusObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyStatusObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyStatusObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationAllergyStatusObservation(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationAllergyStatusObservation"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipant(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipant(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipant(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipant(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationParticipant(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipant"),
					new Object[] { allergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((originalText.oclIsUndefined() or originalText.isNullFlavorUndefined()) implies (not originalText.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntityCETranslation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.value.oclIsUndefined() implies not getSection().text.getText(code.originalText.reference.value.substring(2, code.originalText.reference.value.size())).oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.oclIsUndefined() implies code.originalText.reference.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined() implies not code.originalText.reference.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Code Terminology Value Set Group SRFI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(( code.oclIsUndefined() or code.isNullFlavorUndefined() ) implies ( not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and ( ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = '2.16.840.1.113883.3.26.1.5' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = '2.16.840.1.113883.6.88' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = '2.16.840.1.113883.4.9' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined() ) ) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Code Terminology Value Set Group SRFI</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntityCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntityCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCode(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRoleClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRoleClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassRoot) and "
			+ "let value : vocab::RoleClassRoot = classCode.oclAsType(vocab::RoleClassRoot) in "
			+ "value = vocab::RoleClassRoot::MANU)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRoleClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRoleClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRoleClassCode(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRoleClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntity(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntity(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRolePlayingEntity(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRolePlayingEntity(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRolePlayingEntity(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRolePlayingEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantTypeCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantTypeCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::ParticipationType) and "
			+ "let value : vocab::ParticipationType = typeCode.oclAsType(vocab::ParticipationType) in "
			+ "value = vocab::ParticipationType::CSM)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantTypeCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantTypeCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantTypeCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantParticipantRole(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRole(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantParticipantRole(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantParticipantRole(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationParticipantParticipantRole(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantParticipantRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservations(AllergyObservation) <em>Get Reaction Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservations(AllergyObservation) <em>Get Reaction Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ReactionObservation> getReactionObservations(AllergyObservation allergyObservation) {
		if (GET_REACTION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_OBSERVATION,
				ConsolPackage.Literals.ALLERGY_OBSERVATION.getEAllOperations().get(83));
			try {
				GET_REACTION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation> result = (Collection<ReactionObservation>) query.evaluate(allergyObservation);
		return new BasicEList.UnmodifiableEList<ReactionObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverityObservation(AllergyObservation) <em>Get Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityObservation(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->any(true).oclAsType(consol::SeverityObservation)";

	/**
	 * The cached OCL query for the '{@link #getSeverityObservation(AllergyObservation) <em>Get Severity Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityObservation(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SeverityObservation getSeverityObservation(AllergyObservation allergyObservation) {
		if (GET_SEVERITY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_OBSERVATION,
				ConsolPackage.Literals.ALLERGY_OBSERVATION.getEAllOperations().get(84));
			try {
				GET_SEVERITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SEVERITY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY_OBSERVATION__EOCL_QRY);
		return (SeverityObservation) query.evaluate(allergyObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergyStatusObservation(AllergyObservation) <em>Get Allergy Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyStatusObservation(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGY_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation))->asSequence()->any(true).oclAsType(consol::AllergyStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getAllergyStatusObservation(AllergyObservation) <em>Get Allergy Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyStatusObservation(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergyStatusObservation getAllergyStatusObservation(AllergyObservation allergyObservation) {
		if (GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_OBSERVATION,
				ConsolPackage.Literals.ALLERGY_OBSERVATION.getEAllOperations().get(85));
			try {
				GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_ALLERGY_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY);
		return (AllergyStatusObservation) query.evaluate(allergyObservation);
	}

} // AllergyObservationOperations
