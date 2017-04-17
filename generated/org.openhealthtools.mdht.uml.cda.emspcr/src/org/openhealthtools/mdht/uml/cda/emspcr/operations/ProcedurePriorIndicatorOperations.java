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
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Prior Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedurePriorIndicatorOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected ProcedurePriorIndicatorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePriorIndicatorTemplateId(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorTemplateId(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PRIOR_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.131')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePriorIndicatorTemplateId(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorTemplateId(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_PRIOR_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedurePriorIndicator The receiving '<em><b>Procedure Prior Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedurePriorIndicatorTemplateId(ProcedurePriorIndicator procedurePriorIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_PRIOR_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_PRIOR_INDICATOR);
			try {
				VALIDATE_PROCEDURE_PRIOR_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_PRIOR_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_PRIOR_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedurePriorIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE_PRIOR_INDICATOR__PROCEDURE_PRIOR_INDICATOR_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ProcedurePriorIndicatorProcedurePriorIndicatorTemplateId"),
						 new Object [] { procedurePriorIndicator }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePriorIndicatorMoodCode(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorMoodCode(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PRIOR_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePriorIndicatorMoodCode(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorMoodCode(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_PRIOR_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedurePriorIndicator The receiving '<em><b>Procedure Prior Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedurePriorIndicatorMoodCode(ProcedurePriorIndicator procedurePriorIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_PRIOR_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_PRIOR_INDICATOR);
			try {
				VALIDATE_PROCEDURE_PRIOR_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_PRIOR_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_PRIOR_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedurePriorIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE_PRIOR_INDICATOR__PROCEDURE_PRIOR_INDICATOR_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProcedurePriorIndicatorProcedurePriorIndicatorMoodCode"),
						 new Object [] { procedurePriorIndicator }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePriorIndicatorCodeP(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorCodeP(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePriorIndicatorCodeP(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorCodeP(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedurePriorIndicator The receiving '<em><b>Procedure Prior Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedurePriorIndicatorCodeP(ProcedurePriorIndicator procedurePriorIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_PRIOR_INDICATOR);
			try {
				VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedurePriorIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE_PRIOR_INDICATOR__PROCEDURE_PRIOR_INDICATOR_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ProcedurePriorIndicatorProcedurePriorIndicatorCodeP"),
						 new Object [] { procedurePriorIndicator }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicatorCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicatorCodeP", passToken);
				}
				passToken.add(procedurePriorIndicator);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePriorIndicatorCode(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorCode(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67542-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePriorIndicatorCode(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorCode(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedurePriorIndicator The receiving '<em><b>Procedure Prior Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedurePriorIndicatorCode(ProcedurePriorIndicator procedurePriorIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicatorCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(procedurePriorIndicator)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_PRIOR_INDICATOR);
			try {
				VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedurePriorIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE_PRIOR_INDICATOR__PROCEDURE_PRIOR_INDICATOR_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProcedurePriorIndicatorProcedurePriorIndicatorCode"),
						 new Object [] { procedurePriorIndicator }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePriorIndicatorValue(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorValue(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PRIOR_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePriorIndicatorValue(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorIndicatorValue(ProcedurePriorIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_PRIOR_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedurePriorIndicator The receiving '<em><b>Procedure Prior Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedurePriorIndicatorValue(ProcedurePriorIndicator procedurePriorIndicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_PRIOR_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_PRIOR_INDICATOR);
			try {
				VALIDATE_PROCEDURE_PRIOR_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_PRIOR_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_PRIOR_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedurePriorIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE_PRIOR_INDICATOR__PROCEDURE_PRIOR_INDICATOR_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ProcedurePriorIndicatorProcedurePriorIndicatorValue"),
						 new Object [] { procedurePriorIndicator }));
			}
			 
			return false;
		}
		return true;
	}

} // ProcedurePriorIndicatorOperations
