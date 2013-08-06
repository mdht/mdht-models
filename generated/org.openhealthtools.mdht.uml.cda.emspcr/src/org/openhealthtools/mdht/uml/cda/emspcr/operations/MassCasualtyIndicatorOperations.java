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
import org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mass Casualty Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MassCasualtyIndicatorOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MassCasualtyIndicatorOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateMassCasualtyIndicatorTemplateId(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorTemplateId(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MASS_CASUALTY_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.87')";

	/**
	* The cached OCL invariant for the '{@link #validateMassCasualtyIndicatorTemplateId(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorTemplateId(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MASS_CASUALTY_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param massCasualtyIndicator The receiving '<em><b>Mass Casualty Indicator</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMassCasualtyIndicatorTemplateId(MassCasualtyIndicator massCasualtyIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MASS_CASUALTY_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MASS_CASUALTY_INDICATOR);
			try {
				VALIDATE_MASS_CASUALTY_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MASS_CASUALTY_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MASS_CASUALTY_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			massCasualtyIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MASS_CASUALTY_INDICATOR__MASS_CASUALTY_INDICATOR_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("MassCasualtyIndicatorTemplateId"),
					new Object[] { massCasualtyIndicator }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMassCasualtyIndicatorCodeP(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorCodeP(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MASS_CASUALTY_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMassCasualtyIndicatorCodeP(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorCodeP(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MASS_CASUALTY_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param massCasualtyIndicator The receiving '<em><b>Mass Casualty Indicator</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMassCasualtyIndicatorCodeP(MassCasualtyIndicator massCasualtyIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MASS_CASUALTY_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MASS_CASUALTY_INDICATOR);
			try {
				VALIDATE_MASS_CASUALTY_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MASS_CASUALTY_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MASS_CASUALTY_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			massCasualtyIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MASS_CASUALTY_INDICATOR__MASS_CASUALTY_INDICATOR_CODE_P,
					EmspcrPlugin.INSTANCE.getString("MassCasualtyIndicatorCodeP"),
					new Object[] { massCasualtyIndicator }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicatorCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicatorCodeP", passToken);
				}
				passToken.add(massCasualtyIndicator);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMassCasualtyIndicatorCode(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorCode(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MASS_CASUALTY_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67490-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateMassCasualtyIndicatorCode(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorCode(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MASS_CASUALTY_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param massCasualtyIndicator The receiving '<em><b>Mass Casualty Indicator</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMassCasualtyIndicatorCode(MassCasualtyIndicator massCasualtyIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicatorCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(massCasualtyIndicator)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MASS_CASUALTY_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MASS_CASUALTY_INDICATOR);
			try {
				VALIDATE_MASS_CASUALTY_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MASS_CASUALTY_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MASS_CASUALTY_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			massCasualtyIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MASS_CASUALTY_INDICATOR__MASS_CASUALTY_INDICATOR_CODE,
					EmspcrPlugin.INSTANCE.getString("MassCasualtyIndicatorCode"),
					new Object[] { massCasualtyIndicator }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMassCasualtyIndicatorValue(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorValue(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MASS_CASUALTY_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	* The cached OCL invariant for the '{@link #validateMassCasualtyIndicatorValue(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorValue(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MASS_CASUALTY_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param massCasualtyIndicator The receiving '<em><b>Mass Casualty Indicator</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMassCasualtyIndicatorValue(MassCasualtyIndicator massCasualtyIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MASS_CASUALTY_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MASS_CASUALTY_INDICATOR);
			try {
				VALIDATE_MASS_CASUALTY_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MASS_CASUALTY_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MASS_CASUALTY_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			massCasualtyIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MASS_CASUALTY_INDICATOR__MASS_CASUALTY_INDICATOR_VALUE,
					EmspcrPlugin.INSTANCE.getString("MassCasualtyIndicatorValue"),
					new Object[] { massCasualtyIndicator }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMassCasualtyIndicatorMoodCode(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorMoodCode(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MASS_CASUALTY_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateMassCasualtyIndicatorMoodCode(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMassCasualtyIndicatorMoodCode(MassCasualtyIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MASS_CASUALTY_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param massCasualtyIndicator The receiving '<em><b>Mass Casualty Indicator</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMassCasualtyIndicatorMoodCode(MassCasualtyIndicator massCasualtyIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MASS_CASUALTY_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MASS_CASUALTY_INDICATOR);
			try {
				VALIDATE_MASS_CASUALTY_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MASS_CASUALTY_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MASS_CASUALTY_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			massCasualtyIndicator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MASS_CASUALTY_INDICATOR__MASS_CASUALTY_INDICATOR_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("MassCasualtyIndicatorMoodCode"),
					new Object[] { massCasualtyIndicator }));
			}

			return false;
		}
		return true;
	}

} // MassCasualtyIndicatorOperations
