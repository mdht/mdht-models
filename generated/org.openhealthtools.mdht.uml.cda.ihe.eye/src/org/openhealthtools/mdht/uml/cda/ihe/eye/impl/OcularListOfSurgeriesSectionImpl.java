/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.operations.OcularListOfSurgeriesSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.SurgeriesSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocular List Of Surgeries Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OcularListOfSurgeriesSectionImpl extends SurgeriesSectionImpl implements OcularListOfSurgeriesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcularListOfSurgeriesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EyePackage.Literals.OCULAR_LIST_OF_SURGERIES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularListOfSurgeriesSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularListOfSurgeriesSectionOperations.validateOcularListOfSurgeriesSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularListOfSurgeriesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularListOfSurgeriesSectionOperations.validateOcularListOfSurgeriesSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularListOfSurgeriesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularListOfSurgeriesSectionOperations.validateOcularListOfSurgeriesSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSurgeriesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularListOfSurgeriesSectionOperations.validateSurgeriesSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcularListOfSurgeriesSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public OcularListOfSurgeriesSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //OcularListOfSurgeriesSectionImpl
