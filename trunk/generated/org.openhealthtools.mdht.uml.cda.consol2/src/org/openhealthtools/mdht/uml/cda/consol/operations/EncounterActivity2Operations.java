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
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSDTCDischargeDispositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSDTCDischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterActivity2Operations extends EncounterActivitiesOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterActivity2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesTemplateId(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesTemplateId(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.49.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesTemplateId(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesTemplateId(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesTemplateId(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("EncounterActivitiesTemplateId"),
					new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesSDTCDischargeDispositionCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSDTCDischargeDispositionCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.sDTCDischargeDispositionCode->isEmpty() or self.sDTCDischargeDispositionCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCDischargeDispositionCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesSDTCDischargeDispositionCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSDTCDischargeDispositionCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesSDTCDischargeDispositionCodeP(
			EncounterActivity2 encounterActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE_P,
					ConsolPlugin.INSTANCE.getString("EncounterActivitiesSDTCDischargeDispositionCodeP"),
					new Object[] { encounterActivity2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.EncounterActivitiesSDTCDischargeDispositionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.EncounterActivitiesSDTCDischargeDispositionCodeP",
						passToken);
				}
				passToken.add(encounterActivity2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.sDTCDischargeDispositionCode->isEmpty() or self.sDTCDischargeDispositionCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCDischargeDispositionCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = element.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.12.112' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesSDTCDischargeDispositionCode(
			EncounterActivity2 encounterActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.EncounterActivitiesSDTCDischargeDispositionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(encounterActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE,
					ConsolPlugin.INSTANCE.getString("EncounterActivitiesSDTCDischargeDispositionCode"),
					new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

} // EncounterActivity2Operations
