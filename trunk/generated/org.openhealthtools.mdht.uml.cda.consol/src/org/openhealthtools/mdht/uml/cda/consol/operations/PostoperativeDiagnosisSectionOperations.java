/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postoperative Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostoperativeDiagnosisSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PostoperativeDiagnosisSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePostoperativeDiagnosisSectionTemplateId(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePostoperativeDiagnosisSectionTemplateId(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.35')";

	/**
   * The cached OCL invariant for the '{@link #validatePostoperativeDiagnosisSectionTemplateId(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePostoperativeDiagnosisSectionTemplateId(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.35')
   * @param postoperativeDiagnosisSection The receiving '<em><b>Postoperative Diagnosis Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validatePostoperativeDiagnosisSectionTemplateId(
			PostoperativeDiagnosisSection postoperativeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.POSTOPERATIVE_DIAGNOSIS_SECTION);
      try
      {
        VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postoperativeDiagnosisSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.POSTOPERATIVE_DIAGNOSIS_SECTION__POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID,
             ConsolPlugin.INSTANCE.getString("PostoperativeDiagnosisSectionTemplateId"),
             new Object [] { postoperativeDiagnosisSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePostoperativeDiagnosisSectionCode(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePostoperativeDiagnosisSectionCode(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '10218-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validatePostoperativeDiagnosisSectionCode(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePostoperativeDiagnosisSectionCode(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '10218-6' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param postoperativeDiagnosisSection The receiving '<em><b>Postoperative Diagnosis Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validatePostoperativeDiagnosisSectionCode(
			PostoperativeDiagnosisSection postoperativeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.POSTOPERATIVE_DIAGNOSIS_SECTION);
      try
      {
        VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postoperativeDiagnosisSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.POSTOPERATIVE_DIAGNOSIS_SECTION__POSTOPERATIVE_DIAGNOSIS_SECTION_CODE,
             ConsolPlugin.INSTANCE.getString("PostoperativeDiagnosisSectionCode"),
             new Object [] { postoperativeDiagnosisSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePostoperativeDiagnosisSectionText(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePostoperativeDiagnosisSectionText(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validatePostoperativeDiagnosisSectionText(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePostoperativeDiagnosisSectionText(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param postoperativeDiagnosisSection The receiving '<em><b>Postoperative Diagnosis Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validatePostoperativeDiagnosisSectionText(
			PostoperativeDiagnosisSection postoperativeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.POSTOPERATIVE_DIAGNOSIS_SECTION);
      try
      {
        VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postoperativeDiagnosisSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.POSTOPERATIVE_DIAGNOSIS_SECTION__POSTOPERATIVE_DIAGNOSIS_SECTION_TEXT,
             ConsolPlugin.INSTANCE.getString("PostoperativeDiagnosisSectionText"),
             new Object [] { postoperativeDiagnosisSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePostoperativeDiagnosisSectionTitle(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePostoperativeDiagnosisSectionTitle(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validatePostoperativeDiagnosisSectionTitle(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePostoperativeDiagnosisSectionTitle(PostoperativeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param postoperativeDiagnosisSection The receiving '<em><b>Postoperative Diagnosis Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validatePostoperativeDiagnosisSectionTitle(
			PostoperativeDiagnosisSection postoperativeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.POSTOPERATIVE_DIAGNOSIS_SECTION);
      try
      {
        VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postoperativeDiagnosisSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.POSTOPERATIVE_DIAGNOSIS_SECTION__POSTOPERATIVE_DIAGNOSIS_SECTION_TITLE,
             ConsolPlugin.INSTANCE.getString("PostoperativeDiagnosisSectionTitle"),
             new Object [] { postoperativeDiagnosisSection }));
      }
       
      return false;
    }
    return true;
  }

} // PostoperativeDiagnosisSectionOperations
