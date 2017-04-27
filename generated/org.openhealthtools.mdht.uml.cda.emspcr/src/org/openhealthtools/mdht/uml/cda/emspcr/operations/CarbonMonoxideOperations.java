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
import org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Carbon Monoxide</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarbonMonoxideOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected CarbonMonoxideOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonMonoxideTemplateId(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideTemplateId(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_MONOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.167')";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonMonoxideTemplateId(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideTemplateId(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARBON_MONOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonMonoxide The receiving '<em><b>Carbon Monoxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonMonoxideTemplateId(CarbonMonoxide carbonMonoxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARBON_MONOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_MONOXIDE);
			try {
				VALIDATE_CARBON_MONOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARBON_MONOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARBON_MONOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(carbonMonoxide)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARBON_MONOXIDE__CARBON_MONOXIDE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("CarbonMonoxideCarbonMonoxideTemplateId"),
						 new Object [] { carbonMonoxide }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonMonoxideMoodCode(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideMoodCode(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_MONOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonMonoxideMoodCode(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideMoodCode(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARBON_MONOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonMonoxide The receiving '<em><b>Carbon Monoxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonMonoxideMoodCode(CarbonMonoxide carbonMonoxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARBON_MONOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_MONOXIDE);
			try {
				VALIDATE_CARBON_MONOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARBON_MONOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARBON_MONOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(carbonMonoxide)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARBON_MONOXIDE__CARBON_MONOXIDE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("CarbonMonoxideCarbonMonoxideMoodCode"),
						 new Object [] { carbonMonoxide }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonMonoxideCodeP(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideCodeP(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_MONOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonMonoxideCodeP(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideCodeP(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARBON_MONOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonMonoxide The receiving '<em><b>Carbon Monoxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonMonoxideCodeP(CarbonMonoxide carbonMonoxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARBON_MONOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_MONOXIDE);
			try {
				VALIDATE_CARBON_MONOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARBON_MONOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARBON_MONOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(carbonMonoxide)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARBON_MONOXIDE__CARBON_MONOXIDE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("CarbonMonoxideCarbonMonoxideCodeP"),
						 new Object [] { carbonMonoxide }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxideCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxideCodeP", passToken);
				}
				passToken.add(carbonMonoxide);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonMonoxideCode(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideCode(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_MONOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '20563-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonMonoxideCode(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideCode(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARBON_MONOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonMonoxide The receiving '<em><b>Carbon Monoxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonMonoxideCode(CarbonMonoxide carbonMonoxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxideCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(carbonMonoxide)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARBON_MONOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_MONOXIDE);
			try {
				VALIDATE_CARBON_MONOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARBON_MONOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARBON_MONOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(carbonMonoxide)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARBON_MONOXIDE__CARBON_MONOXIDE_CODE,
						 EmspcrPlugin.INSTANCE.getString("CarbonMonoxideCarbonMonoxideCode"),
						 new Object [] { carbonMonoxide }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonMonoxideEffectiveTime(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideEffectiveTime(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_MONOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonMonoxideEffectiveTime(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideEffectiveTime(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARBON_MONOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonMonoxide The receiving '<em><b>Carbon Monoxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonMonoxideEffectiveTime(CarbonMonoxide carbonMonoxide,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARBON_MONOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_MONOXIDE);
			try {
				VALIDATE_CARBON_MONOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARBON_MONOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARBON_MONOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(carbonMonoxide)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARBON_MONOXIDE__CARBON_MONOXIDE_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("CarbonMonoxideCarbonMonoxideEffectiveTime"),
						 new Object [] { carbonMonoxide }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonMonoxideValue(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideValue(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_MONOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonMonoxideValue(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonMonoxideValue(CarbonMonoxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARBON_MONOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonMonoxide The receiving '<em><b>Carbon Monoxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonMonoxideValue(CarbonMonoxide carbonMonoxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARBON_MONOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_MONOXIDE);
			try {
				VALIDATE_CARBON_MONOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARBON_MONOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARBON_MONOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(carbonMonoxide)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARBON_MONOXIDE__CARBON_MONOXIDE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("CarbonMonoxideCarbonMonoxideValue"),
						 new Object [] { carbonMonoxide }));
			}
			 
			return false;
		}
		return true;
	}

} // CarbonMonoxideOperations
