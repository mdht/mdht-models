/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection;

import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Segmented Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection#validatePrivacySegmentedSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection#validatePrivacySegmentedSectionConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Confidentiality Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection#validatePrivacySegmentedSectionConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Confidentiality Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection#validatePrivacySegmentedSectionAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacySegmentedSectionOperations extends SectionOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
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
	protected PrivacySegmentedSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacySegmentedSectionTemplateId(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedSectionTemplateId(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.10')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacySegmentedSectionTemplateId(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedSectionTemplateId(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacySegmentedSection The receiving '<em><b>Privacy Segmented Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacySegmentedSectionTemplateId(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_SECTION);
			try {
				VALIDATE_PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacySegmentedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_SEGMENTED_SECTION__PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacySegmentedSectionPrivacySegmentedSectionTemplateId"),
						 new Object [] { privacySegmentedSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacySegmentedSectionConfidentialityCode(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedSectionConfidentialityCode(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacySegmentedSectionConfidentialityCode(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedSectionConfidentialityCode(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacySegmentedSection The receiving '<em><b>Privacy Segmented Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacySegmentedSectionConfidentialityCode(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_SECTION);
			try {
				VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacySegmentedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_SEGMENTED_SECTION__PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacySegmentedSectionPrivacySegmentedSectionConfidentialityCode"),
						 new Object [] { privacySegmentedSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacySegmentedSectionConfidentialityCodeP(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Confidentiality Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedSectionConfidentialityCodeP(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.confidentialityCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacySegmentedSectionConfidentialityCodeP(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Confidentiality Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedSectionConfidentialityCodeP(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacySegmentedSection The receiving '<em><b>Privacy Segmented Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacySegmentedSectionConfidentialityCodeP(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_SECTION);
			try {
				VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacySegmentedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_SEGMENTED_SECTION__PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacySegmentedSectionPrivacySegmentedSectionConfidentialityCodeP"),
						 new Object [] { privacySegmentedSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacySegmentedSectionAuthor(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedSectionAuthor(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_SEGMENTED_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(contentprofile::MandatoryEntryProvenance))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacySegmentedSectionAuthor(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedSectionAuthor(PrivacySegmentedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_SEGMENTED_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacySegmentedSection The receiving '<em><b>Privacy Segmented Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacySegmentedSectionAuthor(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_SEGMENTED_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_SECTION);
			try {
				VALIDATE_PRIVACY_SEGMENTED_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_SEGMENTED_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_SEGMENTED_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacySegmentedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_SEGMENTED_SECTION__PRIVACY_SEGMENTED_SECTION_AUTHOR,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacySegmentedSectionPrivacySegmentedSectionAuthor"),
						 new Object [] { privacySegmentedSection }));
			}
			 
			return false;
		}
		return true;
	}

} // PrivacySegmentedSectionOperations