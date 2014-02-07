/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury Risk Factor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor#validateInjuryRiskFactorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor#validateInjuryRiskFactorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor#validateInjuryRiskFactorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor#validateInjuryRiskFactorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InjuryRiskFactorOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjuryRiskFactorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryRiskFactorTemplateId(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryRiskFactorTemplateId(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.53')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryRiskFactorTemplateId(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryRiskFactorTemplateId(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INJURY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryRiskFactor The receiving '<em><b>Injury Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInjuryRiskFactorTemplateId(InjuryRiskFactor injuryRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INJURY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_RISK_FACTOR);
			try {
				VALIDATE_INJURY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			injuryRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.INJURY_RISK_FACTOR__INJURY_RISK_FACTOR_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("InjuryRiskFactorTemplateId"), new Object[] { injuryRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryRiskFactorMoodCode(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryRiskFactorMoodCode(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryRiskFactorMoodCode(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryRiskFactorMoodCode(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INJURY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryRiskFactor The receiving '<em><b>Injury Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInjuryRiskFactorMoodCode(InjuryRiskFactor injuryRiskFactor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INJURY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_RISK_FACTOR);
			try {
				VALIDATE_INJURY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			injuryRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.INJURY_RISK_FACTOR__INJURY_RISK_FACTOR_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("InjuryRiskFactorMoodCode"), new Object[] { injuryRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryRiskFactorCode(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryRiskFactorCode(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67496-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryRiskFactorCode(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryRiskFactorCode(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INJURY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryRiskFactor The receiving '<em><b>Injury Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInjuryRiskFactorCode(InjuryRiskFactor injuryRiskFactor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INJURY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_RISK_FACTOR);
			try {
				VALIDATE_INJURY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			injuryRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.INJURY_RISK_FACTOR__INJURY_RISK_FACTOR_CODE,
					EmspcrPlugin.INSTANCE.getString("InjuryRiskFactorCode"), new Object[] { injuryRiskFactor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryRiskFactorValue(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryRiskFactorValue(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17348-6' or value.code = 'LA17349-4' or value.code = 'LA17350-2' or value.code = 'LA17352-8' or value.code = 'LA17353-6' or value.code = 'LA17357-7' or value.code = 'LA17360-1' or value.code = 'LA18124-0')))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryRiskFactorValue(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryRiskFactorValue(InjuryRiskFactor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INJURY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryRiskFactor The receiving '<em><b>Injury Risk Factor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInjuryRiskFactorValue(InjuryRiskFactor injuryRiskFactor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INJURY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_RISK_FACTOR);
			try {
				VALIDATE_INJURY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			injuryRiskFactor)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.INJURY_RISK_FACTOR__INJURY_RISK_FACTOR_VALUE,
					EmspcrPlugin.INSTANCE.getString("InjuryRiskFactorValue"), new Object[] { injuryRiskFactor }));
			}

			return false;
		}
		return true;
	}

} // InjuryRiskFactorOperations
