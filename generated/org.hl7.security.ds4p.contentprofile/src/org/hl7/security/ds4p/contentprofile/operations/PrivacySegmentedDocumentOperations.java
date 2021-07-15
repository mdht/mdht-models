/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection;
import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Segmented Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#validatePrivacySegmentedDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#validatePrivacySegmentedDocumentAuthor1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Author1</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#validatePrivacySegmentedDocumentSegmentedSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Segmented Section</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Privacy And Security Markings Section</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#getSegmentedSections() <em>Get Segmented Sections</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#getPrivacyAndSecurityMarkingsSections() <em>Get Privacy And Security Markings Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacySegmentedDocumentOperations extends GeneralHeaderConstraintsOperations {

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
	protected PrivacySegmentedDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacySegmentedDocumentTemplateId(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedDocumentTemplateId(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacySegmentedDocumentTemplateId(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedDocumentTemplateId(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacySegmentedDocument The receiving '<em><b>Privacy Segmented Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacySegmentedDocumentTemplateId(PrivacySegmentedDocument privacySegmentedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacySegmentedDocumentPrivacySegmentedDocumentTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT);
			try {
				VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacySegmentedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_SEGMENTED_DOCUMENT__PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacySegmentedDocumentPrivacySegmentedDocumentTemplateId"),
						 new Object [] { privacySegmentedDocument }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacySegmentedDocumentAuthor1(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Author1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedDocumentAuthor1(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(contentprofile::MandatoryDocumentProvenance))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacySegmentedDocumentAuthor1(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Author1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedDocumentAuthor1(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacySegmentedDocument The receiving '<em><b>Privacy Segmented Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacySegmentedDocumentAuthor1(PrivacySegmentedDocument privacySegmentedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacySegmentedDocumentPrivacySegmentedDocumentAuthor1","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT);
			try {
				VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacySegmentedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_SEGMENTED_DOCUMENT__PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacySegmentedDocumentPrivacySegmentedDocumentAuthor1"),
						 new Object [] { privacySegmentedDocument }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacySegmentedDocumentSegmentedSection(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Segmented Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedDocumentSegmentedSection(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(contentprofile::PrivacySegmentedSection))->size() >= 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacySegmentedDocumentSegmentedSection(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Segmented Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedDocumentSegmentedSection(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacySegmentedDocument The receiving '<em><b>Privacy Segmented Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacySegmentedDocumentSegmentedSection(
			PrivacySegmentedDocument privacySegmentedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacySegmentedDocumentPrivacySegmentedDocumentSegmentedSection","INFO");
    
  	  
  	  
		if (VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT);
			try {
				VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacySegmentedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_SEGMENTED_DOCUMENT__PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacySegmentedDocumentPrivacySegmentedDocumentSegmentedSection"),
						 new Object [] { privacySegmentedDocument }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Privacy And Security Markings Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(contentprofile::PrivacyMarkingsSection))->size() >= 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Privacy And Security Markings Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(PrivacySegmentedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacySegmentedDocument The receiving '<em><b>Privacy Segmented Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(
			PrivacySegmentedDocument privacySegmentedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacySegmentedDocumentPrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection","WARNING");
    
  	  
  	  
		if (VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT);
			try {
				VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacySegmentedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_SEGMENTED_DOCUMENT__PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacySegmentedDocumentPrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection"),
						 new Object [] { privacySegmentedDocument }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSegmentedSections(PrivacySegmentedDocument) <em>Get Segmented Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentedSections(PrivacySegmentedDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEGMENTED_SECTIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(contentprofile::PrivacySegmentedSection)).oclAsType(contentprofile::PrivacySegmentedSection)";

	/**
	 * The cached OCL query for the '{@link #getSegmentedSections(PrivacySegmentedDocument) <em>Get Segmented Sections</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentedSections(PrivacySegmentedDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEGMENTED_SECTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PrivacySegmentedSection> getSegmentedSections(
			PrivacySegmentedDocument privacySegmentedDocument) {
	
	
	
		if (GET_SEGMENTED_SECTIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT, CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT.getEAllOperations().get(324));
			try {
				GET_SEGMENTED_SECTIONS__EOCL_QRY = helper.createQuery(GET_SEGMENTED_SECTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SEGMENTED_SECTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PrivacySegmentedSection> result = (Collection<PrivacySegmentedSection>) query.evaluate(privacySegmentedDocument);
		return new BasicEList.UnmodifiableEList<PrivacySegmentedSection>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrivacyAndSecurityMarkingsSections(PrivacySegmentedDocument) <em>Get Privacy And Security Markings Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyAndSecurityMarkingsSections(PrivacySegmentedDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIVACY_AND_SECURITY_MARKINGS_SECTIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(contentprofile::PrivacyMarkingsSection)).oclAsType(contentprofile::PrivacyMarkingsSection)";

	/**
	 * The cached OCL query for the '{@link #getPrivacyAndSecurityMarkingsSections(PrivacySegmentedDocument) <em>Get Privacy And Security Markings Sections</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyAndSecurityMarkingsSections(PrivacySegmentedDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIVACY_AND_SECURITY_MARKINGS_SECTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PrivacyMarkingsSection> getPrivacyAndSecurityMarkingsSections(
			PrivacySegmentedDocument privacySegmentedDocument) {
	
	
	
		if (GET_PRIVACY_AND_SECURITY_MARKINGS_SECTIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT, CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT.getEAllOperations().get(325));
			try {
				GET_PRIVACY_AND_SECURITY_MARKINGS_SECTIONS__EOCL_QRY = helper.createQuery(GET_PRIVACY_AND_SECURITY_MARKINGS_SECTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRIVACY_AND_SECURITY_MARKINGS_SECTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PrivacyMarkingsSection> result = (Collection<PrivacyMarkingsSection>) query.evaluate(privacySegmentedDocument);
		return new BasicEList.UnmodifiableEList<PrivacyMarkingsSection>(result.size(), result.toArray());
	}

} // PrivacySegmentedDocumentOperations
