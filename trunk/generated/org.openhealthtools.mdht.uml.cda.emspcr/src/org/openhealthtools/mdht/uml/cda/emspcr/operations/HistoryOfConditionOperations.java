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
import org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryOfConditionOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryOfConditionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfConditionTemplateId(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionTemplateId(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.61')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfConditionTemplateId(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionTemplateId(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfCondition The receiving '<em><b>History Of Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfConditionTemplateId(HistoryOfCondition historyOfCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_CONDITION);
			try {
				VALIDATE_HISTORY_OF_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfCondition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_CONDITION__HISTORY_OF_CONDITION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfConditionTemplateId"),
						 new Object [] { historyOfCondition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfConditionMoodCode(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionMoodCode(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfConditionMoodCode(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionMoodCode(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfCondition The receiving '<em><b>History Of Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfConditionMoodCode(HistoryOfCondition historyOfCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_CONDITION);
			try {
				VALIDATE_HISTORY_OF_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfCondition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_CONDITION__HISTORY_OF_CONDITION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfConditionMoodCode"),
						 new Object [] { historyOfCondition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfConditionCodeP(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionCodeP(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfConditionCodeP(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionCodeP(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfCondition The receiving '<em><b>History Of Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfConditionCodeP(HistoryOfCondition historyOfCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_CONDITION);
			try {
				VALIDATE_HISTORY_OF_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfCondition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_CONDITION__HISTORY_OF_CONDITION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfConditionCodeP"),
						 new Object [] { historyOfCondition }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfConditionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfConditionCodeP", passToken);
				}
				passToken.add(historyOfCondition);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfConditionCode(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionCode(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '68487-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfConditionCode(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionCode(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfCondition The receiving '<em><b>History Of Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfConditionCode(HistoryOfCondition historyOfCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfConditionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(historyOfCondition)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_HISTORY_OF_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_CONDITION);
			try {
				VALIDATE_HISTORY_OF_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfCondition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_CONDITION__HISTORY_OF_CONDITION_CODE,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfConditionCode"),
						 new Object [] { historyOfCondition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfConditionValue(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionValue(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.90'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfConditionValue(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionValue(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfCondition The receiving '<em><b>History Of Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfConditionValue(HistoryOfCondition historyOfCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_CONDITION);
			try {
				VALIDATE_HISTORY_OF_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfCondition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_CONDITION__HISTORY_OF_CONDITION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfConditionValue"),
						 new Object [] { historyOfCondition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfConditionValueP(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionValueP(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfConditionValueP(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfConditionValueP(HistoryOfCondition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfCondition The receiving '<em><b>History Of Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfConditionValueP(HistoryOfCondition historyOfCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_CONDITION);
			try {
				VALIDATE_HISTORY_OF_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfCondition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_CONDITION__HISTORY_OF_CONDITION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfConditionValueP"),
						 new Object [] { historyOfCondition }));
			}
			 
			return false;
		}
		return true;
	}

} // HistoryOfConditionOperations