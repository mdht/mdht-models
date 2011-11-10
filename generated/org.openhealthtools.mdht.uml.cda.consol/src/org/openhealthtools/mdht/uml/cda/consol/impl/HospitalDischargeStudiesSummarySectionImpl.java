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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeStudiesSummarySectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Discharge Studies Summary Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeStudiesSummarySectionImpl extends SectionImpl implements
		HospitalDischargeStudiesSummarySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeStudiesSummarySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeStudiesSummarySectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeStudiesSummarySectionOperations.validateHospitalDischargeStudiesSummarySectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeStudiesSummarySectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeStudiesSummarySectionOperations.validateHospitalDischargeStudiesSummarySectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeStudiesSummarySectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeStudiesSummarySectionOperations.validateHospitalDischargeStudiesSummarySectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeStudiesSummarySection init() {
		CDAUtil.init(this);
		return this;
	}
} // HospitalDischargeStudiesSummarySectionImpl
