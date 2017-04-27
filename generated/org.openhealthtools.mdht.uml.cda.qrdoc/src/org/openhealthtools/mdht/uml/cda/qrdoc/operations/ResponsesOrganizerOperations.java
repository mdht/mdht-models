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
import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.NumericResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPlugin;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer;
import org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Responses Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerNumericResponsePatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Numeric Response Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerMultipleChoiceResponsePatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Multiple Choice Response Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerTextQuestionResponseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Text Question Response Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerAnalogSliderResponsePatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Analog Slider Response Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#validateResponsesOrganizerDiscreteSliderResponsePatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Discrete Slider Response Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#getNumericResponsePatternObservations() <em>Get Numeric Response Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#getMultipleChoiceResponsePatternObservations() <em>Get Multiple Choice Response Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#getTextQuestionResponseObservations() <em>Get Text Question Response Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#getAnalogSliderResponsePatternObservations() <em>Get Analog Slider Response Pattern Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer#getDiscreteSliderResponsePatternObservations() <em>Get Discrete Slider Response Pattern Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsesOrganizerOperations extends OrganizerOperations {
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
	protected ResponsesOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerTemplateId(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerTemplateId(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.33.4.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerTemplateId(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerTemplateId(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerTemplateId(ResponsesOrganizer responsesOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_TEMPLATE_ID,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerTemplateId"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerCode(ResponsesOrganizer responsesOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_CODE,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerCode"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerId(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerId(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerId(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerId(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerId(ResponsesOrganizer responsesOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_ID,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerId"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerMoodCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerMoodCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerMoodCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerMoodCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerMoodCode(ResponsesOrganizer responsesOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_MOOD_CODE,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerMoodCode"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerStatusCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerStatusCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerStatusCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerStatusCode(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerStatusCode(ResponsesOrganizer responsesOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_STATUS_CODE,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerStatusCode"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerNumericResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Numeric Response Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerNumericResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_NUMERIC_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qrdoc::NumericResponsePatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerNumericResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Numeric Response Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerNumericResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_NUMERIC_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerNumericResponsePatternObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_NUMERIC_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_NUMERIC_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_NUMERIC_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_NUMERIC_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_NUMERIC_RESPONSE_PATTERN_OBSERVATION,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerNumericResponsePatternObservation"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerMultipleChoiceResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Multiple Choice Response Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerMultipleChoiceResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qrdoc::MultipleChoiceResponsePatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerMultipleChoiceResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Multiple Choice Response Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerMultipleChoiceResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerMultipleChoiceResponsePatternObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerMultipleChoiceResponsePatternObservation"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerTextQuestionResponseObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Text Question Response Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerTextQuestionResponseObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_TEXT_QUESTION_RESPONSE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qrdoc::TextResponsePatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerTextQuestionResponseObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Text Question Response Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerTextQuestionResponseObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_TEXT_QUESTION_RESPONSE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerTextQuestionResponseObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_TEXT_QUESTION_RESPONSE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_TEXT_QUESTION_RESPONSE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_TEXT_QUESTION_RESPONSE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_TEXT_QUESTION_RESPONSE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_TEXT_QUESTION_RESPONSE_OBSERVATION,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerTextQuestionResponseObservation"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerAnalogSliderResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Analog Slider Response Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerAnalogSliderResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qrdoc::AnalogSliderResponsePatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerAnalogSliderResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Analog Slider Response Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerAnalogSliderResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerAnalogSliderResponsePatternObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerAnalogSliderResponsePatternObservation"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsesOrganizerDiscreteSliderResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Discrete Slider Response Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerDiscreteSliderResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSES_ORGANIZER_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(qrdoc::DiscreteSliderResponsePatternObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsesOrganizerDiscreteSliderResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responses Organizer Discrete Slider Response Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsesOrganizerDiscreteSliderResponsePatternObservation(ResponsesOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSES_ORGANIZER_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responsesOrganizer The receiving '<em><b>Responses Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponsesOrganizerDiscreteSliderResponsePatternObservation(
			ResponsesOrganizer responsesOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSES_ORGANIZER_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER);
			try {
				VALIDATE_RESPONSES_ORGANIZER_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSES_ORGANIZER_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSES_ORGANIZER_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responsesOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSES_ORGANIZER__RESPONSES_ORGANIZER_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION,
						 QRDOCPlugin.INSTANCE.getString("ResponsesOrganizerResponsesOrganizerDiscreteSliderResponsePatternObservation"),
						 new Object [] { responsesOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumericResponsePatternObservations(ResponsesOrganizer) <em>Get Numeric Response Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericResponsePatternObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMERIC_RESPONSE_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qrdoc::NumericResponsePatternObservation)).oclAsType(qrdoc::NumericResponsePatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getNumericResponsePatternObservations(ResponsesOrganizer) <em>Get Numeric Response Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericResponsePatternObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMERIC_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NumericResponsePatternObservation> getNumericResponsePatternObservations(
			ResponsesOrganizer responsesOrganizer) {
	
	
	
		if (GET_NUMERIC_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER, QRDOCPackage.Literals.RESPONSES_ORGANIZER.getEAllOperations().get(62));
			try {
				GET_NUMERIC_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_NUMERIC_RESPONSE_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUMERIC_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NumericResponsePatternObservation> result = (Collection<NumericResponsePatternObservation>) query.evaluate(responsesOrganizer);
		return new BasicEList.UnmodifiableEList<NumericResponsePatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMultipleChoiceResponsePatternObservations(ResponsesOrganizer) <em>Get Multiple Choice Response Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoiceResponsePatternObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qrdoc::MultipleChoiceResponsePatternObservation)).oclAsType(qrdoc::MultipleChoiceResponsePatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getMultipleChoiceResponsePatternObservations(ResponsesOrganizer) <em>Get Multiple Choice Response Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoiceResponsePatternObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MultipleChoiceResponsePatternObservation> getMultipleChoiceResponsePatternObservations(
			ResponsesOrganizer responsesOrganizer) {
	
	
	
		if (GET_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER, QRDOCPackage.Literals.RESPONSES_ORGANIZER.getEAllOperations().get(63));
			try {
				GET_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MultipleChoiceResponsePatternObservation> result = (Collection<MultipleChoiceResponsePatternObservation>) query.evaluate(responsesOrganizer);
		return new BasicEList.UnmodifiableEList<MultipleChoiceResponsePatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTextQuestionResponseObservations(ResponsesOrganizer) <em>Get Text Question Response Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQuestionResponseObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qrdoc::TextResponsePatternObservation)).oclAsType(qrdoc::TextResponsePatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getTextQuestionResponseObservations(ResponsesOrganizer) <em>Get Text Question Response Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQuestionResponseObservations(ResponsesOrganizer)
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
			ResponsesOrganizer responsesOrganizer) {
	
	
	
		if (GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER, QRDOCPackage.Literals.RESPONSES_ORGANIZER.getEAllOperations().get(64));
			try {
				GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TEXT_QUESTION_RESPONSE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TextResponsePatternObservation> result = (Collection<TextResponsePatternObservation>) query.evaluate(responsesOrganizer);
		return new BasicEList.UnmodifiableEList<TextResponsePatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAnalogSliderResponsePatternObservations(ResponsesOrganizer) <em>Get Analog Slider Response Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogSliderResponsePatternObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qrdoc::AnalogSliderResponsePatternObservation)).oclAsType(qrdoc::AnalogSliderResponsePatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getAnalogSliderResponsePatternObservations(ResponsesOrganizer) <em>Get Analog Slider Response Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogSliderResponsePatternObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AnalogSliderResponsePatternObservation> getAnalogSliderResponsePatternObservations(
			ResponsesOrganizer responsesOrganizer) {
	
	
	
		if (GET_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER, QRDOCPackage.Literals.RESPONSES_ORGANIZER.getEAllOperations().get(65));
			try {
				GET_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AnalogSliderResponsePatternObservation> result = (Collection<AnalogSliderResponsePatternObservation>) query.evaluate(responsesOrganizer);
		return new BasicEList.UnmodifiableEList<AnalogSliderResponsePatternObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiscreteSliderResponsePatternObservations(ResponsesOrganizer) <em>Get Discrete Slider Response Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteSliderResponsePatternObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qrdoc::DiscreteSliderResponsePatternObservation)).oclAsType(qrdoc::DiscreteSliderResponsePatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getDiscreteSliderResponsePatternObservations(ResponsesOrganizer) <em>Get Discrete Slider Response Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteSliderResponsePatternObservations(ResponsesOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<DiscreteSliderResponsePatternObservation> getDiscreteSliderResponsePatternObservations(
			ResponsesOrganizer responsesOrganizer) {
	
	
	
		if (GET_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QRDOCPackage.Literals.RESPONSES_ORGANIZER, QRDOCPackage.Literals.RESPONSES_ORGANIZER.getEAllOperations().get(66));
			try {
				GET_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<DiscreteSliderResponsePatternObservation> result = (Collection<DiscreteSliderResponsePatternObservation>) query.evaluate(responsesOrganizer);
		return new BasicEList.UnmodifiableEList<DiscreteSliderResponsePatternObservation>(result.size(), result.toArray());
	}

} // ResponsesOrganizerOperations
