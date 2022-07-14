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
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#validateEncounterDiagnosis2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#validateEncounterDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#validateEncounterDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#validateEncounterDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterDiagnosis2Operations extends EncounterDiagnosisOperations {
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
	protected EncounterDiagnosis2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosis2TemplateId(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosis2TemplateId(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.80' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosis2TemplateId(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosis2TemplateId(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis2 The receiving '<em><b>Encounter Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosis2TemplateId(EncounterDiagnosis2 encounterDiagnosis2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EncounterDiagnosis2EncounterDiagnosis2TemplateId", "ERROR");

		if (VALIDATE_ENCOUNTER_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS2);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounterDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_DIAGNOSIS2__ENCOUNTER_DIAGNOSIS2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("EncounterDiagnosis2EncounterDiagnosis2TemplateId"),
						new Object[] { encounterDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolProblemObservation2s(EncounterDiagnosis2) <em>Get Consol Problem Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(EncounterDiagnosis2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProblemObservation2s(EncounterDiagnosis2) <em>Get Consol Problem Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(EncounterDiagnosis2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation2> getConsolProblemObservation2s(EncounterDiagnosis2 encounterDiagnosis2) {

		if (GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS2,
				ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS2.getEAllOperations().get(59));
			try {
				GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation2> result = (Collection<ProblemObservation2>) query.evaluate(encounterDiagnosis2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisCodeP(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisCodeP(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisCodeP(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisCodeP(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis2 The receiving '<em><b>Encounter Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosisCodeP(EncounterDiagnosis2 encounterDiagnosis2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EncounterDiagnosis2EncounterDiagnosisCodeP", "ERROR");

		if (VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS2);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(encounterDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_DIAGNOSIS2__ENCOUNTER_DIAGNOSIS_CODE_P,
						ConsolPlugin.INSTANCE.getString("EncounterDiagnosis2EncounterDiagnosisCodeP"),
						new Object[] { encounterDiagnosis2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosisCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosisCodeP", passToken);
				}
				passToken.add(encounterDiagnosis2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisCode(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisCode(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '29308-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisCode(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisCode(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis2 The receiving '<em><b>Encounter Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosisCode(EncounterDiagnosis2 encounterDiagnosis2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosisCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(encounterDiagnosis2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "EncounterDiagnosis2EncounterDiagnosisCode", "ERROR");

		if (VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS2);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			encounterDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_DIAGNOSIS2__ENCOUNTER_DIAGNOSIS_CODE,
						ConsolPlugin.INSTANCE.getString("EncounterDiagnosis2EncounterDiagnosisCode"),
						new Object[] { encounterDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisProblemObservation(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisProblemObservation(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisProblemObservation(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisProblemObservation(EncounterDiagnosis2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis2 The receiving '<em><b>Encounter Diagnosis2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosisProblemObservation(EncounterDiagnosis2 encounterDiagnosis2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EncounterDiagnosis2EncounterDiagnosisProblemObservation", "ERROR");

		if (VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS2);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounterDiagnosis2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_DIAGNOSIS2__ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("EncounterDiagnosis2EncounterDiagnosisProblemObservation"),
						new Object[] { encounterDiagnosis2 }));
			}

			return false;
		}
		return true;
	}

} // EncounterDiagnosis2Operations
