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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Highest Pressure Ulcer Stage</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HighestPressureUlcerStageOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighestPressureUlcerStageOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHighestPressureUlcerStageTemplateId(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageTemplateId(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.77')";

	/**
	 * The cached OCL invariant for the '{@link #validateHighestPressureUlcerStageTemplateId(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageTemplateId(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param highestPressureUlcerStage The receiving '<em><b>Highest Pressure Ulcer Stage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHighestPressureUlcerStageTemplateId(
			HighestPressureUlcerStage highestPressureUlcerStage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HIGHEST_PRESSURE_ULCER_STAGE);
			try {
				VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			highestPressureUlcerStage)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HIGHEST_PRESSURE_ULCER_STAGE__HIGHEST_PRESSURE_ULCER_STAGE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HighestPressureUlcerStageHighestPressureUlcerStageTemplateId"),
					new Object[] { highestPressureUlcerStage }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHighestPressureUlcerStageClassCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageClassCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateHighestPressureUlcerStageClassCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageClassCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param highestPressureUlcerStage The receiving '<em><b>Highest Pressure Ulcer Stage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHighestPressureUlcerStageClassCode(
			HighestPressureUlcerStage highestPressureUlcerStage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HIGHEST_PRESSURE_ULCER_STAGE);
			try {
				VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			highestPressureUlcerStage)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HIGHEST_PRESSURE_ULCER_STAGE__HIGHEST_PRESSURE_ULCER_STAGE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("HighestPressureUlcerStageHighestPressureUlcerStageClassCode"),
					new Object[] { highestPressureUlcerStage }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHighestPressureUlcerStageMoodCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageMoodCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHighestPressureUlcerStageMoodCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageMoodCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param highestPressureUlcerStage The receiving '<em><b>Highest Pressure Ulcer Stage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHighestPressureUlcerStageMoodCode(
			HighestPressureUlcerStage highestPressureUlcerStage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HIGHEST_PRESSURE_ULCER_STAGE);
			try {
				VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			highestPressureUlcerStage)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HIGHEST_PRESSURE_ULCER_STAGE__HIGHEST_PRESSURE_ULCER_STAGE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("HighestPressureUlcerStageHighestPressureUlcerStageMoodCode"),
					new Object[] { highestPressureUlcerStage }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHighestPressureUlcerStageId(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageId(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHighestPressureUlcerStageId(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageId(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param highestPressureUlcerStage The receiving '<em><b>Highest Pressure Ulcer Stage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHighestPressureUlcerStageId(HighestPressureUlcerStage highestPressureUlcerStage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HIGHEST_PRESSURE_ULCER_STAGE);
			try {
				VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			highestPressureUlcerStage)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HIGHEST_PRESSURE_ULCER_STAGE__HIGHEST_PRESSURE_ULCER_STAGE_ID,
					ConsolPlugin.INSTANCE.getString("HighestPressureUlcerStageHighestPressureUlcerStageId"),
					new Object[] { highestPressureUlcerStage }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHighestPressureUlcerStageCodeP(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageCodeP(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHighestPressureUlcerStageCodeP(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageCodeP(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param highestPressureUlcerStage The receiving '<em><b>Highest Pressure Ulcer Stage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHighestPressureUlcerStageCodeP(HighestPressureUlcerStage highestPressureUlcerStage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HIGHEST_PRESSURE_ULCER_STAGE);
			try {
				VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			highestPressureUlcerStage)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HIGHEST_PRESSURE_ULCER_STAGE__HIGHEST_PRESSURE_ULCER_STAGE_CODE_P,
					ConsolPlugin.INSTANCE.getString("HighestPressureUlcerStageHighestPressureUlcerStageCodeP"),
					new Object[] { highestPressureUlcerStage }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStageCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStageCodeP", passToken);
				}
				passToken.add(highestPressureUlcerStage);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHighestPressureUlcerStageCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '420905001' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateHighestPressureUlcerStageCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageCode(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param highestPressureUlcerStage The receiving '<em><b>Highest Pressure Ulcer Stage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHighestPressureUlcerStageCode(HighestPressureUlcerStage highestPressureUlcerStage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStageCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(highestPressureUlcerStage)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HIGHEST_PRESSURE_ULCER_STAGE);
			try {
				VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			highestPressureUlcerStage)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HIGHEST_PRESSURE_ULCER_STAGE__HIGHEST_PRESSURE_ULCER_STAGE_CODE,
					ConsolPlugin.INSTANCE.getString("HighestPressureUlcerStageHighestPressureUlcerStageCode"),
					new Object[] { highestPressureUlcerStage }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHighestPressureUlcerStageValue(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageValue(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateHighestPressureUlcerStageValue(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHighestPressureUlcerStageValue(HighestPressureUlcerStage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param highestPressureUlcerStage The receiving '<em><b>Highest Pressure Ulcer Stage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHighestPressureUlcerStageValue(HighestPressureUlcerStage highestPressureUlcerStage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HIGHEST_PRESSURE_ULCER_STAGE);
			try {
				VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			highestPressureUlcerStage)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HIGHEST_PRESSURE_ULCER_STAGE__HIGHEST_PRESSURE_ULCER_STAGE_VALUE,
					ConsolPlugin.INSTANCE.getString("HighestPressureUlcerStageHighestPressureUlcerStageValue"),
					new Object[] { highestPressureUlcerStage }));
			}

			return false;
		}
		return true;
	}

} // HighestPressureUlcerStageOperations
