/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.Participant2Impl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider;
import org.hl7.cbcc.privacy.consentdirective.operations.IIHIReceivingProviderOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IIHI Receiving Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IIHIReceivingProviderImpl extends Participant2Impl implements IIHIReceivingProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IIHIReceivingProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.IIHI_RECEIVING_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIIHIReceivingProviderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IIHIReceivingProviderOperations.validateIIHIReceivingProviderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIIHIReceivingProviderTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IIHIReceivingProviderOperations.validateIIHIReceivingProviderTypeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIIHIReceivingProviderTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IIHIReceivingProviderOperations.validateIIHIReceivingProviderTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIIHIReceivingProviderParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IIHIReceivingProviderOperations.validateIIHIReceivingProviderParticipantRole(this, diagnostics, context);
	}
} //IIHIReceivingProviderImpl
