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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#getPertussisTreatmentGivenSubstanceAdministrations() <em>Get Pertussis Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#getPertussisTreatmentNotGivenSubstanceAdministrations() <em>Get Pertussis Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisTherapeuticRegimenActOperations extends TherapeuticRegimenActOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PertussisTherapeuticRegimenActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(pertussis::PertussisTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
             PertussisPlugin.INSTANCE.getString("PertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration"),
             new Object [] { pertussisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Not Given Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(pertussis::PertussisTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Not Given Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
             PertussisPlugin.INSTANCE.getString("PertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration"),
             new Object [] { pertussisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getPertussisTreatmentGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct) <em>Get Pertussis Treatment Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPertussisTreatmentGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(pertussis::PertussisTreatmentGivenSubstanceAdministration)).oclAsType(pertussis::PertussisTreatmentGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getPertussisTreatmentGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct) <em>Get Pertussis Treatment Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPertussisTreatmentGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<PertussisTreatmentGivenSubstanceAdministration> getPertussisTreatmentGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct) {
    if (GET_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT, PertussisPackage.Literals.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(65));
      try
      {
        GET_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<PertussisTreatmentGivenSubstanceAdministration> result = (Collection<PertussisTreatmentGivenSubstanceAdministration>) query.evaluate(pertussisTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<PertussisTreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getPertussisTreatmentNotGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct) <em>Get Pertussis Treatment Not Given Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPertussisTreatmentNotGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static final String GET_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(pertussis::PertussisTreatmentNotGivenSubstanceAdministration)).oclAsType(pertussis::PertussisTreatmentNotGivenSubstanceAdministration)";

	/**
   * The cached OCL query for the '{@link #getPertussisTreatmentNotGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct) <em>Get Pertussis Treatment Not Given Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPertussisTreatmentNotGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<PertussisTreatmentNotGivenSubstanceAdministration> getPertussisTreatmentNotGivenSubstanceAdministrations(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct) {
    if (GET_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT, PertussisPackage.Literals.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(66));
      try
      {
        GET_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<PertussisTreatmentNotGivenSubstanceAdministration> result = (Collection<PertussisTreatmentNotGivenSubstanceAdministration>) query.evaluate(pertussisTherapeuticRegimenAct);
    return new BasicEList.UnmodifiableEList<PertussisTreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.67')";

	/**
   * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTherapeuticRegimenActTemplateId(PertussisTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTherapeuticRegimenActTemplateId(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT);
      try
      {
        VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisTherapeuticRegimenAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pertussisTherapeuticRegimenAct, context) }),
             new Object [] { pertussisTherapeuticRegimenAct }));
      }
       
      return false;
    }
    return true;
  }

} // PertussisTherapeuticRegimenActOperations