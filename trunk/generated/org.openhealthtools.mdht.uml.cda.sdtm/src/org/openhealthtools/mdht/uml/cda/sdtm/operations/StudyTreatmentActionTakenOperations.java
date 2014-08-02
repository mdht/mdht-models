/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Treatment Action Taken</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken#validateStudyTreatmentActionTakenTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken#validateStudyTreatmentActionTakenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken#validateStudyTreatmentActionTakenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken#validateStudyTreatmentActionTakenCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken#validateStudyTreatmentActionTakenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken#validateStudyTreatmentActionTakenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken#validateStudyTreatmentActionTakenValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudyTreatmentActionTakenOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyTreatmentActionTakenOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentActionTakenTemplateId(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenTemplateId(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.89')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentActionTakenTemplateId(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenTemplateId(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentActionTaken The receiving '<em><b>Study Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentActionTakenTemplateId(StudyTreatmentActionTaken studyTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_ACTION_TAKEN__STUDY_TREATMENT_ACTION_TAKEN_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentActionTakenTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentActionTaken, context) }),
						 new Object [] { studyTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentActionTakenClassCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenClassCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentActionTakenClassCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenClassCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentActionTaken The receiving '<em><b>Study Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentActionTakenClassCode(StudyTreatmentActionTaken studyTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_ACTION_TAKEN__STUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentActionTakenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentActionTaken, context) }),
						 new Object [] { studyTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentActionTakenMoodCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenMoodCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentActionTakenMoodCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenMoodCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentActionTaken The receiving '<em><b>Study Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentActionTakenMoodCode(StudyTreatmentActionTaken studyTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_ACTION_TAKEN__STUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentActionTakenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentActionTaken, context) }),
						 new Object [] { studyTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentActionTakenCodeP(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenCodeP(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentActionTakenCodeP(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenCodeP(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentActionTaken The receiving '<em><b>Study Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentActionTakenCodeP(StudyTreatmentActionTaken studyTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_ACTION_TAKEN__STUDY_TREATMENT_ACTION_TAKEN_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentActionTakenCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentActionTaken, context) }),
						 new Object [] { studyTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentActionTakenCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C66767' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentActionTakenCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenCode(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentActionTaken The receiving '<em><b>Study Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentActionTakenCode(StudyTreatmentActionTaken studyTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_ACTION_TAKEN__STUDY_TREATMENT_ACTION_TAKEN_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentActionTakenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentActionTaken, context) }),
						 new Object [] { studyTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentActionTakenValue(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenValue(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentActionTakenValue(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenValue(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentActionTaken The receiving '<em><b>Study Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentActionTakenValue(StudyTreatmentActionTaken studyTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_ACTION_TAKEN__STUDY_TREATMENT_ACTION_TAKEN_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentActionTakenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentActionTaken, context) }),
						 new Object [] { studyTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentActionTakenValueP(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenValueP(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentActionTakenValueP(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Action Taken Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentActionTakenValueP(StudyTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentActionTaken The receiving '<em><b>Study Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentActionTakenValueP(StudyTreatmentActionTaken studyTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_ACTION_TAKEN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_ACTION_TAKEN__STUDY_TREATMENT_ACTION_TAKEN_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentActionTakenValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentActionTaken, context) }),
						 new Object [] { studyTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

} // StudyTreatmentActionTakenOperations