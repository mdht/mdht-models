/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.SecurityLabel;
import org.hl7.cbcc.privacy.consentdirective.operations.SecurityLabelOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SecurityLabelImpl extends OrganizerImpl implements SecurityLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.SECURITY_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityLabelTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SecurityLabelOperations.validateSecurityLabelTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityLabelComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SecurityLabelOperations.validateSecurityLabelComponent(this, diagnostics, context);
	}
} //SecurityLabelImpl
