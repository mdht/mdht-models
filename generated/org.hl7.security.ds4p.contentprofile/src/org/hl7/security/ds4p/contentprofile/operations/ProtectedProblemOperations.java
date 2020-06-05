/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.ProtectedProblem;
import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protected Problem</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ProtectedProblem#validateProtectedProblemProblemProvenance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protected Problem Problem Provenance</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ProtectedProblem#validateProtectedProblemPrivacyAnnotations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protected Problem Privacy Annotations</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ProtectedProblem#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtectedProblemOperations extends ProblemObservationOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected ProtectedProblemOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protectedProblem The receiving '<em><b>Protected Problem</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationTemplateId(ProtectedProblem protectedProblem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProtectedProblemProblemObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PROTECTED_PROBLEM);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protectedProblem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PROTECTED_PROBLEM__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("ProtectedProblemProblemObservationTemplateId"),
						 new Object [] { protectedProblem }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtectedProblemProblemProvenance(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protected Problem Problem Provenance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtectedProblemProblemProvenance(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTECTED_PROBLEM_PROBLEM_PROVENANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(contentprofile::MandatoryEntryProvenance))";

	/**
	 * The cached OCL invariant for the '{@link #validateProtectedProblemProblemProvenance(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protected Problem Problem Provenance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtectedProblemProblemProvenance(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROTECTED_PROBLEM_PROBLEM_PROVENANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protectedProblem The receiving '<em><b>Protected Problem</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtectedProblemProblemProvenance(ProtectedProblem protectedProblem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProtectedProblemProtectedProblemProblemProvenance","ERROR");
    
  	  
  	  
		if (VALIDATE_PROTECTED_PROBLEM_PROBLEM_PROVENANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PROTECTED_PROBLEM);
			try {
				VALIDATE_PROTECTED_PROBLEM_PROBLEM_PROVENANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROTECTED_PROBLEM_PROBLEM_PROVENANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROTECTED_PROBLEM_PROBLEM_PROVENANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protectedProblem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PROTECTED_PROBLEM__PROTECTED_PROBLEM_PROBLEM_PROVENANCE,
						 CONTENTPROFILEPlugin.INSTANCE.getString("ProtectedProblemProtectedProblemProblemProvenance"),
						 new Object [] { protectedProblem }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtectedProblemPrivacyAnnotations(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protected Problem Privacy Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtectedProblemPrivacyAnnotations(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(contentprofile::PrivacyAnnotationEntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProtectedProblemPrivacyAnnotations(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protected Problem Privacy Annotations</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtectedProblemPrivacyAnnotations(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(ProtectedProblem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protectedProblem The receiving '<em><b>Protected Problem</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtectedProblemPrivacyAnnotations(ProtectedProblem protectedProblem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProtectedProblemProtectedProblemPrivacyAnnotations","ERROR");
    
  	  
  	  
		if (VALIDATE_PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PROTECTED_PROBLEM);
			try {
				VALIDATE_PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protectedProblem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PROTECTED_PROBLEM__PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS,
						 CONTENTPROFILEPlugin.INSTANCE.getString("ProtectedProblemProtectedProblemPrivacyAnnotations"),
						 new Object [] { protectedProblem }));
			}
			 
			return false;
		}
		return true;
	}

} // ProtectedProblemOperations
