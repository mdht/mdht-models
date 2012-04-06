/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Measurement Range Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceMeasurementRangeObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceMeasurementRangeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceMeasurementRangeObservationTemplateId(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceMeasurementRangeObservationTemplateId(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceMeasurementRangeObservationTemplateId(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceMeasurementRangeObservationTemplateId(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.5')
	 * @param deviceMeasurementRangeObservation The receiving '<em><b>Device Measurement Range Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeviceMeasurementRangeObservationTemplateId(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.DEVICE_MEASUREMENT_RANGE_OBSERVATION);
			try {
				VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceMeasurementRangeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID,
						 PhmrPlugin.INSTANCE.getString("DeviceMeasurementRangeObservationTemplateId"),
						 new Object [] { deviceMeasurementRangeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceMeasurementRangeObservationClassCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceMeasurementRangeObservationClassCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceMeasurementRangeObservationClassCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceMeasurementRangeObservationClassCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param deviceMeasurementRangeObservation The receiving '<em><b>Device Measurement Range Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeviceMeasurementRangeObservationClassCode(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.DEVICE_MEASUREMENT_RANGE_OBSERVATION);
			try {
				VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceMeasurementRangeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE,
						 PhmrPlugin.INSTANCE.getString("DeviceMeasurementRangeObservationClassCode"),
						 new Object [] { deviceMeasurementRangeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceMeasurementRangeObservationCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceMeasurementRangeObservationCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = 'MDC_ATTR_NU_RANGE_MSMT' and value.codeSystem = '2.16.840.1.113883.6.24'))";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceMeasurementRangeObservationCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceMeasurementRangeObservationCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'MDC_ATTR_NU_RANGE_MSMT' and value.codeSystem = '2.16.840.1.113883.6.24'))
	 * @param deviceMeasurementRangeObservation The receiving '<em><b>Device Measurement Range Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeviceMeasurementRangeObservationCode(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.DEVICE_MEASUREMENT_RANGE_OBSERVATION);
			try {
				VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceMeasurementRangeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE,
						 PhmrPlugin.INSTANCE.getString("DeviceMeasurementRangeObservationCode"),
						 new Object [] { deviceMeasurementRangeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceMeasurementRangeObservationMoodCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceMeasurementRangeObservationMoodCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::DEF";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceMeasurementRangeObservationMoodCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceMeasurementRangeObservationMoodCode(DeviceMeasurementRangeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::DEF
	 * @param deviceMeasurementRangeObservation The receiving '<em><b>Device Measurement Range Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeviceMeasurementRangeObservationMoodCode(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.DEVICE_MEASUREMENT_RANGE_OBSERVATION);
			try {
				VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceMeasurementRangeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE,
						 PhmrPlugin.INSTANCE.getString("DeviceMeasurementRangeObservationMoodCode"),
						 new Object [] { deviceMeasurementRangeObservation }));
			}
			return false;
		}
		return true;
	}

} // DeviceMeasurementRangeObservationOperations