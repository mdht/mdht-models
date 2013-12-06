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

import org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Home Birth</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedHomeBirthOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PlannedHomeBirthOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlannedHomeBirthTemplateId(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthTemplateId(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLANNED_HOME_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.26')";

	/**
   * The cached OCL invariant for the '{@link #validatePlannedHomeBirthTemplateId(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthTemplateId(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PLANNED_HOME_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param plannedHomeBirth The receiving '<em><b>Planned Home Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePlannedHomeBirthTemplateId(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PLANNED_HOME_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLANNED_HOME_BIRTH);
      try
      {
        VALIDATE_PLANNED_HOME_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_HOME_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_HOME_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedHomeBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedHomeBirthTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedHomeBirth, context) }),
             new Object [] { plannedHomeBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlannedHomeBirthClassCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthClassCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLANNED_HOME_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
   * The cached OCL invariant for the '{@link #validatePlannedHomeBirthClassCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthClassCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PLANNED_HOME_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param plannedHomeBirth The receiving '<em><b>Planned Home Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePlannedHomeBirthClassCode(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PLANNED_HOME_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLANNED_HOME_BIRTH);
      try
      {
        VALIDATE_PLANNED_HOME_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_HOME_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_HOME_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedHomeBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedHomeBirthClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedHomeBirth, context) }),
             new Object [] { plannedHomeBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlannedHomeBirthMoodCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthMoodCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLANNED_HOME_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validatePlannedHomeBirthMoodCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthMoodCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PLANNED_HOME_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param plannedHomeBirth The receiving '<em><b>Planned Home Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePlannedHomeBirthMoodCode(PlannedHomeBirth plannedHomeBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PLANNED_HOME_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLANNED_HOME_BIRTH);
      try
      {
        VALIDATE_PLANNED_HOME_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_HOME_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_HOME_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedHomeBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedHomeBirthMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedHomeBirth, context) }),
             new Object [] { plannedHomeBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlannedHomeBirthCodeP(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthCodeP(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLANNED_HOME_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validatePlannedHomeBirthCodeP(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthCodeP(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PLANNED_HOME_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param plannedHomeBirth The receiving '<em><b>Planned Home Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePlannedHomeBirthCodeP(PlannedHomeBirth plannedHomeBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PLANNED_HOME_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLANNED_HOME_BIRTH);
      try
      {
        VALIDATE_PLANNED_HOME_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_HOME_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_HOME_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedHomeBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedHomeBirthCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedHomeBirth, context) }),
             new Object [] { plannedHomeBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlannedHomeBirthCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLANNED_HOME_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '73765-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validatePlannedHomeBirthCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthCode(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PLANNED_HOME_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param plannedHomeBirth The receiving '<em><b>Planned Home Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePlannedHomeBirthCode(PlannedHomeBirth plannedHomeBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PLANNED_HOME_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLANNED_HOME_BIRTH);
      try
      {
        VALIDATE_PLANNED_HOME_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_HOME_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_HOME_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedHomeBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedHomeBirthCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedHomeBirth, context) }),
             new Object [] { plannedHomeBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlannedHomeBirthValue(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthValue(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLANNED_HOME_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
   * The cached OCL invariant for the '{@link #validatePlannedHomeBirthValue(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlannedHomeBirthValue(PlannedHomeBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PLANNED_HOME_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param plannedHomeBirth The receiving '<em><b>Planned Home Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePlannedHomeBirthValue(PlannedHomeBirth plannedHomeBirth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PLANNED_HOME_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLANNED_HOME_BIRTH);
      try
      {
        VALIDATE_PLANNED_HOME_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_HOME_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_HOME_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedHomeBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLANNED_HOME_BIRTH__PLANNED_HOME_BIRTH_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedHomeBirthValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedHomeBirth, context) }),
             new Object [] { plannedHomeBirth }));
      }
       
      return false;
    }
    return true;
  }

} // PlannedHomeBirthOperations
