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

import org.openhealthtools.mdht.uml.cda.phcr.operations.TherapeuticRegimenActOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#getTuberculosisTreatmentGivenSubstanceAdministrations() <em>Get Tuberculosis Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#getTuberculosisTreatmentNotGivenSubstanceAdministrations() <em>Get Tuberculosis Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisTherapeuticRegimenActOperations extends TherapeuticRegimenActOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TuberculosisTherapeuticRegimenActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT__TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration"),
             new Object [] { tuberculosisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Not Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Not Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT__TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration"),
             new Object [] { tuberculosisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getTuberculosisTreatmentGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct) <em>Get Tuberculosis Treatment Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisTreatmentGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration)).oclAsType(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getTuberculosisTreatmentGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct) <em>Get Tuberculosis Treatment Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisTreatmentGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<TuberculosisTreatmentGivenSubstanceAdministration> getTuberculosisTreatmentGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct) {
    if (GET_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT, TuberculosisPackage.Literals.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(65));
      try
      {
        GET_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TuberculosisTreatmentGivenSubstanceAdministration> result = (Collection<TuberculosisTreatmentGivenSubstanceAdministration>) query.evaluate(tuberculosisTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<TuberculosisTreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getTuberculosisTreatmentNotGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct) <em>Get Tuberculosis Treatment Not Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisTreatmentNotGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration)).oclAsType(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getTuberculosisTreatmentNotGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct) <em>Get Tuberculosis Treatment Not Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisTreatmentNotGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<TuberculosisTreatmentNotGivenSubstanceAdministration> getTuberculosisTreatmentNotGivenSubstanceAdministrations(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct) {
    if (GET_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT, TuberculosisPackage.Literals.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(66));
      try
      {
        GET_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TuberculosisTreatmentNotGivenSubstanceAdministration> result = (Collection<TuberculosisTreatmentNotGivenSubstanceAdministration>) query.evaluate(tuberculosisTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<TuberculosisTreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.18')";

	/**
   * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(TuberculosisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTherapeuticRegimenActTemplateId(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisTherapeuticRegimenAct, context) }),
             new Object [] { tuberculosisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

} // TuberculosisTherapeuticRegimenActOperations