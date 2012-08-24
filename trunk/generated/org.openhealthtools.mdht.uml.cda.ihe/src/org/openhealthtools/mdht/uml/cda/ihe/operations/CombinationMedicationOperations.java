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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Combination Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication#validateCombinationMedicationSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Combination Medication Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication#validateCombinationMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Combination Medication Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinationMedicationOperations extends MedicationOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CombinationMedicationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateCombinationMedicationSubstanceAdministration(CombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Combination Medication Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCombinationMedicationSubstanceAdministration(CombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship.substanceAdministration->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateCombinationMedicationSubstanceAdministration(CombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Combination Medication Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCombinationMedicationSubstanceAdministration(CombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param combinationMedication The receiving '<em><b>Combination Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateCombinationMedicationSubstanceAdministration(
			CombinationMedication combinationMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.COMBINATION_MEDICATION);
      try
      {
        VALIDATE_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(combinationMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.COMBINATION_MEDICATION__COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CombinationMedicationSubstanceAdministration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(combinationMedication, context) }),
             new Object [] { combinationMedication }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCombinationMedicationTemplateId(CombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Combination Medication Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCombinationMedicationTemplateId(CombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COMBINATION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.11')";

	/**
   * The cached OCL invariant for the '{@link #validateCombinationMedicationTemplateId(CombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Combination Medication Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCombinationMedicationTemplateId(CombinationMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_COMBINATION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param combinationMedication The receiving '<em><b>Combination Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateCombinationMedicationTemplateId(CombinationMedication combinationMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COMBINATION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.COMBINATION_MEDICATION);
      try
      {
        VALIDATE_COMBINATION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMBINATION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COMBINATION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(combinationMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.COMBINATION_MEDICATION__COMBINATION_MEDICATION_TEMPLATE_ID,
             IHEPlugin.INSTANCE.getString("CombinationMedicationTemplateId"),
             new Object [] { combinationMedication }));
      }
       
      return false;
    }
    return true;
  }

} // CombinationMedicationOperations
