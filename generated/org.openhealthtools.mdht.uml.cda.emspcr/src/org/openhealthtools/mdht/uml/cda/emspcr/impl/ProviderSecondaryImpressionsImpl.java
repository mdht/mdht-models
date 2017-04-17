/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProviderSecondaryImpressionsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Secondary Impressions</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProviderSecondaryImpressionsImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ProviderSecondaryImpressions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderSecondaryImpressionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROVIDER_SECONDARY_IMPRESSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderSecondaryImpressionsTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderSecondaryImpressionsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderSecondaryImpressionsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderSecondaryImpressionsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderSecondaryImpressionsValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderSecondaryImpressionsValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderSecondaryImpressions init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProviderSecondaryImpressions init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ProviderSecondaryImpressionsImpl
