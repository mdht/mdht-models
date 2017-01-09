/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection;

import org.hl7.security.ds4p.contentprofile.operations.PrivacyMarkingsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Markings Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyMarkingsSectionImpl extends SectionImpl implements PrivacyMarkingsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyMarkingsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyMarkingsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyMarkingsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyMarkingsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyMarkingsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyMarkingsSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionEntry1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyMarkingsSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PrivacyMarkingsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PrivacyMarkingsSectionImpl
