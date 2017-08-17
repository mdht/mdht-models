/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.ObservationMediaImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation;
import org.hl7.cbcc.privacy.consentdirective.operations.SignatureImageObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Image Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SignatureImageObservationImpl extends ObservationMediaImpl implements SignatureImageObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImageObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.SIGNATURE_IMAGE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignatureImageObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignatureImageObservationOperations.validateSignatureImageObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignatureImageObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignatureImageObservationOperations.validateSignatureImageObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignatureImageObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignatureImageObservationOperations.validateSignatureImageObservationValue(this, diagnostics, context);
	}
} //SignatureImageObservationImpl
