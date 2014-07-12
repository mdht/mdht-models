/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Death Report Document Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#getDeathReportDocumentBody() <em>Get Death Report Document Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations extends ClinicalDocumentOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1')";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1')
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '69409-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '69409-1' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.11.3883.5.25')";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.11.3883.5.25')
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.id.oclIsUndefined()
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Language Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Language Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Realm Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.realmCode->size() = 1";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Realm Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.realmCode->size() = 1
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Death Report Document Body</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::Death Report Document Body))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Death Report Document Body</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::Death Report Document Body))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Determiner Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Determiner Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::AUT)";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::AUT)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.5.1'))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Birth Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Birth Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Determiner Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Determiner Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClass::PAT)";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClass::PAT)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Addr</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Addr</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::RCT)";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::RCT)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

  /**
   * The cached OCL invariant for the '{@link #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(Reportingdeathinformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
      try
      {
        VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reportingdeathinformationfromaclinicalsettingtovitalrecords))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingdeathinformationfromaclinicalsettingtovitalrecords, context) }),
             new Object [] { reportingdeathinformationfromaclinicalsettingtovitalrecords }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords) <em>Get Death Report Document Body</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords)
   * @generated
   * @ordered
   */
  protected static final String GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::Death Report Document Body))->asSequence()->any(true).oclAsType(vsdr::Death Report Document Body)";

  /**
   * The cached OCL query for the '{@link #getDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords) <em>Get Death Report Document Body</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::Death Report Document Body))->asSequence()->any(true).oclAsType(vsdr::Death Report Document Body)
   * @param reportingdeathinformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DeathReportDocumentBody getDeathReportDocumentBody(Reportingdeathinformationfromaclinicalsettingtovitalrecords reportingdeathinformationfromaclinicalsettingtovitalrecords)
  {
    if (GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS, VsdrPackage.Literals.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS.getEAllOperations().get(69));
      try
      {
        GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_QRY = helper.createQuery(GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_QRY);
    return (DeathReportDocumentBody) query.evaluate(reportingdeathinformationfromaclinicalsettingtovitalrecords);
  }

} // ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations