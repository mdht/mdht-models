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
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.ChiefComplaintAndReasonForVisitSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chief Complaint And Reason For Visit Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChiefComplaintAndReasonForVisitSectionImpl extends SectionImpl implements
		ChiefComplaintAndReasonForVisitSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChiefComplaintAndReasonForVisitSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintAndReasonForVisitSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintAndReasonForVisitSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintAndReasonForVisitSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintAndReasonForVisitSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection init() {
		CDAUtil.init(this);
		return this;
	}
} // ChiefComplaintAndReasonForVisitSectionImpl
