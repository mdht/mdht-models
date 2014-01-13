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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Total</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlasgowTotalOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowTotalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowTotalTemplateId(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalTemplateId(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_TOTAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.158')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowTotalTemplateId(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalTemplateId(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_TOTAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowTotal The receiving '<em><b>Glasgow Total</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowTotalTemplateId(GlasgowTotal glasgowTotal, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_TOTAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_TOTAL);
			try {
				VALIDATE_GLASGOW_TOTAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_TOTAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_TOTAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowTotal)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_TOTAL__GLASGOW_TOTAL_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("GlasgowTotalTemplateId"),
						 new Object [] { glasgowTotal }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowTotalMoodCode(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalMoodCode(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_TOTAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowTotalMoodCode(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalMoodCode(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_TOTAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowTotal The receiving '<em><b>Glasgow Total</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowTotalMoodCode(GlasgowTotal glasgowTotal, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_TOTAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_TOTAL);
			try {
				VALIDATE_GLASGOW_TOTAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_TOTAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_TOTAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowTotal)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_TOTAL__GLASGOW_TOTAL_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("GlasgowTotalMoodCode"),
						 new Object [] { glasgowTotal }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowTotalCodeP(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalCodeP(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_TOTAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowTotalCodeP(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalCodeP(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_TOTAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowTotal The receiving '<em><b>Glasgow Total</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowTotalCodeP(GlasgowTotal glasgowTotal, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_TOTAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_TOTAL);
			try {
				VALIDATE_GLASGOW_TOTAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_TOTAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_TOTAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowTotal)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_TOTAL__GLASGOW_TOTAL_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("GlasgowTotalCodeP"),
						 new Object [] { glasgowTotal }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotalCodeP", passToken);
				}
				passToken.add(glasgowTotal);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowTotalCode(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalCode(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_TOTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '9269-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowTotalCode(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalCode(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_TOTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowTotal The receiving '<em><b>Glasgow Total</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowTotalCode(GlasgowTotal glasgowTotal, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotalCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(glasgowTotal)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_GLASGOW_TOTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_TOTAL);
			try {
				VALIDATE_GLASGOW_TOTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_TOTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_TOTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowTotal)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_TOTAL__GLASGOW_TOTAL_CODE,
						 EmspcrPlugin.INSTANCE.getString("GlasgowTotalCode"),
						 new Object [] { glasgowTotal }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowTotalValue(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalValue(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_TOTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowTotalValue(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowTotalValue(GlasgowTotal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_TOTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowTotal The receiving '<em><b>Glasgow Total</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowTotalValue(GlasgowTotal glasgowTotal, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_TOTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_TOTAL);
			try {
				VALIDATE_GLASGOW_TOTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_TOTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_TOTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowTotal)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_TOTAL__GLASGOW_TOTAL_VALUE,
						 EmspcrPlugin.INSTANCE.getString("GlasgowTotalValue"),
						 new Object [] { glasgowTotal }));
			}
			 
			return false;
		}
		return true;
	}

} // GlasgowTotalOperations