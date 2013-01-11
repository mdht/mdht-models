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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#getEntry1() <em>Get Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#getEntry2() <em>Get Entry2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSAllergiesAndAdverseReactionsSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EMSAllergiesAndAdverseReactionsSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.13')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.13')
   * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionTemplateId(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
      try
      {
        VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAllergiesAndAdverseReactionsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionTemplateId"),
             new Object [] { emsAllergiesAndAdverseReactionsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67841-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67841-7' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionCode(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
      try
      {
        VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAllergiesAndAdverseReactionsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionCode"),
             new Object [] { emsAllergiesAndAdverseReactionsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Allergies and Adverse Reactions')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Allergies and Adverse Reactions')
   * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionTitle(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
      try
      {
        VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAllergiesAndAdverseReactionsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionTitle"),
             new Object [] { emsAllergiesAndAdverseReactionsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionText(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionText(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionText(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionText(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionText(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
      try
      {
        VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAllergiesAndAdverseReactionsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionText"),
             new Object [] { emsAllergiesAndAdverseReactionsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionEntry1(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Entry1</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionEntry1(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionEntry1(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionEntry1(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry))
   * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionEntry1(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
      try
      {
        VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAllergiesAndAdverseReactionsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionEntry1"),
             new Object [] { emsAllergiesAndAdverseReactionsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionEntry2(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Entry2</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionEntry2(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionEntry2(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Entry2</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSAllergiesAndAdverseReactionsSectionEntry2(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry))
   * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionEntry2(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
      try
      {
        VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAllergiesAndAdverseReactionsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY2,
             EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionEntry2"),
             new Object [] { emsAllergiesAndAdverseReactionsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry1(EMSAllergiesAndAdverseReactionsSection) <em>Get Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(EMSAllergiesAndAdverseReactionsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY1__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry))->asSequence()->first().oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry1(EMSAllergiesAndAdverseReactionsSection) <em>Get Entry1</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(EMSAllergiesAndAdverseReactionsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY1__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry))->asSequence()->first().oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry)
   * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry1(EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection)
  {
    if (GET_ENTRY1__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION, EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION.getEAllOperations().get(61));
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
    return (void) query.evaluate(emsAllergiesAndAdverseReactionsSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry2(EMSAllergiesAndAdverseReactionsSection) <em>Get Entry2</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry2(EMSAllergiesAndAdverseReactionsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY2__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry))->asSequence()->first().oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry2(EMSAllergiesAndAdverseReactionsSection) <em>Get Entry2</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry2(EMSAllergiesAndAdverseReactionsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY2__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry))->asSequence()->first().oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry)
   * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry2(EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection)
  {
    if (GET_ENTRY2__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION, EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION.getEAllOperations().get(62));
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
    return (void) query.evaluate(emsAllergiesAndAdverseReactionsSection);
  }

} // EMSAllergiesAndAdverseReactionsSectionOperations
