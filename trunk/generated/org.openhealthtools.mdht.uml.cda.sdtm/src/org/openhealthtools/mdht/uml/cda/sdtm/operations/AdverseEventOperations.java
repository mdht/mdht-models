/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

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

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome;
import org.openhealthtools.mdht.uml.cda.sdtm.EventPattern;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Adverse Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventStartRelativetoReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Start Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventStopRelativetoReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Stop Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventSeriousEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Serious Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventStudyTreatmentActionTaken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventOtherTreatmentActionTaken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Other Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventStudyTreatmentCausality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Causality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventNonStudyTreatmentRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Non Study Treatment Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventEventPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Pattern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventEventOutcome(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Outcome</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventConcomitantTreatment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Concomitant Treatment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventToxicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Toxicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventEventDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Duration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getStartRelativetoReferencePeriod() <em>Get Start Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getStopRelativetoReferencePeriod() <em>Get Stop Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getSeriousEvent() <em>Get Serious Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getStudyTreatmentActionTaken() <em>Get Study Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getOtherTreatmentActionTaken() <em>Get Other Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getStudyTreatmentCausality() <em>Get Study Treatment Causality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getNonStudyTreatmentRelationship() <em>Get Non Study Treatment Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getEventPattern() <em>Get Event Pattern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getEventOutcome() <em>Get Event Outcome</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getConcomitantTreatment() <em>Get Concomitant Treatment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getToxicity() <em>Get Toxicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getFindingAbout() <em>Get Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getEventDuration() <em>Get Event Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdverseEventOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTemplateId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTemplateId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTemplateId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTemplateId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTemplateId(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventId(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C49562' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventEffectiveTime(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEffectiveTime(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventEffectiveTime(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEffectiveTime(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventEffectiveTime(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystemName = 'MedDRA' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventValueP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTargetSiteCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTargetSiteCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTargetSiteCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTargetSiteCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTargetSiteCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_TARGET_SITE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventTargetSiteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTargetSiteCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTargetSiteCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTargetSiteCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTargetSiteCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTargetSiteCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_TARGET_SITE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventGroupIdentifier(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventGroupIdentifier(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventGroupIdentifier(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventGroupIdentifier(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventGroupIdentifier(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventBodySystemorOrganClass(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventBodySystemorOrganClass(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::BodySystemorOrganClass) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventBodySystemorOrganClass(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Body Systemor Organ Class</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventBodySystemorOrganClass(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventBodySystemorOrganClass(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventEventSeverity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEventSeverity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventorFindingSeverity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventEventSeverity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEventSeverity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventEventSeverity(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_EVENT_SEVERITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventPreSpecifiedEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventPreSpecifiedEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PreSpecifiedEvent) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventPreSpecifiedEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pre Specified Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventPreSpecifiedEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventPreSpecifiedEvent(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_PRE_SPECIFIED_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventStudyDayPeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStudyDayPeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyDayPeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventStudyDayPeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Day Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStudyDayPeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventStudyDayPeriod(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_STUDY_DAY_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventDomainAssignment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventDomainAssignment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventDomainAssignment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventDomainAssignment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventDomainAssignment(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventComment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventComment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventComment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventComment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventComment(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventRelatedRecord(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventRelatedRecord(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventRelatedRecord(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventRelatedRecord(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventRelatedRecord(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventSupplementalValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventSupplementalValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventSupplementalValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventSupplementalValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventSupplementalValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventStartRelativetoReferencePeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Start Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStartRelativetoReferencePeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StartRelativetoReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventStartRelativetoReferencePeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Start Relativeto Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStartRelativetoReferencePeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventStartRelativetoReferencePeriod(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_START_RELATIVETO_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventStartRelativetoReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventStopRelativetoReferencePeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Stop Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStopRelativetoReferencePeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StopRelativetoReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventStopRelativetoReferencePeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Stop Relativeto Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStopRelativetoReferencePeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventStopRelativetoReferencePeriod(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventStopRelativetoReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventSeriousEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Serious Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventSeriousEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SeriousEvent) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventSeriousEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Serious Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventSeriousEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventSeriousEvent(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_SERIOUS_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventSeriousEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventStudyTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Action Taken</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStudyTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyTreatmentActionTaken) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventStudyTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Action Taken</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStudyTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventStudyTreatmentActionTaken(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventStudyTreatmentActionTaken", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventOtherTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Other Treatment Action Taken</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventOtherTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::OtherTreatmentActionTaken) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventOtherTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Other Treatment Action Taken</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventOtherTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventOtherTreatmentActionTaken(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventOtherTreatmentActionTaken", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Causality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyTreatmentCausality) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Causality</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventStudyTreatmentCausality(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventStudyTreatmentCausality", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventNonStudyTreatmentRelationship(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Non Study Treatment Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventNonStudyTreatmentRelationship(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonStudyTreatmentRelationship) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventNonStudyTreatmentRelationship(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Non Study Treatment Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventNonStudyTreatmentRelationship(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventNonStudyTreatmentRelationship(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventNonStudyTreatmentRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventEventPattern(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEventPattern(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventPattern) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventEventPattern(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Pattern</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEventPattern(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventEventPattern(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_EVENT_PATTERN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventEventPattern", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventEventOutcome(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Outcome</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEventOutcome(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventOutcome) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventEventOutcome(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Outcome</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEventOutcome(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventEventOutcome(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_EVENT_OUTCOME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventEventOutcome", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventConcomitantTreatment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Concomitant Treatment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventConcomitantTreatment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ConcomitantTreatment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventConcomitantTreatment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Concomitant Treatment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventConcomitantTreatment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventConcomitantTreatment(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_CONCOMITANT_TREATMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventConcomitantTreatment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventToxicity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Toxicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventToxicity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Toxicity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventToxicity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Toxicity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventToxicity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventToxicity(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_TOXICITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventToxicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventCategory(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventSubCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventSubCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventSubCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventSubCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventSubCategory(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventFindingAbout(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventFindingAbout(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventFindingAbout(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventFindingAbout(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventFindingAbout(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventEventDuration(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEventDuration(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventDuration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventEventDuration(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Duration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventEventDuration(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventEventDuration(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
			try {
				VALIDATE_ADVERSE_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_EVENT_DURATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventEventDuration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
						 new Object [] { adverseEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(AdverseEvent) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(AdverseEvent) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(AdverseEvent adverseEvent) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(86));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(AdverseEvent) <em>Get Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::BodySystemorOrganClass))->asSequence()->any(true).oclAsType(sdtm::BodySystemorOrganClass)";

	/**
	 * The cached OCL query for the '{@link #getBodySystemorOrganClass(AdverseEvent) <em>Get Body Systemor Organ Class</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  BodySystemorOrganClass getBodySystemorOrganClass(AdverseEvent adverseEvent) {
		if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(87));
			try {
				GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
		return (BodySystemorOrganClass) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventSeverity(AdverseEvent) <em>Get Event Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSeverity(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventorFindingSeverity))->asSequence()->any(true).oclAsType(sdtm::EventorFindingSeverity)";

	/**
	 * The cached OCL query for the '{@link #getEventSeverity(AdverseEvent) <em>Get Event Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSeverity(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventorFindingSeverity getEventSeverity(AdverseEvent adverseEvent) {
		if (GET_EVENT_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(88));
			try {
				GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
		return (EventorFindingSeverity) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(AdverseEvent) <em>Get Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PreSpecifiedEvent))->asSequence()->any(true).oclAsType(sdtm::PreSpecifiedEvent)";

	/**
	 * The cached OCL query for the '{@link #getPreSpecifiedEvent(AdverseEvent) <em>Get Pre Specified Event</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PreSpecifiedEvent getPreSpecifiedEvent(AdverseEvent adverseEvent) {
		if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(89));
			try {
				GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
		return (PreSpecifiedEvent) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyDayPeriod(AdverseEvent) <em>Get Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyDayPeriod))->asSequence()->any(true).oclAsType(sdtm::StudyDayPeriod)";

	/**
	 * The cached OCL query for the '{@link #getStudyDayPeriod(AdverseEvent) <em>Get Study Day Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyDayPeriod getStudyDayPeriod(AdverseEvent adverseEvent) {
		if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(90));
			try {
				GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
		return (StudyDayPeriod) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(AdverseEvent) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(AdverseEvent) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(AdverseEvent adverseEvent) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(91));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(AdverseEvent) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(AdverseEvent) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(AdverseEvent adverseEvent) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(92));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(adverseEvent);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(AdverseEvent) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(AdverseEvent) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(AdverseEvent adverseEvent) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(93));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(adverseEvent);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(AdverseEvent) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(AdverseEvent) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(AdverseEvent adverseEvent) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(94));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(adverseEvent);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStartRelativetoReferencePeriod(AdverseEvent) <em>Get Start Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRelativetoReferencePeriod(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StartRelativetoReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::StartRelativetoReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getStartRelativetoReferencePeriod(AdverseEvent) <em>Get Start Relativeto Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRelativetoReferencePeriod(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StartRelativetoReferencePeriod getStartRelativetoReferencePeriod(AdverseEvent adverseEvent) {
		if (GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(95));
			try {
				GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY);
		return (StartRelativetoReferencePeriod) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStopRelativetoReferencePeriod(AdverseEvent) <em>Get Stop Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRelativetoReferencePeriod(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StopRelativetoReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::StopRelativetoReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getStopRelativetoReferencePeriod(AdverseEvent) <em>Get Stop Relativeto Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRelativetoReferencePeriod(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StopRelativetoReferencePeriod getStopRelativetoReferencePeriod(AdverseEvent adverseEvent) {
		if (GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(96));
			try {
				GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY);
		return (StopRelativetoReferencePeriod) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeriousEvent(AdverseEvent) <em>Get Serious Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriousEvent(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SERIOUS_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SeriousEvent))->asSequence()->any(true).oclAsType(sdtm::SeriousEvent)";

	/**
	 * The cached OCL query for the '{@link #getSeriousEvent(AdverseEvent) <em>Get Serious Event</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriousEvent(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SERIOUS_EVENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SeriousEvent getSeriousEvent(AdverseEvent adverseEvent) {
		if (GET_SERIOUS_EVENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(97));
			try {
				GET_SERIOUS_EVENT__EOCL_QRY = helper.createQuery(GET_SERIOUS_EVENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SERIOUS_EVENT__EOCL_QRY);
		return (SeriousEvent) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyTreatmentActionTaken(AdverseEvent) <em>Get Study Treatment Action Taken</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyTreatmentActionTaken(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyTreatmentActionTaken))->asSequence()->any(true).oclAsType(sdtm::StudyTreatmentActionTaken)";

	/**
	 * The cached OCL query for the '{@link #getStudyTreatmentActionTaken(AdverseEvent) <em>Get Study Treatment Action Taken</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyTreatmentActionTaken(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyTreatmentActionTaken getStudyTreatmentActionTaken(AdverseEvent adverseEvent) {
		if (GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(98));
			try {
				GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_QRY = helper.createQuery(GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_QRY);
		return (StudyTreatmentActionTaken) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOtherTreatmentActionTaken(AdverseEvent) <em>Get Other Treatment Action Taken</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTreatmentActionTaken(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::OtherTreatmentActionTaken))->asSequence()->any(true).oclAsType(sdtm::OtherTreatmentActionTaken)";

	/**
	 * The cached OCL query for the '{@link #getOtherTreatmentActionTaken(AdverseEvent) <em>Get Other Treatment Action Taken</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTreatmentActionTaken(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  OtherTreatmentActionTaken getOtherTreatmentActionTaken(AdverseEvent adverseEvent) {
		if (GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(99));
			try {
				GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_QRY = helper.createQuery(GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_QRY);
		return (OtherTreatmentActionTaken) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyTreatmentCausality(AdverseEvent) <em>Get Study Treatment Causality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyTreatmentCausality(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_TREATMENT_CAUSALITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyTreatmentCausality))->asSequence()->any(true).oclAsType(sdtm::StudyTreatmentCausality)";

	/**
	 * The cached OCL query for the '{@link #getStudyTreatmentCausality(AdverseEvent) <em>Get Study Treatment Causality</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyTreatmentCausality(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_TREATMENT_CAUSALITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyTreatmentCausality getStudyTreatmentCausality(AdverseEvent adverseEvent) {
		if (GET_STUDY_TREATMENT_CAUSALITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(100));
			try {
				GET_STUDY_TREATMENT_CAUSALITY__EOCL_QRY = helper.createQuery(GET_STUDY_TREATMENT_CAUSALITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_TREATMENT_CAUSALITY__EOCL_QRY);
		return (StudyTreatmentCausality) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonStudyTreatmentRelationship(AdverseEvent) <em>Get Non Study Treatment Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStudyTreatmentRelationship(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonStudyTreatmentRelationship))->asSequence()->any(true).oclAsType(sdtm::NonStudyTreatmentRelationship)";

	/**
	 * The cached OCL query for the '{@link #getNonStudyTreatmentRelationship(AdverseEvent) <em>Get Non Study Treatment Relationship</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStudyTreatmentRelationship(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonStudyTreatmentRelationship getNonStudyTreatmentRelationship(AdverseEvent adverseEvent) {
		if (GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(101));
			try {
				GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_QRY = helper.createQuery(GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_QRY);
		return (NonStudyTreatmentRelationship) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventPattern(AdverseEvent) <em>Get Event Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventPattern(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_PATTERN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventPattern))->asSequence()->any(true).oclAsType(sdtm::EventPattern)";

	/**
	 * The cached OCL query for the '{@link #getEventPattern(AdverseEvent) <em>Get Event Pattern</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventPattern(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_PATTERN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventPattern getEventPattern(AdverseEvent adverseEvent) {
		if (GET_EVENT_PATTERN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(102));
			try {
				GET_EVENT_PATTERN__EOCL_QRY = helper.createQuery(GET_EVENT_PATTERN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_PATTERN__EOCL_QRY);
		return (EventPattern) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventOutcome(AdverseEvent) <em>Get Event Outcome</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventOutcome(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_OUTCOME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventOutcome))->asSequence()->any(true).oclAsType(sdtm::EventOutcome)";

	/**
	 * The cached OCL query for the '{@link #getEventOutcome(AdverseEvent) <em>Get Event Outcome</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventOutcome(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_OUTCOME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventOutcome getEventOutcome(AdverseEvent adverseEvent) {
		if (GET_EVENT_OUTCOME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(103));
			try {
				GET_EVENT_OUTCOME__EOCL_QRY = helper.createQuery(GET_EVENT_OUTCOME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_OUTCOME__EOCL_QRY);
		return (EventOutcome) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getConcomitantTreatment(AdverseEvent) <em>Get Concomitant Treatment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcomitantTreatment(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONCOMITANT_TREATMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ConcomitantTreatment))->asSequence()->any(true).oclAsType(sdtm::ConcomitantTreatment)";

	/**
	 * The cached OCL query for the '{@link #getConcomitantTreatment(AdverseEvent) <em>Get Concomitant Treatment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcomitantTreatment(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONCOMITANT_TREATMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ConcomitantTreatment getConcomitantTreatment(AdverseEvent adverseEvent) {
		if (GET_CONCOMITANT_TREATMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(104));
			try {
				GET_CONCOMITANT_TREATMENT__EOCL_QRY = helper.createQuery(GET_CONCOMITANT_TREATMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONCOMITANT_TREATMENT__EOCL_QRY);
		return (ConcomitantTreatment) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getToxicity(AdverseEvent) <em>Get Toxicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicity(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TOXICITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Toxicity))->asSequence()->any(true).oclAsType(sdtm::Toxicity)";

	/**
	 * The cached OCL query for the '{@link #getToxicity(AdverseEvent) <em>Get Toxicity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicity(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TOXICITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Toxicity getToxicity(AdverseEvent adverseEvent) {
		if (GET_TOXICITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(105));
			try {
				GET_TOXICITY__EOCL_QRY = helper.createQuery(GET_TOXICITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TOXICITY__EOCL_QRY);
		return (Toxicity) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(AdverseEvent) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(AdverseEvent) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(AdverseEvent adverseEvent) {
		if (GET_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(106));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(AdverseEvent) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(AdverseEvent) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(AdverseEvent adverseEvent) {
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(107));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbout(AdverseEvent) <em>Get Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbout(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout))->asSequence()->any(true).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbout(AdverseEvent) <em>Get Finding About</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbout(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  FindingAbout getFindingAbout(AdverseEvent adverseEvent) {
		if (GET_FINDING_ABOUT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(108));
			try {
				GET_FINDING_ABOUT__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUT__EOCL_QRY);
		return (FindingAbout) query.evaluate(adverseEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventDuration(AdverseEvent) <em>Get Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_DURATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventDuration))->asSequence()->any(true).oclAsType(sdtm::EventDuration)";

	/**
	 * The cached OCL query for the '{@link #getEventDuration(AdverseEvent) <em>Get Event Duration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(AdverseEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_DURATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventDuration getEventDuration(AdverseEvent adverseEvent) {
		if (GET_EVENT_DURATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(109));
			try {
				GET_EVENT_DURATION__EOCL_QRY = helper.createQuery(GET_EVENT_DURATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_DURATION__EOCL_QRY);
		return (EventDuration) query.evaluate(adverseEvent);
	}

} // AdverseEventOperations