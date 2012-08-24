/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

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
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ResultOrganizer#validateHITSPResultOrganizerResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Result Organizer Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ResultOrganizer#getResults() <em>Get Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultOrganizerOperations extends
		org.openhealthtools.mdht.uml.cda.ccd.operations.ResultOrganizerOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResultOrganizerOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateHITSPResultOrganizerResult(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Result Organizer Result</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPResultOrganizerResult(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HITSP_RESULT_ORGANIZER_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(hitsp::Result))";

	/**
   * The cached OCL invariant for the '{@link #validateHITSPResultOrganizerResult(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Result Organizer Result</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPResultOrganizerResult(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HITSP_RESULT_ORGANIZER_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHITSPResultOrganizerResult(ResultOrganizer resultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_HITSP_RESULT_ORGANIZER_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.RESULT_ORGANIZER);
      try
      {
        VALIDATE_HITSP_RESULT_ORGANIZER_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_RESULT_ORGANIZER_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HITSP_RESULT_ORGANIZER_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.RESULT_ORGANIZER__HITSP_RESULT_ORGANIZER_RESULT,
             HITSPPlugin.INSTANCE.getString("HITSPResultOrganizerResult"),
             new Object [] { resultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getResults(ResultOrganizer) <em>Get Results</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResults(ResultOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::Result)).oclAsType(hitsp::Result)";

	/**
   * The cached OCL query for the '{@link #getResults(ResultOrganizer) <em>Get Results</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResults(ResultOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_RESULTS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static EList<Result> getResults(ResultOrganizer resultOrganizer) {
    if (GET_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(HITSPPackage.Literals.RESULT_ORGANIZER, HITSPPackage.Literals.RESULT_ORGANIZER.getEAllOperations().get(64));
      try
      {
        GET_RESULTS__EOCL_QRY = helper.createQuery(GET_RESULTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<Result> result = (Collection<Result>) query.evaluate(resultOrganizer);
    return new BasicEList.UnmodifiableEList<Result>(result.size(), result.toArray());
  }

} // ResultOrganizerOperations
