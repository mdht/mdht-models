/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactions;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Allergies And Adverse Reactions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactions#validateEMSAllergiesAndAdverseReactionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSAllergiesAndAdverseReactionsOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSAllergiesAndAdverseReactionsOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsTemplateId(EMSAllergiesAndAdverseReactions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsTemplateId(EMSAllergiesAndAdverseReactions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.13')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsTemplateId(EMSAllergiesAndAdverseReactions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsTemplateId(EMSAllergiesAndAdverseReactions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.13')
   * @param emsAllergiesAndAdverseReactions The receiving '<em><b>EMS Allergies And Adverse Reactions</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSAllergiesAndAdverseReactionsTemplateId(EMSAllergiesAndAdverseReactions emsAllergiesAndAdverseReactions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS);
      try
      {
        VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAllergiesAndAdverseReactions))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsTemplateId"),
             new Object [] { emsAllergiesAndAdverseReactions }));
      }
      return false;
    }
    return true;
  }

} // EMSAllergiesAndAdverseReactionsOperations