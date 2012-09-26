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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.phcr.operations.SignsAndSymptomsObservationOperations;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.util.WnvValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signs And Symptoms Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation#validateSignsAndSymptomsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WnvSignsAndSymptomsObservationOperations extends SignsAndSymptomsObservationOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected WnvSignsAndSymptomsObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateWnvSignsAndSymptomsObservationValue(WnvSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Signs And Symptoms Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateWnvSignsAndSymptomsObservationValue(WnvSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_WNV_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateWnvSignsAndSymptomsObservationValue(WnvSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Signs And Symptoms Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateWnvSignsAndSymptomsObservationValue(WnvSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_WNV_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param wnvSignsAndSymptomsObservation The receiving '<em><b>Signs And Symptoms Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateWnvSignsAndSymptomsObservationValue(WnvSignsAndSymptomsObservation wnvSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_WNV_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WNV_SIGNS_AND_SYMPTOMS_OBSERVATION);
      try
      {
        VALIDATE_WNV_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WNV_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_WNV_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(wnvSignsAndSymptomsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WNV_SIGNS_AND_SYMPTOMS_OBSERVATION__WNV_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateWnvSignsAndSymptomsObservationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(wnvSignsAndSymptomsObservation, context) }),
             new Object [] { wnvSignsAndSymptomsObservation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSignsAndSymptomsObservationTemplateId(WnvSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSignsAndSymptomsObservationTemplateId(WnvSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.104')";

	/**
   * The cached OCL invariant for the '{@link #validateSignsAndSymptomsObservationTemplateId(WnvSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSignsAndSymptomsObservationTemplateId(WnvSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.104')
   * @param wnvSignsAndSymptomsObservation The receiving '<em><b>Signs And Symptoms Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSignsAndSymptomsObservationTemplateId(WnvSignsAndSymptomsObservation wnvSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WNV_SIGNS_AND_SYMPTOMS_OBSERVATION);
      try
      {
        VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(wnvSignsAndSymptomsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WNV_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSignsAndSymptomsObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(wnvSignsAndSymptomsObservation, context) }),
             new Object [] { wnvSignsAndSymptomsObservation }));
      }
      return false;
    }
    return true;
  }

} // WnvSignsAndSymptomsObservationOperations