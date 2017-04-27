/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Ending Odometer Reading</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseEndingOdometerReadingOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected ResponseEndingOdometerReadingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseEndingOdometerReadingTemplateId(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingTemplateId(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ENDING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.174')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseEndingOdometerReadingTemplateId(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingTemplateId(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ENDING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseEndingOdometerReading The receiving '<em><b>Response Ending Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseEndingOdometerReadingTemplateId(
			ResponseEndingOdometerReading responseEndingOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_ENDING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ENDING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ENDING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseEndingOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ENDING_ODOMETER_READING__RESPONSE_ENDING_ODOMETER_READING_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ResponseEndingOdometerReadingResponseEndingOdometerReadingTemplateId"),
						 new Object [] { responseEndingOdometerReading }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseEndingOdometerReadingMoodCode(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingMoodCode(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ENDING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseEndingOdometerReadingMoodCode(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingMoodCode(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ENDING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseEndingOdometerReading The receiving '<em><b>Response Ending Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseEndingOdometerReadingMoodCode(
			ResponseEndingOdometerReading responseEndingOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_ENDING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ENDING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ENDING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseEndingOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ENDING_ODOMETER_READING__RESPONSE_ENDING_ODOMETER_READING_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseEndingOdometerReadingResponseEndingOdometerReadingMoodCode"),
						 new Object [] { responseEndingOdometerReading }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseEndingOdometerReadingCodeP(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingCodeP(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseEndingOdometerReadingCodeP(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingCodeP(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseEndingOdometerReading The receiving '<em><b>Response Ending Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseEndingOdometerReadingCodeP(
			ResponseEndingOdometerReading responseEndingOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ENDING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseEndingOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ENDING_ODOMETER_READING__RESPONSE_ENDING_ODOMETER_READING_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ResponseEndingOdometerReadingResponseEndingOdometerReadingCodeP"),
						 new Object [] { responseEndingOdometerReading }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReadingCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReadingCodeP", passToken);
				}
				passToken.add(responseEndingOdometerReading);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseEndingOdometerReadingCode(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingCode(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67487-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseEndingOdometerReadingCode(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingCode(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseEndingOdometerReading The receiving '<em><b>Response Ending Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseEndingOdometerReadingCode(
			ResponseEndingOdometerReading responseEndingOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReadingCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(responseEndingOdometerReading)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ENDING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseEndingOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ENDING_ODOMETER_READING__RESPONSE_ENDING_ODOMETER_READING_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseEndingOdometerReadingResponseEndingOdometerReadingCode"),
						 new Object [] { responseEndingOdometerReading }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseEndingOdometerReadingValue(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingValue(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ENDING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseEndingOdometerReadingValue(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseEndingOdometerReadingValue(ResponseEndingOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ENDING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseEndingOdometerReading The receiving '<em><b>Response Ending Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseEndingOdometerReadingValue(
			ResponseEndingOdometerReading responseEndingOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_ENDING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ENDING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ENDING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ENDING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseEndingOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ENDING_ODOMETER_READING__RESPONSE_ENDING_ODOMETER_READING_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ResponseEndingOdometerReadingResponseEndingOdometerReadingValue"),
						 new Object [] { responseEndingOdometerReading }));
			}
			 
			return false;
		}
		return true;
	}

} // ResponseEndingOdometerReadingOperations
