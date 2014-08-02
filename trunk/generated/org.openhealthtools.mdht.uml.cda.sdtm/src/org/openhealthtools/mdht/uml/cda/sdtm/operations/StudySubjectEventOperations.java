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

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome;
import org.openhealthtools.mdht.uml.cda.sdtm.EventPattern;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Subject Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventSeriousEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Serious Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventStudyTreatmentActionTaken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventOtherTreatmentActionTaken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Other Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventStudyTreatmentCausality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Causality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventNonStudyTreatmentRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Study Treatment Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEventPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Pattern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEventOutcome(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Outcome</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventConcomitantTreatment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Concomitant Treatment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventToxicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Toxicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEventDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Duration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getSeriousEvent() <em>Get Serious Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getStudyTreatmentActionTaken() <em>Get Study Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getOtherTreatmentActionTaken() <em>Get Other Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getStudyTreatmentCausality() <em>Get Study Treatment Causality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getNonStudyTreatmentRelationship() <em>Get Non Study Treatment Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getEventPattern() <em>Get Event Pattern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getEventOutcome() <em>Get Event Outcome</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getConcomitantTreatment() <em>Get Concomitant Treatment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getToxicity() <em>Get Toxicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getEventDuration() <em>Get Event Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudySubjectEventOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudySubjectEventOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.85')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventTemplateId(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventId(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C78802' or value.code = 'C78800' or value.code = '78801' or value.code = '78727' or value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX'))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventEffectiveTime(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEffectiveTime(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventEffectiveTime(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEffectiveTime(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventEffectiveTime(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventStatusCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventStatusCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventStatusCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventStatusCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventStatusCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventTargetSiteCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventTargetSiteCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventTargetSiteCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventTargetSiteCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventTargetSiteCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_TARGET_SITE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventTargetSiteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventTargetSiteCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventTargetSiteCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventTargetSiteCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventTargetSiteCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventTargetSiteCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_TARGET_SITE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventGroupIdentifier(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventGroupIdentifier(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventGroupIdentifier(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventGroupIdentifier(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventGroupIdentifier(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventEventSeverity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEventSeverity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventorFindingSeverity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventEventSeverity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEventSeverity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventEventSeverity(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EVENT_SEVERITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PreSpecifiedEvent) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pre Specified Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventStudyDayPeriod(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventStudyDayPeriod(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyDayPeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventStudyDayPeriod(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Day Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventStudyDayPeriod(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventStudyDayPeriod(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::BodySystemorOrganClass) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Body Systemor Organ Class</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventComment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventComment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventComment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventComment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventComment(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventDomainAssignment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventDomainAssignment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventDomainAssignment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventDomainAssignment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventDomainAssignment(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventRelatedRecord(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventRelatedRecord(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventRelatedRecord(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventRelatedRecord(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventRelatedRecord(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventSupplementalValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventSupplementalValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventSupplementalValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventSupplementalValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventSupplementalValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventDataCollection(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventDataCollection(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventDataCollection(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventDataCollection(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventDataCollection(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventNonPerformanceReason(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventNonPerformanceReason(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventNonPerformanceReason(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventNonPerformanceReason(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventNonPerformanceReason(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventSeriousEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Serious Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventSeriousEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SeriousEvent) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventSeriousEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Serious Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventSeriousEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventSeriousEvent(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_SERIOUS_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventSeriousEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventStudyTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Action Taken</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventStudyTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyTreatmentActionTaken) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventStudyTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Action Taken</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventStudyTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventStudyTreatmentActionTaken(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventStudyTreatmentActionTaken", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventOtherTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Other Treatment Action Taken</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventOtherTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::OtherTreatmentActionTaken) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventOtherTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Other Treatment Action Taken</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventOtherTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventOtherTreatmentActionTaken(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventOtherTreatmentActionTaken", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Causality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyTreatmentCausality) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Causality</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventStudyTreatmentCausality(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventStudyTreatmentCausality", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventNonStudyTreatmentRelationship(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Study Treatment Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventNonStudyTreatmentRelationship(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonStudyTreatmentRelationship) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventNonStudyTreatmentRelationship(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Study Treatment Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventNonStudyTreatmentRelationship(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventNonStudyTreatmentRelationship(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_RELATIONSHIP,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventNonStudyTreatmentRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventEventPattern(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEventPattern(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventPattern) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventEventPattern(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Pattern</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEventPattern(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventEventPattern(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EVENT_PATTERN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEventPattern", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventEventOutcome(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Outcome</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEventOutcome(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventOutcome) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventEventOutcome(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Outcome</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEventOutcome(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventEventOutcome(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EVENT_OUTCOME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEventOutcome", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventConcomitantTreatment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Concomitant Treatment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventConcomitantTreatment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ConcomitantTreatment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventConcomitantTreatment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Concomitant Treatment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventConcomitantTreatment(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventConcomitantTreatment(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_CONCOMITANT_TREATMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventConcomitantTreatment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventToxicity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Toxicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventToxicity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Toxicity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventToxicity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Toxicity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventToxicity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventToxicity(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_TOXICITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventToxicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventCategory(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventSubCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventSubCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventSubCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventSubCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventSubCategory(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventFindingAbout(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventFindingAbout(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventFindingAbout(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventFindingAbout(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventFindingAbout(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectEventEventDuration(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEventDuration(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventDuration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectEventEventDuration(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Duration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectEventEventDuration(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectEventEventDuration(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
			try {
				VALIDATE_STUDY_SUBJECT_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EVENT_DURATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEventDuration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
						 new Object [] { studySubjectEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(StudySubjectEvent) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(StudySubjectEvent) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(StudySubjectEvent studySubjectEvent) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(85));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventSeverity(StudySubjectEvent) <em>Get Event Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSeverity(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventorFindingSeverity))->asSequence()->any(true).oclAsType(sdtm::EventorFindingSeverity)";

	/**
	 * The cached OCL query for the '{@link #getEventSeverity(StudySubjectEvent) <em>Get Event Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSeverity(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventorFindingSeverity getEventSeverity(StudySubjectEvent studySubjectEvent) {
		if (GET_EVENT_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(86));
			try {
				GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
		return (EventorFindingSeverity) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(StudySubjectEvent) <em>Get Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PreSpecifiedEvent))->asSequence()->any(true).oclAsType(sdtm::PreSpecifiedEvent)";

	/**
	 * The cached OCL query for the '{@link #getPreSpecifiedEvent(StudySubjectEvent) <em>Get Pre Specified Event</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PreSpecifiedEvent getPreSpecifiedEvent(StudySubjectEvent studySubjectEvent) {
		if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(87));
			try {
				GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
		return (PreSpecifiedEvent) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyDayPeriod(StudySubjectEvent) <em>Get Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyDayPeriod))->asSequence()->any(true).oclAsType(sdtm::StudyDayPeriod)";

	/**
	 * The cached OCL query for the '{@link #getStudyDayPeriod(StudySubjectEvent) <em>Get Study Day Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyDayPeriod getStudyDayPeriod(StudySubjectEvent studySubjectEvent) {
		if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(88));
			try {
				GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
		return (StudyDayPeriod) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(StudySubjectEvent) <em>Get Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::BodySystemorOrganClass))->asSequence()->any(true).oclAsType(sdtm::BodySystemorOrganClass)";

	/**
	 * The cached OCL query for the '{@link #getBodySystemorOrganClass(StudySubjectEvent) <em>Get Body Systemor Organ Class</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  BodySystemorOrganClass getBodySystemorOrganClass(StudySubjectEvent studySubjectEvent) {
		if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(89));
			try {
				GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
		return (BodySystemorOrganClass) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(StudySubjectEvent) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(StudySubjectEvent) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(StudySubjectEvent studySubjectEvent) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(90));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(studySubjectEvent);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(StudySubjectEvent) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(StudySubjectEvent) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(StudySubjectEvent studySubjectEvent) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(91));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(StudySubjectEvent) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(StudySubjectEvent) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(StudySubjectEvent studySubjectEvent) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(92));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(studySubjectEvent);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(StudySubjectEvent) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(StudySubjectEvent) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(StudySubjectEvent studySubjectEvent) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(93));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(studySubjectEvent);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(StudySubjectEvent) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(StudySubjectEvent) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(StudySubjectEvent studySubjectEvent) {
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(94));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(StudySubjectEvent) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(StudySubjectEvent) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(StudySubjectEvent studySubjectEvent) {
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(95));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeriousEvent(StudySubjectEvent) <em>Get Serious Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriousEvent(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SERIOUS_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SeriousEvent))->asSequence()->any(true).oclAsType(sdtm::SeriousEvent)";

	/**
	 * The cached OCL query for the '{@link #getSeriousEvent(StudySubjectEvent) <em>Get Serious Event</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriousEvent(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SERIOUS_EVENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SeriousEvent getSeriousEvent(StudySubjectEvent studySubjectEvent) {
		if (GET_SERIOUS_EVENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(96));
			try {
				GET_SERIOUS_EVENT__EOCL_QRY = helper.createQuery(GET_SERIOUS_EVENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SERIOUS_EVENT__EOCL_QRY);
		return (SeriousEvent) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyTreatmentActionTaken(StudySubjectEvent) <em>Get Study Treatment Action Taken</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyTreatmentActionTaken(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyTreatmentActionTaken))->asSequence()->any(true).oclAsType(sdtm::StudyTreatmentActionTaken)";

	/**
	 * The cached OCL query for the '{@link #getStudyTreatmentActionTaken(StudySubjectEvent) <em>Get Study Treatment Action Taken</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyTreatmentActionTaken(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyTreatmentActionTaken getStudyTreatmentActionTaken(StudySubjectEvent studySubjectEvent) {
		if (GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(97));
			try {
				GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_QRY = helper.createQuery(GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_TREATMENT_ACTION_TAKEN__EOCL_QRY);
		return (StudyTreatmentActionTaken) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOtherTreatmentActionTaken(StudySubjectEvent) <em>Get Other Treatment Action Taken</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTreatmentActionTaken(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::OtherTreatmentActionTaken))->asSequence()->any(true).oclAsType(sdtm::OtherTreatmentActionTaken)";

	/**
	 * The cached OCL query for the '{@link #getOtherTreatmentActionTaken(StudySubjectEvent) <em>Get Other Treatment Action Taken</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTreatmentActionTaken(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  OtherTreatmentActionTaken getOtherTreatmentActionTaken(StudySubjectEvent studySubjectEvent) {
		if (GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(98));
			try {
				GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_QRY = helper.createQuery(GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OTHER_TREATMENT_ACTION_TAKEN__EOCL_QRY);
		return (OtherTreatmentActionTaken) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyTreatmentCausality(StudySubjectEvent) <em>Get Study Treatment Causality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyTreatmentCausality(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_TREATMENT_CAUSALITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyTreatmentCausality))->asSequence()->any(true).oclAsType(sdtm::StudyTreatmentCausality)";

	/**
	 * The cached OCL query for the '{@link #getStudyTreatmentCausality(StudySubjectEvent) <em>Get Study Treatment Causality</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyTreatmentCausality(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_TREATMENT_CAUSALITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyTreatmentCausality getStudyTreatmentCausality(StudySubjectEvent studySubjectEvent) {
		if (GET_STUDY_TREATMENT_CAUSALITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(99));
			try {
				GET_STUDY_TREATMENT_CAUSALITY__EOCL_QRY = helper.createQuery(GET_STUDY_TREATMENT_CAUSALITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_TREATMENT_CAUSALITY__EOCL_QRY);
		return (StudyTreatmentCausality) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonStudyTreatmentRelationship(StudySubjectEvent) <em>Get Non Study Treatment Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStudyTreatmentRelationship(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonStudyTreatmentRelationship))->asSequence()->any(true).oclAsType(sdtm::NonStudyTreatmentRelationship)";

	/**
	 * The cached OCL query for the '{@link #getNonStudyTreatmentRelationship(StudySubjectEvent) <em>Get Non Study Treatment Relationship</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStudyTreatmentRelationship(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonStudyTreatmentRelationship getNonStudyTreatmentRelationship(StudySubjectEvent studySubjectEvent) {
		if (GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(100));
			try {
				GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_QRY = helper.createQuery(GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_STUDY_TREATMENT_RELATIONSHIP__EOCL_QRY);
		return (NonStudyTreatmentRelationship) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventPattern(StudySubjectEvent) <em>Get Event Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventPattern(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_PATTERN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventPattern))->asSequence()->any(true).oclAsType(sdtm::EventPattern)";

	/**
	 * The cached OCL query for the '{@link #getEventPattern(StudySubjectEvent) <em>Get Event Pattern</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventPattern(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_PATTERN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventPattern getEventPattern(StudySubjectEvent studySubjectEvent) {
		if (GET_EVENT_PATTERN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(101));
			try {
				GET_EVENT_PATTERN__EOCL_QRY = helper.createQuery(GET_EVENT_PATTERN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_PATTERN__EOCL_QRY);
		return (EventPattern) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventOutcome(StudySubjectEvent) <em>Get Event Outcome</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventOutcome(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_OUTCOME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventOutcome))->asSequence()->any(true).oclAsType(sdtm::EventOutcome)";

	/**
	 * The cached OCL query for the '{@link #getEventOutcome(StudySubjectEvent) <em>Get Event Outcome</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventOutcome(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_OUTCOME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventOutcome getEventOutcome(StudySubjectEvent studySubjectEvent) {
		if (GET_EVENT_OUTCOME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(102));
			try {
				GET_EVENT_OUTCOME__EOCL_QRY = helper.createQuery(GET_EVENT_OUTCOME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_OUTCOME__EOCL_QRY);
		return (EventOutcome) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getConcomitantTreatment(StudySubjectEvent) <em>Get Concomitant Treatment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcomitantTreatment(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONCOMITANT_TREATMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ConcomitantTreatment))->asSequence()->any(true).oclAsType(sdtm::ConcomitantTreatment)";

	/**
	 * The cached OCL query for the '{@link #getConcomitantTreatment(StudySubjectEvent) <em>Get Concomitant Treatment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcomitantTreatment(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONCOMITANT_TREATMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ConcomitantTreatment getConcomitantTreatment(StudySubjectEvent studySubjectEvent) {
		if (GET_CONCOMITANT_TREATMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(103));
			try {
				GET_CONCOMITANT_TREATMENT__EOCL_QRY = helper.createQuery(GET_CONCOMITANT_TREATMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONCOMITANT_TREATMENT__EOCL_QRY);
		return (ConcomitantTreatment) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getToxicity(StudySubjectEvent) <em>Get Toxicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicity(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TOXICITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Toxicity))->asSequence()->any(true).oclAsType(sdtm::Toxicity)";

	/**
	 * The cached OCL query for the '{@link #getToxicity(StudySubjectEvent) <em>Get Toxicity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicity(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TOXICITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Toxicity getToxicity(StudySubjectEvent studySubjectEvent) {
		if (GET_TOXICITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(104));
			try {
				GET_TOXICITY__EOCL_QRY = helper.createQuery(GET_TOXICITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TOXICITY__EOCL_QRY);
		return (Toxicity) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(StudySubjectEvent) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(StudySubjectEvent) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(StudySubjectEvent studySubjectEvent) {
		if (GET_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(105));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(StudySubjectEvent) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(StudySubjectEvent) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(StudySubjectEvent studySubjectEvent) {
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(106));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(studySubjectEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(StudySubjectEvent) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(StudySubjectEvent) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(StudySubjectEvent studySubjectEvent) {
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(107));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(studySubjectEvent);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventDuration(StudySubjectEvent) <em>Get Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_DURATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventDuration))->asSequence()->any(true).oclAsType(sdtm::EventDuration)";

	/**
	 * The cached OCL query for the '{@link #getEventDuration(StudySubjectEvent) <em>Get Event Duration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(StudySubjectEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_DURATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventDuration getEventDuration(StudySubjectEvent studySubjectEvent) {
		if (GET_EVENT_DURATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(108));
			try {
				GET_EVENT_DURATION__EOCL_QRY = helper.createQuery(GET_EVENT_DURATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_DURATION__EOCL_QRY);
		return (EventDuration) query.evaluate(studySubjectEvent);
	}

} // StudySubjectEventOperations