/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;

import org.openhealthtools.mdht.uml.cda.consol.operations.EntryReferenceOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EntryReferenceImpl extends ActImpl implements EntryReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENTRY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceIINullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceIINullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceCDNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceCDNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryReferenceCDNullFlavorP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EntryReferenceOperations.validateEntryReferenceCDNullFlavorP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryReference init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryReference init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EntryReferenceImpl
