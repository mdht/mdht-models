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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Screening Outcome Observation Right</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRight#validateHearingScreeningOutcomeObservationRightAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingScreeningOutcomeObservationRightOperations extends ClinicalStatementOperations
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
  protected HearingScreeningOutcomeObservationRightOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightTemplateId(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightTemplateId(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.11')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightTemplateId(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightTemplateId(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightTemplateId(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightTemplateId"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightClassCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightClassCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightClassCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightClassCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightClassCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CLASS_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightClassCode"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightMoodCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightMoodCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightMoodCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightMoodCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightMoodCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_MOOD_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightMoodCode"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightNegationInd(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightNegationInd(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightNegationInd(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightNegationInd(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightNegationInd(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_NEGATION_IND,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightNegationInd"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightId(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightId(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightId(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightId(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightId(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ID,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightId"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightCodeP(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightCodeP"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightCodeP", passToken);
				}
				passToken.add(hearingScreeningOutcomeObservationRight);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '73744-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningOutcomeObservationRight)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightCode"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightText(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightText(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightText(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightText(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightText(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TEXT,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightText"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightStatusCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightStatusCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'aborted' or value.code = 'active' or value.code = 'cancelled' or value.code = 'completed' or value.code = 'held' or value.code = 'suspended')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightStatusCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightStatusCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightStatusCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightStatusCode"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightStatusCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightStatusCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightStatusCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightStatusCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightStatusCodeP(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_STATUS_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightStatusCodeP"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightEffectiveTime(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightEffectiveTime(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightEffectiveTime(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightEffectiveTime(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightEffectiveTime(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_EFFECTIVE_TIME,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightEffectiveTime"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightValue(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightValue(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightValue(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightValue(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightValue(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_VALUE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightValue"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightMethodCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightMethodCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightMethodCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightMethodCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightMethodCodeP(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightMethodCodeP"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightMethodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightMethodCodeP", passToken);
				}
				passToken.add(hearingScreeningOutcomeObservationRight);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightMethodCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightMethodCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA10387-1' or value.code = 'LA10388-9' or value.code = 'LA10389-7' or value.code = 'LA10390-5' or value.code = 'LA10391-3' or value.code = 'LA12406-7')))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightMethodCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightMethodCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightMethodCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightMethodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningOutcomeObservationRight)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_METHOD_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightMethodCode"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightTargetSiteCodeP(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightTargetSiteCodeP"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightTargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightTargetSiteCodeP", passToken);
				}
				passToken.add(hearingScreeningOutcomeObservationRight);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightTargetSiteCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightTargetSiteCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '89644007' or value.code = '25577004')))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightTargetSiteCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightTargetSiteCode(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightTargetSiteCode(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOutcomeObservationRightTargetSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningOutcomeObservationRight)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_TARGET_SITE_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightTargetSiteCode"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightEntryRelationship(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightEntryRelationship(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightEntryRelationship(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightEntryRelationship(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightEntryRelationship(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_ENTRY_RELATIONSHIP,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightEntryRelationship"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingScreeningOutcomeObservationRightAuthor(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Author</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightAuthor(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingScreeningOutcomeObservationRightAuthor(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Outcome Observation Right Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingScreeningOutcomeObservationRightAuthor(HearingScreeningOutcomeObservationRight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingScreeningOutcomeObservationRight The receiving '<em><b>Hearing Screening Outcome Observation Right</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingScreeningOutcomeObservationRightAuthor(HearingScreeningOutcomeObservationRight hearingScreeningOutcomeObservationRight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT);
			try {
				VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingScreeningOutcomeObservationRight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT__HEARING_SCREENING_OUTCOME_OBSERVATION_RIGHT_AUTHOR,
						 HPOCPlugin.INSTANCE.getString("HearingScreeningOutcomeObservationRightHearingScreeningOutcomeObservationRightAuthor"),
						 new Object [] { hearingScreeningOutcomeObservationRight }));
			}
			 
			return false;
		}
		return true;
	}

} // HearingScreeningOutcomeObservationRightOperations