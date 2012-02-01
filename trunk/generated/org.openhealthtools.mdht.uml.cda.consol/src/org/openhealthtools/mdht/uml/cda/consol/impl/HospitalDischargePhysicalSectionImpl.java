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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargePhysicalSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Discharge Physical Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalDischargePhysicalSectionImpl extends SectionImpl implements HospitalDischargePhysicalSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargePhysicalSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOSPITAL_DISCHARGE_PHYSICAL_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargePhysicalSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargePhysicalSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargePhysicalSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargePhysicalSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargePhysicalSectionOperations.validateHospitalDischargePhysicalSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargePhysicalSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} // HospitalDischargePhysicalSectionImpl
