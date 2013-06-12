/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Billing Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillingConditionOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected BillingConditionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateBillingConditionTemplateId(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionTemplateId(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BILLING_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.91')";

	/**
	* The cached OCL invariant for the '{@link #validateBillingConditionTemplateId(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionTemplateId(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BILLING_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param billingCondition The receiving '<em><b>Billing Condition</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBillingConditionTemplateId(BillingCondition billingCondition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BILLING_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_CONDITION);
			try {
				VALIDATE_BILLING_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingCondition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_CONDITION__BILLING_CONDITION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("BillingConditionTemplateId"), new Object[] { billingCondition }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBillingConditionCodeP(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionCodeP(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BILLING_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateBillingConditionCodeP(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionCodeP(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BILLING_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param billingCondition The receiving '<em><b>Billing Condition</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBillingConditionCodeP(BillingCondition billingCondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BILLING_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_CONDITION);
			try {
				VALIDATE_BILLING_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingCondition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_CONDITION__BILLING_CONDITION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("BillingConditionCodeP"), new Object[] { billingCondition }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.BillingConditionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.BillingConditionCodeP", passToken);
				}
				passToken.add(billingCondition);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBillingConditionCode(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionCode(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BILLING_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67556-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateBillingConditionCode(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionCode(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BILLING_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param billingCondition The receiving '<em><b>Billing Condition</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBillingConditionCode(BillingCondition billingCondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.BillingConditionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(billingCondition)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_BILLING_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_CONDITION);
			try {
				VALIDATE_BILLING_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingCondition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_CONDITION__BILLING_CONDITION_CODE,
					EmspcrPlugin.INSTANCE.getString("BillingConditionCode"), new Object[] { billingCondition }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBillingConditionValue(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionValue(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BILLING_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.90'))";

	/**
	* The cached OCL invariant for the '{@link #validateBillingConditionValue(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionValue(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BILLING_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param billingCondition The receiving '<em><b>Billing Condition</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBillingConditionValue(BillingCondition billingCondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BILLING_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_CONDITION);
			try {
				VALIDATE_BILLING_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingCondition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_CONDITION__BILLING_CONDITION_VALUE,
					EmspcrPlugin.INSTANCE.getString("BillingConditionValue"), new Object[] { billingCondition }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBillingConditionValueP(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionValueP(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BILLING_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	* The cached OCL invariant for the '{@link #validateBillingConditionValueP(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionValueP(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BILLING_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param billingCondition The receiving '<em><b>Billing Condition</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBillingConditionValueP(BillingCondition billingCondition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BILLING_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_CONDITION);
			try {
				VALIDATE_BILLING_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingCondition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_CONDITION__BILLING_CONDITION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("BillingConditionValueP"), new Object[] { billingCondition }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBillingConditionMoodCode(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionMoodCode(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BILLING_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateBillingConditionMoodCode(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBillingConditionMoodCode(BillingCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BILLING_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param billingCondition The receiving '<em><b>Billing Condition</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBillingConditionMoodCode(BillingCondition billingCondition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BILLING_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_CONDITION);
			try {
				VALIDATE_BILLING_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingCondition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_CONDITION__BILLING_CONDITION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("BillingConditionMoodCode"), new Object[] { billingCondition }));
			}

			return false;
		}
		return true;
	}

} // BillingConditionOperations
