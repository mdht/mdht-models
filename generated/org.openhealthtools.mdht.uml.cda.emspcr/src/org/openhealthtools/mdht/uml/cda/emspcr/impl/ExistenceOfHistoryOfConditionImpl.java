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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfHistoryOfConditionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of History Of Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExistenceOfHistoryOfConditionImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ExistenceOfHistoryOfCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfHistoryOfConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOperations.validateExistenceOfHistoryOfConditionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOperations.validateExistenceOfHistoryOfConditionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOperations.validateExistenceOfHistoryOfConditionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOperations.validateExistenceOfHistoryOfConditionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfHistoryOfCondition init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExistenceOfHistoryOfCondition init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ExistenceOfHistoryOfConditionImpl
