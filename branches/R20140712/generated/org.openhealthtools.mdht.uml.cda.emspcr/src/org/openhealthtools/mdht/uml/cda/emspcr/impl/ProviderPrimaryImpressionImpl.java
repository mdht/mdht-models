/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProviderPrimaryImpressionOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Primary Impression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProviderPrimaryImpressionImpl extends ObservationImpl implements ProviderPrimaryImpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderPrimaryImpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROVIDER_PRIMARY_IMPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderPrimaryImpressionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderPrimaryImpressionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderPrimaryImpressionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderPrimaryImpressionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderPrimaryImpressionValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderPrimaryImpressionValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPrimaryImpression init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPrimaryImpression init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProviderPrimaryImpressionImpl
