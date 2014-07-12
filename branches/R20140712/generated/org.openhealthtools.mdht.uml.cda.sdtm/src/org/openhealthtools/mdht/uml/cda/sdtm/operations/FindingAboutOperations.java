/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Finding About</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutFindingObservationObjectAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding Observation Object Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutFindingAboutCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding About Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutFindingAboutSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding About Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Association Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Association Finding About Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Association Finding About Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FindingAboutOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FindingAboutOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutTemplateId(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutTemplateId(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.42')";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutTemplateId(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutTemplateId(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutTemplateId(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutClassCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutId(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutId(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutId(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutId(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutId(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutMoodCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutStatusCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutStatusCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutStatusCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutStatusCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutStatusCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutTargetSiteCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutTargetSiteCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutTargetSiteCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutTargetSiteCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutTargetSiteCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutValue(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutInterpretationCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutInterpretationCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutInterpretationCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutInterpretationCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutInterpretationCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutGroupIdentifier(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutGroupIdentifier(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutGroupIdentifier(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutGroupIdentifier(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutGroupIdentifier(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutFindingObservationObjectAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding Observation Object Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutFindingObservationObjectAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_FINDING_OBSERVATION_OBJECT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutFindingObservationObjectAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding Observation Object Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutFindingObservationObjectAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_FINDING_OBSERVATION_OBJECT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutFindingObservationObjectAssociation(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_FINDING_OBSERVATION_OBJECT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_FINDING_OBSERVATION_OBJECT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_FINDING_OBSERVATION_OBJECT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_FINDING_OBSERVATION_OBJECT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_FINDING_OBSERVATION_OBJECT_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutFindingObservationObjectAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutFindingAboutCategoryAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding About Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutFindingAboutCategoryAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_FINDING_ABOUT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutFindingAboutCategoryAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding About Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutFindingAboutCategoryAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_FINDING_ABOUT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutFindingAboutCategoryAssociation(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_FINDING_ABOUT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_FINDING_ABOUT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_FINDING_ABOUT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_FINDING_ABOUT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_FINDING_ABOUT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutFindingAboutCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutFindingAboutSubCategoryAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding About Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutFindingAboutSubCategoryAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_FINDING_ABOUT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutFindingAboutSubCategoryAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding About Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutFindingAboutSubCategoryAssociation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_FINDING_ABOUT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutFindingAboutSubCategoryAssociation(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_FINDING_ABOUT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_FINDING_ABOUT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_FINDING_ABOUT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_FINDING_ABOUT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_FINDING_ABOUT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutFindingAboutSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutNonPerformanceReason(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutNonPerformanceReason(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutNonPerformanceReason(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutNonPerformanceReason(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutNonPerformanceReason(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutDataCollection(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutDataCollection(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutDataCollection(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutDataCollection(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutDataCollection(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUT_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingObservationObjectAssociationfindingObservationObjectCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::DEF)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingObservationObjectAssociationfindingObservationObjectValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingObservationObjectAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingObservationObjectAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingObservationObjectAssociationTypeCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingObservationObjectAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingObservationObjectAssociationObservation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Association Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationObservation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingObservationObjectAssociationObservation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Association Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingObservationObjectAssociationObservation(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingObservationObjectAssociationObservation(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingObservationObjectAssociationObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutCategoryAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutCategoryAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutCategoryAssociationTypeCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Association Finding About Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_FINDING_ABOUT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Association Finding About Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_FINDING_ABOUT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_FINDING_ABOUT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_FINDING_ABOUT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_FINDING_ABOUT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_FINDING_ABOUT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_FINDING_ABOUT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutCategoryAssociationFindingAboutCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Association Finding About Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_FINDING_ABOUT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Association Finding About Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory(FindingAbout, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_FINDING_ABOUT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param findingAbout The receiving '<em><b>Finding About</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory(FindingAbout findingAbout, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_FINDING_ABOUT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FINDING_ABOUT);
      try
      {
        VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_FINDING_ABOUT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_FINDING_ABOUT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_FINDING_ABOUT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(findingAbout))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FINDING_ABOUT__FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_FINDING_ABOUT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(findingAbout, context) }),
             new Object [] { findingAbout }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(FindingAbout) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(FindingAbout)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(FindingAbout) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(FindingAbout)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(FindingAbout findingAbout)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.FINDING_ABOUT, SdtmPackage.Literals.FINDING_ABOUT.getEAllOperations().get(85));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(findingAbout);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(FindingAbout) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(FindingAbout)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(FindingAbout) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(FindingAbout)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(FindingAbout findingAbout)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.FINDING_ABOUT, SdtmPackage.Literals.FINDING_ABOUT.getEAllOperations().get(86));
      try
      {
        GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
    return (NonPerformanceReason) query.evaluate(findingAbout);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(FindingAbout) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(FindingAbout)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(FindingAbout) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(FindingAbout)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(FindingAbout findingAbout)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.FINDING_ABOUT, SdtmPackage.Literals.FINDING_ABOUT.getEAllOperations().get(87));
      try
      {
        GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
    return (DataCollection) query.evaluate(findingAbout);
  }

} // FindingAboutOperations