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

import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Data Non Clinical Trials</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Nonhuman Subject Data Document Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsStudyRelationship2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Study Relationship2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsSubjectParticipation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Subject Participation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#getNonhumanSubjectDataDocumentBodies() <em>Get Nonhuman Subject Data Document Bodies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectDataNonClinicalTrialsOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectDataNonClinicalTrialsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsTemplateId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsTemplateId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsTemplateId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsTemplateId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsTemplateId(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsClassCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsClassCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsClassCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsClassCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsClassCode(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsMoodCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsMoodCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsMoodCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsMoodCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsMoodCode(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsCodeP(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsCodeP(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsCodeP(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsCodeP(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsCodeP(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsCode(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsConfidentialityCodeP(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Confidentiality Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsConfidentialityCodeP(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsConfidentialityCodeP(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Confidentiality Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsConfidentialityCodeP(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsConfidentialityCodeP(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsConfidentialityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsConfidentialityCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsConfidentialityCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.25')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsConfidentialityCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsConfidentialityCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsConfidentialityCode(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsConfidentialityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsEffectiveTime(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsEffectiveTime(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsEffectiveTime(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsEffectiveTime(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsEffectiveTime(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsId(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsLanguageCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsLanguageCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsLanguageCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsLanguageCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsLanguageCode(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_LANGUAGE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsLanguageCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsRealmCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsRealmCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (not self.realmCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsRealmCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsRealmCode(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsRealmCode(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_REALM_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsRealmCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsSetId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsSetId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsSetId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsSetId(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsSetId(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_SET_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsSetId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsVersionNumber(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsVersionNumber(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsVersionNumber(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsVersionNumber(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsVersionNumber(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_VERSION_NUMBER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsVersionNumber", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Nonhuman Subject Data Document Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::NonhumanSubjectDataDocumentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Nonhuman Subject Data Document Body</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsStudyRelationship2(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Study Relationship2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsStudyRelationship2(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_STUDY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsStudyRelationship2(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Study Relationship2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsStudyRelationship2(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_STUDY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsStudyRelationship2(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_STUDY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_STUDY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_STUDY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_STUDY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_STUDY_RELATIONSHIP2,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsStudyRelationship2", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsSubjectParticipation2(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Subject Participation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsSubjectParticipation2(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SUBJECT_PARTICIPATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsSubjectParticipation2(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Subject Participation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsSubjectParticipation2(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SUBJECT_PARTICIPATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsSubjectParticipation2(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SUBJECT_PARTICIPATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SUBJECT_PARTICIPATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SUBJECT_PARTICIPATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SUBJECT_PARTICIPATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_SUBJECT_PARTICIPATION2,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsSubjectParticipation2", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsCustodian(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsCustodian(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsCustodian(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsCustodian(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsCustodian(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_CUSTODIAN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsCustodian", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectDataNonClinicalTrialsAuthor(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsAuthor(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectDataNonClinicalTrialsAuthor(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectDataNonClinicalTrialsAuthor(SubjectDataNonClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectDataNonClinicalTrials The receiving '<em><b>Subject Data Non Clinical Trials</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectDataNonClinicalTrialsAuthor(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS);
			try {
				VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataNonClinicalTrials)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_DATA_NON_CLINICAL_TRIALS__SUBJECT_DATA_NON_CLINICAL_TRIALS_AUTHOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataNonClinicalTrialsAuthor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataNonClinicalTrials, context) }),
						 new Object [] { subjectDataNonClinicalTrials }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonhumanSubjectDataDocumentBodies(SubjectDataNonClinicalTrials) <em>Get Nonhuman Subject Data Document Bodies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanSubjectDataDocumentBodies(SubjectDataNonClinicalTrials)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODIES__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::NonhumanSubjectDataDocumentSection)).oclAsType(sdtm::NonhumanSubjectDataDocumentSection)";

	/**
	 * The cached OCL query for the '{@link #getNonhumanSubjectDataDocumentBodies(SubjectDataNonClinicalTrials) <em>Get Nonhuman Subject Data Document Bodies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanSubjectDataDocumentBodies(SubjectDataNonClinicalTrials)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<NonhumanSubjectDataDocumentSection> getNonhumanSubjectDataDocumentBodies(SubjectDataNonClinicalTrials subjectDataNonClinicalTrials) {
		if (GET_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS, SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS.getEAllOperations().get(47));
			try {
				GET_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODIES__EOCL_QRY = helper.createQuery(GET_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonhumanSubjectDataDocumentSection> result = (Collection<NonhumanSubjectDataDocumentSection>) query.evaluate(subjectDataNonClinicalTrials);
		return new BasicEList.UnmodifiableEList<NonhumanSubjectDataDocumentSection>(result.size(), result.toArray());
	}

} // SubjectDataNonClinicalTrialsOperations