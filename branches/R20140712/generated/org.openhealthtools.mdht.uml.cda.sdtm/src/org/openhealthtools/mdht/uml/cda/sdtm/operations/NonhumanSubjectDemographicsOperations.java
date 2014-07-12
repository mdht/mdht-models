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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Subject Demographics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonhumanSubjectDemographicsOperations extends OrganizerOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanSubjectDemographicsOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.16')";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
             new Object [] { nonhumanSubjectDemographics }));
      }
       
      return false;
    }
    return true;
  }

} // NonhumanSubjectDemographicsOperations