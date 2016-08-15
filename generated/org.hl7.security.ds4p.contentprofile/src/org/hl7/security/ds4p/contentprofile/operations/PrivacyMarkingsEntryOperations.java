/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.EntryOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry;

import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Markings Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry#validatePrivacyMarkingsEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Entry Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry#validatePrivacyMarkingsEntryOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Entry Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyMarkingsEntryOperations extends EntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyMarkingsEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyMarkingsEntryTemplateId(PrivacyMarkingsEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsEntryTemplateId(PrivacyMarkingsEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.9')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyMarkingsEntryTemplateId(PrivacyMarkingsEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsEntryTemplateId(PrivacyMarkingsEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyMarkingsEntry The receiving '<em><b>Privacy Markings Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyMarkingsEntryTemplateId(PrivacyMarkingsEntry privacyMarkingsEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_ENTRY);
			try {
				VALIDATE_PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyMarkingsEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_MARKINGS_ENTRY__PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyMarkingsEntryPrivacyMarkingsEntryTemplateId"),
						 new Object [] { privacyMarkingsEntry }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyMarkingsEntryOrganizer(PrivacyMarkingsEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Entry Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsEntryOrganizer(PrivacyMarkingsEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_MARKINGS_ENTRY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.organizer->one(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(contentprofile::PrivacyAnnotation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyMarkingsEntryOrganizer(PrivacyMarkingsEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Entry Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsEntryOrganizer(PrivacyMarkingsEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_MARKINGS_ENTRY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyMarkingsEntry The receiving '<em><b>Privacy Markings Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyMarkingsEntryOrganizer(PrivacyMarkingsEntry privacyMarkingsEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRIVACY_MARKINGS_ENTRY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_ENTRY);
			try {
				VALIDATE_PRIVACY_MARKINGS_ENTRY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_MARKINGS_ENTRY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_MARKINGS_ENTRY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyMarkingsEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_MARKINGS_ENTRY__PRIVACY_MARKINGS_ENTRY_ORGANIZER,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyMarkingsEntryPrivacyMarkingsEntryOrganizer"),
						 new Object [] { privacyMarkingsEntry }));
			}
			 
			return false;
		}
		return true;
	}

} // PrivacyMarkingsEntryOperations