/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation#validateRiskIndicatorForHearingLossObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskIndicatorForHearingLossObservationOperations extends ClinicalStatementOperations
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
  protected RiskIndicatorForHearingLossObservationOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationTemplateId(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationTemplateId(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.1.4.15')";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationTemplateId(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationTemplateId(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationTemplateId(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationTemplateId"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationClassCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationClassCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationClassCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationClassCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationClassCode(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CLASS_CODE,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationClassCode"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationMoodCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationMoodCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationMoodCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationMoodCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationMoodCode(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_MOOD_CODE,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationMoodCode"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationCode(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_CODE,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationCode"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationText(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationText(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationText(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationText(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationText(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_TEXT,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationText"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationStatusCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationStatusCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationStatusCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationStatusCode(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationStatusCode(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationStatusCode"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationStatusCodeP(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationStatusCodeP(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationStatusCodeP(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationStatusCodeP(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationStatusCodeP(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_STATUS_CODE_P,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationStatusCodeP"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationValue(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationValue(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationValue(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationValue(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationValue(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_VALUE,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationValue"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationId(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationId(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationId(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationId(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationId(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_ID,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationId"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorForHearingLossObservationEffectiveTime(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationEffectiveTime(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorForHearingLossObservationEffectiveTime(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicator For Hearing Loss Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorForHearingLossObservationEffectiveTime(RiskIndicatorForHearingLossObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskIndicatorForHearingLossObservation The receiving '<em><b>Risk Indicator For Hearing Loss Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorForHearingLossObservationEffectiveTime(RiskIndicatorForHearingLossObservation riskIndicatorForHearingLossObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION);
			try {
				VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(riskIndicatorForHearingLossObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION__RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION_EFFECTIVE_TIME,
						 HPOCPlugin.INSTANCE.getString("RiskIndicatorForHearingLossObservationRiskIndicatorForHearingLossObservationEffectiveTime"),
						 new Object [] { riskIndicatorForHearingLossObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // RiskIndicatorForHearingLossObservationOperations