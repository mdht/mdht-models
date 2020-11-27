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
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Preoperative Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosis2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreoperativeDiagnosis2Operations extends PreoperativeDiagnosisOperations {
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
	protected PreoperativeDiagnosis2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreoperativeDiagnosis2TemplateId(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreoperativeDiagnosis2TemplateId(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREOPERATIVE_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.65' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreoperativeDiagnosis2TemplateId(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreoperativeDiagnosis2TemplateId(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREOPERATIVE_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preoperativeDiagnosis2 The receiving '<em><b>Preoperative Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreoperativeDiagnosis2TemplateId(PreoperativeDiagnosis2 preoperativeDiagnosis2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PreoperativeDiagnosis2PreoperativeDiagnosis2TemplateId", "ERROR");

		if (VALIDATE_PREOPERATIVE_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS2);
			try {
				VALIDATE_PREOPERATIVE_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PREOPERATIVE_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREOPERATIVE_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preoperativeDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREOPERATIVE_DIAGNOSIS2__PREOPERATIVE_DIAGNOSIS2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PreoperativeDiagnosis2PreoperativeDiagnosis2TemplateId"),
						new Object[] { preoperativeDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preoperativeDiagnosis2 The receiving '<em><b>Preoperative Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreoperativeDiagnosisCodeP(PreoperativeDiagnosis2 preoperativeDiagnosis2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PreoperativeDiagnosis2PreoperativeDiagnosisCodeP", "ERROR");

		if (VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS2);
			try {
				VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preoperativeDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREOPERATIVE_DIAGNOSIS2__PREOPERATIVE_DIAGNOSIS_CODE_P,
						ConsolPlugin.INSTANCE.getString("PreoperativeDiagnosis2PreoperativeDiagnosisCodeP"),
						new Object[] { preoperativeDiagnosis2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisCodeP", passToken);
				}
				passToken.add(preoperativeDiagnosis2);
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
			PreoperativeDiagnosis2 preoperativeDiagnosis2) {

		if (GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS2,
				ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS2.getEAllOperations().get(59));
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
			preoperativeDiagnosis2);
		return new BasicEList.UnmodifiableEList<ProblemObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreoperativeDiagnosisCodeP(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreoperativeDiagnosisCodeP(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreoperativeDiagnosisCodeP(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreoperativeDiagnosisCodeP(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #getConsolProblemObservation2s(PreoperativeDiagnosis2) <em>Get Consol Problem Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(PreoperativeDiagnosis2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProblemObservation2s(PreoperativeDiagnosis2) <em>Get Consol Problem Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(PreoperativeDiagnosis2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validatePreoperativeDiagnosisCode(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreoperativeDiagnosisCode(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '10219-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePreoperativeDiagnosisCode(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreoperativeDiagnosisCode(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preoperativeDiagnosis2 The receiving '<em><b>Preoperative Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreoperativeDiagnosisCode(PreoperativeDiagnosis2 preoperativeDiagnosis2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(preoperativeDiagnosis2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "PreoperativeDiagnosis2PreoperativeDiagnosisCode", "ERROR");

		if (VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS2);
			try {
				VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(preoperativeDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREOPERATIVE_DIAGNOSIS2__PREOPERATIVE_DIAGNOSIS_CODE,
						ConsolPlugin.INSTANCE.getString("PreoperativeDiagnosis2PreoperativeDiagnosisCode"),
						new Object[] { preoperativeDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreoperativeDiagnosisProblemObservation(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreoperativeDiagnosisProblemObservation(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREOPERATIVE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validatePreoperativeDiagnosisProblemObservation(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreoperativeDiagnosisProblemObservation(PreoperativeDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREOPERATIVE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preoperativeDiagnosis2 The receiving '<em><b>Preoperative Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreoperativeDiagnosisProblemObservation(PreoperativeDiagnosis2 preoperativeDiagnosis2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PreoperativeDiagnosis2PreoperativeDiagnosisProblemObservation", "ERROR");

		if (VALIDATE_PREOPERATIVE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS2);
			try {
				VALIDATE_PREOPERATIVE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PREOPERATIVE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREOPERATIVE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preoperativeDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREOPERATIVE_DIAGNOSIS2__PREOPERATIVE_DIAGNOSIS_PROBLEM_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"PreoperativeDiagnosis2PreoperativeDiagnosisProblemObservation"),
						new Object[] { preoperativeDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

} // PreoperativeDiagnosis2Operations
