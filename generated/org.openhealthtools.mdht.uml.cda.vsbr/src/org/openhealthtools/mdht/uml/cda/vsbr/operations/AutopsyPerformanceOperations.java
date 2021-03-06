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

import org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Autopsy Performance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceUseAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Use Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceHistologicalExamAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Histological Exam Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutopsyPerformanceOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected AutopsyPerformanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceTemplateId(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceTemplateId(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceTemplateId(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceTemplateId(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceTemplateId(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceClassCode(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceMoodCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceMoodCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceMoodCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceMoodCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceMoodCode(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceCodeP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceCodeP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceCodeP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceCodeP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceCodeP(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '73768-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceCode(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceValue(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceValue(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '29240004' or value.code = '44551000009109' or value.code = '434661000124109')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceValue(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceValue(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceValue(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceValueP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceValueP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceValueP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceValueP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceValueP(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_AUTOPSY_PERFORMANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_VALUE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceValueP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceUseAssociation(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Use Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceUseAssociation(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceUseAssociation(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Use Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceUseAssociation(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceUseAssociation(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_AUTOPSY_PERFORMANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_AUTOPSY_PERFORMANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_USE_ASSOCIATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceUseAssociation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAutopsyPerformanceHistologicalExamAssociation(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Histological Exam Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceHistologicalExamAssociation(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateAutopsyPerformanceHistologicalExamAssociation(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Histological Exam Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAutopsyPerformanceHistologicalExamAssociation(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAutopsyPerformanceHistologicalExamAssociation(AutopsyPerformance autopsyPerformance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.AUTOPSY_PERFORMANCE);
			try {
				VALIDATE_AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				autopsyPerformance)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AutopsyPerformanceAutopsyPerformanceHistologicalExamAssociation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										autopsyPerformance, context) }),
						new Object[] { autopsyPerformance }));
			}

			return false;
		}
		return true;
	}

} // AutopsyPerformanceOperations
