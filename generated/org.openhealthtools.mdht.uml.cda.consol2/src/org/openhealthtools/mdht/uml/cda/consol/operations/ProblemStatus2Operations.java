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
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Status2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatus2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemStatus2Operations extends ProblemStatusOperations {

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
	protected ProblemStatus2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatus2TemplateId(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatus2TemplateId(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.6' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatus2TemplateId(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatus2TemplateId(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_STATUS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemStatus2 The receiving '<em><b>Problem Status2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemStatus2TemplateId(ProblemStatus2 problemStatus2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemStatus2ProblemStatus2TemplateId", "ERROR");

		if (VALIDATE_PROBLEM_STATUS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_STATUS2);
			try {
				VALIDATE_PROBLEM_STATUS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_STATUS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_STATUS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemStatus2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_STATUS2__PROBLEM_STATUS2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ProblemStatus2ProblemStatus2TemplateId"),
						new Object[] { problemStatus2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusTextReference(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusTextReference(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusTextReference(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusTextReference(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemStatus2 The receiving '<em><b>Problem Status2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemStatusTextReference(ProblemStatus2 problemStatus2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemStatus2ProblemStatusTextReference", "INFO");

		if (VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_STATUS2);
			try {
				VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemStatus2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_STATUS2__PROBLEM_STATUS_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("ProblemStatus2ProblemStatusTextReference"),
						new Object[] { problemStatus2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusReferenceValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusReferenceValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusReferenceValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusReferenceValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_STATUS_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemStatus2 The receiving '<em><b>Problem Status2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemStatusReferenceValue(ProblemStatus2 problemStatus2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemStatus2ProblemStatusReferenceValue", "INFO");

		if (VALIDATE_PROBLEM_STATUS_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_STATUS2);
			try {
				VALIDATE_PROBLEM_STATUS_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_STATUS_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_STATUS_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemStatus2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_STATUS2__PROBLEM_STATUS_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("ProblemStatus2ProblemStatusReferenceValue"),
						new Object[] { problemStatus2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusTextReferenceValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusTextReferenceValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusTextReferenceValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusTextReferenceValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemStatus2 The receiving '<em><b>Problem Status2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemStatusTextReferenceValue(ProblemStatus2 problemStatus2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemStatus2ProblemStatusTextReferenceValue", "INFO");

		if (VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_STATUS2);
			try {
				VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemStatus2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_STATUS2__PROBLEM_STATUS_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("ProblemStatus2ProblemStatusTextReferenceValue"),
						new Object[] { problemStatus2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusText(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusText(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (true)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusText(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusText(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_STATUS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemStatus2 The receiving '<em><b>Problem Status2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemStatusText(ProblemStatus2 problemStatus2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemStatus2ProblemStatusText", "ERROR");

		if (VALIDATE_PROBLEM_STATUS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_STATUS2);
			try {
				VALIDATE_PROBLEM_STATUS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_STATUS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROBLEM_STATUS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			problemStatus2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_STATUS2__PROBLEM_STATUS_TEXT,
						ConsolPlugin.INSTANCE.getString("ProblemStatus2ProblemStatusText"),
						new Object[] { problemStatus2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '55561003' or value.code = '73425007' or value.code = '413322009' or value.code = '246455001' or value.code = '263855007' or value.code = '444791000124109' or value.code = '444931000124107' or value.code = '277022003')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusValue(ProblemStatus2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemStatus2 The receiving '<em><b>Problem Status2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemStatusValue(ProblemStatus2 problemStatus2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemStatus2ProblemStatusValue", "ERROR");

		if (VALIDATE_PROBLEM_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_STATUS2);
			try {
				VALIDATE_PROBLEM_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROBLEM_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			problemStatus2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_STATUS2__PROBLEM_STATUS_VALUE,
						ConsolPlugin.INSTANCE.getString("ProblemStatus2ProblemStatusValue"),
						new Object[] { problemStatus2 }));
			}

			return false;
		}
		return true;
	}

} // ProblemStatus2Operations
