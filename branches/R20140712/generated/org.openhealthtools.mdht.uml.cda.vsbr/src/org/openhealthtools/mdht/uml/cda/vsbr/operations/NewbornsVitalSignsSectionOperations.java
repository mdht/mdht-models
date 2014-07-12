/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Newborns Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Newborns Vital Signs Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#getNewbornsVitalSignsObservation() <em>Get Newborns Vital Signs Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewbornsVitalSignsSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NewbornsVitalSignsSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsSectionTemplateId(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionTemplateId(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.11')";

	/**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsSectionTemplateId(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionTemplateId(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsSection The receiving '<em><b>Newborns Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateNewbornsVitalSignsSectionTemplateId(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsSection, context) }),
             new Object [] { newbornsVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsSectionClassCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionClassCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

	/**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsSectionClassCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionClassCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsSection The receiving '<em><b>Newborns Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateNewbornsVitalSignsSectionClassCode(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsSection, context) }),
             new Object [] { newbornsVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsSectionMoodCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionMoodCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsSectionMoodCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionMoodCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsSection The receiving '<em><b>Newborns Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateNewbornsVitalSignsSectionMoodCode(
			NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsSection, context) }),
             new Object [] { newbornsVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsSectionCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsSectionCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionCode(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsSection The receiving '<em><b>Newborns Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateNewbornsVitalSignsSectionCode(NewbornsVitalSignsSection newbornsVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsSection, context) }),
             new Object [] { newbornsVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsSectionCodeP(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionCodeP(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsSectionCodeP(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionCodeP(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsSection The receiving '<em><b>Newborns Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateNewbornsVitalSignsSectionCodeP(NewbornsVitalSignsSection newbornsVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsSectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsSection, context) }),
             new Object [] { newbornsVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsSectionText(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionText(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsSectionText(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionText(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsSection The receiving '<em><b>Newborns Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateNewbornsVitalSignsSectionText(NewbornsVitalSignsSection newbornsVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsSection, context) }),
             new Object [] { newbornsVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Newborns Vital Signs Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Newborns Vital Signs Observation))";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Newborns Vital Signs Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(NewbornsVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsSection The receiving '<em><b>Newborns Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(NewbornsVitalSignsSection newbornsVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_SECTION__NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsSectionNewbornsVitalSignsObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsSection, context) }),
             new Object [] { newbornsVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNewbornsVitalSignsObservation(NewbornsVitalSignsSection) <em>Get Newborns Vital Signs Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewbornsVitalSignsObservation(NewbornsVitalSignsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_NEWBORNS_VITAL_SIGNS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Newborns Vital Signs Observation))->asSequence()->any(true).oclAsType(vsbr::Newborns Vital Signs Observation)";

  /**
   * The cached OCL query for the '{@link #getNewbornsVitalSignsObservation(NewbornsVitalSignsSection) <em>Get Newborns Vital Signs Observation</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewbornsVitalSignsObservation(NewbornsVitalSignsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NEWBORNS_VITAL_SIGNS_OBSERVATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NewbornsVitalSignsObservation getNewbornsVitalSignsObservation(NewbornsVitalSignsSection newbornsVitalSignsSection)
  {
    if (GET_NEWBORNS_VITAL_SIGNS_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION, VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION.getEAllOperations().get(62));
      try
      {
        GET_NEWBORNS_VITAL_SIGNS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_NEWBORNS_VITAL_SIGNS_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NEWBORNS_VITAL_SIGNS_OBSERVATION__EOCL_QRY);
    return (NewbornsVitalSignsObservation) query.evaluate(newbornsVitalSignsSection);
  }

} // NewbornsVitalSignsSectionOperations
