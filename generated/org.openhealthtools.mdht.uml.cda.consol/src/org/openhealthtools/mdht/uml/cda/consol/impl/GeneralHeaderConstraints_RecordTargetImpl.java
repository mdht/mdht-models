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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_RecordTarget;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_RecordTargetOperations;

import org.openhealthtools.mdht.uml.cda.impl.RecordTargetImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Header Constraints Record Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraints_RecordTargetImpl extends RecordTargetImpl implements
		GeneralHeaderConstraints_RecordTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraints_RecordTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordTargetPatientRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraints_RecordTargetOperations.validateRecordTargetPatientRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_RecordTarget init() {
		CDAUtil.init(this);
		return this;
	}
} // GeneralHeaderConstraints_RecordTargetImpl
