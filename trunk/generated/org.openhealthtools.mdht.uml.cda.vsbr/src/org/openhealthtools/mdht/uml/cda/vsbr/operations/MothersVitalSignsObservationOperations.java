/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mothers Vital Signs Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MothersVitalSignsObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MothersVitalSignsObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMothersVitalSignsObservationTemplateId(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationTemplateId(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.46')";

	/**
	 * The cached OCL invariant for the '{@link #validateMothersVitalSignsObservationTemplateId(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationTemplateId(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mothersVitalSignsObservation The receiving '<em><b>Mothers Vital Signs Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMothersVitalSignsObservationTemplateId(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_OBSERVATION);
			try {
				VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mothersVitalSignsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MothersVitalSignsObservationTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									mothersVitalSignsObservation, context) }),
					new Object[] { mothersVitalSignsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMothersVitalSignsObservationClassCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationClassCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMothersVitalSignsObservationClassCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationClassCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mothersVitalSignsObservation The receiving '<em><b>Mothers Vital Signs Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMothersVitalSignsObservationClassCode(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_OBSERVATION);
			try {
				VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mothersVitalSignsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MothersVitalSignsObservationClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									mothersVitalSignsObservation, context) }),
					new Object[] { mothersVitalSignsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMothersVitalSignsObservationMoodCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationMoodCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMothersVitalSignsObservationMoodCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationMoodCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mothersVitalSignsObservation The receiving '<em><b>Mothers Vital Signs Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMothersVitalSignsObservationMoodCode(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_OBSERVATION);
			try {
				VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mothersVitalSignsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MothersVitalSignsObservationMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									mothersVitalSignsObservation, context) }),
					new Object[] { mothersVitalSignsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMothersVitalSignsObservationCodeP(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationCodeP(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMothersVitalSignsObservationCodeP(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationCodeP(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mothersVitalSignsObservation The receiving '<em><b>Mothers Vital Signs Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMothersVitalSignsObservationCodeP(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_OBSERVATION);
			try {
				VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mothersVitalSignsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MothersVitalSignsObservationCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									mothersVitalSignsObservation, context) }),
					new Object[] { mothersVitalSignsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMothersVitalSignsObservationCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '69461-2' or value.code = '56077-1' or value.code = '3137-7'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMothersVitalSignsObservationCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationCode(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mothersVitalSignsObservation The receiving '<em><b>Mothers Vital Signs Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMothersVitalSignsObservationCode(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_OBSERVATION);
			try {
				VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mothersVitalSignsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MothersVitalSignsObservationCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									mothersVitalSignsObservation, context) }),
					new Object[] { mothersVitalSignsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMothersVitalSignsObservationValue(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationValue(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMothersVitalSignsObservationValue(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMothersVitalSignsObservationValue(MothersVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mothersVitalSignsObservation The receiving '<em><b>Mothers Vital Signs Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMothersVitalSignsObservationValue(
			MothersVitalSignsObservation mothersVitalSignsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_OBSERVATION);
			try {
				VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mothersVitalSignsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MOTHERS_VITAL_SIGNS_OBSERVATION__MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MothersVitalSignsObservationValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									mothersVitalSignsObservation, context) }),
					new Object[] { mothersVitalSignsObservation }));
			}

			return false;
		}
		return true;
	}

} // MothersVitalSignsObservationOperations
