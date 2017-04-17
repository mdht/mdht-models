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

import org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Onsetof Labor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnsetofLaborOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected OnsetofLaborOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOnsetofLaborTemplateId(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborTemplateId(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONSETOF_LABOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateOnsetofLaborTemplateId(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborTemplateId(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONSETOF_LABOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param onsetofLabor The receiving '<em><b>Onsetof Labor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOnsetofLaborTemplateId(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONSETOF_LABOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ONSETOF_LABOR);
			try {
				VALIDATE_ONSETOF_LABOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONSETOF_LABOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONSETOF_LABOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			onsetofLabor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ONSETOF_LABOR__ONSETOF_LABOR_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OnsetofLaborOnsetofLaborTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										onsetofLabor, context) }),
						new Object[] { onsetofLabor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOnsetofLaborClassCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborClassCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONSETOF_LABOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateOnsetofLaborClassCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborClassCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONSETOF_LABOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param onsetofLabor The receiving '<em><b>Onsetof Labor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOnsetofLaborClassCode(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONSETOF_LABOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ONSETOF_LABOR);
			try {
				VALIDATE_ONSETOF_LABOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONSETOF_LABOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONSETOF_LABOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			onsetofLabor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ONSETOF_LABOR__ONSETOF_LABOR_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OnsetofLaborOnsetofLaborClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										onsetofLabor, context) }),
						new Object[] { onsetofLabor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOnsetofLaborMoodCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborMoodCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONSETOF_LABOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateOnsetofLaborMoodCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborMoodCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONSETOF_LABOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param onsetofLabor The receiving '<em><b>Onsetof Labor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOnsetofLaborMoodCode(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONSETOF_LABOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ONSETOF_LABOR);
			try {
				VALIDATE_ONSETOF_LABOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONSETOF_LABOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONSETOF_LABOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			onsetofLabor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ONSETOF_LABOR__ONSETOF_LABOR_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OnsetofLaborOnsetofLaborMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										onsetofLabor, context) }),
						new Object[] { onsetofLabor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOnsetofLaborCodeP(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborCodeP(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONSETOF_LABOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOnsetofLaborCodeP(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborCodeP(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONSETOF_LABOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param onsetofLabor The receiving '<em><b>Onsetof Labor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOnsetofLaborCodeP(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONSETOF_LABOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ONSETOF_LABOR);
			try {
				VALIDATE_ONSETOF_LABOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONSETOF_LABOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONSETOF_LABOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			onsetofLabor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ONSETOF_LABOR__ONSETOF_LABOR_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OnsetofLaborOnsetofLaborCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										onsetofLabor, context) }),
						new Object[] { onsetofLabor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOnsetofLaborCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONSETOF_LABOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '73774-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOnsetofLaborCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborCode(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONSETOF_LABOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param onsetofLabor The receiving '<em><b>Onsetof Labor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOnsetofLaborCode(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONSETOF_LABOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ONSETOF_LABOR);
			try {
				VALIDATE_ONSETOF_LABOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONSETOF_LABOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONSETOF_LABOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			onsetofLabor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ONSETOF_LABOR__ONSETOF_LABOR_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OnsetofLaborOnsetofLaborCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										onsetofLabor, context) }),
						new Object[] { onsetofLabor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOnsetofLaborCodeVS(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code VS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborCodeVS(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONSETOF_LABOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '44223004' or value.code = '51920004' or value.code = '53443007' or value.code = '260413007'))";

	/**
	 * The cached OCL invariant for the '{@link #validateOnsetofLaborCodeVS(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code VS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborCodeVS(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONSETOF_LABOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param onsetofLabor The receiving '<em><b>Onsetof Labor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOnsetofLaborCodeVS(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONSETOF_LABOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ONSETOF_LABOR);
			try {
				VALIDATE_ONSETOF_LABOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONSETOF_LABOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONSETOF_LABOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			onsetofLabor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ONSETOF_LABOR__ONSETOF_LABOR_CODE_VS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OnsetofLaborOnsetofLaborCodeVS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										onsetofLabor, context) }),
						new Object[] { onsetofLabor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOnsetofLaborValue(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborValue(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONSETOF_LABOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '44223004' or value.code = '51920004' or value.code = '53443007' or value.code = '260413007')))";

	/**
	 * The cached OCL invariant for the '{@link #validateOnsetofLaborValue(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborValue(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONSETOF_LABOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param onsetofLabor The receiving '<em><b>Onsetof Labor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOnsetofLaborValue(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONSETOF_LABOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ONSETOF_LABOR);
			try {
				VALIDATE_ONSETOF_LABOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONSETOF_LABOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONSETOF_LABOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			onsetofLabor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ONSETOF_LABOR__ONSETOF_LABOR_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OnsetofLaborOnsetofLaborValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										onsetofLabor, context) }),
						new Object[] { onsetofLabor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOnsetofLaborValueP(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborValueP(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONSETOF_LABOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOnsetofLaborValueP(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOnsetofLaborValueP(OnsetofLabor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONSETOF_LABOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param onsetofLabor The receiving '<em><b>Onsetof Labor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOnsetofLaborValueP(OnsetofLabor onsetofLabor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONSETOF_LABOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ONSETOF_LABOR);
			try {
				VALIDATE_ONSETOF_LABOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONSETOF_LABOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONSETOF_LABOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			onsetofLabor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ONSETOF_LABOR__ONSETOF_LABOR_VALUE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OnsetofLaborOnsetofLaborValueP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										onsetofLabor, context) }),
						new Object[] { onsetofLabor }));
			}

			return false;
		}
		return true;
	}

} // OnsetofLaborOperations
