/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure#validateHearingPlanOfCareProcedureActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Procedure Activity Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure#validateProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityProcedure#validateHearingPlanOfCareProcedureActivityProcedureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Procedure Activity Procedure Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareProcedureActivityProcedureOperations
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
  protected HearingPlanOfCareProcedureActivityProcedureOperations() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProcedureActivityProcedure The receiving '<em><b>Hearing Plan Of Care Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareProcedureActivityProcedureId(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProcedureActivityProcedureHearingPlanOfCareProcedureActivityProcedureId"),
						 new Object [] { hearingPlanOfCareProcedureActivityProcedure }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProcedureActivityProcedure The receiving '<em><b>Hearing Plan Of Care Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareProcedureActivityProcedureText(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE__HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProcedureActivityProcedureHearingPlanOfCareProcedureActivityProcedureText"),
						 new Object [] { hearingPlanOfCareProcedureActivityProcedure }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureTemplateId(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureTemplateId(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.20')";

  /**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureTemplateId(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureTemplateId(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProcedureActivityProcedureId(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Procedure Activity Procedure Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProcedureActivityProcedureId(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

		/**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProcedureActivityProcedureId(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Procedure Activity Procedure Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProcedureActivityProcedureId(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProcedureActivityProcedure The receiving '<em><b>Hearing Plan Of Care Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateProcedureActivityProcedureTemplateId(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProcedureActivityProcedureProcedureActivityProcedureTemplateId"),
						 new Object [] { hearingPlanOfCareProcedureActivityProcedure }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureCode(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureCode(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureCode(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureCode(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProcedureActivityProcedureText(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Procedure Activity Procedure Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProcedureActivityProcedureText(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

		/**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProcedureActivityProcedureText(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Procedure Activity Procedure Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProcedureActivityProcedureText(HearingPlanOfCareProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProcedureActivityProcedure The receiving '<em><b>Hearing Plan Of Care Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateProcedureActivityProcedureCode(HearingPlanOfCareProcedureActivityProcedure hearingPlanOfCareProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProcedureActivityProcedureProcedureActivityProcedureCode"),
						 new Object [] { hearingPlanOfCareProcedureActivityProcedure }));
			}
			 
			return false;
		}
		return true;
	}

} // HearingPlanOfCareProcedureActivityProcedureOperations