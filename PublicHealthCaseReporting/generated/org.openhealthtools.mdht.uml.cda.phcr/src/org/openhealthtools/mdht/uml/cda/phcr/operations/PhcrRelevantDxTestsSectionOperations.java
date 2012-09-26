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
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionImagingObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Imaging Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#getPHCRResultOrganizers() <em>Get PHCR Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#getResultObservations() <em>Get Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#getImagingObservations() <em>Get Imaging Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhcrRelevantDxTestsSectionOperations extends ResultsSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhcrRelevantDxTestsSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrRelevantDxTestsSectionCodeP(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionCodeP(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePhcrRelevantDxTestsSectionCodeP(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionCodeP(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhcrRelevantDxTestsSectionCodeP(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrRelevantDxTestsSectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantDxTestsSection, context) }),
             new Object [] { phcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhcrRelevantDxTestsSectionCode(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionCode(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrRelevantDxTestsSectionCode(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionCode(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrRelevantDxTestsSectionCode(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrRelevantDxTestsSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantDxTestsSection, context) }),
             new Object [] { phcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrRelevantDxTestsSectionTitle(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionTitle(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Relevant diagnostic tests and/or laboratory data')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrRelevantDxTestsSectionTitle(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionTitle(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Relevant diagnostic tests and/or laboratory data')
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrRelevantDxTestsSectionTitle(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_TITLE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrRelevantDxTestsSectionTitle", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantDxTestsSection, context) }),
             new Object [] { phcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrRelevantDxTestsSectionText(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionText(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrRelevantDxTestsSectionText(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionText(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrRelevantDxTestsSectionText(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrRelevantDxTestsSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantDxTestsSection, context) }),
             new Object [] { phcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrRelevantDxTestsSectionResultOrganizer(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Result Organizer</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionResultOrganizer(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(phcr::ResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrRelevantDxTestsSectionResultOrganizer(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Result Organizer</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionResultOrganizer(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(phcr::ResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrRelevantDxTestsSectionResultOrganizer(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrRelevantDxTestsSectionResultOrganizer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantDxTestsSection, context) }),
             new Object [] { phcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrRelevantDxTestsSectionResultObservation(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionResultObservation(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::ResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrRelevantDxTestsSectionResultObservation(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionResultObservation(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::ResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrRelevantDxTestsSectionResultObservation(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrRelevantDxTestsSectionResultObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantDxTestsSection, context) }),
             new Object [] { phcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrRelevantDxTestsSectionImagingObservation(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Imaging Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionImagingObservation(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::ImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrRelevantDxTestsSectionImagingObservation(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Imaging Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrRelevantDxTestsSectionImagingObservation(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::ImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrRelevantDxTestsSectionImagingObservation(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrRelevantDxTestsSectionImagingObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantDxTestsSection, context) }),
             new Object [] { phcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getPHCRResultOrganizers(PhcrRelevantDxTestsSection) <em>Get PHCR Result Organizers</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPHCRResultOrganizers(PhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_PHCR_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(phcr::ResultOrganizer)).oclAsType(phcr::ResultOrganizer)";

	/**
   * The cached OCL query for the '{@link #getPHCRResultOrganizers(PhcrRelevantDxTestsSection) <em>Get PHCR Result Organizers</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPHCRResultOrganizers(PhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PHCR_RESULT_ORGANIZERS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(phcr::ResultOrganizer)).oclAsType(phcr::ResultOrganizer)
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  EList<ResultOrganizer> getPHCRResultOrganizers(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection) {
    if (GET_PHCR_RESULT_ORGANIZERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION, PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(68));
      try
      {
        GET_PHCR_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_PHCR_RESULT_ORGANIZERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PHCR_RESULT_ORGANIZERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ResultOrganizer> result = (Collection<ResultOrganizer>) query.evaluate(phcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<ResultOrganizer>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getResultObservations(PhcrRelevantDxTestsSection) <em>Get Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultObservations(PhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::ResultObservation)).oclAsType(phcr::ResultObservation)";

	/**
   * The cached OCL query for the '{@link #getResultObservations(PhcrRelevantDxTestsSection) <em>Get Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultObservations(PhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::ResultObservation)).oclAsType(phcr::ResultObservation)
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  EList<ResultObservation> getResultObservations(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection) {
    if (GET_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION, PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(69));
      try
      {
        GET_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_RESULT_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ResultObservation> result = (Collection<ResultObservation>) query.evaluate(phcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<ResultObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getImagingObservations(PhcrRelevantDxTestsSection) <em>Get Imaging Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImagingObservations(PhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_IMAGING_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::ImagingObservation)).oclAsType(phcr::ImagingObservation)";

	/**
   * The cached OCL query for the '{@link #getImagingObservations(PhcrRelevantDxTestsSection) <em>Get Imaging Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImagingObservations(PhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_IMAGING_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::ImagingObservation)).oclAsType(phcr::ImagingObservation)
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  EList<ImagingObservation> getImagingObservations(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection) {
    if (GET_IMAGING_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION, PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(70));
      try
      {
        GET_IMAGING_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_IMAGING_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_IMAGING_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ImagingObservation> result = (Collection<ImagingObservation>) query.evaluate(phcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<ImagingObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.3')";

	/**
   * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(PhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.3')
   * @param phcrRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateResultsSectionTemplateId(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantDxTestsSection, context) }),
             new Object [] { phcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

} // PhcrRelevantDxTestsSectionOperations