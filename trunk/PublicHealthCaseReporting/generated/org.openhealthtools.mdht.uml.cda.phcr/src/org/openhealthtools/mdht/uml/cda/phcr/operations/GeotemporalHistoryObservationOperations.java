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
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Geotemporal History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeotemporalHistoryObservationOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GeotemporalHistoryObservationOperations() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateGeotemporalHistoryObservationEffectiveTime(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateGeotemporalHistoryObservationValue(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateGeotemporalHistoryObservationText(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationTemplateId(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationTemplateId(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.3')";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationTemplateId(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationTemplateId(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.3')
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateGeotemporalHistoryObservationTemplateId(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationClassCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationClassCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationClassCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationClassCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateGeotemporalHistoryObservationClassCode(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
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
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '55210-9' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateGeotemporalHistoryObservationCode(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationMoodCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationMoodCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationMoodCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationMoodCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateGeotemporalHistoryObservationMoodCode(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationCodeP(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationCodeP(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationCodeP(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationCodeP(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '55210-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationText(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationText(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationText(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationText(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateGeotemporalHistoryObservationCodeP(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationStatusCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationStatusCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationStatusCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationStatusCode(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
   * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
   * value.code = 'completed')
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateGeotemporalHistoryObservationStatusCode(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationStatusCodeP(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationStatusCodeP(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationStatusCodeP(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationStatusCodeP(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationEffectiveTime(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationEffectiveTime(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationEffectiveTime(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationEffectiveTime(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateGeotemporalHistoryObservationValue(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationValue(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
   * The cached OCL invariant for the '{@link #validateGeotemporalHistoryObservationValue(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeotemporalHistoryObservationValue(GeotemporalHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param geotemporalHistoryObservation The receiving '<em><b>Geotemporal History Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateGeotemporalHistoryObservationStatusCodeP(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION);
      try
      {
        VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(geotemporalHistoryObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateGeotemporalHistoryObservationStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(geotemporalHistoryObservation, context) }),
             new Object [] { geotemporalHistoryObservation }));
      }
      return false;
    }
    return true;
  }

} // GeotemporalHistoryObservationOperations