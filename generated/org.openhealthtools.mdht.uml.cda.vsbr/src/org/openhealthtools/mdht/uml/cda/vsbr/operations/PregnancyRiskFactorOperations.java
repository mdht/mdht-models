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

import org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Risk Factor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PregnancyRiskFactorOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected PregnancyRiskFactorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorTemplateId(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorTemplateId(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.44')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorTemplateId(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorTemplateId(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorTemplateId(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorClassCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorClassCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorClassCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorClassCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorClassCode(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_RISK_FACTOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorMoodCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorMoodCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorMoodCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorMoodCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorMoodCode(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorCodeP(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorCodeP(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorCodeP(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorCodeP(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorCodeP(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_RISK_FACTOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '73775-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorCode(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorCode(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorCodeVS(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code VS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorCodeVS(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '73211009' or value.code = '11687002' or value.code = '38341003' or value.code = '48194001' or value.code = '15938005' or value.code = '161765003' or value.code = '271903000' or value.code = '65046005' or value.code = '58533008' or value.code = '63487001' or value.code = '200144004' or value.code = '260413007'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorCodeVS(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code VS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorCodeVS(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorCodeVS(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_RISK_FACTOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_CODE_VS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorCodeVS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorValue(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorValue(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '73211009' or value.code = '11687002' or value.code = '38341003' or value.code = '48194001' or value.code = '15938005' or value.code = '161765003' or value.code = '271903000' or value.code = '65046005' or value.code = '58533008' or value.code = '63487001' or value.code = '200144004' or value.code = '260413007')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorValue(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorValue(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorValue(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorValueP(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorValueP(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorValueP(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorValueP(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorValueP(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_RISK_FACTOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_VALUE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorValueP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyRiskFactorEntryRelationship(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorEntryRelationship(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyRiskFactorEntryRelationship(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyRiskFactorEntryRelationship(PregnancyRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyRiskFactor The receiving '<em><b>Pregnancy Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyRiskFactorEntryRelationship(PregnancyRiskFactor pregnancyRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PREGNANCY_RISK_FACTOR);
			try {
				VALIDATE_PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.PREGNANCY_RISK_FACTOR__PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PregnancyRiskFactorPregnancyRiskFactorEntryRelationship",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										pregnancyRiskFactor, context) }),
						new Object[] { pregnancyRiskFactor }));
			}

			return false;
		}
		return true;
	}

} // PregnancyRiskFactorOperations
