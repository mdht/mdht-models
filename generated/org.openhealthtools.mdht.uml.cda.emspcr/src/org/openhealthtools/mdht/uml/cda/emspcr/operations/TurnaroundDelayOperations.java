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
import org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Turnaround Delay</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TurnaroundDelayOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected TurnaroundDelayOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTurnaroundDelayTemplateId(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayTemplateId(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TURNAROUND_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.157')";

	/**
	 * The cached OCL invariant for the '{@link #validateTurnaroundDelayTemplateId(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayTemplateId(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TURNAROUND_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param turnaroundDelay The receiving '<em><b>Turnaround Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTurnaroundDelayTemplateId(TurnaroundDelay turnaroundDelay,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TURNAROUND_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TURNAROUND_DELAY);
			try {
				VALIDATE_TURNAROUND_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TURNAROUND_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TURNAROUND_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(turnaroundDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TURNAROUND_DELAY__TURNAROUND_DELAY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("TurnaroundDelayTurnaroundDelayTemplateId"),
						 new Object [] { turnaroundDelay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTurnaroundDelayMoodCode(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayMoodCode(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TURNAROUND_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTurnaroundDelayMoodCode(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayMoodCode(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TURNAROUND_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param turnaroundDelay The receiving '<em><b>Turnaround Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTurnaroundDelayMoodCode(TurnaroundDelay turnaroundDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TURNAROUND_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TURNAROUND_DELAY);
			try {
				VALIDATE_TURNAROUND_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TURNAROUND_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TURNAROUND_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(turnaroundDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TURNAROUND_DELAY__TURNAROUND_DELAY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("TurnaroundDelayTurnaroundDelayMoodCode"),
						 new Object [] { turnaroundDelay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTurnaroundDelayCodeP(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayCodeP(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TURNAROUND_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTurnaroundDelayCodeP(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayCodeP(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TURNAROUND_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param turnaroundDelay The receiving '<em><b>Turnaround Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTurnaroundDelayCodeP(TurnaroundDelay turnaroundDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TURNAROUND_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TURNAROUND_DELAY);
			try {
				VALIDATE_TURNAROUND_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TURNAROUND_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TURNAROUND_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(turnaroundDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TURNAROUND_DELAY__TURNAROUND_DELAY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("TurnaroundDelayTurnaroundDelayCodeP"),
						 new Object [] { turnaroundDelay }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelayCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelayCodeP", passToken);
				}
				passToken.add(turnaroundDelay);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTurnaroundDelayCode(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayCode(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TURNAROUND_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67560-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTurnaroundDelayCode(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayCode(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TURNAROUND_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param turnaroundDelay The receiving '<em><b>Turnaround Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTurnaroundDelayCode(TurnaroundDelay turnaroundDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelayCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(turnaroundDelay)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TURNAROUND_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TURNAROUND_DELAY);
			try {
				VALIDATE_TURNAROUND_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TURNAROUND_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TURNAROUND_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(turnaroundDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TURNAROUND_DELAY__TURNAROUND_DELAY_CODE,
						 EmspcrPlugin.INSTANCE.getString("TurnaroundDelayTurnaroundDelayCode"),
						 new Object [] { turnaroundDelay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTurnaroundDelayValue(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayValue(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TURNAROUND_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17059-9' or value.code = 'LA17587-9' or value.code = 'LA17590-3' or value.code = 'LA17592-9' or value.code = 'LA17593-7' or value.code = 'LA17594-5' or value.code = 'LA17598-6' or value.code = 'LA17599-4' or value.code = 'LA17600-0' or value.code = 'LA17601-8' or value.code = 'LA17602-6' or value.code = 'LA17603-4' or value.code = 'LA18081-2' or value.code = 'LA18270-1' or value.code = 'LA18271-9' or value.code = 'LA7497-6')))";

	/**
	 * The cached OCL invariant for the '{@link #validateTurnaroundDelayValue(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayValue(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TURNAROUND_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param turnaroundDelay The receiving '<em><b>Turnaround Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTurnaroundDelayValue(TurnaroundDelay turnaroundDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TURNAROUND_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TURNAROUND_DELAY);
			try {
				VALIDATE_TURNAROUND_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TURNAROUND_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TURNAROUND_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(turnaroundDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TURNAROUND_DELAY__TURNAROUND_DELAY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("TurnaroundDelayTurnaroundDelayValue"),
						 new Object [] { turnaroundDelay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTurnaroundDelayValueP(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayValueP(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TURNAROUND_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTurnaroundDelayValueP(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTurnaroundDelayValueP(TurnaroundDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TURNAROUND_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param turnaroundDelay The receiving '<em><b>Turnaround Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTurnaroundDelayValueP(TurnaroundDelay turnaroundDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TURNAROUND_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TURNAROUND_DELAY);
			try {
				VALIDATE_TURNAROUND_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TURNAROUND_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TURNAROUND_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(turnaroundDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TURNAROUND_DELAY__TURNAROUND_DELAY_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("TurnaroundDelayTurnaroundDelayValueP"),
						 new Object [] { turnaroundDelay }));
			}
			 
			return false;
		}
		return true;
	}

} // TurnaroundDelayOperations
