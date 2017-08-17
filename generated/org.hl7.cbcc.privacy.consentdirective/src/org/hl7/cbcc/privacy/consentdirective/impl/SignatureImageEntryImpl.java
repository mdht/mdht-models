/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.EntryImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry;
import org.hl7.cbcc.privacy.consentdirective.operations.SignatureImageEntryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Image Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SignatureImageEntryImpl extends EntryImpl implements SignatureImageEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImageEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.SIGNATURE_IMAGE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignatureImageEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignatureImageEntryOperations.validateSignatureImageEntryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignatureImageEntryObservationMedia(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignatureImageEntryOperations.validateSignatureImageEntryObservationMedia(this, diagnostics, context);
	}
} //SignatureImageEntryImpl
