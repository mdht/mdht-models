/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote2;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Authorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AnesthesiaSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Anesthesia Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComplicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Complications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2PreoperativeDiagnosisSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Preoperative Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureEstimatedBloodLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureFindingsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Findings Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureSpecimensTakenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2PostoperativeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureImplantsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2OperativeNoteFluidSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Operative Note Fluid Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2OperativeNoteSurgicalProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Operative Note Surgical Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2PlannedProcedureSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Planned Procedure Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureIndicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Indications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2SurgicalDrainsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Surgical Drains Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getAnesthesiaSection2() <em>Get Anesthesia Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getComplicationsSection2() <em>Get Complications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getPreoperativeDiagnosisSection2() <em>Get Preoperative Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureEstimatedBloodLossSection() <em>Get Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureFindingsSection2() <em>Get Procedure Findings Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureSpecimensTakenSection() <em>Get Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureDescriptionSection() <em>Get Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getPostoperativeDiagnosisSection() <em>Get Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureImplantsSection() <em>Get Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getOperativeNoteFluidSection() <em>Get Operative Note Fluid Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getOperativeNoteSurgicalProcedureSection() <em>Get Operative Note Surgical Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getPlannedProcedureSection2() <em>Get Planned Procedure Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureDispositionSection() <em>Get Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureIndicationsSection2() <em>Get Procedure Indications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getSurgicalDrainsSection() <em>Get Surgical Drains Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperativeNote2Operations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNote2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2CodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2CodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2CodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2CodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2CodeP(OperativeNote2 operativeNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_CODE_P,
					ConsolPlugin.INSTANCE.getString("OperativeNote2CodeP"), new Object[] { operativeNote2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.OperativeNote2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.OperativeNote2CodeP", passToken);
				}
				passToken.add(operativeNote2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2Code(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Code(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11504-8' or value.code = '34137-0' or value.code = '28583-3' or value.code = '28624-5' or value.code = '28573-4' or value.code = '34877-1' or value.code = '34874-8' or value.code = '34870-6' or value.code = '34868-0' or value.code = '34818-5'))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2Code(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Code(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2Code(OperativeNote2 operativeNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.OperativeNote2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(operativeNote2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_CODE,
					ConsolPlugin.INSTANCE.getString("OperativeNote2Code"), new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOf(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOf(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOf(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOf(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2DocumentationOf(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF,
					ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOf"), new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2Authorization(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Authorization(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->one(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2Authorization(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Authorization(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2Authorization(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2Authorization"), new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AnesthesiaSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Anesthesia Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AnesthesiaSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_ANESTHESIA_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AnesthesiaSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Anesthesia Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AnesthesiaSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_ANESTHESIA_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2AnesthesiaSection2(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_ANESTHESIA_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_ANESTHESIA_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_ANESTHESIA_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_ANESTHESIA_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_ANESTHESIA_SECTION2,
					ConsolPlugin.INSTANCE.getString("OperativeNote2AnesthesiaSection2"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComplicationsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Complications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComplicationsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPLICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComplicationsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Complications Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComplicationsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_COMPLICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2ComplicationsSection2(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_COMPLICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_COMPLICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_COMPLICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPLICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPLICATIONS_SECTION2,
					ConsolPlugin.INSTANCE.getString("OperativeNote2ComplicationsSection2"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2PreoperativeDiagnosisSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Preoperative Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2PreoperativeDiagnosisSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PREOPERATIVE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2PreoperativeDiagnosisSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Preoperative Diagnosis Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2PreoperativeDiagnosisSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PREOPERATIVE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2PreoperativeDiagnosisSection2(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PREOPERATIVE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PREOPERATIVE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PREOPERATIVE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE2_PREOPERATIVE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PREOPERATIVE_DIAGNOSIS_SECTION2,
					ConsolPlugin.INSTANCE.getString("OperativeNote2PreoperativeDiagnosisSection2"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ProcedureEstimatedBloodLossSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Estimated Blood Loss Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureEstimatedBloodLossSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ProcedureEstimatedBloodLossSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Estimated Blood Loss Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureEstimatedBloodLossSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2ProcedureEstimatedBloodLossSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2ProcedureEstimatedBloodLossSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ProcedureFindingsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Findings Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureFindingsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PROCEDURE_FINDINGS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ProcedureFindingsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Findings Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureFindingsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PROCEDURE_FINDINGS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2ProcedureFindingsSection2(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PROCEDURE_FINDINGS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PROCEDURE_FINDINGS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_FINDINGS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_FINDINGS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PROCEDURE_FINDINGS_SECTION2,
					ConsolPlugin.INSTANCE.getString("OperativeNote2ProcedureFindingsSection2"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ProcedureSpecimensTakenSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Specimens Taken Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureSpecimensTakenSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ProcedureSpecimensTakenSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Specimens Taken Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureSpecimensTakenSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2ProcedureSpecimensTakenSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2ProcedureSpecimensTakenSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ProcedureDescriptionSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Description Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureDescriptionSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ProcedureDescriptionSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Description Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureDescriptionSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2ProcedureDescriptionSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PROCEDURE_DESCRIPTION_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2ProcedureDescriptionSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2PostoperativeDiagnosisSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Postoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2PostoperativeDiagnosisSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2PostoperativeDiagnosisSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Postoperative Diagnosis Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2PostoperativeDiagnosisSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2PostoperativeDiagnosisSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE2_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_POSTOPERATIVE_DIAGNOSIS_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2PostoperativeDiagnosisSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ProcedureImplantsSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Implants Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureImplantsSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ProcedureImplantsSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Implants Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureImplantsSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2ProcedureImplantsSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PROCEDURE_IMPLANTS_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2ProcedureImplantsSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2OperativeNoteFluidSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Operative Note Fluid Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2OperativeNoteFluidSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2OperativeNoteFluidSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Operative Note Fluid Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2OperativeNoteFluidSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2OperativeNoteFluidSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_OPERATIVE_NOTE_FLUID_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNoteFluidSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2OperativeNoteSurgicalProcedureSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Operative Note Surgical Procedure Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2OperativeNoteSurgicalProcedureSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2OperativeNoteSurgicalProcedureSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Operative Note Surgical Procedure Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2OperativeNoteSurgicalProcedureSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2OperativeNoteSurgicalProcedureSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNoteSurgicalProcedureSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2PlanOfTreatmentSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2PlanOfTreatmentSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2PlanOfTreatmentSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2PlanOfTreatmentSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2PlanOfTreatmentSection2(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PLAN_OF_TREATMENT_SECTION2,
					ConsolPlugin.INSTANCE.getString("OperativeNote2PlanOfTreatmentSection2"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2PlannedProcedureSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Planned Procedure Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2PlannedProcedureSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PLANNED_PROCEDURE_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2PlannedProcedureSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Planned Procedure Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2PlannedProcedureSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PLANNED_PROCEDURE_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2PlannedProcedureSection2(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PLANNED_PROCEDURE_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PLANNED_PROCEDURE_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PLANNED_PROCEDURE_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_PLANNED_PROCEDURE_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PLANNED_PROCEDURE_SECTION2,
					ConsolPlugin.INSTANCE.getString("OperativeNote2PlannedProcedureSection2"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ProcedureDispositionSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Disposition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureDispositionSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ProcedureDispositionSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Disposition Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureDispositionSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2ProcedureDispositionSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PROCEDURE_DISPOSITION_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2ProcedureDispositionSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ProcedureIndicationsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Indications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureIndicationsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_PROCEDURE_INDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ProcedureIndicationsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Indications Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ProcedureIndicationsSection2(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_PROCEDURE_INDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2ProcedureIndicationsSection2(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_PROCEDURE_INDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_PROCEDURE_INDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_PROCEDURE_INDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE2_PROCEDURE_INDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_PROCEDURE_INDICATIONS_SECTION2,
					ConsolPlugin.INSTANCE.getString("OperativeNote2ProcedureIndicationsSection2"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2SurgicalDrainsSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Surgical Drains Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2SurgicalDrainsSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2SurgicalDrainsSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Surgical Drains Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2SurgicalDrainsSection(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2SurgicalDrainsSection(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_SURGICAL_DRAINS_SECTION,
					ConsolPlugin.INSTANCE.getString("OperativeNote2SurgicalDrainsSection"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventIVLTSLow(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventIVLTSLow(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventIVLTSLow(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventIVLTSLow(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventIVLTSLow(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventIVLTSLow"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.12.443' and (value.code = 'CP' or value.code = 'PP' or value.code = 'RP')))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PPRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventPerformerTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time No High If Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time No High If Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 8) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 8))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventPreciseToTheDay"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Minute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 12) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 12))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Minute</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventPreciseToTheMinute"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 14) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 14))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventPreciseToTheSecond"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() and effectiveTime.low.value.size() > 8 implies effectiveTime.low.value.size() >= 15) and (not effectiveTime.high.value.oclIsUndefined() and effectiveTime.high.value.size() > 8 implies effectiveTime.high.value.size() >= 15))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventProcedureCodes(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Procedure Codes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventProcedureCodes(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(code.codeSystem = '2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventProcedureCodes(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Procedure Codes</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventProcedureCodes(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventProcedureCodes(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventProcedureCodes"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->one(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEventPerformer"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT,
						ConsolPlugin.INSTANCE.getString("OperativeNote2DocumentationOfServiceEvent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClass::CONS)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("OperativeNote2AuthorizationConsentClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("OperativeNote2AuthorizationConsentMoodCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("OperativeNote2AuthorizationConsentStatusCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::AUTH)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationTypeCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("OperativeNote2AuthorizationTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationConsent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null)->reject(consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(cda::Consent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationConsent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationConsent(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_CONSENT,
						ConsolPlugin.INSTANCE.getString("OperativeNote2AuthorizationConsent"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAnesthesiaSection2(OperativeNote2) <em>Get Anesthesia Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnesthesiaSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANESTHESIA_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2))->asSequence()->any(true).oclAsType(consol::AnesthesiaSection2)";

	/**
	 * The cached OCL query for the '{@link #getAnesthesiaSection2(OperativeNote2) <em>Get Anesthesia Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnesthesiaSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANESTHESIA_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AnesthesiaSection2 getAnesthesiaSection2(OperativeNote2 operativeNote2) {
		if (GET_ANESTHESIA_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(351));
			try {
				GET_ANESTHESIA_SECTION2__EOCL_QRY = helper.createQuery(GET_ANESTHESIA_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ANESTHESIA_SECTION2__EOCL_QRY);
		return (AnesthesiaSection2) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComplicationsSection2(OperativeNote2) <em>Get Complications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplicationsSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPLICATIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2))->asSequence()->any(true).oclAsType(consol::ComplicationsSection2)";

	/**
	 * The cached OCL query for the '{@link #getComplicationsSection2(OperativeNote2) <em>Get Complications Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplicationsSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPLICATIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ComplicationsSection2 getComplicationsSection2(OperativeNote2 operativeNote2) {
		if (GET_COMPLICATIONS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(352));
			try {
				GET_COMPLICATIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_COMPLICATIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPLICATIONS_SECTION2__EOCL_QRY);
		return (ComplicationsSection2) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreoperativeDiagnosisSection2(OperativeNote2) <em>Get Preoperative Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosisSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREOPERATIVE_DIAGNOSIS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection2))->asSequence()->any(true).oclAsType(consol::PreoperativeDiagnosisSection2)";

	/**
	 * The cached OCL query for the '{@link #getPreoperativeDiagnosisSection2(OperativeNote2) <em>Get Preoperative Diagnosis Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosisSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREOPERATIVE_DIAGNOSIS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PreoperativeDiagnosisSection2 getPreoperativeDiagnosisSection2(OperativeNote2 operativeNote2) {
		if (GET_PREOPERATIVE_DIAGNOSIS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(353));
			try {
				GET_PREOPERATIVE_DIAGNOSIS_SECTION2__EOCL_QRY = helper.createQuery(GET_PREOPERATIVE_DIAGNOSIS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREOPERATIVE_DIAGNOSIS_SECTION2__EOCL_QRY);
		return (PreoperativeDiagnosisSection2) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEstimatedBloodLossSection(OperativeNote2) <em>Get Procedure Estimated Blood Loss Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEstimatedBloodLossSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))->asSequence()->any(true).oclAsType(consol::ProcedureEstimatedBloodLossSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEstimatedBloodLossSection(OperativeNote2) <em>Get Procedure Estimated Blood Loss Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEstimatedBloodLossSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection(OperativeNote2 operativeNote2) {
		if (GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(354));
			try {
				GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY);
		return (ProcedureEstimatedBloodLossSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureFindingsSection2(OperativeNote2) <em>Get Procedure Findings Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureFindingsSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_FINDINGS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2))->asSequence()->any(true).oclAsType(consol::ProcedureFindingsSection2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureFindingsSection2(OperativeNote2) <em>Get Procedure Findings Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureFindingsSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_FINDINGS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProcedureFindingsSection2 getProcedureFindingsSection2(OperativeNote2 operativeNote2) {
		if (GET_PROCEDURE_FINDINGS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(355));
			try {
				GET_PROCEDURE_FINDINGS_SECTION2__EOCL_QRY = helper.createQuery(GET_PROCEDURE_FINDINGS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_FINDINGS_SECTION2__EOCL_QRY);
		return (ProcedureFindingsSection2) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureSpecimensTakenSection(OperativeNote2) <em>Get Procedure Specimens Taken Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureSpecimensTakenSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))->asSequence()->any(true).oclAsType(consol::ProcedureSpecimensTakenSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureSpecimensTakenSection(OperativeNote2) <em>Get Procedure Specimens Taken Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureSpecimensTakenSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection(OperativeNote2 operativeNote2) {
		if (GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(356));
			try {
				GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY);
		return (ProcedureSpecimensTakenSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureDescriptionSection(OperativeNote2) <em>Get Procedure Description Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDescriptionSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))->asSequence()->any(true).oclAsType(consol::ProcedureDescriptionSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureDescriptionSection(OperativeNote2) <em>Get Procedure Description Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDescriptionSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProcedureDescriptionSection getProcedureDescriptionSection(OperativeNote2 operativeNote2) {
		if (GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(357));
			try {
				GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY);
		return (ProcedureDescriptionSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPostoperativeDiagnosisSection(OperativeNote2) <em>Get Postoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostoperativeDiagnosisSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(consol::PostoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getPostoperativeDiagnosisSection(OperativeNote2) <em>Get Postoperative Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostoperativeDiagnosisSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PostoperativeDiagnosisSection getPostoperativeDiagnosisSection(OperativeNote2 operativeNote2) {
		if (GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(358));
			try {
				GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PostoperativeDiagnosisSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureImplantsSection(OperativeNote2) <em>Get Procedure Implants Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureImplantsSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_IMPLANTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))->asSequence()->any(true).oclAsType(consol::ProcedureImplantsSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureImplantsSection(OperativeNote2) <em>Get Procedure Implants Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureImplantsSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProcedureImplantsSection getProcedureImplantsSection(OperativeNote2 operativeNote2) {
		if (GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(359));
			try {
				GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_IMPLANTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY);
		return (ProcedureImplantsSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOperativeNoteFluidSection(OperativeNote2) <em>Get Operative Note Fluid Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperativeNoteFluidSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))->asSequence()->any(true).oclAsType(consol::OperativeNoteFluidSection)";

	/**
	 * The cached OCL query for the '{@link #getOperativeNoteFluidSection(OperativeNote2) <em>Get Operative Note Fluid Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperativeNoteFluidSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static OperativeNoteFluidSection getOperativeNoteFluidSection(OperativeNote2 operativeNote2) {
		if (GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(360));
			try {
				GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_QRY = helper.createQuery(GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_QRY);
		return (OperativeNoteFluidSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOperativeNoteSurgicalProcedureSection(OperativeNote2) <em>Get Operative Note Surgical Procedure Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperativeNoteSurgicalProcedureSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))->asSequence()->any(true).oclAsType(consol::OperativeNoteSurgicalProcedureSection)";

	/**
	 * The cached OCL query for the '{@link #getOperativeNoteSurgicalProcedureSection(OperativeNote2) <em>Get Operative Note Surgical Procedure Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperativeNoteSurgicalProcedureSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static OperativeNoteSurgicalProcedureSection getOperativeNoteSurgicalProcedureSection(
			OperativeNote2 operativeNote2) {
		if (GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(361));
			try {
				GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_QRY = helper.createQuery(GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_QRY);
		return (OperativeNoteSurgicalProcedureSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfTreatmentSection2(OperativeNote2) <em>Get Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))->asSequence()->any(true).oclAsType(consol::PlanOfTreatmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfTreatmentSection2(OperativeNote2) <em>Get Plan Of Treatment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfTreatmentSection2 getPlanOfTreatmentSection2(OperativeNote2 operativeNote2) {
		if (GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(362));
			try {
				GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY);
		return (PlanOfTreatmentSection2) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedProcedureSection2(OperativeNote2) <em>Get Planned Procedure Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedProcedureSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_PROCEDURE_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2))->asSequence()->any(true).oclAsType(consol::PlannedProcedureSection2)";

	/**
	 * The cached OCL query for the '{@link #getPlannedProcedureSection2(OperativeNote2) <em>Get Planned Procedure Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedProcedureSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_PROCEDURE_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlannedProcedureSection2 getPlannedProcedureSection2(OperativeNote2 operativeNote2) {
		if (GET_PLANNED_PROCEDURE_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(363));
			try {
				GET_PLANNED_PROCEDURE_SECTION2__EOCL_QRY = helper.createQuery(GET_PLANNED_PROCEDURE_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_PROCEDURE_SECTION2__EOCL_QRY);
		return (PlannedProcedureSection2) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureDispositionSection(OperativeNote2) <em>Get Procedure Disposition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDispositionSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_DISPOSITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))->asSequence()->any(true).oclAsType(consol::ProcedureDispositionSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureDispositionSection(OperativeNote2) <em>Get Procedure Disposition Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDispositionSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProcedureDispositionSection getProcedureDispositionSection(OperativeNote2 operativeNote2) {
		if (GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(364));
			try {
				GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_DISPOSITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY);
		return (ProcedureDispositionSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureIndicationsSection2(OperativeNote2) <em>Get Procedure Indications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureIndicationsSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_INDICATIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2))->asSequence()->any(true).oclAsType(consol::ProcedureIndicationsSection2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureIndicationsSection2(OperativeNote2) <em>Get Procedure Indications Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureIndicationsSection2(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_INDICATIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProcedureIndicationsSection2 getProcedureIndicationsSection2(OperativeNote2 operativeNote2) {
		if (GET_PROCEDURE_INDICATIONS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(365));
			try {
				GET_PROCEDURE_INDICATIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_PROCEDURE_INDICATIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_INDICATIONS_SECTION2__EOCL_QRY);
		return (ProcedureIndicationsSection2) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSurgicalDrainsSection(OperativeNote2) <em>Get Surgical Drains Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgicalDrainsSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SURGICAL_DRAINS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))->asSequence()->any(true).oclAsType(consol::SurgicalDrainsSection)";

	/**
	 * The cached OCL query for the '{@link #getSurgicalDrainsSection(OperativeNote2) <em>Get Surgical Drains Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgicalDrainsSection(OperativeNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SURGICAL_DRAINS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SurgicalDrainsSection getSurgicalDrainsSection(OperativeNote2 operativeNote2) {
		if (GET_SURGICAL_DRAINS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OPERATIVE_NOTE2,
				ConsolPackage.Literals.OPERATIVE_NOTE2.getEAllOperations().get(366));
			try {
				GET_SURGICAL_DRAINS_SECTION__EOCL_QRY = helper.createQuery(GET_SURGICAL_DRAINS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SURGICAL_DRAINS_SECTION__EOCL_QRY);
		return (SurgicalDrainsSection) query.evaluate(operativeNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.7' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"),
					new Object[] { operativeNote2 }));
			}

			return false;
		}
		return true;
	}

} // OperativeNote2Operations
