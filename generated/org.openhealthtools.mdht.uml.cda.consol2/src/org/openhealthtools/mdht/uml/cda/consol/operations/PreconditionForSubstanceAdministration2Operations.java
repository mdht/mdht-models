/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Precondition For Substance Administration2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministration2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreconditionForSubstanceAdministration2Operations
		extends PreconditionForSubstanceAdministrationOperations {
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
	protected PreconditionForSubstanceAdministration2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministration2TemplateId(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministration2TemplateId(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.25' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministration2TemplateId(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministration2TemplateId(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration2 The receiving '<em><b>Precondition For Substance Administration2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministration2TemplateId(
			PreconditionForSubstanceAdministration2 preconditionForSubstanceAdministration2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministration2TemplateId",
			"ERROR");

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministration2TemplateId"),
						new Object[] { preconditionForSubstanceAdministration2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationCodeP(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCodeP(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationCodeP(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCodeP(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration2 The receiving '<em><b>Precondition For Substance Administration2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationCodeP(
			PreconditionForSubstanceAdministration2 preconditionForSubstanceAdministration2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationCodeP", "ERROR");

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationCodeP"),
						new Object[] { preconditionForSubstanceAdministration2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationValueP(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationValueP(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value.oclIsUndefined() or self.value.isNullFlavorUndefined()) implies (not self.value.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationValueP(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationValueP(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration2 The receiving '<em><b>Precondition For Substance Administration2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationValueP(
			PreconditionForSubstanceAdministration2 preconditionForSubstanceAdministration2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationValueP", "ERROR");

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationValueP"),
						new Object[] { preconditionForSubstanceAdministration2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationCode(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCode(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationCode(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCode(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration2 The receiving '<em><b>Precondition For Substance Administration2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationCode(
			PreconditionForSubstanceAdministration2 preconditionForSubstanceAdministration2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationCode", "ERROR");

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationCode"),
						new Object[] { preconditionForSubstanceAdministration2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationText(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationText(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (true)";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationText(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationText(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration2 The receiving '<em><b>Precondition For Substance Administration2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationText(
			PreconditionForSubstanceAdministration2 preconditionForSubstanceAdministration2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationText", "ERROR");

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationText"),
						new Object[] { preconditionForSubstanceAdministration2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationValue(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationValue(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value.oclIsUndefined() or self.value.isNullFlavorUndefined()) implies (not self.value.oclIsUndefined() and self.value.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.value.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationValue(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationValue(PreconditionForSubstanceAdministration2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration2 The receiving '<em><b>Precondition For Substance Administration2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationValue(
			PreconditionForSubstanceAdministration2 preconditionForSubstanceAdministration2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationValue", "ERROR");

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministration2PreconditionForSubstanceAdministrationValue"),
						new Object[] { preconditionForSubstanceAdministration2 }));
			}

			return false;
		}
		return true;
	}

} // PreconditionForSubstanceAdministration2Operations
