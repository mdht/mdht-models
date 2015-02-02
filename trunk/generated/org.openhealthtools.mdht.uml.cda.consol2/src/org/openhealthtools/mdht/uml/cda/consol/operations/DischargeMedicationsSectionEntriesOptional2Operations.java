/**
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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Medications Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Discharge Medication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#getConsolDischargeMedication2s() <em>Get Consol Discharge Medication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#validateHospitalDischargeMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeMedicationsSectionEntriesOptional2Operations extends
		HospitalDischargeMedicationsSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeMedicationsSectionEntriesOptional2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Discharge Medication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::DischargeMedication2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Discharge Medication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeMedicationsSectionEntriesOptional2 The receiving '<em><b>Discharge Medications Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(
			DischargeMedicationsSectionEntriesOptional2 dischargeMedicationsSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeMedicationsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION2,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2"),
					new Object[] { dischargeMedicationsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolDischargeMedication2s(DischargeMedicationsSectionEntriesOptional2) <em>Get Consol Discharge Medication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolDischargeMedication2s(DischargeMedicationsSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_DISCHARGE_MEDICATION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DischargeMedication2)).oclAsType(consol::DischargeMedication2)";

	/**
	 * The cached OCL query for the '{@link #getConsolDischargeMedication2s(DischargeMedicationsSectionEntriesOptional2) <em>Get Consol Discharge Medication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolDischargeMedication2s(DischargeMedicationsSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_DISCHARGE_MEDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<DischargeMedication2> getConsolDischargeMedication2s(
			DischargeMedicationsSectionEntriesOptional2 dischargeMedicationsSectionEntriesOptional2) {
		if (GET_CONSOL_DISCHARGE_MEDICATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(63));
			try {
				GET_CONSOL_DISCHARGE_MEDICATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_DISCHARGE_MEDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_DISCHARGE_MEDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<DischargeMedication2> result = (Collection<DischargeMedication2>) query.evaluate(dischargeMedicationsSectionEntriesOptional2);
		return new BasicEList.UnmodifiableEList<DischargeMedication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.11' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeMedicationsSectionEntriesOptional2 The receiving '<em><b>Discharge Medications Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
			DischargeMedicationsSectionEntriesOptional2 dischargeMedicationsSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeMedicationsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeMedicationsSectionEntriesOptionalTemplateId"),
					new Object[] { dischargeMedicationsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeMedicationsSectionEntriesOptional2 The receiving '<em><b>Discharge Medications Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(
			DischargeMedicationsSectionEntriesOptional2 dischargeMedicationsSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeMedicationsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeMedicationsSectionEntriesOptionalCodeP"),
					new Object[] { dischargeMedicationsSectionEntriesOptional2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptionalCodeP",
						passToken);
				}
				passToken.add(dischargeMedicationsSectionEntriesOptional2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeMedicationsSectionEntriesOptionalCode(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeMedicationsSectionEntriesOptionalCode(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '75311-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeMedicationsSectionEntriesOptionalCode(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeMedicationsSectionEntriesOptionalCode(DischargeMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeMedicationsSectionEntriesOptional2 The receiving '<em><b>Discharge Medications Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeMedicationsSectionEntriesOptionalCode(
			DischargeMedicationsSectionEntriesOptional2 dischargeMedicationsSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(dischargeMedicationsSectionEntriesOptional2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeMedicationsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeMedicationsSectionEntriesOptionalCode"),
					new Object[] { dischargeMedicationsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

} // DischargeMedicationsSectionEntriesOptional2Operations
