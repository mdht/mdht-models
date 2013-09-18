/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pressure Ulcer Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierNameCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PressureUlcerObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressureUlcerObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationHasTextReference(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationHasTextReference(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationHasTextReference(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationHasTextReference(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationHasTextReference(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationHasTextReference"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTextReferenceValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTextReferenceValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTextReferenceValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTextReferenceValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTextReferenceValue(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTextReferenceValue"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationHasTextReferenceValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationHasTextReferenceValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationHasTextReferenceValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationHasTextReferenceValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationHasTextReferenceValue(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationHasTextReferenceValue"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationValueNullFlavor(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationValueNullFlavor(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->forAll(val | not val.isNullFlavorUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationValueNullFlavor(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationValueNullFlavor(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationValueNullFlavor(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationValueNullFlavor"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTargetSiteQualifier(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifier(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->forAll(qualifier->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTargetSiteQualifier(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifier(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTargetSiteQualifier(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTargetSiteQualifier"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTargetSiteQualifierName(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifierName(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode.qualifier->forAll(name->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTargetSiteQualifierName(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifierName(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTargetSiteQualifierName(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTargetSiteQualifierName"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTargetSiteQualifierNameCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifierNameCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode.qualifier->forAll(name->size() = 1 and name.code='272741003' and name.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTargetSiteQualifierNameCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifierNameCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTargetSiteQualifierNameCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTargetSiteQualifierNameCode"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTargetSiteQualifierValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifierValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode.qualifier->forAll(value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTargetSiteQualifierValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifierValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTargetSiteQualifierValue(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTargetSiteQualifierValue"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTargetSiteQualifierValueCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifierValueCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode.qualifier->forAll((value.isNullFlavorDefined()) or (value->size() = 1 and not value.code.oclIsUndefined() and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTargetSiteQualifierValueCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteQualifierValueCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTargetSiteQualifierValueCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTargetSiteQualifierValueCode"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTemplateId(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTemplateId(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.70')";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTemplateId(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTemplateId(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTemplateId(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTemplateId"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationClassCode(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationClassCode"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationMoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationMoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationMoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationMoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationMoodCode(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationMoodCode"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationNegationInd(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationNegationInd(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationNegationInd(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationNegationInd(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationNegationInd(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_NEGATION_IND,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationNegationInd"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationId(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationId(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationId(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationId(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationId(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationId"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationCodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationCodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationCodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationCodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationCodeP(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationCodeP"),
					new Object[] { pressureUlcerObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationCodeP", passToken);
				}
				passToken.add(pressureUlcerObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationCode(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(pressureUlcerObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationCode"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationText(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationText(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationText(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationText(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationText(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TEXT,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationText"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '421076008' or value.code = '420324007' or value.code = '421927004' or value.code = '420597008' or value.code = '421594008')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationValue(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationValue(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationValue"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationValueP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationValueP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationValueP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationValueP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationValueP(PressureUlcerObservation pressureUlcerObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_VALUE_P,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationValueP"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTargetSiteCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationTargetSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(pressureUlcerObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTargetSiteCode"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTargetSiteCodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteCodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTargetSiteCodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteCodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationTargetSiteCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '79951008' or value.code = '23747009' or value.code = '76552005' or value.code = '45980000' or value.code = '74757004' or value.code = '51027004' or value.code = '304037003' or value.code = '286591006' or value.code = '49812005' or value.code = '29850006' or value.code = '22180002')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationTargetSiteCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationTargetSiteCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationTargetSiteCodeP(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationTargetSiteCodeP"),
					new Object[] { pressureUlcerObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationTargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationTargetSiteCodeP", passToken);
				}
				passToken.add(pressureUlcerObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003')->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationEntryRelationship(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationEntryRelationship"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship2(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006')->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship2(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationEntryRelationship2(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationEntryRelationship2"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship3(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009')->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship3(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePressureUlcerObservationEntryRelationship3(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pressureUlcerObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3,
					ConsolPlugin.INSTANCE.getString("PressureUlcerObservationPressureUlcerObservationEntryRelationship3"),
					new Object[] { pressureUlcerObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003').observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship1Observation1ClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003').observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship1Observation1MoodCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003').observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship1Observation1CodeP(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship1Observation1CodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship1Observation1CodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship1Observation1CodeP",
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
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003').observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = code.oclAsType(datatypes::CD) in "
			+ "value.code = '401238003' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship1Observation1Code(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship1Observation1CodeP");
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
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship1Observation1Code"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003').observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship1Observation1Value(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship1Observation1Value"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship1TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003')->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003')->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship1TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship1TypeCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship1TypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003')->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401238003')->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship1Observation1(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship1Observation1(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship1Observation1(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship1Observation1"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006').observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship2Observation2ClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006').observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship2Observation2MoodCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006').observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship2Observation2CodeP(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship2Observation2CodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship2Observation2CodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship2Observation2CodeP",
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
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006').observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = code.oclAsType(datatypes::CD) in "
			+ "value.code = '401239006' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship2Observation2Code(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship2Observation2CodeP");
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
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship2Observation2Code"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006').observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship2Observation2Value(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship2Observation2Value"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship2TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006')->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006')->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship2TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship2TypeCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship2TypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006')->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='401239006')->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship2Observation2(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship2Observation2(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship2Observation2(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship2Observation2"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009').observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship3Observation3ClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009').observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship3Observation3MoodCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009').observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3CodeP(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship3Observation3CodeP(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship3Observation3CodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship3Observation3CodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship3Observation3CodeP",
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
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009').observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = code.oclAsType(datatypes::CD) in "
			+ "value.code = '425094009' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3Code(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship3Observation3Code(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationEntryRelationship3Observation3CodeP");
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
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship3Observation3Code"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009').observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3Value(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship3Observation3Value(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship3Observation3Value"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship3TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009')->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009')->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship3TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3TypeCode(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship3TypeCode(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship3TypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009')->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code='425094009')->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePressureUlcerObservationEntryRelationship3Observation3(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePressureUlcerObservationEntryRelationship3Observation3(PressureUlcerObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pressureUlcerObservation The receiving '<em><b>Pressure Ulcer Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePressureUlcerObservationEntryRelationship3Observation3(
			PressureUlcerObservation pressureUlcerObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(pressureUlcerObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRESSURE_ULCER_OBSERVATION__PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3,
						ConsolPlugin.INSTANCE.getString("PressureUlcerObservationEntryRelationship3Observation3"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PressureUlcerObservationOperations
