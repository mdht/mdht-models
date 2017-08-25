/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.AuthorOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Consent Header Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor#validatePrivacyConsentHeaderAuthorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor#validatePrivacyConsentHeaderAuthorFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Function Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor#validatePrivacyConsentHeaderAuthorFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Function Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor#validatePrivacyConsentHeaderAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Time</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor#validatePrivacyConsentHeaderAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyConsentHeaderAuthorOperations extends AuthorOperations {
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
	protected PrivacyConsentHeaderAuthorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderAuthorTemplateId(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorTemplateId(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.2')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderAuthorTemplateId(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorTemplateId(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderAuthor The receiving '<em><b>Privacy Consent Header Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrivacyConsentHeaderAuthorTemplateId(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_AUTHOR);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyConsentHeaderAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"PrivacyConsentHeaderAuthorPrivacyConsentHeaderAuthorTemplateId"),
						new Object[] { privacyConsentHeaderAuthor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderAuthorFunctionCodeP(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorFunctionCodeP(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.functionCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderAuthorFunctionCodeP(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorFunctionCodeP(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderAuthor The receiving '<em><b>Privacy Consent Header Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrivacyConsentHeaderAuthorFunctionCodeP(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_AUTHOR);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyConsentHeaderAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"PrivacyConsentHeaderAuthorPrivacyConsentHeaderAuthorFunctionCodeP"),
						new Object[] { privacyConsentHeaderAuthor }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthorFunctionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthorFunctionCodeP", passToken);
				}
				passToken.add(privacyConsentHeaderAuthor);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderAuthorFunctionCode(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorFunctionCode(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.88' and (value.code = 'FAMMEMB' or value.code = 'CHILD' or value.code = 'CHLDINLAW' or value.code = 'EXT' or value.code = 'PRN' or value.code = 'SIB' or value.code = 'SPS')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderAuthorFunctionCode(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorFunctionCode(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderAuthor The receiving '<em><b>Privacy Consent Header Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrivacyConsentHeaderAuthorFunctionCode(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthorFunctionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(privacyConsentHeaderAuthor)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_AUTHOR);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyConsentHeaderAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_FUNCTION_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"PrivacyConsentHeaderAuthorPrivacyConsentHeaderAuthorFunctionCode"),
						new Object[] { privacyConsentHeaderAuthor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderAuthorTime(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorTime(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderAuthorTime(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorTime(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderAuthor The receiving '<em><b>Privacy Consent Header Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrivacyConsentHeaderAuthorTime(PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_AUTHOR);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyConsentHeaderAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_TIME,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"PrivacyConsentHeaderAuthorPrivacyConsentHeaderAuthorTime"),
						new Object[] { privacyConsentHeaderAuthor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderAuthorAssignedAuthor(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorAssignedAuthor(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(rim::Role))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderAuthorAssignedAuthor(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Author Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderAuthorAssignedAuthor(PrivacyConsentHeaderAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderAuthor The receiving '<em><b>Privacy Consent Header Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrivacyConsentHeaderAuthorAssignedAuthor(
			PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_AUTHOR);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_CONSENT_HEADER_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyConsentHeaderAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_AUTHOR__PRIVACY_CONSENT_HEADER_AUTHOR_ASSIGNED_AUTHOR,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"PrivacyConsentHeaderAuthorPrivacyConsentHeaderAuthorAssignedAuthor"),
						new Object[] { privacyConsentHeaderAuthor }));
			}

			return false;
		}
		return true;
	}

} // PrivacyConsentHeaderAuthorOperations
