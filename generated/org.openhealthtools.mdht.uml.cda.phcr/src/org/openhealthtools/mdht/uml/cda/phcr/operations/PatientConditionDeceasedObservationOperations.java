/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Condition Deceased Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientConditionDeceasedObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientConditionDeceasedObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionDeceasedObservationTemplateId(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationTemplateId(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.17')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionDeceasedObservationTemplateId(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationTemplateId(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.17')
	 * @param patientConditionDeceasedObservation The receiving '<em><b>Patient Condition Deceased Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientConditionDeceasedObservationTemplateId(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_DECEASED_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionDeceasedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID,
						 PhcrPlugin.INSTANCE.getString("PatientConditionDeceasedObservationTemplateId"),
						 new Object [] { patientConditionDeceasedObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionDeceasedObservationClassCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationClassCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionDeceasedObservationClassCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationClassCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param patientConditionDeceasedObservation The receiving '<em><b>Patient Condition Deceased Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientConditionDeceasedObservationClassCode(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_DECEASED_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionDeceasedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE,
						 PhcrPlugin.INSTANCE.getString("PatientConditionDeceasedObservationClassCode"),
						 new Object [] { patientConditionDeceasedObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))
	 * @param patientConditionDeceasedObservation The receiving '<em><b>Patient Condition Deceased Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientConditionDeceasedObservationCode(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_DECEASED_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionDeceasedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_CODE,
						 PhcrPlugin.INSTANCE.getString("PatientConditionDeceasedObservationCode"),
						 new Object [] { patientConditionDeceasedObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionDeceasedObservationMoodCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationMoodCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionDeceasedObservationMoodCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationMoodCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionDeceasedObservationCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionDeceasedObservationCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param patientConditionDeceasedObservation The receiving '<em><b>Patient Condition Deceased Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientConditionDeceasedObservationMoodCode(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_DECEASED_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionDeceasedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE,
						 PhcrPlugin.INSTANCE.getString("PatientConditionDeceasedObservationMoodCode"),
						 new Object [] { patientConditionDeceasedObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionDeceasedObservationStatusCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationStatusCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionDeceasedObservationStatusCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationStatusCode(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param patientConditionDeceasedObservation The receiving '<em><b>Patient Condition Deceased Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientConditionDeceasedObservationStatusCode(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_DECEASED_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionDeceasedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE,
						 PhcrPlugin.INSTANCE.getString("PatientConditionDeceasedObservationStatusCode"),
						 new Object [] { patientConditionDeceasedObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.code = '419099009' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param patientConditionDeceasedObservation The receiving '<em><b>Patient Condition Deceased Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientConditionDeceasedObservationValue(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_DECEASED_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionDeceasedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE,
						 PhcrPlugin.INSTANCE.getString("PatientConditionDeceasedObservationValue"),
						 new Object [] { patientConditionDeceasedObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionDeceasedObservationEffectiveTime(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationEffectiveTime(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionDeceasedObservationEffectiveTime(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationEffectiveTime(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionDeceasedObservationValue(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationValue(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.code = '419099009' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionDeceasedObservationValue(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionDeceasedObservationValue(PatientConditionDeceasedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param patientConditionDeceasedObservation The receiving '<em><b>Patient Condition Deceased Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientConditionDeceasedObservationEffectiveTime(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_DECEASED_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionDeceasedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME,
						 PhcrPlugin.INSTANCE.getString("PatientConditionDeceasedObservationEffectiveTime"),
						 new Object [] { patientConditionDeceasedObservation }));
			}
			return false;
		}
		return true;
	}

} // PatientConditionDeceasedObservationOperations