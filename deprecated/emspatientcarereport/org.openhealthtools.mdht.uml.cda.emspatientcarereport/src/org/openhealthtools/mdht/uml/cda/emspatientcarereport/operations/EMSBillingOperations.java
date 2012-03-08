/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.operations;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.Entry;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSBilling;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Billing</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSBilling#getEMSPatientCareReportEntry() <em>Get EMS Patient Care Report Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSBillingOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSBillingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getEMSPatientCareReportEntry(EMSBilling) <em>Get EMS Patient Care Report Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSPatientCareReportEntry(EMSBilling)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EMS_PATIENT_CARE_REPORT_ENTRY__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))->asSequence()->first().oclAsType(cda::Entry)";

	/**
	 * The cached OCL query for the '{@link #getEMSPatientCareReportEntry(EMSBilling) <em>Get EMS Patient Care Report Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSPatientCareReportEntry(EMSBilling)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EMS_PATIENT_CARE_REPORT_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))->asSequence()->first().oclAsType(cda::Entry)
	 * @param emsBilling The receiving '<em><b>EMS Billing</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  Entry getEMSPatientCareReportEntry(EMSBilling emsBilling) {
		if (GET_EMS_PATIENT_CARE_REPORT_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspatientcarereportPackage.Literals.EMS_BILLING, EmspatientcarereportPackage.Literals.EMS_BILLING.getEAllOperations().get(55));
			try {
				GET_EMS_PATIENT_CARE_REPORT_ENTRY__EOCL_QRY = helper.createQuery(GET_EMS_PATIENT_CARE_REPORT_ENTRY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EMS_PATIENT_CARE_REPORT_ENTRY__EOCL_QRY);
		return (Entry) query.evaluate(emsBilling);
	}

} // EMSBillingOperations