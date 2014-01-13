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

import org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Candidate Patient Registry Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CandidatePatientRegistryTypeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidatePatientRegistryTypeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCandidatePatientRegistryTypeTemplateId(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeTemplateId(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.94')";

	/**
	 * The cached OCL invariant for the '{@link #validateCandidatePatientRegistryTypeTemplateId(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeTemplateId(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param candidatePatientRegistryType The receiving '<em><b>Candidate Patient Registry Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCandidatePatientRegistryTypeTemplateId(CandidatePatientRegistryType candidatePatientRegistryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CANDIDATE_PATIENT_REGISTRY_TYPE);
			try {
				VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(candidatePatientRegistryType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CANDIDATE_PATIENT_REGISTRY_TYPE__CANDIDATE_PATIENT_REGISTRY_TYPE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("CandidatePatientRegistryTypeTemplateId"),
						 new Object [] { candidatePatientRegistryType }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCandidatePatientRegistryTypeMoodCode(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeMoodCode(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCandidatePatientRegistryTypeMoodCode(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeMoodCode(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param candidatePatientRegistryType The receiving '<em><b>Candidate Patient Registry Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCandidatePatientRegistryTypeMoodCode(CandidatePatientRegistryType candidatePatientRegistryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CANDIDATE_PATIENT_REGISTRY_TYPE);
			try {
				VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(candidatePatientRegistryType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CANDIDATE_PATIENT_REGISTRY_TYPE__CANDIDATE_PATIENT_REGISTRY_TYPE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("CandidatePatientRegistryTypeMoodCode"),
						 new Object [] { candidatePatientRegistryType }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCandidatePatientRegistryTypeCodeP(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeCodeP(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCandidatePatientRegistryTypeCodeP(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeCodeP(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param candidatePatientRegistryType The receiving '<em><b>Candidate Patient Registry Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCandidatePatientRegistryTypeCodeP(CandidatePatientRegistryType candidatePatientRegistryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CANDIDATE_PATIENT_REGISTRY_TYPE);
			try {
				VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(candidatePatientRegistryType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CANDIDATE_PATIENT_REGISTRY_TYPE__CANDIDATE_PATIENT_REGISTRY_TYPE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("CandidatePatientRegistryTypeCodeP"),
						 new Object [] { candidatePatientRegistryType }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryTypeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryTypeCodeP", passToken);
				}
				passToken.add(candidatePatientRegistryType);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCandidatePatientRegistryTypeCode(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeCode(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67553-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCandidatePatientRegistryTypeCode(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeCode(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param candidatePatientRegistryType The receiving '<em><b>Candidate Patient Registry Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCandidatePatientRegistryTypeCode(CandidatePatientRegistryType candidatePatientRegistryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryTypeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(candidatePatientRegistryType)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CANDIDATE_PATIENT_REGISTRY_TYPE);
			try {
				VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(candidatePatientRegistryType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CANDIDATE_PATIENT_REGISTRY_TYPE__CANDIDATE_PATIENT_REGISTRY_TYPE_CODE,
						 EmspcrPlugin.INSTANCE.getString("CandidatePatientRegistryTypeCode"),
						 new Object [] { candidatePatientRegistryType }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCandidatePatientRegistryTypeValue(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeValue(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17057-3' or value.code = 'LA17058-1' or value.code = 'LA17059-9' or value.code = 'LA17398-1' or value.code = 'LA17399-9' or value.code = 'LA17400-5' or value.code = 'LA17401-3' or value.code = 'LA7318-4' or value.code = 'LA9535-1' or value.code = 'LA9553-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validateCandidatePatientRegistryTypeValue(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeValue(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param candidatePatientRegistryType The receiving '<em><b>Candidate Patient Registry Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCandidatePatientRegistryTypeValue(CandidatePatientRegistryType candidatePatientRegistryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CANDIDATE_PATIENT_REGISTRY_TYPE);
			try {
				VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(candidatePatientRegistryType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CANDIDATE_PATIENT_REGISTRY_TYPE__CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("CandidatePatientRegistryTypeValue"),
						 new Object [] { candidatePatientRegistryType }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCandidatePatientRegistryTypeValueP(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeValueP(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCandidatePatientRegistryTypeValueP(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCandidatePatientRegistryTypeValueP(CandidatePatientRegistryType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param candidatePatientRegistryType The receiving '<em><b>Candidate Patient Registry Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCandidatePatientRegistryTypeValueP(CandidatePatientRegistryType candidatePatientRegistryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CANDIDATE_PATIENT_REGISTRY_TYPE);
			try {
				VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(candidatePatientRegistryType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CANDIDATE_PATIENT_REGISTRY_TYPE__CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("CandidatePatientRegistryTypeValueP"),
						 new Object [] { candidatePatientRegistryType }));
			}
			 
			return false;
		}
		return true;
	}

} // CandidatePatientRegistryTypeOperations