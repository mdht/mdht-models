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

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection;

import org.hl7.security.ds4p.contentprofile.operations.PrivacySegmentedDocumentOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Segmented Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacySegmentedDocumentImpl extends GeneralHeaderConstraintsImpl implements PrivacySegmentedDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacySegmentedDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.PRIVACY_SEGMENTED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacySegmentedDocumentTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacySegmentedDocumentOperations.validatePrivacySegmentedDocumentTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacySegmentedDocumentAuthor1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacySegmentedDocumentOperations.validatePrivacySegmentedDocumentAuthor1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacySegmentedDocumentSegmentedSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacySegmentedDocumentOperations.validatePrivacySegmentedDocumentSegmentedSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacySegmentedDocumentOperations.validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivacySegmentedSection> getSegmentedSections() {
		return PrivacySegmentedDocumentOperations.getSegmentedSections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivacyMarkingsSection> getPrivacyAndSecurityMarkingsSections() {
		return PrivacySegmentedDocumentOperations.getPrivacyAndSecurityMarkingsSections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacySegmentedDocument init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacySegmentedDocument init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacySegmentedDocumentImpl
