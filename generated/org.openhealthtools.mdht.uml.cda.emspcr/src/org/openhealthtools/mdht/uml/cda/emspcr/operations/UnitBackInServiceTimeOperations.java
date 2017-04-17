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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit Back In Service Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitBackInServiceTimeOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected UnitBackInServiceTimeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitBackInServiceTimeTemplateId(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeTemplateId(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_BACK_IN_SERVICE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.45')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitBackInServiceTimeTemplateId(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeTemplateId(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_BACK_IN_SERVICE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitBackInServiceTime The receiving '<em><b>Unit Back In Service Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitBackInServiceTimeTemplateId(UnitBackInServiceTime unitBackInServiceTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_UNIT_BACK_IN_SERVICE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_BACK_IN_SERVICE_TIME);
			try {
				VALIDATE_UNIT_BACK_IN_SERVICE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitBackInServiceTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_BACK_IN_SERVICE_TIME__UNIT_BACK_IN_SERVICE_TIME_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("UnitBackInServiceTimeUnitBackInServiceTimeTemplateId"),
						 new Object [] { unitBackInServiceTime }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitBackInServiceTimeMoodCode(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeMoodCode(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_BACK_IN_SERVICE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitBackInServiceTimeMoodCode(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeMoodCode(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_BACK_IN_SERVICE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitBackInServiceTime The receiving '<em><b>Unit Back In Service Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitBackInServiceTimeMoodCode(UnitBackInServiceTime unitBackInServiceTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_UNIT_BACK_IN_SERVICE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_BACK_IN_SERVICE_TIME);
			try {
				VALIDATE_UNIT_BACK_IN_SERVICE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitBackInServiceTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_BACK_IN_SERVICE_TIME__UNIT_BACK_IN_SERVICE_TIME_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("UnitBackInServiceTimeUnitBackInServiceTimeMoodCode"),
						 new Object [] { unitBackInServiceTime }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitBackInServiceTimeCodeP(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeCodeP(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitBackInServiceTimeCodeP(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeCodeP(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitBackInServiceTime The receiving '<em><b>Unit Back In Service Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitBackInServiceTimeCodeP(UnitBackInServiceTime unitBackInServiceTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_BACK_IN_SERVICE_TIME);
			try {
				VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitBackInServiceTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_BACK_IN_SERVICE_TIME__UNIT_BACK_IN_SERVICE_TIME_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("UnitBackInServiceTimeUnitBackInServiceTimeCodeP"),
						 new Object [] { unitBackInServiceTime }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTimeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTimeCodeP", passToken);
				}
				passToken.add(unitBackInServiceTime);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitBackInServiceTimeCode(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeCode(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69477-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitBackInServiceTimeCode(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeCode(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitBackInServiceTime The receiving '<em><b>Unit Back In Service Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitBackInServiceTimeCode(UnitBackInServiceTime unitBackInServiceTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTimeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(unitBackInServiceTime)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_BACK_IN_SERVICE_TIME);
			try {
				VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitBackInServiceTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_BACK_IN_SERVICE_TIME__UNIT_BACK_IN_SERVICE_TIME_CODE,
						 EmspcrPlugin.INSTANCE.getString("UnitBackInServiceTimeUnitBackInServiceTimeCode"),
						 new Object [] { unitBackInServiceTime }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitBackInServiceTimeValue(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeValue(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_BACK_IN_SERVICE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitBackInServiceTimeValue(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitBackInServiceTimeValue(UnitBackInServiceTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_BACK_IN_SERVICE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitBackInServiceTime The receiving '<em><b>Unit Back In Service Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitBackInServiceTimeValue(UnitBackInServiceTime unitBackInServiceTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_UNIT_BACK_IN_SERVICE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_BACK_IN_SERVICE_TIME);
			try {
				VALIDATE_UNIT_BACK_IN_SERVICE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_BACK_IN_SERVICE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitBackInServiceTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_BACK_IN_SERVICE_TIME__UNIT_BACK_IN_SERVICE_TIME_VALUE,
						 EmspcrPlugin.INSTANCE.getString("UnitBackInServiceTimeUnitBackInServiceTimeValue"),
						 new Object [] { unitBackInServiceTime }));
			}
			 
			return false;
		}
		return true;
	}

} // UnitBackInServiceTimeOperations
