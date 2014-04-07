/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ValueOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Value Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2OriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2OriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2NegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2EDTELValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 EDTEL Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2EDReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 ED Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Allergy Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#getConsolAllergyStatusObservations() <em>Get Consol Allergy Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Playing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyObservation2Operations extends AllergyObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2ValueOriginalText(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Value Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2ValueOriginalText(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2ValueOriginalText(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Value Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2ValueOriginalText(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservation2ValueOriginalText(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AllergyObservation2ValueOriginalText",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergyObservation2, context) }),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2OriginalTextReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2OriginalTextReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2OriginalTextReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2OriginalTextReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservation2OriginalTextReference(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AllergyObservation2OriginalTextReference",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergyObservation2, context) }),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2OriginalTextReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2OriginalTextReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2OriginalTextReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2OriginalTextReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservation2OriginalTextReferenceValue(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AllergyObservation2OriginalTextReferenceValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergyObservation2, context) }),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2ReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2ReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2ReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2ReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservation2ReferenceValue(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_REFERENCE_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AllergyObservation2ReferenceValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergyObservation2, context) }),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2NegationInd(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2NegationInd(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2NegationInd(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2NegationInd(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION2_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservation2NegationInd(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION2_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION2_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION2_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_NEGATION_IND,
					ConsolPlugin.INSTANCE.getString("AllergyObservation2NegationInd"),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2Text(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2Text(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2Text(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2Text(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservation2Text(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_TEXT,
					ConsolPlugin.INSTANCE.getString("AllergyObservation2Text"), new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationValueP(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValueP(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationValueP(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValueP(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationValueP(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_VALUE_P,
					ConsolPlugin.INSTANCE.getString("AllergyObservationValueP"), new Object[] { allergyObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationValueP", passToken);
				}
				passToken.add(allergyObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2AuthorParticipation(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2AuthorParticipation(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2AuthorParticipation(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2AuthorParticipation(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservation2AuthorParticipation(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("AllergyObservation2AuthorParticipation"),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2EDTELValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 EDTEL Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2EDTELValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->excluding(null)->select(isNullFlavorUndefined()).reference->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2EDTELValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 EDTEL Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2EDTELValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION2_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservation2EDTELValue(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION2_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION2_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION2_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_EDTEL_VALUE,
						ConsolPlugin.INSTANCE.getString("AllergyObservation2EDTELValue"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2EDReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 ED Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2EDReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((reference.oclIsUndefined() or reference.isNullFlavorUndefined()) implies (not reference.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2EDReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 ED Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2EDReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION2_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservation2EDReference(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION2_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION2_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION2_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_ED_REFERENCE,
						ConsolPlugin.INSTANCE.getString("AllergyObservation2EDReference"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2IVLTSLow(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2IVLTSLow(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2IVLTSLow(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2IVLTSLow(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservation2IVLTSLow(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_IVLTS_LOW,
						ConsolPlugin.INSTANCE.getString("AllergyObservation2IVLTSLow"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2IVLTSHigh(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2IVLTSHigh(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2IVLTSHigh(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2IVLTSHigh(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservation2IVLTSHigh(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_IVLTS_HIGH,
						ConsolPlugin.INSTANCE.getString("AllergyObservation2IVLTSHigh"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Allergy Observation Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::ParticipationType) and "
			+ "let value : vocab::ParticipationType = typeCode.oclAsType(vocab::ParticipationType) in "
			+ "value = vocab::ParticipationType::CSM)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Allergy Observation Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Allergy Observation Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Allergy Observation Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE,
						ConsolPlugin.INSTANCE.getString("AllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolAllergyStatusObservations(AllergyObservation2) <em>Get Consol Allergy Status Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyStatusObservations(AllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ALLERGY_STATUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation)).oclAsType(consol::AllergyStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolAllergyStatusObservations(AllergyObservation2) <em>Get Consol Allergy Status Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyStatusObservations(AllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ALLERGY_STATUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AllergyStatusObservation> getConsolAllergyStatusObservations(
			AllergyObservation2 allergyObservation2) {
		if (GET_CONSOL_ALLERGY_STATUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_OBSERVATION2,
				ConsolPackage.Literals.ALLERGY_OBSERVATION2.getEAllOperations().get(100));
			try {
				GET_CONSOL_ALLERGY_STATUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_ALLERGY_STATUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_ALLERGY_STATUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyStatusObservation> result = (Collection<AllergyStatusObservation>) query.evaluate(allergyObservation2);
		return new BasicEList.UnmodifiableEList<AllergyStatusObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationTemplateId(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationTemplateId(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.7.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationTemplateId(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationTemplateId(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationTemplateId(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AllergyObservationTemplateId"),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationCodeP(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCodeP(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationCodeP(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCodeP(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationCodeP(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("AllergyObservationCodeP"), new Object[] { allergyObservation2 }));
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
				passToken.add(allergyObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationCode(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(allergyObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationCode"), new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '420134006' or value.code = '418038007' or value.code = '419511003' or value.code = '418471000' or value.code = '419199007' or value.code = '416098002' or value.code = '414285001' or value.code = '59037007' or value.code = '235719002')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationValue(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationValueP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(allergyObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationValue"), new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationEffectiveTime(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationEffectiveTime(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationEffectiveTime(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationEffectiveTime(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationEffectiveTime(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("AllergyObservationEffectiveTime"),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipant(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipant(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipant(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipant(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationParticipant(AllergyObservation2 allergyObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("AllergyObservationParticipant"),
					new Object[] { allergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined() implies not code.originalText.reference.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.oclIsUndefined() implies code.originalText.reference.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.value.oclIsUndefined() implies not getSection().text.getText(code.originalText.reference.value.substring(2, code.originalText.reference.value.size())).oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.translation->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassRoot) and "
			+ "let value : vocab::RoleClassRoot = classCode.oclAsType(vocab::RoleClassRoot) in "
			+ "value = vocab::RoleClassRoot::MANU)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(AllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyObservation2 The receiving '<em><b>Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(
			AllergyObservation2 allergyObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_OBSERVATION2__ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY,
						ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // AllergyObservation2Operations
