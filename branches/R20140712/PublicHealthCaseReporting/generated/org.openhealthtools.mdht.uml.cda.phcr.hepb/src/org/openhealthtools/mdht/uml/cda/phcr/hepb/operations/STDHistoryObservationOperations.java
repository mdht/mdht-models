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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>STD History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationProblemStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#gethepbProblemStatus() <em>Gethepb Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class STDHistoryObservationOperations extends ProblemObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STDHistoryObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSTDHistoryObservationClassCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationClassCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STD_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateSTDHistoryObservationClassCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationClassCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STD_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSTDHistoryObservationClassCode(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STD_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION);
			try {
				VALIDATE_STD_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STD_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STD_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(stdHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_CLASS_CODE,
						 HepbPlugin.INSTANCE.getString("STDHistoryObservationClassCode"),
						 new Object [] { stdHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSTDHistoryObservationCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_STD_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.6')";

  /**
	 * The cached OCL invariant for the '{@link #validateSTDHistoryObservationCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_STD_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.6')
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateSTDHistoryObservationCode(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_STD_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION);
			try {
				VALIDATE_STD_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STD_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STD_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(stdHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_CODE,
						 HepbPlugin.INSTANCE.getString("STDHistoryObservationCode"),
						 new Object [] { stdHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateSTDHistoryObservationEffectiveTime(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationEffectiveTime(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STD_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSTDHistoryObservationEffectiveTime(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationEffectiveTime(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STD_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSTDHistoryObservationEffectiveTime(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STD_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION);
			try {
				VALIDATE_STD_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STD_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STD_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(stdHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_EFFECTIVE_TIME,
						 HepbPlugin.INSTANCE.getString("STDHistoryObservationEffectiveTime"),
						 new Object [] { stdHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSTDHistoryObservationId(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationId(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STD_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSTDHistoryObservationId(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationId(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STD_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSTDHistoryObservationId(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STD_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION);
			try {
				VALIDATE_STD_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STD_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STD_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(stdHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_ID,
						 HepbPlugin.INSTANCE.getString("STDHistoryObservationId"),
						 new Object [] { stdHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSTDHistoryObservationMoodCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationMoodCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STD_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSTDHistoryObservationMoodCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationMoodCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STD_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSTDHistoryObservationMoodCode(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STD_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION);
			try {
				VALIDATE_STD_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STD_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STD_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(stdHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_MOOD_CODE,
						 HepbPlugin.INSTANCE.getString("STDHistoryObservationMoodCode"),
						 new Object [] { stdHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSTDHistoryObservationStatusCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationStatusCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_STD_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

  /**
	 * The cached OCL invariant for the '{@link #validateSTDHistoryObservationStatusCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationStatusCode(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_STD_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateSTDHistoryObservationStatusCode(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_STD_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION);
			try {
				VALIDATE_STD_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STD_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STD_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(stdHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_STATUS_CODE,
						 HepbPlugin.INSTANCE.getString("STDHistoryObservationStatusCode"),
						 new Object [] { stdHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateSTDHistoryObservationProblemStatus(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Problem Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationProblemStatus(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STD_HISTORY_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSTDHistoryObservationProblemStatus(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Problem Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSTDHistoryObservationProblemStatus(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STD_HISTORY_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSTDHistoryObservationProblemStatus(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STD_HISTORY_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION);
			try {
				VALIDATE_STD_HISTORY_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STD_HISTORY_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STD_HISTORY_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(stdHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_PROBLEM_STATUS,
						 HepbPlugin.INSTANCE.getString("STDHistoryObservationProblemStatus"),
						 new Object [] { stdHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #gethepbProblemStatus(STDHistoryObservation) <em>Gethepb Problem Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #gethepbProblemStatus(STDHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GETHEPB_PROBLEM_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemStatusObservation))->asSequence()->any(true).oclAsType(ccd::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #gethepbProblemStatus(STDHistoryObservation) <em>Gethepb Problem Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #gethepbProblemStatus(STDHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETHEPB_PROBLEM_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemStatusObservation))->asSequence()->any(true).oclAsType(ccd::ProblemStatusObservation)
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ProblemStatusObservation gethepbProblemStatus(STDHistoryObservation stdHistoryObservation) {
		if (GETHEPB_PROBLEM_STATUS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION, HepbPackage.Literals.STD_HISTORY_OBSERVATION.getEAllOperations().get(70));
			try {
				GETHEPB_PROBLEM_STATUS__EOCL_QRY = helper.createQuery(GETHEPB_PROBLEM_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETHEPB_PROBLEM_STATUS__EOCL_QRY);
		return (ProblemStatusObservation) query.evaluate(stdHistoryObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.33')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(STDHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.33')
	 * @param stdHistoryObservation The receiving '<em><b>STD History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProblemObservationTemplateId(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.STD_HISTORY_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(stdHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.STD_HISTORY_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stdHistoryObservation, context) }),
						 new Object [] { stdHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // STDHistoryObservationOperations