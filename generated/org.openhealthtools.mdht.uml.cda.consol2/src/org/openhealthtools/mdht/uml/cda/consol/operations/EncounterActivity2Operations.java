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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;

import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2SdtcDDCFromNUBCOrDD(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 Sdtc DDC From NUBC Or DD</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolEncounterDiagnosis2s() <em>Get Consol Encounter Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateEncounterActivity2SdtcDDCFromNUBCOrDD(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 Sdtc DDC From NUBC Or DD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivity2SdtcDDCFromNUBCOrDD(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITY2_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.sDTCDischargeDispositionCode->isEmpty() or self.sDTCDischargeDispositionCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCDischargeDispositionCode->forAll( element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and let value : datatypes::CE = element.oclAsType(datatypes::CE) in (value.codeSystem = '2.16.840.1.113883.6.301.5' or value.codeSystem = '2.16.840.1.113883.12.112') and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivity2SdtcDDCFromNUBCOrDD(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 Sdtc DDC From NUBC Or DD</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivity2SdtcDDCFromNUBCOrDD(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_ACTIVITY2_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEncounterActivity2SdtcDDCFromNUBCOrDD(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITY2_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITY2_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITY2_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_ACTIVITY2_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITY2_SDTC_DDC_FROM_NUBC_OR_DD,
					ConsolPlugin.INSTANCE.getString("EncounterActivity2SdtcDDCFromNUBCOrDD"),
					new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesIndication2(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesIndication2(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesIndication2(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesIndication2(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEncounterActivitiesIndication2(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_INDICATION2,
					ConsolPlugin.INSTANCE.getString("EncounterActivitiesIndication2"),
					new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesEncounterDiagnosis2(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterDiagnosis2(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EncounterDiagnosis2))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesEncounterDiagnosis2(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterDiagnosis2(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEncounterActivitiesEncounterDiagnosis2(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS2,
					ConsolPlugin.INSTANCE.getString("EncounterActivitiesEncounterDiagnosis2"),
					new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolIndication2s(EncounterActivity2) <em>Get Consol Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getConsolIndication2s(EncounterActivity2) <em>Get Consol Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getConsolIndication2s(EncounterActivity2 encounterActivity2) {
		if (GET_CONSOL_INDICATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2,
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2.getEAllOperations().get(76));
			try {
				GET_CONSOL_INDICATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(encounterActivity2);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolEncounterDiagnosis2s(EncounterActivity2) <em>Get Consol Encounter Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolEncounterDiagnosis2s(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EncounterDiagnosis2)).oclAsType(consol::EncounterDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getConsolEncounterDiagnosis2s(EncounterActivity2) <em>Get Consol Encounter Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolEncounterDiagnosis2s(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EncounterDiagnosis2> getConsolEncounterDiagnosis2s(EncounterActivity2 encounterActivity2) {
		if (GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2,
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2.getEAllOperations().get(77));
			try {
				GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterDiagnosis2> result = (Collection<EncounterDiagnosis2>) query.evaluate(encounterActivity2);
		return new BasicEList.UnmodifiableEList<EncounterDiagnosis2>(result.size(), result.toArray());
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
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.sDTCDischargeDispositionCode->isEmpty() or self.sDTCDischargeDispositionCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCDischargeDispositionCode->isEmpty())";

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
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE,
					ConsolPlugin.INSTANCE.getString("EncounterActivitiesSDTCDischargeDispositionCode"),
					new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

} // EncounterActivity2Operations
