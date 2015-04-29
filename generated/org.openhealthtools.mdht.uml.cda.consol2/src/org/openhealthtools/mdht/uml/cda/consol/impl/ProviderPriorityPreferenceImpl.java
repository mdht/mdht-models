/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProviderPriorityPreferenceOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Priority Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProviderPriorityPreferenceImpl extends ObservationImpl implements ProviderPriorityPreference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderPriorityPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferencePriorityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferencePriorityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferencePriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferencePriorityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProviderPriorityPreferenceAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceAuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProviderPriorityPreference init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProviderPriorityPreference init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProviderPriorityPreferenceImpl
