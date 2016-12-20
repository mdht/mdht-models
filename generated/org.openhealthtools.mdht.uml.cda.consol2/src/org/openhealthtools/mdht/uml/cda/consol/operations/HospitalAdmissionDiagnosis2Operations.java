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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionDiagnosis2Operations extends HospitalAdmissionDiagnosisOperations {
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
	protected HospitalAdmissionDiagnosis2Operations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis2 The receiving '<em><b>Hospital Admission Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisCodeP(
			HospitalAdmissionDiagnosis2 hospitalAdmissionDiagnosis2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalAdmissionDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS2__HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P,
						ConsolPlugin.INSTANCE.getString("HospitalAdmissionDiagnosis2HospitalAdmissionDiagnosisCodeP"),
						new Object[] { hospitalAdmissionDiagnosis2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisCodeP", passToken);
				}
				passToken.add(hospitalAdmissionDiagnosis2);
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation2> getConsolProblemObservation2s(
			HospitalAdmissionDiagnosis2 hospitalAdmissionDiagnosis2) {

		if (GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS2,
				ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS2.getEAllOperations().get(58));
			try {
				GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation2> result = (Collection<ProblemObservation2>) query.evaluate(
			hospitalAdmissionDiagnosis2);
		return new BasicEList.UnmodifiableEList<ProblemObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisCodeP(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisCodeP(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisCodeP(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisCodeP(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #getConsolProblemObservation2s(HospitalAdmissionDiagnosis2) <em>Get Consol Problem Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(HospitalAdmissionDiagnosis2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProblemObservation2s(HospitalAdmissionDiagnosis2) <em>Get Consol Problem Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(HospitalAdmissionDiagnosis2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisTemplateId(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisTemplateId(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.34' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisTemplateId(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisTemplateId(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis2 The receiving '<em><b>Hospital Admission Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisTemplateId(
			HospitalAdmissionDiagnosis2 hospitalAdmissionDiagnosis2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalAdmissionDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS2__HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"HospitalAdmissionDiagnosis2HospitalAdmissionDiagnosisTemplateId"),
						new Object[] { hospitalAdmissionDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '46241-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis2 The receiving '<em><b>Hospital Admission Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisCode(
			HospitalAdmissionDiagnosis2 hospitalAdmissionDiagnosis2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hospitalAdmissionDiagnosis2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalAdmissionDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS2__HOSPITAL_ADMISSION_DIAGNOSIS_CODE,
						ConsolPlugin.INSTANCE.getString("HospitalAdmissionDiagnosis2HospitalAdmissionDiagnosisCode"),
						new Object[] { hospitalAdmissionDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisProblemObservation(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisProblemObservation(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisProblemObservation(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisProblemObservation(HospitalAdmissionDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis2 The receiving '<em><b>Hospital Admission Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisProblemObservation(
			HospitalAdmissionDiagnosis2 hospitalAdmissionDiagnosis2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS2);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalAdmissionDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS2__HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"HospitalAdmissionDiagnosis2HospitalAdmissionDiagnosisProblemObservation"),
						new Object[] { hospitalAdmissionDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

} // HospitalAdmissionDiagnosis2Operations
