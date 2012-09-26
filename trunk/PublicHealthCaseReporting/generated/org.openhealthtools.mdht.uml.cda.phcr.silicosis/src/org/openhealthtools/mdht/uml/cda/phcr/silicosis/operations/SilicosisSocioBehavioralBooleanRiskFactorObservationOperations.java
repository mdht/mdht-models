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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ccd.operations.SocialHistoryObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilicosisSocioBehavioralBooleanRiskFactorObservationOperations extends SocialHistoryObservationOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SilicosisSocioBehavioralBooleanRiskFactorObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param silicosisSocioBehavioralBooleanRiskFactorObservation The receiving '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);
      try
      {
        VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisSocioBehavioralBooleanRiskFactorObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisSocioBehavioralBooleanRiskFactorObservation, context) }),
             new Object [] { silicosisSocioBehavioralBooleanRiskFactorObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')
   * @param silicosisSocioBehavioralBooleanRiskFactorObservation The receiving '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);
      try
      {
        VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisSocioBehavioralBooleanRiskFactorObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisSocioBehavioralBooleanRiskFactorObservation, context) }),
             new Object [] { silicosisSocioBehavioralBooleanRiskFactorObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Negation Ind</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Negation Ind</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.negationInd.oclIsUndefined()
   * @param silicosisSocioBehavioralBooleanRiskFactorObservation The receiving '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);
      try
      {
        VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisSocioBehavioralBooleanRiskFactorObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisSocioBehavioralBooleanRiskFactorObservation, context) }),
             new Object [] { silicosisSocioBehavioralBooleanRiskFactorObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param silicosisSocioBehavioralBooleanRiskFactorObservation The receiving '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);
      try
      {
        VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisSocioBehavioralBooleanRiskFactorObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisSocioBehavioralBooleanRiskFactorObservation, context) }),
             new Object [] { silicosisSocioBehavioralBooleanRiskFactorObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.code = '102445001' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
   * value.code = '102445001' and value.codeSystem = '2.16.840.1.113883.6.96'))
   * @param silicosisSocioBehavioralBooleanRiskFactorObservation The receiving '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);
      try
      {
        VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisSocioBehavioralBooleanRiskFactorObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisSocioBehavioralBooleanRiskFactorObservation, context) }),
             new Object [] { silicosisSocioBehavioralBooleanRiskFactorObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistoryObservationTemplateId(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistoryObservationTemplateId(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.110')";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistoryObservationTemplateId(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistoryObservationTemplateId(SilicosisSocioBehavioralBooleanRiskFactorObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.110')
   * @param silicosisSocioBehavioralBooleanRiskFactorObservation The receiving '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSocialHistoryObservationTemplateId(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisSocioBehavioralBooleanRiskFactorObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSocialHistoryObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisSocioBehavioralBooleanRiskFactorObservation, context) }),
             new Object [] { silicosisSocioBehavioralBooleanRiskFactorObservation }));
      }
      return false;
    }
    return true;
  }

} // SilicosisSocioBehavioralBooleanRiskFactorObservationOperations