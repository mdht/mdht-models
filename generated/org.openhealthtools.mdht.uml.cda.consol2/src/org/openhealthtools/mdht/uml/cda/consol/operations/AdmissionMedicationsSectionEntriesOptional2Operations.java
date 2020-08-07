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
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Admission Medications Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#getConsolAdmissionMedication2s() <em>Get Consol Admission Medication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdmissionMedicationsSectionEntriesOptional2Operations
		extends HospitalAdmissionMedicationsSectionEntriesOptionalOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmissionMedicationsSectionEntriesOptional2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolAdmissionMedication2s(AdmissionMedicationsSectionEntriesOptional2) <em>Get Consol Admission Medication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAdmissionMedication2s(AdmissionMedicationsSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ADMISSION_MEDICATION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AdmissionMedication2)).oclAsType(consol::AdmissionMedication2)";

	/**
	 * The cached OCL query for the '{@link #getConsolAdmissionMedication2s(AdmissionMedicationsSectionEntriesOptional2) <em>Get Consol Admission Medication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAdmissionMedication2s(AdmissionMedicationsSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ADMISSION_MEDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AdmissionMedication2> getConsolAdmissionMedication2s(
			AdmissionMedicationsSectionEntriesOptional2 admissionMedicationsSectionEntriesOptional2) {

		if (GET_CONSOL_ADMISSION_MEDICATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(62));
			try {
				GET_CONSOL_ADMISSION_MEDICATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_ADMISSION_MEDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_ADMISSION_MEDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdmissionMedication2> result = (Collection<AdmissionMedication2>) query.evaluate(
			admissionMedicationsSectionEntriesOptional2);
		return new BasicEList.UnmodifiableEList<AdmissionMedication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.44' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionMedicationsSectionEntriesOptional2 The receiving '<em><b>Admission Medications Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			AdmissionMedicationsSectionEntriesOptional2 admissionMedicationsSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"AdmissionMedicationsSectionEntriesOptional2HospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
			"ERROR");

		if (VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionMedicationsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"AdmissionMedicationsSectionEntriesOptional2HospitalAdmissionMedicationsSectionEntriesOptionalTemplateId"),
						new Object[] { admissionMedicationsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionMedicationsSectionEntriesOptional2 The receiving '<em><b>Admission Medications Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(
			AdmissionMedicationsSectionEntriesOptional2 admissionMedicationsSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"AdmissionMedicationsSectionEntriesOptional2HospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
			"ERROR");

		if (VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionMedicationsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AdmissionMedicationsSectionEntriesOptional2HospitalAdmissionMedicationsSectionEntriesOptionalCodeP"),
						new Object[] { admissionMedicationsSectionEntriesOptional2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
						passToken);
				}
				passToken.add(admissionMedicationsSectionEntriesOptional2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '42346-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionMedicationsSectionEntriesOptional2 The receiving '<em><b>Admission Medications Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(
			AdmissionMedicationsSectionEntriesOptional2 admissionMedicationsSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(admissionMedicationsSectionEntriesOptional2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(
			context,
			"AdmissionMedicationsSectionEntriesOptional2HospitalAdmissionMedicationsSectionEntriesOptionalCode",
			"ERROR");

		if (VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionMedicationsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AdmissionMedicationsSectionEntriesOptional2HospitalAdmissionMedicationsSectionEntriesOptionalCode"),
						new Object[] { admissionMedicationsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Admission Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Admission Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(AdmissionMedicationsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionMedicationsSectionEntriesOptional2 The receiving '<em><b>Admission Medications Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			AdmissionMedicationsSectionEntriesOptional2 admissionMedicationsSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"AdmissionMedicationsSectionEntriesOptional2HospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
			"WARNING");

		if (VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionMedicationsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION,
						ConsolPlugin.INSTANCE.getString(
							"AdmissionMedicationsSectionEntriesOptional2HospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication"),
						new Object[] { admissionMedicationsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

} // AdmissionMedicationsSectionEntriesOptional2Operations
