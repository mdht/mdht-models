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
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Status Evaluations Outcomes Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Outcome Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#getOutcomeObservations() <em>Get Outcome Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthStatusEvaluationsOutcomesSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusEvaluationsOutcomesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsOutcomesSectionTemplateId(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionTemplateId(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.61')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsOutcomesSectionTemplateId(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionTemplateId(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsOutcomesSection The receiving '<em><b>Health Status Evaluations Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsOutcomesSectionTemplateId(
			HealthStatusEvaluationsOutcomesSection healthStatusEvaluationsOutcomesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusEvaluationsOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsOutcomesSectionTemplateId"),
					new Object[] { healthStatusEvaluationsOutcomesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsOutcomesSectionCode(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionCode(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '11383-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsOutcomesSectionCode(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionCode(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsOutcomesSection The receiving '<em><b>Health Status Evaluations Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsOutcomesSectionCode(
			HealthStatusEvaluationsOutcomesSection healthStatusEvaluationsOutcomesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusEvaluationsOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsOutcomesSectionCode"),
					new Object[] { healthStatusEvaluationsOutcomesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsOutcomesSectionCodeP(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionCodeP(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsOutcomesSectionCodeP(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionCodeP(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsOutcomesSection The receiving '<em><b>Health Status Evaluations Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsOutcomesSectionCodeP(
			HealthStatusEvaluationsOutcomesSection healthStatusEvaluationsOutcomesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusEvaluationsOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsOutcomesSectionCodeP"),
					new Object[] { healthStatusEvaluationsOutcomesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsOutcomesSectionTitle(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionTitle(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsOutcomesSectionTitle(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionTitle(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsOutcomesSection The receiving '<em><b>Health Status Evaluations Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsOutcomesSectionTitle(
			HealthStatusEvaluationsOutcomesSection healthStatusEvaluationsOutcomesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusEvaluationsOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsOutcomesSectionTitle"),
					new Object[] { healthStatusEvaluationsOutcomesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsOutcomesSectionText(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionText(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsOutcomesSectionText(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionText(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsOutcomesSection The receiving '<em><b>Health Status Evaluations Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsOutcomesSectionText(
			HealthStatusEvaluationsOutcomesSection healthStatusEvaluationsOutcomesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusEvaluationsOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsOutcomesSectionText"),
					new Object[] { healthStatusEvaluationsOutcomesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Outcome Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_OUTCOME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::OutcomeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Outcome Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(HealthStatusEvaluationsOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_OUTCOME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsOutcomesSection The receiving '<em><b>Health Status Evaluations Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(
			HealthStatusEvaluationsOutcomesSection healthStatusEvaluationsOutcomesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_OUTCOME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_OUTCOME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_OUTCOME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_OUTCOME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusEvaluationsOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_OUTCOME_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsOutcomesSectionOutcomeObservation"),
					new Object[] { healthStatusEvaluationsOutcomesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getOutcomeObservations(HealthStatusEvaluationsOutcomesSection) <em>Get Outcome Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeObservations(HealthStatusEvaluationsOutcomesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OUTCOME_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::OutcomeObservation)).oclAsType(consol::OutcomeObservation)";

	/**
	 * The cached OCL query for the '{@link #getOutcomeObservations(HealthStatusEvaluationsOutcomesSection) <em>Get Outcome Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeObservations(HealthStatusEvaluationsOutcomesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OUTCOME_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<OutcomeObservation> getOutcomeObservations(
			HealthStatusEvaluationsOutcomesSection healthStatusEvaluationsOutcomesSection) {
		if (GET_OUTCOME_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION,
				ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION.getEAllOperations().get(61));
			try {
				GET_OUTCOME_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_OUTCOME_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OUTCOME_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<OutcomeObservation> result = (Collection<OutcomeObservation>) query.evaluate(healthStatusEvaluationsOutcomesSection);
		return new BasicEList.UnmodifiableEList<OutcomeObservation>(result.size(), result.toArray());
	}

} // HealthStatusEvaluationsOutcomesSectionOperations
