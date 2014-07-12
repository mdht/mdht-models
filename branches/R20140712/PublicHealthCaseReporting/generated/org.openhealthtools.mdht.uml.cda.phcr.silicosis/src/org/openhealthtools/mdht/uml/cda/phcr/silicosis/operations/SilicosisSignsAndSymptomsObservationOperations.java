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

import org.openhealthtools.mdht.uml.cda.phcr.operations.SignsAndSymptomsObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signs And Symptoms Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSignsAndSymptomsObservation#validateSignsAndSymptomsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilicosisSignsAndSymptomsObservationOperations extends SignsAndSymptomsObservationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SilicosisSignsAndSymptomsObservationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSilicosisSignsAndSymptomsObservationValue(SilicosisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Signs And Symptoms Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSignsAndSymptomsObservationValue(SilicosisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

		/**
   * The cached OCL invariant for the '{@link #validateSilicosisSignsAndSymptomsObservationValue(SilicosisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Signs And Symptoms Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisSignsAndSymptomsObservationValue(SilicosisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param silicosisSignsAndSymptomsObservation The receiving '<em><b>Signs And Symptoms Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSilicosisSignsAndSymptomsObservationValue(SilicosisSignsAndSymptomsObservation silicosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);
      try
      {
        VALIDATE_SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisSignsAndSymptomsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisSignsAndSymptomsObservationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisSignsAndSymptomsObservation, context) }),
             new Object [] { silicosisSignsAndSymptomsObservation }));
      }
      return false;
    }
    return true;
  }

		/**
   * The cached OCL expression body for the '{@link #validateSignsAndSymptomsObservationTemplateId(SilicosisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSignsAndSymptomsObservationTemplateId(SilicosisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.112')";

  /**
   * The cached OCL invariant for the '{@link #validateSignsAndSymptomsObservationTemplateId(SilicosisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSignsAndSymptomsObservationTemplateId(SilicosisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.112')
   * @param silicosisSignsAndSymptomsObservation The receiving '<em><b>Signs And Symptoms Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSignsAndSymptomsObservationTemplateId(SilicosisSignsAndSymptomsObservation silicosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);
      try
      {
        VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisSignsAndSymptomsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSignsAndSymptomsObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisSignsAndSymptomsObservation, context) }),
             new Object [] { silicosisSignsAndSymptomsObservation }));
      }
      return false;
    }
    return true;
  }

} // SilicosisSignsAndSymptomsObservationOperations