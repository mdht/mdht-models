/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.EntryImpl;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry;
import org.hl7.security.ds4p.contentprofile.operations.PrivacyMarkingsEntryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Markings Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyMarkingsEntryImpl extends EntryImpl implements PrivacyMarkingsEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyMarkingsEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyMarkingsEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyMarkingsEntryOperations.validatePrivacyMarkingsEntryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyMarkingsEntryOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyMarkingsEntryOperations.validatePrivacyMarkingsEntryOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyMarkingsEntry init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyMarkingsEntry init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacyMarkingsEntryImpl
