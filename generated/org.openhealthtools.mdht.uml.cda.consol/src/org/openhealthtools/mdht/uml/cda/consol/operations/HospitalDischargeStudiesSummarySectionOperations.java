/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Studies Summary Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeStudiesSummarySectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected HospitalDischargeStudiesSummarySectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargeStudiesSummarySectionTemplateId(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeStudiesSummarySectionTemplateId(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.16')";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargeStudiesSummarySectionTemplateId(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeStudiesSummarySectionTemplateId(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.16')
	* @param hospitalDischargeStudiesSummarySection The receiving '<em><b>Hospital Discharge Studies Summary Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargeStudiesSummarySectionTemplateId(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeStudiesSummarySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeStudiesSummarySectionTemplateId"),
					new Object[] { hospitalDischargeStudiesSummarySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargeStudiesSummarySectionCode(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeStudiesSummarySectionCode(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '11493-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargeStudiesSummarySectionCode(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeStudiesSummarySectionCode(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	* value.code = '11493-4' and value.codeSystem = '2.16.840.1.113883.6.1')
	* @param hospitalDischargeStudiesSummarySection The receiving '<em><b>Hospital Discharge Studies Summary Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargeStudiesSummarySectionCode(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeStudiesSummarySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeStudiesSummarySectionCode"),
					new Object[] { hospitalDischargeStudiesSummarySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargeStudiesSummarySectionTitle(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeStudiesSummarySectionTitle(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargeStudiesSummarySectionTitle(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeStudiesSummarySectionTitle(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	* @param hospitalDischargeStudiesSummarySection The receiving '<em><b>Hospital Discharge Studies Summary Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargeStudiesSummarySectionTitle(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeStudiesSummarySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeStudiesSummarySectionTitle"),
					new Object[] { hospitalDischargeStudiesSummarySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargeStudiesSummarySectionText(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeStudiesSummarySectionText(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargeStudiesSummarySectionText(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeStudiesSummarySectionText(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* not self.text.oclIsUndefined()
	* @param hospitalDischargeStudiesSummarySection The receiving '<em><b>Hospital Discharge Studies Summary Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargeStudiesSummarySectionText(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeStudiesSummarySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeStudiesSummarySectionText"),
					new Object[] { hospitalDischargeStudiesSummarySection }));
			}

			return false;
		}
		return true;
	}

} // HospitalDischargeStudiesSummarySectionOperations
