/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numeric Question Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Question Help Text Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Question Feedback Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#validateNumericQuestionPatternObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation#getQuestionHelpTextPatternObservation() <em>Get Question Help Text Pattern Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericQuestionPatternObservationOperations extends ClinicalStatementOperations {
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
	protected NumericQuestionPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationTemplateId(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationTemplateId(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationTemplateId(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationTemplateId(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationTemplateId(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationTemplateId"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationClassCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationClassCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationClassCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationClassCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationClassCode(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationClassCode"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationCode(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_CODE,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationCode"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationId(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationId(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationId(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationId(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationId(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_ID,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationId"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationMoodCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationMoodCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationMoodCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationMoodCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationMoodCode(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationMoodCode"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationLanguageCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationLanguageCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationLanguageCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationLanguageCode(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationLanguageCode(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationLanguageCode"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Question Help Text Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::QuestionHelpTextPatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Question Help Text Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationQuestionHelpTextPatternObservation"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Question Feedback Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::QuestionFeedbackPatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Question Feedback Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationQuestionFeedbackPatternObservation"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationPrecondition(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationPrecondition(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(qfdd::PreconditionPattern))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationPrecondition(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationPrecondition(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationPrecondition(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_PRECONDITION,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationPrecondition"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationReferenceRange(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Reference Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationReferenceRange(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->exists(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(qfdd::QuestionReferenceRangePattern))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationReferenceRange(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Reference Range</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationReferenceRange(NumericQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numericQuestionPatternObservation The receiving '<em><b>Numeric Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationReferenceRange(
			NumericQuestionPatternObservation numericQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(numericQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.NUMERIC_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE,
						 QFDDPlugin.INSTANCE.getString("NumericQuestionPatternObservationNumericQuestionPatternObservationReferenceRange"),
						 new Object [] { numericQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionHelpTextPatternObservation(NumericQuestionPatternObservation) <em>Get Question Help Text Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionHelpTextPatternObservation(NumericQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionHelpTextPatternObservation))->asSequence()->any(true).oclAsType(qfdd::QuestionHelpTextPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getQuestionHelpTextPatternObservation(NumericQuestionPatternObservation) <em>Get Question Help Text Pattern Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionHelpTextPatternObservation(NumericQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static QuestionHelpTextPatternObservation getQuestionHelpTextPatternObservation(
			NumericQuestionPatternObservation numericQuestionPatternObservation) {
	
	
	
		if (GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION, QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION.getEAllOperations().get(61));
			try {
				GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__EOCL_QRY = helper.createQuery(GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__EOCL_QRY);
		return (QuestionHelpTextPatternObservation) query.evaluate(numericQuestionPatternObservation);
	}

} // NumericQuestionPatternObservationOperations
