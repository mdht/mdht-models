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

import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prenatal Care</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrenatalCareOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PrenatalCareOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePrenatalCareTemplateId(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareTemplateId(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRENATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.42')";

	/**
   * The cached OCL invariant for the '{@link #validatePrenatalCareTemplateId(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareTemplateId(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRENATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param prenatalCare The receiving '<em><b>Prenatal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePrenatalCareTemplateId(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRENATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRENATAL_CARE);
      try
      {
        VALIDATE_PRENATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRENATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prenatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRENATAL_CARE__PRENATAL_CARE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrenatalCareTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prenatalCare, context) }),
             new Object [] { prenatalCare }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePrenatalCareClassCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareClassCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRENATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
   * The cached OCL invariant for the '{@link #validatePrenatalCareClassCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareClassCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRENATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param prenatalCare The receiving '<em><b>Prenatal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePrenatalCareClassCode(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRENATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRENATAL_CARE);
      try
      {
        VALIDATE_PRENATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRENATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prenatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRENATAL_CARE__PRENATAL_CARE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrenatalCareClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prenatalCare, context) }),
             new Object [] { prenatalCare }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePrenatalCareMoodCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareMoodCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRENATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
   * The cached OCL invariant for the '{@link #validatePrenatalCareMoodCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareMoodCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRENATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param prenatalCare The receiving '<em><b>Prenatal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePrenatalCareMoodCode(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRENATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRENATAL_CARE);
      try
      {
        VALIDATE_PRENATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRENATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prenatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRENATAL_CARE__PRENATAL_CARE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrenatalCareMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prenatalCare, context) }),
             new Object [] { prenatalCare }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePrenatalCareNegationInd(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Negation Ind</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareNegationInd(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRENATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validatePrenatalCareNegationInd(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Negation Ind</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareNegationInd(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRENATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param prenatalCare The receiving '<em><b>Prenatal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePrenatalCareNegationInd(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRENATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRENATAL_CARE);
      try
      {
        VALIDATE_PRENATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRENATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prenatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRENATAL_CARE__PRENATAL_CARE_NEGATION_IND,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrenatalCareNegationInd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prenatalCare, context) }),
             new Object [] { prenatalCare }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePrenatalCareCodeP(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareCodeP(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRENATAL_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validatePrenatalCareCodeP(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareCodeP(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRENATAL_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param prenatalCare The receiving '<em><b>Prenatal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePrenatalCareCodeP(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRENATAL_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRENATAL_CARE);
      try
      {
        VALIDATE_PRENATAL_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRENATAL_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prenatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRENATAL_CARE__PRENATAL_CARE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrenatalCareCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prenatalCare, context) }),
             new Object [] { prenatalCare }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePrenatalCareCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRENATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '73776-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validatePrenatalCareCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareCode(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRENATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param prenatalCare The receiving '<em><b>Prenatal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePrenatalCareCode(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRENATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRENATAL_CARE);
      try
      {
        VALIDATE_PRENATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRENATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prenatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRENATAL_CARE__PRENATAL_CARE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrenatalCareCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prenatalCare, context) }),
             new Object [] { prenatalCare }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePrenatalCareEffectiveTime(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareEffectiveTime(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRENATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validatePrenatalCareEffectiveTime(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareEffectiveTime(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRENATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param prenatalCare The receiving '<em><b>Prenatal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePrenatalCareEffectiveTime(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRENATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRENATAL_CARE);
      try
      {
        VALIDATE_PRENATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRENATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prenatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRENATAL_CARE__PRENATAL_CARE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrenatalCareEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prenatalCare, context) }),
             new Object [] { prenatalCare }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePrenatalCareEntryRelationship(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareEntryRelationship(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRENATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
   * The cached OCL invariant for the '{@link #validatePrenatalCareEntryRelationship(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePrenatalCareEntryRelationship(PrenatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRENATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param prenatalCare The receiving '<em><b>Prenatal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePrenatalCareEntryRelationship(PrenatalCare prenatalCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRENATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRENATAL_CARE);
      try
      {
        VALIDATE_PRENATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRENATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prenatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRENATAL_CARE__PRENATAL_CARE_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrenatalCareEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prenatalCare, context) }),
             new Object [] { prenatalCare }));
      }
       
      return false;
    }
    return true;
  }

} // PrenatalCareOperations
