/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.CertifyingDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certifying Death</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CertifyingDeathImpl extends ObservationImpl implements CertifyingDeath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertifyingDeathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsdrPackage.Literals.CERTIFYING_DEATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCertifyingDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CertifyingDeathOperations.validateCertifyingDeathTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCertifyingDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CertifyingDeathOperations.validateCertifyingDeathClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCertifyingDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CertifyingDeathOperations.validateCertifyingDeathMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCertifyingDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CertifyingDeathOperations.validateCertifyingDeathCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCertifyingDeathEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CertifyingDeathOperations.validateCertifyingDeathEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCertifyingDeathCertificationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CertifyingDeathOperations.validateCertifyingDeathCertificationPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertifyingDeath init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public CertifyingDeath init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //CertifyingDeathImpl
