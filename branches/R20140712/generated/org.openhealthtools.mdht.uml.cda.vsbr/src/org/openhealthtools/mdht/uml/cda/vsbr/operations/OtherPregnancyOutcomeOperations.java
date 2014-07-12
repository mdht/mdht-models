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

import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Other Pregnancy Outcome</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherPregnancyOutcomeOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected OtherPregnancyOutcomeOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomeTemplateId(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeTemplateId(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.40')";

	/**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomeTemplateId(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeTemplateId(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param otherPregnancyOutcome The receiving '<em><b>Other Pregnancy Outcome</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateOtherPregnancyOutcomeTemplateId(OtherPregnancyOutcome otherPregnancyOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOME);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcome))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomeTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcome, context) }),
             new Object [] { otherPregnancyOutcome }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomeClassCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeClassCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomeClassCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeClassCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param otherPregnancyOutcome The receiving '<em><b>Other Pregnancy Outcome</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateOtherPregnancyOutcomeClassCode(OtherPregnancyOutcome otherPregnancyOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOME);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcome))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcome, context) }),
             new Object [] { otherPregnancyOutcome }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomeMoodCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeMoodCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomeMoodCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeMoodCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param otherPregnancyOutcome The receiving '<em><b>Other Pregnancy Outcome</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateOtherPregnancyOutcomeMoodCode(OtherPregnancyOutcome otherPregnancyOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOME);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcome))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcome, context) }),
             new Object [] { otherPregnancyOutcome }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomeCodeP(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeCodeP(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomeCodeP(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeCodeP(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param otherPregnancyOutcome The receiving '<em><b>Other Pregnancy Outcome</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateOtherPregnancyOutcomeCodeP(OtherPregnancyOutcome otherPregnancyOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOME);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcome))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcome, context) }),
             new Object [] { otherPregnancyOutcome }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomeCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69043-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomeCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeCode(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param otherPregnancyOutcome The receiving '<em><b>Other Pregnancy Outcome</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateOtherPregnancyOutcomeCode(OtherPregnancyOutcome otherPregnancyOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOME);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcome))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcome, context) }),
             new Object [] { otherPregnancyOutcome }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param otherPregnancyOutcome The receiving '<em><b>Other Pregnancy Outcome</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateOtherPregnancyOutcomeValue(OtherPregnancyOutcome otherPregnancyOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOME);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcome))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcome, context) }),
             new Object [] { otherPregnancyOutcome }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomeEffectiveTime(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeEffectiveTime(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomeEffectiveTime(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeEffectiveTime(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomeValue(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeValue(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

  /**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomeValue(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomeValue(OtherPregnancyOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param otherPregnancyOutcome The receiving '<em><b>Other Pregnancy Outcome</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateOtherPregnancyOutcomeEffectiveTime(OtherPregnancyOutcome otherPregnancyOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOME);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcome))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOME__OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomeEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcome, context) }),
             new Object [] { otherPregnancyOutcome }));
      }
       
      return false;
    }
    return true;
  }

} // OtherPregnancyOutcomeOperations
