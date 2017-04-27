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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.Questionaire;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionaire</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.Questionaire#validateQuestionaireCopyRightSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Copy Right Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.Questionaire#validateQuestionaireQuestionnaireFormDefinitionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Questionnaire Form Definition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.Questionaire#getCopyRightSections() <em>Get Copy Right Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.Questionaire#getQuestionnaireFormDefinitionSections() <em>Get Questionnaire Form Definition Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.Questionaire#validateQuestionaireHeaderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionaireOperations extends QuestionaireHeaderOperations {
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
	protected QuestionaireOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireCopyRightSection(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Copy Right Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireCopyRightSection(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_COPY_RIGHT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qfdd::CopyRightSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireCopyRightSection(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Copy Right Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireCopyRightSection(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_COPY_RIGHT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaire The receiving '<em><b>Questionaire</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireCopyRightSection(Questionaire questionaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_COPY_RIGHT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE);
			try {
				VALIDATE_QUESTIONAIRE_COPY_RIGHT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_COPY_RIGHT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_COPY_RIGHT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaire)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE__QUESTIONAIRE_COPY_RIGHT_SECTION,
						 QFDDPlugin.INSTANCE.getString("QuestionaireQuestionaireCopyRightSection"),
						 new Object [] { questionaire }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireQuestionnaireFormDefinitionSection(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Questionnaire Form Definition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireQuestionnaireFormDefinitionSection(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_QUESTIONNAIRE_FORM_DEFINITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qfdd::QuestionnaireFormDefinitionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireQuestionnaireFormDefinitionSection(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Questionnaire Form Definition Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireQuestionnaireFormDefinitionSection(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_QUESTIONNAIRE_FORM_DEFINITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaire The receiving '<em><b>Questionaire</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireQuestionnaireFormDefinitionSection(Questionaire questionaire,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_QUESTIONNAIRE_FORM_DEFINITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE);
			try {
				VALIDATE_QUESTIONAIRE_QUESTIONNAIRE_FORM_DEFINITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_QUESTIONNAIRE_FORM_DEFINITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_QUESTIONNAIRE_FORM_DEFINITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaire)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE__QUESTIONAIRE_QUESTIONNAIRE_FORM_DEFINITION_SECTION,
						 QFDDPlugin.INSTANCE.getString("QuestionaireQuestionaireQuestionnaireFormDefinitionSection"),
						 new Object [] { questionaire }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCopyRightSections(Questionaire) <em>Get Copy Right Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightSections(Questionaire)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COPY_RIGHT_SECTIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qfdd::CopyRightSection)).oclAsType(qfdd::CopyRightSection)";

	/**
	 * The cached OCL query for the '{@link #getCopyRightSections(Questionaire) <em>Get Copy Right Sections</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightSections(Questionaire)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COPY_RIGHT_SECTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CopyRightSection> getCopyRightSections(Questionaire questionaire) {
	
	
	
		if (GET_COPY_RIGHT_SECTIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.QUESTIONAIRE, QFDDPackage.Literals.QUESTIONAIRE.getEAllOperations().get(68));
			try {
				GET_COPY_RIGHT_SECTIONS__EOCL_QRY = helper.createQuery(GET_COPY_RIGHT_SECTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COPY_RIGHT_SECTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CopyRightSection> result = (Collection<CopyRightSection>) query.evaluate(questionaire);
		return new BasicEList.UnmodifiableEList<CopyRightSection>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionnaireFormDefinitionSections(Questionaire) <em>Get Questionnaire Form Definition Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaireFormDefinitionSections(Questionaire)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTIONNAIRE_FORM_DEFINITION_SECTIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qfdd::QuestionnaireFormDefinitionSection)).oclAsType(qfdd::QuestionnaireFormDefinitionSection)";

	/**
	 * The cached OCL query for the '{@link #getQuestionnaireFormDefinitionSections(Questionaire) <em>Get Questionnaire Form Definition Sections</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaireFormDefinitionSections(Questionaire)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTIONNAIRE_FORM_DEFINITION_SECTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<QuestionnaireFormDefinitionSection> getQuestionnaireFormDefinitionSections(
			Questionaire questionaire) {
	
	
	
		if (GET_QUESTIONNAIRE_FORM_DEFINITION_SECTIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.QUESTIONAIRE, QFDDPackage.Literals.QUESTIONAIRE.getEAllOperations().get(69));
			try {
				GET_QUESTIONNAIRE_FORM_DEFINITION_SECTIONS__EOCL_QRY = helper.createQuery(GET_QUESTIONNAIRE_FORM_DEFINITION_SECTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTIONNAIRE_FORM_DEFINITION_SECTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionnaireFormDefinitionSection> result = (Collection<QuestionnaireFormDefinitionSection>) query.evaluate(questionaire);
		return new BasicEList.UnmodifiableEList<QuestionnaireFormDefinitionSection>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderTemplateId(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTemplateId(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderTemplateId(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTemplateId(Questionaire, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaire The receiving '<em><b>Questionaire</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderTemplateId(Questionaire questionaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaire)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE__QUESTIONAIRE_HEADER_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionaireQuestionaireHeaderTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionaire, context) }),
						 new Object [] { questionaire }));
			}
			 
			return false;
		}
		return true;
	}

} // QuestionaireOperations
