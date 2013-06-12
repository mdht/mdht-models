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
import org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Initial Patient Acuity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitialPatientAcuityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialPatientAcuityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInitialPatientAcuityTemplateId(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityTemplateId(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INITIAL_PATIENT_ACUITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.69')";

	/**
	 * The cached OCL invariant for the '{@link #validateInitialPatientAcuityTemplateId(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityTemplateId(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INITIAL_PATIENT_ACUITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param initialPatientAcuity The receiving '<em><b>Initial Patient Acuity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInitialPatientAcuityTemplateId(InitialPatientAcuity initialPatientAcuity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INITIAL_PATIENT_ACUITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INITIAL_PATIENT_ACUITY);
			try {
				VALIDATE_INITIAL_PATIENT_ACUITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INITIAL_PATIENT_ACUITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INITIAL_PATIENT_ACUITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(initialPatientAcuity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INITIAL_PATIENT_ACUITY__INITIAL_PATIENT_ACUITY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("InitialPatientAcuityTemplateId"),
						 new Object [] { initialPatientAcuity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInitialPatientAcuityCodeP(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityCodeP(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INITIAL_PATIENT_ACUITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInitialPatientAcuityCodeP(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityCodeP(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INITIAL_PATIENT_ACUITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param initialPatientAcuity The receiving '<em><b>Initial Patient Acuity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInitialPatientAcuityCodeP(InitialPatientAcuity initialPatientAcuity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INITIAL_PATIENT_ACUITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INITIAL_PATIENT_ACUITY);
			try {
				VALIDATE_INITIAL_PATIENT_ACUITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INITIAL_PATIENT_ACUITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INITIAL_PATIENT_ACUITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(initialPatientAcuity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INITIAL_PATIENT_ACUITY__INITIAL_PATIENT_ACUITY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("InitialPatientAcuityCodeP"),
						 new Object [] { initialPatientAcuity }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuityCodeP", passToken);
				}
				passToken.add(initialPatientAcuity);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInitialPatientAcuityCode(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityCode(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INITIAL_PATIENT_ACUITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67493-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInitialPatientAcuityCode(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityCode(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INITIAL_PATIENT_ACUITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param initialPatientAcuity The receiving '<em><b>Initial Patient Acuity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInitialPatientAcuityCode(InitialPatientAcuity initialPatientAcuity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(initialPatientAcuity)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_INITIAL_PATIENT_ACUITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INITIAL_PATIENT_ACUITY);
			try {
				VALIDATE_INITIAL_PATIENT_ACUITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INITIAL_PATIENT_ACUITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INITIAL_PATIENT_ACUITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(initialPatientAcuity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INITIAL_PATIENT_ACUITY__INITIAL_PATIENT_ACUITY_CODE,
						 EmspcrPlugin.INSTANCE.getString("InitialPatientAcuityCode"),
						 new Object [] { initialPatientAcuity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInitialPatientAcuityValue(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityValue(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INITIAL_PATIENT_ACUITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17694-3' or value.code = 'LA17695-0' or value.code = 'LA17696-8' or value.code = 'LA17697-6')))";

	/**
	 * The cached OCL invariant for the '{@link #validateInitialPatientAcuityValue(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityValue(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INITIAL_PATIENT_ACUITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param initialPatientAcuity The receiving '<em><b>Initial Patient Acuity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInitialPatientAcuityValue(InitialPatientAcuity initialPatientAcuity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INITIAL_PATIENT_ACUITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INITIAL_PATIENT_ACUITY);
			try {
				VALIDATE_INITIAL_PATIENT_ACUITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INITIAL_PATIENT_ACUITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INITIAL_PATIENT_ACUITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(initialPatientAcuity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INITIAL_PATIENT_ACUITY__INITIAL_PATIENT_ACUITY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("InitialPatientAcuityValue"),
						 new Object [] { initialPatientAcuity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInitialPatientAcuityValueP(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityValueP(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INITIAL_PATIENT_ACUITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInitialPatientAcuityValueP(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityValueP(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INITIAL_PATIENT_ACUITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param initialPatientAcuity The receiving '<em><b>Initial Patient Acuity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInitialPatientAcuityValueP(InitialPatientAcuity initialPatientAcuity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INITIAL_PATIENT_ACUITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INITIAL_PATIENT_ACUITY);
			try {
				VALIDATE_INITIAL_PATIENT_ACUITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INITIAL_PATIENT_ACUITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INITIAL_PATIENT_ACUITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(initialPatientAcuity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INITIAL_PATIENT_ACUITY__INITIAL_PATIENT_ACUITY_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("InitialPatientAcuityValueP"),
						 new Object [] { initialPatientAcuity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInitialPatientAcuityMoodCode(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityMoodCode(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INITIAL_PATIENT_ACUITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateInitialPatientAcuityMoodCode(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInitialPatientAcuityMoodCode(InitialPatientAcuity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INITIAL_PATIENT_ACUITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param initialPatientAcuity The receiving '<em><b>Initial Patient Acuity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInitialPatientAcuityMoodCode(InitialPatientAcuity initialPatientAcuity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INITIAL_PATIENT_ACUITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INITIAL_PATIENT_ACUITY);
			try {
				VALIDATE_INITIAL_PATIENT_ACUITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INITIAL_PATIENT_ACUITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INITIAL_PATIENT_ACUITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(initialPatientAcuity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INITIAL_PATIENT_ACUITY__INITIAL_PATIENT_ACUITY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("InitialPatientAcuityMoodCode"),
						 new Object [] { initialPatientAcuity }));
			}
			 
			return false;
		}
		return true;
	}

} // InitialPatientAcuityOperations