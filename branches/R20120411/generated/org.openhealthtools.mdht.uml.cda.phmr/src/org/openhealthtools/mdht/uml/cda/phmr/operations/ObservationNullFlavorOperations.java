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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformObservation;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Observation Null Flavor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorWaveformObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Waveform Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorWaveformSamplePeriodObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Waveform Sample Period Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#getWaveformObservation() <em>Get Waveform Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#getWaveformSamplePeriodObservation() <em>Get Waveform Sample Period Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationNullFlavorOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationNullFlavorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationNullFlavorTemplateId(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorTemplateId(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_NULL_FLAVOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'null')";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationNullFlavorTemplateId(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorTemplateId(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBSERVATION_NULL_FLAVOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = 'null')
	 * @param observationNullFlavor The receiving '<em><b>Observation Null Flavor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationNullFlavorTemplateId(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBSERVATION_NULL_FLAVOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR);
			try {
				VALIDATE_OBSERVATION_NULL_FLAVOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSERVATION_NULL_FLAVOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBSERVATION_NULL_FLAVOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(observationNullFlavor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_TEMPLATE_ID,
						 PhmrPlugin.INSTANCE.getString("ObservationNullFlavorTemplateId"),
						 new Object [] { observationNullFlavor }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationNullFlavorClassCode(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorClassCode(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_NULL_FLAVOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBSCOR";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationNullFlavorClassCode(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorClassCode(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBSERVATION_NULL_FLAVOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBSCOR
	 * @param observationNullFlavor The receiving '<em><b>Observation Null Flavor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationNullFlavorClassCode(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBSERVATION_NULL_FLAVOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR);
			try {
				VALIDATE_OBSERVATION_NULL_FLAVOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSERVATION_NULL_FLAVOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBSERVATION_NULL_FLAVOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(observationNullFlavor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_CLASS_CODE,
						 PhmrPlugin.INSTANCE.getString("ObservationNullFlavorClassCode"),
						 new Object [] { observationNullFlavor }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationNullFlavorMoodCode(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorMoodCode(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_NULL_FLAVOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationNullFlavorMoodCode(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorMoodCode(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBSERVATION_NULL_FLAVOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('moodCode') and self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param observationNullFlavor The receiving '<em><b>Observation Null Flavor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationNullFlavorMoodCode(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBSERVATION_NULL_FLAVOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR);
			try {
				VALIDATE_OBSERVATION_NULL_FLAVOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSERVATION_NULL_FLAVOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBSERVATION_NULL_FLAVOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(observationNullFlavor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_MOOD_CODE,
						 PhmrPlugin.INSTANCE.getString("ObservationNullFlavorMoodCode"),
						 new Object [] { observationNullFlavor }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationNullFlavorWaveformObservation(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Waveform Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorWaveformObservation(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(phmr::WaveformObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationNullFlavorWaveformObservation(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Waveform Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorWaveformObservation(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(phmr::WaveformObservation))
	 * @param observationNullFlavor The receiving '<em><b>Observation Null Flavor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationNullFlavorWaveformObservation(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR);
			try {
				VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(observationNullFlavor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION,
						 PhmrPlugin.INSTANCE.getString("ObservationNullFlavorWaveformObservation"),
						 new Object [] { observationNullFlavor }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationNullFlavorWaveformSamplePeriodObservation(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Waveform Sample Period Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorWaveformSamplePeriodObservation(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(phmr::WaveformSamplePeriodObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationNullFlavorWaveformSamplePeriodObservation(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Waveform Sample Period Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationNullFlavorWaveformSamplePeriodObservation(ObservationNullFlavor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(phmr::WaveformSamplePeriodObservation))
	 * @param observationNullFlavor The receiving '<em><b>Observation Null Flavor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationNullFlavorWaveformSamplePeriodObservation(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR);
			try {
				VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(observationNullFlavor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION,
						 PhmrPlugin.INSTANCE.getString("ObservationNullFlavorWaveformSamplePeriodObservation"),
						 new Object [] { observationNullFlavor }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getWaveformObservation(ObservationNullFlavor) <em>Get Waveform Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaveformObservation(ObservationNullFlavor)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_WAVEFORM_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::WaveformObservation))->asSequence()->first().oclAsType(phmr::WaveformObservation)";

	/**
	 * The cached OCL query for the '{@link #getWaveformObservation(ObservationNullFlavor) <em>Get Waveform Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaveformObservation(ObservationNullFlavor)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_WAVEFORM_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::WaveformObservation))->asSequence()->first().oclAsType(phmr::WaveformObservation)
	 * @param observationNullFlavor The receiving '<em><b>Observation Null Flavor</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  WaveformObservation getWaveformObservation(ObservationNullFlavor observationNullFlavor) {
		if (GET_WAVEFORM_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR, PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR.getEAllOperations().get(54));
			try {
				GET_WAVEFORM_OBSERVATION__EOCL_QRY = helper.createQuery(GET_WAVEFORM_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_WAVEFORM_OBSERVATION__EOCL_QRY);
		return (WaveformObservation) query.evaluate(observationNullFlavor);
	}

	/**
	 * The cached OCL expression body for the '{@link #getWaveformSamplePeriodObservation(ObservationNullFlavor) <em>Get Waveform Sample Period Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaveformSamplePeriodObservation(ObservationNullFlavor)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::WaveformSamplePeriodObservation))->asSequence()->first().oclAsType(phmr::WaveformSamplePeriodObservation)";

	/**
	 * The cached OCL query for the '{@link #getWaveformSamplePeriodObservation(ObservationNullFlavor) <em>Get Waveform Sample Period Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaveformSamplePeriodObservation(ObservationNullFlavor)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::WaveformSamplePeriodObservation))->asSequence()->first().oclAsType(phmr::WaveformSamplePeriodObservation)
	 * @param observationNullFlavor The receiving '<em><b>Observation Null Flavor</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  WaveformSamplePeriodObservation getWaveformSamplePeriodObservation(ObservationNullFlavor observationNullFlavor) {
		if (GET_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR, PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR.getEAllOperations().get(55));
			try {
				GET_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__EOCL_QRY = helper.createQuery(GET_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__EOCL_QRY);
		return (WaveformSamplePeriodObservation) query.evaluate(observationNullFlavor);
	}

} // ObservationNullFlavorOperations