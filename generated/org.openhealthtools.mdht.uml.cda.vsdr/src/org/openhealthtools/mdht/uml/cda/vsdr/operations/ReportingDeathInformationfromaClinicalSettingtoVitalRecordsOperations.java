/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.ClinicalDocumentOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Death Report Document Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#getDeathReportDocumentBody() <em>Get Death Report Document Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations extends ClinicalDocumentOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '69409-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.11.3883.5.25')";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = element.oclAsType(datatypes::CS) in "+
"value.code = 'US')";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.realmCode->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Death Report Document Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::DeathReportDocumentBody))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Death Report Document Body</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingDeathInformationfromaClinicalSettingtoVitalRecords The receiving '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS);
			try {
				VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reportingDeathInformationfromaClinicalSettingtoVitalRecords)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReportingDeathInformationfromaClinicalSettingtoVitalRecordsReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reportingDeathInformationfromaClinicalSettingtoVitalRecords, context) }),
						 new Object [] { reportingDeathInformationfromaClinicalSettingtoVitalRecords }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) <em>Get Death Report Document Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsdr::DeathReportDocumentBody))->asSequence()->any(true).oclAsType(vsdr::DeathReportDocumentBody)";

	/**
	 * The cached OCL query for the '{@link #getDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) <em>Get Death Report Document Body</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  DeathReportDocumentBody getDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords) {
	
	
	
		if (GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS, VsdrPackage.Literals.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS.getEAllOperations().get(49));
			try {
				GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_QRY = helper.createQuery(GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DEATH_REPORT_DOCUMENT_BODY__EOCL_QRY);
		return (DeathReportDocumentBody) query.evaluate(reportingDeathInformationfromaClinicalSettingtoVitalRecords);
	}

} // ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations