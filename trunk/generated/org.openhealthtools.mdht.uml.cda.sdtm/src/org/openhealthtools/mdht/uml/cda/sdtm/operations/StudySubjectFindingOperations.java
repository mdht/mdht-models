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

import org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Subject Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingStudyTestOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Study Test Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingToxicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Toxicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingPositionofSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Positionof Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingFastingStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingStudyFindingEvaluator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Study Finding Evaluator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingEventorFindingSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Eventor Finding Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingDeathRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Death Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingAssayQuantitation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Assay Quantitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getToxicity() <em>Get Toxicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getPositionofSubject() <em>Get Positionof Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getFastingStatus() <em>Get Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getEventorFindingSeverity() <em>Get Eventor Finding Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getDeathRelationship() <em>Get Death Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getAssayQuantitation() <em>Get Assay Quantitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudySubjectFindingOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudySubjectFindingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingTemplateId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingTemplateId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.86')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingTemplateId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingTemplateId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingTemplateId(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingClassCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingMoodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingId(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingText(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingText(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingText(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingText(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingText(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingStatusCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingValue(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingMethodCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingMethodCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingMethodCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingMethodCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingMethodCodeP(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_METHOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingMethodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingMethodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingMethodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingMethodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingMethodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingMethodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_METHOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingInterpretationCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingInterpretationCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingInterpretationCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingInterpretationCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingInterpretationCodeP(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_INTERPRETATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingInterpretationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C78802' or value.code = 'C78800' or value.code = '78801' or value.code = '78727' or value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX')))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingInterpretationCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_INTERPRETATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingTargetSiteCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingTargetSiteCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingTargetSiteCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingTargetSiteCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingTargetSiteCodeP(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_TARGET_SITE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingTargetSiteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingTargetSiteCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingTargetSiteCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingTargetSiteCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingTargetSiteCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingTargetSiteCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_TARGET_SITE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingStudyTestOrganization(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Study Test Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingStudyTestOrganization(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_STUDY_TEST_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyTestOrganization))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingStudyTestOrganization(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Study Test Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingStudyTestOrganization(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_STUDY_TEST_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingStudyTestOrganization(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_STUDY_TEST_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_STUDY_TEST_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_STUDY_TEST_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_STUDY_TEST_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_STUDY_TEST_ORGANIZATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingStudyTestOrganization", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingGroupIdentifier(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingGroupIdentifier(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingGroupIdentifier(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingGroupIdentifier(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingGroupIdentifier(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingSpecimenInformation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingSpecimenInformation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::SpecimenInformation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingSpecimenInformation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Specimen Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingSpecimenInformation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingSpecimenInformation(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingComment(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingComment(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingComment(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingComment(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingComment(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingDomainAssignment(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingDomainAssignment(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingDomainAssignment(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingDomainAssignment(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingDomainAssignment(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingRelatedRecord(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingRelatedRecord(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingRelatedRecord(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingRelatedRecord(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingRelatedRecord(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingSupplementalValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingSupplementalValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingSupplementalValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingSupplementalValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingSupplementalValue(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingToxicity(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Toxicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingToxicity(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Toxicity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingToxicity(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Toxicity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingToxicity(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingToxicity(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_TOXICITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingToxicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingCategory(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingSubCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingSubCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingSubCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingSubCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingSubCategory(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingPositionofSubject(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Positionof Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingPositionofSubject(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_POSITIONOF_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PositionofSubject) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingPositionofSubject(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Positionof Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingPositionofSubject(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_POSITIONOF_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingPositionofSubject(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_POSITIONOF_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_POSITIONOF_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_POSITIONOF_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_POSITIONOF_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_POSITIONOF_SUBJECT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingPositionofSubject", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingBodySystemorOrganClass(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingBodySystemorOrganClass(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::BodySystemorOrganClass) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingBodySystemorOrganClass(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Body Systemor Organ Class</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingBodySystemorOrganClass(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingBodySystemorOrganClass(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_BODY_SYSTEMOR_ORGAN_CLASS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingFastingStatus(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Fasting Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingFastingStatus(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FastingStatus) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingFastingStatus(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Fasting Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingFastingStatus(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingFastingStatus(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_FASTING_STATUS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingFastingStatus", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingStudyFindingEvaluator(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Study Finding Evaluator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingStudyFindingEvaluator(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyFindingEvaluator))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingStudyFindingEvaluator(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Study Finding Evaluator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingStudyFindingEvaluator(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingStudyFindingEvaluator(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_STUDY_FINDING_EVALUATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingStudyFindingEvaluator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingEventorFindingSeverity(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Eventor Finding Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingEventorFindingSeverity(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_EVENTOR_FINDING_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventorFindingSeverity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingEventorFindingSeverity(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Eventor Finding Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingEventorFindingSeverity(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_EVENTOR_FINDING_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingEventorFindingSeverity(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_EVENTOR_FINDING_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_EVENTOR_FINDING_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_EVENTOR_FINDING_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_EVENTOR_FINDING_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_EVENTOR_FINDING_SEVERITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingEventorFindingSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingDeathRelationship(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Death Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingDeathRelationship(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DeathRelationship) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingDeathRelationship(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Death Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingDeathRelationship(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingDeathRelationship(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_DEATH_RELATIONSHIP,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingDeathRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingAssayQuantitation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Assay Quantitation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingAssayQuantitation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::AssayQuantitation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingAssayQuantitation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Assay Quantitation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingAssayQuantitation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingAssayQuantitation(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_ASSAY_QUANTITATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingAssayQuantitation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudySubjectFindingFindingAbout(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingFindingAbout(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_SUBJECT_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudySubjectFindingFindingAbout(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudySubjectFindingFindingAbout(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudySubjectFindingFindingAbout(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_SUBJECT_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
			try {
				VALIDATE_STUDY_SUBJECT_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
						 new Object [] { studySubjectFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(StudySubjectFinding) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(StudySubjectFinding) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(StudySubjectFinding studySubjectFinding) {
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(84));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(StudySubjectFinding) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(StudySubjectFinding) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(StudySubjectFinding studySubjectFinding) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(85));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSpecimenInformation(StudySubjectFinding) <em>Get Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::SpecimenInformation))->asSequence()->any(true).oclAsType(sdtm::SpecimenInformation)";

	/**
	 * The cached OCL query for the '{@link #getSpecimenInformation(StudySubjectFinding) <em>Get Specimen Information</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SpecimenInformation getSpecimenInformation(StudySubjectFinding studySubjectFinding) {
		if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(86));
			try {
				GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
		return (SpecimenInformation) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(StudySubjectFinding) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(StudySubjectFinding) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(StudySubjectFinding studySubjectFinding) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(87));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(studySubjectFinding);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(StudySubjectFinding) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(StudySubjectFinding) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(StudySubjectFinding studySubjectFinding) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(88));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(StudySubjectFinding) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(StudySubjectFinding) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(StudySubjectFinding studySubjectFinding) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(89));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(studySubjectFinding);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(StudySubjectFinding) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(StudySubjectFinding) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(StudySubjectFinding studySubjectFinding) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(90));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(studySubjectFinding);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getToxicity(StudySubjectFinding) <em>Get Toxicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicity(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TOXICITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Toxicity))->asSequence()->any(true).oclAsType(sdtm::Toxicity)";

	/**
	 * The cached OCL query for the '{@link #getToxicity(StudySubjectFinding) <em>Get Toxicity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicity(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TOXICITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Toxicity getToxicity(StudySubjectFinding studySubjectFinding) {
		if (GET_TOXICITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(91));
			try {
				GET_TOXICITY__EOCL_QRY = helper.createQuery(GET_TOXICITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TOXICITY__EOCL_QRY);
		return (Toxicity) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(StudySubjectFinding) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(StudySubjectFinding) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(StudySubjectFinding studySubjectFinding) {
		if (GET_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(92));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(StudySubjectFinding) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(StudySubjectFinding) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(StudySubjectFinding studySubjectFinding) {
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(93));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPositionofSubject(StudySubjectFinding) <em>Get Positionof Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionofSubject(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSITIONOF_SUBJECT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PositionofSubject))->asSequence()->any(true).oclAsType(sdtm::PositionofSubject)";

	/**
	 * The cached OCL query for the '{@link #getPositionofSubject(StudySubjectFinding) <em>Get Positionof Subject</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionofSubject(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSITIONOF_SUBJECT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PositionofSubject getPositionofSubject(StudySubjectFinding studySubjectFinding) {
		if (GET_POSITIONOF_SUBJECT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(94));
			try {
				GET_POSITIONOF_SUBJECT__EOCL_QRY = helper.createQuery(GET_POSITIONOF_SUBJECT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSITIONOF_SUBJECT__EOCL_QRY);
		return (PositionofSubject) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(StudySubjectFinding) <em>Get Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::BodySystemorOrganClass))->asSequence()->any(true).oclAsType(sdtm::BodySystemorOrganClass)";

	/**
	 * The cached OCL query for the '{@link #getBodySystemorOrganClass(StudySubjectFinding) <em>Get Body Systemor Organ Class</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  BodySystemorOrganClass getBodySystemorOrganClass(StudySubjectFinding studySubjectFinding) {
		if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(95));
			try {
				GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
		return (BodySystemorOrganClass) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFastingStatus(StudySubjectFinding) <em>Get Fasting Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatus(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FASTING_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FastingStatus))->asSequence()->any(true).oclAsType(sdtm::FastingStatus)";

	/**
	 * The cached OCL query for the '{@link #getFastingStatus(StudySubjectFinding) <em>Get Fasting Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatus(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FASTING_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  FastingStatus getFastingStatus(StudySubjectFinding studySubjectFinding) {
		if (GET_FASTING_STATUS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(96));
			try {
				GET_FASTING_STATUS__EOCL_QRY = helper.createQuery(GET_FASTING_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FASTING_STATUS__EOCL_QRY);
		return (FastingStatus) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventorFindingSeverity(StudySubjectFinding) <em>Get Eventor Finding Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventorFindingSeverity(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENTOR_FINDING_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventorFindingSeverity))->asSequence()->any(true).oclAsType(sdtm::EventorFindingSeverity)";

	/**
	 * The cached OCL query for the '{@link #getEventorFindingSeverity(StudySubjectFinding) <em>Get Eventor Finding Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventorFindingSeverity(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENTOR_FINDING_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventorFindingSeverity getEventorFindingSeverity(StudySubjectFinding studySubjectFinding) {
		if (GET_EVENTOR_FINDING_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(97));
			try {
				GET_EVENTOR_FINDING_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENTOR_FINDING_SEVERITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENTOR_FINDING_SEVERITY__EOCL_QRY);
		return (EventorFindingSeverity) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDeathRelationship(StudySubjectFinding) <em>Get Death Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathRelationship(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DEATH_RELATIONSHIP__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DeathRelationship))->asSequence()->any(true).oclAsType(sdtm::DeathRelationship)";

	/**
	 * The cached OCL query for the '{@link #getDeathRelationship(StudySubjectFinding) <em>Get Death Relationship</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathRelationship(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DEATH_RELATIONSHIP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DeathRelationship getDeathRelationship(StudySubjectFinding studySubjectFinding) {
		if (GET_DEATH_RELATIONSHIP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(98));
			try {
				GET_DEATH_RELATIONSHIP__EOCL_QRY = helper.createQuery(GET_DEATH_RELATIONSHIP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DEATH_RELATIONSHIP__EOCL_QRY);
		return (DeathRelationship) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssayQuantitation(StudySubjectFinding) <em>Get Assay Quantitation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssayQuantitation(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSAY_QUANTITATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::AssayQuantitation))->asSequence()->any(true).oclAsType(sdtm::AssayQuantitation)";

	/**
	 * The cached OCL query for the '{@link #getAssayQuantitation(StudySubjectFinding) <em>Get Assay Quantitation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssayQuantitation(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSAY_QUANTITATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  AssayQuantitation getAssayQuantitation(StudySubjectFinding studySubjectFinding) {
		if (GET_ASSAY_QUANTITATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(99));
			try {
				GET_ASSAY_QUANTITATION__EOCL_QRY = helper.createQuery(GET_ASSAY_QUANTITATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSAY_QUANTITATION__EOCL_QRY);
		return (AssayQuantitation) query.evaluate(studySubjectFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(StudySubjectFinding) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(StudySubjectFinding) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(StudySubjectFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(StudySubjectFinding studySubjectFinding) {
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(100));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(studySubjectFinding);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // StudySubjectFindingOperations