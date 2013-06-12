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
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury Mechanism</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism#validateInjuryMechanismTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism#validateInjuryMechanismCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism#validateInjuryMechanismValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism#validateInjuryMechanismMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InjuryMechanismOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjuryMechanismOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryMechanismTemplateId(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMechanismTemplateId(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_MECHANISM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.51')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryMechanismTemplateId(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMechanismTemplateId(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_MECHANISM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryMechanism The receiving '<em><b>Injury Mechanism</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryMechanismTemplateId(InjuryMechanism injuryMechanism, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_MECHANISM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_MECHANISM);
			try {
				VALIDATE_INJURY_MECHANISM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_MECHANISM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_MECHANISM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryMechanism)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_MECHANISM__INJURY_MECHANISM_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("InjuryMechanismTemplateId"),
						 new Object [] { injuryMechanism }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryMechanismCode(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMechanismCode(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_MECHANISM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67494-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryMechanismCode(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMechanismCode(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_MECHANISM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryMechanism The receiving '<em><b>Injury Mechanism</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryMechanismCode(InjuryMechanism injuryMechanism, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_MECHANISM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_MECHANISM);
			try {
				VALIDATE_INJURY_MECHANISM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_MECHANISM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_MECHANISM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryMechanism)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_MECHANISM__INJURY_MECHANISM_CODE,
						 EmspcrPlugin.INSTANCE.getString("InjuryMechanismCode"),
						 new Object [] { injuryMechanism }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryMechanismValue(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMechanismValue(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_MECHANISM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17335-3' or value.code = 'LA17336-1' or value.code = 'LA46-8' or value.code = 'LA7318-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryMechanismValue(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMechanismValue(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_MECHANISM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryMechanism The receiving '<em><b>Injury Mechanism</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryMechanismValue(InjuryMechanism injuryMechanism, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_MECHANISM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_MECHANISM);
			try {
				VALIDATE_INJURY_MECHANISM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_MECHANISM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_MECHANISM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryMechanism)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_MECHANISM__INJURY_MECHANISM_VALUE,
						 EmspcrPlugin.INSTANCE.getString("InjuryMechanismValue"),
						 new Object [] { injuryMechanism }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryMechanismMoodCode(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMechanismMoodCode(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_MECHANISM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryMechanismMoodCode(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMechanismMoodCode(InjuryMechanism, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_MECHANISM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryMechanism The receiving '<em><b>Injury Mechanism</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryMechanismMoodCode(InjuryMechanism injuryMechanism, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_MECHANISM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_MECHANISM);
			try {
				VALIDATE_INJURY_MECHANISM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_MECHANISM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_MECHANISM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryMechanism)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_MECHANISM__INJURY_MECHANISM_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("InjuryMechanismMoodCode"),
						 new Object [] { injuryMechanism }));
			}
			 
			return false;
		}
		return true;
	}

} // InjuryMechanismOperations