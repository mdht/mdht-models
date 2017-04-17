/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance;

import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mandatory Entry Provenance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance#validateMandatoryEntryProvenanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance#validateMandatoryEntryProvenanceTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Time</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance#validateMandatoryEntryProvenanceAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryEntryProvenanceOperations {
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
	protected MandatoryEntryProvenanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryEntryProvenanceTemplateId(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryProvenanceTemplateId(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryEntryProvenanceTemplateId(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryProvenanceTemplateId(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryEntryProvenance The receiving '<em><b>Mandatory Entry Provenance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMandatoryEntryProvenanceTemplateId(MandatoryEntryProvenance mandatoryEntryProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_PROVENANCE);
			try {
				VALIDATE_MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(mandatoryEntryProvenance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_ENTRY_PROVENANCE__MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryEntryProvenanceMandatoryEntryProvenanceTemplateId"),
						 new Object [] { mandatoryEntryProvenance }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryEntryProvenanceTime(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryProvenanceTime(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_ENTRY_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryEntryProvenanceTime(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryProvenanceTime(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MANDATORY_ENTRY_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryEntryProvenance The receiving '<em><b>Mandatory Entry Provenance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMandatoryEntryProvenanceTime(MandatoryEntryProvenance mandatoryEntryProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MANDATORY_ENTRY_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_PROVENANCE);
			try {
				VALIDATE_MANDATORY_ENTRY_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MANDATORY_ENTRY_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MANDATORY_ENTRY_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(mandatoryEntryProvenance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_ENTRY_PROVENANCE__MANDATORY_ENTRY_PROVENANCE_TIME,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryEntryProvenanceMandatoryEntryProvenanceTime"),
						 new Object [] { mandatoryEntryProvenance }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryEntryProvenanceAssignedAuthor(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryProvenanceAssignedAuthor(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(contentprofile::MandatoryEntryAssignedAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryEntryProvenanceAssignedAuthor(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryEntryProvenanceAssignedAuthor(MandatoryEntryProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryEntryProvenance The receiving '<em><b>Mandatory Entry Provenance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMandatoryEntryProvenanceAssignedAuthor(MandatoryEntryProvenance mandatoryEntryProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_PROVENANCE);
			try {
				VALIDATE_MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(mandatoryEntryProvenance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_ENTRY_PROVENANCE__MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryEntryProvenanceMandatoryEntryProvenanceAssignedAuthor"),
						 new Object [] { mandatoryEntryProvenance }));
			}
			 
			return false;
		}
		return true;
	}

} // MandatoryEntryProvenanceOperations