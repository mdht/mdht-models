/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.QrdaPlugin;
import org.openhealthtools.mdht.uml.cda.qrda.QualityMeasureReport;

import org.openhealthtools.mdht.uml.cda.qrda.util.QRDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Quality Measure Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.QualityMeasureReport#validateQualityMeasureReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Measure Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualityMeasureReportOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityMeasureReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQualityMeasureReportTemplateId(QualityMeasureReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Measure Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQualityMeasureReportTemplateId(QualityMeasureReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUALITY_MEASURE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateQualityMeasureReportTemplateId(QualityMeasureReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quality Measure Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQualityMeasureReportTemplateId(QualityMeasureReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUALITY_MEASURE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param qualityMeasureReport The receiving '<em><b>Quality Measure Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQualityMeasureReportTemplateId(QualityMeasureReport qualityMeasureReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUALITY_MEASURE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(QRDAPackage.Literals.QUALITY_MEASURE_REPORT);
			try {
				VALIDATE_QUALITY_MEASURE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUALITY_MEASURE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUALITY_MEASURE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(qualityMeasureReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDAValidator.DIAGNOSTIC_SOURCE,
						 QRDAValidator.QUALITY_MEASURE_REPORT__QUALITY_MEASURE_REPORT_TEMPLATE_ID,
						 QrdaPlugin.INSTANCE.getString("QualityMeasureReportTemplateId"),
						 new Object [] { qualityMeasureReport }));
			}
			 
			return false;
		}
		return true;
	}

} // QualityMeasureReportOperations