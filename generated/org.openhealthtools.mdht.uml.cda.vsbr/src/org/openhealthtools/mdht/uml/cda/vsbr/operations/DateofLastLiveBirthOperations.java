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

import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dateof Last Live Birth</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateofLastLiveBirthOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DateofLastLiveBirthOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateDateofLastLiveBirthTemplateId(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthTemplateId(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.20')";

	/**
   * The cached OCL invariant for the '{@link #validateDateofLastLiveBirthTemplateId(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthTemplateId(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param dateofLastLiveBirth The receiving '<em><b>Dateof Last Live Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateDateofLastLiveBirthTemplateId(DateofLastLiveBirth dateofLastLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.DATEOF_LAST_LIVE_BIRTH);
      try
      {
        VALIDATE_DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateofLastLiveBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateofLastLiveBirthTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateofLastLiveBirth, context) }),
             new Object [] { dateofLastLiveBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDateofLastLiveBirthMoodCode(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthMoodCode(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DATEOF_LAST_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateDateofLastLiveBirthMoodCode(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthMoodCode(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_DATEOF_LAST_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param dateofLastLiveBirth The receiving '<em><b>Dateof Last Live Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateDateofLastLiveBirthMoodCode(DateofLastLiveBirth dateofLastLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DATEOF_LAST_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.DATEOF_LAST_LIVE_BIRTH);
      try
      {
        VALIDATE_DATEOF_LAST_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEOF_LAST_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DATEOF_LAST_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateofLastLiveBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateofLastLiveBirthMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateofLastLiveBirth, context) }),
             new Object [] { dateofLastLiveBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDateofLastLiveBirthCodeP(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthCodeP(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateDateofLastLiveBirthCodeP(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthCodeP(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param dateofLastLiveBirth The receiving '<em><b>Dateof Last Live Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateDateofLastLiveBirthCodeP(DateofLastLiveBirth dateofLastLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.DATEOF_LAST_LIVE_BIRTH);
      try
      {
        VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateofLastLiveBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateofLastLiveBirthCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateofLastLiveBirth, context) }),
             new Object [] { dateofLastLiveBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDateofLastLiveBirthCode(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthCode(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '68499-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateDateofLastLiveBirthCode(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthCode(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param dateofLastLiveBirth The receiving '<em><b>Dateof Last Live Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateDateofLastLiveBirthCode(DateofLastLiveBirth dateofLastLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.DATEOF_LAST_LIVE_BIRTH);
      try
      {
        VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateofLastLiveBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateofLastLiveBirthCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateofLastLiveBirth, context) }),
             new Object [] { dateofLastLiveBirth }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDateofLastLiveBirthValue(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthValue(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DATEOF_LAST_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
   * The cached OCL invariant for the '{@link #validateDateofLastLiveBirthValue(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDateofLastLiveBirthValue(DateofLastLiveBirth, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_DATEOF_LAST_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param dateofLastLiveBirth The receiving '<em><b>Dateof Last Live Birth</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateDateofLastLiveBirthValue(DateofLastLiveBirth dateofLastLiveBirth,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DATEOF_LAST_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.DATEOF_LAST_LIVE_BIRTH);
      try
      {
        VALIDATE_DATEOF_LAST_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEOF_LAST_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DATEOF_LAST_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateofLastLiveBirth))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.DATEOF_LAST_LIVE_BIRTH__DATEOF_LAST_LIVE_BIRTH_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateofLastLiveBirthValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateofLastLiveBirth, context) }),
             new Object [] { dateofLastLiveBirth }));
      }
       
      return false;
    }
    return true;
  }

} // DateofLastLiveBirthOperations
