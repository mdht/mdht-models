/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.operations;

import java.util.Collection;
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
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.QrdaPlugin;
import org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument;
import org.openhealthtools.mdht.uml.cda.qrda.util.QRDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Quality Reporting Document Architecture Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#validateQualityReportingDocumentArchitectureDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#validateQualityReportingDocumentArchitectureDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#validateQualityReportingDocumentArchitectureDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#validateQualityReportingDocumentArchitectureDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#validateQualityReportingDocumentArchitectureDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#validateQualityReportingDocumentArchitectureDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#validateQualityReportingDocumentArchitectureDocumentMeasureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Measure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument#getMeasureSection() <em>Get Measure Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualityReportingDocumentArchitectureDocumentOperations extends ClinicalDocumentOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected QualityReportingDocumentArchitectureDocumentOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateQualityReportingDocumentArchitectureDocumentTemplateId(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentTemplateId(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.24.1.1')";

	/**
   * The cached OCL invariant for the '{@link #validateQualityReportingDocumentArchitectureDocumentTemplateId(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentTemplateId(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param qualityReportingDocumentArchitectureDocument The receiving '<em><b>Quality Reporting Document Architecture Document</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateQualityReportingDocumentArchitectureDocumentTemplateId(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT);
      try
      {
        VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityReportingDocumentArchitectureDocument))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TEMPLATE_ID,
             QrdaPlugin.INSTANCE.getString("QualityReportingDocumentArchitectureDocumentTemplateId"),
             new Object [] { qualityReportingDocumentArchitectureDocument }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateQualityReportingDocumentArchitectureDocumentCodeP(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentCodeP(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateQualityReportingDocumentArchitectureDocumentCodeP(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentCodeP(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param qualityReportingDocumentArchitectureDocument The receiving '<em><b>Quality Reporting Document Architecture Document</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateQualityReportingDocumentArchitectureDocumentCodeP(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT);
      try
      {
        VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityReportingDocumentArchitectureDocument))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE_P,
             QrdaPlugin.INSTANCE.getString("QualityReportingDocumentArchitectureDocumentCodeP"),
             new Object [] { qualityReportingDocumentArchitectureDocument }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocumentCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocumentCodeP", passToken);
        }
        passToken.add(qualityReportingDocumentArchitectureDocument);
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateQualityReportingDocumentArchitectureDocumentCode(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentCode(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '55182-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateQualityReportingDocumentArchitectureDocumentCode(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentCode(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param qualityReportingDocumentArchitectureDocument The receiving '<em><b>Quality Reporting Document Architecture Document</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateQualityReportingDocumentArchitectureDocumentCode(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocumentCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(qualityReportingDocumentArchitectureDocument)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT);
      try
      {
        VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityReportingDocumentArchitectureDocument))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE,
             QrdaPlugin.INSTANCE.getString("QualityReportingDocumentArchitectureDocumentCode"),
             new Object [] { qualityReportingDocumentArchitectureDocument }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateQualityReportingDocumentArchitectureDocumentTitle(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentTitle(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateQualityReportingDocumentArchitectureDocumentTitle(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentTitle(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param qualityReportingDocumentArchitectureDocument The receiving '<em><b>Quality Reporting Document Architecture Document</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateQualityReportingDocumentArchitectureDocumentTitle(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT);
      try
      {
        VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityReportingDocumentArchitectureDocument))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TITLE,
             QrdaPlugin.INSTANCE.getString("QualityReportingDocumentArchitectureDocumentTitle"),
             new Object [] { qualityReportingDocumentArchitectureDocument }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateQualityReportingDocumentArchitectureDocumentCustodian(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Custodian</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentCustodian(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(rim::Participation))";

	/**
   * The cached OCL invariant for the '{@link #validateQualityReportingDocumentArchitectureDocumentCustodian(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Custodian</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentCustodian(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param qualityReportingDocumentArchitectureDocument The receiving '<em><b>Quality Reporting Document Architecture Document</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateQualityReportingDocumentArchitectureDocumentCustodian(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT);
      try
      {
        VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityReportingDocumentArchitectureDocument))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CUSTODIAN,
             QrdaPlugin.INSTANCE.getString("QualityReportingDocumentArchitectureDocumentCustodian"),
             new Object [] { qualityReportingDocumentArchitectureDocument }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Legal Authenticator</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(rim::Participation))";

	/**
   * The cached OCL invariant for the '{@link #validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Legal Authenticator</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param qualityReportingDocumentArchitectureDocument The receiving '<em><b>Quality Reporting Document Architecture Document</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT);
      try
      {
        VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityReportingDocumentArchitectureDocument))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_LEGAL_AUTHENTICATOR,
             QrdaPlugin.INSTANCE.getString("QualityReportingDocumentArchitectureDocumentLegalAuthenticator"),
             new Object [] { qualityReportingDocumentArchitectureDocument }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateQualityReportingDocumentArchitectureDocumentRecordTarget(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Record Target</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentRecordTarget(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(rim::Participation))";

	/**
   * The cached OCL invariant for the '{@link #validateQualityReportingDocumentArchitectureDocumentRecordTarget(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Record Target</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentRecordTarget(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param qualityReportingDocumentArchitectureDocument The receiving '<em><b>Quality Reporting Document Architecture Document</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateQualityReportingDocumentArchitectureDocumentRecordTarget(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT);
      try
      {
        VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityReportingDocumentArchitectureDocument))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_RECORD_TARGET,
             QrdaPlugin.INSTANCE.getString("QualityReportingDocumentArchitectureDocumentRecordTarget"),
             new Object [] { qualityReportingDocumentArchitectureDocument }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateQualityReportingDocumentArchitectureDocumentMeasureSection(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Measure Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentMeasureSection(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_MEASURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrda::MeasureSection))";

	/**
   * The cached OCL invariant for the '{@link #validateQualityReportingDocumentArchitectureDocumentMeasureSection(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Reporting Document Architecture Document Measure Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateQualityReportingDocumentArchitectureDocumentMeasureSection(QualityReportingDocumentArchitectureDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_MEASURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param qualityReportingDocumentArchitectureDocument The receiving '<em><b>Quality Reporting Document Architecture Document</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateQualityReportingDocumentArchitectureDocumentMeasureSection(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_MEASURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT);
      try
      {
        VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_MEASURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_MEASURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_MEASURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityReportingDocumentArchitectureDocument))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_MEASURE_SECTION,
             QrdaPlugin.INSTANCE.getString("QualityReportingDocumentArchitectureDocumentMeasureSection"),
             new Object [] { qualityReportingDocumentArchitectureDocument }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getMeasureSection(QualityReportingDocumentArchitectureDocument) <em>Get Measure Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMeasureSection(QualityReportingDocumentArchitectureDocument)
   * @generated
   * @ordered
   */
	protected static final String GET_MEASURE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrda::MeasureSection))->asSequence()->any(true).oclAsType(qrda::MeasureSection)";

	/**
   * The cached OCL query for the '{@link #getMeasureSection(QualityReportingDocumentArchitectureDocument) <em>Get Measure Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMeasureSection(QualityReportingDocumentArchitectureDocument)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEASURE_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  MeasureSection getMeasureSection(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument) {
    if (GET_MEASURE_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT, QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT.getEAllOperations().get(37));
      try
      {
        GET_MEASURE_SECTION__EOCL_QRY = helper.createQuery(GET_MEASURE_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEASURE_SECTION__EOCL_QRY);
    return (MeasureSection) query.evaluate(qualityReportingDocumentArchitectureDocument);
  }

} // QualityReportingDocumentArchitectureDocumentOperations