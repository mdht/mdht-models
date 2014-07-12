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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Social History Section Silicosis Socio Behavioral Boolean Risk Factor Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Social History Section Silicosis Possible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#getSilicosisSocioBehavioralBooleanRiskFactorObservation() <em>Get Silicosis Socio Behavioral Boolean Risk Factor Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#getSilicosisPossibleExposureLocationAndTypeActs() <em>Get Silicosis Possible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilicosisPHCRSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SilicosisPHCRSocialHistorySectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Social History Section Silicosis Socio Behavioral Boolean Risk Factor Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(silicosis::SilicosisSocioBehavioralBooleanRiskFactorObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Social History Section Silicosis Socio Behavioral Boolean Risk Factor Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(silicosis::SilicosisSocioBehavioralBooleanRiskFactorObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param silicosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisPHCRSocialHistorySection, context) }),
             new Object [] { silicosisPHCRSocialHistorySection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Social History Section Silicosis Possible Exposure Location And Type Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(silicosis::SilicosisPossibleExposureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Social History Section Silicosis Possible Exposure Location And Type Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(silicosis::SilicosisPossibleExposureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param silicosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisPHCRSocialHistorySection, context) }),
             new Object [] { silicosisPHCRSocialHistorySection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection) <em>Get Silicosis Socio Behavioral Boolean Risk Factor Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(silicosis::SilicosisSocioBehavioralBooleanRiskFactorObservation))->asSequence()->any(true).oclAsType(silicosis::SilicosisSocioBehavioralBooleanRiskFactorObservation)";

	/**
   * The cached OCL query for the '{@link #getSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection) <em>Get Silicosis Socio Behavioral Boolean Risk Factor Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(silicosis::SilicosisSocioBehavioralBooleanRiskFactorObservation))->asSequence()->any(true).oclAsType(silicosis::SilicosisSocioBehavioralBooleanRiskFactorObservation)
   * @param silicosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  SilicosisSocioBehavioralBooleanRiskFactorObservation getSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection) {
    if (GET_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SilicosisPackage.Literals.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION, SilicosisPackage.Literals.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(77));
      try
      {
        GET_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__EOCL_QRY);
    return (SilicosisSocioBehavioralBooleanRiskFactorObservation) query.evaluate(silicosisPHCRSocialHistorySection);
  }

	/**
   * The cached OCL expression body for the '{@link #getSilicosisPossibleExposureLocationAndTypeActs(SilicosisPHCRSocialHistorySection) <em>Get Silicosis Possible Exposure Location And Type Acts</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisPossibleExposureLocationAndTypeActs(SilicosisPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(silicosis::SilicosisPossibleExposureLocationAndTypeAct)).oclAsType(silicosis::SilicosisPossibleExposureLocationAndTypeAct)";

	/**
   * The cached OCL query for the '{@link #getSilicosisPossibleExposureLocationAndTypeActs(SilicosisPHCRSocialHistorySection) <em>Get Silicosis Possible Exposure Location And Type Acts</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisPossibleExposureLocationAndTypeActs(SilicosisPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(silicosis::SilicosisPossibleExposureLocationAndTypeAct)).oclAsType(silicosis::SilicosisPossibleExposureLocationAndTypeAct)
   * @param silicosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  EList<SilicosisPossibleExposureLocationAndTypeAct> getSilicosisPossibleExposureLocationAndTypeActs(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection) {
    if (GET_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SilicosisPackage.Literals.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION, SilicosisPackage.Literals.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(78));
      try
      {
        GET_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY = helper.createQuery(GET_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SilicosisPossibleExposureLocationAndTypeAct> result = (Collection<SilicosisPossibleExposureLocationAndTypeAct>) query.evaluate(silicosisPHCRSocialHistorySection);
    return new BasicEList.UnmodifiableEList<SilicosisPossibleExposureLocationAndTypeAct>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.33')";

  /**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(SilicosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.33')
   * @param silicosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSocialHistorySectionTemplateId(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisPHCRSocialHistorySection, context) }),
             new Object [] { silicosisPHCRSocialHistorySection }));
      }
      return false;
    }
    return true;
  }

} // SilicosisPHCRSocialHistorySectionOperations