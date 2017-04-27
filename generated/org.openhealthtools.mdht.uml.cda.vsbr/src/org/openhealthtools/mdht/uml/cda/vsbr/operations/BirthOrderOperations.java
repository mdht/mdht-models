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

import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birth Order</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BirthOrderOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected BirthOrderOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthOrderTemplateId(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderTemplateId(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.16')";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthOrderTemplateId(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderTemplateId(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BIRTH_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param birthOrder The receiving '<em><b>Birth Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBirthOrderTemplateId(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BIRTH_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.BIRTH_ORDER);
			try {
				VALIDATE_BIRTH_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BIRTH_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_BIRTH_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			birthOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.BIRTH_ORDER__BIRTH_ORDER_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BirthOrderBirthOrderTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthOrder, context) }),
						new Object[] { birthOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthOrderClassCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderClassCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthOrderClassCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderClassCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BIRTH_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param birthOrder The receiving '<em><b>Birth Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBirthOrderClassCode(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BIRTH_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.BIRTH_ORDER);
			try {
				VALIDATE_BIRTH_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BIRTH_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_BIRTH_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			birthOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.BIRTH_ORDER__BIRTH_ORDER_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BirthOrderBirthOrderClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthOrder, context) }),
						new Object[] { birthOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthOrderMoodCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderMoodCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthOrderMoodCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderMoodCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BIRTH_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param birthOrder The receiving '<em><b>Birth Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBirthOrderMoodCode(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BIRTH_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.BIRTH_ORDER);
			try {
				VALIDATE_BIRTH_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BIRTH_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_BIRTH_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			birthOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.BIRTH_ORDER__BIRTH_ORDER_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BirthOrderBirthOrderMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthOrder, context) }),
						new Object[] { birthOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthOrderCodeP(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderCodeP(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthOrderCodeP(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderCodeP(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BIRTH_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param birthOrder The receiving '<em><b>Birth Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBirthOrderCodeP(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BIRTH_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.BIRTH_ORDER);
			try {
				VALIDATE_BIRTH_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BIRTH_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_BIRTH_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			birthOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.BIRTH_ORDER__BIRTH_ORDER_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BirthOrderBirthOrderCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthOrder, context) }),
						new Object[] { birthOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthOrderCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '73771-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthOrderCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderCode(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BIRTH_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param birthOrder The receiving '<em><b>Birth Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBirthOrderCode(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BIRTH_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.BIRTH_ORDER);
			try {
				VALIDATE_BIRTH_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BIRTH_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_BIRTH_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			birthOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE, VsbrValidator.BIRTH_ORDER__BIRTH_ORDER_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BirthOrderBirthOrderCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthOrder, context) }),
						new Object[] { birthOrder }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthOrderValue(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderValue(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthOrderValue(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthOrderValue(BirthOrder, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BIRTH_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param birthOrder The receiving '<em><b>Birth Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBirthOrderValue(BirthOrder birthOrder, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BIRTH_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.BIRTH_ORDER);
			try {
				VALIDATE_BIRTH_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BIRTH_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_BIRTH_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			birthOrder)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE, VsbrValidator.BIRTH_ORDER__BIRTH_ORDER_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BirthOrderBirthOrderValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthOrder, context) }),
						new Object[] { birthOrder }));
			}

			return false;
		}
		return true;
	}

} // BirthOrderOperations
