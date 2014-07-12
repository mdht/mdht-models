/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.hepb.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation#validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation#validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation#validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation#validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation#validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation#validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.26')";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.26')
	 * @param acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation The receiving '<em><b>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, context) }),
						 new Object [] { acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '55218-2' or value.code = '55214-1' or value.code = '55213-3' or value.code = '55216-6' or value.code = '55217-4' or value.code = '55215-8'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '55218-2' or value.code = '55214-1' or value.code = '55213-3' or value.code = '55216-6' or value.code = '55217-4' or value.code = '55215-8'))
	 * @param acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation The receiving '<em><b>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, context) }),
						 new Object [] { acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation The receiving '<em><b>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, context) }),
						 new Object [] { acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation The receiving '<em><b>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, context) }),
						 new Object [] { acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation The receiving '<em><b>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, context) }),
						 new Object [] { acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('moodCode')
	 * @param acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation The receiving '<em><b>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, context) }),
						 new Object [] { acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations