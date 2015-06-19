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
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptional2HealthStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional2 Health Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#getConsolProblemConcernAct2s() <em>Get Consol Problem Concern Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#getHealthStatusObservation2() <em>Get Health Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptionalProblemConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Problem Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemSectionEntriesOptional2Operations extends ProblemSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemSectionEntriesOptional2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionEntriesOptional2HealthStatusObservation2(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional2 Health Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptional2HealthStatusObservation2(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::HealthStatusObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionEntriesOptional2HealthStatusObservation2(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional2 Health Status Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptional2HealthStatusObservation2(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSectionEntriesOptional2 The receiving '<em><b>Problem Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemSectionEntriesOptional2HealthStatusObservation2(
			ProblemSectionEntriesOptional2 problemSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			problemSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROBLEM_SECTION_ENTRIES_OPTIONAL2__PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("ProblemSectionEntriesOptional2ProblemSectionEntriesOptional2HealthStatusObservation2"),
					new Object[] { problemSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolProblemConcernAct2s(ProblemSectionEntriesOptional2) <em>Get Consol Problem Concern Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemConcernAct2s(ProblemSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROBLEM_CONCERN_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct2)).oclAsType(consol::ProblemConcernAct2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProblemConcernAct2s(ProblemSectionEntriesOptional2) <em>Get Consol Problem Concern Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemConcernAct2s(ProblemSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROBLEM_CONCERN_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemConcernAct2> getConsolProblemConcernAct2s(
			ProblemSectionEntriesOptional2 problemSectionEntriesOptional2) {
		if (GET_CONSOL_PROBLEM_CONCERN_ACT2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(63));
			try {
				GET_CONSOL_PROBLEM_CONCERN_ACT2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PROBLEM_CONCERN_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PROBLEM_CONCERN_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemConcernAct2> result = (Collection<ProblemConcernAct2>) query.evaluate(problemSectionEntriesOptional2);
		return new BasicEList.UnmodifiableEList<ProblemConcernAct2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthStatusObservation2(ProblemSectionEntriesOptional2) <em>Get Health Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation2(ProblemSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_STATUS_OBSERVATION2__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation2))->asSequence()->any(true).oclAsType(consol::HealthStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getHealthStatusObservation2(ProblemSectionEntriesOptional2) <em>Get Health Status Observation2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation2(ProblemSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_STATUS_OBSERVATION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HealthStatusObservation2 getHealthStatusObservation2(
			ProblemSectionEntriesOptional2 problemSectionEntriesOptional2) {
		if (GET_HEALTH_STATUS_OBSERVATION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(64));
			try {
				GET_HEALTH_STATUS_OBSERVATION2__EOCL_QRY = helper.createQuery(GET_HEALTH_STATUS_OBSERVATION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_STATUS_OBSERVATION2__EOCL_QRY);
		return (HealthStatusObservation2) query.evaluate(problemSectionEntriesOptional2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionEntriesOptionalTemplateId(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalTemplateId(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.5' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionEntriesOptionalTemplateId(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalTemplateId(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSectionEntriesOptional2 The receiving '<em><b>Problem Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemSectionEntriesOptionalTemplateId(
			ProblemSectionEntriesOptional2 problemSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			problemSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROBLEM_SECTION_ENTRIES_OPTIONAL2__PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProblemSectionEntriesOptional2ProblemSectionEntriesOptionalTemplateId"),
					new Object[] { problemSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionEntriesOptionalCodeP(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalCodeP(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionEntriesOptionalCodeP(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalCodeP(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSectionEntriesOptional2 The receiving '<em><b>Problem Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemSectionEntriesOptionalCodeP(
			ProblemSectionEntriesOptional2 problemSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			problemSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROBLEM_SECTION_ENTRIES_OPTIONAL2__PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P,
					ConsolPlugin.INSTANCE.getString("ProblemSectionEntriesOptional2ProblemSectionEntriesOptionalCodeP"),
					new Object[] { problemSectionEntriesOptional2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptionalCodeP", passToken);
				}
				passToken.add(problemSectionEntriesOptional2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionEntriesOptionalCode(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalCode(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionEntriesOptionalCode(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalCode(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSectionEntriesOptional2 The receiving '<em><b>Problem Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemSectionEntriesOptionalCode(
			ProblemSectionEntriesOptional2 problemSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(problemSectionEntriesOptional2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			problemSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROBLEM_SECTION_ENTRIES_OPTIONAL2__PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE,
					ConsolPlugin.INSTANCE.getString("ProblemSectionEntriesOptional2ProblemSectionEntriesOptionalCode"),
					new Object[] { problemSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionEntriesOptionalProblemConcern(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Problem Concern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalProblemConcern(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ProblemConcernAct2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionEntriesOptionalProblemConcern(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Problem Concern</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalProblemConcern(ProblemSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSectionEntriesOptional2 The receiving '<em><b>Problem Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemSectionEntriesOptionalProblemConcern(
			ProblemSectionEntriesOptional2 problemSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			problemSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROBLEM_SECTION_ENTRIES_OPTIONAL2__PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN,
					ConsolPlugin.INSTANCE.getString("ProblemSectionEntriesOptional2ProblemSectionEntriesOptionalProblemConcern"),
					new Object[] { problemSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

} // ProblemSectionEntriesOptional2Operations
