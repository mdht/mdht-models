/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.HospitalDischargeDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Hospital Discharge Diagnosis Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class HospitalDischargeDiagnosisSectionImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.HospitalDischargeDiagnosisSectionImpl
		implements HospitalDischargeDiagnosisSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HospitalDischargeDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargeDiagnosisSectionOperations
				.validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HospitalDischargeDiagnosis getmu2consolHospitalDischargeDiagnosis() {
		return HospitalDischargeDiagnosisSectionOperations
				.getmu2consolHospitalDischargeDiagnosis(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public HospitalDischargeDiagnosisSection init() {
		CDAUtil.init(this);
		return this;
	}
} // HospitalDischargeDiagnosisSectionImpl
