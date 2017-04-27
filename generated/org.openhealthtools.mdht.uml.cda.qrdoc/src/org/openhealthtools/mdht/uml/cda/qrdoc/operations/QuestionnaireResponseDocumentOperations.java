/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPlugin;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocument;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionnaire Response Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocument#validateQuestionnaireResponseDocumentQuestionnaireResponseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Questionnaire Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocument#getQuestionnaireResponseSection() <em>Get Questionnaire Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocument#validateQuestionnaireResponseDocumentHeaderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireResponseDocumentOperations extends QuestionnaireResponseDocumentHeaderOperations {
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
	protected QuestionnaireResponseDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentQuestionnaireResponseSection(QuestionnaireResponseDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Questionnaire Response Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentQuestionnaireResponseSection(QuestionnaireResponseDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_QUESTIONNAIRE_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrdoc::QuestionnaireResponseSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentQuestionnaireResponseSection(QuestionnaireResponseDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Questionnaire Response Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentQuestionnaireResponseSection(QuestionnaireResponseDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_QUESTIONNAIRE_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocument The receiving '<em><b>Questionnaire Response Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentQuestionnaireResponseSection(
			QuestionnaireResponseDocument questionnaireResponseDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_QUESTIONNAIRE_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_QUESTIONNAIRE_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_QUESTIONNAIRE_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_QUESTIONNAIRE_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT__QUESTIONNAIRE_RESPONSE_DOCUMENT_QUESTIONNAIRE_RESPONSE_SECTION,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentQuestionnaireResponseDocumentQuestionnaireResponseSection"),
						 new Object [] { questionnaireResponseDocument }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionnaireResponseSection(QuestionnaireResponseDocument) <em>Get Questionnaire Response Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaireResponseSection(QuestionnaireResponseDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTIONNAIRE_RESPONSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrdoc::QuestionnaireResponseSection))->asSequence()->any(true).oclAsType(qrdoc::QuestionnaireResponseSection)";

	/**
	 * The cached OCL query for the '{@link #getQuestionnaireResponseSection(QuestionnaireResponseDocument) <em>Get Questionnaire Response Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaireResponseSection(QuestionnaireResponseDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTIONNAIRE_RESPONSE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static QuestionnaireResponseSection getQuestionnaireResponseSection(
			QuestionnaireResponseDocument questionnaireResponseDocument) {
	
	
	
		if (GET_QUESTIONNAIRE_RESPONSE_SECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT, QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT.getEAllOperations().get(46));
			try {
				GET_QUESTIONNAIRE_RESPONSE_SECTION__EOCL_QRY = helper.createQuery(GET_QUESTIONNAIRE_RESPONSE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTIONNAIRE_RESPONSE_SECTION__EOCL_QRY);
		return (QuestionnaireResponseSection) query.evaluate(questionnaireResponseDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderTemplateId(QuestionnaireResponseDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderTemplateId(QuestionnaireResponseDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.33.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderTemplateId(QuestionnaireResponseDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderTemplateId(QuestionnaireResponseDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocument The receiving '<em><b>Questionnaire Response Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderTemplateId(
			QuestionnaireResponseDocument questionnaireResponseDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireResponseDocumentQuestionnaireResponseDocumentHeaderTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireResponseDocument, context) }),
						 new Object [] { questionnaireResponseDocument }));
			}
			 
			return false;
		}
		return true;
	}

} // QuestionnaireResponseDocumentOperations
