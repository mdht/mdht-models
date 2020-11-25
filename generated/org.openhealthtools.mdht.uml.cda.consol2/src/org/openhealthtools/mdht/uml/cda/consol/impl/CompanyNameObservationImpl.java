/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.CompanyNameObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.CompanyNameObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company Name Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CompanyNameObservationImpl extends EObjectImpl implements CompanyNameObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyNameObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMPANY_NAME_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyNameObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CompanyNameObservationOperations.validateCompanyNameObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyNameObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CompanyNameObservationOperations.validateCompanyNameObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyNameObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CompanyNameObservationOperations.validateCompanyNameObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyNameObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CompanyNameObservationOperations.validateCompanyNameObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyNameObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompanyNameObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //CompanyNameObservationImpl
