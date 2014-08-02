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

import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infection Present Fetal Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfectionPresentFetalDeathOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfectionPresentFetalDeathOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentFetalDeathTemplateId(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathTemplateId(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.49')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentFetalDeathTemplateId(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathTemplateId(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentFetalDeath The receiving '<em><b>Infection Present Fetal Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentFetalDeathTemplateId(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH);
			try {
				VALIDATE_INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentFetalDeath)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentFetalDeathTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentFetalDeath, context) }),
					new Object[] { infectionPresentFetalDeath }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentFetalDeathClassCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathClassCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentFetalDeathClassCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathClassCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentFetalDeath The receiving '<em><b>Infection Present Fetal Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentFetalDeathClassCode(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH);
			try {
				VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentFetalDeath)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentFetalDeathClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentFetalDeath, context) }),
					new Object[] { infectionPresentFetalDeath }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentFetalDeathMoodCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathMoodCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentFetalDeathMoodCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathMoodCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentFetalDeath The receiving '<em><b>Infection Present Fetal Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentFetalDeathMoodCode(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH);
			try {
				VALIDATE_INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentFetalDeath)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentFetalDeathMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentFetalDeath, context) }),
					new Object[] { infectionPresentFetalDeath }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentFetalDeathCodeP(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathCodeP(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentFetalDeathCodeP(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathCodeP(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentFetalDeath The receiving '<em><b>Infection Present Fetal Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentFetalDeathCodeP(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH);
			try {
				VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentFetalDeath)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentFetalDeathCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentFetalDeath, context) }),
					new Object[] { infectionPresentFetalDeath }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentFetalDeathCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '73769-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentFetalDeathCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathCode(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentFetalDeath The receiving '<em><b>Infection Present Fetal Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentFetalDeathCode(InfectionPresentFetalDeath infectionPresentFetalDeath,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH);
			try {
				VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentFetalDeath)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentFetalDeathCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentFetalDeath, context) }),
					new Object[] { infectionPresentFetalDeath }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentFetalDeathCodeVS(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code VS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathCodeVS(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '1562800' or value.code = '76272004' or value.code = '105629000' or value.code = '4241002' or value.code = '426933007' or value.code = '28944009' or value.code = '186748004' or value.code = '187192000' or value.code = '394841004' or value.code = '260413007'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentFetalDeathCodeVS(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code VS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathCodeVS(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentFetalDeath The receiving '<em><b>Infection Present Fetal Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentFetalDeathCodeVS(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH);
			try {
				VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentFetalDeath)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_CODE_VS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentFetalDeathCodeVS",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentFetalDeath, context) }),
					new Object[] { infectionPresentFetalDeath }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentFetalDeathValue(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathValue(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '1562800' or value.code = '76272004' or value.code = '105629000' or value.code = '4241002' or value.code = '426933007' or value.code = '28944009' or value.code = '186748004' or value.code = '187192000' or value.code = '394841004' or value.code = '260413007')))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentFetalDeathValue(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathValue(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentFetalDeath The receiving '<em><b>Infection Present Fetal Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentFetalDeathValue(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH);
			try {
				VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentFetalDeath)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentFetalDeathValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentFetalDeath, context) }),
					new Object[] { infectionPresentFetalDeath }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentFetalDeathValueP(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathValueP(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentFetalDeathValueP(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentFetalDeathValueP(InfectionPresentFetalDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentFetalDeath The receiving '<em><b>Infection Present Fetal Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentFetalDeathValueP(
			InfectionPresentFetalDeath infectionPresentFetalDeath, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_FETAL_DEATH);
			try {
				VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentFetalDeath)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_FETAL_DEATH__INFECTION_PRESENT_FETAL_DEATH_VALUE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentFetalDeathValueP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentFetalDeath, context) }),
					new Object[] { infectionPresentFetalDeath }));
			}

			return false;
		}
		return true;
	}

} // InfectionPresentFetalDeathOperations
