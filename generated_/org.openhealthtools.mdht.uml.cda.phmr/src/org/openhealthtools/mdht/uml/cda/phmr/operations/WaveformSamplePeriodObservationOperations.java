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

import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Waveform Sample Period Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaveformSamplePeriodObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaveformSamplePeriodObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSamplePeriodObservationTemplateId(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationTemplateId(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSamplePeriodObservationTemplateId(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationTemplateId(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.13')
	 * @param waveformSamplePeriodObservation The receiving '<em><b>Waveform Sample Period Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSamplePeriodObservationTemplateId(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SAMPLE_PERIOD_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(waveformSamplePeriodObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID,
						 PhmrPlugin.INSTANCE.getString("WaveformSamplePeriodObservationTemplateId"),
						 new Object [] { waveformSamplePeriodObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSamplePeriodObservationClassCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationClassCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSamplePeriodObservationClassCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationClassCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param waveformSamplePeriodObservation The receiving '<em><b>Waveform Sample Period Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSamplePeriodObservationClassCode(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SAMPLE_PERIOD_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(waveformSamplePeriodObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE,
						 PhmrPlugin.INSTANCE.getString("WaveformSamplePeriodObservationClassCode"),
						 new Object [] { waveformSamplePeriodObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSamplePeriodObservationCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = 'TIME_ABSOLUTE' and value.codeSystem = '2.16.840.1.113883.5.4'))";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSamplePeriodObservationCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'TIME_ABSOLUTE' and value.codeSystem = '2.16.840.1.113883.5.4'))
	 * @param waveformSamplePeriodObservation The receiving '<em><b>Waveform Sample Period Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSamplePeriodObservationCode(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SAMPLE_PERIOD_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(waveformSamplePeriodObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE,
						 PhmrPlugin.INSTANCE.getString("WaveformSamplePeriodObservationCode"),
						 new Object [] { waveformSamplePeriodObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSamplePeriodObservationMoodCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationMoodCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSamplePeriodObservationMoodCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationMoodCode(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param waveformSamplePeriodObservation The receiving '<em><b>Waveform Sample Period Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSamplePeriodObservationMoodCode(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SAMPLE_PERIOD_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(waveformSamplePeriodObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE,
						 PhmrPlugin.INSTANCE.getString("WaveformSamplePeriodObservationMoodCode"),
						 new Object [] { waveformSamplePeriodObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSamplePeriodObservationValue(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationValue(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSamplePeriodObservationValue(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSamplePeriodObservationValue(WaveformSamplePeriodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)
	 * @param waveformSamplePeriodObservation The receiving '<em><b>Waveform Sample Period Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSamplePeriodObservationValue(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SAMPLE_PERIOD_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(waveformSamplePeriodObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE,
						 PhmrPlugin.INSTANCE.getString("WaveformSamplePeriodObservationValue"),
						 new Object [] { waveformSamplePeriodObservation }));
			}
			return false;
		}
		return true;
	}

} // WaveformSamplePeriodObservationOperations