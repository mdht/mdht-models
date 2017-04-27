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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Multiple Choice Question Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Help Text Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Options Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Media Pattern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Feedback Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Text Question Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationCECode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationCECodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationCEDisplayName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Display Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#getQuestionHelpTextPatternObservations() <em>Get Question Help Text Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#getQuestionOptionsPatternObservations() <em>Get Question Options Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#getQuestionMediaPatterns() <em>Get Question Media Patterns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#getQuestionFeedbackPatternObservations() <em>Get Question Feedback Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation#getTextQuestionPatternObservations() <em>Get Text Question Pattern Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleChoiceQuestionPatternObservationOperations extends ClinicalStatementOperations {
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
	protected MultipleChoiceQuestionPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationTemplateId(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationTemplateId(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationTemplateId(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationTemplateId(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationTemplateId(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationTemplateId"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationClassCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationClassCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationClassCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationClassCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationClassCode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationClassCode"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationCode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CODE,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationCode"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationId(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationId(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationId(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationId(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationId(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_ID,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationId"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationLanguageCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationLanguageCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationLanguageCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationLanguageCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationLanguageCode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationLanguageCode"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationMoodCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationMoodCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationMoodCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationMoodCode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationMoodCode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationMoodCode"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Help Text Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::QuestionHelpTextPatternObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Help Text Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Options Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_OPTIONS_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::QuestionOptionsPatternObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Options Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_OPTIONS_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_OPTIONS_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_OPTIONS_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_OPTIONS_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_OPTIONS_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_OPTIONS_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Media Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::QuestionMediaPattern) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Media Pattern</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationQuestionMediaPattern"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Feedback Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::QuestionFeedbackPatternObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Question Feedback Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_QUESTION_FEEDBACK_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Text Question Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::TextQuestionPatternObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Text Question Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEXT_QUESTION_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationPrecondition(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationPrecondition(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(qfdd::PreconditionPattern))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationPrecondition(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationPrecondition(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationPrecondition(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_PRECONDITION,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationPrecondition"),
						 new Object [] { multipleChoiceQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationCECode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationCECode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationCECode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationCECode(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceQuestionPatternObservationCECode(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceQuestionPatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationCECode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationCECodeSystem(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationCECodeSystem(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined()).oclAsType(datatypes::CE)->reject( ce : datatypes::CE | ( ce.isNullFlavorUndefined() implies (not ce.codeSystem.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationCECodeSystem(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationCECodeSystem(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceQuestionPatternObservationCECodeSystem(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceQuestionPatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_CODE_SYSTEM,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationCECodeSystem"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationCEDisplayName(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Display Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationCEDisplayName(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined()).oclAsType(datatypes::CE)->reject( ce : datatypes::CE | ( ce.isNullFlavorUndefined() implies (not ce.displayName.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationCEDisplayName(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation CE Display Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationCEDisplayName(MultipleChoiceQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceQuestionPatternObservation The receiving '<em><b>Multiple Choice Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceQuestionPatternObservationCEDisplayName(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceQuestionPatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_CE_DISPLAY_NAME,
						 QFDDPlugin.INSTANCE.getString("MultipleChoiceQuestionPatternObservationMultipleChoiceQuestionPatternObservationCEDisplayName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionHelpTextPatternObservations(MultipleChoiceQuestionPatternObservation) <em>Get Question Help Text Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionHelpTextPatternObservations(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionHelpTextPatternObservation)).oclAsType(qfdd::QuestionHelpTextPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getQuestionHelpTextPatternObservations(MultipleChoiceQuestionPatternObservation) <em>Get Question Help Text Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionHelpTextPatternObservations(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<QuestionHelpTextPatternObservation> getQuestionHelpTextPatternObservations(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation) {
	
	
	
		if (GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION, QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION.getEAllOperations().get(66));
			try {
				GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionHelpTextPatternObservation> result = (Collection<QuestionHelpTextPatternObservation>) query.evaluate(multipleChoiceQuestionPatternObservation);
		return new BasicEList.UnmodifiableEList<QuestionHelpTextPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionOptionsPatternObservations(MultipleChoiceQuestionPatternObservation) <em>Get Question Options Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionOptionsPatternObservations(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionOptionsPatternObservation)).oclAsType(qfdd::QuestionOptionsPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getQuestionOptionsPatternObservations(MultipleChoiceQuestionPatternObservation) <em>Get Question Options Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionOptionsPatternObservations(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<QuestionOptionsPatternObservation> getQuestionOptionsPatternObservations(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation) {
	
	
	
		if (GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION, QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION.getEAllOperations().get(67));
			try {
				GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionOptionsPatternObservation> result = (Collection<QuestionOptionsPatternObservation>) query.evaluate(multipleChoiceQuestionPatternObservation);
		return new BasicEList.UnmodifiableEList<QuestionOptionsPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionMediaPatterns(MultipleChoiceQuestionPatternObservation) <em>Get Question Media Patterns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionMediaPatterns(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_MEDIA_PATTERNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionMediaPattern)).oclAsType(qfdd::QuestionMediaPattern)";

	/**
	 * The cached OCL query for the '{@link #getQuestionMediaPatterns(MultipleChoiceQuestionPatternObservation) <em>Get Question Media Patterns</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionMediaPatterns(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTION_MEDIA_PATTERNS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<QuestionMediaPattern> getQuestionMediaPatterns(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation) {
	
	
	
		if (GET_QUESTION_MEDIA_PATTERNS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION, QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION.getEAllOperations().get(68));
			try {
				GET_QUESTION_MEDIA_PATTERNS__EOCL_QRY = helper.createQuery(GET_QUESTION_MEDIA_PATTERNS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_MEDIA_PATTERNS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionMediaPattern> result = (Collection<QuestionMediaPattern>) query.evaluate(multipleChoiceQuestionPatternObservation);
		return new BasicEList.UnmodifiableEList<QuestionMediaPattern>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionFeedbackPatternObservations(MultipleChoiceQuestionPatternObservation) <em>Get Question Feedback Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionFeedbackPatternObservations(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_FEEDBACK_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionFeedbackPatternObservation)).oclAsType(qfdd::QuestionFeedbackPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getQuestionFeedbackPatternObservations(MultipleChoiceQuestionPatternObservation) <em>Get Question Feedback Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionFeedbackPatternObservations(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTION_FEEDBACK_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<QuestionFeedbackPatternObservation> getQuestionFeedbackPatternObservations(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation) {
	
	
	
		if (GET_QUESTION_FEEDBACK_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION, QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION.getEAllOperations().get(69));
			try {
				GET_QUESTION_FEEDBACK_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_QUESTION_FEEDBACK_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_FEEDBACK_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionFeedbackPatternObservation> result = (Collection<QuestionFeedbackPatternObservation>) query.evaluate(multipleChoiceQuestionPatternObservation);
		return new BasicEList.UnmodifiableEList<QuestionFeedbackPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTextQuestionPatternObservations(MultipleChoiceQuestionPatternObservation) <em>Get Text Question Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQuestionPatternObservations(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::TextQuestionPatternObservation)).oclAsType(qfdd::TextQuestionPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getTextQuestionPatternObservations(MultipleChoiceQuestionPatternObservation) <em>Get Text Question Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQuestionPatternObservations(MultipleChoiceQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<TextQuestionPatternObservation> getTextQuestionPatternObservations(
			MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation) {
	
	
	
		if (GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION, QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION.getEAllOperations().get(70));
			try {
				GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TextQuestionPatternObservation> result = (Collection<TextQuestionPatternObservation>) query.evaluate(multipleChoiceQuestionPatternObservation);
		return new BasicEList.UnmodifiableEList<TextQuestionPatternObservation>(result.size(), result.toArray());
	}

} // MultipleChoiceQuestionPatternObservationOperations
