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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Use None Known</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationUseNoneKnownOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationUseNoneKnownOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownTextReference(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownTextReference(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownTextReference(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownTextReference(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownTextReference(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownTextReference"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownTextReferenceValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownTextReferenceValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownTextReferenceValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownTextReferenceValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownTextReferenceValue(
			MedicationUseNoneKnown medicationUseNoneKnown, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownTextReferenceValue"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownReferenceValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownReferenceValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownReferenceValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownReferenceValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownReferenceValue(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownReferenceValue"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownTemplateId(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownTemplateId(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.29')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownTemplateId(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownTemplateId(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownTemplateId(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownTemplateId"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownClassCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownClassCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownClassCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownClassCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownClassCode(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownClassCode"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownMoodCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownMoodCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownMoodCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownMoodCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownMoodCode(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownMoodCode"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownId(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownId(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownId(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownId(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownId(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_ID,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownId"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownCodeP(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownCodeP(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownCodeP(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownCodeP(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownCodeP(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_CODE_P,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownCodeP"),
					new Object[] { medicationUseNoneKnown }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnownCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnownCodeP", passToken);
				}
				passToken.add(medicationUseNoneKnown);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownCode(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnownCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationUseNoneKnown)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownCode"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownEffectiveTime(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownEffectiveTime(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownEffectiveTime(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownEffectiveTime(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownEffectiveTime(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownEffectiveTime"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownStatusCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownStatusCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownStatusCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownStatusCode(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownStatusCode(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownStatusCode"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownStatusCodeP(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownStatusCodeP(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownStatusCodeP(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownStatusCodeP(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownStatusCodeP(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownStatusCodeP"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownText(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownText(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownText(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownText(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownText(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_TEXT,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownText"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationUseNoneKnownValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_USE_NONE_KNOWN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.code = '182904002' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationUseNoneKnownValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationUseNoneKnownValue(MedicationUseNoneKnown, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_USE_NONE_KNOWN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationUseNoneKnown The receiving '<em><b>Medication Use None Known</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationUseNoneKnownValue(MedicationUseNoneKnown medicationUseNoneKnown,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_USE_NONE_KNOWN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_USE_NONE_KNOWN);
			try {
				VALIDATE_MEDICATION_USE_NONE_KNOWN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_USE_NONE_KNOWN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_USE_NONE_KNOWN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationUseNoneKnown)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_USE_NONE_KNOWN__MEDICATION_USE_NONE_KNOWN_VALUE,
					ConsolPlugin.INSTANCE.getString("MedicationUseNoneKnownValue"),
					new Object[] { medicationUseNoneKnown }));
			}

			return false;
		}
		return true;
	}

} // MedicationUseNoneKnownOperations
