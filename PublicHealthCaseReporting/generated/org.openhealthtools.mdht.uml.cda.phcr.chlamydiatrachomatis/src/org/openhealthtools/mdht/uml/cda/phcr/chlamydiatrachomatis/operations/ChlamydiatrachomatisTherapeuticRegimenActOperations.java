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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util.ChlamydiatrachomatisValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.TherapeuticRegimenActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations() <em>Get Chlamydiatrachomatis Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations() <em>Get Chlamydiatrachomatis Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisTherapeuticRegimenActOperations extends TherapeuticRegimenActOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ChlamydiatrachomatisTherapeuticRegimenActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param chlamydiatrachomatisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
             ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration"),
             new Object [] { chlamydiatrachomatisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Not Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Not Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param chlamydiatrachomatisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
             ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration"),
             new Object [] { chlamydiatrachomatisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct) <em>Get Chlamydiatrachomatis Treatment Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTreatmentGivenSubstanceAdministration)).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisTreatmentGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct) <em>Get Chlamydiatrachomatis Treatment Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<ChlamydiatrachomatisTreatmentGivenSubstanceAdministration> getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct) {
    if (GET_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(65));
      try
      {
        GET_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ChlamydiatrachomatisTreatmentGivenSubstanceAdministration> result = (Collection<ChlamydiatrachomatisTreatmentGivenSubstanceAdministration>) query.evaluate(chlamydiatrachomatisTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<ChlamydiatrachomatisTreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct) <em>Get Chlamydiatrachomatis Treatment Not Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration)).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct) <em>Get Chlamydiatrachomatis Treatment Not Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration> getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct) {
    if (GET_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(66));
      try
      {
        GET_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration> result = (Collection<ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration>) query.evaluate(chlamydiatrachomatisTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.131')";

	/**
   * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(ChlamydiatrachomatisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param chlamydiatrachomatisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTherapeuticRegimenActTemplateId(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisTherapeuticRegimenAct, context) }),
             new Object [] { chlamydiatrachomatisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

} // ChlamydiatrachomatisTherapeuticRegimenActOperations