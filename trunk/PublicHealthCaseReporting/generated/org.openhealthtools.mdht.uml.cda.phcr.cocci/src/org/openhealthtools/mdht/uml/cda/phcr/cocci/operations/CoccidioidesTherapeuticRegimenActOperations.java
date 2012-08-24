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
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.TherapeuticRegimenActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#getCoccidioidesTreatmentGivenSubstanceAdministrations() <em>Get Coccidioides Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#getCoccidioidesTreatmentNotGivenSubstanceAdministrations() <em>Get Coccidioides Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesTherapeuticRegimenActOperations extends TherapeuticRegimenActOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesTherapeuticRegimenActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(cocci::CoccidioidesTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesTherapeuticRegimenAct The receiving '<em><b>Coccidioides Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
             CocciPlugin.INSTANCE.getString("CoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration"),
             new Object [] { coccidioidesTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Not Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(cocci::CoccidioidesTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Not Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesTherapeuticRegimenAct The receiving '<em><b>Coccidioides Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
             CocciPlugin.INSTANCE.getString("CoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration"),
             new Object [] { coccidioidesTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesTreatmentGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct) <em>Get Coccidioides Treatment Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesTreatmentGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(cocci::CoccidioidesTreatmentGivenSubstanceAdministration)).oclAsType(cocci::CoccidioidesTreatmentGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesTreatmentGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct) <em>Get Coccidioides Treatment Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesTreatmentGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<CoccidioidesTreatmentGivenSubstanceAdministration> getCoccidioidesTreatmentGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct) {
    if (GET_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT, CocciPackage.Literals.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(65));
      try
      {
        GET_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CoccidioidesTreatmentGivenSubstanceAdministration> result = (Collection<CoccidioidesTreatmentGivenSubstanceAdministration>) query.evaluate(coccidioidesTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<CoccidioidesTreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesTreatmentNotGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct) <em>Get Coccidioides Treatment Not Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesTreatmentNotGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(cocci::CoccidioidesTreatmentNotGivenSubstanceAdministration)).oclAsType(cocci::CoccidioidesTreatmentNotGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesTreatmentNotGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct) <em>Get Coccidioides Treatment Not Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesTreatmentNotGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<CoccidioidesTreatmentNotGivenSubstanceAdministration> getCoccidioidesTreatmentNotGivenSubstanceAdministrations(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct) {
    if (GET_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT, CocciPackage.Literals.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(66));
      try
      {
        GET_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CoccidioidesTreatmentNotGivenSubstanceAdministration> result = (Collection<CoccidioidesTreatmentNotGivenSubstanceAdministration>) query.evaluate(coccidioidesTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<CoccidioidesTreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.89')";

	/**
   * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(CoccidioidesTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesTherapeuticRegimenAct The receiving '<em><b>Coccidioides Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTherapeuticRegimenActTemplateId(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesTherapeuticRegimenAct, context) }),
             new Object [] { coccidioidesTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

} // CoccidioidesTherapeuticRegimenActOperations