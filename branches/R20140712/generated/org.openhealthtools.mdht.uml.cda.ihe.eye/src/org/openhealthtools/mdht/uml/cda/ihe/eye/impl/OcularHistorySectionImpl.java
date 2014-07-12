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
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.operations.OcularHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.HistoryOfPastIllnessSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocular History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OcularHistorySectionImpl extends HistoryOfPastIllnessSectionImpl implements OcularHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcularHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EyePackage.Literals.OCULAR_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularHistorySectionOperations.validateOcularHistorySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularHistorySectionOcularListOfSurgeriesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularHistorySectionOperations.validateOcularHistorySectionOcularListOfSurgeriesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularHistorySectionOcularCodedListOfSurgeriesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularHistorySectionOperations.validateOcularHistorySectionOcularCodedListOfSurgeriesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcularListOfSurgeriesSection getOcularListOfSurgeriesSection() {
		return OcularHistorySectionOperations.getOcularListOfSurgeriesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcularCodedListOfSurgeriesSection getOcularCodedListOfSurgeriesSection() {
		return OcularHistorySectionOperations.getOcularCodedListOfSurgeriesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryOfPastIllnessSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularHistorySectionOperations.validateHistoryOfPastIllnessSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcularHistorySection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public OcularHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //OcularHistorySectionImpl
