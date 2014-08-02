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

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionnaire Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireFindingOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireFindingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingTemplateId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingTemplateId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.72')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingTemplateId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingTemplateId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingTemplateId(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingClassCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingClassCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingClassCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingClassCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingClassCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingMoodCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingMoodCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingMoodCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingMoodCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingMoodCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingId(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingCodeP(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingCodeP(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingCodeP(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingCodeP(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingCodeP(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'locally defined' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingStatusCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingStatusCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingStatusCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingStatusCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingStatusCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingValue(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingInterpretationCodeP(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingInterpretationCodeP(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingInterpretationCodeP(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingInterpretationCodeP(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingInterpretationCodeP(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_INTERPRETATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingInterpretationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingInterpretationCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingInterpretationCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX')))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingInterpretationCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingInterpretationCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingInterpretationCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_INTERPRETATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingTimingReference(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingTimingReference(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::TimingReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingTimingReference(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Timing Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingTimingReference(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingTimingReference(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_TIMING_REFERENCE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingDataCollection(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingDataCollection(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingDataCollection(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingDataCollection(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingDataCollection(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingComment(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingComment(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingComment(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingComment(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingComment(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingDomainAssignment(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingDomainAssignment(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingDomainAssignment(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingDomainAssignment(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingDomainAssignment(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingRelatedRecord(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingRelatedRecord(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingRelatedRecord(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingRelatedRecord(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingRelatedRecord(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingSupplementalValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingSupplementalValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingSupplementalValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingSupplementalValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingSupplementalValue(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingCategory(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingCategory(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingCategory(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingCategory(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingCategory(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingSubCategory(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingSubCategory(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingSubCategory(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingSubCategory(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingSubCategory(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionnaireFindingFindingAbout(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingFindingAbout(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONNAIRE_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionnaireFindingFindingAbout(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionnaireFindingFindingAbout(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateQuestionnaireFindingFindingAbout(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_QUESTIONNAIRE_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
			try {
				VALIDATE_QUESTIONNAIRE_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
						 new Object [] { questionnaireFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(QuestionnaireFinding) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(QuestionnaireFinding) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(QuestionnaireFinding questionnaireFinding) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(73));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(questionnaireFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(QuestionnaireFinding) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(QuestionnaireFinding) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(QuestionnaireFinding questionnaireFinding) {
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(74));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(questionnaireFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTimingReference(QuestionnaireFinding) <em>Get Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::TimingReference))->asSequence()->any(true).oclAsType(sdtm::TimingReference)";

	/**
	 * The cached OCL query for the '{@link #getTimingReference(QuestionnaireFinding) <em>Get Timing Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TimingReference getTimingReference(QuestionnaireFinding questionnaireFinding) {
		if (GET_TIMING_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(75));
			try {
				GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
		return (TimingReference) query.evaluate(questionnaireFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(QuestionnaireFinding) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(QuestionnaireFinding) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(QuestionnaireFinding questionnaireFinding) {
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(76));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(questionnaireFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(QuestionnaireFinding) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(QuestionnaireFinding) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(QuestionnaireFinding questionnaireFinding) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(77));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(questionnaireFinding);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(QuestionnaireFinding) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(QuestionnaireFinding) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(QuestionnaireFinding questionnaireFinding) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(78));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(questionnaireFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(QuestionnaireFinding) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(QuestionnaireFinding) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(QuestionnaireFinding questionnaireFinding) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(79));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(questionnaireFinding);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(QuestionnaireFinding) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(QuestionnaireFinding) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(QuestionnaireFinding questionnaireFinding) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(80));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(questionnaireFinding);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(QuestionnaireFinding) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(QuestionnaireFinding) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(QuestionnaireFinding questionnaireFinding) {
		if (GET_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(81));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(questionnaireFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(QuestionnaireFinding) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(QuestionnaireFinding) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(QuestionnaireFinding questionnaireFinding) {
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(82));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(questionnaireFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(QuestionnaireFinding) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(QuestionnaireFinding) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(QuestionnaireFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(QuestionnaireFinding questionnaireFinding) {
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(83));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(questionnaireFinding);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // QuestionnaireFindingOperations