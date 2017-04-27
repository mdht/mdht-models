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
import org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PriorCPROperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prior CPR</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PriorCPRImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PriorCPR {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorCPRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PRIOR_CPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorCPRProviderParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorCPROperations.validatePriorCPRProviderParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorCPRTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorCPROperations.validatePriorCPRTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorCPRMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorCPROperations.validatePriorCPRMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorCPRCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorCPROperations.validatePriorCPRCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorCPRValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorCPROperations.validatePriorCPRValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorCPR init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PriorCPR init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PriorCPRImpl
