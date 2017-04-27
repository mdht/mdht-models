/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPlugin;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionnaire Response Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection#validateQuestionnaireResponseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection#validateQuestionnaireResponseSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection#validateQuestionnaireResponseSectionLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection#validateQuestionnaireResponseSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection#validateQuestionnaireResponseSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireResponseSectionOperations extends SectionOperations {
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
	protected QuestionnaireResponseSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseSectionTemplateId(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionTemplateId(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.33.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseSectionTemplateId(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionTemplateId(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseSection The receiving '<em><b>Questionnaire Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseSectionTemplateId(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_TEMPLATE_ID,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseSectionQuestionnaireResponseSectionTemplateId"),
						 new Object [] { questionnaireResponseSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseSectionCode(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionCode(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseSectionCode(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionCode(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseSection The receiving '<em><b>Questionnaire Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseSectionCode(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_CODE,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseSectionQuestionnaireResponseSectionCode"),
						 new Object [] { questionnaireResponseSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseSectionLanguageCode(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionLanguageCode(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseSectionLanguageCode(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionLanguageCode(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseSection The receiving '<em><b>Questionnaire Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseSectionLanguageCode(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_LANGUAGE_CODE,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseSectionQuestionnaireResponseSectionLanguageCode"),
						 new Object [] { questionnaireResponseSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseSectionText(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionText(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseSectionText(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionText(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseSection The receiving '<em><b>Questionnaire Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseSectionText(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_TEXT,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseSectionQuestionnaireResponseSectionText"),
						 new Object [] { questionnaireResponseSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseSectionTitle(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionTitle(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseSectionTitle(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseSectionTitle(QuestionnaireResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseSection The receiving '<em><b>Questionnaire Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseSectionTitle(
			QuestionnaireResponseSection questionnaireResponseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_SECTION__QUESTIONNAIRE_RESPONSE_SECTION_TITLE,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseSectionQuestionnaireResponseSectionTitle"),
						 new Object [] { questionnaireResponseSection }));
			}
			 
			return false;
		}
		return true;
	}

} // QuestionnaireResponseSectionOperations
