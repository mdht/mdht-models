/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Screening Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Entry Relationship Reason Not Screened</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateHearingScreeningResultObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation#validateHearingScreeningResultObservationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingScreeningResultObservationOperations
{
  /**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
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
  protected HearingScreeningResultObservationOperations() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationCodeP(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationCodeP"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationCodeP", passToken);
				}
				passToken.add(hearingScreeningResultObservation);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationValueP(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_VALUE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationValueP"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationMethodCodeP(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_METHOD_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationMethodCodeP"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationMethodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationMethodCodeP", passToken);
				}
				passToken.add(hearingScreeningResultObservation);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationTargetSiteCodeP(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_TARGET_SITE_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationTargetSiteCodeP"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationTargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationTargetSiteCodeP", passToken);
				}
				passToken.add(hearingScreeningResultObservation);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_ENTRY_RELATIONSHIP_REASON_NOT_SCREENED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_ENTRY_RELATIONSHIP_REASON_NOT_SCREENED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_ENTRY_RELATIONSHIP_REASON_NOT_SCREENED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_ENTRY_RELATIONSHIP_REASON_NOT_SCREENED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__HEARING_SCREENING_RESULT_OBSERVATION_ENTRY_RELATIONSHIP_REASON_NOT_SCREENED,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationHearingScreeningResultObservationEntryRelationshipReasonNotScreened"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningResultObservationAuthor(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__HEARING_SCREENING_RESULT_OBSERVATION_AUTHOR,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationHearingScreeningResultObservationAuthor"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningResultObservationPerformer(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__HEARING_SCREENING_RESULT_OBSERVATION_PERFORMER,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationHearingScreeningResultObservationPerformer"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.13')";

  /**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateResultObservationCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

		/**
	 * The cached OCL invariant for the '{@link #validateResultObservationCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationTemplateId(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationTemplateId"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateResultObservationCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '417491009' and value.codeSystem = '2.16.840.1.113883.6.96')";

  /**
	 * The cached OCL invariant for the '{@link #validateResultObservationCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationCode(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningResultObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationCode"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateResultObservationText(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationText(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateResultObservationText(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationText(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationText(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_TEXT,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationText"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateResultObservationEffectiveTime(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationEffectiveTime(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateResultObservationEffectiveTime(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationEffectiveTime(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationEffectiveTime(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_EFFECTIVE_TIME,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationEffectiveTime"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateResultObservationValue(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationValue(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '164059009' or value.code = '183924009' or value.code = '103709008')))";

  /**
	 * The cached OCL invariant for the '{@link #validateResultObservationValue(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationValue(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateResultObservationValueP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationValueP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

		/**
	 * The cached OCL invariant for the '{@link #validateResultObservationValueP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationValueP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateResultObservationMethodCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationMethodCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

		/**
	 * The cached OCL invariant for the '{@link #validateResultObservationMethodCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationMethodCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationValue(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_VALUE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationValue"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateResultObservationMethodCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationMethodCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA10387-1' or value.code = 'LA10388-9' or value.code = 'LA10389-7' or value.code = 'LA10390-5' or value.code = 'LA10391-3' or value.code = 'LA12406-7')))";

  /**
	 * The cached OCL invariant for the '{@link #validateResultObservationMethodCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationMethodCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTargetSiteCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationTargetSiteCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

		/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTargetSiteCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationTargetSiteCodeP(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationMethodCode(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationMethodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningResultObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_METHOD_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationMethodCode"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateResultObservationTargetSiteCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationTargetSiteCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '89644007' or value.code = '25577004')))";

  /**
	 * The cached OCL invariant for the '{@link #validateResultObservationTargetSiteCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationTargetSiteCode(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Entry Relationship Reason Not Screened</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_ENTRY_RELATIONSHIP_REASON_NOT_SCREENED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

		/**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Entry Relationship Reason Not Screened</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_ENTRY_RELATIONSHIP_REASON_NOT_SCREENED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningResultObservationAuthor(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Author</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningResultObservationAuthor(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

		/**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningResultObservationAuthor(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningResultObservationAuthor(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningResultObservationPerformer(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Performer</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningResultObservationPerformer(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

		/**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningResultObservationPerformer(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Result Observation Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningResultObservationPerformer(HearingScreeningResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_RESULT_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningResultObservation The receiving '<em><b>Hearing Screening Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateResultObservationTargetSiteCode(HearingScreeningResultObservation hearingScreeningResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultObservationTargetSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningResultObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_RESULT_OBSERVATION__RESULT_OBSERVATION_TARGET_SITE_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningResultObservationResultObservationTargetSiteCode"),
						 new Object [] { hearingScreeningResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // HearingScreeningResultObservationOperations