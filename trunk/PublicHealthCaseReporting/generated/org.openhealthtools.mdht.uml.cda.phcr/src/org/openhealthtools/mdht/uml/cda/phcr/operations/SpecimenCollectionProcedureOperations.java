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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Specimen Collection Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecimenCollectionProcedureOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SpecimenCollectionProcedureOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateSpecimenCollectionProcedureTemplateId(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureTemplateId(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.2')";

	/**
   * The cached OCL invariant for the '{@link #validateSpecimenCollectionProcedureTemplateId(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureTemplateId(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.2')
   * @param specimenCollectionProcedure The receiving '<em><b>Specimen Collection Procedure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSpecimenCollectionProcedureTemplateId(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.SPECIMEN_COLLECTION_PROCEDURE);
      try
      {
        VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenCollectionProcedure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSpecimenCollectionProcedureTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenCollectionProcedure, context) }),
             new Object [] { specimenCollectionProcedure }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSpecimenCollectionProcedureClassCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureClassCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::PROC";

	/**
   * The cached OCL invariant for the '{@link #validateSpecimenCollectionProcedureClassCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureClassCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClass::PROC
   * @param specimenCollectionProcedure The receiving '<em><b>Specimen Collection Procedure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSpecimenCollectionProcedureClassCode(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.SPECIMEN_COLLECTION_PROCEDURE);
      try
      {
        VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenCollectionProcedure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSpecimenCollectionProcedureClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenCollectionProcedure, context) }),
             new Object [] { specimenCollectionProcedure }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSpecimenCollectionProcedureMoodCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureMoodCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentProcedureMood::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateSpecimenCollectionProcedureMoodCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureMoodCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_DocumentProcedureMood::EVN
   * @param specimenCollectionProcedure The receiving '<em><b>Specimen Collection Procedure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSpecimenCollectionProcedureMoodCode(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.SPECIMEN_COLLECTION_PROCEDURE);
      try
      {
        VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenCollectionProcedure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSpecimenCollectionProcedureMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenCollectionProcedure, context) }),
             new Object [] { specimenCollectionProcedure }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSpecimenCollectionProcedureCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateSpecimenCollectionProcedureCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param specimenCollectionProcedure The receiving '<em><b>Specimen Collection Procedure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSpecimenCollectionProcedureCode(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.SPECIMEN_COLLECTION_PROCEDURE);
      try
      {
        VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenCollectionProcedure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSpecimenCollectionProcedureCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenCollectionProcedure, context) }),
             new Object [] { specimenCollectionProcedure }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSpecimenCollectionProcedureEffectiveTime(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureEffectiveTime(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateSpecimenCollectionProcedureEffectiveTime(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureEffectiveTime(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param specimenCollectionProcedure The receiving '<em><b>Specimen Collection Procedure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSpecimenCollectionProcedureEffectiveTime(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.SPECIMEN_COLLECTION_PROCEDURE);
      try
      {
        VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenCollectionProcedure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSpecimenCollectionProcedureEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenCollectionProcedure, context) }),
             new Object [] { specimenCollectionProcedure }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSpecimenCollectionProcedureTargetSiteCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureTargetSiteCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
   * The cached OCL invariant for the '{@link #validateSpecimenCollectionProcedureTargetSiteCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSpecimenCollectionProcedureTargetSiteCode(SpecimenCollectionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
   * @param specimenCollectionProcedure The receiving '<em><b>Specimen Collection Procedure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSpecimenCollectionProcedureTargetSiteCode(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.SPECIMEN_COLLECTION_PROCEDURE);
      try
      {
        VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenCollectionProcedure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSpecimenCollectionProcedureTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenCollectionProcedure, context) }),
             new Object [] { specimenCollectionProcedure }));
      }
      return false;
    }
    return true;
  }

} // SpecimenCollectionProcedureOperations