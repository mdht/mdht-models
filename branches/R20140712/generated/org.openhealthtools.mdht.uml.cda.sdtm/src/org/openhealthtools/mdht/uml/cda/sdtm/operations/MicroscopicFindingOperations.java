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

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Microscopic Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Microscopic Finding Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingDeathRelationshipAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Death Relationship Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Association Microscopic Finding Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MicroscopicFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MicroscopicFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingTemplateId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingTemplateId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.49')";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingTemplateId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingTemplateId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingTemplateId(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingClassCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingId(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingMoodCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingValue(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingStatusCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingStatusCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingStatusCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingStatusCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingStatusCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingMethodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingMethodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingMethodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingMethodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingMethodCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Microscopic Finding Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_MICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Microscopic Finding Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_MICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_MICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_MICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_MICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_MICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_MICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingMicroscopicFindingResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingSpecimenInformation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingSpecimenInformation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingSpecimenInformation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingSpecimenInformation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingSpecimenInformation(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingEventSeverity(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingEventSeverity(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingEventSeverity(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Event Severity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingEventSeverity(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingEventSeverity(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_EVENT_SEVERITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingDeathRelationshipAssociation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Death Relationship Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingDeathRelationshipAssociation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingDeathRelationshipAssociation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Death Relationship Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingDeathRelationshipAssociation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingDeathRelationshipAssociation(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingDeathRelationshipAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingDataCollection(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingDataCollection(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingDataCollection(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingDataCollection(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingDataCollection(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingGroupIdentifier(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingGroupIdentifier(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingGroupIdentifier(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingGroupIdentifier(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingGroupIdentifier(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingMassIdentification(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mass Identification</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingMassIdentification(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::Mass Identification))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingMassIdentification(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mass Identification</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingMassIdentification(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingMassIdentification(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_MASS_IDENTIFICATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingMassIdentification", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Body Systemor Organ Class</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83218' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Association Microscopic Finding Result Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Association Microscopic Finding Result Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
      try
      {
        VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_MICROSCOPIC_FINDING_RESULT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
             new Object [] { microscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(MicroscopicFinding) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(MicroscopicFinding) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(MicroscopicFinding microscopicFinding)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(75));
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
    return (NonPerformanceReason) query.evaluate(microscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(MicroscopicFinding) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->any(true).oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(MicroscopicFinding) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(MicroscopicFinding microscopicFinding)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(76));
      try
      {
        GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
    return (SpecimenInformation) query.evaluate(microscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getEventSeverity(MicroscopicFinding) <em>Get Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->any(true).oclAsType(sdtm::Event Severity)";

  /**
   * The cached OCL query for the '{@link #getEventSeverity(MicroscopicFinding) <em>Get Event Severity</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EventSeverity getEventSeverity(MicroscopicFinding microscopicFinding)
  {
    if (GET_EVENT_SEVERITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(77));
      try
      {
        GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
    return (EventSeverity) query.evaluate(microscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(MicroscopicFinding) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(MicroscopicFinding) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(MicroscopicFinding microscopicFinding)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(78));
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
    return (DataCollection) query.evaluate(microscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(MicroscopicFinding) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(MicroscopicFinding) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(MicroscopicFinding microscopicFinding)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(79));
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
    return (GroupIdentifier) query.evaluate(microscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(MicroscopicFinding) <em>Get Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->any(true).oclAsType(sdtm::Body System or Organ Class)";

  /**
   * The cached OCL query for the '{@link #getBodySystemorOrganClass(MicroscopicFinding) <em>Get Body Systemor Organ Class</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(MicroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  BodySystemorOrganClass getBodySystemorOrganClass(MicroscopicFinding microscopicFinding)
  {
    if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(80));
      try
      {
        GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
    return (BodySystemorOrganClass) query.evaluate(microscopicFinding);
  }

} // MicroscopicFindingOperations