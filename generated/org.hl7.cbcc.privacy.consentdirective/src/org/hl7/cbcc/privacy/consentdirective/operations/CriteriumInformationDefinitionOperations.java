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
import org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Criterium Information Definition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Effective Time</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriteriumInformationDefinitionOperations extends ClinicalStatementOperations {
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
	protected CriteriumInformationDefinitionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumInformationDefinitionTemplateId(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumInformationDefinitionCriteriumInformationDefinitionTemplateId"),
						new Object[] { criteriumInformationDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumInformationDefinitionCodeP(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_CODE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumInformationDefinitionCriteriumInformationDefinitionCodeP"),
						new Object[] { criteriumInformationDefinition }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinitionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinitionCodeP", passToken);
				}
				passToken.add(criteriumInformationDefinition);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumInformationDefinitionCode(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinitionCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(criteriumInformationDefinition)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumInformationDefinitionCriteriumInformationDefinitionCode"),
						new Object[] { criteriumInformationDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumInformationDefinitionEffectiveTime(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumInformationDefinitionCriteriumInformationDefinitionEffectiveTime"),
						new Object[] { criteriumInformationDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumInformationDefinitionMoodCode(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumInformationDefinitionCriteriumInformationDefinitionMoodCode"),
						new Object[] { criteriumInformationDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCriteriumInformationDefinitionId(
			CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"CriteriumInformationDefinitionCriteriumInformationDefinitionId"),
						new Object[] { criteriumInformationDefinition }));
			}

			return false;
		}
		return true;
	}

} // CriteriumInformationDefinitionOperations
