/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.EntityOperations;

import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.ScopingEntity;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scoping Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ScopingEntity#validateScopingEntityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ScopingEntity#validateScopingEntityDesc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopingEntityOperations extends EntityOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ScopingEntityOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateScopingEntityTemplateId(ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateScopingEntityTemplateId(ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SCOPING_ENTITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'null')";

	/**
   * The cached OCL invariant for the '{@link #validateScopingEntityTemplateId(ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateScopingEntityTemplateId(ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SCOPING_ENTITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param scopingEntity The receiving '<em><b>Scoping Entity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateScopingEntityTemplateId(ScopingEntity scopingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SCOPING_ENTITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.SCOPING_ENTITY);
      try
      {
        VALIDATE_SCOPING_ENTITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCOPING_ENTITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SCOPING_ENTITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scopingEntity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.SCOPING_ENTITY__SCOPING_ENTITY_TEMPLATE_ID,
             PhmrPlugin.INSTANCE.getString("ScopingEntityTemplateId"),
             new Object [] { scopingEntity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateScopingEntityDesc(ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Desc</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateScopingEntityDesc(ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SCOPING_ENTITY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.desc.oclIsUndefined() or self.desc.isNullFlavorUndefined()) implies (not self.desc.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateScopingEntityDesc(ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Desc</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateScopingEntityDesc(ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SCOPING_ENTITY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param scopingEntity The receiving '<em><b>Scoping Entity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateScopingEntityDesc(ScopingEntity scopingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SCOPING_ENTITY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.SCOPING_ENTITY);
      try
      {
        VALIDATE_SCOPING_ENTITY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCOPING_ENTITY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SCOPING_ENTITY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scopingEntity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.SCOPING_ENTITY__SCOPING_ENTITY_DESC,
             PhmrPlugin.INSTANCE.getString("ScopingEntityDesc"),
             new Object [] { scopingEntity }));
      }
       
      return false;
    }
    return true;
  }

} // ScopingEntityOperations