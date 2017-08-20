/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Criterium Related Protected Problem</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem#validateCriteriumRelatedProtectedProblemTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem#validateCriteriumRelatedProtectedProblemCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem#validateCriteriumRelatedProtectedProblemCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem#validateCriteriumRelatedProtectedProblemValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Value</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem#validateCriteriumRelatedProtectedProblemValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriteriumRelatedProtectedProblemOperations extends ClinicalStatementOperations {
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
	protected CriteriumRelatedProtectedProblemOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumRelatedProtectedProblemTemplateId(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemTemplateId(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumRelatedProtectedProblemTemplateId(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemTemplateId(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumRelatedProtectedProblem The receiving '<em><b>Criterium Related Protected Problem</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumRelatedProtectedProblemTemplateId(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_RELATED_PROTECTED_PROBLEM);
			try {
				VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumRelatedProtectedProblem)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumRelatedProtectedProblemCriteriumRelatedProtectedProblemTemplateId"),
						new Object[] { criteriumRelatedProtectedProblem }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumRelatedProtectedProblemCodeP(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemCodeP(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumRelatedProtectedProblemCodeP(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemCodeP(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumRelatedProtectedProblem The receiving '<em><b>Criterium Related Protected Problem</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumRelatedProtectedProblemCodeP(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_RELATED_PROTECTED_PROBLEM);
			try {
				VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumRelatedProtectedProblem)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumRelatedProtectedProblemCriteriumRelatedProtectedProblemCodeP"),
						new Object[] { criteriumRelatedProtectedProblem }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblemCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblemCodeP", passToken);
				}
				passToken.add(criteriumRelatedProtectedProblem);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumRelatedProtectedProblemCode(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemCode(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006' or value.code = '373930000')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumRelatedProtectedProblemCode(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemCode(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumRelatedProtectedProblem The receiving '<em><b>Criterium Related Protected Problem</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumRelatedProtectedProblemCode(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblemCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(criteriumRelatedProtectedProblem)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_RELATED_PROTECTED_PROBLEM);
			try {
				VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumRelatedProtectedProblem)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumRelatedProtectedProblemCriteriumRelatedProtectedProblemCode"),
						new Object[] { criteriumRelatedProtectedProblem }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumRelatedProtectedProblemValue(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemValue(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumRelatedProtectedProblemValue(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemValue(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumRelatedProtectedProblem The receiving '<em><b>Criterium Related Protected Problem</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumRelatedProtectedProblemValue(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_RELATED_PROTECTED_PROBLEM);
			try {
				VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumRelatedProtectedProblem)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumRelatedProtectedProblemCriteriumRelatedProtectedProblemValue"),
						new Object[] { criteriumRelatedProtectedProblem }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumRelatedProtectedProblemValueP(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemValueP(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD))";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumRelatedProtectedProblemValueP(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Related Protected Problem Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumRelatedProtectedProblemValueP(CriteriumRelatedProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumRelatedProtectedProblem The receiving '<em><b>Criterium Related Protected Problem</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumRelatedProtectedProblemValueP(
			CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_RELATED_PROTECTED_PROBLEM);
			try {
				VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumRelatedProtectedProblem)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_RELATED_PROTECTED_PROBLEM__CRITERIUM_RELATED_PROTECTED_PROBLEM_VALUE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumRelatedProtectedProblemCriteriumRelatedProtectedProblemValueP"),
						new Object[] { criteriumRelatedProtectedProblem }));
			}

			return false;
		}
		return true;
	}

} // CriteriumRelatedProtectedProblemOperations
