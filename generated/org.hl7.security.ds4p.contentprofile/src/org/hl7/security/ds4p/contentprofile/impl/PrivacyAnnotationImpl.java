/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation;
import org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation;
import org.hl7.security.ds4p.contentprofile.PrivacyAnnotation;
import org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation;
import org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation;

import org.hl7.security.ds4p.contentprofile.operations.PrivacyAnnotationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyAnnotationImpl extends OrganizerImpl implements PrivacyAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationObligationPolicySecurityObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationObligationPolicySecurityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationRefrainPolicySecurityObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationRefrainPolicySecurityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationPurposeOfUseSecurityObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationPurposeOfUseSecurityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationConfidentialityCodeSecurityObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyAnnotationOperations.validatePrivacyAnnotationConfidentialityCodeSecurityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObligationPolicySecurityObservation> getObligationPolicySecurityObservations() {
		return PrivacyAnnotationOperations.getObligationPolicySecurityObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefrainPolicySecurityObservation> getRefrainPolicySecurityObservations() {
		return PrivacyAnnotationOperations.getRefrainPolicySecurityObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PurposeOfUseSecurityObservation> getPurposeOfUseSecurityObservations() {
		return PrivacyAnnotationOperations.getPurposeOfUseSecurityObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialitySecurityObservation getConfidentialityCodeSecurityObservation() {
		return PrivacyAnnotationOperations.getConfidentialityCodeSecurityObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyAnnotation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PrivacyAnnotation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PrivacyAnnotationImpl
