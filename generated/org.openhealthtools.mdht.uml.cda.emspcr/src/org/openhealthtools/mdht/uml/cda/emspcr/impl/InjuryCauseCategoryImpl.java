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
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.InjuryCauseCategoryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Injury Cause Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InjuryCauseCategoryImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements InjuryCauseCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjuryCauseCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.INJURY_CAUSE_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryCauseCategoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryCauseCategoryOperations.validateInjuryCauseCategoryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryCauseCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryCauseCategoryOperations.validateInjuryCauseCategoryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryCauseCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryCauseCategoryOperations.validateInjuryCauseCategoryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryCauseCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryCauseCategoryOperations.validateInjuryCauseCategoryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryCauseCategory init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InjuryCauseCategory init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // InjuryCauseCategoryImpl
