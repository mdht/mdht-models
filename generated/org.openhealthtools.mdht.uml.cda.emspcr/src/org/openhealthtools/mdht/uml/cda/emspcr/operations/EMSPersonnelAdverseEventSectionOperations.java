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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Personnel Adverse Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#getEntry1() <em>Get Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#getEntry2() <em>Get Entry2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPersonnelAdverseEventSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EMSPersonnelAdverseEventSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionTemplateId(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionTemplateId(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.6')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionTemplateId(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionTemplateId(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.6')
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSPersonnelAdverseEventSectionTemplateId(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEventSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionTemplateId"),
             new Object [] { emsPersonnelAdverseEventSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionCode(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionCode(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67658-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionCode(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionCode(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67658-5' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSPersonnelAdverseEventSectionCode(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEventSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionCode"),
             new Object [] { emsPersonnelAdverseEventSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionCodeP(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionCodeP(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionCodeP(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionCodeP(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSPersonnelAdverseEventSectionCodeP(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEventSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionCodeP"),
             new Object [] { emsPersonnelAdverseEventSection }));
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
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSPersonnelAdverseEventSectionText(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEventSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionText"),
             new Object [] { emsPersonnelAdverseEventSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionTitle(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionTitle(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Exposures or Injuries of EMS Personnel')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionTitle(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionTitle(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionText(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionText(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionText(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionText(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Exposures or Injuries of EMS Personnel')
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSPersonnelAdverseEventSectionTitle(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEventSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionTitle"),
             new Object [] { emsPersonnelAdverseEventSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionEntry1(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Entry1</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionEntry1(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection::EMSExposureOrInjuryEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionEntry1(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionEntry1(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection::EMSExposureOrInjuryEntry))
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSPersonnelAdverseEventSectionEntry1(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEventSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEntry1"),
             new Object [] { emsPersonnelAdverseEventSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionEntry2(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Entry2</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionEntry2(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection::AdverseEventTypeEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionEntry2(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Entry2</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventSectionEntry2(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection::AdverseEventTypeEntry))
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSPersonnelAdverseEventSectionEntry2(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEventSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ENTRY2,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEntry2"),
             new Object [] { emsPersonnelAdverseEventSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry1(EMSPersonnelAdverseEventSection) <em>Get Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(EMSPersonnelAdverseEventSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY1__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection::EMSExposureOrInjuryEntry))->asSequence()->first().oclAsType(emspcr::EMSPersonnelAdverseEventSection::EMSExposureOrInjuryEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry1(EMSPersonnelAdverseEventSection) <em>Get Entry1</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(EMSPersonnelAdverseEventSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY1__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection::EMSExposureOrInjuryEntry))->asSequence()->first().oclAsType(emspcr::EMSPersonnelAdverseEventSection::EMSExposureOrInjuryEntry)
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry1(EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection)
  {
    if (GET_ENTRY1__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION, EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION.getEAllOperations().get(62));
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
    return (void) query.evaluate(emsPersonnelAdverseEventSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry2(EMSPersonnelAdverseEventSection) <em>Get Entry2</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry2(EMSPersonnelAdverseEventSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY2__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection::AdverseEventTypeEntry))->asSequence()->first().oclAsType(emspcr::EMSPersonnelAdverseEventSection::AdverseEventTypeEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry2(EMSPersonnelAdverseEventSection) <em>Get Entry2</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry2(EMSPersonnelAdverseEventSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY2__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection::AdverseEventTypeEntry))->asSequence()->first().oclAsType(emspcr::EMSPersonnelAdverseEventSection::AdverseEventTypeEntry)
   * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry2(EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection)
  {
    if (GET_ENTRY2__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION, EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION.getEAllOperations().get(63));
      try
      {
        GET_ENTRY2__EOCL_QRY = helper.createQuery(GET_ENTRY2__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY2__EOCL_QRY);
    return (void) query.evaluate(emsPersonnelAdverseEventSection);
  }

} // EMSPersonnelAdverseEventSectionOperations
