/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Question Feedback Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation#validateQuestionFeedbackPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation#validateQuestionFeedbackPatternObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation#validateQuestionFeedbackPatternObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation#validateQuestionFeedbackPatternObservationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation#validateQuestionFeedbackPatternObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation#validateQuestionFeedbackPatternObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionFeedbackPatternObservationOperations extends ClinicalStatementOperations {
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
	protected QuestionFeedbackPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionFeedbackPatternObservationTemplateId(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationTemplateId(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionFeedbackPatternObservationTemplateId(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationTemplateId(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionFeedbackPatternObservation The receiving '<em><b>Question Feedback Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionFeedbackPatternObservationTemplateId(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_FEEDBACK_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionFeedbackPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionFeedbackPatternObservationQuestionFeedbackPatternObservationTemplateId"),
						 new Object [] { questionFeedbackPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionFeedbackPatternObservationClassCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationClassCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionFeedbackPatternObservationClassCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationClassCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionFeedbackPatternObservation The receiving '<em><b>Question Feedback Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionFeedbackPatternObservationClassCode(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_FEEDBACK_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionFeedbackPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionFeedbackPatternObservationQuestionFeedbackPatternObservationClassCode"),
						 new Object [] { questionFeedbackPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionFeedbackPatternObservationCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionFeedbackPatternObservationCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionFeedbackPatternObservation The receiving '<em><b>Question Feedback Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionFeedbackPatternObservationCode(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_FEEDBACK_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionFeedbackPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionFeedbackPatternObservationQuestionFeedbackPatternObservationCode"),
						 new Object [] { questionFeedbackPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionFeedbackPatternObservationLanguageCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationLanguageCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionFeedbackPatternObservationLanguageCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationLanguageCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionFeedbackPatternObservation The receiving '<em><b>Question Feedback Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionFeedbackPatternObservationLanguageCode(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_FEEDBACK_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionFeedbackPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionFeedbackPatternObservationQuestionFeedbackPatternObservationLanguageCode"),
						 new Object [] { questionFeedbackPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionFeedbackPatternObservationMoodCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationMoodCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionFeedbackPatternObservationMoodCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationMoodCode(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionFeedbackPatternObservation The receiving '<em><b>Question Feedback Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionFeedbackPatternObservationMoodCode(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_FEEDBACK_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionFeedbackPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionFeedbackPatternObservationQuestionFeedbackPatternObservationMoodCode"),
						 new Object [] { questionFeedbackPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionFeedbackPatternObservationValue(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationValue(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionFeedbackPatternObservationValue(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Feedback Pattern Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionFeedbackPatternObservationValue(QuestionFeedbackPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionFeedbackPatternObservation The receiving '<em><b>Question Feedback Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionFeedbackPatternObservationValue(
			QuestionFeedbackPatternObservation questionFeedbackPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_FEEDBACK_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_FEEDBACK_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionFeedbackPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_FEEDBACK_PATTERN_OBSERVATION__QUESTION_FEEDBACK_PATTERN_OBSERVATION_VALUE,
						 QFDDPlugin.INSTANCE.getString("QuestionFeedbackPatternObservationQuestionFeedbackPatternObservationValue"),
						 new Object [] { questionFeedbackPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // QuestionFeedbackPatternObservationOperations
