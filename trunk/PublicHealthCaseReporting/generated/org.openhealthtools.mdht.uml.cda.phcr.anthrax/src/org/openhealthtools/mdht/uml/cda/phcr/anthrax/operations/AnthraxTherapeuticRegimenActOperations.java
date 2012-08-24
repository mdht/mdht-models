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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.util.AnthraxValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.TherapeuticRegimenActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#getAnthraxTreatmentGivenSubstanceAdministrations() <em>Get Anthrax Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#getAnthraxTreatmentNotGivenSubstanceAdministrations() <em>Get Anthrax Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnthraxTherapeuticRegimenActOperations extends TherapeuticRegimenActOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxTherapeuticRegimenActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(anthrax::AnthraxTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param anthraxTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_THERAPEUTIC_REGIMEN_ACT__ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
             AnthraxPlugin.INSTANCE.getString("AnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration"),
             new Object [] { anthraxTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Not Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(anthrax::AnthraxTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Not Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param anthraxTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_THERAPEUTIC_REGIMEN_ACT__ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
             AnthraxPlugin.INSTANCE.getString("AnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration"),
             new Object [] { anthraxTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getAnthraxTreatmentGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct) <em>Get Anthrax Treatment Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxTreatmentGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(anthrax::AnthraxTreatmentGivenSubstanceAdministration)).oclAsType(anthrax::AnthraxTreatmentGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getAnthraxTreatmentGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct) <em>Get Anthrax Treatment Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxTreatmentGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<AnthraxTreatmentGivenSubstanceAdministration> getAnthraxTreatmentGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct) {
    if (GET_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_THERAPEUTIC_REGIMEN_ACT, AnthraxPackage.Literals.ANTHRAX_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(65));
      try
      {
        GET_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<AnthraxTreatmentGivenSubstanceAdministration> result = (Collection<AnthraxTreatmentGivenSubstanceAdministration>) query.evaluate(anthraxTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<AnthraxTreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getAnthraxTreatmentNotGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct) <em>Get Anthrax Treatment Not Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxTreatmentNotGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(anthrax::AnthraxTreatmentNotGivenSubstanceAdministration)).oclAsType(anthrax::AnthraxTreatmentNotGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getAnthraxTreatmentNotGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct) <em>Get Anthrax Treatment Not Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxTreatmentNotGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<AnthraxTreatmentNotGivenSubstanceAdministration> getAnthraxTreatmentNotGivenSubstanceAdministrations(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct) {
    if (GET_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_THERAPEUTIC_REGIMEN_ACT, AnthraxPackage.Literals.ANTHRAX_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(66));
      try
      {
        GET_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<AnthraxTreatmentNotGivenSubstanceAdministration> result = (Collection<AnthraxTreatmentNotGivenSubstanceAdministration>) query.evaluate(anthraxTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<AnthraxTreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.37')";

	/**
   * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(AnthraxTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param anthraxTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTherapeuticRegimenActTemplateId(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxTherapeuticRegimenAct, context) }),
             new Object [] { anthraxTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

} // AnthraxTherapeuticRegimenActOperations