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
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Question Options Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation#validateQuestionOptionsPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation#validateQuestionOptionsPatternObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation#validateQuestionOptionsPatternObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation#validateQuestionOptionsPatternObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation#validateQuestionOptionsPatternObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation#validateQuestionOptionsPatternObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionOptionsPatternObservationOperations extends ClinicalStatementOperations {
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
	protected QuestionOptionsPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionOptionsPatternObservationTemplateId(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationTemplateId(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionOptionsPatternObservationTemplateId(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationTemplateId(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionOptionsPatternObservation The receiving '<em><b>Question Options Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionOptionsPatternObservationTemplateId(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_OPTIONS_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionOptionsPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionOptionsPatternObservationQuestionOptionsPatternObservationTemplateId"),
						 new Object [] { questionOptionsPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionOptionsPatternObservationClassCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationClassCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionOptionsPatternObservationClassCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationClassCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionOptionsPatternObservation The receiving '<em><b>Question Options Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionOptionsPatternObservationClassCode(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_OPTIONS_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionOptionsPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionOptionsPatternObservationQuestionOptionsPatternObservationClassCode"),
						 new Object [] { questionOptionsPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionOptionsPatternObservationCodeP(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationCodeP(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionOptionsPatternObservationCodeP(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationCodeP(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionOptionsPatternObservation The receiving '<em><b>Question Options Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionOptionsPatternObservationCodeP(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_OPTIONS_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionOptionsPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE_P,
						 QFDDPlugin.INSTANCE.getString("QuestionOptionsPatternObservationQuestionOptionsPatternObservationCodeP"),
						 new Object [] { questionOptionsPatternObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservationCodeP", passToken);
				}
				passToken.add(questionOptionsPatternObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionOptionsPatternObservationCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '74467-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionOptionsPatternObservationCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionOptionsPatternObservation The receiving '<em><b>Question Options Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionOptionsPatternObservationCode(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(questionOptionsPatternObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_OPTIONS_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionOptionsPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionOptionsPatternObservationQuestionOptionsPatternObservationCode"),
						 new Object [] { questionOptionsPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionOptionsPatternObservationMoodCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationMoodCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionOptionsPatternObservationMoodCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationMoodCode(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionOptionsPatternObservation The receiving '<em><b>Question Options Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionOptionsPatternObservationMoodCode(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_OPTIONS_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionOptionsPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionOptionsPatternObservationQuestionOptionsPatternObservationMoodCode"),
						 new Object [] { questionOptionsPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionOptionsPatternObservationValue(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationValue(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::IVL_INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionOptionsPatternObservationValue(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Options Pattern Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionOptionsPatternObservationValue(QuestionOptionsPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionOptionsPatternObservation The receiving '<em><b>Question Options Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionOptionsPatternObservationValue(
			QuestionOptionsPatternObservation questionOptionsPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_OPTIONS_PATTERN_OBSERVATION);
			try {
				VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_OPTIONS_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionOptionsPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_OPTIONS_PATTERN_OBSERVATION__QUESTION_OPTIONS_PATTERN_OBSERVATION_VALUE,
						 QFDDPlugin.INSTANCE.getString("QuestionOptionsPatternObservationQuestionOptionsPatternObservationValue"),
						 new Object [] { questionOptionsPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // QuestionOptionsPatternObservationOperations
