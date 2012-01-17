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
import org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole2;

import org.openhealthtools.mdht.uml.cda.consol.operations.RecordTarget_PatientRole2Operations;

import org.openhealthtools.mdht.uml.cda.impl.PatientRoleImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Target Patient Role2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RecordTarget_PatientRole2Impl extends PatientRoleImpl implements RecordTarget_PatientRole2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTarget_PatientRole2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RECORD_TARGET_PATIENT_ROLE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRole2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RecordTarget_PatientRole2Operations.validatePatientRole2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTarget_PatientRole2 init() {
		CDAUtil.init(this);
		return this;
	}
} // RecordTarget_PatientRole2Impl
