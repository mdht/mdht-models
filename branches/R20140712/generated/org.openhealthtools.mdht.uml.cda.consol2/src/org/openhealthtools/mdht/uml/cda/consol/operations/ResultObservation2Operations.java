/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservation2AuthorMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Author Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservation2CodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultObservation2Operations extends ResultObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservation2AuthorMultiplicity(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Author Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservation2AuthorMultiplicity(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION2_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservation2AuthorMultiplicity(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Author Multiplicity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservation2AuthorMultiplicity(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_OBSERVATION2_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservation2 The receiving '<em><b>Result Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservation2AuthorMultiplicity(ResultObservation2 resultObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION2_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION2);
			try {
				VALIDATE_RESULT_OBSERVATION2_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION2_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION2_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULT_OBSERVATION2__RESULT_OBSERVATION2_AUTHOR_MULTIPLICITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ResultObservation2AuthorMultiplicity",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(resultObservation2, context) }),
					new Object[] { resultObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservation2CodeValue(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Code Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservation2CodeValue(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION2_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem = '2.16.840.1.113883.6.1' or self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservation2CodeValue(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Code Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservation2CodeValue(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_OBSERVATION2_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservation2 The receiving '<em><b>Result Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservation2CodeValue(ResultObservation2 resultObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION2_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION2);
			try {
				VALIDATE_RESULT_OBSERVATION2_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION2_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION2_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULT_OBSERVATION2__RESULT_OBSERVATION2_CODE_VALUE,
					ConsolPlugin.INSTANCE.getString("ResultObservation2CodeValue"), new Object[] { resultObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservation2AuthorParticipation(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservation2AuthorParticipation(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservation2AuthorParticipation(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservation2AuthorParticipation(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservation2 The receiving '<em><b>Result Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservation2AuthorParticipation(ResultObservation2 resultObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION2);
			try {
				VALIDATE_RESULT_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULT_OBSERVATION2__RESULT_OBSERVATION2_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("ResultObservation2AuthorParticipation"),
					new Object[] { resultObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.2.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservation2 The receiving '<em><b>Result Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationTemplateId(ResultObservation2 resultObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION2);
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULT_OBSERVATION2__RESULT_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ResultObservationTemplateId"), new Object[] { resultObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationEffectiveTime(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationEffectiveTime(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationEffectiveTime(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationEffectiveTime(ResultObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservation2 The receiving '<em><b>Result Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationEffectiveTime(ResultObservation2 resultObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION2);
			try {
				VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULT_OBSERVATION2__RESULT_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ResultObservationEffectiveTime"),
					new Object[] { resultObservation2 }));
			}

			return false;
		}
		return true;
	}

} // ResultObservation2Operations
