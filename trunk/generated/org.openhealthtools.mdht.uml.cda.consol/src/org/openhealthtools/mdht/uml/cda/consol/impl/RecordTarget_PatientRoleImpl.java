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
import org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole;

import org.openhealthtools.mdht.uml.cda.consol.operations.RecordTarget_PatientRoleOperations;

import org.openhealthtools.mdht.uml.cda.impl.PatientRoleImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Target Patient Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RecordTarget_PatientRoleImpl extends PatientRoleImpl implements RecordTarget_PatientRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTarget_PatientRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RECORD_TARGET_PATIENT_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RecordTarget_PatientRoleOperations.validatePatientRoleAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RecordTarget_PatientRoleOperations.validatePatientRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRoleTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RecordTarget_PatientRoleOperations.validatePatientRoleTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRolePatient(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RecordTarget_PatientRoleOperations.validatePatientRolePatient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTarget_PatientRole init() {
    	CDAUtil.init(this);
    	return this;
	}
} // RecordTarget_PatientRoleImpl
