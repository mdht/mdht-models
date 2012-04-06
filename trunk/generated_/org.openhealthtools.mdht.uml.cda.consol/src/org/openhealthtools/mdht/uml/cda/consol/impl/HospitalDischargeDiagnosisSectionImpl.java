/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Discharge Diagnosis Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeDiagnosisSectionImpl extends SectionImpl implements HospitalDischargeDiagnosisSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosis getHospitalDischargeDiagnosis() {
		return HospitalDischargeDiagnosisSectionOperations.getHospitalDischargeDiagnosis(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection init() {
		CDAUtil.init(this);
		return this;
	}
} // HospitalDischargeDiagnosisSectionImpl
