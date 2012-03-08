/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.cdt.impl.GeneralHeaderConstraintsImpl;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ContinuityOfCareDocumentImpl;

import org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.operations.EmergencyRunReportOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emergency Run Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EmergencyRunReportImpl extends GeneralHeaderConstraintsImpl implements EmergencyRunReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmergencyRunReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EmergencyRunReportOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EmergencyRunReportOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReportId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EmergencyRunReportOperations.validateEmergencyRunReportId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EmergencyRunReportOperations.validateEmergencyRunReportTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReportTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EmergencyRunReportOperations.validateEmergencyRunReportTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReportSetId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EmergencyRunReportOperations.validateEmergencyRunReportSetId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReportVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EmergencyRunReportOperations.validateEmergencyRunReportVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReportVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EmergencyRunReportOperations.validateEmergencyRunReportVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVitalSignsSection() {
		return EmergencyRunReportOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getBillingSection() {
		return EmergencyRunReportOperations.getBillingSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergencyRunReport init() {
    	CDAUtil.init(this);
    	return this;
	}
} //EmergencyRunReportImpl
