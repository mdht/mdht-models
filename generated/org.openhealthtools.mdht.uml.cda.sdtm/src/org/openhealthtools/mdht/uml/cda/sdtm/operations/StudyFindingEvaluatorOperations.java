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
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Finding Evaluator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator#validateStudyFindingEvaluatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator#validateStudyFindingEvaluatorTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator#validateStudyFindingEvaluatorRoleOfEvaluator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Role Of Evaluator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudyFindingEvaluatorOperations extends org.eclipse.mdht.uml.cda.operations.Participant2Operations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyFindingEvaluatorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyFindingEvaluatorTemplateId(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyFindingEvaluatorTemplateId(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_FINDING_EVALUATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.84')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyFindingEvaluatorTemplateId(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyFindingEvaluatorTemplateId(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STUDY_FINDING_EVALUATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyFindingEvaluator The receiving '<em><b>Study Finding Evaluator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyFindingEvaluatorTemplateId(StudyFindingEvaluator studyFindingEvaluator, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STUDY_FINDING_EVALUATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_FINDING_EVALUATOR);
			try {
				VALIDATE_STUDY_FINDING_EVALUATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STUDY_FINDING_EVALUATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STUDY_FINDING_EVALUATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(studyFindingEvaluator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_FINDING_EVALUATOR__STUDY_FINDING_EVALUATOR_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyFindingEvaluatorStudyFindingEvaluatorTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyFindingEvaluator, context) }),
						 new Object [] { studyFindingEvaluator }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyFindingEvaluatorTypeCode(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyFindingEvaluatorTypeCode(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_FINDING_EVALUATOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::PRF";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyFindingEvaluatorTypeCode(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyFindingEvaluatorTypeCode(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STUDY_FINDING_EVALUATOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyFindingEvaluator The receiving '<em><b>Study Finding Evaluator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyFindingEvaluatorTypeCode(StudyFindingEvaluator studyFindingEvaluator, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STUDY_FINDING_EVALUATOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_FINDING_EVALUATOR);
			try {
				VALIDATE_STUDY_FINDING_EVALUATOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STUDY_FINDING_EVALUATOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STUDY_FINDING_EVALUATOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(studyFindingEvaluator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_FINDING_EVALUATOR__STUDY_FINDING_EVALUATOR_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyFindingEvaluatorStudyFindingEvaluatorTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyFindingEvaluator, context) }),
						 new Object [] { studyFindingEvaluator }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyFindingEvaluatorRoleOfEvaluator(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Role Of Evaluator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyFindingEvaluatorRoleOfEvaluator(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_FINDING_EVALUATOR_ROLE_OF_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyFindingEvaluatorRoleOfEvaluator(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Role Of Evaluator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyFindingEvaluatorRoleOfEvaluator(StudyFindingEvaluator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STUDY_FINDING_EVALUATOR_ROLE_OF_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyFindingEvaluator The receiving '<em><b>Study Finding Evaluator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyFindingEvaluatorRoleOfEvaluator(StudyFindingEvaluator studyFindingEvaluator, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STUDY_FINDING_EVALUATOR_ROLE_OF_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_FINDING_EVALUATOR);
			try {
				VALIDATE_STUDY_FINDING_EVALUATOR_ROLE_OF_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STUDY_FINDING_EVALUATOR_ROLE_OF_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STUDY_FINDING_EVALUATOR_ROLE_OF_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(studyFindingEvaluator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_FINDING_EVALUATOR__STUDY_FINDING_EVALUATOR_ROLE_OF_EVALUATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyFindingEvaluatorStudyFindingEvaluatorRoleOfEvaluator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyFindingEvaluator, context) }),
						 new Object [] { studyFindingEvaluator }));
			}
			 
			return false;
		}
		return true;
	}

} // StudyFindingEvaluatorOperations