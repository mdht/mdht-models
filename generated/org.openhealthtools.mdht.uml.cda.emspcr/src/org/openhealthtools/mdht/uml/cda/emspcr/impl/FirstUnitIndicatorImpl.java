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
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.FirstUnitIndicatorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Unit Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FirstUnitIndicatorImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements FirstUnitIndicator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstUnitIndicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.FIRST_UNIT_INDICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstUnitIndicatorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitIndicatorOperations.validateFirstUnitIndicatorTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstUnitIndicatorMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitIndicatorOperations.validateFirstUnitIndicatorMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstUnitIndicatorCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitIndicatorOperations.validateFirstUnitIndicatorCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstUnitIndicatorCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitIndicatorOperations.validateFirstUnitIndicatorCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstUnitIndicatorValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitIndicatorOperations.validateFirstUnitIndicatorValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstUnitIndicator init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FirstUnitIndicator init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // FirstUnitIndicatorImpl
