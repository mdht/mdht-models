/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Medication2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeMedication2Operations extends DischargeMedicationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeMedication2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeMedicationCodeP(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeMedicationCodeP(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeMedicationCodeP(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeMedicationCodeP(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeMedication2 The receiving '<em><b>Discharge Medication2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeMedicationCodeP(DischargeMedication2 dischargeMedication2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_MEDICATION2);
			try {
				VALIDATE_DISCHARGE_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeMedication2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_MEDICATION2__DISCHARGE_MEDICATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("DischargeMedicationCodeP"), new Object[] { dischargeMedication2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationCodeP", passToken);
				}
				passToken.add(dischargeMedication2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeMedicationTemplateId(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeMedicationTemplateId(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.35.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeMedicationTemplateId(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeMedicationTemplateId(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeMedication2 The receiving '<em><b>Discharge Medication2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeMedicationTemplateId(DischargeMedication2 dischargeMedication2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_MEDICATION2);
			try {
				VALIDATE_DISCHARGE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeMedication2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_MEDICATION2__DISCHARGE_MEDICATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("DischargeMedicationTemplateId"),
					new Object[] { dischargeMedication2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeMedicationCode(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeMedicationCode(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '10183-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeMedicationCode(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeMedicationCode(DischargeMedication2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeMedication2 The receiving '<em><b>Discharge Medication2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeMedicationCode(DischargeMedication2 dischargeMedication2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dischargeMedication2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_DISCHARGE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_MEDICATION2);
			try {
				VALIDATE_DISCHARGE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeMedication2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_MEDICATION2__DISCHARGE_MEDICATION_CODE,
					ConsolPlugin.INSTANCE.getString("DischargeMedicationCode"), new Object[] { dischargeMedication2 }));
			}

			return false;
		}
		return true;
	}

} // DischargeMedication2Operations
