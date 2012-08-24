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
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationSpecimenCollectionProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Specimen Collection Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validatePHCRResultObservationSusceptibilityResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Susceptibility Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#getSpecimenCollectionProcedures() <em>Get Specimen Collection Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#getSusceptibilityResults() <em>Get Susceptibility Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultObservationOperations extends org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResultObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePHCRResultObservationClassCode(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationClassCode(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
   * The cached OCL invariant for the '{@link #validatePHCRResultObservationClassCode(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationClassCode(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePHCRResultObservationClassCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.RESULT_OBSERVATION);
      try
      {
        VALIDATE_PHCR_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_CLASS_CODE,
             PhcrPlugin.INSTANCE.getString("PHCRResultObservationClassCode"),
             new Object [] { resultObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePHCRResultObservationStatusCodeP(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationStatusCodeP(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePHCRResultObservationStatusCodeP(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationStatusCodeP(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePHCRResultObservationStatusCodeP(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.RESULT_OBSERVATION);
      try
      {
        VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_STATUS_CODE_P,
             PhcrPlugin.INSTANCE.getString("PHCRResultObservationStatusCodeP"),
             new Object [] { resultObservation }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.PHCRResultObservationStatusCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.phcr.PHCRResultObservationStatusCodeP", passToken);
        }
        passToken.add(resultObservation);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePHCRResultObservationStatusCode(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationStatusCode(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validatePHCRResultObservationStatusCode(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationStatusCode(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePHCRResultObservationStatusCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.PHCRResultObservationStatusCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(resultObservation)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.RESULT_OBSERVATION);
      try
      {
        VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_STATUS_CODE,
             PhcrPlugin.INSTANCE.getString("PHCRResultObservationStatusCode"),
             new Object [] { resultObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePHCRResultObservationSpecimenCollectionProcedure(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Specimen Collection Procedure</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationSpecimenCollectionProcedure(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(phcr::SpecimenCollectionProcedure) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
   * The cached OCL invariant for the '{@link #validatePHCRResultObservationSpecimenCollectionProcedure(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Specimen Collection Procedure</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationSpecimenCollectionProcedure(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePHCRResultObservationSpecimenCollectionProcedure(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.RESULT_OBSERVATION);
      try
      {
        VALIDATE_PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE,
             PhcrPlugin.INSTANCE.getString("PHCRResultObservationSpecimenCollectionProcedure"),
             new Object [] { resultObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePHCRResultObservationSusceptibilityResult(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Susceptibility Result</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationSusceptibilityResult(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(phcr::SusceptibilityResult) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePHCRResultObservationSusceptibilityResult(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHCR Result Observation Susceptibility Result</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHCRResultObservationSusceptibilityResult(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePHCRResultObservationSusceptibilityResult(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.RESULT_OBSERVATION);
      try
      {
        VALIDATE_PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT,
             PhcrPlugin.INSTANCE.getString("PHCRResultObservationSusceptibilityResult"),
             new Object [] { resultObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getSpecimenCollectionProcedures(ResultObservation) <em>Get Specimen Collection Procedures</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSpecimenCollectionProcedures(ResultObservation)
   * @generated
   * @ordered
   */
	protected static final String GET_SPECIMEN_COLLECTION_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(phcr::SpecimenCollectionProcedure)).oclAsType(phcr::SpecimenCollectionProcedure)";

	/**
   * The cached OCL query for the '{@link #getSpecimenCollectionProcedures(ResultObservation) <em>Get Specimen Collection Procedures</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSpecimenCollectionProcedures(ResultObservation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SPECIMEN_COLLECTION_PROCEDURES__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<SpecimenCollectionProcedure> getSpecimenCollectionProcedures(ResultObservation resultObservation) {
    if (GET_SPECIMEN_COLLECTION_PROCEDURES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhcrPackage.Literals.RESULT_OBSERVATION, PhcrPackage.Literals.RESULT_OBSERVATION.getEAllOperations().get(69));
      try
      {
        GET_SPECIMEN_COLLECTION_PROCEDURES__EOCL_QRY = helper.createQuery(GET_SPECIMEN_COLLECTION_PROCEDURES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_COLLECTION_PROCEDURES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SpecimenCollectionProcedure> result = (Collection<SpecimenCollectionProcedure>) query.evaluate(resultObservation);
    return new BasicEList.UnmodifiableEList<SpecimenCollectionProcedure>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getSusceptibilityResults(ResultObservation) <em>Get Susceptibility Results</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSusceptibilityResults(ResultObservation)
   * @generated
   * @ordered
   */
	protected static final String GET_SUSCEPTIBILITY_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::SusceptibilityResult)).oclAsType(phcr::SusceptibilityResult)";

	/**
   * The cached OCL query for the '{@link #getSusceptibilityResults(ResultObservation) <em>Get Susceptibility Results</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSusceptibilityResults(ResultObservation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SUSCEPTIBILITY_RESULTS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<SusceptibilityResult> getSusceptibilityResults(ResultObservation resultObservation) {
    if (GET_SUSCEPTIBILITY_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhcrPackage.Literals.RESULT_OBSERVATION, PhcrPackage.Literals.RESULT_OBSERVATION.getEAllOperations().get(70));
      try
      {
        GET_SUSCEPTIBILITY_RESULTS__EOCL_QRY = helper.createQuery(GET_SUSCEPTIBILITY_RESULTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SUSCEPTIBILITY_RESULTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SusceptibilityResult> result = (Collection<SusceptibilityResult>) query.evaluate(resultObservation);
    return new BasicEList.UnmodifiableEList<SusceptibilityResult>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultObservationTemplateId(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.58')";

	/**
   * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultObservationTemplateId(ResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateResultObservationTemplateId(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.RESULT_OBSERVATION);
      try
      {
        VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(resultObservation, context) }),
             new Object [] { resultObservation }));
      }
       
      return false;
    }
    return true;
  }

} // ResultObservationOperations