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
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signatures Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Text</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Title</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignaturesSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignaturesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignaturesSectionTemplateId(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionTemplateId(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateSignaturesSectionTemplateId(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionTemplateId(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SIGNATURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signaturesSection The receiving '<em><b>Signatures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSignaturesSectionTemplateId(SignaturesSection signaturesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SIGNATURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURES_SECTION);
			try {
				VALIDATE_SIGNATURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNATURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SIGNATURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(signaturesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SIGNATURES_SECTION__SIGNATURES_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSignaturesSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(signaturesSection, context) }),
						 new Object [] { signaturesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signaturesSection The receiving '<em><b>Signatures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSignaturesSectionCodeP(SignaturesSection signaturesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SIGNATURES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURES_SECTION);
			try {
				VALIDATE_SIGNATURES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNATURES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SIGNATURES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(signaturesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SIGNATURES_SECTION__SIGNATURES_SECTION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSignaturesSectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(signaturesSection, context) }),
						 new Object [] { signaturesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignaturesSectionCode(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionCode(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '57017-6' and value.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateSignaturesSectionCode(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionCode(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SIGNATURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateSignaturesSectionCodeP(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionCodeP(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSignaturesSectionCodeP(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionCodeP(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SIGNATURES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signaturesSection The receiving '<em><b>Signatures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSignaturesSectionCode(SignaturesSection signaturesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SIGNATURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURES_SECTION);
			try {
				VALIDATE_SIGNATURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNATURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SIGNATURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(signaturesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SIGNATURES_SECTION__SIGNATURES_SECTION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSignaturesSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(signaturesSection, context) }),
						 new Object [] { signaturesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignaturesSectionText(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionText(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSignaturesSectionText(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionText(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SIGNATURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signaturesSection The receiving '<em><b>Signatures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSignaturesSectionText(SignaturesSection signaturesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SIGNATURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURES_SECTION);
			try {
				VALIDATE_SIGNATURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNATURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SIGNATURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(signaturesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SIGNATURES_SECTION__SIGNATURES_SECTION_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSignaturesSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(signaturesSection, context) }),
						 new Object [] { signaturesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignaturesSectionTitle(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionTitle(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Signatures')";

	/**
	 * The cached OCL invariant for the '{@link #validateSignaturesSectionTitle(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionTitle(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SIGNATURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signaturesSection The receiving '<em><b>Signatures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSignaturesSectionTitle(SignaturesSection signaturesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SIGNATURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURES_SECTION);
			try {
				VALIDATE_SIGNATURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNATURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SIGNATURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(signaturesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SIGNATURES_SECTION__SIGNATURES_SECTION_TITLE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSignaturesSectionTitle", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(signaturesSection, context) }),
						 new Object [] { signaturesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignaturesSectionEntry(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionEntry(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURES_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consentdirective::SignatureImageEntry) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSignaturesSectionEntry(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignaturesSectionEntry(SignaturesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SIGNATURES_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signaturesSection The receiving '<em><b>Signatures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSignaturesSectionEntry(SignaturesSection signaturesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SIGNATURES_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURES_SECTION);
			try {
				VALIDATE_SIGNATURES_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNATURES_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SIGNATURES_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(signaturesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SIGNATURES_SECTION__SIGNATURES_SECTION_ENTRY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSignaturesSectionEntry", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(signaturesSection, context) }),
						 new Object [] { signaturesSection }));
			}
			return false;
		}
		return true;
	}

} // SignaturesSectionOperations