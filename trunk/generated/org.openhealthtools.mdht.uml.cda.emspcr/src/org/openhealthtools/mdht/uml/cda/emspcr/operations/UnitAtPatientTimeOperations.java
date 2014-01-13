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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit At Patient Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitAtPatientTimeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitAtPatientTimeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitAtPatientTimeTemplateId(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeTemplateId(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_AT_PATIENT_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.42')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitAtPatientTimeTemplateId(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeTemplateId(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_AT_PATIENT_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitAtPatientTime The receiving '<em><b>Unit At Patient Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitAtPatientTimeTemplateId(UnitAtPatientTime unitAtPatientTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_AT_PATIENT_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_AT_PATIENT_TIME);
			try {
				VALIDATE_UNIT_AT_PATIENT_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_AT_PATIENT_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_AT_PATIENT_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitAtPatientTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_AT_PATIENT_TIME__UNIT_AT_PATIENT_TIME_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("UnitAtPatientTimeTemplateId"),
						 new Object [] { unitAtPatientTime }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitAtPatientTimeMoodCode(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeMoodCode(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_AT_PATIENT_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitAtPatientTimeMoodCode(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeMoodCode(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_AT_PATIENT_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitAtPatientTime The receiving '<em><b>Unit At Patient Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitAtPatientTimeMoodCode(UnitAtPatientTime unitAtPatientTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_AT_PATIENT_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_AT_PATIENT_TIME);
			try {
				VALIDATE_UNIT_AT_PATIENT_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_AT_PATIENT_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_AT_PATIENT_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitAtPatientTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_AT_PATIENT_TIME__UNIT_AT_PATIENT_TIME_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("UnitAtPatientTimeMoodCode"),
						 new Object [] { unitAtPatientTime }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitAtPatientTimeCodeP(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeCodeP(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_AT_PATIENT_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitAtPatientTimeCodeP(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeCodeP(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_AT_PATIENT_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitAtPatientTime The receiving '<em><b>Unit At Patient Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitAtPatientTimeCodeP(UnitAtPatientTime unitAtPatientTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_AT_PATIENT_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_AT_PATIENT_TIME);
			try {
				VALIDATE_UNIT_AT_PATIENT_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_AT_PATIENT_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_AT_PATIENT_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitAtPatientTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_AT_PATIENT_TIME__UNIT_AT_PATIENT_TIME_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("UnitAtPatientTimeCodeP"),
						 new Object [] { unitAtPatientTime }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitAtPatientTimeCode(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeCode(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_AT_PATIENT_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69474-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitAtPatientTimeCode(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeCode(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_AT_PATIENT_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitAtPatientTime The receiving '<em><b>Unit At Patient Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitAtPatientTimeCode(UnitAtPatientTime unitAtPatientTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_AT_PATIENT_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_AT_PATIENT_TIME);
			try {
				VALIDATE_UNIT_AT_PATIENT_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_AT_PATIENT_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_AT_PATIENT_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitAtPatientTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_AT_PATIENT_TIME__UNIT_AT_PATIENT_TIME_CODE,
						 EmspcrPlugin.INSTANCE.getString("UnitAtPatientTimeCode"),
						 new Object [] { unitAtPatientTime }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitAtPatientTimeValue(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeValue(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_AT_PATIENT_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitAtPatientTimeValue(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitAtPatientTimeValue(UnitAtPatientTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_AT_PATIENT_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitAtPatientTime The receiving '<em><b>Unit At Patient Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitAtPatientTimeValue(UnitAtPatientTime unitAtPatientTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_AT_PATIENT_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_AT_PATIENT_TIME);
			try {
				VALIDATE_UNIT_AT_PATIENT_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_AT_PATIENT_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_AT_PATIENT_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitAtPatientTime)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_AT_PATIENT_TIME__UNIT_AT_PATIENT_TIME_VALUE,
						 EmspcrPlugin.INSTANCE.getString("UnitAtPatientTimeValue"),
						 new Object [] { unitAtPatientTime }));
			}
			 
			return false;
		}
		return true;
	}

} // UnitAtPatientTimeOperations