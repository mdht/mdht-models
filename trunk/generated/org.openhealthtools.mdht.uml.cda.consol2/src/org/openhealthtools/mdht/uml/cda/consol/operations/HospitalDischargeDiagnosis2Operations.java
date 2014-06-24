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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2;

import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisProblemObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Problem Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeDiagnosis2Operations extends HospitalDischargeDiagnosisOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeDiagnosis2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisCodeP(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisCodeP(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisCodeP(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisCodeP(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeDiagnosis2 The receiving '<em><b>Hospital Discharge Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisCodeP(
			HospitalDischargeDiagnosis2 hospitalDischargeDiagnosis2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS2__HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeDiagnosisCodeP"),
					new Object[] { hospitalDischargeDiagnosis2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisCodeP", passToken);
				}
				passToken.add(hospitalDischargeDiagnosis2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisProblemObservation2(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Problem Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisProblemObservation2(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisProblemObservation2(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Problem Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisProblemObservation2(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeDiagnosis2 The receiving '<em><b>Hospital Discharge Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisProblemObservation2(
			HospitalDischargeDiagnosis2 hospitalDischargeDiagnosis2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS2__HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeDiagnosisProblemObservation2"),
					new Object[] { hospitalDischargeDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolProblemObservation2s(HospitalDischargeDiagnosis2) <em>Get Consol Problem Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(HospitalDischargeDiagnosis2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProblemObservation2s(HospitalDischargeDiagnosis2) <em>Get Consol Problem Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(HospitalDischargeDiagnosis2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation2> getConsolProblemObservation2s(
			HospitalDischargeDiagnosis2 hospitalDischargeDiagnosis2) {
		if (GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS2,
				ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS2.getEAllOperations().get(59));
			try {
				GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation2> result = (Collection<ProblemObservation2>) query.evaluate(hospitalDischargeDiagnosis2);
		return new BasicEList.UnmodifiableEList<ProblemObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisTemplateId(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisTemplateId(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.33.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisTemplateId(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisTemplateId(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeDiagnosis2 The receiving '<em><b>Hospital Discharge Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisTemplateId(
			HospitalDischargeDiagnosis2 hospitalDischargeDiagnosis2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS2__HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeDiagnosisTemplateId"),
					new Object[] { hospitalDischargeDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisCode(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisCode(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '11535-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisCode(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisCode(HospitalDischargeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeDiagnosis2 The receiving '<em><b>Hospital Discharge Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisCode(
			HospitalDischargeDiagnosis2 hospitalDischargeDiagnosis2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hospitalDischargeDiagnosis2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS2__HOSPITAL_DISCHARGE_DIAGNOSIS_CODE,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeDiagnosisCode"),
					new Object[] { hospitalDischargeDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

} // HospitalDischargeDiagnosis2Operations
