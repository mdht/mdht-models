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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer#validateStrepPneumoResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer#validateStrepPneumoResultOrganizerStrepPneumoResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Result Organizer Strep Pneumo Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer#getStrepPneumoResultObservations() <em>Get Strep Pneumo Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoResultOrganizerOperations extends ResultOrganizerOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StrepPneumoResultOrganizerOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateStrepPneumoResultOrganizerCode(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Result Organizer Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStrepPneumoResultOrganizerCode(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStrepPneumoResultOrganizerCode(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Result Organizer Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStrepPneumoResultOrganizerCode(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStrepPneumoResultOrganizerCode(StrepPneumoResultOrganizer strepPneumoResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RESULT_ORGANIZER);
      try
      {
        VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_RESULT_ORGANIZER__STREP_PNEUMO_RESULT_ORGANIZER_CODE,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoResultOrganizerCode"),
             new Object [] { strepPneumoResultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStrepPneumoResultOrganizerStrepPneumoResultObservation(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Result Organizer Strep Pneumo Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoResultOrganizerStrepPneumoResultObservation(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(streppneumo::StrepPneumoResultObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateStrepPneumoResultOrganizerStrepPneumoResultObservation(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Result Organizer Strep Pneumo Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoResultOrganizerStrepPneumoResultObservation(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateStrepPneumoResultOrganizerStrepPneumoResultObservation(StrepPneumoResultOrganizer strepPneumoResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RESULT_ORGANIZER);
      try
      {
        VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_RESULT_ORGANIZER__STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoResultOrganizerStrepPneumoResultObservation"),
             new Object [] { strepPneumoResultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getStrepPneumoResultObservations(StrepPneumoResultOrganizer) <em>Get Strep Pneumo Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStrepPneumoResultObservations(StrepPneumoResultOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(streppneumo::StrepPneumoResultObservation)).oclAsType(streppneumo::StrepPneumoResultObservation)";

	/**
   * The cached OCL query for the '{@link #getStrepPneumoResultObservations(StrepPneumoResultOrganizer) <em>Get Strep Pneumo Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStrepPneumoResultObservations(StrepPneumoResultOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<StrepPneumoResultObservation> getStrepPneumoResultObservations(StrepPneumoResultOrganizer strepPneumoResultOrganizer) {
    if (GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RESULT_ORGANIZER, StrepPneumoPackage.Literals.STREP_PNEUMO_RESULT_ORGANIZER.getEAllOperations().get(76));
      try
      {
        GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<StrepPneumoResultObservation> result = (Collection<StrepPneumoResultObservation>) query.evaluate(strepPneumoResultOrganizer);
    return new BasicEList.UnmodifiableEList<StrepPneumoResultObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.130')";

	/**
   * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(StrepPneumoResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateResultOrganizerTemplateId(StrepPneumoResultOrganizer strepPneumoResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RESULT_ORGANIZER);
      try
      {
        VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultOrganizerTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoResultOrganizer, context) }),
             new Object [] { strepPneumoResultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

} // StrepPneumoResultOrganizerOperations