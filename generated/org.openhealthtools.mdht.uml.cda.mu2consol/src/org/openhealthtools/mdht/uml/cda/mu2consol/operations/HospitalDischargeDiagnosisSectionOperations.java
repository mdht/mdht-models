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

import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Hospital Discharge Diagnosis Section</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection#validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection#getMu2consolHospitalDischargeDiagnosis() <em>Get Mu2consol Hospital Discharge Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeDiagnosisSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosisSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeDiagnosisSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis))
	 * 
	 * @param hospitalDischargeDiagnosisSection
	 *            The receiving '
	 *            <em><b>Hospital Discharge Diagnosis Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalDischargeDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis"),
						 new Object [] { hospitalDischargeDiagnosisSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection) <em>Get Mu2consol Hospital Discharge Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalDischargeDiagnosis))->asSequence()->any(true).oclAsType(consol::HospitalDischargeDiagnosis)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection) <em>Get Mu2consol Hospital Discharge Diagnosis</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalDischargeDiagnosis))->asSequence()->any(true).oclAsType(consol::HospitalDischargeDiagnosis)
	 * @param hospitalDischargeDiagnosisSection The receiving '<em><b>Hospital Discharge Diagnosis Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HospitalDischargeDiagnosis getMu2consolHospitalDischargeDiagnosis(HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection) {
		if (GET_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION, Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION.getEAllOperations().get(63));
			try {
				GET_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS__EOCL_QRY);
		return (HospitalDischargeDiagnosis) query.evaluate(hospitalDischargeDiagnosisSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisSectionTemplateId(HospitalDischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionTemplateId(HospitalDischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.24')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisSectionTemplateId(HospitalDischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionTemplateId(HospitalDischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.24')
	 * 
	 * @param hospitalDischargeDiagnosisSection
	 *            The receiving '
	 *            <em><b>Hospital Discharge Diagnosis Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisSectionTemplateId(
			HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalDischargeDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HospitalDischargeDiagnosisSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(hospitalDischargeDiagnosisSection, context) }),
						 new Object [] { hospitalDischargeDiagnosisSection }));
			}
			 
			return false;
		}
		return true;
	}

} // HospitalDischargeDiagnosisSectionOperations