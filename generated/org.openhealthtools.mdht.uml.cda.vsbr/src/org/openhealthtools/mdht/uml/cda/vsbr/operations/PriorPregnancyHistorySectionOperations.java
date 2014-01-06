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

import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome;
import org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior Pregnancy History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionDateofLastLiveBirth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Other Pregnancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionEstimateofGestation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Estimateof Gestation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getDateofLastLiveBirth() <em>Get Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getLastMenstrualPeriodDate() <em>Get Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getNumberofBirthsStillLiving() <em>Get Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getNumberofLiveBirthsnowDead() <em>Get Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getOtherPregnancyOutcomes() <em>Get Other Pregnancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getEstimateofGestation() <em>Get Estimateof Gestation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorPregnancyHistorySectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PriorPregnancyHistorySectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionTemplateId(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionTemplateId(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.12')";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionTemplateId(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionTemplateId(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionTemplateId(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionClassCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionClassCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionClassCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionClassCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionClassCode(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionMoodCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionMoodCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionMoodCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionMoodCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionMoodCode(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '57073-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionCode(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionCode(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionCodeP(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionCodeP(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionCodeP(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionCodeP(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionCodeP(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionText(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionText(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionText(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionText(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionText(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionDateofLastLiveBirth(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Dateof Last Live Birth</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionDateofLastLiveBirth(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Date of Last Live Birth) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionDateofLastLiveBirth(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Dateof Last Live Birth</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionDateofLastLiveBirth(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionDateofLastLiveBirth(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionDateofLastLiveBirth", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Last Menstrual Period Date</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Last Menstrual Period Date) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Last Menstrual Period Date</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionLastMenstrualPeriodDate", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Numberof Births Still Living</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Births Now Living) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Numberof Births Still Living</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionNumberofBirthsStillLiving", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Numberof Live Birthsnow Dead</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Live Births Now Dead) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Numberof Live Birthsnow Dead</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionNumberofLiveBirthsnowDead", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Other Pregnancy Outcomes</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Other Pregnancy Outcome) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Other Pregnancy Outcomes</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionOtherPregnancyOutcomes", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePriorPregnancyHistorySectionEstimateofGestation(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Estimateof Gestation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionEstimateofGestation(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Estimate of Gestation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validatePriorPregnancyHistorySectionEstimateofGestation(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Estimateof Gestation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePriorPregnancyHistorySectionEstimateofGestation(PriorPregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param priorPregnancyHistorySection The receiving '<em><b>Prior Pregnancy History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validatePriorPregnancyHistorySectionEstimateofGestation(
			PriorPregnancyHistorySection priorPregnancyHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION);
      try
      {
        VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorPregnancyHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRIOR_PREGNANCY_HISTORY_SECTION__PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PriorPregnancyHistorySectionEstimateofGestation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(priorPregnancyHistorySection, context) }),
             new Object [] { priorPregnancyHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getDateofLastLiveBirth(PriorPregnancyHistorySection) <em>Get Dateof Last Live Birth</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDateofLastLiveBirth(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_DATEOF_LAST_LIVE_BIRTH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Date of Last Live Birth))->asSequence()->any(true).oclAsType(vsbr::Date of Last Live Birth)";

	/**
   * The cached OCL query for the '{@link #getDateofLastLiveBirth(PriorPregnancyHistorySection) <em>Get Dateof Last Live Birth</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDateofLastLiveBirth(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static DateofLastLiveBirth getDateofLastLiveBirth(PriorPregnancyHistorySection priorPregnancyHistorySection) {
    if (GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION, VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION.getEAllOperations().get(67));
      try
      {
        GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY = helper.createQuery(GET_DATEOF_LAST_LIVE_BIRTH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY);
    return (DateofLastLiveBirth) query.evaluate(priorPregnancyHistorySection);
  }

	/**
   * The cached OCL expression body for the '{@link #getLastMenstrualPeriodDate(PriorPregnancyHistorySection) <em>Get Last Menstrual Period Date</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLastMenstrualPeriodDate(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Last Menstrual Period Date))->asSequence()->any(true).oclAsType(vsbr::Last Menstrual Period Date)";

	/**
   * The cached OCL query for the '{@link #getLastMenstrualPeriodDate(PriorPregnancyHistorySection) <em>Get Last Menstrual Period Date</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLastMenstrualPeriodDate(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static LastMenstrualPeriodDate getLastMenstrualPeriodDate(
			PriorPregnancyHistorySection priorPregnancyHistorySection) {
    if (GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION, VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION.getEAllOperations().get(68));
      try
      {
        GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY = helper.createQuery(GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY);
    return (LastMenstrualPeriodDate) query.evaluate(priorPregnancyHistorySection);
  }

	/**
   * The cached OCL expression body for the '{@link #getNumberofBirthsStillLiving(PriorPregnancyHistorySection) <em>Get Numberof Births Still Living</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNumberofBirthsStillLiving(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Births Now Living))->asSequence()->any(true).oclAsType(vsbr::Number of Births Now Living)";

	/**
   * The cached OCL query for the '{@link #getNumberofBirthsStillLiving(PriorPregnancyHistorySection) <em>Get Numberof Births Still Living</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNumberofBirthsStillLiving(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static NumberofBirthsNowLiving getNumberofBirthsStillLiving(
			PriorPregnancyHistorySection priorPregnancyHistorySection) {
    if (GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION, VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION.getEAllOperations().get(69));
      try
      {
        GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY = helper.createQuery(GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY);
    return (NumberofBirthsNowLiving) query.evaluate(priorPregnancyHistorySection);
  }

	/**
   * The cached OCL expression body for the '{@link #getNumberofLiveBirthsnowDead(PriorPregnancyHistorySection) <em>Get Numberof Live Birthsnow Dead</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNumberofLiveBirthsnowDead(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Live Births Now Dead))->asSequence()->any(true).oclAsType(vsbr::Number of Live Births Now Dead)";

	/**
   * The cached OCL query for the '{@link #getNumberofLiveBirthsnowDead(PriorPregnancyHistorySection) <em>Get Numberof Live Birthsnow Dead</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNumberofLiveBirthsnowDead(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static NumberofLiveBirthsNowDead getNumberofLiveBirthsnowDead(
			PriorPregnancyHistorySection priorPregnancyHistorySection) {
    if (GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION, VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION.getEAllOperations().get(70));
      try
      {
        GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY = helper.createQuery(GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY);
    return (NumberofLiveBirthsNowDead) query.evaluate(priorPregnancyHistorySection);
  }

	/**
   * The cached OCL expression body for the '{@link #getOtherPregnancyOutcomes(PriorPregnancyHistorySection) <em>Get Other Pregnancy Outcomes</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOtherPregnancyOutcomes(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_OTHER_PREGNANCY_OUTCOMES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Other Pregnancy Outcome))->asSequence()->any(true).oclAsType(vsbr::Other Pregnancy Outcome)";

	/**
   * The cached OCL query for the '{@link #getOtherPregnancyOutcomes(PriorPregnancyHistorySection) <em>Get Other Pregnancy Outcomes</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOtherPregnancyOutcomes(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_OTHER_PREGNANCY_OUTCOMES__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static OtherPregnancyOutcome getOtherPregnancyOutcomes(
			PriorPregnancyHistorySection priorPregnancyHistorySection) {
    if (GET_OTHER_PREGNANCY_OUTCOMES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION, VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION.getEAllOperations().get(71));
      try
      {
        GET_OTHER_PREGNANCY_OUTCOMES__EOCL_QRY = helper.createQuery(GET_OTHER_PREGNANCY_OUTCOMES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_OTHER_PREGNANCY_OUTCOMES__EOCL_QRY);
    return (OtherPregnancyOutcome) query.evaluate(priorPregnancyHistorySection);
  }

	/**
   * The cached OCL expression body for the '{@link #getEstimateofGestation(PriorPregnancyHistorySection) <em>Get Estimateof Gestation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEstimateofGestation(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_ESTIMATEOF_GESTATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Estimate of Gestation))->asSequence()->any(true).oclAsType(vsbr::Estimate of Gestation)";

	/**
   * The cached OCL query for the '{@link #getEstimateofGestation(PriorPregnancyHistorySection) <em>Get Estimateof Gestation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEstimateofGestation(PriorPregnancyHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ESTIMATEOF_GESTATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static EstimateofGestation getEstimateofGestation(PriorPregnancyHistorySection priorPregnancyHistorySection) {
    if (GET_ESTIMATEOF_GESTATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION, VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION.getEAllOperations().get(72));
      try
      {
        GET_ESTIMATEOF_GESTATION__EOCL_QRY = helper.createQuery(GET_ESTIMATEOF_GESTATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ESTIMATEOF_GESTATION__EOCL_QRY);
    return (EstimateofGestation) query.evaluate(priorPregnancyHistorySection);
  }

} // PriorPregnancyHistorySectionOperations
