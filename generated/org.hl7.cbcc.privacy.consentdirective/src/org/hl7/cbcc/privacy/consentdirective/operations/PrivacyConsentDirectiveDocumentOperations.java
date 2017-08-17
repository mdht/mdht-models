/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.ClinicalDocumentOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument;
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Consent Directive Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Title</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Privacy Consent Details Section</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentSignaturesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Signatures Section</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Authenticator</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Author</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Documentation Of</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Information Recipient</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Legal Authenticator</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Custodian</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Record Target</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Related Document</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#getPrivacyConsentDetailsSection() <em>Get Privacy Consent Details Section</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#getSignaturesSection() <em>Get Signatures Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivacyConsentDirectiveDocumentOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentDirectiveDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentTemplateId(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentTemplateId(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentTemplateId(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentTemplateId(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentTemplateId(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentCodeP(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentCodeP(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentCodeP(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentCodeP(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentCodeP(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentCode(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentCode(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '57016-8' and value.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentCode(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentCode(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentCode(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentTitle(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentTitle(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined() and self.title.getText() = 'Authorization for Disclosure'";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentTitle(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentTitle(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentTitle(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_TITLE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentTitle", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Privacy Consent Details Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_PRIVACY_CONSENT_DETAILS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consentdirective::PrivacyConsentDetailsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Privacy Consent Details Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_PRIVACY_CONSENT_DETAILS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_PRIVACY_CONSENT_DETAILS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_PRIVACY_CONSENT_DETAILS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_PRIVACY_CONSENT_DETAILS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_PRIVACY_CONSENT_DETAILS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_PRIVACY_CONSENT_DETAILS_SECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentSignaturesSection(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Signatures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentSignaturesSection(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_SIGNATURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consentdirective::SignaturesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentSignaturesSection(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Signatures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentSignaturesSection(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_SIGNATURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentSignaturesSection(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_SIGNATURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_SIGNATURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_SIGNATURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_SIGNATURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_SIGNATURES_SECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentSignaturesSection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentAuthenticator(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentAuthenticator(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentAuthenticator(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentAuthenticator(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentAuthenticator(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHENTICATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentAuthenticator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentAuthor(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentAuthor(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consentdirective::PrivacyConsentHeaderAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentAuthor(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentAuthor(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentAuthor(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_AUTHOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentAuthor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentDocumentationOf(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentDocumentationOf(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(consentdirective::PrivacyConsentHeaderDocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentDocumentationOf(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentDocumentationOf(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentDocumentationOf(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_DOCUMENTATION_OF,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentDocumentationOf", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentInformationRecipient(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentInformationRecipient(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentInformationRecipient(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentInformationRecipient(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentInformationRecipient(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_INFORMATION_RECIPIENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentInformationRecipient", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentLegalAuthenticator(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentLegalAuthenticator(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentLegalAuthenticator(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Legal Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentLegalAuthenticator(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentLegalAuthenticator(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_LEGAL_AUTHENTICATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentLegalAuthenticator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentCustodian(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentCustodian(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentCustodian(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentCustodian(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentCustodian(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_CUSTODIAN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentCustodian", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentRecordTarget(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentRecordTarget(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentRecordTarget(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentRecordTarget(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentRecordTarget(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RECORD_TARGET,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentRecordTarget", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDirectiveDocumentRelatedDocument(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Related Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentRelatedDocument(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->exists(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(rim::ActRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDirectiveDocumentRelatedDocument(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Related Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDirectiveDocumentRelatedDocument(PrivacyConsentDirectiveDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDirectiveDocument The receiving '<em><b>Privacy Consent Directive Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDirectiveDocumentRelatedDocument(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);
			try {
				VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDirectiveDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT__PRIVACY_CONSENT_DIRECTIVE_DOCUMENT_RELATED_DOCUMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDirectiveDocumentRelatedDocument", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDirectiveDocument, context) }),
						 new Object [] { privacyConsentDirectiveDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument) <em>Get Privacy Consent Details Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIVACY_CONSENT_DETAILS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consentdirective::PrivacyConsentDetailsSection))->asSequence()->any(true).oclAsType(consentdirective::PrivacyConsentDetailsSection)";

	/**
	 * The cached OCL query for the '{@link #getPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument) <em>Get Privacy Consent Details Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIVACY_CONSENT_DETAILS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PrivacyConsentDetailsSection getPrivacyConsentDetailsSection(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument) {
		if (GET_PRIVACY_CONSENT_DETAILS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT, CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT.getEAllOperations().get(43));
			try {
				GET_PRIVACY_CONSENT_DETAILS_SECTION__EOCL_QRY = helper.createQuery(GET_PRIVACY_CONSENT_DETAILS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIVACY_CONSENT_DETAILS_SECTION__EOCL_QRY);
		return (PrivacyConsentDetailsSection) query.evaluate(privacyConsentDirectiveDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSignaturesSection(PrivacyConsentDirectiveDocument) <em>Get Signatures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturesSection(PrivacyConsentDirectiveDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SIGNATURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consentdirective::SignaturesSection))->asSequence()->any(true).oclAsType(consentdirective::SignaturesSection)";

	/**
	 * The cached OCL query for the '{@link #getSignaturesSection(PrivacyConsentDirectiveDocument) <em>Get Signatures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturesSection(PrivacyConsentDirectiveDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SIGNATURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SignaturesSection getSignaturesSection(PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument) {
		if (GET_SIGNATURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT, CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT.getEAllOperations().get(44));
			try {
				GET_SIGNATURES_SECTION__EOCL_QRY = helper.createQuery(GET_SIGNATURES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SIGNATURES_SECTION__EOCL_QRY);
		return (SignaturesSection) query.evaluate(privacyConsentDirectiveDocument);
	}

} // PrivacyConsentDirectiveDocumentOperations