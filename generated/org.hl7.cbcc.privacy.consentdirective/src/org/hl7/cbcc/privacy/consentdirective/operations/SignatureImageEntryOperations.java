/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.EntryOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signature Image Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry#validateSignatureImageEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Entry Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry#validateSignatureImageEntryObservationMedia(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Entry Observation Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureImageEntryOperations extends EntryOperations {
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
	protected SignatureImageEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignatureImageEntryTemplateId(SignatureImageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageEntryTemplateId(SignatureImageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURE_IMAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateSignatureImageEntryTemplateId(SignatureImageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageEntryTemplateId(SignatureImageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SIGNATURE_IMAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signatureImageEntry The receiving '<em><b>Signature Image Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureImageEntryTemplateId(SignatureImageEntry signatureImageEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SIGNATURE_IMAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURE_IMAGE_ENTRY);
			try {
				VALIDATE_SIGNATURE_IMAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SIGNATURE_IMAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SIGNATURE_IMAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				signatureImageEntry)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SIGNATURE_IMAGE_ENTRY__SIGNATURE_IMAGE_ENTRY_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("SignatureImageEntrySignatureImageEntryTemplateId"),
						new Object[] { signatureImageEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignatureImageEntryObservationMedia(SignatureImageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Entry Observation Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageEntryObservationMedia(SignatureImageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURE_IMAGE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationMedia->one(observationMedia : cda::ObservationMedia | not observationMedia.oclIsUndefined() and observationMedia.oclIsKindOf(consentdirective::SignatureImageObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSignatureImageEntryObservationMedia(SignatureImageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Entry Observation Media</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageEntryObservationMedia(SignatureImageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SIGNATURE_IMAGE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signatureImageEntry The receiving '<em><b>Signature Image Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureImageEntryObservationMedia(SignatureImageEntry signatureImageEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SIGNATURE_IMAGE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURE_IMAGE_ENTRY);
			try {
				VALIDATE_SIGNATURE_IMAGE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SIGNATURE_IMAGE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SIGNATURE_IMAGE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				signatureImageEntry)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SIGNATURE_IMAGE_ENTRY__SIGNATURE_IMAGE_ENTRY_OBSERVATION_MEDIA,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"SignatureImageEntrySignatureImageEntryObservationMedia"),
						new Object[] { signatureImageEntry }));
			}

			return false;
		}
		return true;
	}

} // SignatureImageEntryOperations
