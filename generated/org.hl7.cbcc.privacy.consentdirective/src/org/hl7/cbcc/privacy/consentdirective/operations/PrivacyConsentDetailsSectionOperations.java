/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Consent Details Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection#validatePrivacyConsentDetailsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection#validatePrivacyConsentDetailsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection#validatePrivacyConsentDetailsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection#validatePrivacyConsentDetailsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Title</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection#validatePrivacyConsentDetailsSectionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivacyConsentDetailsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentDetailsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDetailsSectionTemplateId(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionTemplateId(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.17')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDetailsSectionTemplateId(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionTemplateId(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDetailsSection The receiving '<em><b>Privacy Consent Details Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDetailsSectionTemplateId(PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DETAILS_SECTION);
			try {
				VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDetailsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDetailsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDetailsSection, context) }),
						 new Object [] { privacyConsentDetailsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDetailsSection The receiving '<em><b>Privacy Consent Details Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDetailsSectionCodeP(PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DETAILS_SECTION);
			try {
				VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDetailsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDetailsSectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDetailsSection, context) }),
						 new Object [] { privacyConsentDetailsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDetailsSectionCode(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionCode(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '64292-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDetailsSectionCode(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionCode(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDetailsSectionCodeP(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionCodeP(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDetailsSectionCodeP(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionCodeP(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDetailsSection The receiving '<em><b>Privacy Consent Details Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDetailsSectionCode(PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DETAILS_SECTION);
			try {
				VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDetailsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDetailsSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDetailsSection, context) }),
						 new Object [] { privacyConsentDetailsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDetailsSectionTitle(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionTitle(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Privacy Consent Directive Details')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDetailsSectionTitle(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionTitle(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDetailsSection The receiving '<em><b>Privacy Consent Details Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDetailsSectionTitle(PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DETAILS_SECTION);
			try {
				VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDetailsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_TITLE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDetailsSectionTitle", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDetailsSection, context) }),
						 new Object [] { privacyConsentDetailsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentDetailsSectionEntry(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionEntry(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consentdirective::ConsentDirectiveEntry) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentDetailsSectionEntry(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Details Section Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentDetailsSectionEntry(PrivacyConsentDetailsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentDetailsSection The receiving '<em><b>Privacy Consent Details Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentDetailsSectionEntry(PrivacyConsentDetailsSection privacyConsentDetailsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DETAILS_SECTION);
			try {
				VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_DETAILS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentDetailsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_DETAILS_SECTION__PRIVACY_CONSENT_DETAILS_SECTION_ENTRY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentDetailsSectionEntry", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentDetailsSection, context) }),
						 new Object [] { privacyConsentDetailsSection }));
			}
			return false;
		}
		return true;
	}

} // PrivacyConsentDetailsSectionOperations