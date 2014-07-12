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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Site Of TB Disease Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisSiteOfTBDiseaseObservationOperations extends ClinicalStatementOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TuberculosisSiteOfTBDiseaseObservationOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationTemplateId(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationTemplateId(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.98')";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationTemplateId(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationTemplateId(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.98')
	 * @param tuberculosisSiteOfTBDiseaseObservation The receiving '<em><b>Site Of TB Disease Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisSiteOfTBDiseaseObservationTemplateId(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisSiteOfTBDiseaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisSiteOfTBDiseaseObservationTemplateId"),
						 new Object [] { tuberculosisSiteOfTBDiseaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationClassCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationClassCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationClassCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationClassCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param tuberculosisSiteOfTBDiseaseObservation The receiving '<em><b>Site Of TB Disease Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisSiteOfTBDiseaseObservationClassCode(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisSiteOfTBDiseaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisSiteOfTBDiseaseObservationClassCode"),
						 new Object [] { tuberculosisSiteOfTBDiseaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')
	 * @param tuberculosisSiteOfTBDiseaseObservation The receiving '<em><b>Site Of TB Disease Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisSiteOfTBDiseaseObservationCode(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisSiteOfTBDiseaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisSiteOfTBDiseaseObservationCode"),
						 new Object [] { tuberculosisSiteOfTBDiseaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param tuberculosisSiteOfTBDiseaseObservation The receiving '<em><b>Site Of TB Disease Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisSiteOfTBDiseaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisSiteOfTBDiseaseObservationEffectiveTime"),
						 new Object [] { tuberculosisSiteOfTBDiseaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationMoodCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationMoodCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationMoodCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationMoodCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param tuberculosisSiteOfTBDiseaseObservation The receiving '<em><b>Site Of TB Disease Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisSiteOfTBDiseaseObservationMoodCode(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisSiteOfTBDiseaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisSiteOfTBDiseaseObservationMoodCode"),
						 new Object [] { tuberculosisSiteOfTBDiseaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationStatusCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationStatusCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationStatusCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationStatusCode(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param tuberculosisSiteOfTBDiseaseObservation The receiving '<em><b>Site Of TB Disease Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisSiteOfTBDiseaseObservationStatusCode(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisSiteOfTBDiseaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisSiteOfTBDiseaseObservationStatusCode"),
						 new Object [] { tuberculosisSiteOfTBDiseaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationValue(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationValue(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisSiteOfTBDiseaseObservationValue(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisSiteOfTBDiseaseObservationValue(TuberculosisSiteOfTBDiseaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
	 * @param tuberculosisSiteOfTBDiseaseObservation The receiving '<em><b>Site Of TB Disease Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisSiteOfTBDiseaseObservationValue(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisSiteOfTBDiseaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisSiteOfTBDiseaseObservationValue"),
						 new Object [] { tuberculosisSiteOfTBDiseaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // TuberculosisSiteOfTBDiseaseObservationOperations