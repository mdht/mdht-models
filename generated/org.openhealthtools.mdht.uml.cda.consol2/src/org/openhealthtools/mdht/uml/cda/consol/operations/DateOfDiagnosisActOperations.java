/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Date Of Diagnosis Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActIVLTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateOfDiagnosisActOperations extends ClinicalStatementOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected DateOfDiagnosisActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActTemplateId(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActTemplateId(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.502' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActTemplateId(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActTemplateId(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DATE_OF_DIAGNOSIS_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDateOfDiagnosisActTemplateId(DateOfDiagnosisAct dateOfDiagnosisAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DATE_OF_DIAGNOSIS_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dateOfDiagnosisAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActTemplateId"),
						 new Object [] { dateOfDiagnosisAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActCodeP(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActCodeP(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActCodeP(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActCodeP(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDateOfDiagnosisActCodeP(DateOfDiagnosisAct dateOfDiagnosisAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dateOfDiagnosisAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_CODE_P,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActCodeP"),
						 new Object [] { dateOfDiagnosisAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisActCodeP", passToken);
				}
				passToken.add(dateOfDiagnosisAct);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77975-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDateOfDiagnosisActCode(DateOfDiagnosisAct dateOfDiagnosisAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dateOfDiagnosisAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dateOfDiagnosisAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_CODE,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActCode"),
						 new Object [] { dateOfDiagnosisAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActStatusCodeP(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActStatusCodeP(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActStatusCodeP(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActStatusCodeP(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDateOfDiagnosisActStatusCodeP(DateOfDiagnosisAct dateOfDiagnosisAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActStatusCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dateOfDiagnosisAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActStatusCodeP"),
						 new Object [] { dateOfDiagnosisAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisActStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisActStatusCodeP", passToken);
				}
				passToken.add(dateOfDiagnosisAct);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActStatusCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActStatusCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActStatusCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActStatusCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDateOfDiagnosisActStatusCode(DateOfDiagnosisAct dateOfDiagnosisAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisActStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dateOfDiagnosisAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActStatusCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dateOfDiagnosisAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActStatusCode"),
						 new Object [] { dateOfDiagnosisAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActEffectiveTime(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActEffectiveTime(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActEffectiveTime(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActEffectiveTime(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDateOfDiagnosisActEffectiveTime(DateOfDiagnosisAct dateOfDiagnosisAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActEffectiveTime","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dateOfDiagnosisAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActEffectiveTime"),
						 new Object [] { dateOfDiagnosisAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActClassCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActClassCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActClassCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActClassCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DATE_OF_DIAGNOSIS_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDateOfDiagnosisActClassCode(DateOfDiagnosisAct dateOfDiagnosisAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DATE_OF_DIAGNOSIS_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dateOfDiagnosisAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActClassCode"),
						 new Object [] { dateOfDiagnosisAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActMoodCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActMoodCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActMoodCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActMoodCode(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DATE_OF_DIAGNOSIS_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDateOfDiagnosisActMoodCode(DateOfDiagnosisAct dateOfDiagnosisAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DATE_OF_DIAGNOSIS_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dateOfDiagnosisAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActMoodCode"),
						 new Object [] { dateOfDiagnosisAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActIVLTSValue(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActIVLTSValue(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActIVLTSValue(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActIVLTSValue(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDateOfDiagnosisActIVLTSValue(DateOfDiagnosisAct dateOfDiagnosisAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActIVLTSValue","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(dateOfDiagnosisAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_IVLTS_VALUE,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActIVLTSValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActIVLTSLow(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActIVLTSLow(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (low.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActIVLTSLow(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActIVLTSLow(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDateOfDiagnosisActIVLTSLow(DateOfDiagnosisAct dateOfDiagnosisAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActIVLTSLow","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(dateOfDiagnosisAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_IVLTS_LOW,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActIVLTSLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateOfDiagnosisActIVLTSHigh(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActIVLTSHigh(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (high.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDateOfDiagnosisActIVLTSHigh(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateOfDiagnosisActIVLTSHigh(DateOfDiagnosisAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateOfDiagnosisAct The receiving '<em><b>Date Of Diagnosis Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDateOfDiagnosisActIVLTSHigh(DateOfDiagnosisAct dateOfDiagnosisAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DateOfDiagnosisActDateOfDiagnosisActIVLTSHigh","ERROR");
    
  	  
  	  
		if (VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATE_OF_DIAGNOSIS_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_DATE_OF_DIAGNOSIS_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(dateOfDiagnosisAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DATE_OF_DIAGNOSIS_ACT__DATE_OF_DIAGNOSIS_ACT_IVLTS_HIGH,
						 ConsolPlugin.INSTANCE.getString("DateOfDiagnosisActDateOfDiagnosisActIVLTSHigh"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // DateOfDiagnosisActOperations
