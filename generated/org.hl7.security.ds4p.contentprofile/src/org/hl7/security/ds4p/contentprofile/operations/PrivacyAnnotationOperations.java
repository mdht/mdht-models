/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

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

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation;
import org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation;
import org.hl7.security.ds4p.contentprofile.PrivacyAnnotation;
import org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation;
import org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation;

import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Annotation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Class Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Mood Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Status Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Status Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationObligationPolicySecurityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Obligation Policy Security Observation</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationRefrainPolicySecurityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Refrain Policy Security Observation</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationPurposeOfUseSecurityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Purpose Of Use Security Observation</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationConfidentialityCodeSecurityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Confidentiality Code Security Observation</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#getObligationPolicySecurityObservations() <em>Get Obligation Policy Security Observations</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#getRefrainPolicySecurityObservations() <em>Get Refrain Policy Security Observations</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#getPurposeOfUseSecurityObservations() <em>Get Purpose Of Use Security Observations</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#getConfidentialityCodeSecurityObservation() <em>Get Confidentiality Code Security Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyAnnotationOperations extends OrganizerOperations {
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
	protected PrivacyAnnotationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationTemplateId(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationTemplateId(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationTemplateId(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationTemplateId(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationTemplateId(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationTemplateId"),
						 new Object [] { privacyAnnotation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationClassCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationClassCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationClassCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationClassCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationClassCode(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_CLASS_CODE,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationClassCode"),
						 new Object [] { privacyAnnotation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationMoodCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationMoodCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationMoodCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationMoodCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationMoodCode(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_MOOD_CODE,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationMoodCode"),
						 new Object [] { privacyAnnotation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationStatusCodeP(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationStatusCodeP(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationStatusCodeP(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationStatusCodeP(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationStatusCodeP(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_STATUS_CODE_P,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationStatusCodeP"),
						 new Object [] { privacyAnnotation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.hl7.security.ds4p.contentprofile.PrivacyAnnotationStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.hl7.security.ds4p.contentprofile.PrivacyAnnotationStatusCodeP", passToken);
				}
				passToken.add(privacyAnnotation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationStatusCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationStatusCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active'";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationStatusCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationStatusCode(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationStatusCode(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.hl7.security.ds4p.contentprofile.PrivacyAnnotationStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(privacyAnnotation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_STATUS_CODE,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationStatusCode"),
						 new Object [] { privacyAnnotation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationObligationPolicySecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Obligation Policy Security Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationObligationPolicySecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(contentprofile::ObligationPolicySecurityObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationObligationPolicySecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Obligation Policy Security Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationObligationPolicySecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationObligationPolicySecurityObservation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationObligationPolicySecurityObservation"),
						 new Object [] { privacyAnnotation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationRefrainPolicySecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Refrain Policy Security Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationRefrainPolicySecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(contentprofile::RefrainPolicySecurityObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationRefrainPolicySecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Refrain Policy Security Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationRefrainPolicySecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationRefrainPolicySecurityObservation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationRefrainPolicySecurityObservation"),
						 new Object [] { privacyAnnotation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationPurposeOfUseSecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Purpose Of Use Security Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationPurposeOfUseSecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(contentprofile::PurposeOfUseSecurityObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationPurposeOfUseSecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Purpose Of Use Security Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationPurposeOfUseSecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationPurposeOfUseSecurityObservation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationPurposeOfUseSecurityObservation"),
						 new Object [] { privacyAnnotation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationConfidentialityCodeSecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Confidentiality Code Security Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationConfidentialityCodeSecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(contentprofile::ConfidentialitySecurityObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationConfidentialityCodeSecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Confidentiality Code Security Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationConfidentialityCodeSecurityObservation(PrivacyAnnotation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotation The receiving '<em><b>Privacy Annotation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyAnnotationConfidentialityCodeSecurityObservation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION);
			try {
				VALIDATE_PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyAnnotation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyAnnotationPrivacyAnnotationConfidentialityCodeSecurityObservation"),
						 new Object [] { privacyAnnotation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getObligationPolicySecurityObservations(PrivacyAnnotation) <em>Get Obligation Policy Security Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationPolicySecurityObservations(PrivacyAnnotation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBLIGATION_POLICY_SECURITY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(contentprofile::ObligationPolicySecurityObservation)).oclAsType(contentprofile::ObligationPolicySecurityObservation)";

	/**
	 * The cached OCL query for the '{@link #getObligationPolicySecurityObservations(PrivacyAnnotation) <em>Get Obligation Policy Security Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationPolicySecurityObservations(PrivacyAnnotation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBLIGATION_POLICY_SECURITY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<ObligationPolicySecurityObservation> getObligationPolicySecurityObservations(PrivacyAnnotation privacyAnnotation) {
	
	
	
		if (GET_OBLIGATION_POLICY_SECURITY_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION, CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION.getEAllOperations().get(61));
			try {
				GET_OBLIGATION_POLICY_SECURITY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_OBLIGATION_POLICY_SECURITY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_OBLIGATION_POLICY_SECURITY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ObligationPolicySecurityObservation> result = (Collection<ObligationPolicySecurityObservation>) query.evaluate(privacyAnnotation);
		return new BasicEList.UnmodifiableEList<ObligationPolicySecurityObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRefrainPolicySecurityObservations(PrivacyAnnotation) <em>Get Refrain Policy Security Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefrainPolicySecurityObservations(PrivacyAnnotation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REFRAIN_POLICY_SECURITY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(contentprofile::RefrainPolicySecurityObservation)).oclAsType(contentprofile::RefrainPolicySecurityObservation)";

	/**
	 * The cached OCL query for the '{@link #getRefrainPolicySecurityObservations(PrivacyAnnotation) <em>Get Refrain Policy Security Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefrainPolicySecurityObservations(PrivacyAnnotation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REFRAIN_POLICY_SECURITY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RefrainPolicySecurityObservation> getRefrainPolicySecurityObservations(PrivacyAnnotation privacyAnnotation) {
	
	
	
		if (GET_REFRAIN_POLICY_SECURITY_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION, CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION.getEAllOperations().get(62));
			try {
				GET_REFRAIN_POLICY_SECURITY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_REFRAIN_POLICY_SECURITY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_REFRAIN_POLICY_SECURITY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RefrainPolicySecurityObservation> result = (Collection<RefrainPolicySecurityObservation>) query.evaluate(privacyAnnotation);
		return new BasicEList.UnmodifiableEList<RefrainPolicySecurityObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPurposeOfUseSecurityObservations(PrivacyAnnotation) <em>Get Purpose Of Use Security Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfUseSecurityObservations(PrivacyAnnotation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PURPOSE_OF_USE_SECURITY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(contentprofile::PurposeOfUseSecurityObservation)).oclAsType(contentprofile::PurposeOfUseSecurityObservation)";

	/**
	 * The cached OCL query for the '{@link #getPurposeOfUseSecurityObservations(PrivacyAnnotation) <em>Get Purpose Of Use Security Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfUseSecurityObservations(PrivacyAnnotation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PURPOSE_OF_USE_SECURITY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<PurposeOfUseSecurityObservation> getPurposeOfUseSecurityObservations(PrivacyAnnotation privacyAnnotation) {
	
	
	
		if (GET_PURPOSE_OF_USE_SECURITY_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION, CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION.getEAllOperations().get(63));
			try {
				GET_PURPOSE_OF_USE_SECURITY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PURPOSE_OF_USE_SECURITY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PURPOSE_OF_USE_SECURITY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PurposeOfUseSecurityObservation> result = (Collection<PurposeOfUseSecurityObservation>) query.evaluate(privacyAnnotation);
		return new BasicEList.UnmodifiableEList<PurposeOfUseSecurityObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConfidentialityCodeSecurityObservation(PrivacyAnnotation) <em>Get Confidentiality Code Security Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCodeSecurityObservation(PrivacyAnnotation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(contentprofile::ConfidentialitySecurityObservation))->asSequence()->any(true).oclAsType(contentprofile::ConfidentialitySecurityObservation)";

	/**
	 * The cached OCL query for the '{@link #getConfidentialityCodeSecurityObservation(PrivacyAnnotation) <em>Get Confidentiality Code Security Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCodeSecurityObservation(PrivacyAnnotation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ConfidentialitySecurityObservation getConfidentialityCodeSecurityObservation(PrivacyAnnotation privacyAnnotation) {
	
	
	
		if (GET_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION, CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION.getEAllOperations().get(64));
			try {
				GET_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__EOCL_QRY);
		return (ConfidentialitySecurityObservation) query.evaluate(privacyAnnotation);
	}

} // PrivacyAnnotationOperations