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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer#validateCoccidioidesResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer#validateCoccidioidesResultOrganizerCoccidioidesResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Organizer Coccidioides Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer#getCoccidioidesResultObservations() <em>Get Coccidioides Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesResultOrganizerOperations extends ResultOrganizerOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesResultOrganizerOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesResultOrganizerCode(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Organizer Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesResultOrganizerCode(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesResultOrganizerCode(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Organizer Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesResultOrganizerCode(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param coccidioidesResultOrganizer The receiving '<em><b>Coccidioides Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesResultOrganizerCode(CoccidioidesResultOrganizer coccidioidesResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_RESULT_ORGANIZER);
      try
      {
        VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_RESULT_ORGANIZER__COCCIDIOIDES_RESULT_ORGANIZER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesResultOrganizerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesResultOrganizer, context) }),
             new Object [] { coccidioidesResultOrganizer }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesResultOrganizerCoccidioidesResultObservation(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Organizer Coccidioides Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesResultOrganizerCoccidioidesResultObservation(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(cocci::CoccidioidesResultObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesResultOrganizerCoccidioidesResultObservation(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Organizer Coccidioides Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesResultOrganizerCoccidioidesResultObservation(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(cocci::CoccidioidesResultObservation))
   * @param coccidioidesResultOrganizer The receiving '<em><b>Coccidioides Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesResultOrganizerCoccidioidesResultObservation(CoccidioidesResultOrganizer coccidioidesResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_RESULT_ORGANIZER);
      try
      {
        VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_RESULT_ORGANIZER__COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesResultOrganizerCoccidioidesResultObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesResultOrganizer, context) }),
             new Object [] { coccidioidesResultOrganizer }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesResultObservations(CoccidioidesResultOrganizer) <em>Get Coccidioides Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesResultObservations(CoccidioidesResultOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesResultObservation)).oclAsType(cocci::CoccidioidesResultObservation)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesResultObservations(CoccidioidesResultOrganizer) <em>Get Coccidioides Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesResultObservations(CoccidioidesResultOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesResultObservation)).oclAsType(cocci::CoccidioidesResultObservation)
   * @param coccidioidesResultOrganizer The receiving '<em><b>Coccidioides Result Organizer</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  EList<CoccidioidesResultObservation> getCoccidioidesResultObservations(CoccidioidesResultOrganizer coccidioidesResultOrganizer) {
    if (GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_RESULT_ORGANIZER, CocciPackage.Literals.COCCIDIOIDES_RESULT_ORGANIZER.getEAllOperations().get(73));
      try
      {
        GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CoccidioidesResultObservation> result = (Collection<CoccidioidesResultObservation>) query.evaluate(coccidioidesResultOrganizer);
    return new BasicEList.UnmodifiableEList<CoccidioidesResultObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.92')";

	/**
   * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(CoccidioidesResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.92')
   * @param coccidioidesResultOrganizer The receiving '<em><b>Coccidioides Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateResultOrganizerTemplateId(CoccidioidesResultOrganizer coccidioidesResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_RESULT_ORGANIZER);
      try
      {
        VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateResultOrganizerTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesResultOrganizer, context) }),
             new Object [] { coccidioidesResultOrganizer }));
      }
      return false;
    }
    return true;
  }

} // CoccidioidesResultOrganizerOperations