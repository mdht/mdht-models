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

import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.operations.OcularCodedListOfSurgeriesSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.CodedSurgeriesSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocular Coded List Of Surgeries Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OcularCodedListOfSurgeriesSectionImpl extends CodedSurgeriesSectionImpl implements OcularCodedListOfSurgeriesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcularCodedListOfSurgeriesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EyePackage.Literals.OCULAR_CODED_LIST_OF_SURGERIES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularCodedListOfSurgeriesSectionProcedureEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularCodedListOfSurgeriesSectionOperations.validateOcularCodedListOfSurgeriesSectionProcedureEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularCodedListOfSurgeriesSectionExternalReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularCodedListOfSurgeriesSectionOperations.validateOcularCodedListOfSurgeriesSectionExternalReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEntry getProcedureEntry() {
		return OcularCodedListOfSurgeriesSectionOperations.getProcedureEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference getEyeExternalReference() {
		return OcularCodedListOfSurgeriesSectionOperations.getEyeExternalReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCodedSurgeriesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularCodedListOfSurgeriesSectionOperations.validateCodedSurgeriesSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcularCodedListOfSurgeriesSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public OcularCodedListOfSurgeriesSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //OcularCodedListOfSurgeriesSectionImpl
