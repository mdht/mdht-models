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
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Text Question Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Question Help Text Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationQuestionMediaPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Question Media Pattern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#validateTextQuestionPatternObservationPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#getQuestionHelpTextPatternObservations() <em>Get Question Help Text Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation#getQuestionMediaPatterns() <em>Get Question Media Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextQuestionPatternObservationOperations extends ClinicalStatementOperations {
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
	protected TextQuestionPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationTemplateId(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationTemplateId(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationTemplateId(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationTemplateId(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationTemplateId(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationTemplateId"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationClassCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationClassCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationClassCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationClassCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationClassCode(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationClassCode"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationCode(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_CODE,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationCode"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationId(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationId(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationId(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationId(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationId(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_ID,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationId"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationLanguageCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationLanguageCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationLanguageCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationLanguageCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationLanguageCode(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationLanguageCode"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationMoodCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationMoodCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationMoodCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationMoodCode(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationMoodCode(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationMoodCode"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Question Help Text Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::QuestionHelpTextPatternObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Question Help Text Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_HELP_TEXT_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationQuestionHelpTextPatternObservation"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationQuestionMediaPattern(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Question Media Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationQuestionMediaPattern(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(qfdd::QuestionMediaPattern) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationQuestionMediaPattern(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Question Media Pattern</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationQuestionMediaPattern(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationQuestionMediaPattern(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_QUESTION_MEDIA_PATTERN,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationQuestionMediaPattern"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTextQuestionPatternObservationPrecondition(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationPrecondition(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(qfdd::PreconditionPattern))";

	/**
	 * The cached OCL invariant for the '{@link #validateTextQuestionPatternObservationPrecondition(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Question Pattern Observation Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTextQuestionPatternObservationPrecondition(TextQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param textQuestionPatternObservation The receiving '<em><b>Text Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTextQuestionPatternObservationPrecondition(
			TextQuestionPatternObservation textQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TEXT_QUESTION_PATTERN_OBSERVATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(textQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.TEXT_QUESTION_PATTERN_OBSERVATION__TEXT_QUESTION_PATTERN_OBSERVATION_PRECONDITION,
						 QFDDPlugin.INSTANCE.getString("TextQuestionPatternObservationTextQuestionPatternObservationPrecondition"),
						 new Object [] { textQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionHelpTextPatternObservations(TextQuestionPatternObservation) <em>Get Question Help Text Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionHelpTextPatternObservations(TextQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionHelpTextPatternObservation)).oclAsType(qfdd::QuestionHelpTextPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getQuestionHelpTextPatternObservations(TextQuestionPatternObservation) <em>Get Question Help Text Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionHelpTextPatternObservations(TextQuestionPatternObservation)
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
			TextQuestionPatternObservation textQuestionPatternObservation) {
	
	
	
		if (GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION, QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION.getEAllOperations().get(60));
			try {
				GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionHelpTextPatternObservation> result = (Collection<QuestionHelpTextPatternObservation>) query.evaluate(textQuestionPatternObservation);
		return new BasicEList.UnmodifiableEList<QuestionHelpTextPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionMediaPatterns(TextQuestionPatternObservation) <em>Get Question Media Patterns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionMediaPatterns(TextQuestionPatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_MEDIA_PATTERNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionMediaPattern)).oclAsType(qfdd::QuestionMediaPattern)";

	/**
	 * The cached OCL query for the '{@link #getQuestionMediaPatterns(TextQuestionPatternObservation) <em>Get Question Media Patterns</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionMediaPatterns(TextQuestionPatternObservation)
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
			TextQuestionPatternObservation textQuestionPatternObservation) {
	
	
	
		if (GET_QUESTION_MEDIA_PATTERNS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION, QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION.getEAllOperations().get(61));
			try {
				GET_QUESTION_MEDIA_PATTERNS__EOCL_QRY = helper.createQuery(GET_QUESTION_MEDIA_PATTERNS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_MEDIA_PATTERNS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionMediaPattern> result = (Collection<QuestionMediaPattern>) query.evaluate(textQuestionPatternObservation);
		return new BasicEList.UnmodifiableEList<QuestionMediaPattern>(result.size(), result.toArray());
	}

} // TextQuestionPatternObservationOperations
