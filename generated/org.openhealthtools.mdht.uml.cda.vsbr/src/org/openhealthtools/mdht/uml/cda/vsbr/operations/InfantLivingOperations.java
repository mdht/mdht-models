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

import org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infant Living</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfantLivingOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected InfantLivingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantLivingTemplateId(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingTemplateId(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.28')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantLivingTemplateId(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingTemplateId(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INFANT_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantLiving The receiving '<em><b>Infant Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantLivingTemplateId(InfantLiving infantLiving, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_LIVING);
			try {
				VALIDATE_INFANT_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INFANT_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INFANT_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			infantLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.INFANT_LIVING__INFANT_LIVING_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"InfantLivingInfantLivingTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										infantLiving, context) }),
						new Object[] { infantLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantLivingClassCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingClassCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantLivingClassCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingClassCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INFANT_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantLiving The receiving '<em><b>Infant Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantLivingClassCode(InfantLiving infantLiving, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_LIVING);
			try {
				VALIDATE_INFANT_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INFANT_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INFANT_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			infantLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.INFANT_LIVING__INFANT_LIVING_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"InfantLivingInfantLivingClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										infantLiving, context) }),
						new Object[] { infantLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantLivingMoodCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingMoodCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantLivingMoodCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingMoodCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INFANT_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantLiving The receiving '<em><b>Infant Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantLivingMoodCode(InfantLiving infantLiving, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_LIVING);
			try {
				VALIDATE_INFANT_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INFANT_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INFANT_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			infantLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.INFANT_LIVING__INFANT_LIVING_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"InfantLivingInfantLivingMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										infantLiving, context) }),
						new Object[] { infantLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantLivingCodeP(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingCodeP(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantLivingCodeP(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingCodeP(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INFANT_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantLiving The receiving '<em><b>Infant Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantLivingCodeP(InfantLiving infantLiving, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_LIVING);
			try {
				VALIDATE_INFANT_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INFANT_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INFANT_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			infantLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.INFANT_LIVING__INFANT_LIVING_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"InfantLivingInfantLivingCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										infantLiving, context) }),
						new Object[] { infantLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantLivingCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '73757-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantLivingCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingCode(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INFANT_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantLiving The receiving '<em><b>Infant Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantLivingCode(InfantLiving infantLiving, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_LIVING);
			try {
				VALIDATE_INFANT_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INFANT_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INFANT_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			infantLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.INFANT_LIVING__INFANT_LIVING_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"InfantLivingInfantLivingCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										infantLiving, context) }),
						new Object[] { infantLiving }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantLivingValue(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingValue(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantLivingValue(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantLivingValue(InfantLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INFANT_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantLiving The receiving '<em><b>Infant Living</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantLivingValue(InfantLiving infantLiving, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_LIVING);
			try {
				VALIDATE_INFANT_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INFANT_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INFANT_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			infantLiving)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.INFANT_LIVING__INFANT_LIVING_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"InfantLivingInfantLivingValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										infantLiving, context) }),
						new Object[] { infantLiving }));
			}

			return false;
		}
		return true;
	}

} // InfantLivingOperations
