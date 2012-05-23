/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Palpable Mass</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PalpableMassOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PalpableMassOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassTemplateId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassTemplateId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.51')";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassTemplateId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassTemplateId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.51')
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassTemplateId(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
      return false;
    }
    return true;
  }

} // PalpableMassOperations