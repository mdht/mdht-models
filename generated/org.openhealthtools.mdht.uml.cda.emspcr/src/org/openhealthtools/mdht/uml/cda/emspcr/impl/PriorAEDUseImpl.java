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
import org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PriorAEDUseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prior AED Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PriorAEDUseImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PriorAEDUse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorAEDUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PRIOR_AED_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorAEDUsePriorAEDProviderParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorAEDUseOperations.validatePriorAEDUsePriorAEDProviderParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorAEDUseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorAEDUseOperations.validatePriorAEDUseTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorAEDUseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorAEDUseOperations.validatePriorAEDUseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorAEDUseCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorAEDUseOperations.validatePriorAEDUseCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorAEDUseValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorAEDUseOperations.validatePriorAEDUseValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAEDUse init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PriorAEDUse init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PriorAEDUseImpl
