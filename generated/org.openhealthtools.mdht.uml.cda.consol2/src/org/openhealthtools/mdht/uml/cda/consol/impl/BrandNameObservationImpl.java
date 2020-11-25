/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.BrandNameObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.BrandNameObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brand Name Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BrandNameObservationImpl extends EObjectImpl implements BrandNameObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrandNameObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.BRAND_NAME_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrandNameObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BrandNameObservationOperations.validateBrandNameObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrandNameObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BrandNameObservationOperations.validateBrandNameObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrandNameObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BrandNameObservationOperations.validateBrandNameObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrandNameObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BrandNameObservationOperations.validateBrandNameObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrandNameObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BrandNameObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //BrandNameObservationImpl
