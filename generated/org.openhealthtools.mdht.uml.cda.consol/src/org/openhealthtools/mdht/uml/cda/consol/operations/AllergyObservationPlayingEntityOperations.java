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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.PlayingEntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation Playing Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyObservationPlayingEntityOperations extends PlayingEntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservationPlayingEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationPlayingEntityCodeOriginalText(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityCodeOriginalText(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationPlayingEntityCodeOriginalText(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityCodeOriginalText(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.originalText.oclIsUndefined()
	 * @param allergyObservationPlayingEntity The receiving '<em><b>Allergy Observation Playing Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationPlayingEntityCodeOriginalText(
			AllergyObservationPlayingEntity allergyObservationPlayingEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION_PLAYING_ENTITY);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservationPlayingEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION_PLAYING_ENTITY__ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT,
					ConsolPlugin.INSTANCE.getString("AllergyObservationPlayingEntityCodeOriginalText"),
					new Object[] { allergyObservationPlayingEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationPlayingEntityOriginalTextReference(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityOriginalTextReference(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.oclIsUndefined() implies not self.code.originalText.reference.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationPlayingEntityOriginalTextReference(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityOriginalTextReference(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.originalText.oclIsUndefined() implies not self.code.originalText.reference.value.oclIsUndefined()
	 * @param allergyObservationPlayingEntity The receiving '<em><b>Allergy Observation Playing Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationPlayingEntityOriginalTextReference(
			AllergyObservationPlayingEntity allergyObservationPlayingEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION_PLAYING_ENTITY);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservationPlayingEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION_PLAYING_ENTITY__ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationPlayingEntityOriginalTextReference"),
					new Object[] { allergyObservationPlayingEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationPlayingEntityOriginalTextReferenceValue(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityOriginalTextReferenceValue(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationPlayingEntityOriginalTextReferenceValue(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityOriginalTextReferenceValue(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()
	 * @param allergyObservationPlayingEntity The receiving '<em><b>Allergy Observation Playing Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationPlayingEntityOriginalTextReferenceValue(
			AllergyObservationPlayingEntity allergyObservationPlayingEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION_PLAYING_ENTITY);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservationPlayingEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION_PLAYING_ENTITY__ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationPlayingEntityOriginalTextReferenceValue"),
					new Object[] { allergyObservationPlayingEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationPlayingEntityCodeTranslation(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityCodeTranslation(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.translation->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationPlayingEntityCodeTranslation(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityCodeTranslation(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.translation->isEmpty()
	 * @param allergyObservationPlayingEntity The receiving '<em><b>Allergy Observation Playing Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationPlayingEntityCodeTranslation(
			AllergyObservationPlayingEntity allergyObservationPlayingEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION_PLAYING_ENTITY);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservationPlayingEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION_PLAYING_ENTITY__ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION,
					ConsolPlugin.INSTANCE.getString("AllergyObservationPlayingEntityCodeTranslation"),
					new Object[] { allergyObservationPlayingEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationPlayingEntityClassCode(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityClassCode(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationPlayingEntityClassCode(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityClassCode(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param allergyObservationPlayingEntity The receiving '<em><b>Allergy Observation Playing Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationPlayingEntityClassCode(
			AllergyObservationPlayingEntity allergyObservationPlayingEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION_PLAYING_ENTITY);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservationPlayingEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION_PLAYING_ENTITY__ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationPlayingEntityClassCode"),
					new Object[] { allergyObservationPlayingEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationPlayingEntityCode(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityCode(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationPlayingEntityCode(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationPlayingEntityCode(AllergyObservationPlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param allergyObservationPlayingEntity The receiving '<em><b>Allergy Observation Playing Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationPlayingEntityCode(
			AllergyObservationPlayingEntity allergyObservationPlayingEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION_PLAYING_ENTITY);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservationPlayingEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION_PLAYING_ENTITY__ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationPlayingEntityCode"),
					new Object[] { allergyObservationPlayingEntity }));
			}
			return false;
		}
		return true;
	}

} // AllergyObservationPlayingEntityOperations
