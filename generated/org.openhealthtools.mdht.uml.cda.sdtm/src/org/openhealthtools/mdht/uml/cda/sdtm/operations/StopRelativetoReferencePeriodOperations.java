/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Stop Relativeto Reference Period</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod#validateStopRelativetoReferencePeriodTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod#validateStopRelativetoReferencePeriodClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod#validateStopRelativetoReferencePeriodMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod#validateStopRelativetoReferencePeriodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod#validateStopRelativetoReferencePeriodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod#validateStopRelativetoReferencePeriodValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod#validateStopRelativetoReferencePeriodValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StopRelativetoReferencePeriodOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected StopRelativetoReferencePeriodOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStopRelativetoReferencePeriodTemplateId(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodTemplateId(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.80')";

	/**
	 * The cached OCL invariant for the '{@link #validateStopRelativetoReferencePeriodTemplateId(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodTemplateId(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param stopRelativetoReferencePeriod The receiving '<em><b>Stop Relativeto Reference Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStopRelativetoReferencePeriodTemplateId(StopRelativetoReferencePeriod stopRelativetoReferencePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STOP_RELATIVETO_REFERENCE_PERIOD);
			try {
				VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(stopRelativetoReferencePeriod)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STOP_RELATIVETO_REFERENCE_PERIOD__STOP_RELATIVETO_REFERENCE_PERIOD_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StopRelativetoReferencePeriodStopRelativetoReferencePeriodTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stopRelativetoReferencePeriod, context) }),
						 new Object [] { stopRelativetoReferencePeriod }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStopRelativetoReferencePeriodClassCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodClassCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateStopRelativetoReferencePeriodClassCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodClassCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param stopRelativetoReferencePeriod The receiving '<em><b>Stop Relativeto Reference Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStopRelativetoReferencePeriodClassCode(StopRelativetoReferencePeriod stopRelativetoReferencePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STOP_RELATIVETO_REFERENCE_PERIOD);
			try {
				VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(stopRelativetoReferencePeriod)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STOP_RELATIVETO_REFERENCE_PERIOD__STOP_RELATIVETO_REFERENCE_PERIOD_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StopRelativetoReferencePeriodStopRelativetoReferencePeriodClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stopRelativetoReferencePeriod, context) }),
						 new Object [] { stopRelativetoReferencePeriod }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStopRelativetoReferencePeriodMoodCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodMoodCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateStopRelativetoReferencePeriodMoodCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodMoodCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param stopRelativetoReferencePeriod The receiving '<em><b>Stop Relativeto Reference Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStopRelativetoReferencePeriodMoodCode(StopRelativetoReferencePeriod stopRelativetoReferencePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STOP_RELATIVETO_REFERENCE_PERIOD);
			try {
				VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(stopRelativetoReferencePeriod)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STOP_RELATIVETO_REFERENCE_PERIOD__STOP_RELATIVETO_REFERENCE_PERIOD_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StopRelativetoReferencePeriodStopRelativetoReferencePeriodMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stopRelativetoReferencePeriod, context) }),
						 new Object [] { stopRelativetoReferencePeriod }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStopRelativetoReferencePeriodCodeP(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodCodeP(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStopRelativetoReferencePeriodCodeP(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodCodeP(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param stopRelativetoReferencePeriod The receiving '<em><b>Stop Relativeto Reference Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStopRelativetoReferencePeriodCodeP(StopRelativetoReferencePeriod stopRelativetoReferencePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STOP_RELATIVETO_REFERENCE_PERIOD);
			try {
				VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(stopRelativetoReferencePeriod)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STOP_RELATIVETO_REFERENCE_PERIOD__STOP_RELATIVETO_REFERENCE_PERIOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StopRelativetoReferencePeriodStopRelativetoReferencePeriodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stopRelativetoReferencePeriod, context) }),
						 new Object [] { stopRelativetoReferencePeriod }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStopRelativetoReferencePeriodCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ENRPtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateStopRelativetoReferencePeriodCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodCode(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param stopRelativetoReferencePeriod The receiving '<em><b>Stop Relativeto Reference Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStopRelativetoReferencePeriodCode(StopRelativetoReferencePeriod stopRelativetoReferencePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STOP_RELATIVETO_REFERENCE_PERIOD);
			try {
				VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(stopRelativetoReferencePeriod)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STOP_RELATIVETO_REFERENCE_PERIOD__STOP_RELATIVETO_REFERENCE_PERIOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StopRelativetoReferencePeriodStopRelativetoReferencePeriodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stopRelativetoReferencePeriod, context) }),
						 new Object [] { stopRelativetoReferencePeriod }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStopRelativetoReferencePeriodValue(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodValue(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C78802' or value.code = 'C78800' or value.code = '78801' or value.code = '78727' or value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX')))";

	/**
	 * The cached OCL invariant for the '{@link #validateStopRelativetoReferencePeriodValue(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodValue(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param stopRelativetoReferencePeriod The receiving '<em><b>Stop Relativeto Reference Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStopRelativetoReferencePeriodValue(StopRelativetoReferencePeriod stopRelativetoReferencePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STOP_RELATIVETO_REFERENCE_PERIOD);
			try {
				VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(stopRelativetoReferencePeriod)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STOP_RELATIVETO_REFERENCE_PERIOD__STOP_RELATIVETO_REFERENCE_PERIOD_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StopRelativetoReferencePeriodStopRelativetoReferencePeriodValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stopRelativetoReferencePeriod, context) }),
						 new Object [] { stopRelativetoReferencePeriod }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStopRelativetoReferencePeriodValueP(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodValueP(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateStopRelativetoReferencePeriodValueP(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stop Relativeto Reference Period Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStopRelativetoReferencePeriodValueP(StopRelativetoReferencePeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param stopRelativetoReferencePeriod The receiving '<em><b>Stop Relativeto Reference Period</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStopRelativetoReferencePeriodValueP(StopRelativetoReferencePeriod stopRelativetoReferencePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STOP_RELATIVETO_REFERENCE_PERIOD);
			try {
				VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STOP_RELATIVETO_REFERENCE_PERIOD_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(stopRelativetoReferencePeriod)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STOP_RELATIVETO_REFERENCE_PERIOD__STOP_RELATIVETO_REFERENCE_PERIOD_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StopRelativetoReferencePeriodStopRelativetoReferencePeriodValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stopRelativetoReferencePeriod, context) }),
						 new Object [] { stopRelativetoReferencePeriod }));
			}
			 
			return false;
		}
		return true;
	}

} // StopRelativetoReferencePeriodOperations