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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#getTularemiaTreatmentGivenSubstanceAdministrations() <em>Get Tularemia Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#getTularemiaTreatmentNotGivenSubstanceAdministrations() <em>Get Tularemia Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaTherapeuticRegimenActOperations extends TherapeuticRegimenActOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TularemiaTherapeuticRegimenActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_THERAPEUTIC_REGIMEN_ACT__TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
             TularemiaPlugin.INSTANCE.getString("TularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration"),
             new Object [] { tularemiaTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Not Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Not Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_THERAPEUTIC_REGIMEN_ACT__TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
             TularemiaPlugin.INSTANCE.getString("TularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration"),
             new Object [] { tularemiaTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getTularemiaTreatmentGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct) <em>Get Tularemia Treatment Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTularemiaTreatmentGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentGivenSubstanceAdministration)).oclAsType(tularemia::TularemiaTreatmentGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getTularemiaTreatmentGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct) <em>Get Tularemia Treatment Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTularemiaTreatmentGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<TularemiaTreatmentGivenSubstanceAdministration> getTularemiaTreatmentGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct) {
    if (GET_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_THERAPEUTIC_REGIMEN_ACT, TularemiaPackage.Literals.TULAREMIA_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(65));
      try
      {
        GET_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TularemiaTreatmentGivenSubstanceAdministration> result = (Collection<TularemiaTreatmentGivenSubstanceAdministration>) query.evaluate(tularemiaTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<TularemiaTreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getTularemiaTreatmentNotGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct) <em>Get Tularemia Treatment Not Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTularemiaTreatmentNotGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration)).oclAsType(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getTularemiaTreatmentNotGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct) <em>Get Tularemia Treatment Not Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTularemiaTreatmentNotGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<TularemiaTreatmentNotGivenSubstanceAdministration> getTularemiaTreatmentNotGivenSubstanceAdministrations(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct) {
    if (GET_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_THERAPEUTIC_REGIMEN_ACT, TularemiaPackage.Literals.TULAREMIA_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(66));
      try
      {
        GET_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TularemiaTreatmentNotGivenSubstanceAdministration> result = (Collection<TularemiaTreatmentNotGivenSubstanceAdministration>) query.evaluate(tularemiaTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<TularemiaTreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.48')";

	/**
   * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(TularemiaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTherapeuticRegimenActTemplateId(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tularemiaTherapeuticRegimenAct, context) }),
             new Object [] { tularemiaTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

} // TularemiaTherapeuticRegimenActOperations