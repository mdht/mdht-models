/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization;

import org.openhealthtools.mdht.uml.cda.consol.operations.PatientRole_ProviderOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Role Provider Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientRole_ProviderOrganizationImpl extends OrganizationImpl implements PatientRole_ProviderOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientRole_ProviderOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PATIENT_ROLE_PROVIDER_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderOrganizationHasNationalProviderIdentifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationHasNationalProviderIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderOrganizationAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderOrganizationTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRole_ProviderOrganization init() {
    	CDAUtil.init(this);
    	return this;
	}
} // PatientRole_ProviderOrganizationImpl
