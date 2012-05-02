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
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Most Recent Time Arrived In USA Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MostRecentTimeArrivedInUSAObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MostRecentTimeArrivedInUSAObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMostRecentTimeArrivedInUSAObservationTemplateId(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationTemplateId(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateMostRecentTimeArrivedInUSAObservationTemplateId(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationTemplateId(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.6')
	 * @param mostRecentTimeArrivedInUSAObservation The receiving '<em><b>Most Recent Time Arrived In USA Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMostRecentTimeArrivedInUSAObservationTemplateId(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION);
			try {
				VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mostRecentTimeArrivedInUSAObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID,
						 PhcrPlugin.INSTANCE.getString("MostRecentTimeArrivedInUSAObservationTemplateId"),
						 new Object [] { mostRecentTimeArrivedInUSAObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMostRecentTimeArrivedInUSAObservationClassCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationClassCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMostRecentTimeArrivedInUSAObservationClassCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationClassCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param mostRecentTimeArrivedInUSAObservation The receiving '<em><b>Most Recent Time Arrived In USA Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMostRecentTimeArrivedInUSAObservationClassCode(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION);
			try {
				VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mostRecentTimeArrivedInUSAObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE,
						 PhcrPlugin.INSTANCE.getString("MostRecentTimeArrivedInUSAObservationClassCode"),
						 new Object [] { mostRecentTimeArrivedInUSAObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMostRecentTimeArrivedInUSAObservationMoodCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationMoodCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMostRecentTimeArrivedInUSAObservationMoodCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationMoodCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param mostRecentTimeArrivedInUSAObservation The receiving '<em><b>Most Recent Time Arrived In USA Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMostRecentTimeArrivedInUSAObservationMoodCode(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION);
			try {
				VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mostRecentTimeArrivedInUSAObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE,
						 PhcrPlugin.INSTANCE.getString("MostRecentTimeArrivedInUSAObservationMoodCode"),
						 new Object [] { mostRecentTimeArrivedInUSAObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param mostRecentTimeArrivedInUSAObservation The receiving '<em><b>Most Recent Time Arrived In USA Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMostRecentTimeArrivedInUSAObservationStatusCode(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION);
			try {
				VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mostRecentTimeArrivedInUSAObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE,
						 PhcrPlugin.INSTANCE.getString("MostRecentTimeArrivedInUSAObservationStatusCode"),
						 new Object [] { mostRecentTimeArrivedInUSAObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))
	 * @param mostRecentTimeArrivedInUSAObservation The receiving '<em><b>Most Recent Time Arrived In USA Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMostRecentTimeArrivedInUSAObservationValue(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION);
			try {
				VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mostRecentTimeArrivedInUSAObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE,
						 PhcrPlugin.INSTANCE.getString("MostRecentTimeArrivedInUSAObservationValue"),
						 new Object [] { mostRecentTimeArrivedInUSAObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMostRecentTimeArrivedInUSAObservationCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '55209-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMostRecentTimeArrivedInUSAObservationCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMostRecentTimeArrivedInUSAObservationStatusCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationStatusCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateMostRecentTimeArrivedInUSAObservationStatusCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationStatusCode(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMostRecentTimeArrivedInUSAObservationValue(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationValue(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMostRecentTimeArrivedInUSAObservationValue(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMostRecentTimeArrivedInUSAObservationValue(MostRecentTimeArrivedInUSAObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '55209-1' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param mostRecentTimeArrivedInUSAObservation The receiving '<em><b>Most Recent Time Arrived In USA Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMostRecentTimeArrivedInUSAObservationCode(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION);
			try {
				VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mostRecentTimeArrivedInUSAObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE,
						 PhcrPlugin.INSTANCE.getString("MostRecentTimeArrivedInUSAObservationCode"),
						 new Object [] { mostRecentTimeArrivedInUSAObservation }));
			}
			return false;
		}
		return true;
	}

} // MostRecentTimeArrivedInUSAObservationOperations