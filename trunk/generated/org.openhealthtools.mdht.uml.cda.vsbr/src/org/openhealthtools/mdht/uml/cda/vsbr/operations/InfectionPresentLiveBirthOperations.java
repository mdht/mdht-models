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

import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infection Present Live Birth</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfectionPresentLiveBirthOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfectionPresentLiveBirthOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentLiveBirthTemplateId(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthTemplateId(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.30')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentLiveBirthTemplateId(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthTemplateId(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentLiveBirth The receiving '<em><b>Infection Present Live Birth</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentLiveBirthTemplateId(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH);
			try {
				VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentLiveBirth)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentLiveBirthTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentLiveBirth, context) }), new Object[] { infectionPresentLiveBirth }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentLiveBirthClassCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthClassCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentLiveBirthClassCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthClassCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentLiveBirth The receiving '<em><b>Infection Present Live Birth</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentLiveBirthClassCode(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH);
			try {
				VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentLiveBirth)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentLiveBirthClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentLiveBirth, context) }), new Object[] { infectionPresentLiveBirth }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentLiveBirthMoodCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthMoodCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentLiveBirthMoodCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthMoodCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentLiveBirth The receiving '<em><b>Infection Present Live Birth</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentLiveBirthMoodCode(
			InfectionPresentLiveBirth infectionPresentLiveBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH);
			try {
				VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentLiveBirth)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentLiveBirthMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentLiveBirth, context) }), new Object[] { infectionPresentLiveBirth }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentLiveBirthCodeP(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthCodeP(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentLiveBirthCodeP(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthCodeP(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentLiveBirth The receiving '<em><b>Infection Present Live Birth</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentLiveBirthCodeP(InfectionPresentLiveBirth infectionPresentLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH);
			try {
				VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentLiveBirth)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentLiveBirthCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentLiveBirth, context) }), new Object[] { infectionPresentLiveBirth }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentLiveBirthCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '72519-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentLiveBirthCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthCode(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentLiveBirth The receiving '<em><b>Infection Present Live Birth</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentLiveBirthCode(InfectionPresentLiveBirth infectionPresentLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH);
			try {
				VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentLiveBirth)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentLiveBirthCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentLiveBirth, context) }), new Object[] { infectionPresentLiveBirth }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentLiveBirthCodeVS(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code VS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthCodeVS(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '1562800' or value.code = '76272004' or value.code = '105629000' or value.code = '66071002' or value.code = '50711007' or value.code = '260413007'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentLiveBirthCodeVS(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code VS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthCodeVS(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentLiveBirth The receiving '<em><b>Infection Present Live Birth</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentLiveBirthCodeVS(InfectionPresentLiveBirth infectionPresentLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH);
			try {
				VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentLiveBirth)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_CODE_VS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentLiveBirthCodeVS",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentLiveBirth, context) }), new Object[] { infectionPresentLiveBirth }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentLiveBirthValue(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthValue(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '1562800' or value.code = '76272004' or value.code = '105629000' or value.code = '66071002' or value.code = '50711007' or value.code = '260413007')))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentLiveBirthValue(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthValue(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentLiveBirth The receiving '<em><b>Infection Present Live Birth</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentLiveBirthValue(InfectionPresentLiveBirth infectionPresentLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH);
			try {
				VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentLiveBirth)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentLiveBirthValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentLiveBirth, context) }), new Object[] { infectionPresentLiveBirth }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfectionPresentLiveBirthValueP(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthValueP(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfectionPresentLiveBirthValueP(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfectionPresentLiveBirthValueP(InfectionPresentLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infectionPresentLiveBirth The receiving '<em><b>Infection Present Live Birth</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfectionPresentLiveBirthValueP(InfectionPresentLiveBirth infectionPresentLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH);
			try {
				VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infectionPresentLiveBirth)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFECTION_PRESENT_LIVE_BIRTH__INFECTION_PRESENT_LIVE_BIRTH_VALUE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"InfectionPresentLiveBirthValueP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									infectionPresentLiveBirth, context) }), new Object[] { infectionPresentLiveBirth }));
			}

			return false;
		}
		return true;
	}

} // InfectionPresentLiveBirthOperations
