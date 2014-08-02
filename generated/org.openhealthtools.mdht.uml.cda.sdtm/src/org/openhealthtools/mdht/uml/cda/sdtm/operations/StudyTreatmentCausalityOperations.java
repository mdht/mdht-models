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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Treatment Causality</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality#validateStudyTreatmentCausalityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality#validateStudyTreatmentCausalityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality#validateStudyTreatmentCausalityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality#validateStudyTreatmentCausalityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality#validateStudyTreatmentCausalityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality#validateStudyTreatmentCausalityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality#validateStudyTreatmentCausalityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudyTreatmentCausalityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyTreatmentCausalityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentCausalityTemplateId(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityTemplateId(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_CAUSALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.90')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentCausalityTemplateId(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityTemplateId(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_CAUSALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentCausality The receiving '<em><b>Study Treatment Causality</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentCausalityTemplateId(StudyTreatmentCausality studyTreatmentCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_CAUSALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_CAUSALITY);
			try {
				VALIDATE_STUDY_TREATMENT_CAUSALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_CAUSALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_CAUSALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentCausality)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_CAUSALITY__STUDY_TREATMENT_CAUSALITY_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentCausalityTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentCausality, context) }),
						 new Object [] { studyTreatmentCausality }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentCausalityClassCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityClassCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentCausalityClassCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityClassCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentCausality The receiving '<em><b>Study Treatment Causality</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentCausalityClassCode(StudyTreatmentCausality studyTreatmentCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_CAUSALITY);
			try {
				VALIDATE_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentCausality)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_CAUSALITY__STUDY_TREATMENT_CAUSALITY_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentCausalityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentCausality, context) }),
						 new Object [] { studyTreatmentCausality }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentCausalityMoodCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityMoodCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentCausalityMoodCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityMoodCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentCausality The receiving '<em><b>Study Treatment Causality</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentCausalityMoodCode(StudyTreatmentCausality studyTreatmentCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_CAUSALITY);
			try {
				VALIDATE_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentCausality)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_CAUSALITY__STUDY_TREATMENT_CAUSALITY_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentCausalityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentCausality, context) }),
						 new Object [] { studyTreatmentCausality }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentCausalityCodeP(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityCodeP(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentCausalityCodeP(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityCodeP(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentCausality The receiving '<em><b>Study Treatment Causality</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentCausalityCodeP(StudyTreatmentCausality studyTreatmentCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_CAUSALITY);
			try {
				VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentCausality)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_CAUSALITY__STUDY_TREATMENT_CAUSALITY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentCausalityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentCausality, context) }),
						 new Object [] { studyTreatmentCausality }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentCausalityCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'STCtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentCausalityCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityCode(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentCausality The receiving '<em><b>Study Treatment Causality</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentCausalityCode(StudyTreatmentCausality studyTreatmentCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_CAUSALITY);
			try {
				VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentCausality)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_CAUSALITY__STUDY_TREATMENT_CAUSALITY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentCausalityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentCausality, context) }),
						 new Object [] { studyTreatmentCausality }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentCausalityValue(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityValue(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentCausalityValue(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityValue(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentCausality The receiving '<em><b>Study Treatment Causality</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentCausalityValue(StudyTreatmentCausality studyTreatmentCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_CAUSALITY);
			try {
				VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentCausality)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_CAUSALITY__STUDY_TREATMENT_CAUSALITY_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentCausalityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentCausality, context) }),
						 new Object [] { studyTreatmentCausality }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTreatmentCausalityValueP(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityValueP(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTreatmentCausalityValueP(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Treatment Causality Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTreatmentCausalityValueP(StudyTreatmentCausality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTreatmentCausality The receiving '<em><b>Study Treatment Causality</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTreatmentCausalityValueP(StudyTreatmentCausality studyTreatmentCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TREATMENT_CAUSALITY);
			try {
				VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_TREATMENT_CAUSALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyTreatmentCausality)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TREATMENT_CAUSALITY__STUDY_TREATMENT_CAUSALITY_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTreatmentCausalityValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTreatmentCausality, context) }),
						 new Object [] { studyTreatmentCausality }));
			}
			 
			return false;
		}
		return true;
	}

} // StudyTreatmentCausalityOperations