/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Last Menstrual Period</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod#validateLastMenstrualPeriodTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod#validateLastMenstrualPeriodClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod#validateLastMenstrualPeriodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod#validateLastMenstrualPeriodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod#validateLastMenstrualPeriodEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod#validateLastMenstrualPeriodMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod#validateLastMenstrualPeriodMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod#validateLastMenstrualPeriodStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LastMenstrualPeriodOperations extends ClinicalStatementOperations {
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
	protected LastMenstrualPeriodOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodTemplateId(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodTemplateId(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.34')";

	/**
	 * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodTemplateId(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodTemplateId(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LAST_MENSTRUAL_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastMenstrualPeriod The receiving '<em><b>Last Menstrual Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastMenstrualPeriodTemplateId(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LAST_MENSTRUAL_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod());
			try {
				VALIDATE_LAST_MENSTRUAL_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LAST_MENSTRUAL_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lastMenstrualPeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LastMenstrualPeriodLastMenstrualPeriodTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lastMenstrualPeriod, context) }),
						new Object[] { lastMenstrualPeriod }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodClassCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodClassCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodClassCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodClassCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LAST_MENSTRUAL_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastMenstrualPeriod The receiving '<em><b>Last Menstrual Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastMenstrualPeriodClassCode(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LAST_MENSTRUAL_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod());
			try {
				VALIDATE_LAST_MENSTRUAL_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LAST_MENSTRUAL_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lastMenstrualPeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LastMenstrualPeriodLastMenstrualPeriodClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lastMenstrualPeriod, context) }),
						new Object[] { lastMenstrualPeriod }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodCodeP(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodCodeP(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodCodeP(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodCodeP(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LAST_MENSTRUAL_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastMenstrualPeriod The receiving '<em><b>Last Menstrual Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastMenstrualPeriodCodeP(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LAST_MENSTRUAL_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod());
			try {
				VALIDATE_LAST_MENSTRUAL_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LAST_MENSTRUAL_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(lastMenstrualPeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LastMenstrualPeriodLastMenstrualPeriodCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lastMenstrualPeriod, context) }),
						new Object[] { lastMenstrualPeriod }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '21840007' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LAST_MENSTRUAL_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastMenstrualPeriod The receiving '<em><b>Last Menstrual Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastMenstrualPeriodCode(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LAST_MENSTRUAL_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod());
			try {
				VALIDATE_LAST_MENSTRUAL_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LAST_MENSTRUAL_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(lastMenstrualPeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LastMenstrualPeriodLastMenstrualPeriodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lastMenstrualPeriod, context) }),
						new Object[] { lastMenstrualPeriod }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodEffectiveTime(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodEffectiveTime(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodEffectiveTime(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodEffectiveTime(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LAST_MENSTRUAL_PERIOD_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastMenstrualPeriod The receiving '<em><b>Last Menstrual Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastMenstrualPeriodEffectiveTime(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LAST_MENSTRUAL_PERIOD_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod());
			try {
				VALIDATE_LAST_MENSTRUAL_PERIOD_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LAST_MENSTRUAL_PERIOD_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LAST_MENSTRUAL_PERIOD_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lastMenstrualPeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LastMenstrualPeriodLastMenstrualPeriodEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lastMenstrualPeriod, context) }),
						new Object[] { lastMenstrualPeriod }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodMoodCodeP(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Mood Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodMoodCodeP(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodMoodCodeP(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Mood Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodMoodCodeP(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastMenstrualPeriod The receiving '<em><b>Last Menstrual Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastMenstrualPeriodMoodCodeP(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod());
			try {
				VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lastMenstrualPeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_MOOD_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LastMenstrualPeriodLastMenstrualPeriodMoodCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lastMenstrualPeriod, context) }),
						new Object[] { lastMenstrualPeriod }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodMoodCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodMoodCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_ActMoodDocumentObservation) and " +
			"let value : vocab::x_ActMoodDocumentObservation = self.moodCode.oclAsType(vocab::x_ActMoodDocumentObservation) in " +
			"value = vocab::x_ActMoodDocumentObservation::completed";

	/**
	 * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodMoodCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodMoodCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastMenstrualPeriod The receiving '<em><b>Last Menstrual Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastMenstrualPeriodMoodCode(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod());
			try {
				VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LAST_MENSTRUAL_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lastMenstrualPeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LastMenstrualPeriodLastMenstrualPeriodMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lastMenstrualPeriod, context) }),
						new Object[] { lastMenstrualPeriod }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodStatusCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodStatusCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodStatusCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastMenstrualPeriodStatusCode(LastMenstrualPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LAST_MENSTRUAL_PERIOD_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastMenstrualPeriod The receiving '<em><b>Last Menstrual Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastMenstrualPeriodStatusCode(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LAST_MENSTRUAL_PERIOD_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod());
			try {
				VALIDATE_LAST_MENSTRUAL_PERIOD_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LAST_MENSTRUAL_PERIOD_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lastMenstrualPeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LastMenstrualPeriodLastMenstrualPeriodStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lastMenstrualPeriod, context) }),
						new Object[] { lastMenstrualPeriod }));
			}

			return false;
		}
		return true;
	}

} // LastMenstrualPeriodOperations
