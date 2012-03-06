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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteAnesthesiaSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComplicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNotePostoperativeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNotePreoperativeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureEstimatedBloodLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureFindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureSpecimensTakenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureImplantsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteOperativeNoteFluidSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Operative Note Fluid Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteOperativeNoteSurgicalProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Operative Note Surgical Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNotePlannedProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureIndicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteSurgicalDrainsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Drains Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Any Assistants As Secondary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getAnesthesiaSection() <em>Get Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getComplicationsSection() <em>Get Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getPostoperativeDiagnosisSection() <em>Get Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getPreoperativeDiagnosisSection() <em>Get Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureEstimatedBloodLossSection() <em>Get Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureFindingsSection() <em>Get Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureSpecimensTakenSection() <em>Get Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureDescriptionSection() <em>Get Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureImplantsSection() <em>Get Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getOperativeNoteFluidSection() <em>Get Operative Note Fluid Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getOperativeNoteSurgicalProcedureSection() <em>Get Operative Note Surgical Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getPlannedProcedureSection() <em>Get Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureDispositionSection() <em>Get Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureIndicationsSection() <em>Get Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getSurgicalDrainsSection() <em>Get Surgical Drains Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperativeNoteOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteTemplateId(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteTemplateId(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteTemplateId(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteTemplateId(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.7')
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteTemplateId(OperativeNote operativeNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteTemplateId"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOf(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOf(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOf(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOf(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOf(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOf"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteAnesthesiaSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Anesthesia Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteAnesthesiaSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteAnesthesiaSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Anesthesia Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteAnesthesiaSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteAnesthesiaSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_ANESTHESIA_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteAnesthesiaSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComplicationsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Complications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComplicationsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComplicationsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Complications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComplicationsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteComplicationsSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPLICATIONS_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteComplicationsSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNotePostoperativeDiagnosisSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Postoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNotePostoperativeDiagnosisSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNotePostoperativeDiagnosisSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Postoperative Diagnosis Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNotePostoperativeDiagnosisSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNotePostoperativeDiagnosisSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_POSTOPERATIVE_DIAGNOSIS_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNotePostoperativeDiagnosisSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNotePreoperativeDiagnosisSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Preoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNotePreoperativeDiagnosisSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNotePreoperativeDiagnosisSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Preoperative Diagnosis Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNotePreoperativeDiagnosisSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNotePreoperativeDiagnosisSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PREOPERATIVE_DIAGNOSIS_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNotePreoperativeDiagnosisSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteProcedureEstimatedBloodLossSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Estimated Blood Loss Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureEstimatedBloodLossSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteProcedureEstimatedBloodLossSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Estimated Blood Loss Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureEstimatedBloodLossSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteProcedureEstimatedBloodLossSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteProcedureEstimatedBloodLossSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteProcedureFindingsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Findings Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureFindingsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteProcedureFindingsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Findings Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureFindingsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteProcedureFindingsSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PROCEDURE_FINDINGS_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteProcedureFindingsSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteProcedureSpecimensTakenSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Specimens Taken Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureSpecimensTakenSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteProcedureSpecimensTakenSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Specimens Taken Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureSpecimensTakenSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteProcedureSpecimensTakenSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteProcedureSpecimensTakenSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteProcedureDescriptionSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Description Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureDescriptionSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteProcedureDescriptionSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Description Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureDescriptionSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteProcedureDescriptionSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PROCEDURE_DESCRIPTION_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteProcedureDescriptionSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteProcedureImplantsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Implants Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureImplantsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteProcedureImplantsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Implants Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureImplantsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteProcedureImplantsSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PROCEDURE_IMPLANTS_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteProcedureImplantsSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteOperativeNoteFluidSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Operative Note Fluid Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteOperativeNoteFluidSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteOperativeNoteFluidSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Operative Note Fluid Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteOperativeNoteFluidSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteOperativeNoteFluidSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_OPERATIVE_NOTE_FLUID_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteFluidSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteOperativeNoteSurgicalProcedureSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Operative Note Surgical Procedure Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteOperativeNoteSurgicalProcedureSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteOperativeNoteSurgicalProcedureSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Operative Note Surgical Procedure Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteOperativeNoteSurgicalProcedureSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteOperativeNoteSurgicalProcedureSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteSurgicalProcedureSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNotePlanOfCareSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNotePlanOfCareSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNotePlanOfCareSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNotePlanOfCareSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNotePlanOfCareSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PLAN_OF_CARE_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNotePlanOfCareSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNotePlannedProcedureSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Planned Procedure Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNotePlannedProcedureSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNotePlannedProcedureSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Planned Procedure Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNotePlannedProcedureSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNotePlannedProcedureSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PLANNED_PROCEDURE_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNotePlannedProcedureSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteProcedureDispositionSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Disposition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureDispositionSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteProcedureDispositionSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Disposition Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureDispositionSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteProcedureDispositionSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PROCEDURE_DISPOSITION_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteProcedureDispositionSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteProcedureIndicationsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Indications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureIndicationsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteProcedureIndicationsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Indications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteProcedureIndicationsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteProcedureIndicationsSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_PROCEDURE_INDICATIONS_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteProcedureIndicationsSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteSurgicalDrainsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Drains Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalDrainsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteSurgicalDrainsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Drains Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalDrainsSection(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteSurgicalDrainsSection(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_SURGICAL_DRAINS_SECTION,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteSurgicalDrainsSection"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent.performer->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent.performer->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->forAll(isDefined('typeCode')) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent.performer->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent.performer->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->forAll(isDefined('typeCode')) else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Procedure Codes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(code.codeSystem = '2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96') else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Procedure Codes</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(code.codeSystem = '2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96') else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEventProcedureCodes"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(not effectiveTime.low.oclIsUndefined()) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(not effectiveTime.low.oclIsUndefined()) else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has High When No Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined()) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has High When No Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined()) else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time No High If Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined()) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time No High If Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined()) else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Any Assistants As Secondary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(performer->forAll(typeCode = vocab::x_ServiceEventPerformer::PPRF or typeCode= vocab::x_ServiceEventPerformer::SPRF)) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Any Assistants As Secondary</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(performer->forAll(typeCode = vocab::x_ServiceEventPerformer::PPRF or typeCode= vocab::x_ServiceEventPerformer::SPRF)) else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_ANY_ASSISTANTS_AS_SECONDARY,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEventAnyAssistantsAsSecondary"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())) else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEventCode"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined())) else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEventEffectiveTime"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEvent(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEvent(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) then self.documentationOf->forAll(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent))) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEvent(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEvent(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) then self.documentationOf->forAll(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent))) else true endif
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteDocumentationOfServiceEvent(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteDocumentationOfServiceEvent"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAnesthesiaSection(OperativeNote) <em>Get Anesthesia Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnesthesiaSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANESTHESIA_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection))->asSequence()->first().oclAsType(consol::AnesthesiaSection)";

	/**
	 * The cached OCL query for the '{@link #getAnesthesiaSection(OperativeNote) <em>Get Anesthesia Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnesthesiaSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANESTHESIA_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection))->asSequence()->first().oclAsType(consol::AnesthesiaSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AnesthesiaSection getAnesthesiaSection(OperativeNote operativeNote) {
		if (GET_ANESTHESIA_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(172));
			try {
				GET_ANESTHESIA_SECTION__EOCL_QRY = helper.createQuery(GET_ANESTHESIA_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ANESTHESIA_SECTION__EOCL_QRY);
		return (AnesthesiaSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComplicationsSection(OperativeNote) <em>Get Complications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplicationsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPLICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection))->asSequence()->first().oclAsType(consol::ComplicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getComplicationsSection(OperativeNote) <em>Get Complications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplicationsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPLICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection))->asSequence()->first().oclAsType(consol::ComplicationsSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ComplicationsSection getComplicationsSection(OperativeNote operativeNote) {
		if (GET_COMPLICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(173));
			try {
				GET_COMPLICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_COMPLICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPLICATIONS_SECTION__EOCL_QRY);
		return (ComplicationsSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPostoperativeDiagnosisSection(OperativeNote) <em>Get Postoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostoperativeDiagnosisSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))->asSequence()->first().oclAsType(consol::PostoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getPostoperativeDiagnosisSection(OperativeNote) <em>Get Postoperative Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostoperativeDiagnosisSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))->asSequence()->first().oclAsType(consol::PostoperativeDiagnosisSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PostoperativeDiagnosisSection getPostoperativeDiagnosisSection(OperativeNote operativeNote) {
		if (GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(174));
			try {
				GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PostoperativeDiagnosisSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreoperativeDiagnosisSection(OperativeNote) <em>Get Preoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosisSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))->asSequence()->first().oclAsType(consol::PreoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getPreoperativeDiagnosisSection(OperativeNote) <em>Get Preoperative Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosisSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))->asSequence()->first().oclAsType(consol::PreoperativeDiagnosisSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PreoperativeDiagnosisSection getPreoperativeDiagnosisSection(OperativeNote operativeNote) {
		if (GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(175));
			try {
				GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PreoperativeDiagnosisSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEstimatedBloodLossSection(OperativeNote) <em>Get Procedure Estimated Blood Loss Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEstimatedBloodLossSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))->asSequence()->first().oclAsType(consol::ProcedureEstimatedBloodLossSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEstimatedBloodLossSection(OperativeNote) <em>Get Procedure Estimated Blood Loss Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEstimatedBloodLossSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))->asSequence()->first().oclAsType(consol::ProcedureEstimatedBloodLossSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection(OperativeNote operativeNote) {
		if (GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(176));
			try {
				GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY);
		return (ProcedureEstimatedBloodLossSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureFindingsSection(OperativeNote) <em>Get Procedure Findings Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureFindingsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_FINDINGS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection))->asSequence()->first().oclAsType(consol::ProcedureFindingsSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureFindingsSection(OperativeNote) <em>Get Procedure Findings Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureFindingsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_FINDINGS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection))->asSequence()->first().oclAsType(consol::ProcedureFindingsSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProcedureFindingsSection getProcedureFindingsSection(OperativeNote operativeNote) {
		if (GET_PROCEDURE_FINDINGS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(177));
			try {
				GET_PROCEDURE_FINDINGS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_FINDINGS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_FINDINGS_SECTION__EOCL_QRY);
		return (ProcedureFindingsSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureSpecimensTakenSection(OperativeNote) <em>Get Procedure Specimens Taken Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureSpecimensTakenSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))->asSequence()->first().oclAsType(consol::ProcedureSpecimensTakenSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureSpecimensTakenSection(OperativeNote) <em>Get Procedure Specimens Taken Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureSpecimensTakenSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))->asSequence()->first().oclAsType(consol::ProcedureSpecimensTakenSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection(OperativeNote operativeNote) {
		if (GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(178));
			try {
				GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY);
		return (ProcedureSpecimensTakenSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureDescriptionSection(OperativeNote) <em>Get Procedure Description Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDescriptionSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))->asSequence()->first().oclAsType(consol::ProcedureDescriptionSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureDescriptionSection(OperativeNote) <em>Get Procedure Description Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDescriptionSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))->asSequence()->first().oclAsType(consol::ProcedureDescriptionSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProcedureDescriptionSection getProcedureDescriptionSection(OperativeNote operativeNote) {
		if (GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(179));
			try {
				GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY);
		return (ProcedureDescriptionSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureImplantsSection(OperativeNote) <em>Get Procedure Implants Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureImplantsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_IMPLANTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))->asSequence()->first().oclAsType(consol::ProcedureImplantsSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureImplantsSection(OperativeNote) <em>Get Procedure Implants Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureImplantsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))->asSequence()->first().oclAsType(consol::ProcedureImplantsSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProcedureImplantsSection getProcedureImplantsSection(OperativeNote operativeNote) {
		if (GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(180));
			try {
				GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_IMPLANTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY);
		return (ProcedureImplantsSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOperativeNoteFluidSection(OperativeNote) <em>Get Operative Note Fluid Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperativeNoteFluidSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))->asSequence()->first().oclAsType(consol::OperativeNoteFluidSection)";

	/**
	 * The cached OCL query for the '{@link #getOperativeNoteFluidSection(OperativeNote) <em>Get Operative Note Fluid Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperativeNoteFluidSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))->asSequence()->first().oclAsType(consol::OperativeNoteFluidSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static OperativeNoteFluidSection getOperativeNoteFluidSection(OperativeNote operativeNote) {
		if (GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(181));
			try {
				GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_QRY = helper.createQuery(GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OPERATIVE_NOTE_FLUID_SECTION__EOCL_QRY);
		return (OperativeNoteFluidSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOperativeNoteSurgicalProcedureSection(OperativeNote) <em>Get Operative Note Surgical Procedure Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperativeNoteSurgicalProcedureSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))->asSequence()->first().oclAsType(consol::OperativeNoteSurgicalProcedureSection)";

	/**
	 * The cached OCL query for the '{@link #getOperativeNoteSurgicalProcedureSection(OperativeNote) <em>Get Operative Note Surgical Procedure Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperativeNoteSurgicalProcedureSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))->asSequence()->first().oclAsType(consol::OperativeNoteSurgicalProcedureSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static OperativeNoteSurgicalProcedureSection getOperativeNoteSurgicalProcedureSection(
			OperativeNote operativeNote) {
		if (GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(182));
			try {
				GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_QRY = helper.createQuery(GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__EOCL_QRY);
		return (OperativeNoteSurgicalProcedureSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(OperativeNote) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(OperativeNote) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlanOfCareSection getPlanOfCareSection(OperativeNote operativeNote) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(183));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedProcedureSection(OperativeNote) <em>Get Planned Procedure Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedProcedureSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_PROCEDURE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection))->asSequence()->first().oclAsType(consol::PlannedProcedureSection)";

	/**
	 * The cached OCL query for the '{@link #getPlannedProcedureSection(OperativeNote) <em>Get Planned Procedure Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedProcedureSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_PROCEDURE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection))->asSequence()->first().oclAsType(consol::PlannedProcedureSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlannedProcedureSection getPlannedProcedureSection(OperativeNote operativeNote) {
		if (GET_PLANNED_PROCEDURE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(184));
			try {
				GET_PLANNED_PROCEDURE_SECTION__EOCL_QRY = helper.createQuery(GET_PLANNED_PROCEDURE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_PROCEDURE_SECTION__EOCL_QRY);
		return (PlannedProcedureSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureDispositionSection(OperativeNote) <em>Get Procedure Disposition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDispositionSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_DISPOSITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))->asSequence()->first().oclAsType(consol::ProcedureDispositionSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureDispositionSection(OperativeNote) <em>Get Procedure Disposition Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDispositionSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))->asSequence()->first().oclAsType(consol::ProcedureDispositionSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProcedureDispositionSection getProcedureDispositionSection(OperativeNote operativeNote) {
		if (GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(185));
			try {
				GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_DISPOSITION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY);
		return (ProcedureDispositionSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureIndicationsSection(OperativeNote) <em>Get Procedure Indications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureIndicationsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_INDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection))->asSequence()->first().oclAsType(consol::ProcedureIndicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getProcedureIndicationsSection(OperativeNote) <em>Get Procedure Indications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureIndicationsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_INDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection))->asSequence()->first().oclAsType(consol::ProcedureIndicationsSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProcedureIndicationsSection getProcedureIndicationsSection(OperativeNote operativeNote) {
		if (GET_PROCEDURE_INDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(186));
			try {
				GET_PROCEDURE_INDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_INDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_INDICATIONS_SECTION__EOCL_QRY);
		return (ProcedureIndicationsSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSurgicalDrainsSection(OperativeNote) <em>Get Surgical Drains Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgicalDrainsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SURGICAL_DRAINS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))->asSequence()->first().oclAsType(consol::SurgicalDrainsSection)";

	/**
	 * The cached OCL query for the '{@link #getSurgicalDrainsSection(OperativeNote) <em>Get Surgical Drains Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgicalDrainsSection(OperativeNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SURGICAL_DRAINS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))->asSequence()->first().oclAsType(consol::SurgicalDrainsSection)
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SurgicalDrainsSection getSurgicalDrainsSection(OperativeNote operativeNote) {
		if (GET_SURGICAL_DRAINS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.OPERATIVE_NOTE, ConsolPackage.Literals.OPERATIVE_NOTE.getEAllOperations().get(187));
			try {
				GET_SURGICAL_DRAINS_SECTION__EOCL_QRY = helper.createQuery(GET_SURGICAL_DRAINS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SURGICAL_DRAINS_SECTION__EOCL_QRY);
		return (SurgicalDrainsSection) query.evaluate(operativeNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsCode(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { operativeNote }));
			}
			return false;
		}
		return true;
	}

} // OperativeNoteOperations
