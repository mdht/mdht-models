/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Admission Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2CETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2CETranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#getConsolHospitalAdmissionDiagnosis2() <em>Get Consol Hospital Admission Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdmissionDiagnosisSection2Operations extends HospitalAdmissionDiagnosisSectionOperations {
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
	protected AdmissionDiagnosisSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdmissionDiagnosisSection2CETranslation(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionDiagnosisSection2CETranslation(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.code = '42347-5' and value.codeSystem = '2.16.840.1.113883.6.1')) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdmissionDiagnosisSection2CETranslation(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionDiagnosisSection2CETranslation(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionDiagnosisSection2 The receiving '<em><b>Admission Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdmissionDiagnosisSection2CETranslation(
			AdmissionDiagnosisSection2 admissionDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			admissionDiagnosisSection2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADMISSION_DIAGNOSIS_SECTION2__ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION,
							ConsolPlugin.INSTANCE.getString(
								"AdmissionDiagnosisSection2AdmissionDiagnosisSection2CETranslation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdmissionDiagnosisSection2CETranslationP(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionDiagnosisSection2CETranslationP(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() =  1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdmissionDiagnosisSection2CETranslationP(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionDiagnosisSection2CETranslationP(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionDiagnosisSection2 The receiving '<em><b>Admission Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdmissionDiagnosisSection2CETranslationP(
			AdmissionDiagnosisSection2 admissionDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			admissionDiagnosisSection2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADMISSION_DIAGNOSIS_SECTION2__ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P,
							ConsolPlugin.INSTANCE.getString(
								"AdmissionDiagnosisSection2AdmissionDiagnosisSection2CETranslationP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolHospitalAdmissionDiagnosis2(AdmissionDiagnosisSection2) <em>Get Consol Hospital Admission Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolHospitalAdmissionDiagnosis2(AdmissionDiagnosisSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS2__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getConsolHospitalAdmissionDiagnosis2(AdmissionDiagnosisSection2) <em>Get Consol Hospital Admission Diagnosis2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolHospitalAdmissionDiagnosis2(AdmissionDiagnosisSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HospitalAdmissionDiagnosis2 getConsolHospitalAdmissionDiagnosis2(
			AdmissionDiagnosisSection2 admissionDiagnosisSection2) {

		if (GET_CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2,
				ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2.getEAllOperations().get(64));
			try {
				GET_CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS2__EOCL_QRY = helper.createQuery(
					GET_CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS2__EOCL_QRY);
		return (HospitalAdmissionDiagnosis2) query.evaluate(admissionDiagnosisSection2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisSectionTemplateId(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionTemplateId(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.43' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisSectionTemplateId(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionTemplateId(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionDiagnosisSection2 The receiving '<em><b>Admission Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisSectionTemplateId(
			AdmissionDiagnosisSection2 admissionDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADMISSION_DIAGNOSIS_SECTION2__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"AdmissionDiagnosisSection2HospitalAdmissionDiagnosisSectionTemplateId"),
						new Object[] { admissionDiagnosisSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisSectionCodeP(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionCodeP(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisSectionCodeP(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionCodeP(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionDiagnosisSection2 The receiving '<em><b>Admission Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisSectionCodeP(
			AdmissionDiagnosisSection2 admissionDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADMISSION_DIAGNOSIS_SECTION2__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AdmissionDiagnosisSection2HospitalAdmissionDiagnosisSectionCodeP"),
						new Object[] { admissionDiagnosisSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSectionCodeP", passToken);
				}
				passToken.add(admissionDiagnosisSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisSectionCode(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionCode(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '46241-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisSectionCode(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionCode(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionDiagnosisSection2 The receiving '<em><b>Admission Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisSectionCode(
			AdmissionDiagnosisSection2 admissionDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(admissionDiagnosisSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADMISSION_DIAGNOSIS_SECTION2__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AdmissionDiagnosisSection2HospitalAdmissionDiagnosisSectionCode"),
						new Object[] { admissionDiagnosisSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(AdmissionDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionDiagnosisSection2 The receiving '<em><b>Admission Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			AdmissionDiagnosisSection2 admissionDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADMISSION_DIAGNOSIS_SECTION2__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS,
						ConsolPlugin.INSTANCE.getString(
							"AdmissionDiagnosisSection2HospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis"),
						new Object[] { admissionDiagnosisSection2 }));
			}

			return false;
		}
		return true;
	}

} // AdmissionDiagnosisSection2Operations
