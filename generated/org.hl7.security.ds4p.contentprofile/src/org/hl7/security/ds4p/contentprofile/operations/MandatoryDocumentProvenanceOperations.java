/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.AuthorOperations;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance;

import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mandatory Document Provenance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance#validateMandatoryDocumentProvenanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance#validateMandatoryDocumentProvenanceTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Time</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance#validateMandatoryDocumentProvenanceAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryDocumentProvenanceOperations extends AuthorOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryDocumentProvenanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryDocumentProvenanceTemplateId(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentProvenanceTemplateId(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryDocumentProvenanceTemplateId(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentProvenanceTemplateId(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryDocumentProvenance The receiving '<em><b>Mandatory Document Provenance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMandatoryDocumentProvenanceTemplateId(MandatoryDocumentProvenance mandatoryDocumentProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_PROVENANCE);
			try {
				VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mandatoryDocumentProvenance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_DOCUMENT_PROVENANCE__MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryDocumentProvenanceMandatoryDocumentProvenanceTemplateId"),
						 new Object [] { mandatoryDocumentProvenance }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryDocumentProvenanceTime(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentProvenanceTime(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryDocumentProvenanceTime(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentProvenanceTime(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryDocumentProvenance The receiving '<em><b>Mandatory Document Provenance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMandatoryDocumentProvenanceTime(MandatoryDocumentProvenance mandatoryDocumentProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_PROVENANCE);
			try {
				VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mandatoryDocumentProvenance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_DOCUMENT_PROVENANCE__MANDATORY_DOCUMENT_PROVENANCE_TIME,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryDocumentProvenanceMandatoryDocumentProvenanceTime"),
						 new Object [] { mandatoryDocumentProvenance }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryDocumentProvenanceAssignedAuthor(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentProvenanceAssignedAuthor(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(contentprofile::MandatoryDocumentAssignedAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryDocumentProvenanceAssignedAuthor(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentProvenanceAssignedAuthor(MandatoryDocumentProvenance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryDocumentProvenance The receiving '<em><b>Mandatory Document Provenance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMandatoryDocumentProvenanceAssignedAuthor(MandatoryDocumentProvenance mandatoryDocumentProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_PROVENANCE);
			try {
				VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mandatoryDocumentProvenance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.MANDATORY_DOCUMENT_PROVENANCE__MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR,
						 CONTENTPROFILEPlugin.INSTANCE.getString("MandatoryDocumentProvenanceMandatoryDocumentProvenanceAssignedAuthor"),
						 new Object [] { mandatoryDocumentProvenance }));
			}
			 
			return false;
		}
		return true;
	}

} // MandatoryDocumentProvenanceOperations