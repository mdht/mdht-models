/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Screening Outcome Observation Left</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeft#validateHearingScreeningOutcomeObservationLeftAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingScreeningOutcomeObservationLeftOperations extends ClinicalStatementOperations
{
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
  protected HearingScreeningOutcomeObservationLeftOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftTemplateId(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftTemplateId(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.9')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftTemplateId(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftTemplateId(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftTemplateId(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftTemplateId"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftClassCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftClassCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftClassCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftClassCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftClassCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CLASS_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftClassCode"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftMoodCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftMoodCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftMoodCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftMoodCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftMoodCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_MOOD_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftMoodCode"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftNegationInd(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftNegationInd(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftNegationInd(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftNegationInd(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftNegationInd(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_NEGATION_IND,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftNegationInd"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftId(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftId(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftId(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftId(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftId(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ID,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftId"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftCodeP(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftCodeP"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftCodeP", passToken);
				}
				passToken.add(hearingScreeningOutcomeObservationLeft);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '73741-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningOutcomeObservationLeft)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftCode"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftText(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftText(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftText(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftText(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftText(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TEXT,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftText"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftStatusCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftStatusCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'aborted' or value.code = 'active' or value.code = 'cancelled' or value.code = 'completed' or value.code = 'held' or value.code = 'suspended')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftStatusCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftStatusCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftStatusCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_STATUS_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftStatusCode"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftEffectiveTime(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftEffectiveTime(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftEffectiveTime(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftEffectiveTime(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftEffectiveTime(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_EFFECTIVE_TIME,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftEffectiveTime"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftValue(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftValue(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '164059009' or value.code = '183924009' or value.code = '262008008')))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftValue(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftValue(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftValue(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftValue"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftValueP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Value P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftValueP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftValueP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftValueP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftValueP(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_VALUE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftValueP"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftMethodCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftMethodCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftMethodCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftMethodCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftMethodCodeP(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftMethodCodeP"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftMethodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftMethodCodeP", passToken);
				}
				passToken.add(hearingScreeningOutcomeObservationLeft);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftMethodCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftMethodCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA10387-1' or value.code = 'LA10388-9' or value.code = 'LA10389-7' or value.code = 'LA10390-5' or value.code = 'LA10391-3' or value.code = 'LA12406-7')))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftMethodCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftMethodCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftMethodCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftMethodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningOutcomeObservationLeft)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_METHOD_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftMethodCode"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftTargetSiteCodeP(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftTargetSiteCodeP"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftTargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftTargetSiteCodeP", passToken);
				}
				passToken.add(hearingScreeningOutcomeObservationLeft);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftTargetSiteCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftTargetSiteCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '89644007' or value.code = '25577004')))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftTargetSiteCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftTargetSiteCode(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftTargetSiteCode(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationLeftTargetSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningOutcomeObservationLeft)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_TARGET_SITE_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftTargetSiteCode"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftEntryRelationship(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftEntryRelationship(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftEntryRelationship(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftEntryRelationship(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftEntryRelationship(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_ENTRY_RELATIONSHIP,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftEntryRelationship"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationLeftAuthor(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Author</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftAuthor(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationLeftAuthor(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Left Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationLeftAuthor(HearingScreeningOutcomeObservationLeft, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationLeft The receiving '<em><b>Hearing Screening Outcome Observation Left</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationLeftAuthor(HearingScreeningOutcomeObservationLeft hearingScreeningOutcomeObservationLeft, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationLeft)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT__HEARING_SCREENING_OUTCOME_OBSERVATION_LEFT_AUTHOR,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationLeftHearingScreeningOutcomeObservationLeftAuthor"),
						 new Object [] { hearingScreeningOutcomeObservationLeft }));
			}
			 
			return false;
		}
		return true;
	}

} // HearingScreeningOutcomeObservationLeftOperations