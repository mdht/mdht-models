/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Hospital Admission Diagnosis Section</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection#validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection#getmu2consolHospitalAdmissionDiagnosis() <em>Getmu2consol Hospital Admission Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionDiagnosisSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionDiagnosisSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAdmissionDiagnosisSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis))
	 * 
	 * @param hospitalAdmissionDiagnosisSection
	 *            The receiving '
	 *            <em><b>Hospital Admission Diagnosis Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);
			try {
				VALIDATE_MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Mu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(hospitalAdmissionDiagnosisSection, context) }),
						 new Object [] { hospitalAdmissionDiagnosisSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getmu2consolHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosisSection)
	 * <em>Getmu2consol Hospital Admission Diagnosis</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalAdmissionDiagnosis))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionDiagnosis)";

	/**
	 * The cached OCL query for the '{@link #getmu2consolHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosisSection) <em>Getmu2consol Hospital Admission Diagnosis</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getmu2consolHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::HospitalAdmissionDiagnosis))->asSequence()->any(true
	 * ).oclAsType(consol::HospitalAdmissionDiagnosis)
	 * 
	 * @param hospitalAdmissionDiagnosisSection
	 *            The receiving '
	 *            <em><b>Hospital Admission Diagnosis Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalAdmissionDiagnosis getmu2consolHospitalAdmissionDiagnosis(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection) {
		if (GETMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION, Mu2consolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION.getEAllOperations().get(63));
			try {
				GETMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS__EOCL_QRY = helper.createQuery(GETMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS__EOCL_QRY);
		return (HospitalAdmissionDiagnosis) query.evaluate(hospitalAdmissionDiagnosisSection);
	}

} // HospitalAdmissionDiagnosisSectionOperations