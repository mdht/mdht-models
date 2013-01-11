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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Injury Incident Description Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry9</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry10</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry11(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry11</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry12(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry12</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry3() <em>Get Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry4() <em>Get Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry5() <em>Get Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry6() <em>Get Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry7() <em>Get Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry8() <em>Get Entry8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry9() <em>Get Entry9</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry10() <em>Get Entry10</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry11() <em>Get Entry11</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getEntry12() <em>Get Entry12</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSInjuryIncidentDescriptionSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EMSInjuryIncidentDescriptionSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.17')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.17')
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionTemplateId(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionTemplateId"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '11374-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '11374-6' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionCode(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionCode"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
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
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionText(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionText"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionTitle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionTitle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Injury Incident Description Section')";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionTitle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionTitle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionText(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionText(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionText(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionText(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Injury Incident Description Section')
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionTitle(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionTitle"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry3(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry3</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry3(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry3(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry3</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry3(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry3(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry3"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry4(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry4</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry4(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry4(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry4</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry4(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry4(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry4"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry5(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry5</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry5(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry5(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry5</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry5(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry5(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry5"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry6(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry6</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry6(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry6(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry6</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry6(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry6(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry6"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry7(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry7</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry7(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry7(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry7</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry7(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry7(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry7"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry8(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry8</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry8(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry8(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry8</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry8(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry8(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry8"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry9(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry9</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry9(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry9(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry9</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry9(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry9(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry9"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry10(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry10</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry10(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry10(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry10</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry10(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry10(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry10"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry11(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry11</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry11(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry11(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry11</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry11(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry11(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry11"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry12(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry12</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry12(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry))";

	/**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionEntry12(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry12</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionSectionEntry12(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry))
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateEMSInjuryIncidentDescriptionSectionEntry12(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescriptionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEntry12"),
             new Object [] { emsInjuryIncidentDescriptionSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry3(EMSInjuryIncidentDescriptionSection) <em>Get Entry3</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry3(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY3__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry3(EMSInjuryIncidentDescriptionSection) <em>Get Entry3</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry3(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY3__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry3(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY3__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(69));
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
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry4(EMSInjuryIncidentDescriptionSection) <em>Get Entry4</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry4(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY4__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry4(EMSInjuryIncidentDescriptionSection) <em>Get Entry4</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry4(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY4__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry4(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY4__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(70));
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
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry5(EMSInjuryIncidentDescriptionSection) <em>Get Entry5</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry5(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY5__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry5(EMSInjuryIncidentDescriptionSection) <em>Get Entry5</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry5(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY5__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry5(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY5__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(71));
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
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry6(EMSInjuryIncidentDescriptionSection) <em>Get Entry6</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry6(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY6__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry6(EMSInjuryIncidentDescriptionSection) <em>Get Entry6</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry6(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY6__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry6(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY6__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(72));
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
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry7(EMSInjuryIncidentDescriptionSection) <em>Get Entry7</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry7(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY7__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry7(EMSInjuryIncidentDescriptionSection) <em>Get Entry7</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry7(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY7__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry7(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY7__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(73));
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
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry8(EMSInjuryIncidentDescriptionSection) <em>Get Entry8</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry8(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY8__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry8(EMSInjuryIncidentDescriptionSection) <em>Get Entry8</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry8(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY8__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry8(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY8__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(74));
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
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry9(EMSInjuryIncidentDescriptionSection) <em>Get Entry9</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry9(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY9__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry9(EMSInjuryIncidentDescriptionSection) <em>Get Entry9</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry9(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY9__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry9(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY9__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(75));
      try
      {
        GET_ENTRY9__EOCL_QRY = helper.createQuery(GET_ENTRY9__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY9__EOCL_QRY);
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry10(EMSInjuryIncidentDescriptionSection) <em>Get Entry10</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry10(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY10__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry10(EMSInjuryIncidentDescriptionSection) <em>Get Entry10</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry10(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY10__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry10(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY10__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(76));
      try
      {
        GET_ENTRY10__EOCL_QRY = helper.createQuery(GET_ENTRY10__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY10__EOCL_QRY);
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry11(EMSInjuryIncidentDescriptionSection) <em>Get Entry11</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry11(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY11__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry11(EMSInjuryIncidentDescriptionSection) <em>Get Entry11</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry11(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY11__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry11(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY11__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(77));
      try
      {
        GET_ENTRY11__EOCL_QRY = helper.createQuery(GET_ENTRY11__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY11__EOCL_QRY);
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry12(EMSInjuryIncidentDescriptionSection) <em>Get Entry12</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry12(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY12__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry12(EMSInjuryIncidentDescriptionSection) <em>Get Entry12</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry12(EMSInjuryIncidentDescriptionSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY12__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry)
   * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  void getEntry12(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection)
  {
    if (GET_ENTRY12__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(78));
      try
      {
        GET_ENTRY12__EOCL_QRY = helper.createQuery(GET_ENTRY12__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY12__EOCL_QRY);
    return (void) query.evaluate(emsInjuryIncidentDescriptionSection);
  }

} // EMSInjuryIncidentDescriptionSectionOperations
