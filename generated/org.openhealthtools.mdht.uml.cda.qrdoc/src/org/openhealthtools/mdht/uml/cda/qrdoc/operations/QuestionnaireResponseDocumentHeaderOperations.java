/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalDocumentOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPlugin;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionnaire Response Document Header</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader#validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header In Fulfillment Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireResponseDocumentHeaderOperations extends ClinicalDocumentOperations {
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
	protected QuestionnaireResponseDocumentHeaderOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderTemplateId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderTemplateId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.33')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderTemplateId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderTemplateId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderTemplateId(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TEMPLATE_ID,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderTemplateId"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderConfidentialityCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderConfidentialityCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderConfidentialityCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderConfidentialityCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderConfidentialityCode(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CONFIDENTIALITY_CODE,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderConfidentialityCode"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderEffectiveTime(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderEffectiveTime(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderEffectiveTime(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderEffectiveTime(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderEffectiveTime(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_EFFECTIVE_TIME,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderEffectiveTime"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderId(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_ID,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderId"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderLanguageCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderLanguageCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderLanguageCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderLanguageCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderLanguageCode(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LANGUAGE_CODE,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderLanguageCode"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderRealmCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderRealmCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderRealmCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderRealmCode(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderRealmCode(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_REALM_CODE,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderRealmCode"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderTitle(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderTitle(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderTitle(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderTitle(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderTitle(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TITLE,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderTitle"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderTypeId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderTypeId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderTypeId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderTypeId(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderTypeId(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_TYPE_ID,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderTypeId"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderRecordTarget(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderRecordTarget(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderRecordTarget(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderRecordTarget(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderRecordTarget(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_RECORD_TARGET,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderRecordTarget"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderAuthor(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderAuthor(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderAuthor(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderAuthor(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderAuthor(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_AUTHOR,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderAuthor"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderDataEnterer(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderDataEnterer(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderDataEnterer(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Data Enterer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderDataEnterer(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderDataEnterer(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_DATA_ENTERER,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderDataEnterer"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderInformant(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderInformant(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderInformant(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderInformant(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderInformant(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMANT,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderInformant"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderCustodian(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderCustodian(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderCustodian(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderCustodian(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderCustodian(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_CUSTODIAN,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderCustodian"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderInformationRecipient(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderInformationRecipient(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderInformationRecipient(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderInformationRecipient(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderInformationRecipient(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_INFORMATION_RECIPIENT,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderInformationRecipient"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header Legal Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_LEGAL_AUTHENTICATOR,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderLegalAuthenticator"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Response Document Header In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(QuestionnaireResponseDocumentHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireResponseDocumentHeader The receiving '<em><b>Questionnaire Response Document Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(
			QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);
			try {
				VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireResponseDocumentHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER__QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER_IN_FULFILLMENT_OF,
						 QRDOCPlugin.INSTANCE.getString("QuestionnaireResponseDocumentHeaderQuestionnaireResponseDocumentHeaderInFulfillmentOf"),
						 new Object [] { questionnaireResponseDocumentHeader }));
			}
			 
			return false;
		}
		return true;
	}

} // QuestionnaireResponseDocumentHeaderOperations
