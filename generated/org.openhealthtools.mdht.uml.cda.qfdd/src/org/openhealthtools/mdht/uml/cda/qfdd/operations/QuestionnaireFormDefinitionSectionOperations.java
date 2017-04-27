/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionnaire Form Definition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection#validateQuestionnaireFormDefinitionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection#validateQuestionnaireFormDefinitionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection#validateQuestionnaireFormDefinitionSectionLanguageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Language Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection#validateQuestionnaireFormDefinitionSectionLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection#validateQuestionnaireFormDefinitionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection#validateQuestionnaireFormDefinitionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection#validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Questions Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection#getQuestionsOrganizers() <em>Get Questions Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireFormDefinitionSectionOperations extends SectionOperations {
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
	protected QuestionnaireFormDefinitionSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFormDefinitionSectionTemplateId(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionTemplateId(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFormDefinitionSectionTemplateId(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionTemplateId(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFormDefinitionSection The receiving '<em><b>Questionnaire Form Definition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireFormDefinitionSectionTemplateId(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireFormDefinitionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionnaireFormDefinitionSectionQuestionnaireFormDefinitionSectionTemplateId"),
						 new Object [] { questionnaireFormDefinitionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFormDefinitionSectionCode(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionCode(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFormDefinitionSectionCode(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionCode(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFormDefinitionSection The receiving '<em><b>Questionnaire Form Definition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireFormDefinitionSectionCode(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireFormDefinitionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionnaireFormDefinitionSectionQuestionnaireFormDefinitionSectionCode"),
						 new Object [] { questionnaireFormDefinitionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFormDefinitionSectionLanguageCodeP(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Language Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionLanguageCodeP(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFormDefinitionSectionLanguageCodeP(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Language Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionLanguageCodeP(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFormDefinitionSection The receiving '<em><b>Questionnaire Form Definition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireFormDefinitionSectionLanguageCodeP(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireFormDefinitionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE_P,
						 QFDDPlugin.INSTANCE.getString("QuestionnaireFormDefinitionSectionQuestionnaireFormDefinitionSectionLanguageCodeP"),
						 new Object [] { questionnaireFormDefinitionSection }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSectionLanguageCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSectionLanguageCodeP", passToken);
				}
				passToken.add(questionnaireFormDefinitionSection);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFormDefinitionSectionLanguageCode(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionLanguageCode(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in "+
"not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFormDefinitionSectionLanguageCode(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionLanguageCode(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFormDefinitionSection The receiving '<em><b>Questionnaire Form Definition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireFormDefinitionSectionLanguageCode(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSectionLanguageCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(questionnaireFormDefinitionSection)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireFormDefinitionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionnaireFormDefinitionSectionQuestionnaireFormDefinitionSectionLanguageCode"),
						 new Object [] { questionnaireFormDefinitionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFormDefinitionSectionText(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionText(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFormDefinitionSectionText(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionText(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFormDefinitionSection The receiving '<em><b>Questionnaire Form Definition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireFormDefinitionSectionText(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireFormDefinitionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_TEXT,
						 QFDDPlugin.INSTANCE.getString("QuestionnaireFormDefinitionSectionQuestionnaireFormDefinitionSectionText"),
						 new Object [] { questionnaireFormDefinitionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFormDefinitionSectionTitle(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionTitle(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFormDefinitionSectionTitle(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionTitle(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFormDefinitionSection The receiving '<em><b>Questionnaire Form Definition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireFormDefinitionSectionTitle(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireFormDefinitionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_TITLE,
						 QFDDPlugin.INSTANCE.getString("QuestionnaireFormDefinitionSectionQuestionnaireFormDefinitionSectionTitle"),
						 new Object [] { questionnaireFormDefinitionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Questions Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_QUESTIONS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(qfdd::QuestionsOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Form Definition Section Questions Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(QuestionnaireFormDefinitionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_QUESTIONS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFormDefinitionSection The receiving '<em><b>Questionnaire Form Definition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_QUESTIONS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION);
			try {
				VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_QUESTIONS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_QUESTIONS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONNAIRE_FORM_DEFINITION_SECTION_QUESTIONS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionnaireFormDefinitionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONNAIRE_FORM_DEFINITION_SECTION__QUESTIONNAIRE_FORM_DEFINITION_SECTION_QUESTIONS_ORGANIZER,
						 QFDDPlugin.INSTANCE.getString("QuestionnaireFormDefinitionSectionQuestionnaireFormDefinitionSectionQuestionsOrganizer"),
						 new Object [] { questionnaireFormDefinitionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionsOrganizers(QuestionnaireFormDefinitionSection) <em>Get Questions Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionsOrganizers(QuestionnaireFormDefinitionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTIONS_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(qfdd::QuestionsOrganizer)).oclAsType(qfdd::QuestionsOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getQuestionsOrganizers(QuestionnaireFormDefinitionSection) <em>Get Questions Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionsOrganizers(QuestionnaireFormDefinitionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTIONS_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<QuestionsOrganizer> getQuestionsOrganizers(
			QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection) {
	
	
	
		if (GET_QUESTIONS_ORGANIZERS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION, QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION.getEAllOperations().get(62));
			try {
				GET_QUESTIONS_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_QUESTIONS_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTIONS_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionsOrganizer> result = (Collection<QuestionsOrganizer>) query.evaluate(questionnaireFormDefinitionSection);
		return new BasicEList.UnmodifiableEList<QuestionsOrganizer>(result.size(), result.toArray());
	}

} // QuestionnaireFormDefinitionSectionOperations
