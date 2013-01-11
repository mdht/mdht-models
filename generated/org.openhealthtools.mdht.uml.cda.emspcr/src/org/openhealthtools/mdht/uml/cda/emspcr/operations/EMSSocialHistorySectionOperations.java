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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#getEntry1() <em>Get Entry1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSSocialHistorySectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EMSSocialHistorySectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.22')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.22')
   * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionTemplateId"),
             new Object [] { emsSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionCode(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionCode(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67843-3' and value.codeSystem = '2.16.840.1.113883.6.1'";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionCode(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionCode(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67843-3' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSocialHistorySectionCode(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionCode"),
             new Object [] { emsSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined()
   * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionCodeP"),
             new Object [] { emsSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionTitle(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionTitle(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Social History')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionTitle(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionTitle(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Social History')
   * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSocialHistorySectionTitle(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionTitle"),
             new Object [] { emsSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionText(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionText(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionText(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionText(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSocialHistorySectionText(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionText"),
             new Object [] { emsSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionEntry1(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Entry1</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionEntry1(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSocialHistorySection::EMSDrugUseEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionEntry1(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSSocialHistorySectionEntry1(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSocialHistorySection::EMSDrugUseEntry))
   * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSSocialHistorySectionEntry1(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionEntry1"),
             new Object [] { emsSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry1(EMSSocialHistorySection) <em>Get Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(EMSSocialHistorySection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY1__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSocialHistorySection::EMSDrugUseEntry))->asSequence()->first().oclAsType(emspcr::EMSSocialHistorySection::EMSDrugUseEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry1(EMSSocialHistorySection) <em>Get Entry1</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(EMSSocialHistorySection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY1__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSocialHistorySection::EMSDrugUseEntry))->asSequence()->first().oclAsType(emspcr::EMSSocialHistorySection::EMSDrugUseEntry)
   * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry1(EMSSocialHistorySection emsSocialHistorySection)
  {
    if (GET_ENTRY1__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION, EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION.getEAllOperations().get(61));
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
    return (void) query.evaluate(emsSocialHistorySection);
  }

} // EMSSocialHistorySectionOperations
