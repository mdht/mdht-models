/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.EntryImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry;
import org.hl7.cbcc.privacy.consentdirective.operations.ConsentDirectiveEntryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Directive Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConsentDirectiveEntryImpl extends EntryImpl implements ConsentDirectiveEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDirectiveEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveEntryOperations.validateConsentDirectiveEntryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveEntryAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveEntryOperations.validateConsentDirectiveEntryAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveEntryObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveEntryOperations.validateConsentDirectiveEntryObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveEntryObservationMedia(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsentDirectiveEntryOperations.validateConsentDirectiveEntryObservationMedia(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDirectiveEntry init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDirectiveEntry init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ConsentDirectiveEntryImpl
