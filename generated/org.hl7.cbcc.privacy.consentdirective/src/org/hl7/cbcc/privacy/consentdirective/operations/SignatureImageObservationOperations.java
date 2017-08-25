/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signature Image Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureImageObservationOperations extends ClinicalStatementOperations {
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
	protected SignatureImageObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignatureImageObservationTemplateId(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageObservationTemplateId(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURE_IMAGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.19')";

	/**
	 * The cached OCL invariant for the '{@link #validateSignatureImageObservationTemplateId(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageObservationTemplateId(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SIGNATURE_IMAGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signatureImageObservation The receiving '<em><b>Signature Image Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureImageObservationTemplateId(
			SignatureImageObservation signatureImageObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SIGNATURE_IMAGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURE_IMAGE_OBSERVATION);
			try {
				VALIDATE_SIGNATURE_IMAGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SIGNATURE_IMAGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SIGNATURE_IMAGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				signatureImageObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SIGNATURE_IMAGE_OBSERVATION__SIGNATURE_IMAGE_OBSERVATION_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"SignatureImageObservationSignatureImageObservationTemplateId"),
						new Object[] { signatureImageObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignatureImageObservationMoodCode(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageObservationMoodCode(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURE_IMAGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateSignatureImageObservationMoodCode(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageObservationMoodCode(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SIGNATURE_IMAGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signatureImageObservation The receiving '<em><b>Signature Image Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureImageObservationMoodCode(SignatureImageObservation signatureImageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SIGNATURE_IMAGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURE_IMAGE_OBSERVATION);
			try {
				VALIDATE_SIGNATURE_IMAGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SIGNATURE_IMAGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SIGNATURE_IMAGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				signatureImageObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SIGNATURE_IMAGE_OBSERVATION__SIGNATURE_IMAGE_OBSERVATION_MOOD_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"SignatureImageObservationSignatureImageObservationMoodCode"),
						new Object[] { signatureImageObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSignatureImageObservationValue(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageObservationValue(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNATURE_IMAGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSignatureImageObservationValue(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignatureImageObservationValue(SignatureImageObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SIGNATURE_IMAGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param signatureImageObservation The receiving '<em><b>Signature Image Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureImageObservationValue(SignatureImageObservation signatureImageObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SIGNATURE_IMAGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SIGNATURE_IMAGE_OBSERVATION);
			try {
				VALIDATE_SIGNATURE_IMAGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SIGNATURE_IMAGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SIGNATURE_IMAGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				signatureImageObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SIGNATURE_IMAGE_OBSERVATION__SIGNATURE_IMAGE_OBSERVATION_VALUE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"SignatureImageObservationSignatureImageObservationValue"),
						new Object[] { signatureImageObservation }));
			}

			return false;
		}
		return true;
	}

} // SignatureImageObservationOperations
