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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

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
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryHasInversionIndForEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Has Inversion Ind For Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryInternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryInternalReferenceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Internal Reference Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#getInternalReference() <em>Get Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#getInternalReferenceReasons() <em>Get Internal Reference Reasons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureEntryOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ProcedureEntryOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryMoodCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryMoodCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentProcedureMood::EVN or self.moodCode = vocab::x_DocumentProcedureMood::INT";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryMoodCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryMoodCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryMoodCode(ProcedureEntry procedureEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_MOOD_CODE,
             IHEPlugin.INSTANCE.getString("ProcedureEntryMoodCode"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryHasTextReference(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Has Text Reference</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryHasTextReference(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryHasTextReference(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Has Text Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryHasTextReference(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryHasTextReference(ProcedureEntry procedureEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_HAS_TEXT_REFERENCE,
             IHEPlugin.INSTANCE.getString("ProcedureEntryHasTextReference"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryPriorityCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Priority Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryPriorityCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentProcedureMood::INT and self.effectiveTime.oclIsUndefined() implies not self.priorityCode.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryPriorityCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Priority Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryPriorityCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryPriorityCode(ProcedureEntry procedureEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_PRIORITY_CODE,
             IHEPlugin.INSTANCE.getString("ProcedureEntryPriorityCode"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryHasInversionIndForEncounter(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Has Inversion Ind For Encounter</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryHasInversionIndForEncounter(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP and er.inversionInd <> true)->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryHasInversionIndForEncounter(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Has Inversion Ind For Encounter</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryHasInversionIndForEncounter(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryHasInversionIndForEncounter(ProcedureEntry procedureEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_HAS_INVERSION_IND_FOR_ENCOUNTER,
             IHEPlugin.INSTANCE.getString("ProcedureEntryHasInversionIndForEncounter"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryTemplateId(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryTemplateId(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.19')";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryTemplateId(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryTemplateId(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryTemplateId(ProcedureEntry procedureEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_TEMPLATE_ID,
             IHEPlugin.INSTANCE.getString("ProcedureEntryTemplateId"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryClassCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryClassCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryClassCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryClassCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryClassCode(ProcedureEntry procedureEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_CLASS_CODE,
             IHEPlugin.INSTANCE.getString("ProcedureEntryClassCode"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryText(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryText(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryText(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryText(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryText(ProcedureEntry procedureEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_TEXT,
             IHEPlugin.INSTANCE.getString("ProcedureEntryText"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryApproachSiteCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Approach Site Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryApproachSiteCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryApproachSiteCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Approach Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryApproachSiteCode(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryApproachSiteCode(ProcedureEntry procedureEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_APPROACH_SITE_CODE,
             IHEPlugin.INSTANCE.getString("ProcedureEntryApproachSiteCode"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryInternalReference(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Internal Reference</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryInternalReference(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryInternalReference(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Internal Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryInternalReference(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryInternalReference(ProcedureEntry procedureEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_INTERNAL_REFERENCE,
             IHEPlugin.INSTANCE.getString("ProcedureEntryInternalReference"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProcedureEntryInternalReferenceReason(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Internal Reference Reason</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryInternalReferenceReason(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
   * The cached OCL invariant for the '{@link #validateProcedureEntryInternalReferenceReason(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Internal Reference Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProcedureEntryInternalReferenceReason(ProcedureEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param procedureEntry The receiving '<em><b>Procedure Entry</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProcedureEntryInternalReferenceReason(ProcedureEntry procedureEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY);
      try
      {
        VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntry))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.PROCEDURE_ENTRY__PROCEDURE_ENTRY_INTERNAL_REFERENCE_REASON,
             IHEPlugin.INSTANCE.getString("ProcedureEntryInternalReferenceReason"),
             new Object [] { procedureEntry }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getInternalReference(ProcedureEntry) <em>Get Internal Reference</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInternalReference(ProcedureEntry)
   * @generated
   * @ordered
   */
	protected static final String GET_INTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference))->asSequence()->any(true).oclAsType(ihe::InternalReference)";

	/**
   * The cached OCL query for the '{@link #getInternalReference(ProcedureEntry) <em>Get Internal Reference</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInternalReference(ProcedureEntry)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCE__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static InternalReference getInternalReference(ProcedureEntry procedureEntry) {
    if (GET_INTERNAL_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(IHEPackage.Literals.PROCEDURE_ENTRY, IHEPackage.Literals.PROCEDURE_ENTRY.getEAllOperations().get(61));
      try
      {
        GET_INTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCE__EOCL_QRY);
    return (InternalReference) query.evaluate(procedureEntry);
  }

	/**
   * The cached OCL expression body for the '{@link #getInternalReferenceReasons(ProcedureEntry) <em>Get Internal Reference Reasons</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInternalReferenceReasons(ProcedureEntry)
   * @generated
   * @ordered
   */
	protected static final String GET_INTERNAL_REFERENCE_REASONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference)).oclAsType(ihe::InternalReference)";

	/**
   * The cached OCL query for the '{@link #getInternalReferenceReasons(ProcedureEntry) <em>Get Internal Reference Reasons</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInternalReferenceReasons(ProcedureEntry)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static EList<InternalReference> getInternalReferenceReasons(ProcedureEntry procedureEntry) {
    if (GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(IHEPackage.Literals.PROCEDURE_ENTRY, IHEPackage.Literals.PROCEDURE_ENTRY.getEAllOperations().get(62));
      try
      {
        GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCE_REASONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<InternalReference> result = (Collection<InternalReference>) query.evaluate(procedureEntry);
    return new BasicEList.UnmodifiableEList<InternalReference>(result.size(), result.toArray());
  }

} // ProcedureEntryOperations
