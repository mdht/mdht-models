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

import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Last Menstrual Period Date</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LastMenstrualPeriodDateOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected LastMenstrualPeriodDateOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodDateTemplateId(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateTemplateId(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.33')";

	/**
   * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodDateTemplateId(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateTemplateId(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param lastMenstrualPeriodDate The receiving '<em><b>Last Menstrual Period Date</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLastMenstrualPeriodDateTemplateId(LastMenstrualPeriodDate lastMenstrualPeriodDate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LAST_MENSTRUAL_PERIOD_DATE);
      try
      {
        VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(lastMenstrualPeriodDate))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LastMenstrualPeriodDateTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lastMenstrualPeriodDate, context) }),
             new Object [] { lastMenstrualPeriodDate }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodDateClassCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateClassCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
   * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodDateClassCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateClassCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param lastMenstrualPeriodDate The receiving '<em><b>Last Menstrual Period Date</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLastMenstrualPeriodDateClassCode(LastMenstrualPeriodDate lastMenstrualPeriodDate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LAST_MENSTRUAL_PERIOD_DATE);
      try
      {
        VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(lastMenstrualPeriodDate))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LastMenstrualPeriodDateClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lastMenstrualPeriodDate, context) }),
             new Object [] { lastMenstrualPeriodDate }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodDateMoodCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateMoodCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodDateMoodCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateMoodCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param lastMenstrualPeriodDate The receiving '<em><b>Last Menstrual Period Date</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLastMenstrualPeriodDateMoodCode(LastMenstrualPeriodDate lastMenstrualPeriodDate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LAST_MENSTRUAL_PERIOD_DATE);
      try
      {
        VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(lastMenstrualPeriodDate))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LastMenstrualPeriodDateMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lastMenstrualPeriodDate, context) }),
             new Object [] { lastMenstrualPeriodDate }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodDateCodeP(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateCodeP(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodDateCodeP(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateCodeP(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param lastMenstrualPeriodDate The receiving '<em><b>Last Menstrual Period Date</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLastMenstrualPeriodDateCodeP(LastMenstrualPeriodDate lastMenstrualPeriodDate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LAST_MENSTRUAL_PERIOD_DATE);
      try
      {
        VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(lastMenstrualPeriodDate))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LastMenstrualPeriodDateCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lastMenstrualPeriodDate, context) }),
             new Object [] { lastMenstrualPeriodDate }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodDateCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '8665-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodDateCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateCode(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param lastMenstrualPeriodDate The receiving '<em><b>Last Menstrual Period Date</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLastMenstrualPeriodDateCode(LastMenstrualPeriodDate lastMenstrualPeriodDate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LAST_MENSTRUAL_PERIOD_DATE);
      try
      {
        VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(lastMenstrualPeriodDate))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LastMenstrualPeriodDateCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lastMenstrualPeriodDate, context) }),
             new Object [] { lastMenstrualPeriodDate }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLastMenstrualPeriodDateValue(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateValue(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
   * The cached OCL invariant for the '{@link #validateLastMenstrualPeriodDateValue(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLastMenstrualPeriodDateValue(LastMenstrualPeriodDate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param lastMenstrualPeriodDate The receiving '<em><b>Last Menstrual Period Date</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLastMenstrualPeriodDateValue(LastMenstrualPeriodDate lastMenstrualPeriodDate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LAST_MENSTRUAL_PERIOD_DATE);
      try
      {
        VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(lastMenstrualPeriodDate))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LAST_MENSTRUAL_PERIOD_DATE__LAST_MENSTRUAL_PERIOD_DATE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LastMenstrualPeriodDateValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(lastMenstrualPeriodDate, context) }),
             new Object [] { lastMenstrualPeriodDate }));
      }
       
      return false;
    }
    return true;
  }

} // LastMenstrualPeriodDateOperations
