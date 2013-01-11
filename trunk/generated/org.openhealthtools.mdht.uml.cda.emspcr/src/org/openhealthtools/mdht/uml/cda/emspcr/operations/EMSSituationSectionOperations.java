/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Situation Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getEntry1() <em>Get Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getEntry3() <em>Get Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getEntry4() <em>Get Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getEntry5() <em>Get Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getEntry6() <em>Get Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getEntry7() <em>Get Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getEntry8() <em>Get Entry8</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSSituationSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EMSSituationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionTemplateId(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionTemplateId(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.9')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionTemplateId(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionTemplateId(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.9')
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionTemplateId(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionTemplateId"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionCode(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionCode(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67666-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionCode(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionCode(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67666-8' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionCode(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionCode"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionCodeP(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionCodeP(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionCodeP(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionCodeP(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionCodeP(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionCodeP"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionText(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionText"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionTitle(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionTitle(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Situation Section')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionTitle(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionTitle(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionText(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionText(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionText(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionText(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Situation Section')
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionTitle(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionTitle"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionEntry1(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry1</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry1(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSComplaintEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionEntry1(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry1(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSComplaintEntry))
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionEntry1(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionEntry1"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionEntry3(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry3</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry3(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPossibleInjuryEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionEntry3(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry3</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry3(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPossibleInjuryEntry))
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionEntry3(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY3,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionEntry3"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionEntry4(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry4</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry4(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPrimarySymptomEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionEntry4(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry4</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry4(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPrimarySymptomEntry))
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionEntry4(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY4,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionEntry4"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionEntry5(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry5</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry5(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSOtherSymptomEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionEntry5(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry5</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry5(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSOtherSymptomEntry))
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionEntry5(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY5,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionEntry5"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionEntry6(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry6</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry6(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionEntry6(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry6</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry6(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry))
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionEntry6(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY6,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionEntry6"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionEntry7(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry7</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry7(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionEntry7(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry7</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry7(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry))
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionEntry7(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY7,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionEntry7"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSituationSectionEntry8(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry8</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry8(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPatientAcuityEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSituationSectionEntry8(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry8</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSituationSectionEntry8(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPatientAcuityEntry))
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSituationSectionEntry8(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SITUATION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
      try
      {
        VALIDATE_EMS_SITUATION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSituationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY8,
             EmspcrPlugin.INSTANCE.getString("EMSSituationSectionEntry8"),
             new Object [] { emsSituationSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry1(EMSSituationSection) <em>Get Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY1__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSComplaintEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSComplaintEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry1(EMSSituationSection) <em>Get Entry1</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY1__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSComplaintEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSComplaintEntry)
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry1(EMSSituationSection emsSituationSection)
  {
    if (GET_ENTRY1__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION, EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(67));
      try
      {
        GET_ENTRY1__EOCL_QRY = helper.createQuery(GET_ENTRY1__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY1__EOCL_QRY);
    return (void) query.evaluate(emsSituationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry3(EMSSituationSection) <em>Get Entry3</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry3(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY3__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPossibleInjuryEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPossibleInjuryEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry3(EMSSituationSection) <em>Get Entry3</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry3(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY3__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPossibleInjuryEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPossibleInjuryEntry)
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry3(EMSSituationSection emsSituationSection)
  {
    if (GET_ENTRY3__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION, EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(68));
      try
      {
        GET_ENTRY3__EOCL_QRY = helper.createQuery(GET_ENTRY3__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY3__EOCL_QRY);
    return (void) query.evaluate(emsSituationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry4(EMSSituationSection) <em>Get Entry4</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry4(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY4__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPrimarySymptomEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPrimarySymptomEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry4(EMSSituationSection) <em>Get Entry4</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry4(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY4__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPrimarySymptomEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPrimarySymptomEntry)
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry4(EMSSituationSection emsSituationSection)
  {
    if (GET_ENTRY4__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION, EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(69));
      try
      {
        GET_ENTRY4__EOCL_QRY = helper.createQuery(GET_ENTRY4__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY4__EOCL_QRY);
    return (void) query.evaluate(emsSituationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry5(EMSSituationSection) <em>Get Entry5</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry5(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY5__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSOtherSymptomEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSOtherSymptomEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry5(EMSSituationSection) <em>Get Entry5</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry5(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY5__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSOtherSymptomEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSOtherSymptomEntry)
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry5(EMSSituationSection emsSituationSection)
  {
    if (GET_ENTRY5__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION, EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(70));
      try
      {
        GET_ENTRY5__EOCL_QRY = helper.createQuery(GET_ENTRY5__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY5__EOCL_QRY);
    return (void) query.evaluate(emsSituationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry6(EMSSituationSection) <em>Get Entry6</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry6(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY6__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry6(EMSSituationSection) <em>Get Entry6</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry6(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY6__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry)
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry6(EMSSituationSection emsSituationSection)
  {
    if (GET_ENTRY6__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION, EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(71));
      try
      {
        GET_ENTRY6__EOCL_QRY = helper.createQuery(GET_ENTRY6__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY6__EOCL_QRY);
    return (void) query.evaluate(emsSituationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry7(EMSSituationSection) <em>Get Entry7</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry7(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY7__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry7(EMSSituationSection) <em>Get Entry7</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry7(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY7__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry)
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry7(EMSSituationSection emsSituationSection)
  {
    if (GET_ENTRY7__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION, EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(72));
      try
      {
        GET_ENTRY7__EOCL_QRY = helper.createQuery(GET_ENTRY7__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY7__EOCL_QRY);
    return (void) query.evaluate(emsSituationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry8(EMSSituationSection) <em>Get Entry8</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry8(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY8__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPatientAcuityEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPatientAcuityEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry8(EMSSituationSection) <em>Get Entry8</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry8(EMSSituationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY8__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPatientAcuityEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPatientAcuityEntry)
   * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry8(EMSSituationSection emsSituationSection)
  {
    if (GET_ENTRY8__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION, EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(73));
      try
      {
        GET_ENTRY8__EOCL_QRY = helper.createQuery(GET_ENTRY8__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY8__EOCL_QRY);
    return (void) query.evaluate(emsSituationSection);
  }

} // EMSSituationSectionOperations
