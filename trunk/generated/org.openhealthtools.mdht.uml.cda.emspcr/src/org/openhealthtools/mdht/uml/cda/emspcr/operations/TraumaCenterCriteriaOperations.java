/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Trauma Center Criteria</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria#validateTraumaCenterCriteriaTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria#validateTraumaCenterCriteriaCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria#validateTraumaCenterCriteriaValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria#validateTraumaCenterCriteriaMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraumaCenterCriteriaOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraumaCenterCriteriaOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaCenterCriteriaTemplateId(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaCenterCriteriaTemplateId(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_CENTER_CRITERIA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.52')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaCenterCriteriaTemplateId(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaCenterCriteriaTemplateId(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TRAUMA_CENTER_CRITERIA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaCenterCriteria The receiving '<em><b>Trauma Center Criteria</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaCenterCriteriaTemplateId(TraumaCenterCriteria traumaCenterCriteria, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRAUMA_CENTER_CRITERIA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_CENTER_CRITERIA);
			try {
				VALIDATE_TRAUMA_CENTER_CRITERIA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRAUMA_CENTER_CRITERIA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRAUMA_CENTER_CRITERIA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(traumaCenterCriteria)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_CENTER_CRITERIA__TRAUMA_CENTER_CRITERIA_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("TraumaCenterCriteriaTemplateId"),
						 new Object [] { traumaCenterCriteria }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaCenterCriteriaCode(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaCenterCriteriaCode(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_CENTER_CRITERIA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67495-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaCenterCriteriaCode(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaCenterCriteriaCode(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TRAUMA_CENTER_CRITERIA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaCenterCriteria The receiving '<em><b>Trauma Center Criteria</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaCenterCriteriaCode(TraumaCenterCriteria traumaCenterCriteria, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRAUMA_CENTER_CRITERIA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_CENTER_CRITERIA);
			try {
				VALIDATE_TRAUMA_CENTER_CRITERIA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRAUMA_CENTER_CRITERIA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRAUMA_CENTER_CRITERIA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(traumaCenterCriteria)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_CENTER_CRITERIA__TRAUMA_CENTER_CRITERIA_CODE,
						 EmspcrPlugin.INSTANCE.getString("TraumaCenterCriteriaCode"),
						 new Object [] { traumaCenterCriteria }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaCenterCriteriaValue(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaCenterCriteriaValue(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_CENTER_CRITERIA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17337-9' or value.code = 'LA17338-7' or value.code = 'LA17339-5' or value.code = 'LA17340-3' or value.code = 'LA17341-1' or value.code = 'LA17342-9' or value.code = 'LA17343-7' or value.code = 'LA17344-5' or value.code = 'LA17345-2' or value.code = 'LA17346-0' or value.code = 'LA17347-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaCenterCriteriaValue(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaCenterCriteriaValue(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TRAUMA_CENTER_CRITERIA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaCenterCriteria The receiving '<em><b>Trauma Center Criteria</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaCenterCriteriaValue(TraumaCenterCriteria traumaCenterCriteria, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRAUMA_CENTER_CRITERIA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_CENTER_CRITERIA);
			try {
				VALIDATE_TRAUMA_CENTER_CRITERIA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRAUMA_CENTER_CRITERIA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRAUMA_CENTER_CRITERIA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(traumaCenterCriteria)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_CENTER_CRITERIA__TRAUMA_CENTER_CRITERIA_VALUE,
						 EmspcrPlugin.INSTANCE.getString("TraumaCenterCriteriaValue"),
						 new Object [] { traumaCenterCriteria }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaCenterCriteriaMoodCode(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaCenterCriteriaMoodCode(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_CENTER_CRITERIA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaCenterCriteriaMoodCode(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaCenterCriteriaMoodCode(TraumaCenterCriteria, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TRAUMA_CENTER_CRITERIA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaCenterCriteria The receiving '<em><b>Trauma Center Criteria</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaCenterCriteriaMoodCode(TraumaCenterCriteria traumaCenterCriteria, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRAUMA_CENTER_CRITERIA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_CENTER_CRITERIA);
			try {
				VALIDATE_TRAUMA_CENTER_CRITERIA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRAUMA_CENTER_CRITERIA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRAUMA_CENTER_CRITERIA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(traumaCenterCriteria)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_CENTER_CRITERIA__TRAUMA_CENTER_CRITERIA_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("TraumaCenterCriteriaMoodCode"),
						 new Object [] { traumaCenterCriteria }));
			}
			 
			return false;
		}
		return true;
	}

} // TraumaCenterCriteriaOperations