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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>First Unit Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FirstUnitIndicatorOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstUnitIndicatorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFirstUnitIndicatorTemplateId(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorTemplateId(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FIRST_UNIT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.84')";

	/**
	 * The cached OCL invariant for the '{@link #validateFirstUnitIndicatorTemplateId(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorTemplateId(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FIRST_UNIT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param firstUnitIndicator The receiving '<em><b>First Unit Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFirstUnitIndicatorTemplateId(FirstUnitIndicator firstUnitIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FIRST_UNIT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_INDICATOR);
			try {
				VALIDATE_FIRST_UNIT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_INDICATOR__FIRST_UNIT_INDICATOR_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("FirstUnitIndicatorTemplateId"),
					new Object[] { firstUnitIndicator }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFirstUnitIndicatorMoodCode(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorMoodCode(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FIRST_UNIT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateFirstUnitIndicatorMoodCode(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorMoodCode(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FIRST_UNIT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param firstUnitIndicator The receiving '<em><b>First Unit Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFirstUnitIndicatorMoodCode(FirstUnitIndicator firstUnitIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FIRST_UNIT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_INDICATOR);
			try {
				VALIDATE_FIRST_UNIT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_INDICATOR__FIRST_UNIT_INDICATOR_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("FirstUnitIndicatorMoodCode"), new Object[] { firstUnitIndicator }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFirstUnitIndicatorCodeP(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorCodeP(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FIRST_UNIT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFirstUnitIndicatorCodeP(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorCodeP(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FIRST_UNIT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param firstUnitIndicator The receiving '<em><b>First Unit Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFirstUnitIndicatorCodeP(FirstUnitIndicator firstUnitIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FIRST_UNIT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_INDICATOR);
			try {
				VALIDATE_FIRST_UNIT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_INDICATOR__FIRST_UNIT_INDICATOR_CODE_P,
					EmspcrPlugin.INSTANCE.getString("FirstUnitIndicatorCodeP"), new Object[] { firstUnitIndicator }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicatorCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicatorCodeP", passToken);
				}
				passToken.add(firstUnitIndicator);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFirstUnitIndicatorCode(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorCode(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FIRST_UNIT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67481-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateFirstUnitIndicatorCode(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorCode(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FIRST_UNIT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param firstUnitIndicator The receiving '<em><b>First Unit Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFirstUnitIndicatorCode(FirstUnitIndicator firstUnitIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicatorCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(firstUnitIndicator)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_FIRST_UNIT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_INDICATOR);
			try {
				VALIDATE_FIRST_UNIT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_INDICATOR__FIRST_UNIT_INDICATOR_CODE,
					EmspcrPlugin.INSTANCE.getString("FirstUnitIndicatorCode"), new Object[] { firstUnitIndicator }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFirstUnitIndicatorValue(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorValue(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FIRST_UNIT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFirstUnitIndicatorValue(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFirstUnitIndicatorValue(FirstUnitIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FIRST_UNIT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param firstUnitIndicator The receiving '<em><b>First Unit Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFirstUnitIndicatorValue(FirstUnitIndicator firstUnitIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FIRST_UNIT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_INDICATOR);
			try {
				VALIDATE_FIRST_UNIT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_INDICATOR__FIRST_UNIT_INDICATOR_VALUE,
					EmspcrPlugin.INSTANCE.getString("FirstUnitIndicatorValue"), new Object[] { firstUnitIndicator }));
			}

			return false;
		}
		return true;
	}

} // FirstUnitIndicatorOperations
