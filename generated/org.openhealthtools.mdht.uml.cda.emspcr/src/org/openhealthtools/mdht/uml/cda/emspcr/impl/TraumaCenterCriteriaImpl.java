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
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.TraumaCenterCriteriaOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trauma Center Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TraumaCenterCriteriaImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements TraumaCenterCriteria {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraumaCenterCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.TRAUMA_CENTER_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaCenterCriteriaTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TraumaCenterCriteriaOperations.validateTraumaCenterCriteriaTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaCenterCriteriaMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TraumaCenterCriteriaOperations.validateTraumaCenterCriteriaMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaCenterCriteriaCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TraumaCenterCriteriaOperations.validateTraumaCenterCriteriaCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraumaCenterCriteriaValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TraumaCenterCriteriaOperations.validateTraumaCenterCriteriaValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraumaCenterCriteria init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TraumaCenterCriteria init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // TraumaCenterCriteriaImpl
