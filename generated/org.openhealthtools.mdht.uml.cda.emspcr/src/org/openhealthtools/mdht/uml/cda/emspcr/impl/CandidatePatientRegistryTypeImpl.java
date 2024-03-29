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
import org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CandidatePatientRegistryTypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidate Patient Registry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CandidatePatientRegistryTypeImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements CandidatePatientRegistryType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidatePatientRegistryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CANDIDATE_PATIENT_REGISTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidatePatientRegistryTypeTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidatePatientRegistryTypeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidatePatientRegistryTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidatePatientRegistryTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidatePatientRegistryTypeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidatePatientRegistryTypeValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidatePatientRegistryType init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CandidatePatientRegistryType init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // CandidatePatientRegistryTypeImpl
