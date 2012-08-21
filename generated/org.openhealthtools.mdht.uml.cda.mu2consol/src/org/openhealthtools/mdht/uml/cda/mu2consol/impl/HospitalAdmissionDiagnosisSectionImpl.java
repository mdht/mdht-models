/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.HospitalAdmissionDiagnosisSectionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Hospital Admission Diagnosis Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionDiagnosisSectionImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.HospitalAdmissionDiagnosisSectionImpl
		implements HospitalAdmissionDiagnosisSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAdmissionDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalAdmissionDiagnosisSectionOperations.validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosis getmu2consolHospitalAdmissionDiagnosis() {
		return HospitalAdmissionDiagnosisSectionOperations.getmu2consolHospitalAdmissionDiagnosis(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosisSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HospitalAdmissionDiagnosisSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HospitalAdmissionDiagnosisSectionImpl
