/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Collection;
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
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Question Help Text Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation#validateQuestionHelpTextPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation#validateQuestionHelpTextPatternObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation#validateQuestionHelpTextPatternObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation#validateQuestionHelpTextPatternObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation#validateQuestionHelpTextPatternObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation#validateQuestionHelpTextPatternObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation#validateQuestionHelpTextPatternObservationLanguageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Language Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation#validateQuestionHelpTextPatternObservationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Language Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionHelpTextPatternObservationOperations extends ClinicalStatementOperations {
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
	protected QuestionHelpTextPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionHelpTextPatternObservationTemplateId(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationTemplateId(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.19')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionHelpTextPatternObservationTemplateId(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationTemplateId(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionHelpTextPatternObservation The receiving '<em><b>Question Help Text Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionHelpTextPatternObservationTemplateId(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionHelpTextPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionHelpTextPatternObservationQuestionHelpTextPatternObservationTemplateId"),
						 new Object [] { questionHelpTextPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionHelpTextPatternObservationClassCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationClassCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionHelpTextPatternObservationClassCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationClassCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionHelpTextPatternObservation The receiving '<em><b>Question Help Text Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionHelpTextPatternObservationClassCode(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionHelpTextPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionHelpTextPatternObservationQuestionHelpTextPatternObservationClassCode"),
						 new Object [] { questionHelpTextPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionHelpTextPatternObservationCodeP(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationCodeP(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionHelpTextPatternObservationCodeP(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationCodeP(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionHelpTextPatternObservation The receiving '<em><b>Question Help Text Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionHelpTextPatternObservationCodeP(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionHelpTextPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE_P,
						 QFDDPlugin.INSTANCE.getString("QuestionHelpTextPatternObservationQuestionHelpTextPatternObservationCodeP"),
						 new Object [] { questionHelpTextPatternObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservationCodeP", passToken);
				}
				passToken.add(questionHelpTextPatternObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionHelpTextPatternObservationCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '48767-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionHelpTextPatternObservationCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionHelpTextPatternObservation The receiving '<em><b>Question Help Text Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionHelpTextPatternObservationCode(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(questionHelpTextPatternObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionHelpTextPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionHelpTextPatternObservationQuestionHelpTextPatternObservationCode"),
						 new Object [] { questionHelpTextPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionHelpTextPatternObservationMoodCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationMoodCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionHelpTextPatternObservationMoodCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationMoodCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionHelpTextPatternObservation The receiving '<em><b>Question Help Text Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionHelpTextPatternObservationMoodCode(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionHelpTextPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionHelpTextPatternObservationQuestionHelpTextPatternObservationMoodCode"),
						 new Object [] { questionHelpTextPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionHelpTextPatternObservationValue(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationValue(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::ST)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionHelpTextPatternObservationValue(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationValue(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionHelpTextPatternObservation The receiving '<em><b>Question Help Text Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionHelpTextPatternObservationValue(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionHelpTextPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_VALUE,
						 QFDDPlugin.INSTANCE.getString("QuestionHelpTextPatternObservationQuestionHelpTextPatternObservationValue"),
						 new Object [] { questionHelpTextPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionHelpTextPatternObservationLanguageCodeP(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Language Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationLanguageCodeP(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionHelpTextPatternObservationLanguageCodeP(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Language Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationLanguageCodeP(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionHelpTextPatternObservation The receiving '<em><b>Question Help Text Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionHelpTextPatternObservationLanguageCodeP(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionHelpTextPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE_P,
						 QFDDPlugin.INSTANCE.getString("QuestionHelpTextPatternObservationQuestionHelpTextPatternObservationLanguageCodeP"),
						 new Object [] { questionHelpTextPatternObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservationLanguageCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservationLanguageCodeP", passToken);
				}
				passToken.add(questionHelpTextPatternObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionHelpTextPatternObservationLanguageCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationLanguageCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in "+
"not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionHelpTextPatternObservationLanguageCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Help Text Pattern Observation Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionHelpTextPatternObservationLanguageCode(QuestionHelpTextPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionHelpTextPatternObservation The receiving '<em><b>Question Help Text Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionHelpTextPatternObservationLanguageCode(
			QuestionHelpTextPatternObservation questionHelpTextPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservationLanguageCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(questionHelpTextPatternObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionHelpTextPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_HELP_TEXT_PATTERN_OBSERVATION__QUESTION_HELP_TEXT_PATTERN_OBSERVATION_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionHelpTextPatternObservationQuestionHelpTextPatternObservationLanguageCode"),
						 new Object [] { questionHelpTextPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // QuestionHelpTextPatternObservationOperations
