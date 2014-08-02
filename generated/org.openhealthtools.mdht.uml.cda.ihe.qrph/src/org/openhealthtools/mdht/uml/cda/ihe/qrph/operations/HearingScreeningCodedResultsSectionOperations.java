/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;

import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.util.QrphValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Screening Coded Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection#getQrphProcedureEntry() <em>Get Qrph Procedure Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection#getQrphExternalReference() <em>Get Qrph External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection#getQrphSimpleObservation() <em>Get Qrph Simple Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection#validateCodedResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingScreeningCodedResultsSectionOperations extends CodedResultsSectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingScreeningCodedResultsSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #getQrphProcedureEntry(HearingScreeningCodedResultsSection) <em>Get Qrph Procedure Entry</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQrphProcedureEntry(HearingScreeningCodedResultsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_QRPH_PROCEDURE_ENTRY__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ihe::ProcedureEntry))->asSequence()->any(true).oclAsType(ihe::ProcedureEntry)";

  /**
   * The cached OCL query for the '{@link #getQrphProcedureEntry(HearingScreeningCodedResultsSection) <em>Get Qrph Procedure Entry</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQrphProcedureEntry(HearingScreeningCodedResultsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_QRPH_PROCEDURE_ENTRY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ProcedureEntry getQrphProcedureEntry(HearingScreeningCodedResultsSection hearingScreeningCodedResultsSection)
  {
    if (GET_QRPH_PROCEDURE_ENTRY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(QrphPackage.Literals.HEARING_SCREENING_CODED_RESULTS_SECTION, QrphPackage.Literals.HEARING_SCREENING_CODED_RESULTS_SECTION.getEAllOperations().get(63));
      try
      {
        GET_QRPH_PROCEDURE_ENTRY__EOCL_QRY = helper.createQuery(GET_QRPH_PROCEDURE_ENTRY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_QRPH_PROCEDURE_ENTRY__EOCL_QRY);
    return (ProcedureEntry) query.evaluate(hearingScreeningCodedResultsSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getQrphExternalReference(HearingScreeningCodedResultsSection) <em>Get Qrph External Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQrphExternalReference(HearingScreeningCodedResultsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_QRPH_EXTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference))->asSequence()->any(true).oclAsType(ihe::ExternalReference)";

  /**
   * The cached OCL query for the '{@link #getQrphExternalReference(HearingScreeningCodedResultsSection) <em>Get Qrph External Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQrphExternalReference(HearingScreeningCodedResultsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_QRPH_EXTERNAL_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ExternalReference getQrphExternalReference(HearingScreeningCodedResultsSection hearingScreeningCodedResultsSection)
  {
    if (GET_QRPH_EXTERNAL_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(QrphPackage.Literals.HEARING_SCREENING_CODED_RESULTS_SECTION, QrphPackage.Literals.HEARING_SCREENING_CODED_RESULTS_SECTION.getEAllOperations().get(64));
      try
      {
        GET_QRPH_EXTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GET_QRPH_EXTERNAL_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_QRPH_EXTERNAL_REFERENCE__EOCL_QRY);
    return (ExternalReference) query.evaluate(hearingScreeningCodedResultsSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getQrphSimpleObservation(HearingScreeningCodedResultsSection) <em>Get Qrph Simple Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQrphSimpleObservation(HearingScreeningCodedResultsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_QRPH_SIMPLE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::SimpleObservation))->asSequence()->any(true).oclAsType(ihe::SimpleObservation)";

  /**
   * The cached OCL query for the '{@link #getQrphSimpleObservation(HearingScreeningCodedResultsSection) <em>Get Qrph Simple Observation</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQrphSimpleObservation(HearingScreeningCodedResultsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_QRPH_SIMPLE_OBSERVATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SimpleObservation getQrphSimpleObservation(HearingScreeningCodedResultsSection hearingScreeningCodedResultsSection)
  {
    if (GET_QRPH_SIMPLE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(QrphPackage.Literals.HEARING_SCREENING_CODED_RESULTS_SECTION, QrphPackage.Literals.HEARING_SCREENING_CODED_RESULTS_SECTION.getEAllOperations().get(65));
      try
      {
        GET_QRPH_SIMPLE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_QRPH_SIMPLE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_QRPH_SIMPLE_OBSERVATION__EOCL_QRY);
    return (SimpleObservation) query.evaluate(hearingScreeningCodedResultsSection);
  }

  /**
   * The cached OCL expression body for the '{@link #validateCodedResultsSectionTemplateId(HearingScreeningCodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCodedResultsSectionTemplateId(HearingScreeningCodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.15.3.2')";

  /**
   * The cached OCL invariant for the '{@link #validateCodedResultsSectionTemplateId(HearingScreeningCodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCodedResultsSectionTemplateId(HearingScreeningCodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingScreeningCodedResultsSection The receiving '<em><b>Hearing Screening Coded Results Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCodedResultsSectionTemplateId(HearingScreeningCodedResultsSection hearingScreeningCodedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QrphPackage.Literals.HEARING_SCREENING_CODED_RESULTS_SECTION);
      try
      {
        VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingScreeningCodedResultsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QrphValidator.DIAGNOSTIC_SOURCE,
             QrphValidator.HEARING_SCREENING_CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_TEMPLATE_ID,
             QrphPlugin.INSTANCE.getString("CodedResultsSectionTemplateId"),
             new Object [] { hearingScreeningCodedResultsSection }));
      }
       
      return false;
    }
    return true;
  }

} // HearingScreeningCodedResultsSectionOperations