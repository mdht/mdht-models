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
import org.hl7.cbcc.privacy.consentdirective.ConsentAction;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consent Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Negation Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsentActionOperations extends ClinicalStatementOperations {
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
	protected ConsentActionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionTemplateId(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionTemplateId(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionTemplateId(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionTemplateId(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentActionTemplateId(ConsentAction consentAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consentAction)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ConsentActionConsentActionTemplateId"),
						new Object[] { consentAction }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionCodeP(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionCodeP(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionCodeP(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionCodeP(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentActionCodeP(ConsentAction consentAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			consentAction)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_CODE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ConsentActionConsentActionCodeP"),
						new Object[] { consentAction }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.cbcc.privacy.consentdirective.ConsentActionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.hl7.cbcc.privacy.consentdirective.ConsentActionCodeP", passToken);
				}
				passToken.add(consentAction);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'IDISCL' or value.code = 'ICOL' or value.code = 'INFASO' or value.code = 'IRDSCL' or value.code = 'RESEARCH' or value.code = 'RSREID' or value.code = 'INFAO'";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentActionCode(ConsentAction consentAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.cbcc.privacy.consentdirective.ConsentActionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(consentAction)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			consentAction)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ConsentActionConsentActionCode"),
						new Object[] { consentAction }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionMoodCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionMoodCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionMoodCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionMoodCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentActionMoodCode(ConsentAction consentAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			consentAction)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_MOOD_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ConsentActionConsentActionMoodCode"),
						new Object[] { consentAction }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionNegationInd(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionNegationInd(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionNegationInd(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionNegationInd(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentActionNegationInd(ConsentAction consentAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consentAction)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_NEGATION_IND,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ConsentActionConsentActionNegationInd"),
						new Object[] { consentAction }));
			}

			return false;
		}
		return true;
	}

} // ConsentActionOperations
