/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infection Present</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfectionPresentOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InfectionPresentOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateInfectionPresentTemplateId(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentTemplateId(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_INFECTION_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.30')";

	/**
   * The cached OCL invariant for the '{@link #validateInfectionPresentTemplateId(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentTemplateId(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_INFECTION_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param infectionPresent The receiving '<em><b>Infection Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateInfectionPresentTemplateId(InfectionPresent infectionPresent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_INFECTION_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT);
      try
      {
        VALIDATE_INFECTION_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infectionPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.INFECTION_PRESENT__INFECTION_PRESENT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InfectionPresentTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infectionPresent, context) }),
             new Object [] { infectionPresent }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateInfectionPresentClassCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentClassCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_INFECTION_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
   * The cached OCL invariant for the '{@link #validateInfectionPresentClassCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentClassCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_INFECTION_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param infectionPresent The receiving '<em><b>Infection Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateInfectionPresentClassCode(InfectionPresent infectionPresent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_INFECTION_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT);
      try
      {
        VALIDATE_INFECTION_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infectionPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.INFECTION_PRESENT__INFECTION_PRESENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InfectionPresentClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infectionPresent, context) }),
             new Object [] { infectionPresent }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateInfectionPresentMoodCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentMoodCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_INFECTION_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateInfectionPresentMoodCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentMoodCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_INFECTION_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param infectionPresent The receiving '<em><b>Infection Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateInfectionPresentMoodCode(InfectionPresent infectionPresent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_INFECTION_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT);
      try
      {
        VALIDATE_INFECTION_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infectionPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.INFECTION_PRESENT__INFECTION_PRESENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InfectionPresentMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infectionPresent, context) }),
             new Object [] { infectionPresent }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateInfectionPresentCodeP(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentCodeP(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_INFECTION_PRESENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateInfectionPresentCodeP(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentCodeP(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_INFECTION_PRESENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param infectionPresent The receiving '<em><b>Infection Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateInfectionPresentCodeP(InfectionPresent infectionPresent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_INFECTION_PRESENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT);
      try
      {
        VALIDATE_INFECTION_PRESENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infectionPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.INFECTION_PRESENT__INFECTION_PRESENT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InfectionPresentCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infectionPresent, context) }),
             new Object [] { infectionPresent }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateInfectionPresentCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_INFECTION_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateInfectionPresentCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentCode(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_INFECTION_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param infectionPresent The receiving '<em><b>Infection Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateInfectionPresentCode(InfectionPresent infectionPresent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_INFECTION_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT);
      try
      {
        VALIDATE_INFECTION_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infectionPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.INFECTION_PRESENT__INFECTION_PRESENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InfectionPresentCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infectionPresent, context) }),
             new Object [] { infectionPresent }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateInfectionPresentValue(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentValue(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_INFECTION_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
   * The cached OCL invariant for the '{@link #validateInfectionPresentValue(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateInfectionPresentValue(InfectionPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_INFECTION_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param infectionPresent The receiving '<em><b>Infection Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateInfectionPresentValue(InfectionPresent infectionPresent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_INFECTION_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.INFECTION_PRESENT);
      try
      {
        VALIDATE_INFECTION_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFECTION_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INFECTION_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infectionPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.INFECTION_PRESENT__INFECTION_PRESENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InfectionPresentValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infectionPresent, context) }),
             new Object [] { infectionPresent }));
      }
       
      return false;
    }
    return true;
  }

} // InfectionPresentOperations
