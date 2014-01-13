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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Systolic Blood Pressure Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Diastolic Blood Pressure Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerHeartRateComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Heart Rate Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Respiratory Rate Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Body Temperature Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Oxygen Saturation Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateEMSPCRVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#getPriorAidVitals() <em>Get Prior Aid Vitals</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizerOperations extends org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Systolic Blood Pressure Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Systolic Blood Pressure Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VITAL_SIGNS_ORGANIZER__EMSPCR_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT,
						 EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsOrganizerSystolicBloodPressureComponent"),
						 new Object [] { vitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Diastolic Blood Pressure Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_DIASTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Diastolic Blood Pressure Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_DIASTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_DIASTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_DIASTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_DIASTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_DIASTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VITAL_SIGNS_ORGANIZER__EMSPCR_VITAL_SIGNS_ORGANIZER_DIASTOLIC_BLOOD_PRESSURE_COMPONENT,
						 EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent"),
						 new Object [] { vitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsOrganizerHeartRateComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Heart Rate Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerHeartRateComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_HEART_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsOrganizerHeartRateComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Heart Rate Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerHeartRateComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_HEART_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPCRVitalSignsOrganizerHeartRateComponent(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_HEART_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_HEART_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_HEART_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_HEART_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VITAL_SIGNS_ORGANIZER__EMSPCR_VITAL_SIGNS_ORGANIZER_HEART_RATE_COMPONENT,
						 EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsOrganizerHeartRateComponent"),
						 new Object [] { vitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Respiratory Rate Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Respiratory Rate Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VITAL_SIGNS_ORGANIZER__EMSPCR_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT,
						 EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsOrganizerRespiratoryRateComponent"),
						 new Object [] { vitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Body Temperature Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Body Temperature Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VITAL_SIGNS_ORGANIZER__EMSPCR_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT,
						 EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsOrganizerBodyTemperatureComponent"),
						 new Object [] { vitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Oxygen Saturation Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Oxygen Saturation Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VITAL_SIGNS_ORGANIZER__EMSPCR_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT,
						 EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsOrganizerOxygenSaturationComponent"),
						 new Object [] { vitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPCRVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VITAL_SIGNS_ORGANIZER__EMSPCR_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsOrganizerEffectiveTime"),
						 new Object [] { vitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorAidVitals(VitalSignsOrganizer) <em>Get Prior Aid Vitals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAidVitals(VitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIOR_AID_VITALS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PriorAidVitals))->asSequence()->any(true).oclAsType(emspcr::PriorAidVitals)";

	/**
	 * The cached OCL query for the '{@link #getPriorAidVitals(VitalSignsOrganizer) <em>Get Prior Aid Vitals</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAidVitals(VitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIOR_AID_VITALS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PriorAidVitals getPriorAidVitals(VitalSignsOrganizer vitalSignsOrganizer) {
		if (GET_PRIOR_AID_VITALS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER, EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER.getEAllOperations().get(68));
			try {
				GET_PRIOR_AID_VITALS__EOCL_QRY = helper.createQuery(GET_PRIOR_AID_VITALS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIOR_AID_VITALS__EOCL_QRY);
		return (PriorAidVitals) query.evaluate(vitalSignsOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.28')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVitalSignsOrganizerTemplateId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("VitalSignsOrganizerTemplateId"),
						 new Object [] { vitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // VitalSignsOrganizerOperations