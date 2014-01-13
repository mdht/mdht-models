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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Location In Vehicle</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientLocationInVehicleOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientLocationInVehicleOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.55')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle patientLocationInVehicle, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehicleTemplateId"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle patientLocationInVehicle, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehicleMoodCode"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67498-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientLocationInVehicleCode(PatientLocationInVehicle patientLocationInVehicle, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_CODE,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehicleCode"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleValue(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleValue(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17361-9' or value.code = 'LA17362-7' or value.code = 'LA17363-5' or value.code = 'LA17364-3' or value.code = 'LA17365-0' or value.code = 'LA17366-8' or value.code = 'LA17367-6' or value.code = 'LA17368-4' or value.code = 'LA17369-2' or value.code = 'LA17370-0' or value.code = 'LA17371-8' or value.code = 'LA17372-6' or value.code = 'LA17373-4' or value.code = 'LA17374-2' or value.code = 'LA4489-6')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleValue(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleValue(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientLocationInVehicleValue(PatientLocationInVehicle patientLocationInVehicle, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehicleValue"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

} // PatientLocationInVehicleOperations