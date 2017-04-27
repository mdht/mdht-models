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
import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer;
import org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questions Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerNumericQuestionPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Numeric Question Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Multiple Choice Question Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerTextQuestionPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Text Question Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Analog Slider Question Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Discrete Slider Question Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#getNumericQuestionPatternObservations() <em>Get Numeric Question Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#getMultipleChoiceQuestionPatternObservations() <em>Get Multiple Choice Question Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#getTextQuestionPatternObservations() <em>Get Text Question Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#getAnalogSliderQuestionPatternObservations() <em>Get Analog Slider Question Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer#getDiscreteSliderQuestionPatternObservations() <em>Get Discrete Slider Question Pattern Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionsOrganizerOperations extends OrganizerOperations {
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
	protected QuestionsOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerTemplateId(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerTemplateId(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerTemplateId(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerTemplateId(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerTemplateId(QuestionsOrganizer questionsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerTemplateId"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerClassCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerClassCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerClassCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerClassCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerClassCode(QuestionsOrganizer questionsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerClassCode"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerId(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerId(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerId(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerId(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerId(QuestionsOrganizer questionsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerId"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerMoodCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerMoodCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerMoodCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerMoodCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerMoodCode(QuestionsOrganizer questionsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerMoodCode"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerStatusCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerStatusCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerStatusCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerStatusCode(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerStatusCode(QuestionsOrganizer questionsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_STATUS_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerStatusCode"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerPrecondition(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerPrecondition(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(qfdd::PreconditionPattern))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerPrecondition(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerPrecondition(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerPrecondition(QuestionsOrganizer questionsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_PRECONDITION,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerPrecondition"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerNumericQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Numeric Question Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerNumericQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_NUMERIC_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qfdd::NumericQuestionPatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerNumericQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Numeric Question Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerNumericQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_NUMERIC_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerNumericQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_NUMERIC_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_NUMERIC_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_NUMERIC_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_NUMERIC_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_NUMERIC_QUESTION_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerNumericQuestionPatternObservation"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Multiple Choice Question Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qfdd::MultipleChoiceQuestionPatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Multiple Choice Question Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerMultipleChoiceQuestionPatternObservation"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerTextQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Text Question Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerTextQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qfdd::TextQuestionPatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerTextQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Text Question Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerTextQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerTextQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_TEXT_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_TEXT_QUESTION_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerTextQuestionPatternObservation"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Analog Slider Question Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qfdd::AnalogSliderQuestionPatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Analog Slider Question Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerAnalogSliderQuestionPatternObservation"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Discrete Slider Question Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONS_ORGANIZER_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qfdd::DiscreteSliderQuestionPatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questions Organizer Discrete Slider Question Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(QuestionsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONS_ORGANIZER_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionsOrganizer The receiving '<em><b>Questions Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(
			QuestionsOrganizer questionsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONS_ORGANIZER_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER);
			try {
				VALIDATE_QUESTIONS_ORGANIZER_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONS_ORGANIZER_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONS_ORGANIZER_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONS_ORGANIZER__QUESTIONS_ORGANIZER_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("QuestionsOrganizerQuestionsOrganizerDiscreteSliderQuestionPatternObservation"),
						 new Object [] { questionsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumericQuestionPatternObservations(QuestionsOrganizer) <em>Get Numeric Question Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMERIC_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::NumericQuestionPatternObservation)).oclAsType(qfdd::NumericQuestionPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getNumericQuestionPatternObservations(QuestionsOrganizer) <em>Get Numeric Question Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMERIC_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NumericQuestionPatternObservation> getNumericQuestionPatternObservations(
			QuestionsOrganizer questionsOrganizer) {
	
	
	
		if (GET_NUMERIC_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER, QFDDPackage.Literals.QUESTIONS_ORGANIZER.getEAllOperations().get(63));
			try {
				GET_NUMERIC_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_NUMERIC_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUMERIC_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NumericQuestionPatternObservation> result = (Collection<NumericQuestionPatternObservation>) query.evaluate(questionsOrganizer);
		return new BasicEList.UnmodifiableEList<NumericQuestionPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMultipleChoiceQuestionPatternObservations(QuestionsOrganizer) <em>Get Multiple Choice Question Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoiceQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::MultipleChoiceQuestionPatternObservation)).oclAsType(qfdd::MultipleChoiceQuestionPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getMultipleChoiceQuestionPatternObservations(QuestionsOrganizer) <em>Get Multiple Choice Question Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoiceQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MultipleChoiceQuestionPatternObservation> getMultipleChoiceQuestionPatternObservations(
			QuestionsOrganizer questionsOrganizer) {
	
	
	
		if (GET_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER, QFDDPackage.Literals.QUESTIONS_ORGANIZER.getEAllOperations().get(64));
			try {
				GET_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MultipleChoiceQuestionPatternObservation> result = (Collection<MultipleChoiceQuestionPatternObservation>) query.evaluate(questionsOrganizer);
		return new BasicEList.UnmodifiableEList<MultipleChoiceQuestionPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTextQuestionPatternObservations(QuestionsOrganizer) <em>Get Text Question Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::TextQuestionPatternObservation)).oclAsType(qfdd::TextQuestionPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getTextQuestionPatternObservations(QuestionsOrganizer) <em>Get Text Question Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQuestionPatternObservations(QuestionsOrganizer)
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
			QuestionsOrganizer questionsOrganizer) {
	
	
	
		if (GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER, QFDDPackage.Literals.QUESTIONS_ORGANIZER.getEAllOperations().get(65));
			try {
				GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TEXT_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TextQuestionPatternObservation> result = (Collection<TextQuestionPatternObservation>) query.evaluate(questionsOrganizer);
		return new BasicEList.UnmodifiableEList<TextQuestionPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAnalogSliderQuestionPatternObservations(QuestionsOrganizer) <em>Get Analog Slider Question Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogSliderQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::AnalogSliderQuestionPatternObservation)).oclAsType(qfdd::AnalogSliderQuestionPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getAnalogSliderQuestionPatternObservations(QuestionsOrganizer) <em>Get Analog Slider Question Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogSliderQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AnalogSliderQuestionPatternObservation> getAnalogSliderQuestionPatternObservations(
			QuestionsOrganizer questionsOrganizer) {
	
	
	
		if (GET_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER, QFDDPackage.Literals.QUESTIONS_ORGANIZER.getEAllOperations().get(66));
			try {
				GET_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AnalogSliderQuestionPatternObservation> result = (Collection<AnalogSliderQuestionPatternObservation>) query.evaluate(questionsOrganizer);
		return new BasicEList.UnmodifiableEList<AnalogSliderQuestionPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiscreteSliderQuestionPatternObservations(QuestionsOrganizer) <em>Get Discrete Slider Question Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteSliderQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::DiscreteSliderQuestionPatternObservation)).oclAsType(qfdd::DiscreteSliderQuestionPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getDiscreteSliderQuestionPatternObservations(QuestionsOrganizer) <em>Get Discrete Slider Question Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteSliderQuestionPatternObservations(QuestionsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<DiscreteSliderQuestionPatternObservation> getDiscreteSliderQuestionPatternObservations(
			QuestionsOrganizer questionsOrganizer) {
	
	
	
		if (GET_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.QUESTIONS_ORGANIZER, QFDDPackage.Literals.QUESTIONS_ORGANIZER.getEAllOperations().get(67));
			try {
				GET_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<DiscreteSliderQuestionPatternObservation> result = (Collection<DiscreteSliderQuestionPatternObservation>) query.evaluate(questionsOrganizer);
		return new BasicEList.UnmodifiableEList<DiscreteSliderQuestionPatternObservation>(result.size(), result.toArray());
	}

} // QuestionsOrganizerOperations
