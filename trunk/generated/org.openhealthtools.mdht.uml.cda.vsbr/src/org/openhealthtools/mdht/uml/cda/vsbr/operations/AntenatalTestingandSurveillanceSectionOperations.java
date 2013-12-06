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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Antenatal Testingand Surveillance Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionPreNatalCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#getPreNatalCare() <em>Get Pre Natal Care</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AntenatalTestingandSurveillanceSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AntenatalTestingandSurveillanceSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateAntenatalTestingandSurveillanceSectionTemplateId(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionTemplateId(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.3')";

	/**
   * The cached OCL invariant for the '{@link #validateAntenatalTestingandSurveillanceSectionTemplateId(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionTemplateId(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param antenatalTestingandSurveillanceSection The receiving '<em><b>Antenatal Testingand Surveillance Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateAntenatalTestingandSurveillanceSectionTemplateId(
			AntenatalTestingandSurveillanceSection antenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION);
      try
      {
        VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(antenatalTestingandSurveillanceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION__ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AntenatalTestingandSurveillanceSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(antenatalTestingandSurveillanceSection, context) }),
             new Object [] { antenatalTestingandSurveillanceSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAntenatalTestingandSurveillanceSectionClassCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionClassCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

	/**
   * The cached OCL invariant for the '{@link #validateAntenatalTestingandSurveillanceSectionClassCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionClassCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param antenatalTestingandSurveillanceSection The receiving '<em><b>Antenatal Testingand Surveillance Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateAntenatalTestingandSurveillanceSectionClassCode(
			AntenatalTestingandSurveillanceSection antenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION);
      try
      {
        VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(antenatalTestingandSurveillanceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION__ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AntenatalTestingandSurveillanceSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(antenatalTestingandSurveillanceSection, context) }),
             new Object [] { antenatalTestingandSurveillanceSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAntenatalTestingandSurveillanceSectionMoodCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionMoodCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateAntenatalTestingandSurveillanceSectionMoodCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionMoodCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param antenatalTestingandSurveillanceSection The receiving '<em><b>Antenatal Testingand Surveillance Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateAntenatalTestingandSurveillanceSectionMoodCode(
			AntenatalTestingandSurveillanceSection antenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION);
      try
      {
        VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(antenatalTestingandSurveillanceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION__ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AntenatalTestingandSurveillanceSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(antenatalTestingandSurveillanceSection, context) }),
             new Object [] { antenatalTestingandSurveillanceSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAntenatalTestingandSurveillanceSectionCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '5707-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateAntenatalTestingandSurveillanceSectionCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionCode(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param antenatalTestingandSurveillanceSection The receiving '<em><b>Antenatal Testingand Surveillance Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateAntenatalTestingandSurveillanceSectionCode(
			AntenatalTestingandSurveillanceSection antenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION);
      try
      {
        VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(antenatalTestingandSurveillanceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION__ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AntenatalTestingandSurveillanceSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(antenatalTestingandSurveillanceSection, context) }),
             new Object [] { antenatalTestingandSurveillanceSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAntenatalTestingandSurveillanceSectionText(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionText(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateAntenatalTestingandSurveillanceSectionText(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionText(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param antenatalTestingandSurveillanceSection The receiving '<em><b>Antenatal Testingand Surveillance Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateAntenatalTestingandSurveillanceSectionText(
			AntenatalTestingandSurveillanceSection antenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION);
      try
      {
        VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(antenatalTestingandSurveillanceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION__ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AntenatalTestingandSurveillanceSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(antenatalTestingandSurveillanceSection, context) }),
             new Object [] { antenatalTestingandSurveillanceSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAntenatalTestingandSurveillanceSectionPreNatalCare(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Pre Natal Care</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionPreNatalCare(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Prenatal Care) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateAntenatalTestingandSurveillanceSectionPreNatalCare(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Pre Natal Care</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAntenatalTestingandSurveillanceSectionPreNatalCare(AntenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param antenatalTestingandSurveillanceSection The receiving '<em><b>Antenatal Testingand Surveillance Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateAntenatalTestingandSurveillanceSectionPreNatalCare(
			AntenatalTestingandSurveillanceSection antenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION);
      try
      {
        VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(antenatalTestingandSurveillanceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION__ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRE_NATAL_CARE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AntenatalTestingandSurveillanceSectionPreNatalCare", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(antenatalTestingandSurveillanceSection, context) }),
             new Object [] { antenatalTestingandSurveillanceSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getPreNatalCare(AntenatalTestingandSurveillanceSection) <em>Get Pre Natal Care</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPreNatalCare(AntenatalTestingandSurveillanceSection)
   * @generated
   * @ordered
   */
	protected static final String GET_PRE_NATAL_CARE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Prenatal Care))->asSequence()->any(true).oclAsType(vsbr::Prenatal Care)";

	/**
   * The cached OCL query for the '{@link #getPreNatalCare(AntenatalTestingandSurveillanceSection) <em>Get Pre Natal Care</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPreNatalCare(AntenatalTestingandSurveillanceSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PRE_NATAL_CARE__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static PrenatalCare getPreNatalCare(
			AntenatalTestingandSurveillanceSection antenatalTestingandSurveillanceSection) {
    if (GET_PRE_NATAL_CARE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION, VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION.getEAllOperations().get(61));
      try
      {
        GET_PRE_NATAL_CARE__EOCL_QRY = helper.createQuery(GET_PRE_NATAL_CARE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PRE_NATAL_CARE__EOCL_QRY);
    return (PrenatalCare) query.evaluate(antenatalTestingandSurveillanceSection);
  }

} // AntenatalTestingandSurveillanceSectionOperations
