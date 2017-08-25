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
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection;

import org.hl7.security.ds4p.contentprofile.operations.PrivacySegmentedSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Segmented Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacySegmentedSectionImpl extends SectionImpl implements PrivacySegmentedSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacySegmentedSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacySegmentedSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacySegmentedSectionOperations.validatePrivacySegmentedSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacySegmentedSectionConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacySegmentedSectionOperations.validatePrivacySegmentedSectionConfidentialityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacySegmentedSectionConfidentialityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacySegmentedSectionOperations.validatePrivacySegmentedSectionConfidentialityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacySegmentedSectionAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacySegmentedSectionOperations.validatePrivacySegmentedSectionAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacySegmentedSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacySegmentedSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacySegmentedSectionImpl
