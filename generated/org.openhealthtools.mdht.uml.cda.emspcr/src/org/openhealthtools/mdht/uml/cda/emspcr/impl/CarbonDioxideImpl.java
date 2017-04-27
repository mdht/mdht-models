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
import org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CarbonDioxideOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carbon Dioxide</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CarbonDioxideImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements CarbonDioxide {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarbonDioxideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CARBON_DIOXIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarbonDioxideTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarbonDioxideOperations.validateCarbonDioxideTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarbonDioxideMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarbonDioxideOperations.validateCarbonDioxideMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarbonDioxideCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarbonDioxideOperations.validateCarbonDioxideCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarbonDioxideCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarbonDioxideOperations.validateCarbonDioxideCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarbonDioxideEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarbonDioxideOperations.validateCarbonDioxideEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarbonDioxideValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarbonDioxideOperations.validateCarbonDioxideValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarbonDioxide init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CarbonDioxide init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // CarbonDioxideImpl
