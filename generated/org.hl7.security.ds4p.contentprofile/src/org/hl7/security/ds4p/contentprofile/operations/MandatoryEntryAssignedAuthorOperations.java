/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.AssignedAuthorOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor;
import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mandatory Entry Assigned Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor#validateMandatoryEntryAssignedAuthorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor#validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Assigned Authoring Device</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor#validateMandatoryEntryAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor#validateMandatoryEntryAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Represented Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryEntryAssignedAuthorOperations extends AssignedAuthorOperations {

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
	protected MandatoryEntryAssignedAuthorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryEntryAssignedAuthorTemplateId(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryAssignedAuthorTemplateId(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryEntryAssignedAuthorTemplateId(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryAssignedAuthorTemplateId(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryEntryAssignedAuthor The receiving '<em><b>Mandatory Entry Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryEntryAssignedAuthorTemplateId(
			MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MandatoryEntryAssignedAuthorMandatoryEntryAssignedAuthorTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(mandatoryEntryAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_ENTRY_ASSIGNED_AUTHOR__MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryEntryAssignedAuthorMandatoryEntryAssignedAuthorTemplateId"),
						 new Object [] { mandatoryEntryAssignedAuthor }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Assigned Authoring Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Assigned Authoring Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryEntryAssignedAuthor The receiving '<em><b>Mandatory Entry Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(
			MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MandatoryEntryAssignedAuthorMandatoryEntryAssignedAuthorAssignedAuthoringDevice","ERROR");
    
  	  
  	  
		if (VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(mandatoryEntryAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_ENTRY_ASSIGNED_AUTHOR__MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryEntryAssignedAuthorMandatoryEntryAssignedAuthorAssignedAuthoringDevice"),
						 new Object [] { mandatoryEntryAssignedAuthor }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryEntryAssignedAuthorAssignedPerson(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryAssignedAuthorAssignedPerson(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryEntryAssignedAuthorAssignedPerson(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryAssignedAuthorAssignedPerson(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryEntryAssignedAuthor The receiving '<em><b>Mandatory Entry Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryEntryAssignedAuthorAssignedPerson(
			MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MandatoryEntryAssignedAuthorMandatoryEntryAssignedAuthorAssignedPerson","ERROR");
    
  	  
  	  
		if (VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(mandatoryEntryAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_ENTRY_ASSIGNED_AUTHOR__MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryEntryAssignedAuthorMandatoryEntryAssignedAuthorAssignedPerson"),
						 new Object [] { mandatoryEntryAssignedAuthor }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryEntryAssignedAuthorRepresentedOrganization(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryAssignedAuthorRepresentedOrganization(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryEntryAssignedAuthorRepresentedOrganization(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryAssignedAuthorRepresentedOrganization(MandatoryEntryAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryEntryAssignedAuthor The receiving '<em><b>Mandatory Entry Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryEntryAssignedAuthorRepresentedOrganization(
			MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MandatoryEntryAssignedAuthorMandatoryEntryAssignedAuthorRepresentedOrganization","ERROR");
    
  	  
  	  
		if (VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(mandatoryEntryAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_ENTRY_ASSIGNED_AUTHOR__MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryEntryAssignedAuthorMandatoryEntryAssignedAuthorRepresentedOrganization"),
						 new Object [] { mandatoryEntryAssignedAuthor }));
			}
			 
			return false;
		}
		return true;
	}

} // MandatoryEntryAssignedAuthorOperations
