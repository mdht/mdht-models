/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.operations;

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
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPlugin;
import org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Multiple Choice Response Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationLanguageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Language Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationCDOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationCECode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationCECodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#validateMultipleChoiceResponsePatternObservationCEDisplayName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Display Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#getTextQuestionResponseObservations() <em>Get Text Question Response Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#getQuestionHelpTextPatternObservations() <em>Get Question Help Text Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation#getQuestionOptionsPatternObservations() <em>Get Question Options Pattern Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleChoiceResponsePatternObservationOperations extends ClinicalStatementOperations {
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
	protected MultipleChoiceResponsePatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationTemplateId(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationTemplateId(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.33.4.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationTemplateId(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationTemplateId(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationTemplateId(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationTemplateId"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationClassCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationClassCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationClassCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationClassCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationClassCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CLASS_CODE,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationClassCode"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CODE,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationCode"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationId(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationId(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationId(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationId(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationId(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_ID,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationId"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationLanguageCodeP(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Language Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationLanguageCodeP(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationLanguageCodeP(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Language Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationLanguageCodeP(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationLanguageCodeP(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE_P,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationLanguageCodeP"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservationLanguageCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservationLanguageCodeP", passToken);
				}
				passToken.add(multipleChoiceResponsePatternObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationLanguageCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationLanguageCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in "+
"not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationLanguageCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationLanguageCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationLanguageCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservationLanguageCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(multipleChoiceResponsePatternObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_LANGUAGE_CODE,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationLanguageCode"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationMoodCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationMoodCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationMoodCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationMoodCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationMoodCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_MOOD_CODE,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationMoodCode"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationStatusCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationStatusCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationStatusCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationStatusCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationStatusCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationStatusCode"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationStatusCodeP(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationStatusCodeP(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationStatusCodeP(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationStatusCodeP(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationStatusCodeP(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(multipleChoiceResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_STATUS_CODE_P,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationStatusCodeP"),
						 new Object [] { multipleChoiceResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationCDCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCDCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationCDCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCDCode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceResponsePatternObservationCDCode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceResponsePatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationCDCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationCDCodeSystem(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCDCodeSystem(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not codeSystem.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationCDCodeSystem(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCDCodeSystem(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceResponsePatternObservationCDCodeSystem(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceResponsePatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_CODE_SYSTEM,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationCDCodeSystem"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationCDOriginalText(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCDOriginalText(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((originalText.oclIsUndefined() or originalText.isNullFlavorUndefined()) implies (not originalText.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationCDOriginalText(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CD Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCDOriginalText(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceResponsePatternObservationCDOriginalText(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceResponsePatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CD_ORIGINAL_TEXT,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationCDOriginalText"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationCECode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCECode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationCECode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCECode(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceResponsePatternObservationCECode(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceResponsePatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationCECode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationCECodeSystem(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCECodeSystem(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated not
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined()).oclAsType(datatypes::CE)->reject( v : datatypes::CE | ( v.isNullFlavorUndefined() implies (not v.codeSystem.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationCECodeSystem(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCECodeSystem(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceResponsePatternObservationCECodeSystem(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceResponsePatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_CODE_SYSTEM,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationCECodeSystem"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationCEDisplayName(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Display Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCEDisplayName(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated not
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined()).oclAsType(datatypes::CE)->reject( v : datatypes::CE | ( v.isNullFlavorUndefined() implies (not v.displayName.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationCEDisplayName(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation CE Display Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationCEDisplayName(MultipleChoiceResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param multipleChoiceResponsePatternObservation The receiving '<em><b>Multiple Choice Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMultipleChoiceResponsePatternObservationCEDisplayName(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(multipleChoiceResponsePatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_CE_DISPLAY_NAME,
						 QRDOCPlugin.INSTANCE.getString("MultipleChoiceResponsePatternObservationMultipleChoiceResponsePatternObservationCEDisplayName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTextQuestionResponseObservations(MultipleChoiceResponsePatternObservation) <em>Get Text Question Response Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQuestionResponseObservations(MultipleChoiceResponsePatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qrdoc::TextResponsePatternObservation)).oclAsType(qrdoc::TextResponsePatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getTextQuestionResponseObservations(MultipleChoiceResponsePatternObservation) <em>Get Text Question Response Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQuestionResponseObservations(MultipleChoiceResponsePatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<TextResponsePatternObservation> getTextQuestionResponseObservations(
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation) {
	
	
	
		if (GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION, QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION.getEAllOperations().get(66));
			try {
				GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TextResponsePatternObservation> result = (Collection<TextResponsePatternObservation>) query.evaluate(multipleChoiceResponsePatternObservation);
		return new BasicEList.UnmodifiableEList<TextResponsePatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionHelpTextPatternObservations(MultipleChoiceResponsePatternObservation) <em>Get Question Help Text Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionHelpTextPatternObservations(MultipleChoiceResponsePatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionHelpTextPatternObservation)).oclAsType(qfdd::QuestionHelpTextPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getQuestionHelpTextPatternObservations(MultipleChoiceResponsePatternObservation) <em>Get Question Help Text Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionHelpTextPatternObservations(MultipleChoiceResponsePatternObservation)
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
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation) {
	
	
	
		if (GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION, QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION.getEAllOperations().get(67));
			try {
				GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_HELP_TEXT_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionHelpTextPatternObservation> result = (Collection<QuestionHelpTextPatternObservation>) query.evaluate(multipleChoiceResponsePatternObservation);
		return new BasicEList.UnmodifiableEList<QuestionHelpTextPatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionOptionsPatternObservations(MultipleChoiceResponsePatternObservation) <em>Get Question Options Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionOptionsPatternObservations(MultipleChoiceResponsePatternObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::QuestionOptionsPatternObservation)).oclAsType(qfdd::QuestionOptionsPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getQuestionOptionsPatternObservations(MultipleChoiceResponsePatternObservation) <em>Get Question Options Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionOptionsPatternObservations(MultipleChoiceResponsePatternObservation)
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
			MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation) {
	
	
	
		if (GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION, QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION.getEAllOperations().get(68));
			try {
				GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTION_OPTIONS_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionOptionsPatternObservation> result = (Collection<QuestionOptionsPatternObservation>) query.evaluate(multipleChoiceResponsePatternObservation);
		return new BasicEList.UnmodifiableEList<QuestionOptionsPatternObservation>(result.size(), result.toArray());
	}

} // MultipleChoiceResponsePatternObservationOperations
